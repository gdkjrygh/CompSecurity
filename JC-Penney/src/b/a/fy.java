// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            ot, op, fu, fx, 
//            fz

public final class fy
{

    public static final fy a;
    public static final fy b;
    public static final fy c;
    public static final fy d;
    public static final fy e;
    public static final fy f;
    public static final fy g;
    public static final fy h;
    public static final fy i;
    public static final fy j;
    public static final fy k;
    private static final Map o;
    final String l;
    public final ot m;
    public final op n;

    private fy(ot ot1)
    {
        this(ot1.e(), ot1);
    }

    private fy(String s, ot ot1)
    {
        if (s == null || ot1 == null)
        {
            throw new NullPointerException();
        } else
        {
            l = s;
            m = ot1;
            n = op.a(ot1);
            return;
        }
    }

    public static fy a(Class class1)
    {
        if (class1.isPrimitive())
        {
            return (fy)o.get(class1);
        }
        String s = class1.getName().replace('.', '/');
        if (class1.isArray())
        {
            class1 = s;
        } else
        {
            class1 = (new StringBuilder("L")).append(s).append(';').toString();
        }
        return a(((String) (class1)));
    }

    public static fy a(String s)
    {
        return new fy(s, ot.b(s));
    }

    public final fu a(fy fy1, String s)
    {
        return new fu(this, fy1, s);
    }

    public final transient fx a(fy fy1, String s, fy afy[])
    {
        return new fx(this, fy1, s, new fz(afy));
    }

    public final transient fx a(fy afy[])
    {
        return new fx(this, i, "<init>", new fz(afy));
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof fy) && ((fy)obj).l.equals(l);
    }

    public final int hashCode()
    {
        return l.hashCode();
    }

    public final String toString()
    {
        return l;
    }

    static 
    {
        a = new fy(ot.a);
        b = new fy(ot.b);
        c = new fy(ot.c);
        d = new fy(ot.d);
        e = new fy(ot.e);
        f = new fy(ot.f);
        g = new fy(ot.g);
        h = new fy(ot.h);
        i = new fy(ot.i);
        j = new fy(ot.o);
        k = new fy(ot.q);
        HashMap hashmap = new HashMap();
        o = hashmap;
        hashmap.put(Boolean.TYPE, a);
        o.put(Byte.TYPE, b);
        o.put(Character.TYPE, c);
        o.put(Double.TYPE, d);
        o.put(Float.TYPE, e);
        o.put(Integer.TYPE, f);
        o.put(Long.TYPE, g);
        o.put(Short.TYPE, h);
        o.put(Void.TYPE, i);
    }
}
