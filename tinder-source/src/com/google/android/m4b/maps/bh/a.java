// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bh;

import android.util.Pair;
import com.google.android.m4b.maps.ae.c;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.cc.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public final class com.google.android.m4b.maps.bh.a
{
    static final class a
    {

        public q a;
        public int b;
        public int c;
        public long d;

        public a(long l)
        {
            a = null;
            b = 0;
            c = 0;
            d = l;
        }

        public a(a a1)
        {
            a = a1.a;
            b = a1.b;
            c = a1.c;
            d = a1.d;
        }
    }

    static final class b
        implements Comparable
    {

        public Pair a;
        public ac b;
        private a c;

        public final int compareTo(Object obj)
        {
            obj = (b)obj;
            return Long.valueOf(c.d).compareTo(Long.valueOf(((b) (obj)).c.d));
        }

        public b(Pair pair, ac ac1, a a1)
        {
            a = pair;
            b = ac1;
            c = a1;
        }
    }

    final class c extends e
    {

        final List d = new ArrayList();
        private final Long e;
        private com.google.android.m4b.maps.bh.a f;

        public final void a(a a1)
        {
            d.add(a1);
        }

        public final void a(com.google.android.m4b.maps.bm.d d1)
        {
            a a1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); com.google.android.m4b.maps.bh.a.b(f, com.google.android.m4b.maps.bh.a.b(f) - a1.c))
            {
                a1 = (a)iterator.next();
                a1.a.c(d1);
                com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - a1.b);
            }

            d.clear();
        }

        protected final void a(Object obj, Object obj1)
        {
            obj = (ac)obj;
            obj1 = (a)obj1;
            super.a(obj, obj1);
            com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - ((a) (obj1)).b);
            com.google.android.m4b.maps.bh.a.b(f, com.google.android.m4b.maps.bh.a.b(f) - ((a) (obj1)).c);
            if (((a) (obj1)).a != null)
            {
                obj1.b = 0;
                obj1.c = 0;
                a(((a) (obj1)));
            }
        }

        public final void c()
        {
            Object obj = new ArrayList(super.a.size());
            com.google.android.m4b.maps.bw.e.a a1 = b();
            do
            {
                if (!a1.hasNext())
                {
                    break;
                }
                com.google.android.m4b.maps.bw.e.b b1 = a1.a();
                if (b1.a == com.google.android.m4b.maps.bh.a.a)
                {
                    break;
                }
                a a2 = (a)b1.b;
                q q1 = a2.a;
                if (q1 == null || !q1.a())
                {
                    ((List) (obj)).add(b1.a);
                } else
                {
                    q1.b(com.google.android.m4b.maps.bm.d.a(e.longValue()));
                    com.google.android.m4b.maps.bh.a.a(f, com.google.android.m4b.maps.bh.a.a(f) - a2.b);
                    a2.b = 0;
                }
            } while (true);
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d((ac)((Iterator) (obj)).next())) { }
        }

        public final com.google.android.m4b.maps.bw.e.b d()
        {
            com.google.android.m4b.maps.bw.e.a a1 = b();
            if (a1.hasNext())
            {
                return a1.a();
            } else
            {
                return null;
            }
        }

        public final void e()
        {
            com.google.android.m4b.maps.bh.a.c(f);
            long l = k.c();
            a a1 = (a)c(com.google.android.m4b.maps.bh.a.a);
            if (a1 == null)
            {
                b(com.google.android.m4b.maps.bh.a.a, new a(l));
                return;
            } else
            {
                a1.d = l;
                return;
            }
        }

        public c(long l)
        {
            f = com.google.android.m4b.maps.bh.a.this;
            super(0x7fffffff);
            e = Long.valueOf(l);
        }
    }

    public static final class d
        implements Comparable
    {

        private final int a;
        private final com.google.android.m4b.maps.bw.a b;
        private final String c;

        public final int compareTo(Object obj)
        {
            obj = (d)obj;
            if (a != ((d) (obj)).a)
            {
                return a - ((d) (obj)).a;
            } else
            {
                return b.a(((d) (obj)).b);
            }
        }

        public final boolean equals(Object obj)
        {
            return (obj instanceof d) && ((d)obj).a == a && ((d)obj).b.equals(b);
        }

        public final int hashCode()
        {
            return a * 33 ^ b.hashCode();
        }

        public final String toString()
        {
            return c;
        }

        public d(ah ah1)
        {
            this(ah1, null, com.google.android.m4b.maps.bw.a.a);
        }

        public d(ah ah1, Set set, com.google.android.m4b.maps.bw.a a1)
        {
            if (ah1.C)
            {
                throw new IllegalArgumentException("Modifier tile types not allowed as base");
            }
            int j = 1 << ah1.E;
            ah1 = new StringBuilder(ah1.toString());
            int l = j;
            if (set != null)
            {
                l = j;
                if (!set.isEmpty())
                {
                    ah1.append(" with modifiers ");
                    set = set.iterator();
                    do
                    {
                        if (!set.hasNext())
                        {
                            break;
                        }
                        ah ah2 = (ah)set.next();
                        if (!ah2.C)
                        {
                            throw new IllegalArgumentException("Only modifier tile types allowed");
                        }
                        l = j | 1 << ah2.E;
                        ah1.append(ah2.toString());
                        j = l;
                        if (set.hasNext())
                        {
                            ah1.append(", ");
                            j = l;
                        }
                    } while (true);
                    l = j;
                }
            }
            if (a1 != com.google.android.m4b.maps.bw.a.a)
            {
                set = String.valueOf(a1);
                ah1.append((new StringBuilder(String.valueOf(set).length() + 11)).append(" with mask ").append(set).toString());
            }
            a = l;
            c = ah1.toString();
            b = a1;
        }
    }


    protected static final ac a = new ac(-1, 0, 0);
    private static com.google.android.m4b.maps.bh.a b;
    private final k c;
    private final Map d = new HashMap();
    private final int e;
    private final int f;
    private int g;
    private int h;
    private final List i = new ArrayList();

    private com.google.android.m4b.maps.bh.a(k k1, int j, int l)
    {
        g = 0;
        h = 0;
        c = k1;
        e = j;
        f = l;
    }

    static int a(com.google.android.m4b.maps.bh.a a1)
    {
        return a1.g;
    }

    static int a(com.google.android.m4b.maps.bh.a a1, int j)
    {
        a1.g = j;
        return j;
    }

    private c a(long l, Pair pair)
    {
        if (!i.contains(Long.valueOf(l)))
        {
            c c1 = new c(l);
            d.put(pair, c1);
            return c1;
        } else
        {
            return null;
        }
    }

    public static com.google.android.m4b.maps.bh.a a()
    {
        com/google/android/m4b/maps/bh/a;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bh.a a1 = b;
        com/google/android/m4b/maps/bh/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private static String a(int j)
    {
        j = com.google.android.m4b.maps.ae.c.a(j * 10);
        int l = j / 10;
        return (new StringBuilder(23)).append(l).append(".").append(j % 10).toString();
    }

    private void a(int j, int l)
    {
        this;
        JVM INSTR monitorenter ;
        if (g > j) goto _L2; else goto _L1
_L1:
        int i1 = h;
        if (i1 > l) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Object obj1;
        obj = new TreeSet();
        obj1 = d.entrySet().iterator();
_L5:
        Object obj2;
        Object obj3;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_150;
            }
            obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            obj3 = ((c)((java.util.Map.Entry) (obj2)).getValue()).d();
        } while (obj3 == null);
        if (((com.google.android.m4b.maps.bw.e.b) (obj3)).a == a) goto _L5; else goto _L4
_L4:
        ((SortedSet) (obj)).add(new b((Pair)((java.util.Map.Entry) (obj2)).getKey(), (ac)((com.google.android.m4b.maps.bw.e.b) (obj3)).a, (a)((com.google.android.m4b.maps.bw.e.b) (obj3)).b));
          goto _L5
        obj;
        throw obj;
        obj1 = new ArrayList();
_L7:
        do
        {
            if (((SortedSet) (obj)).isEmpty() || g <= j && h <= l)
            {
                break MISSING_BLOCK_LABEL_332;
            }
            obj2 = (b)((SortedSet) (obj)).first();
            obj3 = (c)d.get(((b) (obj2)).a);
            ((c) (obj3)).d(((b) (obj2)).b);
            if (((e) (obj3)).a.size() == 0 && ((c) (obj3)).d.isEmpty())
            {
                ((List) (obj1)).add(((b) (obj2)).a);
            }
            ((SortedSet) (obj)).remove(obj2);
            obj3 = ((c) (obj3)).d();
        } while (obj3 == null);
        if (((com.google.android.m4b.maps.bw.e.b) (obj3)).a == a) goto _L7; else goto _L6
_L6:
        ((SortedSet) (obj)).add(new b(((b) (obj2)).a, (ac)((com.google.android.m4b.maps.bw.e.b) (obj3)).a, (a)((com.google.android.m4b.maps.bw.e.b) (obj3)).b));
          goto _L7
        Iterator iterator = ((List) (obj1)).iterator();
        while (iterator.hasNext()) 
        {
            Pair pair = (Pair)iterator.next();
            d.remove(pair);
        }
          goto _L3
    }

    public static void a(k k1)
    {
        com/google/android/m4b/maps/bh/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            int j = o.e();
            b = new com.google.android.m4b.maps.bh.a(k1, (j * 1024 * 1024) / 2, (j * 1024 * 1024 * 3) / 16);
        }
        com/google/android/m4b/maps/bh/a;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    static int b(com.google.android.m4b.maps.bh.a a1)
    {
        return a1.h;
    }

    static int b(com.google.android.m4b.maps.bh.a a1, int j)
    {
        a1.h = j;
        return j;
    }

    private a b(com.google.android.m4b.maps.bm.d d1, d d2, ac ac1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Pair pair;
        long l;
        l = com.google.android.m4b.maps.bm.d.a(d1);
        pair = Pair.create(Long.valueOf(l), d2);
        d2 = (c)d.get(pair);
        d1 = d2;
        if (d2 != null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        d2 = a(l, pair);
        d1 = d2;
        if (d2 != null) goto _L2; else goto _L5
_L5:
        d1 = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return d1;
_L4:
        d1 = null;
        continue; /* Loop/switch isn't completed */
_L2:
        d2 = (a)d1.c(ac1);
        if (d2 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        d2.d = k.c();
        d1 = d2;
        continue; /* Loop/switch isn't completed */
        d1;
        throw d1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        d1.b(ac1, new a(k.c()));
        d1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static k c(com.google.android.m4b.maps.bh.a a1)
    {
        return a1.c;
    }

    public final q a(com.google.android.m4b.maps.bm.d d1, d d2, ac ac1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d1 = b(d1, d2, ac1, flag);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = ((a) (d1)).a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return d1;
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        d1;
        throw d1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        long l = com.google.android.m4b.maps.bm.d.a(d1);
        i.add(Long.valueOf(l));
        d1 = new ArrayList();
        Iterator iterator = d.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Long)((Pair)entry.getKey()).first).longValue() == l)
            {
                ((c)entry.getValue()).a();
                ((c)entry.getValue()).a(null);
                d1.add(entry.getKey());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_135;
        d1;
        throw d1;
        Pair pair;
        for (d1 = d1.iterator(); d1.hasNext(); d.remove(pair))
        {
            pair = (Pair)d1.next();
        }

        this;
        JVM INSTR monitorexit ;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, d d2)
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        d2 = Pair.create(Long.valueOf(com.google.android.m4b.maps.bm.d.a(d1)), d2);
        c1 = (c)d.get(d2);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        c1.a(0);
        c1.a(d1);
        d.remove(d2);
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, d d2, ac ac1, q q1)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = com.google.android.m4b.maps.bm.d.a(d1);
        d2 = Pair.create(Long.valueOf(l), d2);
        d1 = (c)d.get(d2);
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        d1 = a(l, ((Pair) (d2)));
        if (d1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d2 = (a)d1.b(ac1);
        if (d2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((a) (d2)).a != null)
        {
            d1.a(new a(d2));
        }
        d2.a = q1;
        d2.b = q1.h();
        d2.c = q1.i();
        g = g + ((a) (d2)).b;
        int j = h;
        h = ((a) (d2)).c + j;
        a(e, f);
        if (true) goto _L1; else goto _L3
_L3:
        d1;
        throw d1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, d d2, List list)
    {
        this;
        JVM INSTR monitorenter ;
        d1 = (c)d.get(Pair.create(Long.valueOf(com.google.android.m4b.maps.bm.d.a(d1)), d2));
        if (d1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j = 0;
        d2 = list.iterator();
_L4:
        do
        {
            if (!d2.hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            list = (a)d1.b((ac)d2.next());
        } while (list == null);
        if (((a) (list)).a == null || ((a) (list)).b != 0) goto _L4; else goto _L3
_L3:
        j = ((a) (list)).c + j;
          goto _L4
        a(e - j, f);
        if (true) goto _L1; else goto _L5
_L5:
        d1;
        throw d1;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        a(g, 0);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(g, h / 2);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        a(0, h);
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l = com.google.android.m4b.maps.bm.d.a(d1);
        Iterator iterator = d.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Long)((Pair)entry.getKey()).first).longValue() == l)
            {
                ((c)entry.getValue()).d(a);
                ((c)entry.getValue()).a(d1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        d1;
        throw d1;
    }

    public final void b(com.google.android.m4b.maps.bm.d d1, d d2)
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        d2 = Pair.create(Long.valueOf(com.google.android.m4b.maps.bm.d.a(d1)), d2);
        c1 = (c)d.get(d2);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        c1.d(a);
        c1.c();
        c1.a(d1);
        if (((e) (c1)).a.size() == 0)
        {
            d.remove(d2);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void b(com.google.android.m4b.maps.bm.d d1, d d2, List list)
    {
        this;
        JVM INSTR monitorenter ;
        d1 = (c)d.get(Pair.create(Long.valueOf(com.google.android.m4b.maps.bm.d.a(d1)), d2));
        if (d1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d2 = list.iterator();
_L4:
        do
        {
            if (!d2.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            list = (a)d1.b((ac)d2.next());
        } while (list == null);
        if (((a) (list)).a == null || ((a) (list)).b != 0) goto _L4; else goto _L3
_L3:
        list.b = ((a) (list)).a.h();
        g = g + ((a) (list)).b;
        int j = ((a) (list)).c;
        int l = ((a) (list)).a.i();
        list.c = l;
        h = (h - j) + l;
          goto _L4
        d1;
        throw d1;
        a(e, f);
          goto _L1
    }

    public final String c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new StringBuilder();
        iterator = d.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        int j;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_111;
            }
            entry = (java.util.Map.Entry)iterator.next();
            j = ((e) ((c)entry.getValue())).a.size();
        } while (j == 0);
        if (((StringBuilder) (obj)).length() > 0)
        {
            ((StringBuilder) (obj)).append(" + ");
        }
        ((StringBuilder) (obj)).append(j).append(" ").append(entry.getKey());
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        if (((StringBuilder) (obj)).length() == 0)
        {
            ((StringBuilder) (obj)).append("no");
        }
        ((StringBuilder) (obj)).append(" tiles use ");
        ((StringBuilder) (obj)).append(a(g)).append("/").append(a(e)).append("M GL, ").append(a(h)).append("/").append(a(f)).append("M J+N");
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
    }

    public final void c(com.google.android.m4b.maps.bm.d d1, d d2)
    {
        this;
        JVM INSTR monitorenter ;
        d1 = (c)d.get(Pair.create(Long.valueOf(com.google.android.m4b.maps.bm.d.a(d1)), d2));
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        d1.c();
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void d(com.google.android.m4b.maps.bm.d d1, d d2)
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        Pair pair;
        long l;
        l = com.google.android.m4b.maps.bm.d.a(d1);
        pair = Pair.create(Long.valueOf(l), d2);
        c1 = (c)d.get(pair);
        d2 = c1;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        d2 = a(l, pair);
        if (d2 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d2.e();
        d2.a(d1);
        if (true) goto _L1; else goto _L3
_L3:
        d1;
        throw d1;
    }

}
