// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class IP
{

    private static final Pattern emojiModifierPattern = Pattern.compile("[(\\uD83C\\uDFFB)(\\uD83C\\uDFFC)(\\uD83C\\uDFFD)(\\uD83C\\uDFFE)(\\uD83C\\uDFFF)]");

    public static String a(String s)
    {
        return s.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();
    }

    public static boolean a(String s, String s1)
    {
        s = Ib.a(s);
        s1 = Ib.a(s1);
        return s.regionMatches(true, 0, s1, 0, s1.length());
    }

    public static String b(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            Matcher matcher = emojiModifierPattern.matcher(s);
            if (matcher.find())
            {
                return matcher.replaceAll("");
            }
        }
        return s;
    }

    public static boolean b(String s, String s1)
    {
        s = Ib.a(s);
        s1 = Ib.a(s1);
        return s.toLowerCase().contains(s1.toLowerCase());
    }

    private static int c(String s)
    {
        int i = 0;
        String s1 = s;
        if (!s.isEmpty())
        {
            s1 = s.substring(0, 1).toUpperCase(Locale.US);
        }
        if (s1.compareTo("A") < 0 || s1.compareTo("Z") > 0)
        {
            i = 1;
        }
        return i;
    }

    public static boolean c(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        if (s == null || s1 == null || s.length() != s1.length())
        {
            return false;
        } else
        {
            return s.equalsIgnoreCase(s1);
        }
    }

    public static int d(String s, String s1)
    {
        int i = c(s);
        if (i == c(s1))
        {
            return s.compareTo(s1);
        }
        return i != 0 ? 1 : -1;
    }

}
