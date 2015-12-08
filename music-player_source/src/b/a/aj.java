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
//            al, gx, an, ao, 
//            fz, gd, ct, gn, 
//            gv, gu

public class aj
    implements fm, Serializable, Cloneable
{

    public static final Map b;
    private static final gs c = new gs("ControlPolicy");
    private static final gk d = new gk("latent", (byte)12, (short)1);
    private static final Map e;
    public ct a;
    private ao f[];

    public aj()
    {
        f = (new ao[] {
            ao.a
        });
    }

    public static void b()
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

    public final aj a(ct ct1)
    {
        a = ct1;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)e.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return a != null;
    }

    public final void b(gn gn1)
    {
        ((gv)e.get(gn1.s())).a().a(gn1, this);
    }

    public final void c()
    {
        if (a != null)
        {
            ct ct1 = a;
            ct.e();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ControlPolicy(");
        if (a())
        {
            stringbuilder.append("latent:");
            if (a == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(a);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        e = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new al((byte)0));
        e.put(b/a/gx, new an((byte)0));
        obj = new EnumMap(b/a/ao);
        ((Map) (obj)).put(ao.a, new fz("latent", (byte)2, new gd(b/a/ct)));
        b = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/aj, b);
    }
}
