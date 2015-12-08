// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            cp, gx, cr, cs, 
//            fz, ga, gb, gd, 
//            av, bc, gn, gv, 
//            gu, go

public class cn
    implements fm, Serializable, Cloneable
{

    public static final Map e;
    private static final gs f = new gs("InstantMsg");
    private static final gk g = new gk("id", (byte)11, (short)1);
    private static final gk h = new gk("errors", (byte)15, (short)2);
    private static final gk i = new gk("events", (byte)15, (short)3);
    private static final gk j = new gk("game_events", (byte)15, (short)4);
    private static final Map k;
    public String a;
    public List b;
    public List c;
    public List d;
    private cs l[];

    public cn()
    {
        l = (new cs[] {
            cs.b, cs.c, cs.d
        });
    }

    public static void b()
    {
    }

    public static void d()
    {
    }

    public static void f()
    {
    }

    public static void h()
    {
    }

    static gs j()
    {
        return f;
    }

    static gk k()
    {
        return g;
    }

    static gk l()
    {
        return h;
    }

    static gk m()
    {
        return i;
    }

    static gk n()
    {
        return j;
    }

    public final cn a(String s)
    {
        a = s;
        return this;
    }

    public final String a()
    {
        return a;
    }

    public final void a(av av1)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(av1);
    }

    public final void a(bc bc1)
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(bc1);
    }

    public final void a(gn gn1)
    {
        ((gv)k.get(gn1.s())).a().b(gn1, this);
    }

    public final void b(gn gn1)
    {
        ((gv)k.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean c()
    {
        return b != null;
    }

    public final boolean e()
    {
        return c != null;
    }

    public final boolean g()
    {
        return d != null;
    }

    public final void i()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'id' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("InstantMsg(");
        stringbuilder.append("id:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        if (c())
        {
            stringbuilder.append(", ");
            stringbuilder.append("errors:");
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
            stringbuilder.append("events:");
            if (c == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(c);
            }
        }
        if (g())
        {
            stringbuilder.append(", ");
            stringbuilder.append("game_events:");
            if (d == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(d);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        k = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new cp((byte)0));
        k.put(b/a/gx, new cr((byte)0));
        obj = new EnumMap(b/a/cs);
        ((Map) (obj)).put(cs.a, new fz("id", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(cs.b, new fz("errors", (byte)2, new gb(new gd(b/a/av))));
        ((Map) (obj)).put(cs.c, new fz("events", (byte)2, new gb(new gd(b/a/bc))));
        ((Map) (obj)).put(cs.d, new fz("game_events", (byte)2, new gb(new gd(b/a/bc))));
        e = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/cn, e);
    }
}
