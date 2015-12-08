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
//            z, gx, ab, ac, 
//            fz, ga, fy, eg, 
//            gn, gv, gu, fk, 
//            go

public class x
    implements fm, Serializable, Cloneable
{

    public static final Map k;
    private static final gs l = new gs("AppInfo");
    private static final gk m = new gk("key", (byte)11, (short)1);
    private static final gk n = new gk("version", (byte)11, (short)2);
    private static final gk o = new gk("version_index", (byte)8, (short)3);
    private static final gk p = new gk("package_name", (byte)11, (short)4);
    private static final gk q = new gk("sdk_type", (byte)8, (short)5);
    private static final gk r = new gk("sdk_version", (byte)11, (short)6);
    private static final gk s = new gk("channel", (byte)11, (short)7);
    private static final gk t = new gk("wrapper_type", (byte)11, (short)8);
    private static final gk u = new gk("wrapper_version", (byte)11, (short)9);
    private static final gk v = new gk("vertical_type", (byte)8, (short)10);
    private static final Map w;
    public String a;
    public String b;
    public int c;
    public String d;
    public eg e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    private byte x;
    private ac y[];

    public x()
    {
        x = 0;
        y = (new ac[] {
            ac.b, ac.c, ac.d, ac.h, ac.i, ac.j
        });
    }

    static gk A()
    {
        return u;
    }

    static gk B()
    {
        return v;
    }

    public static void a()
    {
    }

    public static void c()
    {
    }

    public static void g()
    {
    }

    public static void h()
    {
    }

    public static void i()
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

    static gs r()
    {
        return l;
    }

    static gk s()
    {
        return m;
    }

    static gk t()
    {
        return n;
    }

    static gk u()
    {
        return o;
    }

    static gk v()
    {
        return p;
    }

    static gk w()
    {
        return q;
    }

    static gk x()
    {
        return r;
    }

    static gk y()
    {
        return s;
    }

    static gk z()
    {
        return t;
    }

    public final x a(int i1)
    {
        c = i1;
        e();
        return this;
    }

    public final x a(eg eg1)
    {
        e = eg1;
        return this;
    }

    public final x a(String s1)
    {
        a = s1;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().b(gn1, this);
    }

    public final x b(int i1)
    {
        j = i1;
        p();
        return this;
    }

    public final x b(String s1)
    {
        b = s1;
        return this;
    }

    public final void b(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean b()
    {
        return b != null;
    }

    public final x c(String s1)
    {
        d = s1;
        return this;
    }

    public final x d(String s1)
    {
        f = s1;
        return this;
    }

    public final boolean d()
    {
        return fk.a(x, 0);
    }

    public final x e(String s1)
    {
        g = s1;
        return this;
    }

    public final void e()
    {
        x = (byte)(x | 1);
    }

    public final x f(String s1)
    {
        h = s1;
        return this;
    }

    public final boolean f()
    {
        return d != null;
    }

    public final x g(String s1)
    {
        i = s1;
        return this;
    }

    public final boolean k()
    {
        return h != null;
    }

    public final boolean m()
    {
        return i != null;
    }

    public final boolean o()
    {
        return fk.a(x, 1);
    }

    public final void p()
    {
        x = (byte)(x | 2);
    }

    public final void q()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'key' was not present! Struct: ")).append(toString()).toString());
        }
        if (e == null)
        {
            throw new go((new StringBuilder("Required field 'sdk_type' was not present! Struct: ")).append(toString()).toString());
        }
        if (f == null)
        {
            throw new go((new StringBuilder("Required field 'sdk_version' was not present! Struct: ")).append(toString()).toString());
        }
        if (g == null)
        {
            throw new go((new StringBuilder("Required field 'channel' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("AppInfo(");
        stringbuilder.append("key:");
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
            stringbuilder.append("version:");
            if (b == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(b);
            }
        }
        if (d())
        {
            stringbuilder.append(", ");
            stringbuilder.append("version_index:");
            stringbuilder.append(c);
        }
        if (f())
        {
            stringbuilder.append(", ");
            stringbuilder.append("package_name:");
            if (d == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(d);
            }
        }
        stringbuilder.append(", ");
        stringbuilder.append("sdk_type:");
        if (e == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(e);
        }
        stringbuilder.append(", ");
        stringbuilder.append("sdk_version:");
        if (f == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(f);
        }
        stringbuilder.append(", ");
        stringbuilder.append("channel:");
        if (g == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(g);
        }
        if (k())
        {
            stringbuilder.append(", ");
            stringbuilder.append("wrapper_type:");
            if (h == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(h);
            }
        }
        if (m())
        {
            stringbuilder.append(", ");
            stringbuilder.append("wrapper_version:");
            if (i == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(i);
            }
        }
        if (o())
        {
            stringbuilder.append(", ");
            stringbuilder.append("vertical_type:");
            stringbuilder.append(j);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        w = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new z((byte)0));
        w.put(b/a/gx, new ab((byte)0));
        obj = new EnumMap(b/a/ac);
        ((Map) (obj)).put(ac.a, new fz("key", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(ac.b, new fz("version", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(ac.c, new fz("version_index", (byte)2, new ga((byte)8)));
        ((Map) (obj)).put(ac.d, new fz("package_name", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(ac.e, new fz("sdk_type", (byte)1, new fy(b/a/eg)));
        ((Map) (obj)).put(ac.f, new fz("sdk_version", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(ac.g, new fz("channel", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(ac.h, new fz("wrapper_type", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(ac.i, new fz("wrapper_version", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(ac.j, new fz("vertical_type", (byte)2, new ga((byte)8)));
        k = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/x, k);
    }
}
