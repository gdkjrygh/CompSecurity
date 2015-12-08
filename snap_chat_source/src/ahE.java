// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ahE extends ahD
{

    public ahE()
    {
        super("+", 5, (byte)0);
    }

    public final double a(double d)
    {
        return d;
    }

    public final double a(double d, double d1)
    {
        return (new Double(d + d1)).doubleValue();
    }

    public final String a(String s, String s1)
    {
        return new String((new StringBuilder()).append(s.substring(0, s.length() - 1)).append(s1.substring(1, s1.length())).toString());
    }
}
