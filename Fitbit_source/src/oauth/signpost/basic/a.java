// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a
    implements oauth.signpost.http.a
{

    protected HttpURLConnection a;

    public a(HttpURLConnection httpurlconnection)
    {
        a = httpurlconnection;
    }

    public String a(String s)
    {
        return a.getRequestProperty(s);
    }

    public Map a()
    {
        Map map = a.getRequestProperties();
        HashMap hashmap = new HashMap(map.size());
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            List list = (List)map.get(s);
            if (!list.isEmpty())
            {
                hashmap.put(s, list.get(0));
            }
        } while (true);
        return hashmap;
    }

    public void a(String s, String s1)
    {
        a.setRequestProperty(s, s1);
    }

    public String b()
    {
        return a.getRequestProperty("Content-Type");
    }

    public void b(String s)
    {
    }

    public InputStream c()
        throws IOException
    {
        return null;
    }

    public String d()
    {
        return a.getRequestMethod();
    }

    public String e()
    {
        return a.getURL().toExternalForm();
    }

    public Object f()
    {
        return g();
    }

    public HttpURLConnection g()
    {
        return a;
    }
}
