// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.f;

import com.c.a.a.ab;
import com.c.a.a.b;
import com.c.a.a.c;
import com.c.a.a.r;
import com.c.a.a.u;
import com.c.a.b.m;
import com.c.a.b.o;
import java.util.List;

public final class a
{

    private static final c a = com.c.a.a.c.a(".\u3002\uFF0E\uFF61");
    private static final ab b = ab.a();
    private static final r c = r.a('.');
    private static final c g;
    private static final c h;
    private final String d;
    private final m e;
    private final int f = b();

    private a(String s)
    {
        String s1 = com.c.a.a.b.a(a.f(s));
        s = s1;
        if (s1.endsWith("."))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        boolean flag;
        if (s.length() <= 253)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "Domain name too long: '%s':", new Object[] {
            s
        });
        d = s;
        e = m.a(b.a(s));
        if (e.size() <= 127)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "Domain has too many parts: '%s'", new Object[] {
            s
        });
        u.a(a(e), "Not a valid domain name: '%s'", new Object[] {
            s
        });
    }

    public static a a(String s)
    {
        return new a((String)u.a(s));
    }

    private static boolean a(String s, boolean flag)
    {
        String s1;
        if (s.length() > 0 && s.length() <= 63)
        {
            if (h.b(s1 = c.b.a().e(s)) && !g.c(s.charAt(0)) && !g.c(s.charAt(s.length() - 1)) && (!flag || !c.c.c(s.charAt(0))))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(List list)
    {
        int j = list.size() - 1;
        if (!a((String)list.get(j), true))
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!a((String)list.get(i), false))
            {
                return false;
            }
        }

        return true;
    }

    private int b()
    {
        int i;
        int j;
        j = e.size();
        i = 0;
_L5:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = c.a(e.a(i, j));
        if (!com.c.c.a.a.a.containsKey(s)) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        if (com.c.c.a.a.c.containsKey(s))
        {
            return i + 1;
        }
        String as[] = s.split("\\.", 2);
        boolean flag;
        if (as.length == 2 && com.c.c.a.a.b.containsKey(as[1]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return -1;
    }

    public final a a()
    {
        boolean flag;
        if (f == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return this;
        }
        int i;
        boolean flag1;
        if (f > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        u.b(flag1, "Not under a public suffix: %s", new Object[] {
            d
        });
        i = f;
        return a(c.a(e.a(i - 1, e.size())));
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof a)
        {
            obj = (a)obj;
            return d.equals(((a) (obj)).d);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return d.hashCode();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        g = com.c.a.a.c.a("-_");
        h = c.f.a(g);
    }
}
