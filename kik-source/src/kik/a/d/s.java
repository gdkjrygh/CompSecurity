// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.List;
import java.util.Vector;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.a.m;
import kik.a.f.l;
import kik.a.h.j;

public final class s
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    private String a;
    private String b;
    private boolean c;
    private int d;
    private int e;
    private String f;
    private boolean g;
    private boolean h;
    private List i;
    private Vector j;
    private long k;
    private boolean l;
    private byte m[];
    private long n;
    private int o;

    public s(String s1, String s2, boolean flag, String s3, long l1, int i1, 
            boolean flag1, int j1, byte abyte0[])
    {
        g = false;
        h = false;
        i = null;
        o = a.a;
        a = s1;
        b = s2;
        c = flag;
        d = i1;
        f = s3;
        k = l1;
        j = new Vector();
        g = flag1;
        e = j1;
        m = abyte0;
    }

    private s(String s1, String s2, boolean flag, String s3, long l1, int i1, 
            byte abyte0[])
    {
        this(s1, s2, flag, s3, l1, i1, abyte0, (byte)0);
    }

    private s(String s1, String s2, boolean flag, String s3, long l1, int i1, 
            byte abyte0[], byte byte0)
    {
        this(s1, s2, flag, s3, l1, i1, false, 0, abyte0);
    }

    public static s a(String s1)
    {
        return a(s1, a.a);
    }

    private static s a(String s1, int i1)
    {
        s1 = new s(s1, s1, true, String.valueOf(kik.a.f.l.a()), kik.a.h.j.b(), 100, null);
        s1.o = i1;
        return s1;
    }

    public static s a(String s1, String s2, int i1)
    {
        s2 = a(s2, i1);
        s2.a(((g) (new h(s1))));
        return s2;
    }

    public static s a(String s1, String s2, String s3, long l1, byte abyte0[])
    {
        return new s(s1, s2, false, s3, l1, 400, abyte0);
    }

    public final String a()
    {
        Object obj = (h)kik.a.d.a.g.a(this, kik/a/d/a/h);
        if (obj != null)
        {
            return ((h) (obj)).a();
        }
        obj = (m)kik.a.d.a.g.a(this, kik/a/d/a/m);
        if (obj != null)
        {
            return ((m) (obj)).a();
        }
        obj = (kik.a.d.a.l)kik.a.d.a.g.a(this, kik/a/d/a/l);
        if (obj != null)
        {
            return ((kik.a.d.a.l) (obj)).a();
        } else
        {
            return null;
        }
    }

    final void a(int i1)
    {
        if (i1 == -100)
        {
            d = i1;
        } else
        if (i1 > d)
        {
            d = i1;
            return;
        }
    }

    public final void a(long l1)
    {
        n = l1;
    }

    public final void a(List list)
    {
        i = list;
    }

    public final void a(g g1)
    {
        j.add(g1);
    }

    public final void a(boolean flag)
    {
        g = flag;
    }

    public final void a(byte abyte0[])
    {
        m = abyte0;
    }

    public final String b()
    {
        return f;
    }

    public final void b(boolean flag)
    {
        l = flag;
    }

    public final int c()
    {
        return d;
    }

    public final boolean d()
    {
        return c;
    }

    public final long e()
    {
        return k;
    }

    public final int f()
    {
        return e;
    }

    public final void g()
    {
        e = e + 1;
    }

    public final String h()
    {
        return b;
    }

    public final String i()
    {
        return a;
    }

    public final boolean j()
    {
        return g;
    }

    public final boolean k()
    {
        return l;
    }

    public final Vector l()
    {
        return j;
    }

    public final boolean m()
    {
        return h;
    }

    public final void n()
    {
        h = true;
    }

    public final byte[] o()
    {
        return m;
    }

    public final long p()
    {
        return n;
    }

    public final List q()
    {
        return i;
    }

    public final int r()
    {
        return o;
    }

    public final String toString()
    {
        return (new StringBuilder("message: ")).append(a()).toString();
    }
}
