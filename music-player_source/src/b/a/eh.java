// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            ej, gx, el, em, 
//            fz, ga, gb, gd, 
//            dl, cz, en, gn, 
//            gv, gu, fk, go

public class eh
    implements fm, Serializable, Cloneable
{

    public static final Map h;
    private static final gs i = new gs("Session");
    private static final gk j = new gk("id", (byte)11, (short)1);
    private static final gk k = new gk("start_time", (byte)10, (short)2);
    private static final gk l = new gk("end_time", (byte)10, (short)3);
    private static final gk m = new gk("duration", (byte)10, (short)4);
    private static final gk n = new gk("pages", (byte)15, (short)5);
    private static final gk o = new gk("locations", (byte)15, (short)6);
    private static final gk p = new gk("traffic", (byte)12, (short)7);
    private static final Map q;
    public String a;
    public long b;
    public long c;
    public long d;
    public List e;
    public List f;
    public en g;
    private byte r;
    private em s[];

    public eh()
    {
        r = 0;
        s = (new em[] {
            em.e, em.f, em.g
        });
    }

    public static void a()
    {
    }

    public static void j()
    {
    }

    public static void l()
    {
    }

    public static void n()
    {
    }

    static gs p()
    {
        return i;
    }

    static gk q()
    {
        return j;
    }

    static gk r()
    {
        return k;
    }

    static gk s()
    {
        return l;
    }

    static gk t()
    {
        return m;
    }

    static gk u()
    {
        return n;
    }

    static gk v()
    {
        return o;
    }

    static gk w()
    {
        return p;
    }

    public final eh a(long l1)
    {
        b = l1;
        c();
        return this;
    }

    public final eh a(en en1)
    {
        g = en1;
        return this;
    }

    public final eh a(String s1)
    {
        a = s1;
        return this;
    }

    public final eh a(List list)
    {
        e = list;
        return this;
    }

    public final void a(cz cz1)
    {
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(cz1);
    }

    public final void a(gn gn1)
    {
        ((gv)q.get(gn1.s())).a().b(gn1, this);
    }

    public final eh b(long l1)
    {
        c = l1;
        e();
        return this;
    }

    public final eh b(List list)
    {
        f = list;
        return this;
    }

    public final void b(gn gn1)
    {
        ((gv)q.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean b()
    {
        return fk.a(r, 0);
    }

    public final eh c(long l1)
    {
        d = l1;
        g();
        return this;
    }

    public final void c()
    {
        r = (byte)(r | 1);
    }

    public final boolean d()
    {
        return fk.a(r, 1);
    }

    public final void e()
    {
        r = (byte)(r | 2);
    }

    public final boolean f()
    {
        return fk.a(r, 2);
    }

    public final void g()
    {
        r = (byte)(r | 4);
    }

    public final int h()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.size();
        }
    }

    public final boolean i()
    {
        return e != null;
    }

    public final boolean k()
    {
        return f != null;
    }

    public final boolean m()
    {
        return g != null;
    }

    public final void o()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'id' was not present! Struct: ")).append(toString()).toString());
        }
        if (g != null)
        {
            en en1 = g;
            en.e();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Session(");
        stringbuilder.append("id:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("start_time:");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        stringbuilder.append("end_time:");
        stringbuilder.append(c);
        stringbuilder.append(", ");
        stringbuilder.append("duration:");
        stringbuilder.append(d);
        if (i())
        {
            stringbuilder.append(", ");
            stringbuilder.append("pages:");
            if (e == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(e);
            }
        }
        if (k())
        {
            stringbuilder.append(", ");
            stringbuilder.append("locations:");
            if (f == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(f);
            }
        }
        if (m())
        {
            stringbuilder.append(", ");
            stringbuilder.append("traffic:");
            if (g == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(g);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        q = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new ej((byte)0));
        q.put(b/a/gx, new el((byte)0));
        obj = new EnumMap(b/a/em);
        ((Map) (obj)).put(em.a, new fz("id", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(em.b, new fz("start_time", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(em.c, new fz("end_time", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(em.d, new fz("duration", (byte)1, new ga((byte)10)));
        ((Map) (obj)).put(em.e, new fz("pages", (byte)2, new gb(new gd(b/a/dl))));
        ((Map) (obj)).put(em.f, new fz("locations", (byte)2, new gb(new gd(b/a/cz))));
        ((Map) (obj)).put(em.g, new fz("traffic", (byte)2, new gd(b/a/en)));
        h = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/eh, h);
    }
}
