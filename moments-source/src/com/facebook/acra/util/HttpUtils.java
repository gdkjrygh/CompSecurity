// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import com.facebook.acra.ACRA;
import com.facebook.acra.reporter.ReportsCrashes;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.acra.util:
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
        doPost(map, url, s, null);
    }

    public static void doPost(Map map, URL url, String s, Proxy proxy)
    {
        String s1;
        if (s == "application/json")
        {
            map = encodeParametersJson(map);
        } else
        {
            map = encodeParametersFormUrlEncoded(map);
        }
        if (ACRA.getConfig().checkSSLCertsOnCrashReport())
        {
            proxy = new SSLConnectionProvider(proxy);
        } else
        {
            proxy = new UnsafeConnectionProvider(proxy);
        }
        s1 = ACRA.getConfig().getUserAgent();
        (new HttpRequest(proxy)).sendPost(url, map, new ACRAResponse(), s, s1);
    }

    public static HttpRequest.PostEntity encodeParametersFormUrlEncoded(final Map parameters)
    {
        return new _cls1();
    }

    public static HttpRequest.PostEntity encodeParametersJson(Map map)
    {
        return new HttpRequest.StringPostEntity((new JSONObject(map)).toString());
    }

    private class _cls1
        implements HttpRequest.PostEntity
    {

        final Map val$parameters;

        public final void writeTo(OutputStream outputstream)
        {
            BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(outputstream));
            UrlEncodingWriter urlencodingwriter = new UrlEncodingWriter(bufferedwriter);
            Iterator iterator = parameters.entrySet().iterator();
            for (boolean flag = true; iterator.hasNext(); flag = false)
            {
                outputstream = (java.util.Map.Entry)iterator.next();
                Object obj1 = outputstream.getKey();
                if (!flag)
                {
                    bufferedwriter.append('&');
                }
                Object obj = outputstream.getValue();
                outputstream = ((OutputStream) (obj));
                if (obj == null)
                {
                    outputstream = "";
                }
                urlencodingwriter.write(obj1.toString());
                bufferedwriter.write(61);
                urlencodingwriter.write(outputstream.toString());
            }

            bufferedwriter.flush();
        }

        _cls1()
        {
            parameters = map;
            super();
        }
    }

}
