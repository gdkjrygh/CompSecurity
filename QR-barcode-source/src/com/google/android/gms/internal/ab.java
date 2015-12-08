// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            gr, gs, av, u

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


    private final a mj;
    private final Runnable mk;
    private av ml;
    private boolean mm;
    private boolean mn;
    private long mo;

    public ab(u u)
    {
        this(u, new a(gr.wC));
    }

    ab(u u, a a1)
    {
        mm = false;
        mn = false;
        mo = 0L;
        mj = a1;
        mk = new Runnable(u) {

            private final WeakReference mp;
            final u mq;
            final ab mr;

            public void run()
            {
                ab.a(mr, false);
                u u1 = (u)mp.get();
                if (u1 != null)
                {
                    u1.b(ab.a(mr));
                }
            }

            
            {
                mr = ab.this;
                mq = u1;
                super();
                mp = new WeakReference(mq);
            }
        };
    }

    static av a(ab ab1)
    {
        return ab1.ml;
    }

    static boolean a(ab ab1, boolean flag)
    {
        ab1.mm = flag;
        return flag;
    }

    public void a(av av, long l)
    {
        if (mm)
        {
            gs.W("An ad refresh is already scheduled.");
        } else
        {
            ml = av;
            mm = true;
            mo = l;
            if (!mn)
            {
                gs.U((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                mj.postDelayed(mk, l);
                return;
            }
        }
    }

    public boolean ay()
    {
        return mm;
    }

    public void c(av av)
    {
        a(av, 60000L);
    }

    public void cancel()
    {
        mm = false;
        mj.removeCallbacks(mk);
    }

    public void pause()
    {
        mn = true;
        if (mm)
        {
            mj.removeCallbacks(mk);
        }
    }

    public void resume()
    {
        mn = false;
        if (mm)
        {
            mm = false;
            a(ml, mo);
        }
    }
}
