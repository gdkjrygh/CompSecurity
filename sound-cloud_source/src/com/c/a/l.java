// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.i;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.c.a:
//            h, D

public final class l
{
    public static final class a
    {

        boolean a;
        String b[];
        String c[];
        boolean d;

        public final a a()
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            } else
            {
                d = true;
                return this;
            }
        }

        public final transient a a(D ad[])
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String as[] = new String[ad.length];
            for (int j = 0; j < ad.length; j++)
            {
                as[j] = ad[j].e;
            }

            c = as;
            return this;
        }

        public final transient a a(String as[])
        {
            if (!a)
            {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (as == null)
            {
                b = null;
                return this;
            } else
            {
                b = (String[])as.clone();
                return this;
            }
        }

        public final transient a b(String as[])
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (as == null)
            {
                c = null;
                return this;
            } else
            {
                c = (String[])as.clone();
                return this;
            }
        }

        public final l b()
        {
            return new l(this, (byte)0);
        }

        public a(l l1)
        {
            a = l1.d;
            b = l.a(l1);
            c = l.b(l1);
            d = l1.g;
        }

        a(boolean flag)
        {
            a = flag;
        }
    }


    public static final l a;
    public static final l b;
    public static final l c = (new a(false)).b();
    public final boolean d;
    final String e[];
    final String f[];
    final boolean g;

    private l(a a1)
    {
        d = a1.a;
        e = a1.b;
        f = a1.c;
        g = a1.d;
    }

    l(a a1, byte byte0)
    {
        this(a1);
    }

    private List a()
    {
        D ad[] = new D[f.length];
        for (int j = 0; j < f.length; j++)
        {
            ad[j] = D.a(f[j]);
        }

        return i.a(ad);
    }

    static String[] a(l l1)
    {
        return l1.e;
    }

    static String[] b(l l1)
    {
        return l1.f;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof l)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (l)obj;
            if (d == ((l) (obj)).d && (!d || Arrays.equals(e, ((l) (obj)).e) && Arrays.equals(f, ((l) (obj)).f) && g == ((l) (obj)).g))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = 17;
        if (d)
        {
            int k = Arrays.hashCode(e);
            int i1 = Arrays.hashCode(f);
            if (g)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            j += ((k + 527) * 31 + i1) * 31;
        }
        return j;
    }

    public final String toString()
    {
        if (d)
        {
            Object obj;
            if (e == null)
            {
                obj = null;
            } else
            {
                obj = new h[e.length];
                for (int j = 0; j < e.length; j++)
                {
                    obj[j] = h.a(e[j]);
                }

                obj = i.a(((Object []) (obj)));
            }
            if (obj == null)
            {
                obj = "[use default]";
            } else
            {
                obj = obj.toString();
            }
            return (new StringBuilder("ConnectionSpec(cipherSuites=")).append(((String) (obj))).append(", tlsVersions=").append(a()).append(", supportsTlsExtensions=").append(g).append(")").toString();
        } else
        {
            return "ConnectionSpec()";
        }
    }

    static 
    {
        a a1 = new a(true);
        h h1 = h.aK;
        h h2 = h.aO;
        h h3 = h.W;
        h h4 = h.am;
        h h5 = h.al;
        h h6 = h.av;
        h h7 = h.aw;
        h h8 = h.F;
        h h9 = h.E;
        h h10 = h.J;
        h h11 = h.U;
        h h12 = h.D;
        h h13 = h.H;
        h h14 = h.h;
        if (!a1.a)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String as[] = new String[14];
        for (int j = 0; j < 14; j++)
        {
            as[j] = (new h[] {
                h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, 
                h11, h12, h13, h14
            })[j].aS;
        }

        a1.b = as;
        a = a1.a(new D[] {
            D.a, D.b, D.c
        }).a().b();
        b = (new a(a)).a(new D[] {
            D.c
        }).a().b();
    }
}
