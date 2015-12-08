// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e
{

    private static Pattern a = Pattern.compile("^http|ws$");
    private static Pattern b = Pattern.compile("^(http|ws)s$");

    public static String a(URL url)
    {
        String s;
        int i;
        int j;
        s = url.getProtocol();
        j = url.getPort();
        i = j;
        if (j != -1) goto _L2; else goto _L1
_L1:
        if (!a.matcher(s).matches()) goto _L4; else goto _L3
_L3:
        i = 80;
_L2:
        return (new StringBuilder()).append(s).append("://").append(url.getHost()).append(":").append(i).toString();
_L4:
        i = j;
        if (b.matcher(s).matches())
        {
            i = 443;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static URL a(URI uri)
    {
        Object obj1;
label0:
        {
            String s = uri.getScheme();
            if (s != null)
            {
                obj1 = s;
                if (s.matches("^https?|wss?$"))
                {
                    break label0;
                }
            }
            obj1 = "https";
        }
label1:
        {
            int j = uri.getPort();
            int i = j;
            Object obj;
            String s1;
            String s2;
            StringBuilder stringbuilder;
            String s3;
            if (j == -1)
            {
                if (a.matcher(((CharSequence) (obj1))).matches())
                {
                    i = 80;
                } else
                {
                    i = j;
                    if (b.matcher(((CharSequence) (obj1))).matches())
                    {
                        i = 443;
                    }
                }
            }
            s1 = uri.getRawPath();
            if (s1 != null)
            {
                obj = s1;
                if (s1.length() != 0)
                {
                    break label1;
                }
            }
            obj = "/";
        }
        s3 = uri.getRawUserInfo();
        s2 = uri.getRawQuery();
        s1 = uri.getRawFragment();
        try
        {
            stringbuilder = (new StringBuilder()).append(((String) (obj1))).append("://");
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new RuntimeException(uri);
        }
        if (s3 == null) goto _L2; else goto _L1
_L1:
        obj1 = (new StringBuilder()).append(s3).append("@").toString();
_L7:
        obj1 = stringbuilder.append(((String) (obj1))).append(uri.getHost());
        if (i == -1) goto _L4; else goto _L3
_L3:
        uri = (new StringBuilder(":")).append(i).toString();
_L9:
        obj = ((StringBuilder) (obj1)).append(uri).append(((String) (obj)));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        uri = (new StringBuilder("?")).append(s2).toString();
_L10:
        obj = ((StringBuilder) (obj)).append(uri);
        if (s1 == null) goto _L6; else goto _L5
_L5:
        uri = (new StringBuilder("#")).append(s1).toString();
_L8:
        uri = new URL(((StringBuilder) (obj)).append(uri).toString());
        return uri;
_L2:
        obj1 = "";
          goto _L7
_L6:
        uri = "";
          goto _L8
_L4:
        uri = "";
          goto _L9
        uri = "";
          goto _L10
    }

}
