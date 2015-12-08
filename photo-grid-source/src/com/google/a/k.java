// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a.a;
import com.google.a.b.a.c;
import com.google.a.b.a.e;
import com.google.a.b.a.g;
import com.google.a.b.a.m;
import com.google.a.b.a.p;
import com.google.a.b.a.t;
import com.google.a.b.a.v;
import com.google.a.b.a.y;
import com.google.a.b.f;
import com.google.a.b.o;
import com.google.a.b.u;
import com.google.a.d.h;
import java.io.EOFException;
import java.io.IOException;
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
//            d, ah, l, m, 
//            n, q, o, p, 
//            am, ag, an, r, 
//            y, z, v, ae, 
//            j, x

public final class k
{

    final com.google.a.v a;
    final ae b;
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
        this(o.a, ((j) (com.google.a.d.a)), Collections.emptyMap(), false, false, false, true, false, false, com.google.a.ah.a, Collections.emptyList());
    }

    k(o o1, j j1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, ah ah1, List list)
    {
        c = new l(this);
        d = Collections.synchronizedMap(new HashMap());
        a = new com.google.a.m(this);
        b = new n(this);
        f = new f(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        ArrayList arraylist = new ArrayList();
        arraylist.add(y.Q);
        arraylist.add(m.a);
        arraylist.addAll(list);
        arraylist.add(y.x);
        arraylist.add(y.m);
        arraylist.add(y.g);
        arraylist.add(y.i);
        arraylist.add(y.k);
        list = Long.TYPE;
        if (ah1 == com.google.a.ah.a)
        {
            map = y.n;
        } else
        {
            map = new q(this);
        }
        arraylist.add(y.a(list, java/lang/Long, map));
        ah1 = Double.TYPE;
        if (flag5)
        {
            map = y.p;
        } else
        {
            map = new com.google.a.o(this);
        }
        arraylist.add(y.a(ah1, java/lang/Double, map));
        ah1 = Float.TYPE;
        if (flag5)
        {
            map = y.o;
        } else
        {
            map = new com.google.a.p(this);
        }
        arraylist.add(y.a(ah1, java/lang/Float, map));
        arraylist.add(y.r);
        arraylist.add(y.t);
        arraylist.add(y.z);
        arraylist.add(y.B);
        arraylist.add(y.a(java/math/BigDecimal, y.v));
        arraylist.add(y.a(java/math/BigInteger, y.w));
        arraylist.add(y.D);
        arraylist.add(y.F);
        arraylist.add(y.J);
        arraylist.add(y.O);
        arraylist.add(y.H);
        arraylist.add(y.d);
        arraylist.add(e.a);
        arraylist.add(y.M);
        arraylist.add(v.a);
        arraylist.add(t.a);
        arraylist.add(y.K);
        arraylist.add(a.a);
        arraylist.add(y.R);
        arraylist.add(y.b);
        arraylist.add(o1);
        arraylist.add(new c(f));
        arraylist.add(new com.google.a.b.a.k(f, flag1));
        arraylist.add(new p(f, j1, o1));
        e = Collections.unmodifiableList(arraylist);
    }

    private com.google.a.d.f a(Writer writer)
    {
        if (i)
        {
            writer.write(")]}'\n");
        }
        writer = new com.google.a.d.f(writer);
        if (j)
        {
            writer.c("  ");
        }
        writer.d(g);
        return writer;
    }

    private Object a(com.google.a.d.a a1, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a1.p();
        a1.a(true);
        a1.f();
        flag = false;
        type = ((Type) (a(com.google.a.c.a.a(type)).a(a1)));
        a1.a(flag1);
        return type;
        type;
        if (flag)
        {
            a1.a(flag1);
            return null;
        }
        throw new ag(type);
        type;
        a1.a(flag1);
        throw type;
        type;
        throw new ag(type);
        type;
        throw new ag(type);
    }

    static void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialDoubleValues() method.").toString());
        } else
        {
            return;
        }
    }

    public final am a(an an1, com.google.a.c.a a1)
    {
        Iterator iterator = e.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Object obj = (an)iterator.next();
            if (!flag)
            {
                if (obj == an1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((an) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((am) (obj));
                }
            }
        }
        throw new IllegalArgumentException((new StringBuilder("GSON cannot serialize ")).append(a1).toString());
    }

    public final am a(com.google.a.c.a a1)
    {
        Object obj;
        r r1;
        obj = (am)d.get(a1);
        if (obj != null)
        {
            return ((am) (obj));
        }
        obj = (Map)c.get();
        r1 = (r)((Map) (obj)).get(a1);
        if (r1 != null)
        {
            return r1;
        }
        r1 = new r();
        ((Map) (obj)).put(a1, r1);
        Iterator iterator = e.iterator();
        am am1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_140;
            }
            am1 = ((an)iterator.next()).a(this, a1);
        } while (am1 == null);
        r1.a(am1);
        d.put(a1, am1);
        ((Map) (obj)).remove(a1);
        return am1;
        throw new IllegalArgumentException((new StringBuilder("GSON cannot handle ")).append(a1).toString());
        Exception exception;
        exception;
        ((Map) (obj)).remove(a1);
        throw exception;
    }

    public final am a(Class class1)
    {
        return a(com.google.a.c.a.a(class1));
    }

    public final Object a(x x, Class class1)
    {
        x = ((x) (a(x, ((Type) (class1)))));
        return com.google.a.b.t.a(class1).cast(x);
    }

    public final Object a(x x, Type type)
    {
        if (x == null)
        {
            return null;
        } else
        {
            return a(((com.google.a.d.a) (new g(x))), type);
        }
    }

    public final Object a(String s, Class class1)
    {
        s = ((String) (a(s, ((Type) (class1)))));
        return com.google.a.b.t.a(class1).cast(s);
    }

    public final Object a(String s, Type type)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        com.google.a.d.a a1;
        a1 = new com.google.a.d.a(new StringReader(s));
        type = ((Type) (a(a1, type)));
        s = type;
        if (type == null) goto _L4; else goto _L3
_L3:
        s = type;
        if (a1.f() == com.google.a.d.e.j) goto _L4; else goto _L5
_L5:
        throw new com.google.a.y("JSON document was not fully consumed.");
        s;
        throw new ag(s);
        s;
        throw new com.google.a.y(s);
    }

    public final String a(Object obj)
    {
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        z z1 = com.google.a.z.a;
        StringWriter stringwriter = new StringWriter();
        Object obj1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        try
        {
            obj = a((Writer)stringwriter);
            flag = ((com.google.a.d.f) (obj)).g();
            ((com.google.a.d.f) (obj)).b(true);
            flag1 = ((com.google.a.d.f) (obj)).h();
            ((com.google.a.d.f) (obj)).c(h);
            flag2 = ((com.google.a.d.f) (obj)).i();
            ((com.google.a.d.f) (obj)).d(g);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        u.a(z1, ((com.google.a.d.f) (obj)));
        ((com.google.a.d.f) (obj)).b(flag);
        ((com.google.a.d.f) (obj)).c(flag1);
        ((com.google.a.d.f) (obj)).d(flag2);
        return stringwriter.toString();
        obj1;
        throw new com.google.a.y(((Throwable) (obj1)));
        obj1;
        ((com.google.a.d.f) (obj)).b(flag);
        ((com.google.a.d.f) (obj)).c(flag1);
        ((com.google.a.d.f) (obj)).d(flag2);
        throw obj1;
        return a(obj, ((Type) (obj.getClass())));
    }

    public final String a(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        com.google.a.d.f f1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        try
        {
            f1 = a((Writer)stringwriter);
            type = a(com.google.a.c.a.a(type));
            flag = f1.g();
            f1.b(true);
            flag1 = f1.h();
            f1.c(h);
            flag2 = f1.i();
            f1.d(g);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.google.a.y(((Throwable) (obj)));
        }
        type.a(f1, obj);
        f1.b(flag);
        f1.c(flag1);
        f1.d(flag2);
        return stringwriter.toString();
        obj;
        throw new com.google.a.y(((Throwable) (obj)));
        obj;
        f1.b(flag);
        f1.c(flag1);
        f1.d(flag2);
        throw obj;
    }

    public final String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
