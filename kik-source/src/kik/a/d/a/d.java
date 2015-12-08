// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;

import kik.a.d.j;
import kik.a.h.i;

// Referenced classes of package kik.a.d.a:
//            g

public class d extends g
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(kik/a/d/a/d$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("ADDRESS_BOOK_MATCHING", 0);
            b = new a("EXPLICIT_USERNAME_SEARCH", 1);
            c = new a("INLINE_USERNAME_SEARCH", 2);
            d = new a("UNKNOWN", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    boolean a;
    private int b;
    private a c;
    private j d;
    private String e;
    private long f;
    private boolean g;

    public d(int k)
    {
        this(null, null, false, null, 0L);
        b = k;
    }

    public d(String s, String s1, boolean flag, String s2, long l)
    {
        super(true, true);
        g = true;
        a(s);
        b(s1);
        e = s2;
        a = flag;
        f = l;
    }

    public final a a()
    {
        return c;
    }

    public final void a(int k)
    {
        b = k;
    }

    public final void a(long l)
    {
        f = l;
    }

    public final void a(String s)
    {
        if ("address-book-matching".equals(s))
        {
            c = a.a;
            return;
        }
        if ("explicit-username-search".equals(s))
        {
            c = a.b;
            return;
        }
        if ("inline-username-search".equals(s))
        {
            c = a.c;
            return;
        } else
        {
            c = a.d;
            return;
        }
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final String b()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return "address-book-matching";

        case 2: // '\002'
            return "explicit-username-search";

        case 3: // '\003'
            return "inline-username-search";
        }
    }

    public final void b(String s)
    {
        if (s != null)
        {
            d = j.a(s);
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public final void c()
    {
        g = false;
    }

    public final void c(String s)
    {
        e = s;
    }

    public final j d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final boolean f()
    {
        return a;
    }

    public final boolean g()
    {
        return g && !kik.a.h.i.a(e);
    }

    public final long h()
    {
        return f;
    }

    public final int i()
    {
        return b;
    }
}
