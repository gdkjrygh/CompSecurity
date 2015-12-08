// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.cards.web.bf;
import com.kik.g.as;
import com.kik.g.p;
import com.kik.n.a.b.c;
import com.kik.n.a.b.i;
import java.util.Iterator;
import java.util.List;
import kik.a.j.n;

// Referenced classes of package kik.android.b:
//            t, v, u, w, 
//            x, y, z, aa

public final class s
{
    private static final class a
        implements as
    {

        com.kik.n.a.b.i.a a;

        public final Object a(Object obj)
        {
label0:
            {
                obj = (c)obj;
                if (obj == null || a == null)
                {
                    return null;
                }
                obj = ((c) (obj)).b();
                if (obj == null)
                {
                    break label0;
                }
                obj = ((List) (obj)).iterator();
                i j;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    j = (i)((Iterator) (obj)).next();
                } while (!a.equals(j.c()));
                return j;
            }
            return null;
        }

        public a(com.kik.n.a.b.i.a a1)
        {
            a = a1;
        }
    }


    private final n a;

    public s(n n1)
    {
        a = n1;
    }

    private static boolean h(String s1)
    {
        return s1 != null && s1.length() >= 2 && s1.length() < 253;
    }

    public final p a(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(null);
        } else
        {
            return com.kik.g.s.b(a.a("browser_domain_info", s1, com/kik/n/a/b/c), new t(this));
        }
    }

    public final p a(byte abyte0[], byte abyte1[], String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(new IllegalArgumentException("Host must not be null"));
        } else
        {
            return com.kik.g.s.a(a.a("browser_domain_info", s1, com/kik/n/a/b/c, new v(this, s1, abyte1, abyte0), Long.valueOf(5000L)));
        }
    }

    public final p b(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(null);
        } else
        {
            return com.kik.g.s.b(a.a("browser_domain_info", s1, com/kik/n/a/b/c), new u(this));
        }
    }

    public final p c(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(Boolean.valueOf(false));
        } else
        {
            return com.kik.g.s.b(com.kik.g.s.b(a.a("browser_domain_info", s1, com/kik/n/a/b/c), new a(com.kik.n.a.b.i.a.b)), new w(this));
        }
    }

    public final p d(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(new IllegalArgumentException("Host must not be null"));
        } else
        {
            return com.kik.g.s.a(a.a("browser_domain_info", s1, com/kik/n/a/b/c, new x(this, s1), Long.valueOf(5000L)));
        }
    }

    public final p e(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(Boolean.valueOf(false));
        } else
        {
            return com.kik.g.s.b(com.kik.g.s.b(a.a("browser_domain_info", s1, com/kik/n/a/b/c), new a(com.kik.n.a.b.i.a.a)), new y(this));
        }
    }

    public final p f(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(new IllegalArgumentException("Host must not be null"));
        } else
        {
            return com.kik.g.s.a(a.a("browser_domain_info", s1, com/kik/n/a/b/c, new z(this, s1), Long.valueOf(5000L)));
        }
    }

    public final p g(String s1)
    {
        s1 = bf.i(s1);
        if (!h(s1))
        {
            return com.kik.g.s.a(new IllegalArgumentException("Host must not be null"));
        } else
        {
            return com.kik.g.s.a(a.a("browser_domain_info", s1, com/kik/n/a/b/c, new aa(this, s1), Long.valueOf(5000L)));
        }
    }
}
