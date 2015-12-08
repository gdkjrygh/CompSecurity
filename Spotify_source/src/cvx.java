// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class cvx
    implements hfg, Runnable
{

    private static final Handler a = new Handler(Looper.getMainLooper());
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(cvx, "b");
    private volatile int b;

    public cvx()
    {
    }

    public abstract void a();

    public final boolean isUnsubscribed()
    {
        return b != 0;
    }

    public final void run()
    {
        a();
    }

    public final void unsubscribe()
    {
label0:
        {
            if (c.compareAndSet(this, 0, 1))
            {
                if (Looper.getMainLooper() != Looper.myLooper())
                {
                    break label0;
                }
                a();
            }
            return;
        }
        a.post(this);
    }

}
