// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            eu, ev, aj, v

public final class z
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


    private final a ld;
    private final Runnable le;
    private aj lf;
    private boolean lg;
    private boolean lh;
    private long li;

    public z(v v)
    {
        this(v, new a(eu.ss));
    }

    z(v v, a a1)
    {
        lg = false;
        lh = false;
        li = 0L;
        ld = a1;
        le = new Runnable(v) {

            private final WeakReference lj;
            final v lk;
            final z ll;

            public void run()
            {
                z.a(ll, false);
                v v1 = (v)lj.get();
                if (v1 != null)
                {
                    v1.b(z.a(ll));
                }
            }

            
            {
                ll = z.this;
                lk = v1;
                super();
                lj = new WeakReference(lk);
            }
        };
    }

    static aj a(z z1)
    {
        return z1.lf;
    }

    static boolean a(z z1, boolean flag)
    {
        z1.lg = flag;
        return flag;
    }

    public void a(aj aj, long l)
    {
        if (lg)
        {
            ev.D("An ad refresh is already scheduled.");
        } else
        {
            lf = aj;
            lg = true;
            li = l;
            if (!lh)
            {
                ev.B((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                ld.postDelayed(le, l);
                return;
            }
        }
    }

    public void cancel()
    {
        lg = false;
        ld.removeCallbacks(le);
    }

    public void d(aj aj)
    {
        a(aj, 60000L);
    }

    public void pause()
    {
        lh = true;
        if (lg)
        {
            ld.removeCallbacks(le);
        }
    }

    public void resume()
    {
        lh = false;
        if (lg)
        {
            lg = false;
            a(lf, li);
        }
    }
}
