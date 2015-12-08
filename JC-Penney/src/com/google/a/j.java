// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a.a;
import com.google.a.b.a.c;
import com.google.a.b.a.e;
import com.google.a.b.a.g;
import com.google.a.b.a.l;
import com.google.a.b.a.n;
import com.google.a.b.a.q;
import com.google.a.b.a.u;
import com.google.a.b.a.w;
import com.google.a.b.a.z;
import com.google.a.b.af;
import com.google.a.b.ag;
import com.google.a.b.f;
import com.google.a.b.s;
import com.google.a.d.d;
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

// Referenced classes of package com.google.a:
//            c, ac, k, l, 
//            o, m, u, ab, 
//            n, ag, af, p, 
//            v, s, aa, i, 
//            t

public final class j
{

    final com.google.a.s a;
    final aa b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final f f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public j()
    {
        this(s.a, ((i) (com.google.a.c.a)), Collections.emptyMap(), false, false, false, true, false, false, com.google.a.ac.a, Collections.emptyList());
    }

    j(s s1, i i1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, ac ac1, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new k(this);
        b = new com.google.a.l(this);
        f = new f(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        map = new ArrayList();
        map.add(z.Q);
        map.add(n.a);
        map.add(s1);
        map.addAll(list);
        map.add(z.x);
        map.add(z.m);
        map.add(z.g);
        map.add(z.i);
        map.add(z.k);
        map.add(z.a(Long.TYPE, java/lang/Long, a(ac1)));
        map.add(z.a(Double.TYPE, java/lang/Double, a(flag5)));
        map.add(z.a(Float.TYPE, java/lang/Float, b(flag5)));
        map.add(z.r);
        map.add(z.t);
        map.add(z.z);
        map.add(z.B);
        map.add(z.a(java/math/BigDecimal, z.v));
        map.add(z.a(java/math/BigInteger, z.w));
        map.add(z.D);
        map.add(z.F);
        map.add(z.J);
        map.add(z.O);
        map.add(z.H);
        map.add(z.d);
        map.add(e.a);
        map.add(z.M);
        map.add(w.a);
        map.add(u.a);
        map.add(z.K);
        map.add(a.a);
        map.add(z.b);
        map.add(new c(f));
        map.add(new l(f, flag1));
        map.add(new g(f));
        map.add(z.R);
        map.add(new q(f, i1, s1));
        e = Collections.unmodifiableList(map);
    }

    private com.google.a.af a(ac ac1)
    {
        if (ac1 == com.google.a.ac.a)
        {
            return z.n;
        } else
        {
            return new o(this);
        }
    }

    private com.google.a.af a(boolean flag)
    {
        if (flag)
        {
            return z.p;
        } else
        {
            return new m(this);
        }
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

    static void a(j j1, double d1)
    {
        j1.a(d1);
    }

    private static void a(Object obj, com.google.a.d.a a1)
    {
        if (obj != null)
        {
            try
            {
                if (a1.f() != com.google.a.d.c.j)
                {
                    throw new com.google.a.u("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ab(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new com.google.a.u(((Throwable) (obj)));
            }
        }
    }

    private com.google.a.af b(boolean flag)
    {
        if (flag)
        {
            return z.o;
        } else
        {
            return new com.google.a.n(this);
        }
    }

    public com.google.a.af a(com.google.a.ag ag1, com.google.a.c.a a1)
    {
        boolean flag = false;
        if (!e.contains(ag1))
        {
            flag = true;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            Object obj = (com.google.a.ag)iterator.next();
            if (!flag)
            {
                if (obj == ag1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((com.google.a.ag) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((com.google.a.af) (obj));
                }
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(a1).toString());
    }

    public com.google.a.af a(com.google.a.c.a a1)
    {
        Object obj = (com.google.a.af)d.get(a1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((com.google.a.af) (obj));
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
        obj2 = (p)((Map) (obj1)).get(a1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new p();
        ((Map) (obj1)).put(a1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((com.google.a.ag)iterator.next()).a(this, a1);
        } while (obj2 == null);
        ((p) (obj)).a(((com.google.a.af) (obj2)));
        d.put(a1, obj2);
        ((Map) (obj1)).remove(a1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((com.google.a.af) (obj2));
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

    public com.google.a.af a(Class class1)
    {
        return a(com.google.a.c.a.b(class1));
    }

    public Object a(com.google.a.d.a a1, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a1.p();
        a1.a(true);
        a1.f();
        flag = false;
        type = ((Type) (a(com.google.a.c.a.a(type)).b(a1)));
        a1.a(flag1);
        return type;
        type;
        if (flag)
        {
            a1.a(flag1);
            return null;
        }
        throw new ab(type);
        type;
        a1.a(flag1);
        throw type;
        type;
        throw new ab(type);
        type;
        throw new ab(type);
    }

    public Object a(Reader reader, Class class1)
    {
        reader = new com.google.a.d.a(reader);
        Object obj = a(((com.google.a.d.a) (reader)), ((Type) (class1)));
        a(obj, ((com.google.a.d.a) (reader)));
        return af.a(class1).cast(obj);
    }

    public Object a(Reader reader, Type type)
    {
        reader = new com.google.a.d.a(reader);
        type = ((Type) (a(((com.google.a.d.a) (reader)), type)));
        a(type, ((com.google.a.d.a) (reader)));
        return type;
    }

    public Object a(String s1, Class class1)
    {
        s1 = ((String) (a(s1, ((Type) (class1)))));
        return af.a(class1).cast(s1);
    }

    public Object a(String s1, Type type)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s1))), type);
        }
    }

    public String a(t t)
    {
        StringWriter stringwriter = new StringWriter();
        a(t, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            return a(((t) (com.google.a.v.a)));
        } else
        {
            return a(obj, ((Type) (obj.getClass())));
        }
    }

    public String a(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public void a(t t, d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = d1.g();
        d1.b(true);
        flag1 = d1.h();
        d1.c(h);
        flag2 = d1.i();
        d1.d(g);
        ag.a(t, d1);
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        return;
        t;
        throw new com.google.a.u(t);
        t;
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        throw t;
    }

    public void a(t t, Appendable appendable)
    {
        try
        {
            a(t, a(ag.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (t t)
        {
            throw new RuntimeException(t);
        }
    }

    public void a(Object obj, Type type, d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(com.google.a.c.a.a(type));
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
        throw new com.google.a.u(((Throwable) (obj)));
        obj;
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        throw obj;
    }

    public void a(Object obj, Type type, Appendable appendable)
    {
        try
        {
            a(obj, type, a(ag.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.google.a.u(((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
