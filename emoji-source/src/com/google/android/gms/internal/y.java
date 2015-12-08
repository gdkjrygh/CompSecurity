// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            et, eu, ai, u

public final class y
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


    private final a lf;
    private final Runnable lg;
    private ai lh;
    private boolean li;
    private boolean lj;
    private long lk;

    public y(u u)
    {
        this(u, new a(et.sv));
    }

    y(u u, a a1)
    {
        li = false;
        lj = false;
        lk = 0L;
        lf = a1;
        lg = new Runnable(u) {

            private final WeakReference ll;
            final u lm;
            final y ln;

            public void run()
            {
                y.a(ln, false);
                u u1 = (u)ll.get();
                if (u1 != null)
                {
                    u1.b(y.a(ln));
                }
            }

            
            {
                ln = y.this;
                lm = u1;
                super();
                ll = new WeakReference(lm);
            }
        };
    }

    static ai a(y y1)
    {
        return y1.lh;
    }

    static boolean a(y y1, boolean flag)
    {
        y1.li = flag;
        return flag;
    }

    public void a(ai ai, long l)
    {
        if (li)
        {
            eu.D("An ad refresh is already scheduled.");
        } else
        {
            lh = ai;
            li = true;
            lk = l;
            if (!lj)
            {
                eu.B((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                lf.postDelayed(lg, l);
                return;
            }
        }
    }

    public void cancel()
    {
        li = false;
        lf.removeCallbacks(lg);
    }

    public void d(ai ai)
    {
        a(ai, 60000L);
    }

    public void pause()
    {
        lj = true;
        if (li)
        {
            lf.removeCallbacks(lg);
        }
    }

    public void resume()
    {
        lj = false;
        if (li)
        {
            li = false;
            a(lh, lk);
        }
    }
}
