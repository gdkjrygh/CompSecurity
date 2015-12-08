// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.network;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.cookie.Cookie;
import org.apache.http.message.BasicNameValuePair;

public class HttpSessionManager
{
    private class Cookie
    {

        public String name;
        final HttpSessionManager this$0;
        public String value;

        public Cookie(String s, String s1)
        {
            this$0 = HttpSessionManager.this;
            super();
            name = s;
            value = s1;
        }
    }


    private static final String LOG_TAG = "HttpSessionManager";
    private ArrayList cookies;

    public HttpSessionManager()
    {
        cookies = new ArrayList();
    }

    private void addCookie(Cookie cookie)
    {
        Object obj = null;
        Iterator iterator = cookies.iterator();
        Cookie cookie1;
        do
        {
            cookie1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            cookie1 = (Cookie)iterator.next();
        } while (!cookie1.name.equals(cookie.name));
        if (cookie1 != null)
        {
            cookie1.value = cookie.value;
            return;
        } else
        {
            cookies.add(cookie);
            return;
        }
    }

    public static void syncCookiesToCookieManager(List list)
    {
        if (list != null && list.size() >= 1)
        {
            CookieSyncManager cookiesyncmanager = CookieSyncManager.getInstance();
            CookieManager cookiemanager = CookieManager.getInstance();
            if (cookiemanager != null)
            {
                list = list.iterator();
                do
                {
                    org.apache.http.cookie.Cookie cookie;
label0:
                    {
                        if (list.hasNext())
                        {
                            cookie = (org.apache.http.cookie.Cookie)list.next();
                            if (!cookie.getName().equals("$Version"))
                            {
                                break label0;
                            }
                        }
                        cookiesyncmanager.sync();
                        return;
                    }
                    String s = (new StringBuilder()).append(cookie.getName()).append("=").append(cookie.getValue()).append("; domain=").append(cookie.getDomain()).toString();
                    cookiemanager.setCookie(cookie.getDomain(), s);
                } while (true);
            }
        }
    }

    public void addCookies(String s)
    {
        if (s != null)
        {
            s = s.split(";");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                String as[] = s[i].trim().split("=");
                if (as.length == 1)
                {
                    addCookie(new Cookie(as[0], null));
                } else
                {
                    addCookie(new Cookie(as[0], as[1]));
                }
                i++;
            }
        }
    }

    public void addCookies(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getHeaders("Set-Cookie");
        int j = httpresponse.length;
        for (int i = 0; i < j; i++)
        {
            addCookies(httpresponse[i].getValue());
        }

    }

    public void clearCookies()
    {
        cookies.clear();
    }

    public BasicNameValuePair getCookiesHeader()
    {
        String s = "";
        for (Iterator iterator = cookies.iterator(); iterator.hasNext();)
        {
            Cookie cookie = (Cookie)iterator.next();
            if (cookie.value == null)
            {
                s = (new StringBuilder()).append(s).append(cookie.name).append(";").toString();
            } else
            {
                s = (new StringBuilder()).append(s).append(cookie.name).append("=").append(cookie.value).append(";").toString();
            }
        }

        return new BasicNameValuePair("Cookie", s);
    }
}
