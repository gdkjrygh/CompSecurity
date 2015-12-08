// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            v, f, l, z, 
//            s, q, d, n, 
//            e

public final class i
{
    public static interface a
        extends Comparable
    {

        public abstract int a();

        public abstract q.a a(q.a a1, q q1);

        public abstract s a(s s1);

        public abstract z.a b();

        public abstract z.b c();

        public abstract boolean d();

        public abstract boolean e();
    }


    private static final i d = new i((byte)0);
    public final v a;
    boolean b;
    boolean c;

    private i()
    {
        c = false;
        a = v.a(16);
    }

    private i(byte byte0)
    {
        c = false;
        a = v.a(0);
        b();
    }

    private static int a(z.a a1, int j, Object obj)
    {
        int k = f.i(j);
        j = k;
        if (a1 == z.a.j)
        {
            l.a();
            j = k * 2;
        }
        return j + b(a1, obj);
    }

    static int a(z.a a1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return a1.t;
        }
    }

    public static i a()
    {
        return new i();
    }

    public static Object a(e e, z.a a1)
    {
        return z.a(e, a1, z.c.a);
    }

    private static Object a(Object obj)
    {
        Object obj1;
        if (obj instanceof s)
        {
            obj1 = ((s)obj).b();
        } else
        {
            obj1 = obj;
            if (obj instanceof byte[])
            {
                obj = (byte[])obj;
                byte abyte0[] = new byte[obj.length];
                System.arraycopy(obj, 0, abyte0, 0, obj.length);
                return abyte0;
            }
        }
        return obj1;
    }

    private static void a(f f1, z.a a1, int j, Object obj)
    {
        if (a1 == z.a.j)
        {
            l.a();
            a1 = (q)obj;
            f1.a(j, 3);
            a1.a(f1);
            f1.a(j, 4);
            return;
        } else
        {
            f1.a(j, a(a1, false));
            a(f1, a1, obj);
            return;
        }
    }

    private static void a(f f1, z.a a1, Object obj)
    {
        static final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[z.a.values().length];
                try
                {
                    b[z.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    b[z.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    b[z.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    b[z.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[z.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[z.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[z.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[z.a.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[z.a.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[z.a.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[z.a.i.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[z.a.l.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[z.a.m.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[z.a.o.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[z.a.p.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[z.a.q.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[z.a.r.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[z.a.n.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                a = new int[z.b.values().length];
                try
                {
                    a[z.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[z.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[z.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[z.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[z.b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[z.b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[z.b.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[z.b.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[z.b.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.b[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            f1.e(Double.doubleToRawLongBits(((Double)obj).doubleValue()));
            return;

        case 2: // '\002'
            f1.l(Float.floatToRawIntBits(((Float)obj).floatValue()));
            return;

        case 3: // '\003'
            f1.d(((Long)obj).longValue());
            return;

        case 4: // '\004'
            f1.d(((Long)obj).longValue());
            return;

        case 5: // '\005'
            f1.a(((Integer)obj).intValue());
            return;

        case 6: // '\006'
            f1.e(((Long)obj).longValue());
            return;

        case 7: // '\007'
            f1.l(((Integer)obj).intValue());
            return;

        case 8: // '\b'
            int j;
            if (((Boolean)obj).booleanValue())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            f1.h(j);
            return;

        case 9: // '\t'
            ((q)obj).a(f1);
            return;

        case 10: // '\n'
            f1.a((q)obj);
            return;

        case 11: // '\013'
            if (obj instanceof d)
            {
                f1.a((d)obj);
                return;
            } else
            {
                f1.b((String)obj);
                return;
            }

        case 12: // '\f'
            if (obj instanceof d)
            {
                f1.a((d)obj);
                return;
            } else
            {
                a1 = (byte[])obj;
                f1.j(a1.length);
                f1.c(a1);
                return;
            }

        case 13: // '\r'
            f1.j(((Integer)obj).intValue());
            return;

        case 14: // '\016'
            f1.l(((Integer)obj).intValue());
            return;

        case 15: // '\017'
            f1.e(((Long)obj).longValue());
            return;

        case 16: // '\020'
            f1.j(f.m(((Integer)obj).intValue()));
            return;

        case 17: // '\021'
            f1.d(f.f(((Long)obj).longValue()));
            return;

        case 18: // '\022'
            break;
        }
        if (obj instanceof l.a)
        {
            f1.a(((l.a)obj).a());
            return;
        } else
        {
            f1.a(((Integer)obj).intValue());
            return;
        }
    }

    public static void a(a a1, Object obj, f f1)
    {
        z.a a2;
        int j;
label0:
        {
            a2 = a1.b();
            j = a1.a();
            if (a1.d())
            {
                obj = (List)obj;
                if (a1.e())
                {
                    f1.a(j, 2);
                    j = 0;
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext();)
                    {
                        j += b(a2, a1.next());
                    }

                    f1.j(j);
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext(); a(f1, a2, a1.next())) { }
                } else
                {
                    for (a1 = ((List) (obj)).iterator(); a1.hasNext(); a(f1, a2, j, a1.next())) { }
                }
            } else
            {
                if (!(obj instanceof n))
                {
                    break label0;
                }
                a(f1, a2, j, ((n)obj).b());
            }
            return;
        }
        a(f1, a2, j, obj);
    }

    private static void a(z.a a1, Object obj)
    {
        boolean flag;
        flag = false;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        _cls1.a[a1.s.ordinal()];
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
        if ((obj instanceof d) || (obj instanceof byte[]))
        {
            flag = true;
        }
          goto _L11
_L9:
        if ((obj instanceof Integer) || (obj instanceof l.a))
        {
            flag = true;
        }
          goto _L11
        if ((obj instanceof q) || (obj instanceof n))
        {
            flag = true;
        }
          goto _L11
    }

    static boolean a(java.util.Map.Entry entry)
    {
label0:
        {
            a a1 = (a)entry.getKey();
            if (a1.c() != z.b.i)
            {
                break label0;
            }
            if (a1.d())
            {
                entry = ((List)entry.getValue()).iterator();
                do
                {
                    if (!entry.hasNext())
                    {
                        break label0;
                    }
                } while (((q)entry.next()).j());
                return false;
            }
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof q)
            {
                if (!((q)entry).j())
                {
                    return false;
                }
            } else
            if (entry instanceof n)
            {
                return true;
            } else
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(z.a a1, Object obj)
    {
        switch (_cls1.b[a1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            ((Double)obj).doubleValue();
            return f.a();

        case 2: // '\002'
            ((Float)obj).floatValue();
            return f.b();

        case 3: // '\003'
            return f.b(((Long)obj).longValue());

        case 4: // '\004'
            return f.a(((Long)obj).longValue());

        case 5: // '\005'
            return f.d(((Integer)obj).intValue());

        case 6: // '\006'
            ((Long)obj).longValue();
            return f.c();

        case 7: // '\007'
            ((Integer)obj).intValue();
            return f.d();

        case 8: // '\b'
            ((Boolean)obj).booleanValue();
            return f.e();

        case 9: // '\t'
            return f.b((q)obj);

        case 12: // '\f'
            if (obj instanceof d)
            {
                return f.b((d)obj);
            } else
            {
                return f.b((byte[])obj);
            }

        case 11: // '\013'
            if (obj instanceof d)
            {
                return f.b((d)obj);
            } else
            {
                return f.d((String)obj);
            }

        case 13: // '\r'
            return f.e(((Integer)obj).intValue());

        case 14: // '\016'
            ((Integer)obj).intValue();
            return f.f();

        case 15: // '\017'
            ((Long)obj).longValue();
            return f.g();

        case 16: // '\020'
            return f.g(((Integer)obj).intValue());

        case 17: // '\021'
            return f.c(((Long)obj).longValue());

        case 10: // '\n'
            if (obj instanceof n)
            {
                return f.a((n)obj);
            } else
            {
                return f.c((q)obj);
            }

        case 18: // '\022'
            break;
        }
        if (obj instanceof l.a)
        {
            return f.f(((l.a)obj).a());
        } else
        {
            return f.f(((Integer)obj).intValue());
        }
    }

    public static int c(a a1, Object obj)
    {
        z.a a2;
        int j;
        int i1;
        int j1;
        i1 = 0;
        j = 0;
        a2 = a1.b();
        j1 = a1.a();
        if (!a1.d())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (!a1.e()) goto _L2; else goto _L1
_L1:
        for (a1 = ((List)obj).iterator(); a1.hasNext();)
        {
            j += b(a2, a1.next());
        }

        i1 = f.i(j1);
        i1 = f.k(j) + (i1 + j);
_L4:
        return i1;
_L2:
        a1 = ((List)obj).iterator();
        int k = i1;
        do
        {
            i1 = k;
            if (!a1.hasNext())
            {
                break;
            }
            k += a(a2, j1, a1.next());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return a(a2, j1, obj);
    }

    public static int c(java.util.Map.Entry entry)
    {
        a a1 = (a)entry.getKey();
        Object obj = entry.getValue();
        if (a1.c() == z.b.i && !a1.d() && !a1.e())
        {
            if (obj instanceof n)
            {
                return f.b(((a)entry.getKey()).a(), (n)obj);
            } else
            {
                return f.a(((a)entry.getKey()).a(), (q)obj);
            }
        } else
        {
            return c(a1, obj);
        }
    }

    public final Object a(a a1)
    {
        Object obj = a.get(a1);
        a1 = ((a) (obj));
        if (obj instanceof n)
        {
            a1 = ((n)obj).b();
        }
        return a1;
    }

    public final void a(a a1, Object obj)
    {
        if (a1.d())
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arraylist = new ArrayList();
            arraylist.addAll((List)obj);
            Object obj1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); a(a1.b(), obj1))
            {
                obj1 = ((Iterator) (obj)).next();
            }

            obj = arraylist;
        } else
        {
            a(a1.b(), obj);
        }
        if (obj instanceof n)
        {
            c = true;
        }
        a.a(a1, obj);
    }

    public final void b()
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

    public final void b(a a1, Object obj)
    {
        if (!a1.d())
        {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(a1.b(), obj);
        Object obj1 = a(a1);
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

    final void b(java.util.Map.Entry entry)
    {
        a a1 = (a)entry.getKey();
        Object obj = entry.getValue();
        entry = ((java.util.Map.Entry) (obj));
        if (obj instanceof n)
        {
            entry = ((n)obj).b();
        }
        if (a1.d())
        {
            Object obj3 = a(a1);
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
        if (a1.c() == z.b.i)
        {
            Object obj2 = a(a1);
            if (obj2 == null)
            {
                a.a(a1, a(entry));
                return;
            }
            if (obj2 instanceof s)
            {
                entry = a1.a((s)obj2);
            } else
            {
                entry = a1.a(((q)obj2).l(), (q)entry).g();
            }
            a.a(a1, entry);
            return;
        } else
        {
            a.a(a1, a(entry));
            return;
        }
    }

    public final i c()
    {
        i j = new i();
        for (int k = 0; k < a.b(); k++)
        {
            java.util.Map.Entry entry = a.b(k);
            j.a((a)entry.getKey(), entry.getValue());
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); j.a((a)entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        j.c = c;
        return j;
    }

    public final Object clone()
    {
        return c();
    }

}
