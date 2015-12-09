// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.WLUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.impl.cookie.BrowserCompatSpec;
import org.apache.http.impl.cookie.CookieSpecBase;

// Referenced classes of package com.worklight.wlclient:
//            WLRequest

public class WLCookieManager
{

    private static Set cookies;
    private static String instanceAuthId = null;

    public WLCookieManager()
    {
    }

    public static void addCookies(WLRequest wlrequest)
    {
        if (cookies != null && !cookies.isEmpty())
        {
            Object obj = new BrowserCompatSpec();
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(getCookies());
            obj = ((CookieSpecBase) (obj)).formatCookies(arraylist);
            wlrequest.getPostRequest().setHeader((Header)((List) (obj)).get(0));
        }
    }

    public static void clearCookies()
    {
        instanceAuthId = null;
        if (cookies != null)
        {
            cookies.clear();
        }
    }

    public static Set getCookies()
    {
        return cookies;
    }

    public static String getInstanceAuthId()
    {
        return instanceAuthId;
    }

    public static void handleResponseHeaders(Header aheader[], URI uri)
    {
        if (cookies == null)
        {
            cookies = new HashSet();
        }
        uri = new CookieOrigin(uri.getHost(), uri.getPort(), "/apps/services", false);
        BrowserCompatSpec browsercompatspec = new BrowserCompatSpec();
        int i = 0;
        do
        {
            if (i >= aheader.length)
            {
                return;
            }
            if (aheader[i].getName().toLowerCase().equals("set-cookie"))
            {
                List list;
                try
                {
                    list = browsercompatspec.parse(aheader[i], uri);
                }
                // Misplaced declaration of an exception variable
                catch (URI uri)
                {
                    WLUtils.error((new StringBuilder("handleResponseHeaders Cannot parse cookies for header ")).append(aheader[i].getName()).toString(), uri);
                    throw new RuntimeException(uri);
                }
                cookies.addAll(list);
            }
            i++;
        } while (true);
    }

    public static void setCookies(String s, String s1)
    {
        if (s == null || s.length() == 0)
        {
            WLUtils.debug(String.format("setCookies() can't parse cookieString which is null or empty.", new Object[0]));
            return;
        }
        if (s1 == null || s1.length() == 0)
        {
            WLUtils.debug(String.format("setCookies() can't create cookies with a null or empty domain.", new Object[0]));
            return;
        }
        HashSet hashset = new HashSet();
        s = s.split(";");
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                cookies = hashset;
                return;
            }
            String as[] = s[i].trim().split("=");
            if (as.length == 2)
            {
                BasicClientCookie basicclientcookie = new BasicClientCookie(as[0].trim(), as[1].trim());
                basicclientcookie.setDomain(s1);
                hashset.add(basicclientcookie);
            } else
            {
                WLUtils.debug(String.format("setCookies() can't parse cookie %s.", new Object[] {
                    s[i]
                }));
            }
            i++;
        } while (true);
    }

    public static void setInstanceAuthId(String s)
    {
        instanceAuthId = s;
    }

}
