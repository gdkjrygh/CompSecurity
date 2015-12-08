// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emt
{

    final ems a;
    final ems b;

    emt(double d, double d1, double d2, double d3)
    {
        boolean flag;
        if (d <= d2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = ems.a(d, d1);
        b = ems.a(d2, d3);
    }

    public final String toString()
    {
        String s = String.valueOf(a.toString());
        String s1 = String.valueOf(b.toString());
        return (new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length())).append(s).append(" - ").append(s1).toString();
    }
}
