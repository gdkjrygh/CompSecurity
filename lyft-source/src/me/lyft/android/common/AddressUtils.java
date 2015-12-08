// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


// Referenced classes of package me.lyft.android.common:
//            Strings

public class AddressUtils
{

    public AddressUtils()
    {
    }

    public static String getShortAddress(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return "";
        }
        int i = s.indexOf(", ");
        if (i > -1)
        {
            int j = s.indexOf(", ", i + 1);
            if (j > -1)
            {
                return s.substring(0, j);
            } else
            {
                return s.substring(0, i);
            }
        } else
        {
            return s;
        }
    }

    public static String getStateOrCountry(String s)
    {
        String s1 = getShortAddress(s);
        if (Strings.isNullOrEmpty(s1))
        {
            return "";
        }
        int i = s1.indexOf(", ");
        int j = s.lastIndexOf(", ");
        if (i > -1)
        {
            return s1.substring(i + 1).replaceAll("\\d", "").trim();
        } else
        {
            return s.substring(j + 1).replaceAll("\\d", "").trim();
        }
    }

    public static String getStreetAddress(String s)
    {
        String s1;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = "";
        } else
        {
            int i = s.indexOf(", ");
            s1 = s;
            if (i > -1)
            {
                return s.substring(0, i);
            }
        }
        return s1;
    }
}
