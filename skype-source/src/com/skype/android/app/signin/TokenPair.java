// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

public class TokenPair
{

    public static final String PARAM_ACCESS_TOKEN = "access_token";
    public static final String PARAM_REFRESH_TOKEN = "refresh_token";
    private String accessToken;
    private String refreshToken;

    public TokenPair(String s, String s1)
    {
        accessToken = s;
        refreshToken = s1;
    }

    public static TokenPair parseTokensFromCallbackUrlFragment(String s)
    {
        s = Uri.parse(s);
        String s1 = s.getQueryParameter("access_token");
        String s2 = s.getQueryParameter("refresh_token");
        HashMap hashmap = new HashMap();
        s = s.getEncodedFragment().split("&");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String as[] = s[i].split("=");
            if (as.length > 0)
            {
                hashmap.put(as[0], as[1]);
            }
        }

        s = s1;
        if (s1 == null)
        {
            try
            {
                s = URLDecoder.decode((String)hashmap.get("access_token"), "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = s1;
            }
        }
        s1 = s2;
        if (s2 == null)
        {
            try
            {
                s1 = URLDecoder.decode((String)hashmap.get("refresh_token"), "utf-8");
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                unsupportedencodingexception.printStackTrace();
                unsupportedencodingexception = s2;
            }
        }
        return new TokenPair(s, s1);
    }

    public String getAccessToken()
    {
        return accessToken;
    }

    public String getRefreshToken()
    {
        return refreshToken;
    }
}
