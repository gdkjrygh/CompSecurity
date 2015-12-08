// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class nqy extends nra
{

    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Uri d;
    private final boolean e;
    private final boolean f;
    private final Integer g;
    private final boolean h;

    nqy(Integer integer, Integer integer1, Integer integer2, Uri uri, boolean flag, boolean flag1, Integer integer3, 
            boolean flag2)
    {
        if (integer == null)
        {
            throw new NullPointerException("Null iconResourceId");
        }
        a = integer;
        if (integer1 == null)
        {
            throw new NullPointerException("Null appNameResourceId");
        } else
        {
            b = integer1;
            c = integer2;
            d = uri;
            e = flag;
            f = flag1;
            g = integer3;
            h = flag2;
            return;
        }
    }

    public final Integer a()
    {
        return a;
    }

    public final Integer b()
    {
        return b;
    }

    public final Integer c()
    {
        return c;
    }

    public final Uri d()
    {
        return d;
    }

    public final boolean e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof nra)
            {
                if (!a.equals(((nra) (obj = (nra)obj)).a()) || !b.equals(((nra) (obj)).b()) || (c != null ? !c.equals(((nra) (obj)).c()) : ((nra) (obj)).c() != null) || (d != null ? !d.equals(((nra) (obj)).d()) : ((nra) (obj)).d() != null) || (e != ((nra) (obj)).e() || f != ((nra) (obj)).f()) || (g != null ? !g.equals(((nra) (obj)).g()) : ((nra) (obj)).g() != null) || h != ((nra) (obj)).h())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        return f;
    }

    public final Integer g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final int hashCode()
    {
        char c3 = '\u04CF';
        int k = 0;
        int l = a.hashCode();
        int i1 = b.hashCode();
        int i;
        int j;
        char c1;
        char c2;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        if (d == null)
        {
            j = 0;
        } else
        {
            j = d.hashCode();
        }
        if (e)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (f)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (g != null)
        {
            k = g.hashCode();
        }
        if (!h)
        {
            c3 = '\u04D5';
        }
        return ((c2 ^ (c1 ^ (j ^ (i ^ ((l ^ 0xf4243) * 0xf4243 ^ i1) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k) * 0xf4243 ^ c3;
    }

    public final String toString()
    {
        String s = String.valueOf("SystemTrayConfig{iconResourceId=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        String s4 = String.valueOf(d);
        boolean flag = e;
        boolean flag1 = f;
        String s5 = String.valueOf(g);
        boolean flag2 = h;
        return (new StringBuilder(String.valueOf(s).length() + 118 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append(s1).append(", appNameResourceId=").append(s2).append(", colorResourceId=").append(s3).append(", ringtone=").append(s4).append(", ringtoneEnabled=").append(flag).append(", vibrate=").append(flag1).append(", ledColor=").append(s5).append(", pushEnabled=").append(flag2).append("}").toString();
    }
}
