// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, an, g, f

final class bf
{
    public static interface a
    {
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b f[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/microsoft/advertising/android/bf$b, s);
        }

        public static b[] values()
        {
            b ab[] = f;
            int k = ab.length;
            b ab1[] = new b[k];
            System.arraycopy(ab, 0, ab1, 0, k);
            return ab1;
        }

        static 
        {
            a = new b("DEFAULT", 0);
            b = new b("RESIZED", 1);
            c = new b("EXPANDED", 2);
            d = new b("HIDDEN", 3);
            e = new b("SUSPENDED", 4);
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }
    }


    private static int i[];
    boolean a;
    private b b;
    private b c;
    private boolean d;
    private boolean e;
    private final g f;
    private final AdWebView g;
    private a h;

    public bf(g g1, AdWebView adwebview)
    {
        this(g1, adwebview, b.a);
    }

    private bf(g g1, AdWebView adwebview, b b1)
    {
        b = b.a;
        c = b.a;
        d = false;
        e = false;
        a = false;
        b = b1;
        f = g1;
        g = adwebview;
        if (g1 == null || adwebview == null)
        {
            throw new IllegalArgumentException("null parameter");
        } else
        {
            return;
        }
    }

    private boolean a(b b1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        flag = true;
        if (b1 == null)
        {
            return false;
        }
        j()[b1.ordinal()];
        JVM INSTR tableswitch 2 4: default 48
    //                   2 125
    //                   3 105
    //                   4 87;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = true;
_L6:
        if (!flag)
        {
            a("Error: (hide: Cannot hide an ad that is not in the default state.)");
            g.c((new StringBuilder("cannot move to state ")).append(b1).toString(), "Error: (hide: Cannot hide an ad that is not in the default state.)");
        }
        return flag;
_L4:
        if (b != b.a)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b == b.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (b == b.a)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static int[] j()
    {
        int ai[] = i;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[b.values().length];
        try
        {
            ai[b.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[b.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[b.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[b.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[b.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        i = ai;
        return ai;
    }

    public final void a(String s)
    {
        if (h != null)
        {
            a = true;
            if (s != null)
            {
                s.replace(";", "&");
            }
        }
    }

    public final void a(boolean flag)
    {
        if (d)
        {
            return;
        }
        if (b == b.c || b == b.b)
        {
            g.f();
        }
        c = b;
        b = b.e;
        if (flag)
        {
            g.k().a(b.e);
            e = true;
        } else
        {
            e = false;
        }
        d = true;
    }

    public final boolean a()
    {
        return d;
    }

    public final boolean b()
    {
        return b == b.c;
    }

    public final void c()
    {
        if (b == b.d)
        {
            a("");
            f.b().e();
            b = b.a;
        }
    }

    public final boolean d()
    {
        if (a(b.b))
        {
            b = b.b;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean e()
    {
        if (a(b.c))
        {
            a("");
            b = b.c;
            return true;
        } else
        {
            return false;
        }
    }

    public final void f()
    {
        switch (j()[b.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            a("viewState=resized");
            b = b.a;
            g.i();
            return;

        case 3: // '\003'
            b = b.a;
            break;
        }
        g.h();
    }

    public final void g()
    {
        if (!d)
        {
            return;
        }
        b b1;
        if (c == b.d)
        {
            b1 = c;
        } else
        {
            b1 = b.a;
        }
        b = b1;
        if (e)
        {
            g.k().a(b);
            e = false;
        }
        d = false;
    }

    public final boolean h()
    {
        return b == b.c || b == b.b;
    }

    public final b i()
    {
        return b;
    }
}
