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
//            ep, gx, er, es, 
//            fz, ga, gn, gv, 
//            gu, fk

public class en
    implements fm, Serializable, Cloneable
{

    public static final Map c;
    private static final gs d = new gs("Traffic");
    private static final gk e = new gk("upload_traffic", (byte)8, (short)1);
    private static final gk f = new gk("download_traffic", (byte)8, (short)2);
    private static final Map g;
    public int a;
    public int b;
    private byte h;

    public en()
    {
        h = 0;
    }

    public static void e()
    {
    }

    static gs f()
    {
        return d;
    }

    static gk g()
    {
        return e;
    }

    static gk h()
    {
        return f;
    }

    public final en a(int i)
    {
        a = i;
        b();
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(h, 0);
    }

    public final en b(int i)
    {
        b = i;
        d();
        return this;
    }

    public final void b()
    {
        h = (byte)(h | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean c()
    {
        return fk.a(h, 1);
    }

    public final void d()
    {
        h = (byte)(h | 2);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Traffic(");
        stringbuilder.append("upload_traffic:");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append("download_traffic:");
        stringbuilder.append(b);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        g = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new ep((byte)0));
        g.put(b/a/gx, new er((byte)0));
        obj = new EnumMap(b/a/es);
        ((Map) (obj)).put(es.a, new fz("upload_traffic", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(es.b, new fz("download_traffic", (byte)1, new ga((byte)8)));
        c = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/en, c);
    }
}
