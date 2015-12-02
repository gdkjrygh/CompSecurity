// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.os.Handler;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.ui.images.b:
//            h, m, r, z, 
//            u, x, y, c

public class w
{

    static final int a[] = {
        2500, 5000, 30000
    };
    private static final Class b = com/facebook/ui/images/b/w;
    private static final int c[] = {
        0, 2500, 10000
    };
    private final a d;
    private final Handler e;
    private final h f;
    private final Executor g;
    private final m h;
    private int i;
    private boolean j;
    private long k;
    private long l;
    private ab m;
    private boolean n;
    private Runnable o;
    private s p;

    w(a a1, Handler handler, h h1, Executor executor, m m1)
    {
        i = 0;
        d = (a)Preconditions.checkNotNull(a1);
        e = (Handler)Preconditions.checkNotNull(handler);
        f = (h)Preconditions.checkNotNull(h1);
        g = (Executor)Preconditions.checkNotNull(executor);
        h = (m)Preconditions.checkNotNull(m1);
    }

    public w(a a1, h h1, c c1, m m1)
    {
        this(a1, new Handler(), h1, ((Executor) (c1)), m1);
    }

    static Runnable a(w w1, Runnable runnable)
    {
        w1.o = runnable;
        return runnable;
    }

    private static String a(r r1, Throwable throwable)
    {
        if (throwable != null)
        {
            return throwable.toString();
        }
        boolean flag;
        if (r1.a() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        switch (com.facebook.ui.images.b.z.a[r1.c().ordinal()])
        {
        default:
            return "unknown";

        case 1: // '\001'
            return "download not found";

        case 2: // '\002'
            return "download I/O error";

        case 3: // '\003'
            return "prev failure, retry blocked";
        }
    }

    private void a(long l1)
    {
        n = true;
        if (l1 > 0L)
        {
            o = new x(this);
            e.postDelayed(o, l1);
            return;
        } else
        {
            d();
            return;
        }
    }

    static void a(w w1)
    {
        w1.d();
    }

    static boolean a(w w1, r r1, Throwable throwable)
    {
        return w1.b(r1, throwable);
    }

    static void b(w w1)
    {
        w1.e();
    }

    private boolean b(r r1, Throwable throwable)
    {
        while (r1 != null && r1.a() != null || (throwable instanceof CancellationException)) 
        {
            return false;
        }
        r1 = a(r1, throwable);
        if (!j)
        {
            com.facebook.debug.log.b.c(b, "Failed to fetch url: %s; failure reason: %s; total elapsed time: %d ms", new Object[] {
                h.a(), r1, Long.valueOf(f())
            });
            return false;
        }
        if (i >= 3)
        {
            com.facebook.debug.log.b.c(b, "Failed to fetch url after %d attempts: %s; final failure: %s; total elapsed time: %d ms", new Object[] {
                Integer.valueOf(i + 1), h.a(), r1, Long.valueOf(f())
            });
            return false;
        } else
        {
            long l1 = h();
            com.facebook.debug.log.b.c(b, "Got error: %s; delaying %d ms before trying again to download url: %s", new Object[] {
                r1, Long.valueOf(l1), h.a()
            });
            i = i + 1;
            a(l1);
            return true;
        }
    }

    static ab c(w w1)
    {
        return w1.m;
    }

    private void d()
    {
        l = d.a();
        boolean flag;
        if (p == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Active future must be null before submitting for another");
        p = f.b(h);
        com.google.common.d.a.i.a(p, new y(this), g);
    }

    private void e()
    {
        p = null;
        n = false;
    }

    private long f()
    {
        return d.a() - k;
    }

    private long g()
    {
        return d.a() - l;
    }

    private long h()
    {
        int i1 = c[i];
        int j1 = a[i];
        long l1 = g();
        if (l1 < (long)j1)
        {
            return (long)j1 - l1;
        } else
        {
            return (long)i1;
        }
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean a()
    {
        return j;
    }

    public s b()
    {
        if (a() && !h.h())
        {
            com.facebook.debug.log.b.d(b, (new StringBuilder()).append("Potentially inefficient usage of UrlImage#setShouldRetry detected while fetching: ").append(h.a()).toString());
        }
        m = ab.a();
        k = d.a();
        a(0L);
        return m;
    }

    public void c()
    {
        if (n)
        {
            boolean flag;
            if (o == null || p == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "mActiveRequest was not set to false correctly (or some other programmer error?)");
            if (o != null)
            {
                e.removeCallbacks(o);
                o = null;
            }
            if (p != null)
            {
                p.cancel(false);
                p = null;
            }
            n = false;
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (c.length == a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (c.length == 3)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
