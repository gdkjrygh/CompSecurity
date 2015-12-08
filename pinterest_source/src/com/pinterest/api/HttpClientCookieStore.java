// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.content.Context;
import com.pinterest.kit.log.PLog;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api:
//            PersistentCookieStore, ApiHttpClient

public class HttpClientCookieStore
    implements CookieStore
{

    private PersistentCookieStore a;

    public HttpClientCookieStore(Context context)
    {
        a = new PersistentCookieStore(context);
    }

    private static String b()
    {
        String s = ApiHttpClient.getBaseApiUrl().replace("%s", "");
        String s1;
        try
        {
            s1 = (new URI(s)).getHost();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            PLog.error(urisyntaxexception, "exception occurred", new Object[0]);
            return null;
        }
        s = s1;
        if (s1.startsWith("www."))
        {
            s = s1.substring(4);
        }
        return s;
    }

    public final String a(String s)
    {
        return a.a(s);
    }

    public final boolean a()
    {
        PLog.log((new StringBuilder("#clearAllUserCookies size: ")).append(getCookies().size()).toString(), new Object[0]);
        Object obj = new ArrayList();
        String s = b();
        Iterator iterator = getCookies().iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            HttpCookie httpcookie = (HttpCookie)iterator.next();
            String s1 = httpcookie.getName();
            String s2 = httpcookie.getDomain();
            PLog.log((new StringBuilder("Iterating through cookie: ")).append(s1).append(" ").append(s2).append(" baseApi: ").append(s).toString(), new Object[0]);
            if (s1.equals("_b") && s.endsWith(s2) && !httpcookie.hasExpired())
            {
                PLog.log((new StringBuilder("Persisting cookie ")).append(s1).toString(), new Object[0]);
                ((List) (obj)).add(httpcookie);
            } else
            {
                flag = true;
            }
        }
        a.removeAll();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); add(null, (HttpCookie)((Iterator) (obj)).next())) { }
        return flag;
    }

    public void add(URI uri, HttpCookie httpcookie)
    {
        PLog.log("#addCookie", new Object[0]);
        a.add(uri, httpcookie);
    }

    public List get(URI uri)
    {
        return a.get(uri);
    }

    public List getCookies()
    {
        PLog.log("#getCookies", new Object[0]);
        return a.getCookies();
    }

    public List getURIs()
    {
        PLog.log("#getURIs", new Object[0]);
        return a.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpcookie)
    {
        PLog.log("#remove", new Object[0]);
        return a.remove(uri, httpcookie);
    }

    public boolean removeAll()
    {
        PLog.log("#removeAll", new Object[0]);
        return a();
    }
}
