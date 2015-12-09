// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.net.Uri;
import com.netflix.mediaclient.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.netflix.mediaclient.util:
//            StringUtils

public final class UriUtil
{

    private static final String TAG = "UriUtils";

    private UriUtil()
    {
    }

    public static String buildUrlParam(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("&");
        stringbuilder.append(s);
        stringbuilder.append("=");
        stringbuilder.append(s1);
        return stringbuilder.toString();
    }

    public static String getParamFromUri(String s, String s1)
    {
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1))
        {
            s1 = s1.split("[&]");
            int j = s1.length;
            int i = 0;
            while (i < j) 
            {
                String s2 = s1[i];
                int k = s2.indexOf("=");
                if (k <= 0 || !s.equals(s2.substring(0, k)))
                {
                    i++;
                } else
                {
                    return s2.substring(k + 1);
                }
            }
        }
        return null;
    }

    public static boolean isValidUri(String s)
    {
        if (!StringUtils.isEmpty(s))
        {
            try
            {
                s = Uri.parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            if (s != null && s.getHost() != null && s.getScheme() != null)
            {
                return true;
            }
        }
        return false;
    }

    public static String urlEncodeParam(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.w("UriUtils", "Could not encoded param ", unsupportedencodingexception);
            return URLEncoder.encode(s);
        }
        return s1;
    }
}
