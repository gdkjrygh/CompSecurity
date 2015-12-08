// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.c.b:
//            be, f, bu, h, 
//            bk, g, cd, av, 
//            ap, aq, c

public final class by
    implements be
{
    public static final class a
        implements be.a
    {

        private Map a;
        private int b;
        private b.a c;

        private b.a a(int i)
        {
            if (c != null)
            {
                if (i == b)
                {
                    return c;
                }
                b(b, c.a());
            }
            if (i == 0)
            {
                return null;
            }
            b b1 = (b)a.get(Integer.valueOf(i));
            b = i;
            c = b.a();
            if (b1 != null)
            {
                c.a(b1);
            }
            return c;
        }

        private a b(int i, b b1)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (c != null && b == i)
            {
                c = null;
                b = 0;
            }
            if (a.isEmpty())
            {
                a = new TreeMap();
            }
            a.put(Integer.valueOf(i), b1);
            return this;
        }

        static a d()
        {
            a a1 = new a();
            a1.a = Collections.emptyMap();
            a1.b = 0;
            a1.c = null;
            return a1;
        }

        public final a a(int i, int k)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            } else
            {
                a(i).a(k);
                return this;
            }
        }

        public final a a(int i, b b1)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (i == 0)
            {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            boolean flag;
            if (i == b || a.containsKey(Integer.valueOf(i)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a(i).a(b1);
                return this;
            } else
            {
                b(i, b1);
                return this;
            }
        }

        public final a a(by by1)
        {
            if (by1 != by.e())
            {
                java.util.Map.Entry entry;
                for (by1 = by.b(by1).entrySet().iterator(); by1.hasNext(); a(((Integer)entry.getKey()).intValue(), (b)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)by1.next();
                }

            }
            return this;
        }

        public final a a(g g1)
        {
            int i;
            do
            {
                i = g1.a();
            } while (i != 0 && a(i, g1));
            return this;
        }

        public final boolean a()
        {
            return true;
        }

        public final boolean a(int i, g g1)
        {
            int k = cd.b(i);
            switch (cd.a(i))
            {
            default:
                throw av.g();

            case 0: // '\0'
                a(k).a(g1.e());
                return true;

            case 1: // '\001'
                a(k).b(g1.g());
                return true;

            case 2: // '\002'
                a(k).a(g1.l());
                return true;

            case 3: // '\003'
                a a1 = by.c();
                g1.a(k, a1, ap.b());
                a(k).a(a1.b());
                return true;

            case 4: // '\004'
                return false;

            case 5: // '\005'
                a(k).a(g1.h());
                break;
            }
            return true;
        }

        public final by b()
        {
            a(0);
            by by1;
            if (a.isEmpty())
            {
                by1 = by.e();
            } else
            {
                by1 = new by(Collections.unmodifiableMap(a), (byte)0);
            }
            a = null;
            return by1;
        }

        public final be.a c(g g1, aq aq)
        {
            return a(g1);
        }

        public final by c()
        {
            return b();
        }

        public final Object clone()
        {
            a(0);
            return by.c().a(new by(a, (byte)0));
        }

        public final be j()
        {
            return b();
        }

        private a()
        {
        }
    }

    public static final class b
    {

        private static final b a = a.b().a();
        private List b;
        private List c;
        private List d;
        private List e;
        private List f;

        public static a a()
        {
            return a.b();
        }

        static List a(b b1)
        {
            return b1.b;
        }

        static List a(b b1, List list)
        {
            b1.b = list;
            return list;
        }

        static List b(b b1)
        {
            return b1.c;
        }

        static List b(b b1, List list)
        {
            b1.c = list;
            return list;
        }

        static List c(b b1)
        {
            return b1.d;
        }

        static List c(b b1, List list)
        {
            b1.d = list;
            return list;
        }

        static List d(b b1)
        {
            return b1.e;
        }

        static List d(b b1, List list)
        {
            b1.e = list;
            return list;
        }

        static List e(b b1)
        {
            return b1.f;
        }

        static List e(b b1, List list)
        {
            b1.f = list;
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
            if (!(obj instanceof b))
            {
                return false;
            } else
            {
                return Arrays.equals(g(), ((b)obj).g());
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


        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class b.a
    {

        private b a;

        static b.a b()
        {
            b.a a1 = new b.a();
            a1.a = new b((byte)0);
            return a1;
        }

        public final b.a a(int i)
        {
            if (b.b(a) == null)
            {
                b.b(a, new ArrayList());
            }
            b.b(a).add(Integer.valueOf(i));
            return this;
        }

        public final b.a a(long l)
        {
            if (b.a(a) == null)
            {
                b.a(a, new ArrayList());
            }
            b.a(a).add(Long.valueOf(l));
            return this;
        }

        public final b.a a(b b1)
        {
            if (!b.a(b1).isEmpty())
            {
                if (b.a(a) == null)
                {
                    b.a(a, new ArrayList());
                }
                b.a(a).addAll(b.a(b1));
            }
            if (!b.b(b1).isEmpty())
            {
                if (b.b(a) == null)
                {
                    b.b(a, new ArrayList());
                }
                b.b(a).addAll(b.b(b1));
            }
            if (!b.c(b1).isEmpty())
            {
                if (b.c(a) == null)
                {
                    b.c(a, new ArrayList());
                }
                b.c(a).addAll(b.c(b1));
            }
            if (!b.d(b1).isEmpty())
            {
                if (b.d(a) == null)
                {
                    b.d(a, new ArrayList());
                }
                b.d(a).addAll(b.d(b1));
            }
            if (!b.e(b1).isEmpty())
            {
                if (b.e(a) == null)
                {
                    b.e(a, new ArrayList());
                }
                b.e(a).addAll(b.e(b1));
            }
            return this;
        }

        public final b.a a(by by1)
        {
            if (b.e(a) == null)
            {
                b.e(a, new ArrayList());
            }
            b.e(a).add(by1);
            return this;
        }

        public final b.a a(f f1)
        {
            if (b.d(a) == null)
            {
                b.d(a, new ArrayList());
            }
            b.d(a).add(f1);
            return this;
        }

        public final b a()
        {
            b b1;
            if (b.a(a) == null)
            {
                b.a(a, Collections.emptyList());
            } else
            {
                b.a(a, Collections.unmodifiableList(b.a(a)));
            }
            if (b.b(a) == null)
            {
                b.b(a, Collections.emptyList());
            } else
            {
                b.b(a, Collections.unmodifiableList(b.b(a)));
            }
            if (b.c(a) == null)
            {
                b.c(a, Collections.emptyList());
            } else
            {
                b.c(a, Collections.unmodifiableList(b.c(a)));
            }
            if (b.d(a) == null)
            {
                b.d(a, Collections.emptyList());
            } else
            {
                b.d(a, Collections.unmodifiableList(b.d(a)));
            }
            if (b.e(a) == null)
            {
                b.e(a, Collections.emptyList());
            } else
            {
                b.e(a, Collections.unmodifiableList(b.e(a)));
            }
            b1 = a;
            a = null;
            return b1;
        }

        public final b.a b(long l)
        {
            if (b.c(a) == null)
            {
                b.c(a, new ArrayList());
            }
            b.c(a).add(Long.valueOf(l));
            return this;
        }

        private b.a()
        {
        }
    }

    public static final class c extends com.c.b.c
    {

        private static by a(g g1)
        {
            a a1 = by.c();
            try
            {
                a1.a(g1);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw g1.a(a1.c());
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw (new av(g1.getMessage())).a(a1.c());
            }
            return a1.c();
        }

        public final volatile Object a(g g1, aq aq)
        {
            return a(g1);
        }

        public c()
        {
        }
    }


    private static final by a = new by(Collections.emptyMap());
    private static final c c = new c();
    private Map b;

    private by()
    {
    }

    private by(Map map)
    {
        b = map;
    }

    by(Map map, byte byte0)
    {
        this(map);
    }

    public static a a(by by1)
    {
        return a.d().a(by1);
    }

    static Map b(by by1)
    {
        return by1.b;
    }

    public static a c()
    {
        return a.d();
    }

    public static by e()
    {
        return a;
    }

    public final void a(h h)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); ((b)entry.getValue()).a(((Integer)entry.getKey()).intValue(), h))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public final boolean a()
    {
        return true;
    }

    public final int b()
    {
        Iterator iterator = b.entrySet().iterator();
        java.util.Map.Entry entry;
        int i;
        for (i = 0; iterator.hasNext(); i = ((b)entry.getValue()).a(((Integer)entry.getKey()).intValue()) + i)
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return i;
    }

    public final void b(h h)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); ((b)entry.getValue()).b(((Integer)entry.getKey()).intValue(), h))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public final f d()
    {
        Object obj;
        try
        {
            obj = com.c.b.f.b(b());
            a(((f.b) (obj)).b());
            obj = ((f.b) (obj)).a();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", ioexception);
        }
        return ((f) (obj));
    }

    public final boolean equals(Object obj)
    {
        while (this == obj || (obj instanceof by) && b.equals(((by)obj).b)) 
        {
            return true;
        }
        return false;
    }

    public final Map f()
    {
        return b;
    }

    public final int g()
    {
        Iterator iterator = b.entrySet().iterator();
        java.util.Map.Entry entry;
        int i;
        for (i = 0; iterator.hasNext(); i = ((b)entry.getValue()).b(((Integer)entry.getKey()).intValue()) + i)
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return i;
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final volatile bk t()
    {
        return c;
    }

    public final String toString()
    {
        return bu.a(this);
    }

    public final be.a v()
    {
        return a.d().a(this);
    }

}
