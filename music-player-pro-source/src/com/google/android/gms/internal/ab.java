// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            gq, gr, av, u

public class ab
{
    public static class a
    {

        private final Handler mHandler;

        public boolean postDelayed(Runnable runnable, long l)
        {
            return mHandler.postDelayed(runnable, l);
        }

        public void removeCallbacks(Runnable runnable)
        {
            mHandler.removeCallbacks(runnable);
        }

        public a(Handler handler)
        {
            mHandler = handler;
        }
    }


    private final a mu;
    private final Runnable mv;
    private av mw;
    private boolean mx;
    private boolean my;
    private long mz;

    public ab(u u)
    {
        this(u, new a(gq.wR));
    }

    ab(u u, a a1)
    {
        mx = false;
        my = false;
        mz = 0L;
        mu = a1;
        mv = new Runnable(u) {

            private final WeakReference mA;
            final u mB;
            final ab mC;

            public void run()
            {
                ab.a(mC, false);
                u u1 = (u)mA.get();
                if (u1 != null)
                {
                    u1.b(ab.a(mC));
                }
            }

            
            {
                mC = ab.this;
                mB = u1;
                super();
                mA = new WeakReference(mB);
            }
        };
    }

    static av a(ab ab1)
    {
        return ab1.mw;
    }

    static boolean a(ab ab1, boolean flag)
    {
        ab1.mx = flag;
        return flag;
    }

    public void a(av av, long l)
    {
        if (mx)
        {
            gr.W("An ad refresh is already scheduled.");
        } else
        {
            mw = av;
            mx = true;
            mz = l;
            if (!my)
            {
                gr.U((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                mu.postDelayed(mv, l);
                return;
            }
        }
    }

    public boolean aD()
    {
        return mx;
    }

    public void c(av av)
    {
        a(av, 60000L);
    }

    public void cancel()
    {
        mx = false;
        mu.removeCallbacks(mv);
    }

    public void pause()
    {
        my = true;
        if (mx)
        {
            mu.removeCallbacks(mv);
        }
    }

    public void resume()
    {
        my = false;
        if (mx)
        {
            mx = false;
            a(mw, mz);
        }
    }
}
