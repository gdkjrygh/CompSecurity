// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            dv, dw, ah, v

public final class x
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


    private final a kV;
    private final Runnable kW;
    private ah kX;
    private boolean kY;
    private boolean kZ;
    private long la;

    public x(v v)
    {
        this(v, new a(dv.rp));
    }

    x(v v, a a1)
    {
        kY = false;
        kZ = false;
        la = 0L;
        kV = a1;
        kW = new Runnable(v) {

            private final WeakReference lb;
            final v lc;
            final x ld;

            public void run()
            {
                x.a(ld, false);
                v v1 = (v)lb.get();
                if (v1 != null)
                {
                    v1.b(x.a(ld));
                }
            }

            
            {
                ld = x.this;
                lc = v1;
                super();
                lb = new WeakReference(lc);
            }
        };
    }

    static ah a(x x1)
    {
        return x1.kX;
    }

    static boolean a(x x1, boolean flag)
    {
        x1.kY = flag;
        return flag;
    }

    public void a(ah ah, long l)
    {
        if (kY)
        {
            dw.z("An ad refresh is already scheduled.");
        } else
        {
            kX = ah;
            kY = true;
            la = l;
            if (!kZ)
            {
                dw.x((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                kV.postDelayed(kW, l);
                return;
            }
        }
    }

    public void cancel()
    {
        kY = false;
        kV.removeCallbacks(kW);
    }

    public void d(ah ah)
    {
        a(ah, 60000L);
    }

    public void pause()
    {
        kZ = true;
        if (kY)
        {
            kV.removeCallbacks(kW);
        }
    }

    public void resume()
    {
        kZ = false;
        if (kY)
        {
            kY = false;
            a(kX, la);
        }
    }
}
