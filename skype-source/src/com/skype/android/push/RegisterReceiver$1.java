// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            RegisterReceiver, PushManager, PushRetryScheduler

final class this._cls0
    implements Runnable
{

    final RegisterReceiver this$0;

    public final void run()
    {
        if (pushManager.isAnyServiceSupported())
        {
            pushManager.register();
            PushRetryScheduler.setBackOff(PushRetryScheduler.INITIAL_RETRY_TIME);
        }
        RegisterReceiver.access$100(RegisterReceiver.this).set(false);
        RegisterReceiver.access$200(RegisterReceiver.this).release();
        return;
        Object obj;
        obj;
        RegisterReceiver.access$000().log(Level.INFO, "Can't register to push", ((Throwable) (obj)));
        RegisterReceiver.access$100(RegisterReceiver.this).set(false);
        RegisterReceiver.access$200(RegisterReceiver.this).release();
        return;
        obj;
        RegisterReceiver.access$100(RegisterReceiver.this).set(false);
        RegisterReceiver.access$200(RegisterReceiver.this).release();
        throw obj;
    }

    ()
    {
        this$0 = RegisterReceiver.this;
        super();
    }
}
