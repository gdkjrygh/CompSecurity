// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads.util:
//            StringUtil

public final class URLUtil
{

    public URLUtil()
    {
    }

    public static String appendURLParams(String s, HashMap hashmap)
    {
        if (StringUtil.isNullOrEmpty(s) || hashmap == null || hashmap.isEmpty())
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(s);
        if (s.indexOf("?") < 0)
        {
            stringbuilder.append("?");
        }
        s = stringbuilder.toString();
        if (s.lastIndexOf("&") != s.length() - 1 && s.lastIndexOf("?") != s.length() - 1)
        {
            stringbuilder.append("&");
        }
        s = hashmap.entrySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                stringbuilder.deleteCharAt(stringbuilder.length() - 1);
                return stringbuilder.toString();
            }
            hashmap = (java.util.Map.Entry)s.next();
            stringbuilder.append((String)hashmap.getKey());
            stringbuilder.append("=");
            if (!StringUtil.isNullOrEmpty((String)hashmap.getValue()))
            {
                stringbuilder.append(urlEncode((String)hashmap.getValue()));
            }
            stringbuilder.append("&");
        } while (true);
    }

    public static String getFileExtension(String s)
    {
        if (!StringUtil.isNullOrEmpty(s))
        {
            String s1 = s;
            if (s.indexOf("?") >= 0)
            {
                s1 = s.substring(0, s.indexOf("?"));
            }
            int i = s1.lastIndexOf(".");
            if (i >= 0 && i < s1.length() - 1)
            {
                return s1.substring(i + 1);
            }
        }
        return "";
    }

    public static boolean isIPAddress(String s)
    {
        if (!StringUtil.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = s.indexOf(":");
        String s1 = s;
        if (i > 0)
        {
            s1 = s.substring(0, i);
        }
        s = s1.split("\\.");
        if (s.length != 4) goto _L1; else goto _L3
_L3:
        int j;
        int k;
        int l;
        try
        {
            k = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        j = 0;
          goto _L4
_L7:
        l = Integer.parseInt(s[j]);
        if (l < 0 || l > 255) goto _L1; else goto _L5
_L5:
        j++;
_L4:
        if (j < k) goto _L7; else goto _L6
_L6:
        return true;
    }

    public static String urlEncode(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return null;
        }
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return s;
        }
        return s1;
    }
}
