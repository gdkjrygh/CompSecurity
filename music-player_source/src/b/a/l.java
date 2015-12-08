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
//            n, gx, p, q, 
//            fz, ga, gn, gv, 
//            gu, fk

public class l
    implements fm, Serializable, Cloneable
{

    public static final Map b;
    private static final gs c = new gs("ActivateMsg");
    private static final gk d = new gk("ts", (byte)10, (short)1);
    private static final Map e;
    public long a;
    private byte f;

    public l()
    {
        f = 0;
    }

    public l(long l1)
    {
        this();
        a = l1;
        b();
    }

    public static void c()
    {
    }

    static gs d()
    {
        return c;
    }

    static gk e()
    {
        return d;
    }

    public final void a(gn gn1)
    {
        ((gv)e.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(f, 0);
    }

    public final void b()
    {
        f = (byte)(f | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)e.get(gn1.s())).a().a(gn1, this);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ActivateMsg(");
        stringbuilder.append("ts:");
        stringbuilder.append(a);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        e = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new n((byte)0));
        e.put(b/a/gx, new p((byte)0));
        obj = new EnumMap(b/a/q);
        ((Map) (obj)).put(q.a, new fz("ts", (byte)1, new ga((byte)10)));
        b = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/l, b);
    }
}
