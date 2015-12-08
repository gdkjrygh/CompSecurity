// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

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

// Referenced classes of package com.squareup.a:
//            w, bm, ag, y, 
//            x

public class aj
    implements w
{

    private final OkHttpClient a;

    public aj(Context context)
    {
        this(bm.b(context));
    }

    public aj(OkHttpClient okhttpclient)
    {
        a = okhttpclient;
    }

    public aj(File file)
    {
        this(file, bm.a(file));
    }

    public aj(File file, long l)
    {
        this(a());
        try
        {
            a.setCache(new Cache(file, l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    private static OkHttpClient a()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(20000L, TimeUnit.MILLISECONDS);
        okhttpclient.setWriteTimeout(20000L, TimeUnit.MILLISECONDS);
        return okhttpclient;
    }

    public x a(Uri uri, int i)
    {
        Object obj = null;
        int j;
        if (i != 0)
        {
            if (ag.c(i))
            {
                obj = CacheControl.FORCE_CACHE;
            } else
            {
                obj = new com.squareup.okhttp.CacheControl.Builder();
                if (!ag.a(i))
                {
                    ((com.squareup.okhttp.CacheControl.Builder) (obj)).noCache();
                }
                if (!ag.b(i))
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
        uri = a.newCall(uri.build()).execute();
        j = uri.code();
        if (j >= 300)
        {
            uri.body().close();
            throw new y((new StringBuilder()).append(j).append(" ").append(uri.message()).toString(), i, j);
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
        return new x(uri.byteStream(), flag, uri.contentLength());
    }
}
