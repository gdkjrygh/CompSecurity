// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dA
{

    public static String a(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static String b(String s)
    {
        String s1 = s;
        if (c(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean c(String s)
    {
        return s == null || s.length() == 0;
    }
}
