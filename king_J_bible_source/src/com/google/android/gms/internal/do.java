// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dp

public abstract class do
{

    private final Runnable kW = new Runnable() {

        final do qZ;

        public final void run()
        {
            do.a(qZ, Thread.currentThread());
            qZ.aY();
        }

            
            {
                qZ = do.this;
                super();
            }
    };
    private volatile Thread qY;

    public do()
    {
    }

    static Thread a(do do1, Thread thread)
    {
        do1.qY = thread;
        return thread;
    }

    public abstract void aY();

    public final void cancel()
    {
        onStop();
        if (qY != null)
        {
            qY.interrupt();
        }
    }

    public abstract void onStop();

    public final void start()
    {
        dp.execute(kW);
    }
}
