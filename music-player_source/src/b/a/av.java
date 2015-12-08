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
//            ax, gx, az, ba, 
//            fz, ga, fy, bb, 
//            gn, gv, gu, fk, 
//            go

public class av
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("Error");
    private static final gk f = new gk("ts", (byte)10, (short)1);
    private static final gk g = new gk("context", (byte)11, (short)2);
    private static final gk h = new gk("source", (byte)8, (short)3);
    private static final Map i;
    public long a;
    public String b;
    public bb c;
    private byte j;
    private ba k[];

    public av()
    {
        j = 0;
        k = (new ba[] {
            ba.c
        });
    }

    public static void c()
    {
    }

    public static void e()
    {
    }

    static gs g()
    {
        return e;
    }

    static gk h()
    {
        return f;
    }

    static gk i()
    {
        return g;
    }

    static gk j()
    {
        return h;
    }

    public final void a(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(j, 0);
    }

    public final void b()
    {
        j = (byte)(j | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean d()
    {
        return c != null;
    }

    public final void f()
    {
        if (b == null)
        {
            throw new go((new StringBuilder("Required field 'context' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Error(");
        stringbuilder.append("ts:");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append("context:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(b);
        }
        if (d())
        {
            stringbuilder.append(", ");
            stringbuilder.append("source:");
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
        ((Map) (obj)).put(b/a/gw, new ax((byte)0));
        i.put(b/a/gx, new az((byte)0));
        obj = new EnumMap(b/a/ba);
        ((Map) (obj)).put(ba.a, new fz("ts", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(ba.b, new fz("context", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(ba.c, new fz("source", (byte)2, new fy(b/a/bb)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/av, d);
    }
}
