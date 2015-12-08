// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


public final class j
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public j(String s, String s1, String s2)
    {
        a = s1;
        c = s;
        b = s2;
        if (c == null || a == null)
        {
            throw new IllegalArgumentException("Node and domain of JID must not be null");
        }
        s2 = a;
        s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s).append("@").append(s2).toString();
        }
        s = s1;
        if (b != null)
        {
            s = s1;
            if (b.length() > 0)
            {
                s = (new StringBuilder()).append(s1).append("/").append(b).toString();
            }
        }
        d = s;
        e = (new StringBuilder()).append(c).append("@").append(a).toString();
    }

    public static j a(String s)
    {
        int k = s.indexOf('@');
        String s1;
        String s2;
        int i;
        if (k >= 0)
        {
            s1 = s.substring(0, k);
        } else
        {
            s1 = null;
        }
        i = s.indexOf('/');
        if (i >= 0)
        {
            s2 = s.substring(i + 1, s.length());
        } else
        {
            i = s.length();
            s2 = null;
        }
        s = s.substring(k + 1, i);
        if (s1 == null || s == null)
        {
            return null;
        } else
        {
            return new j(s1, s, s2);
        }
    }

    public final String a()
    {
        return e;
    }

    public final boolean a(j j1)
    {
        if (j1 != null)
        {
            if (j1 == this)
            {
                return true;
            }
            if (c.equals(j1.c) && a.equals(j1.a))
            {
                return true;
            }
        }
        return false;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof j)
        {
            return a((j)obj);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.hashCode() ^ a.hashCode() << 16;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(c).append("@").append(a).append("/").append(b).toString();
    }
}
