// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.squareup.picasso:
//            Downloader, Utils

public class UrlConnectionDownloader
    implements Downloader
{
    private static class ResponseCacheIcs
    {

        static Object install(Context context1)
            throws IOException
        {
            java.io.File file = Utils.createDefaultCacheDir(context1);
            HttpResponseCache httpresponsecache = HttpResponseCache.getInstalled();
            context1 = httpresponsecache;
            if (httpresponsecache == null)
            {
                context1 = HttpResponseCache.install(file, Utils.calculateDiskCacheSize(file));
            }
            return context1;
        }

        private ResponseCacheIcs()
        {
        }
    }


    static final String RESPONSE_SOURCE = "X-Android-Response-Source";
    static volatile Object cache;
    private static final Object lock = new Object();
    private final Context context;

    public UrlConnectionDownloader(Context context1)
    {
        context = context1.getApplicationContext();
    }

    private static void installCacheIfNeeded(Context context1)
    {
        if (cache != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        synchronized (lock)
        {
            if (cache == null)
            {
                cache = ResponseCacheIcs.install(context1);
            }
        }
        return;
        context1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw context1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1) { }
    }

    public Downloader.Response load(Uri uri, boolean flag)
        throws IOException
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            installCacheIfNeeded(context);
        }
        uri = openConnection(uri);
        uri.setUseCaches(true);
        if (flag)
        {
            uri.setRequestProperty("Cache-Control", "only-if-cached,max-age=2147483647");
        }
        int i = uri.getResponseCode();
        if (i >= 300)
        {
            uri.disconnect();
            throw new Downloader.ResponseException((new StringBuilder()).append(i).append(" ").append(uri.getResponseMessage()).toString());
        } else
        {
            long l = uri.getHeaderFieldInt("Content-Length", -1);
            flag = Utils.parseResponseSourceHeader(uri.getHeaderField("X-Android-Response-Source"));
            return new Downloader.Response(uri.getInputStream(), flag, l);
        }
    }

    protected HttpURLConnection openConnection(Uri uri)
        throws IOException
    {
        uri = (HttpURLConnection)(new URL(uri.toString())).openConnection();
        uri.setConnectTimeout(15000);
        uri.setReadTimeout(20000);
        return uri;
    }

}
