// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.os.Build;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;

public class WLNativeAPIUtils
{

    public WLNativeAPIUtils()
    {
    }

    static void setUserAgentHeader(HttpClient httpclient)
    {
        String s = (String)httpclient.getParams().getParameter("http.useragent");
        String s1 = (new StringBuilder()).append("WLNativeAPI(").append(Build.DEVICE).append("; ").append(Build.DISPLAY).append("; ").append(Build.MODEL).append("; SDK ").append(android.os.Build.VERSION.SDK).append("; Android ").append(android.os.Build.VERSION.RELEASE).append(")").toString();
        if (s != null && s.indexOf("WLNativeAPI(") < 0)
        {
            httpclient.getParams().setParameter("http.useragent", (new StringBuilder()).append(s).append(" ").append(s1).toString());
        } else
        if (s == null)
        {
            httpclient.getParams().setParameter("http.useragent", s1);
            return;
        }
    }
}
