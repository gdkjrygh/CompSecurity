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
//            cj, gx, cl, cm, 
//            fz, ga, gn, gv, 
//            gu, fk, go

public class ch
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("ImprintValue");
    private static final gk f = new gk("value", (byte)11, (short)1);
    private static final gk g = new gk("ts", (byte)10, (short)2);
    private static final gk h = new gk("guid", (byte)11, (short)3);
    private static final Map i;
    public String a;
    public long b;
    public String c;
    private byte j;
    private cm k[];

    public ch()
    {
        j = 0;
        k = (new cm[] {
            cm.a
        });
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

    public final String a()
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

    public final long d()
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
        if (c == null)
        {
            throw new go((new StringBuilder("Required field 'guid' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ImprintValue(");
        boolean flag = true;
        if (b())
        {
            stringbuilder.append("value:");
            if (a == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(a);
            }
            flag = false;
        }
        if (!flag)
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append("ts:");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        stringbuilder.append("guid:");
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
        ((Map) (obj)).put(b/a/gw, new cj((byte)0));
        i.put(b/a/gx, new cl((byte)0));
        obj = new EnumMap(b/a/cm);
        ((Map) (obj)).put(cm.a, new fz("value", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(cm.b, new fz("ts", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(cm.c, new fz("guid", (byte)1, new ga((byte)11)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ch, d);
    }
}
