// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bvu
{

    private static List a = Arrays.asList(new String[] {
        "AU", "BR", "CA", "ES", "FR", "GB", "IT", "MY", "SG", "US"
    });
    private static Pattern b = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,} *$");
    private static Pattern c = Pattern.compile("^[0-9]{4,8}$");
    private static Pattern d = Pattern.compile("^\\+?[0-9]{7,14}$");
    private static Pattern e = Pattern.compile("[ .\\-\\(\\)]*");
    private static Pattern f = Pattern.compile("^\\+?0+$");
    private static boolean g;

    public bvu()
    {
    }

    public static boolean a(String s)
    {
        if (!g && s == null)
        {
            throw new AssertionError();
        } else
        {
            return b.matcher(s).matches();
        }
    }

    public static boolean b(String s)
    {
        if (!g && s == null)
        {
            throw new AssertionError();
        } else
        {
            return c.matcher(s).matches();
        }
    }

    public static boolean c(String s)
    {
        return s.length() >= 8;
    }

    public static boolean d(String s)
    {
        if (!g && s == null)
        {
            throw new AssertionError();
        }
        s = e.matcher(s).replaceAll("");
        return d.matcher(s).matches() && !f.matcher(s).matches();
    }

    public static String e(String s)
    {
        return e.matcher(s).replaceAll("");
    }

    public static boolean f(String s)
    {
        if (bwq.c(s))
        {
            return false;
        } else
        {
            return a.contains(s.toUpperCase());
        }
    }

    static 
    {
        boolean flag;
        if (!bvu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
