// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.picasso:
//            Downloader, Utils, NetworkPolicy

public class OkHttpDownloader
    implements Downloader
{

    private final OkHttpClient client;

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
        client = okhttpclient;
    }

    public OkHttpDownloader(File file)
    {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttpDownloader(File file, long l)
    {
        this(defaultOkHttpClient());
        try
        {
            client.setCache(new Cache(file, l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    private static OkHttpClient defaultOkHttpClient()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(20000L, TimeUnit.MILLISECONDS);
        okhttpclient.setWriteTimeout(20000L, TimeUnit.MILLISECONDS);
        return okhttpclient;
    }

    protected final OkHttpClient getClient()
    {
        return client;
    }

    public Downloader.Response load(Uri uri, int i)
        throws IOException
    {
        Object obj = null;
        int j;
        if (i != 0)
        {
            if (NetworkPolicy.isOfflineOnly(i))
            {
                obj = CacheControl.FORCE_CACHE;
            } else
            {
                obj = new com.squareup.okhttp.CacheControl.Builder();
                if (!NetworkPolicy.shouldReadFromDiskCache(i))
                {
                    ((com.squareup.okhttp.CacheControl.Builder) (obj)).noCache();
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i))
                {
                    ((com.squareup.okhttp.CacheControl.Builder) (obj)).noStore();
                }
                obj = ((com.squareup.okhttp.CacheControl.Builder) (obj)).build();
            }
        }
        uri = (new com.squareup.okhttp.Request.Builder()).url(uri.toString());
        if (obj != null)
        {
            uri.cacheControl(((CacheControl) (obj)));
        }
        uri = client.newCall(uri.build()).execute();
        j = uri.code();
        if (j >= 300)
        {
            uri.body().close();
            throw new Downloader.ResponseException((new StringBuilder()).append(j).append(" ").append(uri.message()).toString(), i, j);
        }
        boolean flag;
        if (uri.cacheResponse() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri = uri.body();
        return new Downloader.Response(uri.byteStream(), flag, uri.contentLength());
    }

    public void shutdown()
    {
        Cache cache;
        cache = client.getCache();
        if (cache == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        cache.close();
        return;
        IOException ioexception;
        ioexception;
    }
}
