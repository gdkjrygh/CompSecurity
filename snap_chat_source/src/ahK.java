// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahK extends ahD
{

    public ahK()
    {
        super("==", 3);
    }

    public final double a(double d, double d1)
    {
        return d != d1 ? 0.0D : 1.0D;
    }

    public final String a(String s, String s1)
    {
        if (s.compareTo(s1) == 0)
        {
            return "1.0";
        } else
        {
            return "0.0";
        }
    }
}
