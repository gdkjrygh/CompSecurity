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
//            ec, gx, ee, ef, 
//            fz, ga, gd, cb, 
//            gn, gv, gu, fk

public class ea
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("Response");
    private static final gk f = new gk("resp_code", (byte)8, (short)1);
    private static final gk g = new gk("msg", (byte)11, (short)2);
    private static final gk h = new gk("imprint", (byte)12, (short)3);
    private static final Map i;
    public int a;
    public String b;
    public cb c;
    private byte j;
    private ef k[];

    public ea()
    {
        j = 0;
        k = (new ef[] {
            ef.b, ef.c
        });
    }

    public static void e()
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

    public final String c()
    {
        return b;
    }

    public final boolean d()
    {
        return b != null;
    }

    public final cb f()
    {
        return c;
    }

    public final boolean g()
    {
        return c != null;
    }

    public final void i()
    {
        if (c != null)
        {
            c.i();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Response(");
        stringbuilder.append("resp_code:");
        stringbuilder.append(a);
        if (d())
        {
            stringbuilder.append(", ");
            stringbuilder.append("msg:");
            if (b == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(b);
            }
        }
        if (g())
        {
            stringbuilder.append(", ");
            stringbuilder.append("imprint:");
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
        ((Map) (obj)).put(b/a/gw, new ec((byte)0));
        i.put(b/a/gx, new ee((byte)0));
        obj = new EnumMap(b/a/ef);
        ((Map) (obj)).put(ef.a, new fz("resp_code", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(ef.b, new fz("msg", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(ef.c, new fz("imprint", (byte)2, new gd(b/a/cb)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ea, d);
    }
}
