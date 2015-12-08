// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.b;

import java.io.Serializable;

public final class b
    implements Serializable
{

    private int a;
    private String b;
    private String c;
    private String d;
    private long e;
    private int f;
    private String g;
    private int h;
    private String i;
    private String j;
    private int k;
    private long l;

    public b()
    {
        b = "";
        c = "";
        d = "";
        g = "";
        i = "";
        j = "";
        k = 0;
    }

    public b(String s, String s1, String s2, String s3)
    {
        b = "";
        c = "";
        d = "";
        g = "";
        i = "";
        j = "";
        k = 0;
        a = 0;
        b = s;
        d = s1;
        e = 0L;
        f = 0;
        g = s2;
        h = 0;
        c = s3;
    }

    public final String a()
    {
        return i;
    }

    public final void a(int i1)
    {
        a = i1;
    }

    public final void a(long l1)
    {
        e = l1;
    }

    public final void a(String s)
    {
        i = s;
    }

    public final String b()
    {
        return j;
    }

    public final void b(int i1)
    {
        f = i1;
    }

    public final void b(long l1)
    {
        l = l1;
    }

    public final void b(String s)
    {
        j = s;
    }

    public final int c()
    {
        return a;
    }

    public final void c(int i1)
    {
        h = i1;
    }

    public final void c(String s)
    {
        b = s;
    }

    public final String d()
    {
        return b;
    }

    public final void d(String s)
    {
        d = s;
    }

    public final String e()
    {
        return d;
    }

    public final void e(String s)
    {
        g = s;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (b)obj;
        if (g == null)
        {
            if (((b) (obj)).g != null)
            {
                return false;
            }
        } else
        if (!g.equals(((b) (obj)).g))
        {
            return false;
        }
        if (c == null)
        {
            if (((b) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((b) (obj)).c))
        {
            return false;
        }
        if (k != ((b) (obj)).k)
        {
            return false;
        }
        if (d == null)
        {
            if (((b) (obj)).d != null)
            {
                return false;
            }
        } else
        if (!d.equals(((b) (obj)).d))
        {
            return false;
        }
        if (f != ((b) (obj)).f)
        {
            return false;
        }
        if (a != ((b) (obj)).a)
        {
            return false;
        }
        if (e != ((b) (obj)).e)
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((b) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((b) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final long f()
    {
        return e;
    }

    public final void f(String s)
    {
        c = s;
    }

    public final int g()
    {
        return f;
    }

    public final String h()
    {
        return g;
    }

    public final int i()
    {
        return h;
    }

    public final String j()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder("Music [id=")).append(a).append(", title=").append(b).append(", artist=").append(c).append(", data=").append(d).append(", size=").append(e).append(", duration=").append(f).append(", album=").append(g).append(", albumId=").append(h).append(", artistPic=").append(i).append(", albumPic=").append(j).append(", currProgress=").append(k).append("]").toString();
    }
}
