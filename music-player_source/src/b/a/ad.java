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
//            af, gx, ah, ai, 
//            fz, ga, gn, gv, 
//            gu, fk

public class ad
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("ClientStats");
    private static final gk f = new gk("successful_requests", (byte)8, (short)1);
    private static final gk g = new gk("failed_requests", (byte)8, (short)2);
    private static final gk h = new gk("last_request_spent_ms", (byte)8, (short)3);
    private static final Map i;
    public int a;
    public int b;
    public int c;
    private byte j;
    private ai k[];

    public ad()
    {
        j = 0;
        k = (new ai[] {
            ai.c
        });
        a = 0;
        b = 0;
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

    public final ad a(int l)
    {
        a = l;
        b();
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(j, 0);
    }

    public final ad b(int l)
    {
        b = l;
        d();
        return this;
    }

    public final void b()
    {
        j = (byte)(j | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)i.get(gn1.s())).a().a(gn1, this);
    }

    public final ad c(int l)
    {
        c = l;
        f();
        return this;
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
        StringBuilder stringbuilder = new StringBuilder("ClientStats(");
        stringbuilder.append("successful_requests:");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append("failed_requests:");
        stringbuilder.append(b);
        if (e())
        {
            stringbuilder.append(", ");
            stringbuilder.append("last_request_spent_ms:");
            stringbuilder.append(c);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new af((byte)0));
        i.put(b/a/gx, new ah((byte)0));
        obj = new EnumMap(b/a/ai);
        ((Map) (obj)).put(ai.a, new fz("successful_requests", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(ai.b, new fz("failed_requests", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(ai.c, new fz("last_request_spent_ms", (byte)2, new ga((byte)8)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ad, d);
    }
}
