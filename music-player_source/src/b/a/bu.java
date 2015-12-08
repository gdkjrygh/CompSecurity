// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            bw, gx, by, bz, 
//            fz, gc, ga, gd, 
//            bo, gb, bi, gn, 
//            gv, gu, go

public class bu
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("IdTracking");
    private static final gk f = new gk("snapshots", (byte)13, (short)1);
    private static final gk g = new gk("journals", (byte)15, (short)2);
    private static final gk h = new gk("checksum", (byte)11, (short)3);
    private static final Map i;
    public Map a;
    public List b;
    public String c;
    private bz j[];

    public bu()
    {
        j = (new bz[] {
            bz.b, bz.c
        });
    }

    public static void b()
    {
    }

    public static void f()
    {
    }

    static gs h()
    {
        return e;
    }

    static gk i()
    {
        return f;
    }

    static gk j()
    {
        return g;
    }

    static gk k()
    {
        return h;
    }

    public final bu a(List list)
    {
        b = list;
        return this;
    }

    public final bu a(Map map)
    {
        a = map;
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

    public final void a(boolean flag)
    {
        if (!flag)
        {
            b = null;
        }
    }

    public final void b(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().a(gn1, this);
    }

    public final List c()
    {
        return b;
    }

    public final boolean d()
    {
        return b != null;
    }

    public final boolean e()
    {
        return c != null;
    }

    public final void g()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'snapshots' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("IdTracking(");
        stringbuilder.append("snapshots:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        if (d())
        {
            stringbuilder.append(", ");
            stringbuilder.append("journals:");
            if (b == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(b);
            }
        }
        if (e())
        {
            stringbuilder.append(", ");
            stringbuilder.append("checksum:");
            if (c == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(c);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new bw((byte)0));
        i.put(b/a/gx, new by((byte)0));
        obj = new EnumMap(b/a/bz);
        ((Map) (obj)).put(bz.a, new fz("snapshots", (byte)1, new gc(new ga((byte)11), new gd(b/a/bo))));
        ((Map) (obj)).put(bz.b, new fz("journals", (byte)2, new gb(new gd(b/a/bi))));
        ((Map) (obj)).put(bz.c, new fz("checksum", (byte)2, new ga((byte)11)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/bu, d);
    }
}
