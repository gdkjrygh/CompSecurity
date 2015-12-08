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
//            be, gx, bg, bh, 
//            fz, ga, gc, gd, 
//            dr, gn, gv, gu, 
//            fk, go

public class bc
    implements fm, Serializable, Cloneable
{

    public static final Map f;
    private static final gs g = new gs("Event");
    private static final gk h = new gk("name", (byte)11, (short)1);
    private static final gk i = new gk("properties", (byte)13, (short)2);
    private static final gk j = new gk("duration", (byte)10, (short)3);
    private static final gk k = new gk("acc", (byte)8, (short)4);
    private static final gk l = new gk("ts", (byte)10, (short)5);
    private static final Map m;
    public String a;
    public Map b;
    public long c;
    public int d;
    public long e;
    private byte n;
    private bh o[];

    public bc()
    {
        n = 0;
        o = (new bh[] {
            bh.c, bh.d
        });
    }

    public static void a()
    {
    }

    public static void b()
    {
    }

    static gs j()
    {
        return g;
    }

    static gk k()
    {
        return h;
    }

    static gk l()
    {
        return i;
    }

    static gk m()
    {
        return j;
    }

    static gk n()
    {
        return k;
    }

    static gk o()
    {
        return l;
    }

    public final void a(gn gn1)
    {
        ((gv)m.get(gn1.s())).a().b(gn1, this);
    }

    public final void b(gn gn1)
    {
        ((gv)m.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean c()
    {
        return fk.a(n, 0);
    }

    public final void d()
    {
        n = (byte)(n | 1);
    }

    public final boolean e()
    {
        return fk.a(n, 1);
    }

    public final void f()
    {
        n = (byte)(n | 2);
    }

    public final boolean g()
    {
        return fk.a(n, 2);
    }

    public final void h()
    {
        n = (byte)(n | 4);
    }

    public final void i()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'name' was not present! Struct: ")).append(toString()).toString());
        }
        if (b == null)
        {
            throw new go((new StringBuilder("Required field 'properties' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Event(");
        stringbuilder.append("name:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("properties:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(b);
        }
        if (c())
        {
            stringbuilder.append(", ");
            stringbuilder.append("duration:");
            stringbuilder.append(c);
        }
        if (e())
        {
            stringbuilder.append(", ");
            stringbuilder.append("acc:");
            stringbuilder.append(d);
        }
        stringbuilder.append(", ");
        stringbuilder.append("ts:");
        stringbuilder.append(e);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        m = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new be((byte)0));
        m.put(b/a/gx, new bg((byte)0));
        obj = new EnumMap(b/a/bh);
        ((Map) (obj)).put(bh.a, new fz("name", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(bh.b, new fz("properties", (byte)1, new gc(new ga((byte)11), new gd(b/a/dr))));
        ((Map) (obj)).put(bh.c, new fz("duration", (byte)2, new ga((byte)10)));
        ((Map) (obj)).put(bh.d, new fz("acc", (byte)2, new ga((byte)8)));
        ((Map) (obj)).put(bh.e, new fz("ts", (byte)1, new ga((byte)10)));
        f = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/bc, f);
    }
}
