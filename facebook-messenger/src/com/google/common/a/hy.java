// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.a:
//            ea, ct, bf, ia, 
//            ic, bj, ib

public final class hy extends ea
{

    boolean b;
    int c;
    int d;
    int e;
    ct f;
    ct g;
    long h;
    long i;
    ic j;
    Equivalence k;
    Equivalence l;
    Ticker m;

    public hy()
    {
        c = -1;
        d = -1;
        e = -1;
        h = -1L;
        i = -1L;
    }

    private void d(long l1, TimeUnit timeunit)
    {
        boolean flag;
        if (h == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(h)
        });
        if (i == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(i)
        });
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l1), timeunit
        });
    }

    private boolean o()
    {
        return j == null;
    }

    public hy a(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (c == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "initial capacity was already set to %s", new Object[] {
            Integer.valueOf(c)
        });
        if (i1 >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = i1;
        return this;
    }

    public hy a(long l1, TimeUnit timeunit)
    {
        return b(l1, timeunit);
    }

    hy a(ct ct1)
    {
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Key strength was already set to %s", new Object[] {
            f
        });
        f = (ct)Preconditions.checkNotNull(ct1);
        if (ct1 != ct.STRONG)
        {
            b = true;
        }
        return this;
    }

    public ConcurrentMap a(Function function)
    {
        if (o())
        {
            function = new bf(this, function);
        } else
        {
            function = new ia(this, function);
        }
        return (ConcurrentMap)function;
    }

    public hy b(int i1)
    {
        boolean flag1 = false;
        boolean flag;
        if (e == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Integer.valueOf(e)
        });
        flag = flag1;
        if (i1 >= 0)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "maximum size must not be negative");
        e = i1;
        b = true;
        if (e == 0)
        {
            j = ic.SIZE;
        }
        return this;
    }

    public hy b(long l1, TimeUnit timeunit)
    {
        d(l1, timeunit);
        h = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = ic.EXPIRED;
        }
        b = true;
        return this;
    }

    hy b(ct ct1)
    {
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Value strength was already set to %s", new Object[] {
            g
        });
        g = (ct)Preconditions.checkNotNull(ct1);
        if (ct1 != ct.STRONG)
        {
            b = true;
        }
        return this;
    }

    Equivalence b()
    {
        return (Equivalence)Objects.firstNonNull(k, g().defaultEquivalence());
    }

    public hy c(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (d == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(d)
        });
        if (i1 > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        d = i1;
        return this;
    }

    public hy c(long l1, TimeUnit timeunit)
    {
        d(l1, timeunit);
        i = timeunit.toNanos(l1);
        if (l1 == 0L && j == null)
        {
            j = ic.EXPIRED;
        }
        b = true;
        return this;
    }

    Equivalence c()
    {
        return (Equivalence)Objects.firstNonNull(l, j().defaultEquivalence());
    }

    int d()
    {
        if (c == -1)
        {
            return 16;
        } else
        {
            return c;
        }
    }

    int e()
    {
        if (d == -1)
        {
            return 4;
        } else
        {
            return d;
        }
    }

    public hy f()
    {
        return a(ct.WEAK);
    }

    ct g()
    {
        return (ct)Objects.firstNonNull(f, ct.STRONG);
    }

    public hy h()
    {
        return b(ct.WEAK);
    }

    public hy i()
    {
        return b(ct.SOFT);
    }

    ct j()
    {
        return (ct)Objects.firstNonNull(g, ct.STRONG);
    }

    long k()
    {
        if (h == -1L)
        {
            return 0L;
        } else
        {
            return h;
        }
    }

    long l()
    {
        if (i == -1L)
        {
            return 0L;
        } else
        {
            return i;
        }
    }

    Ticker m()
    {
        return (Ticker)Objects.firstNonNull(m, Ticker.systemTicker());
    }

    public ConcurrentMap n()
    {
        if (!b)
        {
            return new ConcurrentHashMap(d(), 0.75F, e());
        }
        Object obj;
        if (j == null)
        {
            obj = new bj(this);
        } else
        {
            obj = new ib(this);
        }
        return (ConcurrentMap)obj;
    }

    public String toString()
    {
        com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (c != -1)
        {
            tostringhelper.add("initialCapacity", Integer.valueOf(c));
        }
        if (d != -1)
        {
            tostringhelper.add("concurrencyLevel", Integer.valueOf(d));
        }
        if (e != -1)
        {
            tostringhelper.add("maximumSize", Integer.valueOf(e));
        }
        if (h != -1L)
        {
            tostringhelper.add("expireAfterWrite", (new StringBuilder()).append(h).append("ns").toString());
        }
        if (i != -1L)
        {
            tostringhelper.add("expireAfterAccess", (new StringBuilder()).append(i).append("ns").toString());
        }
        if (f != null)
        {
            tostringhelper.add("keyStrength", Ascii.toLowerCase(f.toString()));
        }
        if (g != null)
        {
            tostringhelper.add("valueStrength", Ascii.toLowerCase(g.toString()));
        }
        if (k != null)
        {
            tostringhelper.addValue("keyEquivalence");
        }
        if (l != null)
        {
            tostringhelper.addValue("valueEquivalence");
        }
        if (a != null)
        {
            tostringhelper.addValue("removalListener");
        }
        return tostringhelper.toString();
    }
}
