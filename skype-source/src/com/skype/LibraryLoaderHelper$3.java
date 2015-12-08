// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.content.Context;

// Referenced classes of package com.skype:
//            LibraryLoaderHelper

final class val.context extends Thread
{

    final LibraryLoaderHelper this$0;
    final Context val$context;

    public final void run()
    {
        deleteWorkaroundLibrariesSynchronously(val$context);
    }

    ()
    {
        this$0 = final_libraryloaderhelper;
        val$context = Context.this;
        super();
    }
}
