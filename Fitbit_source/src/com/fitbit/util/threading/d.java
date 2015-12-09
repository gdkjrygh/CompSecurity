// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.fitbit.util.threading:
//            FitbitHandlerThread

public class d
{

    private final Handler a;
    private final FitbitHandlerThread.ThreadName b;

    public d(FitbitHandlerThread.ThreadName threadname)
    {
        a = FitbitHandlerThread.b(threadname);
        b = threadname;
    }

    static Handler a(d d1)
    {
        return d1.a;
    }

    static FitbitHandlerThread.ThreadName b(d d1)
    {
        return d1.b;
    }

    public final void a()
    {
        a.removeCallbacksAndMessages(null);
    }

    public final void a(Runnable runnable, long l)
    {
        a();
        a.postDelayed(new Runnable(runnable) {

            final Runnable a;
            final d b;

            public void run()
            {
                if (Looper.getMainLooper() == d.a(b).getLooper())
                {
                    FitbitHandlerThread.a(d.b(b), a);
                    return;
                } else
                {
                    a.run();
                    return;
                }
            }

            
            {
                b = d.this;
                a = runnable;
                super();
            }
        }, l);
    }
}
