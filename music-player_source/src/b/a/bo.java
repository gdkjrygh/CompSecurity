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
//            bq, gx, bs, bt, 
//            fz, ga, gn, gv, 
//            gu, fk, go

public class bo
    implements fm, Serializable, Cloneable
{

    public static final Map d;
    private static final gs e = new gs("IdSnapshot");
    private static final gk f = new gk("identity", (byte)11, (short)1);
    private static final gk g = new gk("ts", (byte)10, (short)2);
    private static final gk h = new gk("version", (byte)8, (short)3);
    private static final Map i;
    public String a;
    public long b;
    public int c;
    private byte j;

    public bo()
    {
        j = 0;
    }

    public static void b()
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

    public final bo a(int i1)
    {
        c = i1;
        h();
        return this;
    }

    public final bo a(long l1)
    {
        b = l1;
        e();
        return this;
    }

    public final bo a(String s)
    {
        a = s;
        return this;
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

    public final long c()
    {
        return b;
    }

    public final boolean d()
    {
        return fk.a(j, 0);
    }

    public final void e()
    {
        j = (byte)(j | 1);
    }

    public final int f()
    {
        return c;
    }

    public final boolean g()
    {
        return fk.a(j, 1);
    }

    public final void h()
    {
        j = (byte)(j | 2);
    }

    public final void i()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'identity' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("IdSnapshot(");
        stringbuilder.append("identity:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("ts:");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        stringbuilder.append("version:");
        stringbuilder.append(c);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new bq((byte)0));
        i.put(b/a/gx, new bs((byte)0));
        obj = new EnumMap(b/a/bt);
        ((Map) (obj)).put(bt.a, new fz("identity", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(bt.b, new fz("ts", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(bt.c, new fz("version", (byte)1, new ga((byte)8)));
        d = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/bo, d);
    }
}
