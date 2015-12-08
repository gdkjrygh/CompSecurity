// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.squareup.picasso:
//            Downloader, Utils

public class OkHttpDownloader
    implements Downloader
{

    static final String RESPONSE_SOURCE_ANDROID = "X-Android-Response-Source";
    static final String RESPONSE_SOURCE_OKHTTP = "OkHttp-Response-Source";
    private final OkUrlFactory urlFactory;

    public OkHttpDownloader(Context context)
    {
        this(Utils.createDefaultCacheDir(context));
    }

    public OkHttpDownloader(Context context, long l)
    {
        this(Utils.createDefaultCacheDir(context), l);
    }

    public OkHttpDownloader(OkHttpClient okhttpclient)
    {
        urlFactory = new OkUrlFactory(okhttpclient);
    }

    public OkHttpDownloader(File file)
    {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttpDownloader(File file, long l)
    {
        this(new OkHttpClient());
        try
        {
            urlFactory.client().setCache(new Cache(file, l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    protected OkHttpClient getClient()
    {
        return urlFactory.client();
    }

    public Downloader.Response load(Uri uri, boolean flag)
        throws IOException
    {
        HttpURLConnection httpurlconnection = openConnection(uri);
        httpurlconnection.setUseCaches(true);
        if (flag)
        {
            httpurlconnection.setRequestProperty("Cache-Control", "only-if-cached,max-age=2147483647");
        }
        int i = httpurlconnection.getResponseCode();
        if (i >= 300)
        {
            httpurlconnection.disconnect();
            throw new Downloader.ResponseException((new StringBuilder()).append(i).append(" ").append(httpurlconnection.getResponseMessage()).toString());
        }
        String s = httpurlconnection.getHeaderField("OkHttp-Response-Source");
        uri = s;
        if (s == null)
        {
            uri = httpurlconnection.getHeaderField("X-Android-Response-Source");
        }
        long l = httpurlconnection.getHeaderFieldInt("Content-Length", -1);
        flag = Utils.parseResponseSourceHeader(uri);
        return new Downloader.Response(httpurlconnection.getInputStream(), flag, l);
    }

    protected HttpURLConnection openConnection(Uri uri)
        throws IOException
    {
        uri = urlFactory.open(new URL(uri.toString()));
        uri.setConnectTimeout(15000);
        uri.setReadTimeout(20000);
        return uri;
    }
}
