// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.acra.ACRA;
import org.acra.reporter.ReportsCrashes;
import org.json.JSONObject;

// Referenced classes of package org.acra.util:
//            SSLConnectionProvider, HttpRequest, ACRAResponse, UnsafeConnectionProvider

public class HttpUtils
{

    public HttpUtils()
    {
    }

    public static void doPost(Map map, URL url)
    {
        doPost(map, url, "application/x-www-form-urlencoded");
    }

    public static void doPost(Map map, URL url, String s)
    {
        Object obj;
        if (s == "application/json")
        {
            map = encodeParametersJson(map);
        } else
        {
            map = encodeParametersFormUrlEncoded(map);
        }
        if (ACRA.getConfig().checkSSLCertsOnCrashReport())
        {
            obj = new SSLConnectionProvider();
        } else
        {
            obj = new UnsafeConnectionProvider();
        }
        (new HttpRequest(((HttpConnectionProvider) (obj)))).sendPost(url, map, new ACRAResponse(), s);
    }

    public static String encodeParametersFormUrlEncoded(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        Object obj2;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append(URLEncoder.encode(obj2.toString(), "UTF-8")).append('=').append(URLEncoder.encode(obj.toString(), "UTF-8")))
        {
            obj2 = iterator.next();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append('&');
            }
            Object obj1 = map.get(obj2);
            obj = obj1;
            if (obj1 == null)
            {
                obj = "";
            }
        }

        return stringbuilder.toString();
    }

    public static String encodeParametersJson(Map map)
    {
        return (new JSONObject(map)).toString();
    }
}
