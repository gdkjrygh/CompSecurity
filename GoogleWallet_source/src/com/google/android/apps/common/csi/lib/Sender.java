// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            Util

public class Sender
{
    public static final class SenderException extends Exception
    {

        public SenderException(String s)
        {
            super(s);
        }
    }


    private String productName;
    private String productVersion;

    public Sender()
    {
    }

    public Sender(String s, String s1)
    {
        setProductInfo(s, s1);
    }

    public void send(String s, Map map)
        throws SenderException
    {
        Object obj;
        HttpURLConnection httpurlconnection;
        String s1;
        String s2;
        s2 = Util.genURLString(s, map);
        s = Util.getUserAgent();
        s1 = s;
        if (!Util.isNullOrEmpty(productName))
        {
            s1 = s;
            if (!Util.isNullOrEmpty(productVersion))
            {
                s1 = String.format("%s %s/%s", new Object[] {
                    s, productName, productVersion
                });
            }
        }
        s = String.valueOf(s1);
        if (s.length() != 0)
        {
            s = "User Agent: ".concat(s);
        } else
        {
            s = new String("User Agent: ");
        }
        Util.logd("SenderHttpURLConnection", s);
        s = null;
        obj = null;
        map = null;
        httpurlconnection = (HttpURLConnection)(new URL(s2)).openConnection();
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setRequestProperty("User-Agent", s1);
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        s1 = String.valueOf(s2);
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        if (s1.length() == 0) goto _L2; else goto _L1
_L1:
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        s1 = "to send ".concat(s1);
_L4:
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        Util.logd("SenderHttpURLConnection", s1);
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.getResponseCode();
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return;
_L2:
        map = httpurlconnection;
        s = httpurlconnection;
        obj = httpurlconnection;
        s1 = new String("to send ");
        if (true) goto _L4; else goto _L3
_L3:
        MalformedURLException malformedurlexception;
        malformedurlexception;
        s = map;
        obj = String.valueOf(s2);
        s = map;
        if (((String) (obj)).length() == 0) goto _L6; else goto _L5
_L5:
        s = map;
        obj = "wrong url format: ".concat(((String) (obj)));
_L8:
        s = map;
        Util.loge("SenderHttpURLConnection", ((String) (obj)));
        s = map;
        throw new SenderException(malformedurlexception.getMessage());
        map;
        if (s != null)
        {
            s.disconnect();
        }
        throw map;
_L6:
        s = map;
        obj = new String("wrong url format: ");
        if (true) goto _L8; else goto _L7
_L7:
        map;
        s = ((String) (obj));
        Util.loge("SenderHttpURLConnection", "IO error");
        s = ((String) (obj));
        throw new SenderException(map.getMessage());
    }

    public void setProductInfo(String s, String s1)
    {
        Object obj = null;
        if (Util.isNullOrEmpty(s))
        {
            s = null;
        } else
        {
            s = s.trim();
        }
        productName = s;
        if (Util.isNullOrEmpty(s1))
        {
            s = obj;
        } else
        {
            s = s1.trim();
        }
        productVersion = s;
    }
}
