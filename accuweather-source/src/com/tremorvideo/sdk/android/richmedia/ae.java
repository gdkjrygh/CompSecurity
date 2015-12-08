// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ah, z, a, n, 
//            k, e

public class ae extends ah
{
    private class a extends ah.a
    {

        public int a;
        public int b;
        public int c;
        final ae d;

        public void a(e e1)
        {
            b(e1);
            try
            {
                e = e1.b();
                a = e1.b();
                c = e1.b();
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
            d = ae.this;
            super(ae.this);
        }

    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/ae$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("Idle", 0);
            b = new b("Hover", 1);
            c = new b("Cancel", 2);
            d = new b("Drop", 3);
            e = (new b[] {
                a, b, c, d
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
    int p;
    z q;

    public ae(z z1)
    {
        super(z1);
        l = b.a;
        m = 0L;
        n = 0;
        o = 0;
        p = 0;
        q = null;
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
        } else
        if (l == b.d)
        {
            i = a2.c;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(n n1, long l1)
    {
        if (l != b.b) goto _L2; else goto _L1
_L1:
        m = Math.min(q.c() - 1L, m + l1);
_L4:
        return;
_L2:
        if (l != b.c)
        {
            break; /* Loop/switch isn't completed */
        }
        m = Math.min(q.c() - 1L, m + l1);
        if (m == q.c() - 1L)
        {
            l = b.a;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (l == b.d)
        {
            m = Math.min(q.c() - 1L, m + l1);
            if (m == q.c() - 1L)
            {
                l = b.a;
                n1.b(super.a(i.c.k));
                return;
            }
        } else
        {
            super.a(n1, l1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
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
        }
        if (l == b.d)
        {
            return m;
        } else
        {
            return l1 % g.f().b(a1.e).c();
        }
    }

    public i.a b(boolean flag)
    {
        if (l != b.a && l != b.c || !flag) goto _L2; else goto _L1
_L1:
        l = b.b;
        q = g.f().b(n);
        m = 0L;
_L4:
        return null;
_L2:
        if (l == b.b && !flag)
        {
            l = b.c;
            q = g.f().b(o);
            m = 0L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public i.a c(boolean flag)
    {
        if (l == b.b)
        {
            if (flag)
            {
                l = b.d;
                q = g.f().b(p);
                m = 0L;
            } else
            {
                l = b.c;
                q = g.f().b(o);
                m = 0L;
            }
        }
        return null;
    }

    public boolean d()
    {
        return true;
    }

    public void f()
    {
        l = b.a;
        m = 0L;
        a a1 = (a)f.get(0);
        n = a1.a;
        o = a1.b;
        p = a1.c;
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
