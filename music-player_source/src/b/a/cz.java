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
//            db, gx, dd, de, 
//            fz, ga, gn, gv, 
//            gu, fk

public class cz
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("Location");
    private static final gk f = new gk("lat", (byte)4, (short)1);
    private static final gk g = new gk("lng", (byte)4, (short)2);
    private static final gk h = new gk("ts", (byte)10, (short)3);
    private static final Map i;
    public double a;
    public double b;
    public long c;
    private byte j;

    public cz()
    {
        j = 0;
    }

    public cz(double d1, double d2, long l)
    {
        this();
        a = d1;
        b();
        b = d2;
        d();
        c = l;
        f();
    }

    public static void g()
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

    public final boolean c()
    {
        return fk.a(j, 1);
    }

    public final void d()
    {
        j = (byte)(j | 2);
    }

    public final boolean e()
    {
        return fk.a(j, 2);
    }

    public final void f()
    {
        j = (byte)(j | 4);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Location(");
        stringbuilder.append("lat:");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append("lng:");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        stringbuilder.append("ts:");
        stringbuilder.append(c);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new db((byte)0));
        i.put(b/a/gx, new dd((byte)0));
        obj = new EnumMap(b/a/de);
        ((Map) (obj)).put(de.a, new fz("lat", (byte)1, new ga((byte)4)));
        ((Map) (obj)).put(de.b, new fz("lng", (byte)1, new ga((byte)4)));
        ((Map) (obj)).put(de.c, new fz("ts", (byte)1, new ga((byte)10)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/cz, d);
    }
}
