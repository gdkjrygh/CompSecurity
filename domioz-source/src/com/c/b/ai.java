// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

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

// Referenced classes of package com.c.b:
//            v, bj, af, x, 
//            w

public final class ai
    implements v
{

    private final OkHttpClient a;

    public ai(Context context)
    {
        this(bj.b(context));
    }

    private ai(OkHttpClient okhttpclient)
    {
        a = okhttpclient;
    }

    private ai(File file)
    {
        this(file, bj.a(file));
    }

    private ai(File file, long l)
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(20000L, TimeUnit.MILLISECONDS);
        okhttpclient.setWriteTimeout(20000L, TimeUnit.MILLISECONDS);
        this(okhttpclient);
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

    public final w a(Uri uri, int i)
    {
        Object obj = null;
        int j;
        if (i != 0)
        {
            if (af.c(i))
            {
                obj = CacheControl.FORCE_CACHE;
            } else
            {
                obj = new com.squareup.okhttp.CacheControl.Builder();
                if (!af.a(i))
                {
                    ((com.squareup.okhttp.CacheControl.Builder) (obj)).noCache();
                }
                if (!af.b(i))
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
            throw new x((new StringBuilder()).append(j).append(" ").append(uri.message()).toString(), i, j);
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
        return new w(uri.byteStream(), flag, uri.contentLength());
    }
}
