// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import com.a.a.c.a.a.c;
import com.a.a.c.a.a.d;
import com.a.a.c.a.a.e;
import com.a.a.c.a.a.f;

// Referenced classes of package com.a.a.c:
//            f, b

final class at
{
    private static final class a extends h
    {

        public a(f f1, i l)
        {
            super(3, new h[] {
                f1, l
            });
        }
    }

    private static final class b extends h
    {

        private final long a;
        private final long b;
        private final String c;
        private final String d;

        public final int a()
        {
            int l = com.a.a.c.f.b(1, a);
            int i1 = com.a.a.c.f.b(2, b);
            return l + com.a.a.c.f.b(3, com.a.a.c.b.a(c)) + i1 + com.a.a.c.f.b(4, com.a.a.c.b.a(d));
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(1, a);
            f1.a(2, b);
            f1.a(3, com.a.a.c.b.a(c));
            f1.a(4, com.a.a.c.b.a(d));
        }

        public b(com.a.a.c.a.a.a a1)
        {
            super(4, new h[0]);
            a = a1.a;
            b = a1.b;
            c = a1.c;
            d = a1.d;
        }
    }

    private static final class c extends h
    {

        private final String a;
        private final String b;

        public final int a()
        {
            int l = com.a.a.c.f.b(1, com.a.a.c.b.a(a));
            String s;
            if (b == null)
            {
                s = "";
            } else
            {
                s = b;
            }
            return com.a.a.c.f.b(2, com.a.a.c.b.a(s)) + l;
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(1, com.a.a.c.b.a(a));
            String s;
            if (b == null)
            {
                s = "";
            } else
            {
                s = b;
            }
            f1.a(2, com.a.a.c.b.a(s));
        }

        public c(com.a.a.c.a.a.b b1)
        {
            super(2, new h[0]);
            a = b1.a;
            b = b1.b;
        }
    }

    private static final class d extends h
    {

        private final float a;
        private final int b;
        private final boolean c;
        private final int d;
        private final long e;
        private final long f;

        public final int a()
        {
            return com.a.a.c.f.a() + 0 + com.a.a.c.f.c(b) + com.a.a.c.f.b(3) + com.a.a.c.f.c(4, d) + com.a.a.c.f.b(5, e) + com.a.a.c.f.b(6, f);
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(a);
            f1.a(b);
            f1.a(3, c);
            f1.a(4, d);
            f1.a(5, e);
            f1.a(6, f);
        }

        public d(float f1, int l, boolean flag, int i1, long l1, long l2)
        {
            super(5, new h[0]);
            a = f1;
            b = l;
            c = flag;
            d = i1;
            e = l1;
            f = l2;
        }
    }

    private static final class e extends h
    {

        private final long a;
        private final String b;

        public final int a()
        {
            return com.a.a.c.f.b(1, a) + com.a.a.c.f.b(2, com.a.a.c.b.a(b));
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(1, a);
            f1.a(2, com.a.a.c.b.a(b));
        }

        public e(long l, String s, a a1, d d1)
        {
            super(10, new h[] {
                a1, d1
            });
            a = l;
            b = s;
        }
    }

    private static final class f extends h
    {

        public f(j j1, i l, i i1)
        {
            super(1, new h[] {
                l, j1, i1
            });
        }
    }

    private static final class g extends h
    {

        private final long a;
        private final String b;
        private final String c;
        private final long d;
        private final int e;

        public final int a()
        {
            return com.a.a.c.f.b(1, a) + com.a.a.c.f.b(2, com.a.a.c.b.a(b)) + com.a.a.c.f.b(3, com.a.a.c.b.a(c)) + com.a.a.c.f.b(4, d) + com.a.a.c.f.c(5, e);
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(1, a);
            f1.a(2, com.a.a.c.b.a(b));
            f1.a(3, com.a.a.c.b.a(c));
            f1.a(4, d);
            f1.a(5, e);
        }

        public g(com.a.a.c.a.a.f.a a1)
        {
            super(3, new h[0]);
            a = a1.a;
            b = a1.b;
            c = a1.c;
            d = a1.d;
            e = a1.e;
        }
    }

    private static abstract class h
    {

        private final int a;
        private final h b[];

        private int c()
        {
            int i1 = a();
            h ah[] = b;
            int j1 = ah.length;
            for (int l = 0; l < j1; l++)
            {
                i1 += ah[l].b();
            }

            return i1;
        }

        public int a()
        {
            return 0;
        }

        public void a(com.a.a.c.f f1)
        {
        }

        public int b()
        {
            int l = c();
            return l + com.a.a.c.f.f(l) + com.a.a.c.f.d(a);
        }

        public void b(com.a.a.c.f f1)
        {
            f1.e(a, 2);
            f1.e(c());
            a(f1);
            h ah[] = b;
            int i1 = ah.length;
            for (int l = 0; l < i1; l++)
            {
                ah[l].b(f1);
            }

        }

        public transient h(int l, h ah[])
        {
            a = l;
            b = ah;
        }
    }

    private static final class i extends h
    {

        private final h a[];

        public final int b()
        {
            int l = 0;
            h ah[] = a;
            int j1 = ah.length;
            int i1 = 0;
            for (; l < j1; l++)
            {
                i1 += ah[l].b();
            }

            return i1;
        }

        public final void b(com.a.a.c.f f1)
        {
            h ah[] = a;
            int i1 = ah.length;
            for (int l = 0; l < i1; l++)
            {
                ah[l].b(f1);
            }

        }

        public transient i(h ah[])
        {
            super(0, new h[0]);
            a = ah;
        }
    }

    private static final class j extends h
    {

        private final String a;
        private final String b;
        private final long c;

        public final int a()
        {
            return com.a.a.c.f.b(1, com.a.a.c.b.a(a)) + com.a.a.c.f.b(2, com.a.a.c.b.a(b)) + com.a.a.c.f.b(3, c);
        }

        public final void a(com.a.a.c.f f1)
        {
            f1.a(1, com.a.a.c.b.a(a));
            f1.a(2, com.a.a.c.b.a(b));
            f1.a(3, c);
        }

        public j(com.a.a.c.a.a.e e1)
        {
            super(3, new h[0]);
            a = e1.a;
            b = e1.b;
            c = e1.c;
        }
    }

    private static final class k extends h
    {

        private final String a;
        private final int b;

        private boolean c()
        {
            return a != null && a.length() > 0;
        }

        public final int a()
        {
            int l;
            if (c())
            {
                l = com.a.a.c.f.b(1, com.a.a.c.b.a(a));
            } else
            {
                l = 0;
            }
            return l + com.a.a.c.f.c(2, b);
        }

        public final void a(com.a.a.c.f f1)
        {
            if (c())
            {
                f1.a(1, com.a.a.c.b.a(a));
            }
            f1.a(2, b);
        }

        public k(com.a.a.c.a.a.f f1, i l)
        {
            super(1, new h[] {
                l
            });
            a = f1.a;
            b = f1.b;
        }
    }


    private static final com.a.a.c.a.a.e a = new com.a.a.c.a.a.e("", "");
    private static final h b[] = new h[0];
    private static final k c[] = new k[0];
    private static final g d[] = new g[0];
    private static final b e[] = new b[0];
    private static final c f[] = new c[0];

    private static i a(com.a.a.c.a.a.f.a aa[])
    {
        g ag[];
        int l;
        if (aa != null)
        {
            ag = new g[aa.length];
        } else
        {
            ag = d;
        }
        for (l = 0; l < ag.length; l++)
        {
            ag[l] = new g(aa[l]);
        }

        return new i(ag);
    }

    public static void a(com.a.a.c.a.a.d d1, com.a.a.c.f f1)
    {
        boolean flag = false;
        Object aobj[];
        Object obj;
        Object aobj1[];
        int i1;
        if (d1.b != null)
        {
            aobj = d1.b;
        } else
        {
            aobj = a;
        }
        obj = new j(((com.a.a.c.a.a.e) (aobj)));
        aobj1 = d1.c;
        if (aobj1 != null)
        {
            aobj = new k[aobj1.length];
        } else
        {
            aobj = c;
        }
        for (i1 = 0; i1 < aobj.length; i1++)
        {
            com.a.a.c.a.a.f f2 = aobj1[i1];
            aobj[i1] = new k(f2, a(f2.c));
        }

        i l = new i(((h []) (aobj)));
        com.a.a.c.a.a.a aa[] = d1.d;
        if (aa != null)
        {
            aobj = new b[aa.length];
        } else
        {
            aobj = e;
        }
        for (i1 = 0; i1 < aobj.length; i1++)
        {
            aobj[i1] = new b(aa[i1]);
        }

        obj = new f(((j) (obj)), l, new i(((h []) (aobj))));
        l = d1.e;
        if (l != null)
        {
            aobj = new c[l.length];
            i1 = ((flag) ? 1 : 0);
        } else
        {
            aobj = f;
            i1 = ((flag) ? 1 : 0);
        }
        for (; i1 < aobj.length; i1++)
        {
            aobj[i1] = new c(l[i1]);
        }

        a a1 = new a(((f) (obj)), new i(((h []) (aobj))));
        obj = d1.f;
        obj = new d((float)((com.a.a.c.a.a.c) (obj)).f / 100F, ((com.a.a.c.a.a.c) (obj)).g, ((com.a.a.c.a.a.c) (obj)).h, ((com.a.a.c.a.a.c) (obj)).a, ((com.a.a.c.a.a.c) (obj)).b - ((com.a.a.c.a.a.c) (obj)).d, ((com.a.a.c.a.a.c) (obj)).c - ((com.a.a.c.a.a.c) (obj)).e);
        (new e(d1.a, "ndk-crash", a1, ((d) (obj)))).b(f1);
    }

}
