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
//            t, gx, v, w, 
//            fz, ga, gn, gv, 
//            gu, go

public class r
    implements fm, Serializable, Cloneable
{

    public static final Map c;
    private static final gs d = new gs("ActiveUser");
    private static final gk e = new gk("provider", (byte)11, (short)1);
    private static final gk f = new gk("puid", (byte)11, (short)2);
    private static final Map g;
    public String a;
    public String b;

    public r()
    {
    }

    public r(String s, String s1)
    {
        this();
        a = s;
        b = s1;
    }

    public static void a()
    {
    }

    public static void b()
    {
    }

    static gs d()
    {
        return d;
    }

    static gk e()
    {
        return e;
    }

    static gk f()
    {
        return f;
    }

    public final void a(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().b(gn1, this);
    }

    public final void b(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().a(gn1, this);
    }

    public final void c()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'provider' was not present! Struct: ")).append(toString()).toString());
        }
        if (b == null)
        {
            throw new go((new StringBuilder("Required field 'puid' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ActiveUser(");
        stringbuilder.append("provider:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("puid:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(b);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        g = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new t((byte)0));
        g.put(b/a/gx, new v((byte)0));
        obj = new EnumMap(b/a/w);
        ((Map) (obj)).put(w.a, new fz("provider", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(w.b, new fz("puid", (byte)1, new ga((byte)11)));
        c = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/r, c);
    }
}
