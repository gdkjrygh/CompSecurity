// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.common.util.ResponseHeader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class HeaderUtils
{

    public HeaderUtils()
    {
    }

    private static Integer a(String s)
    {
        NumberFormat numberformat = NumberFormat.getInstance(Locale.US);
        numberformat.setParseIntegerOnly(true);
        int i;
        try
        {
            i = numberformat.parse(s.trim()).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return Integer.valueOf(i);
    }

    private static boolean a(String s, boolean flag)
    {
        if (s == null)
        {
            return flag;
        } else
        {
            return s.equals("1");
        }
    }

    public static boolean extractBooleanHeader(Map map, ResponseHeader responseheader, boolean flag)
    {
        return a(extractHeader(map, responseheader), flag);
    }

    public static boolean extractBooleanHeader(HttpResponse httpresponse, ResponseHeader responseheader, boolean flag)
    {
        return a(extractHeader(httpresponse, responseheader), flag);
    }

    public static String extractHeader(Map map, ResponseHeader responseheader)
    {
        return (String)map.get(responseheader.getKey());
    }

    public static String extractHeader(HttpResponse httpresponse, ResponseHeader responseheader)
    {
        httpresponse = httpresponse.getFirstHeader(responseheader.getKey());
        if (httpresponse != null)
        {
            return httpresponse.getValue();
        } else
        {
            return null;
        }
    }

    public static int extractIntHeader(HttpResponse httpresponse, ResponseHeader responseheader, int i)
    {
        httpresponse = extractIntegerHeader(httpresponse, responseheader);
        if (httpresponse == null)
        {
            return i;
        } else
        {
            return httpresponse.intValue();
        }
    }

    public static Integer extractIntegerHeader(Map map, ResponseHeader responseheader)
    {
        return a(extractHeader(map, responseheader));
    }

    public static Integer extractIntegerHeader(HttpResponse httpresponse, ResponseHeader responseheader)
    {
        return a(extractHeader(httpresponse, responseheader));
    }
}
