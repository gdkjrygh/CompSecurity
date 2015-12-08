// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.util.Map;

// Referenced classes of package com.skype:
//            LibraryLoaderHelper

final class this._cls0
    implements Runnable
{

    final LibraryLoaderHelper this$0;

    public final void run()
    {
        if (LibraryLoaderHelper.access$200(LibraryLoaderHelper.this, LibraryLoaderHelper.access$100(LibraryLoaderHelper.this), LibraryLoaderHelper.access$000(LibraryLoaderHelper.this))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[] = LibraryLoaderHelper.access$000(LibraryLoaderHelper.this);
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            String s = as[i];
            if (!tryLoadLibrary(LibraryLoaderHelper.access$100(LibraryLoaderHelper.this), s))
            {
                break;
            }
            loadedLibraries.put(s, Boolean.valueOf(true));
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        synchronized (LibraryLoaderHelper.this)
        {
            notifyAll();
        }
        return;
        exception;
        libraryloaderhelper;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = LibraryLoaderHelper.this;
        super();
    }
}
