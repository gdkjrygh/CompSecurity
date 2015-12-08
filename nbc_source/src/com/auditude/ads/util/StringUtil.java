// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class StringUtil
{

    public StringUtil()
    {
    }

    public static HashMap ConvertToKeysAndValues(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        if (!isNullOrEmpty(s))
        {
            s = s.split(s1);
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                s1 = s[i];
                int k = s1.indexOf(s2);
                if (k > 0)
                {
                    hashmap.put(s1.substring(0, k), s1.substring(k + 1));
                }
                i++;
            }
        }
        return hashmap;
    }

    public static String ConvertToString(HashMap hashmap, String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        if (hashmap == null || hashmap.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        int i;
        i = hashmap.size();
        iterator = hashmap.entrySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return stringbuilder.toString();
_L3:
        hashmap = (java.util.Map.Entry)iterator.next();
        i--;
        StringBuilder stringbuilder1 = (new StringBuilder(String.valueOf((String)hashmap.getKey()))).append(s1).append((String)hashmap.getValue());
        if (i <= 0)
        {
            hashmap = "";
        } else
        {
            hashmap = s;
        }
        stringbuilder.append(stringbuilder1.append(hashmap).toString());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String convertToHHMMSS(int i)
    {
        return String.format("%02d:%02d:%02d.000", new Object[] {
            Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)
        });
    }

    public static int convertToInt(String s)
    {
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return (int)f;
    }

    public static boolean isNotNullOrEmpty(String s)
    {
        return s != null && s.length() > 0;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.equals("");
    }

    public static int parseDuration(String s)
    {
        if (isNullOrEmpty(s))
        {
            return -1;
        }
        String as[] = s.split(":");
        if (as.length == 3)
        {
            return convertToInt(as[0]) * 3600 + convertToInt(as[1]) * 60 + convertToInt(as[2]);
        } else
        {
            convertToInt(s);
            return -1;
        }
    }
}
