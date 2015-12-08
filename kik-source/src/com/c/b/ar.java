// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bq, h, aw, f, 
//            be

final class ar
{
    public static interface a
        extends Comparable
    {

        public abstract be.a a(be.a a1, be be1);

        public abstract int e();

        public abstract cd.b g();

        public abstract cd.a j();

        public abstract boolean o();

        public abstract boolean p();
    }


    private static final ar d = new ar((byte)0);
    private final bq a;
    private boolean b;
    private boolean c;

    private ar()
    {
        c = false;
        a = bq.a(16);
    }

    private ar(byte byte0)
    {
        c = false;
        a = bq.a(0);
        c();
    }

    private static int a(cd.a a1, int k, Object obj)
    {
        int l = com.c.b.h.j(k);
        k = l;
        if (a1 == cd.a.j)
        {
            k = l * 2;
        }
        return k + b(a1, obj);
    }

    static int a(cd.a a1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return a1.b();
        }
    }

    public static ar a()
    {
        return new ar();
    }

    private static Object a(Object obj)
    {
        Object obj1 = obj;
        if (obj instanceof byte[])
        {
            obj = (byte[])obj;
            obj1 = new byte[obj.length];
            System.arraycopy(obj, 0, obj1, 0, obj.length);
        }
        return obj1;
    }

    public static void a(a a1, Object obj, h h1)
    {
        cd.a a2;
        int k;
label0:
        {
            a2 = a1.j();
            k = a1.e();
            if (a1.o())
            {
                obj = (List)obj;
                if (a1.p())
                {
                    h1.g(k, 2);
                    k = 0;
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext();)
                    {
                        k += b(a2, a1.next());
                    }

                    h1.k(k);
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext(); a(h1, a2, a1.next())) { }
                } else
                {
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext(); a(h1, a2, k, a1.next())) { }
                }
            } else
            {
                if (!(obj instanceof aw))
                {
                    break label0;
                }
                a(h1, a2, k, ((aw)obj).a());
            }
            return;
        }
        a(h1, a2, k, obj);
    }

    private static void a(cd.a a1, Object obj)
    {
        boolean flag;
        flag = false;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        static final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[cd.a.values().length];
                try
                {
                    b[cd.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    b[cd.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    b[cd.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    b[cd.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[cd.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[cd.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[cd.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[cd.a.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[cd.a.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[cd.a.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[cd.a.i.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[cd.a.l.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[cd.a.m.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[cd.a.o.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[cd.a.p.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[cd.a.q.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[cd.a.r.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[cd.a.n.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                a = new int[cd.b.values().length];
                try
                {
                    a[cd.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[cd.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[cd.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[cd.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[cd.b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[cd.b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[cd.b.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[cd.b.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[cd.b.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.a().ordinal()];
        JVM INSTR tableswitch 1 9: default 76
    //                   1 90
    //                   2 98
    //                   3 106
    //                   4 114
    //                   5 122
    //                   6 130
    //                   7 138
    //                   8 157
    //                   9 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_176;
_L11:
        if (!flag)
        {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else
        {
            return;
        }
_L2:
        flag = obj instanceof Integer;
          goto _L11
_L3:
        flag = obj instanceof Long;
          goto _L11
_L4:
        flag = obj instanceof Float;
          goto _L11
_L5:
        flag = obj instanceof Double;
          goto _L11
_L6:
        flag = obj instanceof Boolean;
          goto _L11
_L7:
        flag = obj instanceof String;
          goto _L11
_L8:
        if ((obj instanceof f) || (obj instanceof byte[]))
        {
            flag = true;
        }
          goto _L11
_L9:
        if ((obj instanceof Integer) || (obj instanceof au.a))
        {
            flag = true;
        }
          goto _L11
        if ((obj instanceof be) || (obj instanceof aw))
        {
            flag = true;
        }
          goto _L11
    }

    private static void a(h h1, cd.a a1, int k, Object obj)
    {
        if (a1 == cd.a.j)
        {
            h1.a(k, (be)obj);
            return;
        } else
        {
            h1.g(k, a(a1, false));
            a(h1, a1, obj);
            return;
        }
    }

    private static void a(h h1, cd.a a1, Object obj)
    {
        switch (_cls1.b[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h1.a(((Double)obj).doubleValue());
            return;

        case 2: // '\002'
            h1.m(Float.floatToRawIntBits(((Float)obj).floatValue()));
            return;

        case 3: // '\003'
            h1.b(((Long)obj).longValue());
            return;

        case 4: // '\004'
            h1.a(((Long)obj).longValue());
            return;

        case 5: // '\005'
            h1.b(((Integer)obj).intValue());
            return;

        case 6: // '\006'
            h1.c(((Long)obj).longValue());
            return;

        case 7: // '\007'
            h1.c(((Integer)obj).intValue());
            return;

        case 8: // '\b'
            h1.a(((Boolean)obj).booleanValue());
            return;

        case 9: // '\t'
            ((be)obj).a(h1);
            return;

        case 10: // '\n'
            h1.a((be)obj);
            return;

        case 11: // '\013'
            if (obj instanceof f)
            {
                h1.a((f)obj);
                return;
            } else
            {
                h1.a((String)obj);
                return;
            }

        case 12: // '\f'
            if (obj instanceof f)
            {
                h1.a((f)obj);
                return;
            } else
            {
                a1 = (byte[])obj;
                h1.k(a1.length);
                h1.b(a1);
                return;
            }

        case 13: // '\r'
            h1.d(((Integer)obj).intValue());
            return;

        case 14: // '\016'
            h1.f(((Integer)obj).intValue());
            return;

        case 15: // '\017'
            h1.d(((Long)obj).longValue());
            return;

        case 16: // '\020'
            h1.k(com.c.b.h.n(((Integer)obj).intValue()));
            return;

        case 17: // '\021'
            h1.e(com.c.b.h.g(((Long)obj).longValue()));
            return;

        case 18: // '\022'
            break;
        }
        if (obj instanceof au.a)
        {
            h1.e(((au.a)obj).a());
            return;
        } else
        {
            h1.e(((Integer)obj).intValue());
            return;
        }
    }

    private static void a(java.util.Map.Entry entry, h h1)
    {
        Object obj = (a)entry.getKey();
        if (((a) (obj)).g() == cd.b.i && !((a) (obj)).o() && !((a) (obj)).p())
        {
            obj = entry.getValue();
            if (obj instanceof aw)
            {
                obj = ((aw)obj).a();
            }
            h1.c(((a)entry.getKey()).e(), (be)obj);
            return;
        } else
        {
            a(((a) (obj)), entry.getValue(), h1);
            return;
        }
    }

    private static void a(Map map, java.util.Map.Entry entry)
    {
        a a1 = (a)entry.getKey();
        entry = ((java.util.Map.Entry) (entry.getValue()));
        if (entry instanceof aw)
        {
            map.put(a1, ((aw)entry).a());
            return;
        } else
        {
            map.put(a1, entry);
            return;
        }
    }

    private static boolean a(java.util.Map.Entry entry)
    {
label0:
        {
            a a1 = (a)entry.getKey();
            if (a1.g() != cd.b.i)
            {
                break label0;
            }
            if (a1.o())
            {
                entry = ((List)entry.getValue()).iterator();
                do
                {
                    if (!entry.hasNext())
                    {
                        break label0;
                    }
                } while (((be)entry.next()).a());
                return false;
            }
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof be)
            {
                if (!((be)entry).a())
                {
                    return false;
                }
            } else
            if (entry instanceof aw)
            {
                return true;
            } else
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(cd.a a1, Object obj)
    {
        switch (_cls1.b[a1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            ((Double)obj).doubleValue();
            return 8;

        case 2: // '\002'
            ((Float)obj).floatValue();
            return 4;

        case 3: // '\003'
            return com.c.b.h.f(((Long)obj).longValue());

        case 4: // '\004'
            return com.c.b.h.f(((Long)obj).longValue());

        case 5: // '\005'
            return com.c.b.h.i(((Integer)obj).intValue());

        case 6: // '\006'
            ((Long)obj).longValue();
            return 8;

        case 7: // '\007'
            ((Integer)obj).intValue();
            return 4;

        case 8: // '\b'
            ((Boolean)obj).booleanValue();
            return 1;

        case 9: // '\t'
            return ((be)obj).b();

        case 12: // '\f'
            if (obj instanceof f)
            {
                return com.c.b.h.b((f)obj);
            } else
            {
                a1 = (byte[])obj;
                return com.c.b.h.l(a1.length) + a1.length;
            }

        case 11: // '\013'
            if (obj instanceof f)
            {
                return com.c.b.h.b((f)obj);
            } else
            {
                return com.c.b.h.b((String)obj);
            }

        case 13: // '\r'
            return com.c.b.h.l(((Integer)obj).intValue());

        case 14: // '\016'
            ((Integer)obj).intValue();
            return 4;

        case 15: // '\017'
            ((Long)obj).longValue();
            return 8;

        case 16: // '\020'
            return com.c.b.h.l(com.c.b.h.n(((Integer)obj).intValue()));

        case 17: // '\021'
            return com.c.b.h.f(com.c.b.h.g(((Long)obj).longValue()));

        case 10: // '\n'
            if (obj instanceof aw)
            {
                return com.c.b.h.a((aw)obj);
            } else
            {
                return com.c.b.h.b((be)obj);
            }

        case 18: // '\022'
            break;
        }
        if (obj instanceof au.a)
        {
            return com.c.b.h.i(((au.a)obj).a());
        } else
        {
            return com.c.b.h.i(((Integer)obj).intValue());
        }
    }

    public static ar b()
    {
        return d;
    }

    private void b(java.util.Map.Entry entry)
    {
        a a1 = (a)entry.getKey();
        Object obj = entry.getValue();
        entry = ((java.util.Map.Entry) (obj));
        if (obj instanceof aw)
        {
            entry = ((aw)obj).a();
        }
        if (a1.o())
        {
            Object obj3 = b(a1);
            Object obj1 = obj3;
            if (obj3 == null)
            {
                obj1 = new ArrayList();
            }
            Object obj4;
            for (entry = ((List)entry).iterator(); entry.hasNext(); ((List)obj1).add(a(obj4)))
            {
                obj4 = entry.next();
            }

            a.a(a1, obj1);
            return;
        }
        if (a1.g() == cd.b.i)
        {
            Object obj2 = b(a1);
            if (obj2 == null)
            {
                a.a(a1, a(entry));
                return;
            } else
            {
                entry = a1.a(((be)obj2).v(), (be)entry).j();
                a.a(a1, entry);
                return;
            }
        } else
        {
            a.a(a1, a(entry));
            return;
        }
    }

    public static int c(a a1, Object obj)
    {
        cd.a a2;
        int k;
        int i1;
        int j1;
        i1 = 0;
        k = 0;
        a2 = a1.j();
        j1 = a1.e();
        if (!a1.o())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (!a1.p()) goto _L2; else goto _L1
_L1:
        for (a1 = ((List)obj).iterator(); a1.hasNext();)
        {
            k += b(a2, a1.next());
        }

        i1 = com.c.b.h.j(j1);
        i1 = com.c.b.h.l(k) + (i1 + k);
_L4:
        return i1;
_L2:
        a1 = ((List)obj).iterator();
        int l = i1;
        do
        {
            i1 = l;
            if (!a1.hasNext())
            {
                break;
            }
            l += a(a2, j1, a1.next());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return a(a2, j1, obj);
    }

    private static int c(java.util.Map.Entry entry)
    {
        a a1 = (a)entry.getKey();
        Object obj = entry.getValue();
        if (a1.g() == cd.b.i && !a1.o() && !a1.p())
        {
            if (obj instanceof aw)
            {
                int l = ((a)entry.getKey()).e();
                entry = (aw)obj;
                int k = com.c.b.h.j(1);
                l = com.c.b.h.e(2, l);
                int i1 = com.c.b.h.j(3);
                return com.c.b.h.a(entry) + i1 + (k * 2 + l);
            } else
            {
                return com.c.b.h.e(((a)entry.getKey()).e(), (be)obj);
            }
        } else
        {
            return c(a1, obj);
        }
    }

    public final void a(a a1, Object obj)
    {
        if (a1.o())
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arraylist = new ArrayList();
            arraylist.addAll((List)obj);
            Object obj1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); a(a1.j(), obj1))
            {
                obj1 = ((Iterator) (obj)).next();
            }

            obj = arraylist;
        } else
        {
            a(a1.j(), obj);
        }
        if (obj instanceof aw)
        {
            c = true;
        }
        a.a(a1, obj);
    }

    public final void a(ar ar1)
    {
        for (int k = 0; k < ar1.a.c(); k++)
        {
            b(ar1.a.b(k));
        }

        for (ar1 = ar1.a.d().iterator(); ar1.hasNext(); b((java.util.Map.Entry)ar1.next())) { }
    }

    public final void a(h h1)
    {
        for (int k = 0; k < a.c(); k++)
        {
            java.util.Map.Entry entry = a.b(k);
            a((a)entry.getKey(), entry.getValue(), h1);
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); a((a)entry1.getKey(), entry1.getValue(), h1))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

    }

    public final boolean a(a a1)
    {
        if (a1.o())
        {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return a.get(a1) != null;
    }

    public final Object b(a a1)
    {
        Object obj = a.get(a1);
        a1 = ((a) (obj));
        if (obj instanceof aw)
        {
            a1 = ((aw)obj).a();
        }
        return a1;
    }

    public final void b(a a1, Object obj)
    {
        if (!a1.o())
        {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(a1.j(), obj);
        Object obj1 = b(a1);
        if (obj1 == null)
        {
            obj1 = new ArrayList();
            a.a(a1, obj1);
            a1 = ((a) (obj1));
        } else
        {
            a1 = (List)obj1;
        }
        a1.add(obj);
    }

    public final void b(h h1)
    {
        for (int k = 0; k < a.c(); k++)
        {
            a(a.b(k), h1);
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); a((java.util.Map.Entry)iterator.next(), h1)) { }
    }

    public final void c()
    {
        if (b)
        {
            return;
        } else
        {
            a.a();
            b = true;
            return;
        }
    }

    public final void c(a a1)
    {
        a.remove(a1);
        if (a.isEmpty())
        {
            c = false;
        }
    }

    public final Object clone()
    {
        return e();
    }

    public final boolean d()
    {
        return b;
    }

    public final ar e()
    {
        ar ar1 = new ar();
        for (int k = 0; k < a.c(); k++)
        {
            java.util.Map.Entry entry = a.b(k);
            ar1.a((a)entry.getKey(), entry.getValue());
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); ar1.a((a)entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        ar1.c = c;
        return ar1;
    }

    public final Map f()
    {
        if (c)
        {
            bq bq1 = bq.a(16);
            for (int k = 0; k < a.c(); k++)
            {
                a(bq1, a.b(k));
            }

            for (Iterator iterator = a.d().iterator(); iterator.hasNext(); a(bq1, (java.util.Map.Entry)iterator.next())) { }
            if (a.b())
            {
                bq1.a();
            }
            return bq1;
        }
        if (a.b())
        {
            return a;
        } else
        {
            return Collections.unmodifiableMap(a);
        }
    }

    public final Iterator g()
    {
        if (c)
        {
            return new aw.b(a.entrySet().iterator());
        } else
        {
            return a.entrySet().iterator();
        }
    }

    public final boolean h()
    {
        for (int k = 0; k < a.c(); k++)
        {
            if (!a(a.b(k)))
            {
                return false;
            }
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            if (!a((java.util.Map.Entry)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

    public final int i()
    {
        int l = 0;
        int k = 0;
        for (; l < a.c(); l++)
        {
            java.util.Map.Entry entry = a.b(l);
            k += c((a)entry.getKey(), entry.getValue());
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            k += c((a)entry1.getKey(), entry1.getValue());
        }

        return k;
    }

    public final int j()
    {
        int l = 0;
        int k = 0;
        for (; l < a.c(); l++)
        {
            k += c(a.b(l));
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            k += c((java.util.Map.Entry)iterator.next());
        }

        return k;
    }

}
