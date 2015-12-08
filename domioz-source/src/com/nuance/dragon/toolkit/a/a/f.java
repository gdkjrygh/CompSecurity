// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.a;

import com.nuance.dragon.toolkit.a.ai;
import com.nuance.dragon.toolkit.b.e;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.ArrayList;
import java.util.List;

public final class f
{

    private String a;
    private e b;
    private String c;
    private final ArrayList d = new ArrayList();
    private final int e = 30000;

    public f(String s, e e1, String s1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("command", s);
        com.nuance.dragon.toolkit.d.b.c.a("audioParam", s1);
        com.nuance.dragon.toolkit.d.b.c.a("timeoutMs", "greater than 0", true);
        a = s;
        b = e1;
        c = s1;
    }

    public final String a()
    {
        return a;
    }

    public final void a(ai ai)
    {
        com.nuance.dragon.toolkit.d.b.c.a("param", ai);
        d.add(ai);
    }

    public final e b()
    {
        return b;
    }

    public final int c()
    {
        return e;
    }

    public final List d()
    {
        return d;
    }

    public final String e()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (f)obj;
            if (c == null)
            {
                if (((f) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((f) (obj)).c))
            {
                return false;
            }
            if (a == null)
            {
                if (((f) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((f) (obj)).a))
            {
                return false;
            }
            if (d == null)
            {
                if (((f) (obj)).d != null)
                {
                    return false;
                }
            } else
            if (!d.equals(((f) (obj)).d))
            {
                return false;
            }
            if (b == null)
            {
                if (((f) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((f) (obj)).b))
            {
                return false;
            }
            if (e != ((f) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (b != null)
        {
            l = b.hashCode();
        }
        return ((k + (j + (i + 31) * 31) * 31) * 31 + l) * 31 + e;
    }
}
