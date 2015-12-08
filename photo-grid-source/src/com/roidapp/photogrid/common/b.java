// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;


public final class b
{

    private static String a = "";
    private static b b = null;
    private static int c = 350;

    private b()
    {
    }

    public static String a()
    {
        String s;
        try
        {
            s = a;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return "";
        }
        return s;
    }

    public static void a(String s)
    {
        try
        {
            if (b == null)
            {
                b = new b();
            }
            if (b != null && a != null)
            {
                if (a.length() > c)
                {
                    a = a.substring(a.length() - c);
                }
                a = (new StringBuilder()).append(a).append(s).append("->").toString();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

}
