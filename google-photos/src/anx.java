// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class anx
    implements ann
{

    private static any a = new any();
    private final ata b;
    private final int c;
    private final any d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    public anx(ata ata1)
    {
        this(ata1, 2500, a);
    }

    private anx(ata ata1, int i, any any1)
    {
        b = ata1;
        c = 2500;
        d = any1;
    }

    private InputStream a(URL url, int i, URL url1, Map map)
    {
        int j;
        do
        {
            if (i >= 5)
            {
                throw new and("Too many (> 5) redirects!");
            }
            if (url1 != null)
            {
                try
                {
                    if (url.toURI().equals(url1.toURI()))
                    {
                        throw new and("In re-direct loop");
                    }
                }
                // Misplaced declaration of an exception variable
                catch (URL url1) { }
            }
            e = d.a(url);
            java.util.Map.Entry entry;
            for (url1 = map.entrySet().iterator(); url1.hasNext(); e.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)url1.next();
            }

            e.setConnectTimeout(c);
            e.setReadTimeout(c);
            e.setUseCaches(false);
            e.setDoInput(true);
            e.connect();
            if (g)
            {
                return null;
            }
            j = e.getResponseCode();
            if (j / 100 == 2)
            {
                url = e;
                if (TextUtils.isEmpty(url.getContentEncoding()))
                {
                    i = url.getContentLength();
                    f = baa.a(url.getInputStream(), i);
                } else
                {
                    if (Log.isLoggable("HttpUrlFetcher", 3))
                    {
                        url1 = String.valueOf(url.getContentEncoding());
                        if (url1.length() != 0)
                        {
                            "Got non empty content encoding: ".concat(url1);
                        } else
                        {
                            new String("Got non empty content encoding: ");
                        }
                    }
                    f = url.getInputStream();
                }
                return f;
            }
            if (j / 100 != 3)
            {
                break;
            }
            url1 = e.getHeaderField("Location");
            if (TextUtils.isEmpty(url1))
            {
                throw new and("Received empty or null redirect url");
            }
            URL url2 = new URL(url, url1);
            i++;
            url1 = url;
            url = url2;
        } while (true);
        if (j == -1)
        {
            throw new and(j);
        } else
        {
            throw new and(e.getResponseMessage(), j);
        }
    }

    public final void a()
    {
        if (f != null)
        {
            try
            {
                f.close();
            }
            catch (IOException ioexception) { }
        }
        if (e != null)
        {
            e.disconnect();
        }
    }

    public final void a(amb amb, ano ano1)
    {
        long l = bac.a();
        try
        {
            amb = b;
            if (((ata) (amb)).b == null)
            {
                amb.b = new URL(amb.a());
            }
            amb = a(((ata) (amb)).b, 0, null, b.b());
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        if (Log.isLoggable("HttpUrlFetcher", 2))
        {
            double d1 = bac.a(l);
            String s = String.valueOf(amb);
            (new StringBuilder(String.valueOf(s).length() + 74)).append("Finished http url fetcher fetch in ").append(d1).append(" ms and loaded ").append(s);
        }
        ano1.a(amb);
    }

    public final void b()
    {
        g = true;
    }

    public final amz c()
    {
        return amz.b;
    }

    public final Class d()
    {
        return java/io/InputStream;
    }

}
