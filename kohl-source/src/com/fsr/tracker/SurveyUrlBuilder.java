// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SurveyUrlBuilder
{
    private class Keys
    {

        static final String API_KEY = "cid=%s";
        static final String CONTACT_KEY = "notify=%s";
        static final String CPP = "cpp[%s]=%s";
        static final String CPP_CONTAINER = "cpps=%s";
        static final String RID_KEY = "rid=%s";
        static final String SID_KEY = "sid=%s";
        final SurveyUrlBuilder this$0;

        private Keys()
        {
            this$0 = SurveyUrlBuilder.this;
            super();
        }
    }


    private SurveyUrlBuilder()
    {
    }

    private static void appendCpp(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
    {
        appendCpp(stringbuilder, s, s1, false);
    }

    private static void appendCpp(StringBuilder stringbuilder, String s, String s1, boolean flag)
        throws UnsupportedEncodingException
    {
        if (s1 != null && s1 != "")
        {
            if (!flag)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(String.format("cpp[%s]=%s", new Object[] {
                s, URLEncoder.encode(s1, "utf-8")
            }));
        }
    }

    private static void appendFormat(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
    {
        appendFormat(stringbuilder, s, s1, false);
    }

    private static void appendFormat(StringBuilder stringbuilder, String s, String s1, boolean flag)
        throws UnsupportedEncodingException
    {
        if (s1 != null && s1 != "")
        {
            if (!flag)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(String.format(s, new Object[] {
                URLEncoder.encode(s1, "utf-8")
            }));
        }
    }

    private static void appendQueryStringParam(StringBuilder stringbuilder, String s, String s1)
    {
        stringbuilder.append(String.format("&%s=%s", new Object[] {
            s, s1
        }));
    }

    public static String buildOnExitInitializeUrl(String s, String s1, String s2, String s3, String s4, Map map, Map map1)
        throws UnsupportedEncodingException
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalStateException("SurveyUrlBuilder not configured with a base url.");
        }
        s = new StringBuilder(s);
        appendFormat(s, "rid=%s", s1, true);
        appendFormat(s, "cid=%s", s2);
        appendFormat(s, "sid=%s", s3);
        appendFormat(s, "notify=%s", s4);
        s1 = getUniqueId();
        appendFormat(s, "a=%s", s1);
        appendFormat(s, "b=%s", getHashedId(s1));
        appendFormat(s, "c=%s", String.format("%s", new Object[] {
            Integer.valueOf(0x5265c00)
        }));
        boolean flag = true;
        for (s1 = map1.entrySet().iterator(); s1.hasNext(); appendQueryStringParam(s, (String)s2.getKey(), (String)s2.getValue()))
        {
            s2 = (java.util.Map.Entry)s1.next();
        }

        s1 = new StringBuilder();
        for (s2 = map.entrySet().iterator(); s2.hasNext();)
        {
            s3 = (java.util.Map.Entry)s2.next();
            appendCpp(s1, (String)s3.getKey(), (String)s3.getValue(), flag);
            flag = false;
        }

        appendFormat(s, "cpps=%s", s1.toString());
        return s.toString();
    }

    public static String buildSurveyUrl(String s, String s1, String s2, String s3, Map map, Map map1)
        throws UnsupportedEncodingException
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalStateException("SurveyUrlBuilder not configured with a base url.");
        }
        s = new StringBuilder(s);
        appendFormat(s, "sid=%s", s3, true);
        appendFormat(s, "cid=%s", s2);
        for (s2 = map1.entrySet().iterator(); s2.hasNext(); appendQueryStringParam(s, (String)s3.getKey(), (String)s3.getValue()))
        {
            s3 = (java.util.Map.Entry)s2.next();
        }

        if (s1 != null)
        {
            appendCpp(s, "browser_version", parseBrowserVersion(s1));
            appendCpp(s, "browser", "AppleWebKit");
        }
        for (s1 = map.entrySet().iterator(); s1.hasNext(); appendCpp(s, (String)s2.getKey(), (String)s2.getValue()))
        {
            s2 = (java.util.Map.Entry)s1.next();
        }

        return s.toString();
    }

    public static String buildSurveyUrl(String s, String s1, String s2, Map map, Map map1)
        throws UnsupportedEncodingException
    {
        return buildSurveyUrl(s, null, s1, s2, map, map1);
    }

    private static String getHashedId(String s)
    {
        s = s.split("_");
        return String.format("%d%d", new Object[] {
            Long.valueOf(Long.parseLong(s[0]) * 3L + 1357L), Long.valueOf(Long.parseLong(s[1]) * 9L + 58L)
        });
    }

    private static String getUniqueId()
    {
        return String.format("%d_%d", new Object[] {
            Long.valueOf((new Date()).getTime()), Long.valueOf((long)(StrictMath.random() * 10000000000000D))
        });
    }

    private static String parseBrowserVersion(String s)
    {
        s = Pattern.compile("AppleWebKit/([\\d.]*)").matcher(s);
        if (s.find())
        {
            return s.group(1);
        } else
        {
            return "";
        }
    }
}
