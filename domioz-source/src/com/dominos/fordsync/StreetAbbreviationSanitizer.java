// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync;

import android.content.res.Resources;
import com.dominos.App;
import com.dominos.android.sdk.common.StringHelper;
import java.util.Map;
import java.util.TreeMap;

public class StreetAbbreviationSanitizer
{

    private static Map map;

    private StreetAbbreviationSanitizer()
    {
    }

    private static String reformatNumber(String s)
    {
        int i;
        int j;
        i = s.length();
        j = Integer.parseInt(s);
        if (i <= 3) goto _L2; else goto _L1
_L1:
        if (j % 100 != 0 || j % 1000 == 0) goto _L4; else goto _L3
_L3:
        String s1 = String.format("%s hundred", new Object[] {
            s.substring(0, 2)
        });
_L6:
        return s1;
_L4:
        s1 = s;
        if (j % 1000 != 0)
        {
            return s.replaceAll("(.)", "$1 ");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = s;
        if (i == 3)
        {
            s1 = s;
            if (j % 100 != 0)
            {
                return String.format("%s %s", new Object[] {
                    s.substring(0, 1), s.substring(1)
                });
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String sanitize(String s)
    {
        s = s.split("\\s+");
        for (int i = 0; i < s.length; i++)
        {
            String s1 = (String)map.get(s[i]);
            if (s1 != null)
            {
                s[i] = s1;
            }
            if (s[i].matches("([0-9]+)"))
            {
                s[i] = reformatNumber(s[i]);
            }
        }

        return StringHelper.join(s, " ");
    }

    public static String sanitizeAndTrim(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return sanitize(StringHelper.replace(StringHelper.replace(StringHelper.trim(s), ".", ""), ",", ""));
        }
    }

    static 
    {
        map = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        String as[] = App.getInstance().getResources().getStringArray(0x7f090002);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("\\|", 2);
            map.put(as1[0], as1[1]);
        }

    }
}
