// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.i.b;
import com.bumptech.glide.load.c.e;
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
//            c, g, h

public final class f
    implements c
{

    private static final h a = new g((byte)0);
    private final e b;
    private final h c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    public f(e e1)
    {
        this(e1, a);
    }

    private f(e e1, h h1)
    {
        b = e1;
        c = h1;
    }

    private InputStream a(URL url, int i, URL url1, Map map)
    {
        int j;
        do
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
            j = d.getResponseCode();
            if (j / 100 == 2)
            {
                url = d;
                if (TextUtils.isEmpty(url.getContentEncoding()))
                {
                    i = url.getContentLength();
                    e = com.bumptech.glide.i.b.a(url.getInputStream(), i);
                } else
                {
                    if (Log.isLoggable("HttpUrlFetcher", 3))
                    {
                        (new StringBuilder("Got non empty content encoding: ")).append(url.getContentEncoding());
                    }
                    e = url.getInputStream();
                }
                return e;
            }
            if (j / 100 != 3)
            {
                break;
            }
            url1 = d.getHeaderField("Location");
            if (TextUtils.isEmpty(url1))
            {
                throw new IOException("Received empty or null redirect url");
            }
            URL url2 = new URL(url, url1);
            i++;
            url1 = url;
            url = url2;
        } while (true);
        if (j == -1)
        {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        } else
        {
            throw new IOException((new StringBuilder("Request failed ")).append(j).append(": ").append(d.getResponseMessage()).toString());
        }
    }

    public final Object a(int i)
    {
        return a(b.a(), 0, null, b.b());
    }

    public final void a()
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

    public final String b()
    {
        return b.c();
    }

    public final void c()
    {
        f = true;
    }

}
