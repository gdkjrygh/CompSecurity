// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.http.a;

public class HttpURLConnectionOAuthConsumer extends DefaultOAuthConsumer
{
    private static final class a
        implements oauth.signpost.http.a
    {

        private final HttpURLConnection a;
        private final InputStream b;

        public String a(String s)
        {
            return a.getRequestProperty(s);
        }

        public Map a()
        {
            HashMap hashmap = new HashMap();
            Iterator iterator = a.getRequestProperties().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry.getValue() != null && !((List)entry.getValue()).isEmpty())
                {
                    hashmap.put(entry.getKey(), ((List)entry.getValue()).get(0));
                }
            } while (true);
            return hashmap;
        }

        public void a(String s, String s1)
        {
            a.addRequestProperty(s, s1);
        }

        public String b()
        {
            return a.getRequestProperty("Content-Type");
        }

        public void b(String s)
        {
            com.fitbit.e.a.e("OAUTH", "Tried to reset HttpRequest Url, but cannot due to limitations", new Object[0]);
        }

        public InputStream c()
            throws IOException
        {
            return b;
        }

        public String d()
        {
            return a.getRequestMethod();
        }

        public String e()
        {
            return String.valueOf(a.getURL());
        }

        public Object f()
        {
            return a;
        }

        public a(HttpURLConnection httpurlconnection, InputStream inputstream)
        {
            a = httpurlconnection;
            b = inputstream;
        }
    }


    private static final long serialVersionUID = 1L;

    public HttpURLConnectionOAuthConsumer(String s, String s1)
    {
        super(s, s1);
    }

    protected oauth.signpost.http.a a(Object obj)
    {
        return a((HttpURLConnection)obj);
    }

    protected oauth.signpost.http.a a(HttpURLConnection httpurlconnection)
    {
        return a(httpurlconnection, null);
    }

    public oauth.signpost.http.a a(HttpURLConnection httpurlconnection, InputStream inputstream)
    {
        return new a(httpurlconnection, inputstream);
    }
}
