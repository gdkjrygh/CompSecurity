// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, bb, bd, f

public static final class e
{
    private static interface a
    {

        public abstract bd.a a();

        public abstract Object a(as.a a1);

        public abstract Object a(as as1);

        public abstract void a(as.a a1, Object obj);

        public abstract Object b(as as1);

        public abstract void b(as.a a1, Object obj);

        public abstract boolean b(as.a a1);

        public abstract boolean c(as as1);
    }

    private static final class b
        implements a
    {

        private final ak.f a;
        private final bd b;

        private bb c(as.a a1)
        {
            a.e();
            throw new RuntimeException((new StringBuilder("No map fields found in ")).append(a1.getClass().getName()).toString());
        }

        private bb d(as.a a1)
        {
            a.e();
            throw new RuntimeException((new StringBuilder("No map fields found in ")).append(a1.getClass().getName()).toString());
        }

        private bb d(as as1)
        {
            a.e();
            throw new RuntimeException((new StringBuilder("No map fields found in ")).append(as1.getClass().getName()).toString());
        }

        public final bd.a a()
        {
            return b.u();
        }

        public final Object a(as.a a1)
        {
            ArrayList arraylist = new ArrayList();
            for (int k = 0; k < c(a1).a().size(); k++)
            {
                arraylist.add(c(a1).a().get(k));
            }

            return Collections.unmodifiableList(arraylist);
        }

        public final Object a(as as1)
        {
            ArrayList arraylist = new ArrayList();
            for (int k = 0; k < d(as1).a().size(); k++)
            {
                arraylist.add(d(as1).a().get(k));
            }

            return Collections.unmodifiableList(arraylist);
        }

        public final void a(as.a a1, Object obj)
        {
            d(a1).b().clear();
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); b(a1, ((Iterator) (obj)).next())) { }
        }

        public final Object b(as as1)
        {
            return a(as1);
        }

        public final void b(as.a a1, Object obj)
        {
            d(a1).b().add((bd)obj);
        }

        public final boolean b(as.a a1)
        {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
        }

        public final boolean c(as as1)
        {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
        }

        b(ak.f f1, Class class1)
        {
            a = f1;
            b = d((as)as.a(as.a(class1, "getDefaultInstance", new Class[0]), null, new Object[0])).c();
        }
    }

    private static final class c
    {

        private final ak.a a;
        private final Method b;
        private final Method c;
        private final Method d;

        c(ak.a a1, String s, Class class1, Class class2)
        {
            a = a1;
            b = as.a(class1, (new StringBuilder("get")).append(s).append("Case").toString(), new Class[0]);
            c = as.a(class2, (new StringBuilder("get")).append(s).append("Case").toString(), new Class[0]);
            d = as.a(class2, (new StringBuilder("clear")).append(s).toString(), new Class[0]);
        }
    }

    private static final class d extends e
    {

        private ak.d k;
        private final Method l;
        private final Method m;
        private boolean n;
        private Method o;
        private Method p;
        private Method q;
        private Method r;

        public final Object a(as.a a1)
        {
            ArrayList arraylist = new ArrayList();
            int j1 = c(a1);
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist.add(a(a1, i1));
            }

            return Collections.unmodifiableList(arraylist);
        }

        public final Object a(as.a a1, int i1)
        {
            if (n)
            {
                i1 = ((Integer)as.a(p, a1, new Object[] {
                    Integer.valueOf(i1)
                })).intValue();
                return k.b(i1);
            } else
            {
                return as.a(m, super.a(a1, i1), new Object[0]);
            }
        }

        public final Object a(as as1)
        {
            ArrayList arraylist = new ArrayList();
            int j1 = d(as1);
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist.add(a(as1, i1));
            }

            return Collections.unmodifiableList(arraylist);
        }

        public final Object a(as as1, int i1)
        {
            if (n)
            {
                i1 = ((Integer)as.a(o, as1, new Object[] {
                    Integer.valueOf(i1)
                })).intValue();
                return k.b(i1);
            } else
            {
                return as.a(m, super.a(as1, i1), new Object[0]);
            }
        }

        public final void b(as.a a1, Object obj)
        {
            if (n)
            {
                as.a(r, a1, new Object[] {
                    Integer.valueOf(((ak.e)obj).a())
                });
                return;
            } else
            {
                super.b(a1, as.a(l, null, new Object[] {
                    obj
                }));
                return;
            }
        }

        d(ak.f f1, String s, Class class1, Class class2)
        {
            super(s, class1, class2);
            k = f1.x();
            l = as.a(a, "valueOf", new Class[] {
                com/c/b/ak$e
            });
            m = as.a(a, "getValueDescriptor", new Class[0]);
            n = f1.d().l();
            if (n)
            {
                o = as.a(class1, (new StringBuilder("get")).append(s).append("Value").toString(), new Class[] {
                    Integer.TYPE
                });
                p = as.a(class2, (new StringBuilder("get")).append(s).append("Value").toString(), new Class[] {
                    Integer.TYPE
                });
                q = as.a(class2, (new StringBuilder("set")).append(s).append("Value").toString(), new Class[] {
                    Integer.TYPE, Integer.TYPE
                });
                r = as.a(class2, (new StringBuilder("add")).append(s).append("Value").toString(), new Class[] {
                    Integer.TYPE
                });
            }
        }
    }

    private static class e
        implements a
    {

        protected final Class a;
        protected final Method b;
        protected final Method c;
        protected final Method d;
        protected final Method e;
        protected final Method f;
        protected final Method g;
        protected final Method h;
        protected final Method i;
        protected final Method j;

        public bd.a a()
        {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
        }

        public Object a(as.a a1)
        {
            return as.a(c, a1, new Object[0]);
        }

        public Object a(as.a a1, int k)
        {
            return as.a(e, a1, new Object[] {
                Integer.valueOf(k)
            });
        }

        public Object a(as as1)
        {
            return as.a(b, as1, new Object[0]);
        }

        public Object a(as as1, int k)
        {
            return as.a(d, as1, new Object[] {
                Integer.valueOf(k)
            });
        }

        public final void a(as.a a1, Object obj)
        {
            as.a(j, a1, new Object[0]);
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); b(a1, ((Iterator) (obj)).next())) { }
        }

        public final Object b(as as1)
        {
            return a(as1);
        }

        public void b(as.a a1, Object obj)
        {
            as.a(g, a1, new Object[] {
                obj
            });
        }

        public final boolean b(as.a a1)
        {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
        }

        public final int c(as.a a1)
        {
            return ((Integer)as.a(i, a1, new Object[0])).intValue();
        }

        public final boolean c(as as1)
        {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
        }

        public final int d(as as1)
        {
            return ((Integer)as.a(h, as1, new Object[0])).intValue();
        }

        e(String s, Class class1, Class class2)
        {
            b = as.a(class1, (new StringBuilder("get")).append(s).append("List").toString(), new Class[0]);
            c = as.a(class2, (new StringBuilder("get")).append(s).append("List").toString(), new Class[0]);
            d = as.a(class1, (new StringBuilder("get")).append(s).toString(), new Class[] {
                Integer.TYPE
            });
            e = as.a(class2, (new StringBuilder("get")).append(s).toString(), new Class[] {
                Integer.TYPE
            });
            a = d.getReturnType();
            f = as.a(class2, (new StringBuilder("set")).append(s).toString(), new Class[] {
                Integer.TYPE, a
            });
            g = as.a(class2, (new StringBuilder("add")).append(s).toString(), new Class[] {
                a
            });
            h = as.a(class1, (new StringBuilder("get")).append(s).append("Count").toString(), new Class[0]);
            i = as.a(class2, (new StringBuilder("get")).append(s).append("Count").toString(), new Class[0]);
            j = as.a(class2, (new StringBuilder("clear")).append(s).toString(), new Class[0]);
        }
    }

    private static final class f extends e
    {

        private final Method k;
        private final Method l;

        public final bd.a a()
        {
            return (bd.a)as.a(k, null, new Object[0]);
        }

        public final void b(as.a a1, Object obj)
        {
            if (!a.isInstance(obj))
            {
                obj = ((bd.a)as.a(k, null, new Object[0])).c((bd)obj).i();
            }
            super.b(a1, obj);
        }

        f(String s, Class class1, Class class2)
        {
            super(s, class1, class2);
            k = as.a(a, "newBuilder", new Class[0]);
            l = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[] {
                Integer.TYPE
            });
        }
    }

    private static final class g extends h
    {

        private ak.d m;
        private Method n;
        private Method o;
        private boolean p;
        private Method q;
        private Method r;
        private Method s;

        public final Object a(as.a a1)
        {
            if (p)
            {
                int k = ((Integer)as.a(r, a1, new Object[0])).intValue();
                return m.b(k);
            } else
            {
                return as.a(o, super.a(a1), new Object[0]);
            }
        }

        public final Object a(as as1)
        {
            if (p)
            {
                int k = ((Integer)as.a(q, as1, new Object[0])).intValue();
                return m.b(k);
            } else
            {
                return as.a(o, super.a(as1), new Object[0]);
            }
        }

        public final void a(as.a a1, Object obj)
        {
            if (p)
            {
                as.a(s, a1, new Object[] {
                    Integer.valueOf(((ak.e)obj).a())
                });
                return;
            } else
            {
                super.a(a1, as.a(n, null, new Object[] {
                    obj
                }));
                return;
            }
        }

        g(ak.f f1, String s1, Class class1, Class class2, String s2)
        {
            super(f1, s1, class1, class2, s2);
            m = f1.x();
            n = as.a(a, "valueOf", new Class[] {
                com/c/b/ak$e
            });
            o = as.a(a, "getValueDescriptor", new Class[0]);
            p = f1.d().l();
            if (p)
            {
                q = as.a(class1, (new StringBuilder("get")).append(s1).append("Value").toString(), new Class[0]);
                r = as.a(class2, (new StringBuilder("get")).append(s1).append("Value").toString(), new Class[0]);
                s = as.a(class2, (new StringBuilder("set")).append(s1).append("Value").toString(), new Class[] {
                    Integer.TYPE
                });
            }
        }
    }

    private static class h
        implements a
    {

        protected final Class a;
        protected final Method b;
        protected final Method c;
        protected final Method d;
        protected final Method e;
        protected final Method f;
        protected final Method g;
        protected final Method h;
        protected final Method i;
        protected final ak.f j;
        protected final boolean k;
        protected final boolean l;

        public bd.a a()
        {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
        }

        public Object a(as.a a1)
        {
            return as.a(c, a1, new Object[0]);
        }

        public Object a(as as1)
        {
            return as.a(b, as1, new Object[0]);
        }

        public void a(as.a a1, Object obj)
        {
            as.a(d, a1, new Object[] {
                obj
            });
        }

        public Object b(as as1)
        {
            return a(as1);
        }

        public final void b(as.a a1, Object obj)
        {
            throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
        }

        public final boolean b(as.a a1)
        {
            if (!l)
            {
                if (k)
                {
                    return ((au.a)as.a(i, a1, new Object[0])).a() == j.e();
                }
                return !a(a1).equals(j.r());
            } else
            {
                return ((Boolean)as.a(f, a1, new Object[0])).booleanValue();
            }
        }

        public final boolean c(as as1)
        {
            if (!l)
            {
                if (k)
                {
                    return ((au.a)as.a(h, as1, new Object[0])).a() == j.e();
                }
                return !a(as1).equals(j.r());
            } else
            {
                return ((Boolean)as.a(e, as1, new Object[0])).booleanValue();
            }
        }

        h(ak.f f1, String s, Class class1, Class class2, String s1)
        {
            Object obj = null;
            super();
            j = f1;
            boolean flag;
            boolean flag1;
            if (f1.u() != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            k = flag1;
            if (f1.d().k() == ak.g.b.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || !k && f1.f() == ak.f.a.i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l = flag1;
            b = as.a(class1, (new StringBuilder("get")).append(s).toString(), new Class[0]);
            c = as.a(class2, (new StringBuilder("get")).append(s).toString(), new Class[0]);
            a = b.getReturnType();
            d = as.a(class2, (new StringBuilder("set")).append(s).toString(), new Class[] {
                a
            });
            if (l)
            {
                f1 = as.a(class1, (new StringBuilder("has")).append(s).toString(), new Class[0]);
            } else
            {
                f1 = null;
            }
            e = f1;
            if (l)
            {
                f1 = as.a(class2, (new StringBuilder("has")).append(s).toString(), new Class[0]);
            } else
            {
                f1 = null;
            }
            f = f1;
            g = as.a(class2, (new StringBuilder("clear")).append(s).toString(), new Class[0]);
            if (k)
            {
                f1 = as.a(class1, (new StringBuilder("get")).append(s1).append("Case").toString(), new Class[0]);
            } else
            {
                f1 = null;
            }
            h = f1;
            f1 = obj;
            if (k)
            {
                f1 = as.a(class2, (new StringBuilder("get")).append(s1).append("Case").toString(), new Class[0]);
            }
            i = f1;
        }
    }

    private static final class i extends h
    {

        private final Method m;
        private final Method n;

        public final bd.a a()
        {
            return (bd.a)as.a(m, null, new Object[0]);
        }

        public final void a(as.a a1, Object obj)
        {
            if (!a.isInstance(obj))
            {
                obj = ((bd.a)as.a(m, null, new Object[0])).c((bd)obj).h();
            }
            super.a(a1, obj);
        }

        i(ak.f f1, String s, Class class1, Class class2, String s1)
        {
            super(f1, s, class1, class2, s1);
            m = as.a(a, "newBuilder", new Class[0]);
            n = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[0]);
        }
    }

    private static final class j extends h
    {

        private final Method m;
        private final Method n;
        private final Method o;

        public final void a(as.a a1, Object obj)
        {
            if (obj instanceof com.c.b.f)
            {
                as.a(o, a1, new Object[] {
                    obj
                });
                return;
            } else
            {
                super.a(a1, obj);
                return;
            }
        }

        public final Object b(as as1)
        {
            return as.a(m, as1, new Object[0]);
        }

        j(ak.f f1, String s, Class class1, Class class2, String s1)
        {
            super(f1, s, class1, class2, s1);
            m = as.a(class1, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
            n = as.a(class2, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
            o = as.a(class2, (new StringBuilder("set")).append(s).append("Bytes").toString(), new Class[] {
                com/c/b/f
            });
        }
    }


    private final c a;
    private final a b[];
    private String c[];
    private final c d[];
    private volatile boolean e;

    static lect.Method a(lect.Method method)
    {
        return method.a;
    }

    static a a(a a1, a a2)
    {
        if (a2.t() != a1.a)
        {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (a2.s())
        {
            throw new IllegalArgumentException("This type does not have extensions.");
        } else
        {
            return a1.b[a2.a()];
        }
    }

    public final ss a(Class class1, Class class2)
    {
        if (e)
        {
            return this;
        }
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        int l = b.length;
        int k = 0;
_L11:
        if (k >= l) goto _L2; else goto _L1
_L1:
        String s;
        ss ss;
        ss = (b)a.f().get(k);
        if (ss.u() == null)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        s = c[ss.u().a() + l];
_L9:
        if (!ss.o()) goto _L4; else goto _L3
_L3:
        if (ss.f() != a.i) goto _L6; else goto _L5
_L5:
        if (ss.l())
        {
            b[k] = new b(ss, class1);
            break MISSING_BLOCK_LABEL_450;
        }
        b[k] = new f(c[k], class1, class2);
        break MISSING_BLOCK_LABEL_450;
_L6:
        if (ss.f() == a.h)
        {
            b[k] = new d(ss, c[k], class1, class2);
            break MISSING_BLOCK_LABEL_450;
        }
        b[k] = new e(c[k], class1, class2);
        break MISSING_BLOCK_LABEL_450;
_L4:
        if (ss.f() == a.i)
        {
            b[k] = new i(ss, c[k], class1, class2, s);
            break MISSING_BLOCK_LABEL_450;
        }
        if (ss.f() == a.h)
        {
            b[k] = new g(ss, c[k], class1, class2, s);
            break MISSING_BLOCK_LABEL_450;
        }
        if (ss.f() == a.f)
        {
            b[k] = new j(ss, c[k], class1, class2, s);
            break MISSING_BLOCK_LABEL_450;
        }
        b[k] = new h(ss, c[k], class1, class2, s);
        break MISSING_BLOCK_LABEL_450;
_L2:
        int i1 = d.length;
        k = 0;
_L8:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        d[k] = new c(a, c[k + l], class1, class2);
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        e = true;
        c = null;
        this;
        JVM INSTR monitorexit ;
        return this;
        s = null;
          goto _L9
        k++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public ing(ing ing, String as1[])
    {
        a = ing;
        c = as1;
        b = new a[ing.f().size()];
        d = new c[ing.g().size()];
        e = false;
    }
}
