// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

// Referenced classes of package com.skype:
//            b, NativeWeakRef

final class ng extends Thread
{

    final b this$0;

    public final void run()
    {
        do
        {
            try
            {
                NativeWeakRef nativeweakref = (NativeWeakRef)b.access$000(b.this).remove();
                b.access$100(b.this).remove(nativeweakref);
                nativeweakref.destroyNativeObject();
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        } while (true);
    }

    ng(String s)
    {
        this$0 = b.this;
        super(s);
    }
}
