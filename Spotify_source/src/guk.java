// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class guk
{

    public static boolean a(String s)
    {
        return s.equals("POST") || s.equals("PATCH") || s.equals("PUT") || s.equals("DELETE");
    }

    public static boolean b(String s)
    {
        return s.equals("POST") || s.equals("PUT") || s.equals("PATCH");
    }

    public static boolean c(String s)
    {
        return b(s) || s.equals("DELETE");
    }
}
