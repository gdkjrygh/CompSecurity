// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class chd
    implements cfs
{

    static volatile Object a;
    private static final Object b = new Object();
    private static final ThreadLocal c = new ThreadLocal() {

        private static StringBuilder a()
        {
            return new StringBuilder();
        }

        protected final Object initialValue()
        {
            return a();
        }

    };
    private final Context d;

    public chd(Context context)
    {
        d = context.getApplicationContext();
    }

    private static HttpURLConnection a(Uri uri)
    {
        uri = (HttpURLConnection)(new URL(uri.toString())).openConnection();
        uri.setConnectTimeout(15000);
        uri.setReadTimeout(20000);
        return uri;
    }

    private static void a(Context context)
    {
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        synchronized (b)
        {
            if (a == null)
            {
                a = che.a(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
    }

    public final cft a(Uri uri, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a(d);
        }
        HttpURLConnection httpurlconnection = a(uri);
        httpurlconnection.setUseCaches(true);
        if (i != 0)
        {
            int j;
            if (cgd.c(i))
            {
                uri = "only-if-cached,max-age=2147483647";
            } else
            {
                uri = (StringBuilder)c.get();
                uri.setLength(0);
                if (!cgd.a(i))
                {
                    uri.append("no-cache");
                }
                if (!cgd.b(i))
                {
                    if (uri.length() > 0)
                    {
                        uri.append(',');
                    }
                    uri.append("no-store");
                }
                uri = uri.toString();
            }
            httpurlconnection.setRequestProperty("Cache-Control", uri);
        }
        j = httpurlconnection.getResponseCode();
        if (j >= 300)
        {
            httpurlconnection.disconnect();
            throw new cfu((new StringBuilder()).append(j).append(" ").append(httpurlconnection.getResponseMessage()).toString(), i, j);
        } else
        {
            long l = httpurlconnection.getHeaderFieldInt("Content-Length", -1);
            boolean flag = chf.a(httpurlconnection.getHeaderField("X-Android-Response-Source"));
            return new cft(httpurlconnection.getInputStream(), flag, l);
        }
    }

}
