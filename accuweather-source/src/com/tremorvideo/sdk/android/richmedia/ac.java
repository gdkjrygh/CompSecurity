// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ah, z, a, n, 
//            k, e

public class ac extends ah
{
    private class a extends ah.a
    {

        public int a;
        public int b;
        final ac c;

        public void a(e e1)
        {
            b(e1);
            try
            {
                e = e1.b();
                a = e1.b();
                b = e1.b();
                f = e1.d();
                g = e1.b();
                h = e1.d();
                i = e1.b();
                j = 0;
                k = e1.d();
                l = e1.b();
                m = e1.d();
                n = e1.b();
                o = e1.d();
                p = e1.b();
                q = e1.d();
                r = e1.b();
                s = e1.f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
        }

        private a()
        {
            c = ac.this;
            super(ac.this);
        }

    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/ac$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("Idle", 0);
            b = new b("Press", 1);
            c = new b("Release", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    b l;
    long m;
    int n;
    int o;
    z p;
    boolean q;

    public ac(z z1)
    {
        super(z1);
        l = b.a;
        m = 0L;
        n = 0;
        o = 0;
        p = null;
        q = false;
    }

    public i.a a(boolean flag)
    {
        if (l == b.b)
        {
            l = b.c;
            p = g.f().b(o);
            m = 0L;
        }
        q = flag;
        return null;
    }

    public z a(ah.a a1, long l1)
    {
        a a2;
        int i;
        a2 = (a)a1;
        i = a1.e;
        if (l != b.b) goto _L2; else goto _L1
_L1:
        i = a2.a;
_L4:
        return g.f().b(i);
_L2:
        if (l == b.c)
        {
            i = a2.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(n n1, long l1)
    {
        if (l == b.b)
        {
            m = Math.min(p.c() - 1L, m + l1);
        } else
        if (l == b.c)
        {
            m = Math.min(p.c() - 1L, m + l1);
            if (m == p.c() - 1L)
            {
                boolean flag = q;
                q = false;
                l = b.a;
                if (flag)
                {
                    n1.b(super.a(i.c.d));
                    return;
                }
            }
        } else
        {
            super.a(n1, l1);
            return;
        }
    }

    protected long b(ah.a a1, long l1)
    {
        if (l == b.b)
        {
            return m;
        }
        if (l == b.c)
        {
            return m;
        } else
        {
            return l1 % g.f().b(a1.e).c();
        }
    }

    public boolean d()
    {
        return true;
    }

    public void f()
    {
        l = b.a;
        m = 0L;
        q = false;
        a a1 = (a)f.get(0);
        n = a1.a;
        o = a1.b;
    }

    public i.a g()
    {
        if (l == b.a)
        {
            l = b.b;
            p = g.f().b(n);
            m = 0L;
        }
        return null;
    }

    protected k h()
    {
        return j();
    }

    protected ah.a j()
    {
        return new a();
    }
}
