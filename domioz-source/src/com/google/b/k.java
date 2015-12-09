// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a.a;
import com.google.b.b.a.c;
import com.google.b.b.a.e;
import com.google.b.b.a.g;
import com.google.b.b.a.h;
import com.google.b.b.a.j;
import com.google.b.b.a.l;
import com.google.b.b.a.n;
import com.google.b.b.a.q;
import com.google.b.b.a.u;
import com.google.b.b.a.w;
import com.google.b.b.a.z;
import com.google.b.b.af;
import com.google.b.b.ag;
import com.google.b.b.f;
import com.google.b.b.s;
import com.google.b.d.d;
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

// Referenced classes of package com.google.b:
//            d, ag, l, m, 
//            p, n, o, al, 
//            af, x, am, q, 
//            y, u, ad, j, 
//            w

public final class k
{

    final com.google.b.u a;
    final ad b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final f f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public k()
    {
        this(s.a, ((com.google.b.j) (com.google.b.d.a)), Collections.emptyMap(), false, false, false, true, false, false, com.google.b.ag.a, Collections.emptyList());
    }

    k(s s1, com.google.b.j j1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, com.google.b.ag ag1, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new com.google.b.l(this);
        b = new m(this);
        f = new f(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        ArrayList arraylist = new ArrayList();
        arraylist.add(z.Q);
        arraylist.add(n.a);
        arraylist.add(s1);
        arraylist.addAll(list);
        arraylist.add(z.x);
        arraylist.add(z.m);
        arraylist.add(z.g);
        arraylist.add(z.i);
        arraylist.add(z.k);
        list = Long.TYPE;
        if (ag1 == com.google.b.ag.a)
        {
            map = z.n;
        } else
        {
            map = new p(this);
        }
        arraylist.add(z.a(list, java/lang/Long, map));
        ag1 = Double.TYPE;
        if (flag5)
        {
            map = z.p;
        } else
        {
            map = new com.google.b.n(this);
        }
        arraylist.add(z.a(ag1, java/lang/Double, map));
        ag1 = Float.TYPE;
        if (flag5)
        {
            map = z.o;
        } else
        {
            map = new o(this);
        }
        arraylist.add(z.a(ag1, java/lang/Float, map));
        arraylist.add(z.r);
        arraylist.add(z.t);
        arraylist.add(z.z);
        arraylist.add(z.B);
        arraylist.add(z.a(java/math/BigDecimal, z.v));
        arraylist.add(z.a(java/math/BigInteger, z.w));
        arraylist.add(z.D);
        arraylist.add(z.F);
        arraylist.add(z.J);
        arraylist.add(z.O);
        arraylist.add(z.H);
        arraylist.add(z.d);
        arraylist.add(e.a);
        arraylist.add(z.M);
        arraylist.add(w.a);
        arraylist.add(u.a);
        arraylist.add(z.K);
        arraylist.add(a.a);
        arraylist.add(z.R);
        arraylist.add(z.b);
        arraylist.add(new c(f));
        arraylist.add(new l(f, flag1));
        arraylist.add(new g(f));
        arraylist.add(new q(f, j1, s1));
        e = Collections.unmodifiableList(arraylist);
    }

    private d a(Writer writer)
    {
        if (i)
        {
            writer.write(")]}'\n");
        }
        writer = new d(writer);
        if (j)
        {
            writer.c("  ");
        }
        writer.d(g);
        return writer;
    }

    private Object a(com.google.b.d.a a1, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a1.p();
        a1.a(true);
        a1.f();
        flag = false;
        type = ((Type) (a(com.google.b.c.a.get(type)).a(a1)));
        a1.a(flag1);
        return type;
        type;
        if (flag)
        {
            a1.a(flag1);
            return null;
        }
        throw new com.google.b.af(type);
        type;
        a1.a(flag1);
        throw type;
        type;
        throw new com.google.b.af(type);
        type;
        throw new com.google.b.af(type);
    }

    static void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    private void a(com.google.b.w w1, Appendable appendable)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        try
        {
            appendable = a(ag.a(appendable));
            flag = appendable.g();
            appendable.b(true);
            flag1 = appendable.h();
            appendable.c(h);
            flag2 = appendable.i();
            appendable.d(g);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.b.w w1)
        {
            throw new RuntimeException(w1);
        }
        ag.a(w1, appendable);
        appendable.b(flag);
        appendable.c(flag1);
        appendable.d(flag2);
        return;
        w1;
        throw new x(w1);
        w1;
        appendable.b(flag);
        appendable.c(flag1);
        appendable.d(flag2);
        throw w1;
    }

    private static void a(Object obj, com.google.b.d.a a1)
    {
        if (obj != null)
        {
            try
            {
                if (a1.f() != com.google.b.d.c.j)
                {
                    throw new x("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new com.google.b.af(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new x(((Throwable) (obj)));
            }
        }
    }

    private void a(Object obj, Type type, d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(com.google.b.c.a.get(type));
        flag = d1.g();
        d1.b(true);
        flag1 = d1.h();
        d1.c(h);
        flag2 = d1.i();
        d1.d(g);
        type.a(d1, obj);
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        return;
        obj;
        throw new x(((Throwable) (obj)));
        obj;
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        throw obj;
    }

    public final al a(am am1, com.google.b.c.a a1)
    {
        Iterator iterator = e.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Object obj = (am)iterator.next();
            if (!flag)
            {
                if (obj == am1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((am) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((al) (obj));
                }
            }
        }
        throw new IllegalArgumentException((new StringBuilder("GSON cannot serialize ")).append(a1).toString());
    }

    public final al a(com.google.b.c.a a1)
    {
        Object obj = (al)d.get(a1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((al) (obj));
_L2:
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
        obj2 = (com.google.b.q)((Map) (obj1)).get(a1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new com.google.b.q();
        ((Map) (obj1)).put(a1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((am)iterator.next()).a(this, a1);
        } while (obj2 == null);
        ((com.google.b.q) (obj)).a(((al) (obj2)));
        d.put(a1, obj2);
        ((Map) (obj1)).remove(a1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((al) (obj2));
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(a1).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(a1);
        if (flag)
        {
            c.remove();
        }
        throw exception;
    }

    public final al a(Class class1)
    {
        return a(com.google.b.c.a.get(class1));
    }

    public final com.google.b.w a(Object obj, Type type)
    {
        j j1 = new j();
        a(obj, type, ((d) (j1)));
        return j1.a();
    }

    public final Object a(com.google.b.w w1, Class class1)
    {
        w1 = ((com.google.b.w) (a(w1, ((Type) (class1)))));
        return af.a(class1).cast(w1);
    }

    public final Object a(com.google.b.w w1, Type type)
    {
        if (w1 == null)
        {
            return null;
        } else
        {
            return a(((com.google.b.d.a) (new h(w1))), type);
        }
    }

    public final Object a(Reader reader, Class class1)
    {
        reader = new com.google.b.d.a(reader);
        Object obj = a(((com.google.b.d.a) (reader)), ((Type) (class1)));
        a(obj, ((com.google.b.d.a) (reader)));
        return af.a(class1).cast(obj);
    }

    public final Object a(Reader reader, Type type)
    {
        reader = new com.google.b.d.a(reader);
        type = ((Type) (a(((com.google.b.d.a) (reader)), type)));
        a(type, ((com.google.b.d.a) (reader)));
        return type;
    }

    public final Object a(String s1, Class class1)
    {
        s1 = ((String) (a(s1, ((Type) (class1)))));
        return af.a(class1).cast(s1);
    }

    public final Object a(String s1, Type type)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s1))), type);
        }
    }

    public final String a(Object obj)
    {
        if (obj == null)
        {
            obj = com.google.b.y.a;
            StringWriter stringwriter = new StringWriter();
            a(((com.google.b.w) (obj)), ((Appendable) (stringwriter)));
            return stringwriter.toString();
        } else
        {
            return b(obj, obj.getClass());
        }
    }

    public final void a(Object obj, Appendable appendable)
    {
        if (obj != null)
        {
            a(obj, ((Type) (obj.getClass())), appendable);
            return;
        } else
        {
            a(((com.google.b.w) (com.google.b.y.a)), appendable);
            return;
        }
    }

    public final void a(Object obj, Type type, Appendable appendable)
    {
        try
        {
            a(obj, type, a(ag.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new x(((Throwable) (obj)));
        }
    }

    public final String b(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, stringwriter);
        return stringwriter.toString();
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
