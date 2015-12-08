// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bad
{

    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public bad(String s, String s1, int i, int j, int k, String s2)
    {
        a = (String)bds.a(s);
        b = s1;
        d = i;
        e = j;
        c = k;
        f = s2;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return ((bad)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
