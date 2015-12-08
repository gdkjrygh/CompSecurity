// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abx
{

    final abB a;
    public final ael b;
    private String c;
    private aew d;

    abx(abB abb, abB abb1, String s)
    {
        if (abb == null || abb1 == null || s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = abb;
            c = s;
            d = new aew(new aey(s), new aey(abb1.k));
            b = new ael(abb.m, d);
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof abx) && ((abx)obj).a.equals(a) && ((abx)obj).c.equals(c);
    }

    public final int hashCode()
    {
        return a.hashCode() + c.hashCode() * 37;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".").append(c).toString();
    }
}
