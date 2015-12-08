// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.util.List;

public class Strings
{

    public Strings()
    {
    }

    public static String emptyToNull(String s)
    {
        String s1 = s;
        if (isNullOrEmpty(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean equalsIgnoreCase(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equalsIgnoreCase(s1);
        }
    }

    public static transient boolean hasAnyPrefix(String s, String as[])
    {
        if (s != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (s.startsWith(as[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean isNullOrBlank(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String joinWithDelimiter(String s, List list)
    {
        return joinWithDelimiter(s, (String[])list.toArray(new String[list.size()]));
    }

    public static transient String joinWithDelimiter(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = as.length;
        String s1 = "";
        for (int i = 0; i < j;)
        {
            String s3 = as[i];
            String s2 = s1;
            if (!isNullOrEmpty(s3))
            {
                stringbuilder.append(s1);
                stringbuilder.append(s3);
                s2 = s;
            }
            i++;
            s1 = s2;
        }

        return stringbuilder.toString();
    }

    public static String nullOrEmptyToDefault(String s, String s1)
    {
        if (isNullOrEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String nullToEmpty(String s)
    {
        return nullOrEmptyToDefault(s, "");
    }
}
