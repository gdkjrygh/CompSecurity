// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.squareup.a:
//            w, bk, bl, ag, 
//            y, bm, x

public class bj
    implements w
{

    static volatile Object a;
    private static final Object b = new Object();
    private static final ThreadLocal c = new bk();
    private final Context d;

    public bj(Context context)
    {
        d = context.getApplicationContext();
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
                a = bl.a(context);
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

    public x a(Uri uri, int i)
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
            if (ag.c(i))
            {
                uri = "only-if-cached,max-age=2147483647";
            } else
            {
                uri = (StringBuilder)c.get();
                uri.setLength(0);
                if (!ag.a(i))
                {
                    uri.append("no-cache");
                }
                if (!ag.b(i))
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
            throw new y((new StringBuilder()).append(j).append(" ").append(httpurlconnection.getResponseMessage()).toString(), i, j);
        } else
        {
            long l = httpurlconnection.getHeaderFieldInt("Content-Length", -1);
            boolean flag = bm.a(httpurlconnection.getHeaderField("X-Android-Response-Source"));
            return new x(httpurlconnection.getInputStream(), flag, l);
        }
    }

    protected HttpURLConnection a(Uri uri)
    {
        uri = (HttpURLConnection)(new URL(uri.toString())).openConnection();
        uri.setConnectTimeout(15000);
        uri.setReadTimeout(20000);
        return uri;
    }

}
