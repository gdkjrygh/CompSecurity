// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.amazonaws.util:
//            w, x

public class v
{

    static final int a = -1;
    private final Long b;
    private final long c;
    private Long d;

    protected v(Long long1, long l1, Long long2)
    {
        b = long1;
        c = l1;
        d = long2;
    }

    public static v a()
    {
        return new v(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static v a(long l1)
    {
        return new w(null, l1, null);
    }

    public static v a(long l1, long l2)
    {
        return new w(null, l1, Long.valueOf(l2));
    }

    public static v a(long l1, long l2, long l3)
    {
        return new w(Long.valueOf(l1), l2, Long.valueOf(l3));
    }

    public static v a(long l1, long l2, Long long1)
    {
        return new x(Long.valueOf(l1), l2, long1);
    }

    public static v a(long l1, Long long1)
    {
        return new x(null, l1, long1);
    }

    public static double b(long l1, long l2)
    {
        return (double)TimeUnit.NANOSECONDS.toMicros(l2 - l1) / 1000D;
    }

    public static v b()
    {
        return new w(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public v a(String s1)
    {
        return null;
    }

    public v a(String s1, int i1)
    {
        return null;
    }

    public void a(String s1, long l1)
    {
    }

    public void a(String s1, v v1)
    {
    }

    public v b(String s1)
    {
        return null;
    }

    public void b(long l1)
    {
        d = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(l1));
    }

    public final long c()
    {
        if (p())
        {
            return b.longValue();
        } else
        {
            return TimeUnit.NANOSECONDS.toMillis(c);
        }
    }

    public List c(String s1)
    {
        return null;
    }

    public void c(long l1)
    {
        d = Long.valueOf(l1);
    }

    public final long d()
    {
        Long long1 = e();
        if (long1 == null)
        {
            return -1L;
        } else
        {
            return long1.longValue();
        }
    }

    public Number d(String s1)
    {
        return null;
    }

    public final Long e()
    {
        return b;
    }

    public void e(String s1)
    {
    }

    public final long f()
    {
        return c;
    }

    public final long g()
    {
        return h();
    }

    public final long h()
    {
        Long long1 = i();
        if (long1 == null)
        {
            return -1L;
        } else
        {
            return long1.longValue();
        }
    }

    public final Long i()
    {
        if (p() && o())
        {
            return Long.valueOf(b.longValue() + TimeUnit.NANOSECONDS.toMillis(d.longValue() - c));
        } else
        {
            return null;
        }
    }

    public final long j()
    {
        if (d == null)
        {
            return -1L;
        } else
        {
            return d.longValue();
        }
    }

    public final Long k()
    {
        return d;
    }

    public final double l()
    {
        Double double1 = m();
        if (double1 == null)
        {
            return -1D;
        } else
        {
            return double1.doubleValue();
        }
    }

    public final Double m()
    {
        if (o())
        {
            return Double.valueOf(b(c, d.longValue()));
        } else
        {
            return null;
        }
    }

    public final long n()
    {
        Double double1 = m();
        if (double1 == null)
        {
            return -1L;
        } else
        {
            return double1.longValue();
        }
    }

    public final boolean o()
    {
        return d != null;
    }

    public final boolean p()
    {
        return b != null;
    }

    public v q()
    {
        d = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map r()
    {
        return Collections.emptyMap();
    }

    public Map s()
    {
        return Collections.emptyMap();
    }

    public final String toString()
    {
        return String.valueOf(l());
    }
}
