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
//            bk, gx, bm, bn, 
//            fz, ga, gn, gv, 
//            gu, fk, go

public class bi
    implements fm, Serializable, Cloneable
{

    public static final Map e;
    private static final gs f = new gs("IdJournal");
    private static final gk g = new gk("domain", (byte)11, (short)1);
    private static final gk h = new gk("old_id", (byte)11, (short)2);
    private static final gk i = new gk("new_id", (byte)11, (short)3);
    private static final gk j = new gk("ts", (byte)10, (short)4);
    private static final Map k;
    public String a;
    public String b;
    public String c;
    public long d;
    private byte l;
    private bn m[];

    public bi()
    {
        l = 0;
        m = (new bn[] {
            bn.b
        });
    }

    public static void a()
    {
    }

    public static void c()
    {
    }

    public static void d()
    {
    }

    static gs h()
    {
        return f;
    }

    static gk i()
    {
        return g;
    }

    static gk j()
    {
        return h;
    }

    static gk k()
    {
        return i;
    }

    static gk l()
    {
        return j;
    }

    public final bi a(long l1)
    {
        d = l1;
        f();
        return this;
    }

    public final bi a(String s)
    {
        a = s;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)k.get(gn1.s())).a().b(gn1, this);
    }

    public final bi b(String s)
    {
        b = s;
        return this;
    }

    public final void b(gn gn1)
    {
        ((gv)k.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean b()
    {
        return b != null;
    }

    public final bi c(String s)
    {
        c = s;
        return this;
    }

    public final boolean e()
    {
        return fk.a(l, 0);
    }

    public final void f()
    {
        l = (byte)(l | 1);
    }

    public final void g()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'domain' was not present! Struct: ")).append(toString()).toString());
        }
        if (c == null)
        {
            throw new go((new StringBuilder("Required field 'new_id' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("IdJournal(");
        stringbuilder.append("domain:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        if (b())
        {
            stringbuilder.append(", ");
            stringbuilder.append("old_id:");
            if (b == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(b);
            }
        }
        stringbuilder.append(", ");
        stringbuilder.append("new_id:");
        if (c == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(c);
        }
        stringbuilder.append(", ");
        stringbuilder.append("ts:");
        stringbuilder.append(d);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        k = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new bk((byte)0));
        k.put(b/a/gx, new bm((byte)0));
        obj = new EnumMap(b/a/bn);
        ((Map) (obj)).put(bn.a, new fz("domain", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(bn.b, new fz("old_id", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(bn.c, new fz("new_id", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(bn.d, new fz("ts", (byte)1, new ga((byte)10)));
        e = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/bi, e);
    }
}
