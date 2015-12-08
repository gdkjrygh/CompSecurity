// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.c.b:
//            a, by, bh, bd, 
//            h, g, aq, bk, 
//            ar, al, aw, bg, 
//            bb, f, an, bl, 
//            at, be

public abstract class as extends com.c.b.a
    implements Serializable
{
    public static abstract class a extends a.a
    {

        private b a;
        private a b;
        private boolean c;
        private by d;

        static Map a(a a1)
        {
            return a1.r();
        }

        private Map r()
        {
            TreeMap treemap = new TreeMap();
            Iterator iterator = g.a(d()).f().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ak.f f1 = (ak.f)iterator.next();
                if (f1.o())
                {
                    List list = (List)b(f1);
                    if (!list.isEmpty())
                    {
                        treemap.put(f1, list);
                    }
                } else
                if (a(f1))
                {
                    treemap.put(f1, b(f1));
                }
            } while (true);
            return treemap;
        }

        public a.a a(by by1)
        {
            return d(by1);
        }

        public bd.a a(ak.f f1, Object obj)
        {
            return d(f1, obj);
        }

        public boolean a()
        {
            Iterator iterator = e().f().iterator();
_L2:
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_134;
                }
                obj = (ak.f)iterator.next();
                if (((ak.f) (obj)).m() && !a(((ak.f) (obj))))
                {
                    return false;
                }
            } while (((ak.f) (obj)).f() != ak.f.a.i);
            if (!((ak.f) (obj)).o())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = ((List)b(((ak.f) (obj)))).iterator();
_L4:
            if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
            if (((bd)((Iterator) (obj)).next()).a()) goto _L4; else goto _L3
_L3:
            return false;
            if (!a(((ak.f) (obj))) || ((bd)b(((ak.f) (obj)))).a()) goto _L2; else goto _L5
_L5:
            return false;
            return true;
        }

        public boolean a(ak.f f1)
        {
            return g.a(d(), f1).b(this);
        }

        public a.a b()
        {
            return o();
        }

        public bd.a b(ak.f f1, Object obj)
        {
            return c(f1, obj);
        }

        public bd.a b(by by1)
        {
            return c(by1);
        }

        public Object b(ak.f f1)
        {
            Object obj1 = g.a(d(), f1).a(this);
            Object obj = obj1;
            if (f1.o())
            {
                obj = Collections.unmodifiableList((List)obj1);
            }
            return obj;
        }

        public a c(ak.f f1, Object obj)
        {
            g.a(d(), f1).a(this, obj);
            return this;
        }

        public a c(by by1)
        {
            d = by1;
            q();
            return this;
        }

        public b.a c()
        {
            return o();
        }

        public final bd.a c(ak.f f1)
        {
            return g.a(d(), f1).a();
        }

        public Object clone()
        {
            return o();
        }

        public a d(ak.f f1, Object obj)
        {
            g.a(d(), f1).b(this, obj);
            return this;
        }

        public a d(by by1)
        {
            d = by.a(d).a(by1).b();
            q();
            return this;
        }

        protected abstract g d();

        public Map d_()
        {
            return Collections.unmodifiableMap(r());
        }

        public ak.a e()
        {
            return g.a(d());
        }

        public final by f()
        {
            return d;
        }

        final void k()
        {
            a = null;
        }

        protected final void l()
        {
            if (a != null)
            {
                c = true;
            }
        }

        protected final void m()
        {
            c = true;
        }

        protected final boolean n()
        {
            return c;
        }

        public a o()
        {
            a a1 = (a)w().u();
            a1.a(h());
            return a1;
        }

        protected final b p()
        {
            if (b == null)
            {
                b = new a(this, (byte)0);
            }
            return b;
        }

        protected final void q()
        {
            if (c && a != null)
            {
                a.a();
                c = false;
            }
        }

        protected a()
        {
            this(null);
        }

        protected a(b b1)
        {
            d = by.e();
            a = b1;
        }
    }

    private final class a.a
        implements b
    {

        final a a;

        public final void a()
        {
            a.q();
        }

        private a.a(a a1)
        {
            a = a1;
            super();
        }

        a.a(a a1, byte byte0)
        {
            this(a1);
        }
    }

    protected static interface b
    {

        public abstract void a();
    }

    public static abstract class c extends a
        implements e
    {

        private ar a;

        static ar a(c c1)
        {
            c1.a.c();
            return c1.a;
        }

        private void d(ak.f f1)
        {
            if (f1.t() != e())
            {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else
            {
                return;
            }
        }

        private c e(ak.f f1, Object obj)
        {
            if (f1.s())
            {
                d(f1);
                s();
                a.a(f1, obj);
                q();
                return this;
            } else
            {
                return (c)super.c(f1, obj);
            }
        }

        private c f(ak.f f1, Object obj)
        {
            if (f1.s())
            {
                d(f1);
                s();
                a.b(f1, obj);
                q();
                return this;
            } else
            {
                return (c)super.d(f1, obj);
            }
        }

        private void s()
        {
            if (a.d())
            {
                a = a.e();
            }
        }

        public final bd.a a(ak.f f1, Object obj)
        {
            return f(f1, obj);
        }

        protected final void a(d d1)
        {
            s();
            a.a(d.a(d1));
            q();
        }

        public boolean a()
        {
            return super.a() && a.h();
        }

        public final boolean a(ak.f f1)
        {
            if (f1.s())
            {
                d(f1);
                return a.a(f1);
            } else
            {
                return super.a(f1);
            }
        }

        public final a.a b()
        {
            return (c)super.o();
        }

        public final bd.a b(ak.f f1, Object obj)
        {
            return e(f1, obj);
        }

        public final Object b(ak.f f1)
        {
label0:
            {
label1:
                {
                    if (!f1.s())
                    {
                        break label0;
                    }
                    d(f1);
                    Object obj1 = a.b(f1);
                    Object obj = obj1;
                    if (obj1 == null)
                    {
                        if (f1.f() != ak.f.a.i)
                        {
                            break label1;
                        }
                        obj = al.a(f1.w());
                    }
                    return obj;
                }
                return f1.r();
            }
            return super.b(f1);
        }

        public final a c(ak.f f1, Object obj)
        {
            return e(f1, obj);
        }

        public final b.a c()
        {
            return (c)super.o();
        }

        public Object clone()
        {
            return (c)super.o();
        }

        public final a d(ak.f f1, Object obj)
        {
            return f(f1, obj);
        }

        public final Map d_()
        {
            Map map = a.a(this);
            map.putAll(a.f());
            return Collections.unmodifiableMap(map);
        }

        public final volatile a o()
        {
            return (c)super.o();
        }

        protected final boolean r()
        {
            return a.h();
        }

        protected c()
        {
            a = ar.b();
        }

        protected c(b b1)
        {
            super(b1);
            a = ar.b();
        }
    }

    public static abstract class d extends as
        implements e
    {

        private final ar c;

        static ar a(d d1)
        {
            return d1.c;
        }

        private void c(ak.f f1)
        {
            if (f1.t() != e())
            {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else
            {
                return;
            }
        }

        public final Map K()
        {
            Map map = as.a(this);
            map.putAll(c.f());
            return Collections.unmodifiableMap(map);
        }

        protected final void L()
        {
            c.c();
        }

        protected final boolean M()
        {
            return c.h();
        }

        protected final a N()
        {
            return new a(this, (byte)0);
        }

        protected final int O()
        {
            return c.i();
        }

        public boolean a()
        {
            return a() && c.h();
        }

        public final boolean a(ak.f f1)
        {
            if (f1.s())
            {
                c(f1);
                return c.a(f1);
            } else
            {
                return a(f1);
            }
        }

        protected final boolean a(com.c.b.g g1, by.a a1, aq aq, int k)
        {
            return bh.a(g1, a1, aq, e(), new bh.b(c), k);
        }

        public final Object b(ak.f f1)
        {
label0:
            {
label1:
                {
                    if (!f1.s())
                    {
                        break label0;
                    }
                    c(f1);
                    Object obj1 = c.b(f1);
                    Object obj = obj1;
                    if (obj1 == null)
                    {
                        if (f1.f() != ak.f.a.i)
                        {
                            break label1;
                        }
                        obj = al.a(f1.w());
                    }
                    return obj;
                }
                return f1.r();
            }
            return b(f1);
        }

        public final Map d_()
        {
            Map map = as.a(this);
            map.putAll(c.f());
            return Collections.unmodifiableMap(map);
        }

        protected d()
        {
            c = ar.a();
        }

        protected d(c c1)
        {
            super(c1);
            c = c.a(c1);
        }
    }

    protected final class d.a
    {

        final d a;
        private final Iterator b;
        private java.util.Map.Entry c;
        private final boolean d;

        public final void a(com.c.b.h h1)
        {
            while (c != null && ((ak.f)c.getKey()).e() < 0x20000000) 
            {
                ak.f f1 = (ak.f)c.getKey();
                if (d && f1.g() == cd.b.i && !f1.o())
                {
                    if (c instanceof aw.a)
                    {
                        h1.b(f1.e(), ((aw.a)c).a().c());
                    } else
                    {
                        h1.c(f1.e(), (bd)c.getValue());
                    }
                } else
                {
                    ar.a(f1, c.getValue(), h1);
                }
                if (b.hasNext())
                {
                    c = (java.util.Map.Entry)b.next();
                } else
                {
                    c = null;
                }
            }
        }

        private d.a(d d1)
        {
            a = d1;
            super();
            b = d.a(a).g();
            if (b.hasNext())
            {
                c = (java.util.Map.Entry)b.next();
            }
            d = false;
        }

        d.a(d d1, byte byte0)
        {
            this(d1);
        }
    }

    public static interface e
        extends bg
    {
    }

    static interface f
    {

        public abstract ak.f a();
    }

    public static final class g
    {

        private final ak.a a;
        private final a b[];
        private String c[];
        private final c d[];
        private volatile boolean e;

        static ak.a a(g g1)
        {
            return g1.a;
        }

        static a a(g g1, ak.f f1)
        {
            if (f1.t() != g1.a)
            {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (f1.s())
            {
                throw new IllegalArgumentException("This type does not have extensions.");
            } else
            {
                return g1.b[f1.a()];
            }
        }

        public final g a(Class class1, Class class2)
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
            ak.f f1;
            f1 = (ak.f)a.f().get(k);
            if (f1.u() == null)
            {
                break MISSING_BLOCK_LABEL_445;
            }
            s = c[f1.u().a() + l];
_L9:
            if (!f1.o()) goto _L4; else goto _L3
_L3:
            if (f1.f() != ak.f.a.i) goto _L6; else goto _L5
_L5:
            if (f1.l())
            {
                b[k] = new b(f1, class1);
                break MISSING_BLOCK_LABEL_450;
            }
            b[k] = new f(c[k], class1, class2);
            break MISSING_BLOCK_LABEL_450;
_L6:
            if (f1.f() == ak.f.a.h)
            {
                b[k] = new d(f1, c[k], class1, class2);
                break MISSING_BLOCK_LABEL_450;
            }
            b[k] = new e(c[k], class1, class2);
            break MISSING_BLOCK_LABEL_450;
_L4:
            if (f1.f() == ak.f.a.i)
            {
                b[k] = new i(f1, c[k], class1, class2, s);
                break MISSING_BLOCK_LABEL_450;
            }
            if (f1.f() == ak.f.a.h)
            {
                b[k] = new g(f1, c[k], class1, class2, s);
                break MISSING_BLOCK_LABEL_450;
            }
            if (f1.f() == ak.f.a.f)
            {
                b[k] = new j(f1, c[k], class1, class2, s);
                break MISSING_BLOCK_LABEL_450;
            }
            b[k] = new h(f1, c[k], class1, class2, s);
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

        public g(ak.a a1, String as1[])
        {
            a = a1;
            c = as1;
            b = new a[a1.f().size()];
            d = new c[a1.g().size()];
            e = false;
        }
    }

    private static interface g.a
    {

        public abstract bd.a a();

        public abstract Object a(a a1);

        public abstract Object a(as as1);

        public abstract void a(a a1, Object obj);

        public abstract Object b(as as1);

        public abstract void b(a a1, Object obj);

        public abstract boolean b(a a1);

        public abstract boolean c(as as1);
    }

    private static final class g.b
        implements g.a
    {

        private final ak.f a;
        private final bd b;

        private bb c(a a1)
        {
            a.e();
            throw new RuntimeException((new StringBuilder("No map fields found in ")).append(a1.getClass().getName()).toString());
        }

        private bb d(a a1)
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

        public final Object a(a a1)
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

        public final void a(a a1, Object obj)
        {
            d(a1).b().clear();
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); b(a1, ((Iterator) (obj)).next())) { }
        }

        public final Object b(as as1)
        {
            return a(as1);
        }

        public final void b(a a1, Object obj)
        {
            d(a1).b().add((bd)obj);
        }

        public final boolean b(a a1)
        {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
        }

        public final boolean c(as as1)
        {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
        }

        g.b(ak.f f1, Class class1)
        {
            a = f1;
            b = d((as)as.a(as.a(class1, "getDefaultInstance", new Class[0]), null, new Object[0])).c();
        }
    }

    private static final class g.c
    {

        private final ak.a a;
        private final Method b;
        private final Method c;
        private final Method d;

        g.c(ak.a a1, String s, Class class1, Class class2)
        {
            a = a1;
            b = as.a(class1, (new StringBuilder("get")).append(s).append("Case").toString(), new Class[0]);
            c = as.a(class2, (new StringBuilder("get")).append(s).append("Case").toString(), new Class[0]);
            d = as.a(class2, (new StringBuilder("clear")).append(s).toString(), new Class[0]);
        }
    }

    private static final class g.d extends g.e
    {

        private ak.d k;
        private final Method l;
        private final Method m;
        private boolean n;
        private Method o;
        private Method p;
        private Method q;
        private Method r;

        public final Object a(a a1)
        {
            ArrayList arraylist = new ArrayList();
            int j1 = c(a1);
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist.add(a(a1, i1));
            }

            return Collections.unmodifiableList(arraylist);
        }

        public final Object a(a a1, int i1)
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

        public final void b(a a1, Object obj)
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

        g.d(ak.f f1, String s, Class class1, Class class2)
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

    private static class g.e
        implements g.a
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

        public Object a(a a1)
        {
            return as.a(c, a1, new Object[0]);
        }

        public Object a(a a1, int k)
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

        public final void a(a a1, Object obj)
        {
            as.a(j, a1, new Object[0]);
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); b(a1, ((Iterator) (obj)).next())) { }
        }

        public final Object b(as as1)
        {
            return a(as1);
        }

        public void b(a a1, Object obj)
        {
            as.a(g, a1, new Object[] {
                obj
            });
        }

        public final boolean b(a a1)
        {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
        }

        public final int c(a a1)
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

        g.e(String s, Class class1, Class class2)
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

    private static final class g.f extends g.e
    {

        private final Method k;
        private final Method l;

        public final bd.a a()
        {
            return (bd.a)as.a(k, null, new Object[0]);
        }

        public final void b(a a1, Object obj)
        {
            if (!a.isInstance(obj))
            {
                obj = ((bd.a)as.a(k, null, new Object[0])).c((bd)obj).i();
            }
            super.b(a1, obj);
        }

        g.f(String s, Class class1, Class class2)
        {
            super(s, class1, class2);
            k = as.a(a, "newBuilder", new Class[0]);
            l = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[] {
                Integer.TYPE
            });
        }
    }

    private static final class g.g extends g.h
    {

        private ak.d m;
        private Method n;
        private Method o;
        private boolean p;
        private Method q;
        private Method r;
        private Method s;

        public final Object a(a a1)
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

        public final void a(a a1, Object obj)
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

        g.g(ak.f f1, String s1, Class class1, Class class2, String s2)
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

    private static class g.h
        implements g.a
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

        public Object a(a a1)
        {
            return as.a(c, a1, new Object[0]);
        }

        public Object a(as as1)
        {
            return as.a(b, as1, new Object[0]);
        }

        public void a(a a1, Object obj)
        {
            as.a(d, a1, new Object[] {
                obj
            });
        }

        public Object b(as as1)
        {
            return a(as1);
        }

        public final void b(a a1, Object obj)
        {
            throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
        }

        public final boolean b(a a1)
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

        g.h(ak.f f1, String s, Class class1, Class class2, String s1)
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

    private static final class g.i extends g.h
    {

        private final Method m;
        private final Method n;

        public final bd.a a()
        {
            return (bd.a)as.a(m, null, new Object[0]);
        }

        public final void a(a a1, Object obj)
        {
            if (!a.isInstance(obj))
            {
                obj = ((bd.a)as.a(m, null, new Object[0])).c((bd)obj).h();
            }
            super.a(a1, obj);
        }

        g.i(ak.f f1, String s, Class class1, Class class2, String s1)
        {
            super(f1, s, class1, class2, s1);
            m = as.a(a, "newBuilder", new Class[0]);
            n = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[0]);
        }
    }

    private static final class g.j extends g.h
    {

        private final Method m;
        private final Method n;
        private final Method o;

        public final void a(a a1, Object obj)
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

        g.j(ak.f f1, String s, Class class1, Class class2, String s1)
        {
            super(f1, s, class1, class2, s1);
            m = as.a(class1, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
            n = as.a(class2, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
            o = as.a(class2, (new StringBuilder("set")).append(s).append("Bytes").toString(), new Class[] {
                com/c/b/f
            });
        }
    }

    public static final class h extends an
    {

        private f a;
        private final Class b;
        private final bd c;
        private final Method d;
        private final Method e;
        private final int f;

        public final ak.f a()
        {
            if (a == null)
            {
                throw new IllegalStateException("getDescriptor() called before internalInit()");
            } else
            {
                return a.a();
            }
        }

        public final void a(ak.f f1)
        {
            if (a != null)
            {
                throw new IllegalStateException("Already initialized.");
            } else
            {
                a = new at(this, f1);
                return;
            }
        }

        protected final int b()
        {
            return f;
        }

        public final volatile be c()
        {
            return c;
        }

        h(Class class1, bd bd1, int k)
        {
            if (com/c/b/bd.isAssignableFrom(class1) && !class1.isInstance(bd1))
            {
                throw new IllegalArgumentException((new StringBuilder("Bad messageDefaultInstance for ")).append(class1.getName()).toString());
            }
            a = null;
            b = class1;
            c = bd1;
            if (com/c/b/bl.isAssignableFrom(class1))
            {
                d = as.a(class1, "valueOf", new Class[] {
                    com/c/b/ak$e
                });
                e = as.a(class1, "getValueDescriptor", new Class[0]);
            } else
            {
                d = null;
                e = null;
            }
            f = k;
        }
    }


    protected static boolean d = false;
    protected by e;

    protected as()
    {
        e = by.e();
    }

    protected as(a a1)
    {
        e = a1.f();
    }

    public static h a(Class class1, bd bd1)
    {
        return new h(class1, bd1, an.a.a);
    }

    static Object a(Method method, Object obj, Object aobj[])
    {
        return b(method, obj, aobj);
    }

    static Method a(Class class1, String s, Class aclass[])
    {
        return b(class1, s, aclass);
    }

    static Map a(as as1)
    {
        return as1.a(false);
    }

    private Map a(boolean flag)
    {
        TreeMap treemap = new TreeMap();
        Iterator iterator = g.a(c_()).f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ak.f f1 = (ak.f)iterator.next();
            if (f1.o())
            {
                List list = (List)b(f1);
                if (!list.isEmpty())
                {
                    treemap.put(f1, list);
                }
            } else
            if (a(f1))
            {
                if (flag && f1.f() == ak.f.a.f)
                {
                    treemap.put(f1, g.a(c_(), f1).b(this));
                } else
                {
                    treemap.put(f1, b(f1));
                }
            }
        } while (true);
        return treemap;
    }

    private static transient Object b(Method method, Object obj, Object aobj[])
    {
        try
        {
            method = ((Method) (method.invoke(obj, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method = method.getCause();
            if (method instanceof RuntimeException)
            {
                throw (RuntimeException)method;
            }
            if (method instanceof Error)
            {
                throw (Error)method;
            } else
            {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", method);
            }
        }
        return method;
    }

    private static transient Method b(Class class1, String s, Class aclass[])
    {
        try
        {
            aclass = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            throw new RuntimeException((new StringBuilder("Generated message class \"")).append(class1.getName()).append("\" missing method \"").append(s).append("\".").toString(), aclass);
        }
        return aclass;
    }

    Map K()
    {
        return Collections.unmodifiableMap(a(true));
    }

    protected void L()
    {
    }

    protected abstract bd.a a(b b1);

    public void a(com.c.b.h h1)
    {
        bh.a(this, K(), h1);
    }

    public boolean a()
    {
        Iterator iterator = g.a(c_()).f().iterator();
_L2:
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            obj = (ak.f)iterator.next();
            if (((ak.f) (obj)).m() && !a(((ak.f) (obj))))
            {
                return false;
            }
        } while (((ak.f) (obj)).f() != ak.f.a.i);
        if (!((ak.f) (obj)).o())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List)b(((ak.f) (obj)))).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (((bd)((Iterator) (obj)).next()).a()) goto _L4; else goto _L3
_L3:
        return false;
        if (!a(((ak.f) (obj))) || ((bd)b(((ak.f) (obj)))).a()) goto _L2; else goto _L5
_L5:
        return false;
        return true;
    }

    public boolean a(ak.f f1)
    {
        return g.a(c_(), f1).c(this);
    }

    protected boolean a(com.c.b.g g1, by.a a1, aq aq, int k)
    {
        return a1.a(k, g1);
    }

    public int b()
    {
        int k = a;
        if (k != -1)
        {
            return k;
        } else
        {
            a = bh.a(this, K());
            return a;
        }
    }

    public Object b(ak.f f1)
    {
        return g.a(c_(), f1).a(this);
    }

    protected abstract g c_();

    public Map d_()
    {
        return Collections.unmodifiableMap(a(false));
    }

    public final ak.a e()
    {
        return g.a(c_());
    }

    public by f()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public bk t()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

}
