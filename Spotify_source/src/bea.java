// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bea
{

    public static String a(String s)
    {
        int i = s.indexOf('/');
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid mime type: ")).append(s).toString());
        } else
        {
            return s.substring(0, i);
        }
    }

    public static boolean b(String s)
    {
        return a(s).equals("audio");
    }

    public static boolean c(String s)
    {
        return a(s).equals("video");
    }

    public static boolean d(String s)
    {
        return "audio/ac3".equals(s) || "audio/eac3".equals(s);
    }
}
