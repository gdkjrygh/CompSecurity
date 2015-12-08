// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.webkit.CookieManager;
import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.util.ae;

public final class b
{

    private static final String a = com/jcp/h/b.getName();

    private b()
    {
    }

    public static void a()
    {
        ae.d(a, (new StringBuilder()).append("Visitor id: ").append(DigitalAnalytics.visitorId()).toString());
        ae.d(a, (new StringBuilder()).append("Session id: ").append(DigitalAnalytics.sessionId()).toString());
    }

    public static void a(CookieManager cookiemanager)
    {
        String s = b();
        cookiemanager.setCookie("www88.jcpenney.com", (new StringBuilder()).append("CoreID6=").append(DigitalAnalytics.visitorId()).append("; path=/").toString());
        cookiemanager.setCookie("www88.jcpenney.com", (new StringBuilder()).append("TestSess3=").append(DigitalAnalytics.visitorId()).append("; path=/").toString());
        cookiemanager.setCookie("www88.jcpenney.com", (new StringBuilder()).append(s).append("_login=").append(DigitalAnalytics.sessionId()).append("0000000000").append(s).append("; path=/").toString());
    }

    private static String b()
    {
        return "90024642";
    }

}
