// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import com.kik.f.a.a.c;

// Referenced classes of package kik.a.d:
//            j

public class k
{

    protected final j a;
    protected String b;
    protected String c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected byte g[];
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected int l;
    protected String m;
    protected String n;
    protected boolean o;
    protected c p;
    protected boolean q;

    private k(j j1, String s1)
    {
        this(j1, s1, (byte)0);
    }

    private k(j j1, String s1, byte byte0)
    {
        this(j1, null, s1, false, "0", null, false);
    }

    public k(j j1, String s1, String s2, boolean flag, String s3, String s4)
    {
        this(j1, s1, s2, flag, s3, s4, flag);
    }

    public k(j j1, String s1, String s2, boolean flag, String s3, String s4, boolean flag1)
    {
        this(j1, s1, s2, flag, false, s3, s4, false, false, flag1, false, false, 0, false, null, false);
    }

    public k(j j1, String s1, String s2, boolean flag, boolean flag1, String s3, String s4, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int i1, boolean flag7, 
            byte abyte0[], boolean flag8)
    {
        m = "0";
        if (j1 == null || j1.c() == null || j1.d() == null)
        {
            throw new IllegalArgumentException("Invalid JID");
        }
        if (s3 == null || s3.equals("0"))
        {
            s3 = "0";
        } else
        {
            s3 = (new StringBuilder()).append(s3.substring(0, s3.length() - 3)).append("000").toString();
        }
        m = s3;
        n = s4;
        a = new j(j1.c(), j1.d(), null);
        b = s1;
        c = s2;
        h = flag;
        d = flag1;
        i = flag2;
        e = flag3;
        j = flag4;
        k = flag5;
        q = flag6;
        l = i1;
        f = flag7;
        g = abyte0;
        o = flag8;
    }

    public static k a(String s1)
    {
        s1 = new k(kik.a.d.j.a(s1), "");
        s1.d = true;
        return s1;
    }

    public static k a(k k1)
    {
        k k2 = new k(k1.a, "");
        k2.c(k1);
        return k2;
    }

    public final j a()
    {
        return a;
    }

    public final void a(int i1)
    {
        l = i1;
    }

    public final void a(c c1)
    {
        p = c1;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final void a(byte abyte0[])
    {
        g = abyte0;
    }

    public final String b()
    {
        return a.a();
    }

    public final void b(String s1)
    {
        b = s1;
    }

    public final void b(k k1)
    {
        h = k1.h;
        i = k1.i;
        j = k1.j;
        k = k1.k;
        l = k1.l;
    }

    public final void b(boolean flag)
    {
        f = flag;
    }

    public String c()
    {
        return b;
    }

    public final void c(String s1)
    {
        n = s1;
    }

    public void c(k k1)
    {
        if (a.a(k1.a))
        {
            b = k1.b;
            c = k1.c;
            d = k1.d;
            m = k1.m;
            n = k1.n;
            e = k1.e;
            f = k1.f;
            g = k1.g;
            o = k1.o;
            p = k1.p;
            q = k1.q;
            b(k1);
        }
    }

    public final void c(boolean flag)
    {
        o = flag;
    }

    public final c d()
    {
        return p;
    }

    public final void d(boolean flag)
    {
        h = flag;
    }

    public final String e()
    {
        if (c == null)
        {
            return "";
        } else
        {
            return c;
        }
    }

    public final void e(boolean flag)
    {
        i = flag;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof k))
        {
            obj = (k)obj;
            return a.a().equals(((k) (obj)).a.a());
        } else
        {
            return false;
        }
    }

    public final int f()
    {
        return l;
    }

    public final void f(boolean flag)
    {
        j = flag;
    }

    public final void g(boolean flag)
    {
        k = flag;
    }

    public final boolean g()
    {
        return d;
    }

    public final void h(boolean flag)
    {
        q = flag;
    }

    public final boolean h()
    {
        return e;
    }

    public int hashCode()
    {
        return a.a().hashCode() + 31;
    }

    public final boolean i()
    {
        return f;
    }

    public final byte[] j()
    {
        return g;
    }

    public final boolean k()
    {
        return o;
    }

    public final boolean l()
    {
        return j;
    }

    public final boolean m()
    {
        return k;
    }

    public final boolean n()
    {
        return h;
    }

    public final boolean o()
    {
        return i;
    }

    public final boolean p()
    {
        return j;
    }

    public final boolean q()
    {
        return k;
    }

    public final String r()
    {
        return n;
    }

    public final String s()
    {
        return m;
    }

    public boolean t()
    {
        return false;
    }

    public final boolean u()
    {
        return q;
    }

    public final boolean v()
    {
        return q || j;
    }
}
