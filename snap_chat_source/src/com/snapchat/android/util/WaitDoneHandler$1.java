// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            WaitDoneHandler

final class val.waitDoneLock
    implements Runnable
{

    final WaitDoneHandler this$0;
    final Object val$waitDoneLock;

    public final void run()
    {
        synchronized (val$waitDoneLock)
        {
            val$waitDoneLock.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = final_waitdonehandler;
        val$waitDoneLock = Object.this;
        super();
    }
}
