// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g.b;
import com.bumptech.glide.i;
import com.bumptech.glide.load.b.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public class f
    implements c
{
    private static class a
        implements b
    {

        public HttpURLConnection a(URL url)
            throws IOException
        {
            return (HttpURLConnection)url.openConnection();
        }

        private a()
        {
        }

    }

    static interface b
    {

        public abstract HttpURLConnection a(URL url)
            throws IOException;
    }


    private static final b a = new a();
    private final d b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    public f(d d1)
    {
        this(d1, a);
    }

    f(d d1, b b1)
    {
        b = d1;
        c = b1;
    }

    private InputStream a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        if (TextUtils.isEmpty(httpurlconnection.getContentEncoding()))
        {
            int i = httpurlconnection.getContentLength();
            e = com.bumptech.glide.g.b.a(httpurlconnection.getInputStream(), i);
        } else
        {
            if (Log.isLoggable("HttpUrlFetcher", 3))
            {
                Log.d("HttpUrlFetcher", (new StringBuilder()).append("Got non empty content encoding: ").append(httpurlconnection.getContentEncoding()).toString());
            }
            e = httpurlconnection.getInputStream();
        }
        return e;
    }

    private InputStream a(URL url, int i, URL url1, Map map)
        throws IOException
    {
        if (i >= 5)
        {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url1 != null)
        {
            try
            {
                if (url.toURI().equals(url1.toURI()))
                {
                    throw new IOException("In re-direct loop");
                }
            }
            // Misplaced declaration of an exception variable
            catch (URL url1) { }
        }
        d = c.a(url);
        java.util.Map.Entry entry;
        for (url1 = map.entrySet().iterator(); url1.hasNext(); d.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)url1.next();
        }

        d.setConnectTimeout(2500);
        d.setReadTimeout(2500);
        d.setUseCaches(false);
        d.setDoInput(true);
        d.connect();
        if (f)
        {
            return null;
        }
        int j = d.getResponseCode();
        if (j / 100 == 2)
        {
            return a(d);
        }
        if (j / 100 == 3)
        {
            url1 = d.getHeaderField("Location");
            if (TextUtils.isEmpty(url1))
            {
                throw new IOException("Received empty or null redirect url");
            } else
            {
                return a(new URL(url, url1), i + 1, url, map);
            }
        }
        if (j == -1)
        {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        } else
        {
            throw new IOException((new StringBuilder()).append("Request failed ").append(j).append(": ").append(d.getResponseMessage()).toString());
        }
    }

    public InputStream a(i i)
        throws Exception
    {
        return a(b.a(), 0, null, b.c());
    }

    public void a()
    {
        if (e != null)
        {
            try
            {
                e.close();
            }
            catch (IOException ioexception) { }
        }
        if (d != null)
        {
            d.disconnect();
        }
    }

    public Object b(i i)
        throws Exception
    {
        return a(i);
    }

    public String b()
    {
        return b.d();
    }

    public void c()
    {
        f = true;
    }

}
