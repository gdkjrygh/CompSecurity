// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.libraries.bind.async:
//            JankLock, AsyncUtil

final class this._cls0
    implements Runnable
{

    final JankLock this$0;

    public final void run()
    {
        JankLock janklock;
        janklock = JankLock.this;
        if (JankLock.DISABLED)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        AsyncUtil.checkMainThread();
        janklock.pauseLock.lock();
        janklock.isPaused = false;
        janklock.unpaused.signalAll();
        janklock.pauseLock.unlock();
        return;
        Exception exception;
        exception;
        janklock.pauseLock.unlock();
        throw exception;
    }

    ()
    {
        this$0 = JankLock.this;
        super();
    }
}
