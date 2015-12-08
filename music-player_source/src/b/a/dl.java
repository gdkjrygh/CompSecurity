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
//            dn, gx, dp, dq, 
//            fz, ga, gn, gv, 
//            gu, fk, go

public class dl
    implements fm, Serializable, Cloneable
{

    public static final Map c;
    private static final gs d = new gs("Page");
    private static final gk e = new gk("page_name", (byte)11, (short)1);
    private static final gk f = new gk("duration", (byte)10, (short)2);
    private static final Map g;
    public String a;
    public long b;
    private byte h;

    public dl()
    {
        h = 0;
    }

    public static void a()
    {
    }

    static gs e()
    {
        return d;
    }

    static gk f()
    {
        return e;
    }

    static gk g()
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

    public final boolean b()
    {
        return fk.a(h, 0);
    }

    public final void c()
    {
        h = (byte)(h | 1);
    }

    public final void d()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'page_name' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Page(");
        stringbuilder.append("page_name:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("duration:");
        stringbuilder.append(b);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        g = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new dn((byte)0));
        g.put(b/a/gx, new dp((byte)0));
        obj = new EnumMap(b/a/dq);
        ((Map) (obj)).put(dq.a, new fz("page_name", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(dq.b, new fz("duration", (byte)1, new ga((byte)10)));
        c = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/dl, c);
    }
}
