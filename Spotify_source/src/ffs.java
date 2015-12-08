// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public final class ffs
    implements ffr
{

    private final Runnable a = new Runnable() {

        private ffs a;

        public final void run()
        {
            a.a();
        }

            
            {
                a = ffs.this;
                super();
            }
    };
    private boolean b;
    private boolean c;
    private Object d;
    private long e;
    private final Handler f;
    private fft g;

    public ffs(Handler handler, fft fft1)
    {
        g = (fft)ctz.a(fft1);
        f = (Handler)ctz.a(handler);
        boolean flag;
        if (500L >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "inter-request waiting time should be >=0");
    }

    private Object b(Object obj)
    {
        Object obj1 = d;
        d = obj;
        return obj1;
    }

    private void d()
    {
        if (b)
        {
            b = false;
            f.removeCallbacks(a);
        }
    }

    private void e()
    {
        Looper looper = f.getLooper();
        Looper looper1 = Looper.myLooper();
        if (looper != looper1)
        {
            throw new IllegalThreadStateException((new StringBuilder("Throttler is using ")).append(looper).append(", but illegal usage attempt came from ").append(looper1).toString());
        } else
        {
            return;
        }
    }

    public final boolean a()
    {
        e();
        if (c || d == null)
        {
            return false;
        } else
        {
            e = SystemClock.uptimeMillis() + 500L;
            g.a(b(null));
            d();
            return true;
        }
    }

    public final boolean a(Object obj)
    {
        e();
        ctz.a(obj);
        if (!c)
        {
            b(obj);
            if (SystemClock.uptimeMillis() >= e)
            {
                a();
                return true;
            }
            if (!b)
            {
                b = true;
                f.postDelayed(a, e - SystemClock.uptimeMillis());
                return false;
            }
        }
        return false;
    }

    public final void b()
    {
        e();
        e = SystemClock.uptimeMillis();
        d = null;
        d();
    }

    public final void c()
    {
        b();
        c = true;
    }
}
