// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            by, h, f, be

public static final class <init>
{
    public static final class a
    {

        private by.b a;

        static a b()
        {
            a a1 = new a();
            a1.a = new by.b((byte)0);
            return a1;
        }

        public final a a(int i)
        {
            if (by.b.b(a) == null)
            {
                by.b.b(a, new ArrayList());
            }
            by.b.b(a).add(Integer.valueOf(i));
            return this;
        }

        public final a a(long l)
        {
            if (by.b.a(a) == null)
            {
                by.b.a(a, new ArrayList());
            }
            by.b.a(a).add(Long.valueOf(l));
            return this;
        }

        public final a a(by.b b1)
        {
            if (!by.b.a(b1).isEmpty())
            {
                if (by.b.a(a) == null)
                {
                    by.b.a(a, new ArrayList());
                }
                by.b.a(a).addAll(by.b.a(b1));
            }
            if (!by.b.b(b1).isEmpty())
            {
                if (by.b.b(a) == null)
                {
                    by.b.b(a, new ArrayList());
                }
                by.b.b(a).addAll(by.b.b(b1));
            }
            if (!by.b.c(b1).isEmpty())
            {
                if (by.b.c(a) == null)
                {
                    by.b.c(a, new ArrayList());
                }
                by.b.c(a).addAll(by.b.c(b1));
            }
            if (!by.b.d(b1).isEmpty())
            {
                if (by.b.d(a) == null)
                {
                    by.b.d(a, new ArrayList());
                }
                by.b.d(a).addAll(by.b.d(b1));
            }
            if (!by.b.e(b1).isEmpty())
            {
                if (by.b.e(a) == null)
                {
                    by.b.e(a, new ArrayList());
                }
                by.b.e(a).addAll(by.b.e(b1));
            }
            return this;
        }

        public final a a(by by1)
        {
            if (by.b.e(a) == null)
            {
                by.b.e(a, new ArrayList());
            }
            by.b.e(a).add(by1);
            return this;
        }

        public final a a(f f1)
        {
            if (by.b.d(a) == null)
            {
                by.b.d(a, new ArrayList());
            }
            by.b.d(a).add(f1);
            return this;
        }

        public final by.b a()
        {
            by.b b1;
            if (by.b.a(a) == null)
            {
                by.b.a(a, Collections.emptyList());
            } else
            {
                by.b.a(a, Collections.unmodifiableList(by.b.a(a)));
            }
            if (by.b.b(a) == null)
            {
                by.b.b(a, Collections.emptyList());
            } else
            {
                by.b.b(a, Collections.unmodifiableList(by.b.b(a)));
            }
            if (by.b.c(a) == null)
            {
                by.b.c(a, Collections.emptyList());
            } else
            {
                by.b.c(a, Collections.unmodifiableList(by.b.c(a)));
            }
            if (by.b.d(a) == null)
            {
                by.b.d(a, Collections.emptyList());
            } else
            {
                by.b.d(a, Collections.unmodifiableList(by.b.d(a)));
            }
            if (by.b.e(a) == null)
            {
                by.b.e(a, Collections.emptyList());
            } else
            {
                by.b.e(a, Collections.unmodifiableList(by.b.e(a)));
            }
            b1 = a;
            a = null;
            return b1;
        }

        public final a b(long l)
        {
            if (by.b.c(a) == null)
            {
                by.b.c(a, new ArrayList());
            }
            by.b.c(a).add(Long.valueOf(l));
            return this;
        }

        private a()
        {
        }
    }


    private static final g a = a.b().a();
    private List b;
    private List c;
    private List d;
    private List e;
    private List f;

    public static a a()
    {
        return a.b();
    }

    static List a(a.b b1)
    {
        return b1.b;
    }

    static List a(t t, List list)
    {
        t.b = list;
        return list;
    }

    static List b(b b1)
    {
        return b1.c;
    }

    static List b(t t, List list)
    {
        t.c = list;
        return list;
    }

    static List c(c c1)
    {
        return c1.d;
    }

    static List c(t t, List list)
    {
        t.d = list;
        return list;
    }

    static List d(d d1)
    {
        return d1.e;
    }

    static List d(t t, List list)
    {
        t.e = list;
        return list;
    }

    static List e(e e1)
    {
        return e1.f;
    }

    static List e(t t, List list)
    {
        t.f = list;
        return list;
    }

    private Object[] g()
    {
        return (new Object[] {
            b, c, d, e, f
        });
    }

    public final int a(int i)
    {
        Iterator iterator = b.iterator();
        int j;
        for (j = 0; iterator.hasNext(); j = h.d(i, ((Long)iterator.next()).longValue()) + j) { }
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext();)
        {
            ((Integer)iterator1.next()).intValue();
            j += h.j(i) + 4;
        }

        for (Iterator iterator2 = d.iterator(); iterator2.hasNext();)
        {
            ((Long)iterator2.next()).longValue();
            j += h.j(i) + 8;
        }

        for (Iterator iterator3 = e.iterator(); iterator3.hasNext();)
        {
            j += h.c(i, (f)iterator3.next());
        }

        for (Iterator iterator4 = f.iterator(); iterator4.hasNext();)
        {
            by by1 = (by)iterator4.next();
            int k = h.j(i);
            j += by1.b() + k * 2;
        }

        return j;
    }

    public final void a(int i, h h1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); h1.a(i, ((Long)iterator.next()).longValue())) { }
        int j;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); h1.c(j))
        {
            j = ((Integer)iterator1.next()).intValue();
            h1.g(i, 5);
        }

        long l;
        for (Iterator iterator2 = d.iterator(); iterator2.hasNext(); h1.c(l))
        {
            l = ((Long)iterator2.next()).longValue();
            h1.g(i, 1);
        }

        for (Iterator iterator3 = e.iterator(); iterator3.hasNext(); h1.a(i, (f)iterator3.next())) { }
        for (Iterator iterator4 = f.iterator(); iterator4.hasNext(); h1.a(i, (by)iterator4.next())) { }
    }

    public final int b(int i)
    {
        Iterator iterator = e.iterator();
        f f1;
        int j;
        int k;
        int l;
        for (j = 0; iterator.hasNext(); j = h.c(3, f1) + (k * 2 + l) + j)
        {
            f1 = (f)iterator.next();
            k = h.j(1);
            l = h.e(2, i);
        }

        return j;
    }

    public final List b()
    {
        return b;
    }

    public final void b(int i, h h1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); h1.b(i, (f)iterator.next())) { }
    }

    public final List c()
    {
        return c;
    }

    public final List d()
    {
        return d;
    }

    public final List e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ect))
        {
            return false;
        } else
        {
            return Arrays.equals(g(), ((ect)obj).g());
        }
    }

    public final List f()
    {
        return f;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(g());
    }


    private a()
    {
    }

    a(byte byte0)
    {
        this();
    }
}
