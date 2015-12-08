// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.app.Application;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.apps.wallet.logging.WLog;
import java.util.Iterator;
import java.util.List;

public class HybridWebViewCookieManager
{

    private CookieManager cookieMgr;
    private CookieSyncManager syncMgr;

    HybridWebViewCookieManager(Application application)
    {
        syncMgr = CookieSyncManager.createInstance(application);
        cookieMgr = CookieManager.getInstance();
    }

    private void clearCookie(ServiceAuthInfo.CookieInfo cookieinfo)
    {
        Object obj = Uri.parse(cookieinfo.url);
        String s = cookieinfo.name;
        String s1 = String.valueOf(((Uri) (obj)).getPath());
        obj = String.valueOf(((Uri) (obj)).getHost());
        s = (new StringBuilder(String.valueOf(s).length() + 67 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append("=; Expires=Thu, 01 Jan 1970 00:00:01 GMT; Path=").append(s1).append("; Domain=.").append(((String) (obj))).append("; HttpOnly").toString();
        s1 = cookieinfo.name;
        obj = cookieinfo.url;
        WLog.d("HybridWebViewCookieManager", (new StringBuilder(String.valueOf(s1).length() + 25 + String.valueOf(obj).length())).append("Clearing cookie ").append(s1).append(" for url ").append(((String) (obj))).toString());
        cookieMgr.setCookie(cookieinfo.url, s);
    }

    private String getCookieForUrl(String s)
    {
        return cookieMgr.getCookie(s);
    }

    public final void clearAllCookies()
    {
        cookieMgr.removeAllCookie();
        syncMgr.sync();
    }

    public final void clearStaleCookies(boolean flag, List list)
    {
        boolean flag1 = false;
        if (flag)
        {
            WLog.d("HybridWebViewCookieManager", "Removing session cookies before authentication");
            cookieMgr.removeSessionCookie();
            flag1 = true;
        }
        boolean flag2 = flag1;
        if (list != null)
        {
            flag2 = flag1;
            if (!list.isEmpty())
            {
                list = list.iterator();
                do
                {
                    flag2 = flag1;
                    if (!list.hasNext())
                    {
                        break;
                    }
                    clearCookie((ServiceAuthInfo.CookieInfo)list.next());
                    flag1 = true;
                } while (true);
            }
        }
        if (flag2)
        {
            syncMgr.sync();
        }
    }

    public final boolean containsCookies(List list)
    {
        if (list == null || list.isEmpty())
        {
            return true;
        }
        cookieMgr.removeExpiredCookie();
        syncMgr.sync();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            list = (ServiceAuthInfo.CookieInfo)iterator.next();
            String s2 = ((ServiceAuthInfo.CookieInfo) (list)).name;
            String s3 = ((ServiceAuthInfo.CookieInfo) (list)).url;
            WLog.d("HybridWebViewCookieManager", (new StringBuilder(String.valueOf(s2).length() + 13 + String.valueOf(s3).length())).append("Checking ").append(s2).append(" on ").append(s3).toString());
            s2 = getCookieForUrl(((ServiceAuthInfo.CookieInfo) (list)).url);
            if (s2 == null)
            {
                String s = ((ServiceAuthInfo.CookieInfo) (list)).name;
                list = ((ServiceAuthInfo.CookieInfo) (list)).url;
                WLog.d("HybridWebViewCookieManager", (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(list).length())).append("Cookie ").append(s).append(" not found for ").append(list).append(" (no cookies at all)").toString());
                return false;
            }
            s3 = ((ServiceAuthInfo.CookieInfo) (list)).name;
            if (s2.indexOf((new StringBuilder(String.valueOf(s3).length() + 3)).append("; ").append(s3).append("=").toString()) < 0 && s2.indexOf(String.valueOf(((ServiceAuthInfo.CookieInfo) (list)).name).concat("=")) < 0)
            {
                String s1 = ((ServiceAuthInfo.CookieInfo) (list)).name;
                list = ((ServiceAuthInfo.CookieInfo) (list)).url;
                WLog.d("HybridWebViewCookieManager", (new StringBuilder(String.valueOf(s1).length() + 22 + String.valueOf(list).length())).append("Cookie ").append(s1).append(" not found for ").append(list).toString());
                return false;
            }
        }

        return true;
    }
}
