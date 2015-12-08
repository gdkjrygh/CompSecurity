// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class ak
{

    private static final char xE[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static Map U(String s)
    {
        HashMap hashmap = new HashMap();
        s = s.split("&");
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String as[] = s[i].split("=");
            if (as.length > 1)
            {
                hashmap.put(as[0], as[1]);
            } else
            if (as.length == 1 && as[0].length() != 0)
            {
                hashmap.put(as[0], null);
            }
            i++;
        }
        return hashmap;
    }

    public static String V(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        Object obj = s;
        if (s.contains("?"))
        {
            String as[] = s.split("[\\?]");
            obj = s;
            if (as.length > 1)
            {
                obj = as[1];
            }
        }
        StringBuilder stringbuilder;
        if (((String) (obj)).contains("%3D"))
        {
            try
            {
                s = URLDecoder.decode(((String) (obj)), "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        } else
        {
            s = ((String) (obj));
            if (!((String) (obj)).contains("="))
            {
                return null;
            }
        }
        s = U(s);
        obj = new String[9];
        obj[0] = "dclid";
        obj[1] = "utm_source";
        obj[2] = "gclid";
        obj[3] = "utm_campaign";
        obj[4] = "utm_medium";
        obj[5] = "utm_term";
        obj[6] = "utm_content";
        obj[7] = "utm_id";
        obj[8] = "gmob_t";
        stringbuilder = new StringBuilder();
        for (int i = 0; i < obj.length; i++)
        {
            if (!TextUtils.isEmpty((CharSequence)s.get(obj[i])))
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(obj[i]).append("=").append((String)s.get(obj[i]));
            }
        }

        return stringbuilder.toString();
    }

    public static MessageDigest W(String s)
    {
        int i = 0;
_L3:
        if (i >= 2) goto _L2; else goto _L1
_L1:
        MessageDigest messagedigest = MessageDigest.getInstance(s);
        if (messagedigest != null)
        {
            return messagedigest;
        }
        continue; /* Loop/switch isn't completed */
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
          goto _L3
_L2:
        return null;
    }

    public static double a(String s, double d1)
    {
        if (s == null)
        {
            return d1;
        }
        double d2;
        try
        {
            d2 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d1;
        }
        return d2;
    }

    static String a(Locale locale)
    {
        while (locale == null || TextUtils.isEmpty(locale.getLanguage())) 
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(locale.getLanguage().toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry()))
        {
            stringbuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringbuilder.toString();
    }

    public static void a(Map map, String s, String s1)
    {
        if (!map.containsKey(s))
        {
            map.put(s, s1);
        }
    }

    public static boolean d(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("true") && !s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("1")) goto _L4; else goto _L3
_L3:
        flag1 = true;
_L2:
        return flag1;
_L4:
        if (s.equalsIgnoreCase("false") || s.equalsIgnoreCase("no"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!s.equalsIgnoreCase("0")) goto _L2; else goto _L5
_L5:
        return false;
    }

    static String v(boolean flag)
    {
        if (flag)
        {
            return "1";
        } else
        {
            return "0";
        }
    }

}
