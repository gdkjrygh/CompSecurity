// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a.a;
import com.google.b.b.a.b;
import com.google.b.b.a.e;
import com.google.b.b.a.g;
import com.google.b.b.a.h;
import com.google.b.b.a.i;
import com.google.b.b.a.j;
import com.google.b.b.a.k;
import com.google.b.b.a.m;
import com.google.b.b.c;
import com.google.b.b.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

// Referenced classes of package com.google.b:
//            d, u, m, t, 
//            w, x, n, j, 
//            r, e, l

public final class f
{

    final com.google.b.j a;
    final r b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final c f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public f()
    {
        this(d.a, ((com.google.b.e) (com.google.b.d.a)), Collections.emptyMap(), false, false, false, true, false, false, com.google.b.u.a, Collections.emptyList());
    }

    f(d d1, com.google.b.e e1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, u u1, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new _cls1();
        b = new _cls2();
        f = new c(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        map = new ArrayList();
        map.add(m.Y);
        map.add(h.a);
        map.add(d1);
        map.addAll(list);
        map.add(m.D);
        map.add(m.m);
        map.add(m.g);
        map.add(m.i);
        map.add(m.k);
        u1 = a(u1);
        map.add(m.a(Long.TYPE, java/lang/Long, u1));
        map.add(m.a(Double.TYPE, java/lang/Double, a(flag5)));
        map.add(m.a(Float.TYPE, java/lang/Float, b(flag5)));
        map.add(m.x);
        map.add(m.o);
        map.add(m.q);
        map.add(m.a(java/util/concurrent/atomic/AtomicLong, a(u1)));
        map.add(m.a(java/util/concurrent/atomic/AtomicLongArray, b(u1)));
        map.add(m.s);
        map.add(m.z);
        map.add(m.F);
        map.add(m.H);
        map.add(m.a(java/math/BigDecimal, m.B));
        map.add(m.a(java/math/BigInteger, m.C));
        map.add(m.J);
        map.add(m.L);
        map.add(m.P);
        map.add(m.R);
        map.add(m.W);
        map.add(m.N);
        map.add(m.d);
        map.add(com.google.b.b.a.c.a);
        map.add(m.U);
        map.add(k.a);
        map.add(j.a);
        map.add(m.S);
        map.add(a.a);
        map.add(m.b);
        map.add(new b(f));
        map.add(new g(f, flag1));
        map.add(new com.google.b.b.a.d(f));
        map.add(m.Z);
        map.add(new i(f, e1, d1));
        e = Collections.unmodifiableList(map);
    }

    private static w a(u u1)
    {
        if (u1 == com.google.b.u.a)
        {
            return m.t;
        } else
        {
            return new _cls5();
        }
    }

    private static w a(w w1)
    {
        return (new _cls6(w1)).a();
    }

    private w a(boolean flag)
    {
        if (flag)
        {
            return m.v;
        } else
        {
            return new _cls3();
        }
    }

    private void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    static void a(f f1, double d1)
    {
        f1.a(d1);
    }

    private static void a(Object obj, com.google.b.d.a a1)
    {
        if (obj != null)
        {
            try
            {
                if (a1.f() != com.google.b.d.b.j)
                {
                    throw new com.google.b.m("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new t(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new com.google.b.m(((Throwable) (obj)));
            }
        }
    }

    private static w b(w w1)
    {
        return (new _cls7(w1)).a();
    }

    private w b(boolean flag)
    {
        if (flag)
        {
            return m.u;
        } else
        {
            return new _cls4();
        }
    }

    public com.google.b.d.c a(Writer writer)
        throws IOException
    {
        if (i)
        {
            writer.write(")]}'\n");
        }
        writer = new com.google.b.d.c(writer);
        if (j)
        {
            writer.c("  ");
        }
        writer.d(g);
        return writer;
    }

    public l a(Object obj, Type type)
    {
        com.google.b.b.a.f f1 = new com.google.b.b.a.f();
        a(obj, type, ((com.google.b.d.c) (f1)));
        return f1.a();
    }

    public w a(com.google.b.c.a a1)
    {
        Object obj = (w)d.get(a1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((w) (obj));
_L2:
    /* block-local class not found */
    class a {}

        Object obj1;
        Object obj2;
        boolean flag;
        obj1 = (Map)c.get();
        flag = false;
        if (obj1 == null)
        {
            obj1 = new HashMap();
            c.set(obj1);
            flag = true;
        }
        obj2 = (a)((Map) (obj1)).get(a1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new a();
        ((Map) (obj1)).put(a1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((x)iterator.next()).a(this, a1);
        } while (obj2 == null);
        ((a) (obj)).a(((w) (obj2)));
        d.put(a1, obj2);
        ((Map) (obj1)).remove(a1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((w) (obj2));
        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot handle ").append(a1).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(a1);
        if (flag)
        {
            c.remove();
        }
        throw exception;
    }

    public w a(x x1, com.google.b.c.a a1)
    {
        boolean flag = false;
        if (!e.contains(x1))
        {
            flag = true;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            Object obj = (x)iterator.next();
            if (!flag)
            {
                if (obj == x1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((x) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((w) (obj));
                }
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(a1).toString());
    }

    public w a(Class class1)
    {
        return a(com.google.b.c.a.get(class1));
    }

    public Object a(com.google.b.d.a a1, Type type)
        throws com.google.b.m, t
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a1.p();
        a1.a(true);
        a1.f();
        flag = false;
        type = ((Type) (a(com.google.b.c.a.get(type)).b(a1)));
        a1.a(flag1);
        return type;
        type;
        if (flag)
        {
            a1.a(flag1);
            return null;
        }
        throw new t(type);
        type;
        a1.a(flag1);
        throw type;
        type;
        throw new t(type);
        type;
        throw new t(type);
    }

    public Object a(l l, Type type)
        throws t
    {
        if (l == null)
        {
            return null;
        } else
        {
            return a(((com.google.b.d.a) (new e(l))), type);
        }
    }

    public Object a(Reader reader, Class class1)
        throws t, com.google.b.m
    {
        reader = new com.google.b.d.a(reader);
        Object obj = a(((com.google.b.d.a) (reader)), ((Type) (class1)));
        a(obj, ((com.google.b.d.a) (reader)));
        return com.google.b.b.i.a(class1).cast(obj);
    }

    public Object a(Reader reader, Type type)
        throws com.google.b.m, t
    {
        reader = new com.google.b.d.a(reader);
        type = ((Type) (a(((com.google.b.d.a) (reader)), type)));
        a(type, ((com.google.b.d.a) (reader)));
        return type;
    }

    public Object a(String s, Class class1)
        throws t
    {
        s = ((String) (a(s, ((Type) (class1)))));
        return com.google.b.b.i.a(class1).cast(s);
    }

    public Object a(String s, Type type)
        throws t
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s))), type);
        }
    }

    public String a(l l)
    {
        StringWriter stringwriter = new StringWriter();
        a(l, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            return a(((l) (com.google.b.n.a)));
        } else
        {
            return b(obj, obj.getClass());
        }
    }

    public void a(l l, com.google.b.d.c c1)
        throws com.google.b.m
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = c1.g();
        c1.b(true);
        flag1 = c1.h();
        c1.c(h);
        flag2 = c1.i();
        c1.d(g);
        com.google.b.b.j.a(l, c1);
        c1.b(flag);
        c1.c(flag1);
        c1.d(flag2);
        return;
        l;
        throw new com.google.b.m(l);
        l;
        c1.b(flag);
        c1.c(flag1);
        c1.d(flag2);
        throw l;
    }

    public void a(l l, Appendable appendable)
        throws com.google.b.m
    {
        try
        {
            a(l, a(com.google.b.b.j.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l)
        {
            throw new RuntimeException(l);
        }
    }

    public void a(Object obj, Type type, com.google.b.d.c c1)
        throws com.google.b.m
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(com.google.b.c.a.get(type));
        flag = c1.g();
        c1.b(true);
        flag1 = c1.h();
        c1.c(h);
        flag2 = c1.i();
        c1.d(g);
        type.a(c1, obj);
        c1.b(flag);
        c1.c(flag1);
        c1.d(flag2);
        return;
        obj;
        throw new com.google.b.m(((Throwable) (obj)));
        obj;
        c1.b(flag);
        c1.c(flag1);
        c1.d(flag2);
        throw obj;
    }

    public void a(Object obj, Type type, Appendable appendable)
        throws com.google.b.m
    {
        try
        {
            a(obj, type, a(com.google.b.b.j.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.google.b.m(((Throwable) (obj)));
        }
    }

    public String b(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, stringwriter);
        return stringwriter.toString();
    }

    public String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls4 {}

}
