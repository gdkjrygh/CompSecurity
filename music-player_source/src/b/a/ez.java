// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            fb, gx, fd, fe, 
//            fz, ga, gn, gv, 
//            gu, fk, go, fn

public class ez
    implements fm, Serializable, Cloneable
{

    public static final Map k;
    private static final gs l = new gs("UMEnvelope");
    private static final gk m = new gk("version", (byte)11, (short)1);
    private static final gk n = new gk("address", (byte)11, (short)2);
    private static final gk o = new gk("signature", (byte)11, (short)3);
    private static final gk p = new gk("serial_num", (byte)8, (short)4);
    private static final gk q = new gk("ts_secs", (byte)8, (short)5);
    private static final gk r = new gk("length", (byte)8, (short)6);
    private static final gk s = new gk("entity", (byte)11, (short)7);
    private static final gk t = new gk("guid", (byte)11, (short)8);
    private static final gk u = new gk("checksum", (byte)11, (short)9);
    private static final gk v = new gk("codex", (byte)8, (short)10);
    private static final Map w;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;
    private byte x;
    private fe y[];

    public ez()
    {
        x = 0;
        y = (new fe[] {
            fe.j
        });
    }

    public static void a()
    {
    }

    public static void b()
    {
    }

    public static void c()
    {
    }

    public static void j()
    {
    }

    public static void k()
    {
    }

    public static void l()
    {
    }

    static gs p()
    {
        return l;
    }

    static gk q()
    {
        return m;
    }

    static gk r()
    {
        return n;
    }

    static gk s()
    {
        return o;
    }

    static gk t()
    {
        return p;
    }

    static gk u()
    {
        return q;
    }

    static gk v()
    {
        return r;
    }

    static gk w()
    {
        return s;
    }

    static gk x()
    {
        return t;
    }

    static gk y()
    {
        return u;
    }

    static gk z()
    {
        return v;
    }

    public final ez a(int i1)
    {
        d = i1;
        e();
        return this;
    }

    public final ez a(String s1)
    {
        a = s1;
        return this;
    }

    public final ez a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = ByteBuffer.wrap(abyte0);
        }
        g = abyte0;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().b(gn1, this);
    }

    public final ez b(int i1)
    {
        e = i1;
        g();
        return this;
    }

    public final ez b(String s1)
    {
        b = s1;
        return this;
    }

    public final void b(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().a(gn1, this);
    }

    public final ez c(int i1)
    {
        f = i1;
        i();
        return this;
    }

    public final ez c(String s1)
    {
        c = s1;
        return this;
    }

    public final ez d(int i1)
    {
        j = i1;
        n();
        return this;
    }

    public final ez d(String s1)
    {
        h = s1;
        return this;
    }

    public final boolean d()
    {
        return fk.a(x, 0);
    }

    public final ez e(String s1)
    {
        i = s1;
        return this;
    }

    public final void e()
    {
        x = (byte)(x | 1);
    }

    public final boolean f()
    {
        return fk.a(x, 1);
    }

    public final void g()
    {
        x = (byte)(x | 2);
    }

    public final boolean h()
    {
        return fk.a(x, 2);
    }

    public final void i()
    {
        x = (byte)(x | 4);
    }

    public final boolean m()
    {
        return fk.a(x, 3);
    }

    public final void n()
    {
        x = (byte)(x | 8);
    }

    public final void o()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'version' was not present! Struct: ")).append(toString()).toString());
        }
        if (b == null)
        {
            throw new go((new StringBuilder("Required field 'address' was not present! Struct: ")).append(toString()).toString());
        }
        if (c == null)
        {
            throw new go((new StringBuilder("Required field 'signature' was not present! Struct: ")).append(toString()).toString());
        }
        if (g == null)
        {
            throw new go((new StringBuilder("Required field 'entity' was not present! Struct: ")).append(toString()).toString());
        }
        if (h == null)
        {
            throw new go((new StringBuilder("Required field 'guid' was not present! Struct: ")).append(toString()).toString());
        }
        if (i == null)
        {
            throw new go((new StringBuilder("Required field 'checksum' was not present! Struct: ")).append(toString()).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("UMEnvelope(");
        stringbuilder.append("version:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("address:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(b);
        }
        stringbuilder.append(", ");
        stringbuilder.append("signature:");
        if (c == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(c);
        }
        stringbuilder.append(", ");
        stringbuilder.append("serial_num:");
        stringbuilder.append(d);
        stringbuilder.append(", ");
        stringbuilder.append("ts_secs:");
        stringbuilder.append(e);
        stringbuilder.append(", ");
        stringbuilder.append("length:");
        stringbuilder.append(f);
        stringbuilder.append(", ");
        stringbuilder.append("entity:");
        if (g == null)
        {
            stringbuilder.append("null");
        } else
        {
            fn.a(g, stringbuilder);
        }
        stringbuilder.append(", ");
        stringbuilder.append("guid:");
        if (h == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(h);
        }
        stringbuilder.append(", ");
        stringbuilder.append("checksum:");
        if (i == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(i);
        }
        if (m())
        {
            stringbuilder.append(", ");
            stringbuilder.append("codex:");
            stringbuilder.append(j);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        w = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new fb((byte)0));
        w.put(b/a/gx, new fd((byte)0));
        obj = new EnumMap(b/a/fe);
        ((Map) (obj)).put(fe.a, new fz("version", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(fe.b, new fz("address", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(fe.c, new fz("signature", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(fe.d, new fz("serial_num", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(fe.e, new fz("ts_secs", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(fe.f, new fz("length", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(fe.g, new fz("entity", (byte)1, new ga((byte)11, true)));
        ((Map) (obj)).put(fe.h, new fz("guid", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(fe.i, new fz("checksum", (byte)1, new ga((byte)11)));
        ((Map) (obj)).put(fe.j, new fz("codex", (byte)2, new ga((byte)8)));
        k = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ez, k);
    }
}
