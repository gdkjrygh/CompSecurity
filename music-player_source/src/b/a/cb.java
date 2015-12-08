// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            cd, gx, cf, cg, 
//            fz, gc, ga, gd, 
//            ch, gn, gv, gu, 
//            fk, go

public class cb
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("Imprint");
    private static final gk f = new gk("property", (byte)13, (short)1);
    private static final gk g = new gk("version", (byte)8, (short)2);
    private static final gk h = new gk("checksum", (byte)11, (short)3);
    private static final Map i;
    public Map a;
    public int b;
    public String c;
    private byte j;

    public cb()
    {
        j = 0;
    }

    public static void c()
    {
    }

    public static void h()
    {
    }

    static gs j()
    {
        return e;
    }

    static gk k()
    {
        return f;
    }

    static gk l()
    {
        return g;
    }

    static gk m()
    {
        return h;
    }

    public final cb a(int i1)
    {
        b = i1;
        f();
        return this;
    }

    public final cb a(String s)
    {
        c = s;
        return this;
    }

    public final Map a()
    {
        return a;
    }

    public final void a(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().b(gn1, this);
    }

    public final void b(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean b()
    {
        return a != null;
    }

    public final int d()
    {
        return b;
    }

    public final boolean e()
    {
        return fk.a(j, 0);
    }

    public final void f()
    {
        j = (byte)(j | 1);
    }

    public final String g()
    {
        return c;
    }

    public final void i()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'property' was not present! Struct: ")).append(toString()).toString());
        }
        if (c == null)
        {
            throw new go((new StringBuilder("Required field 'checksum' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Imprint(");
        stringbuilder.append("property:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("version:");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        stringbuilder.append("checksum:");
        if (c == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(c);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new cd((byte)0));
        i.put(b/a/gx, new cf((byte)0));
        obj = new EnumMap(b/a/cg);
        ((Map) (obj)).put(cg.a, new fz("property", (byte)1, new gc(new ga((byte)11), new gd(b/a/ch))));
        ((Map) (obj)).put(cg.b, new fz("version", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(cg.c, new fz("checksum", (byte)1, new ga((byte)11)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/cb, d);
    }
}
