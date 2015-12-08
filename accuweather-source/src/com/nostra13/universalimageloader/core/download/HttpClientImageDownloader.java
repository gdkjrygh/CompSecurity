// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.download;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.BufferedHttpEntity;

// Referenced classes of package com.nostra13.universalimageloader.core.download:
//            BaseImageDownloader

public class HttpClientImageDownloader extends BaseImageDownloader
{

    private HttpClient httpClient;

    public HttpClientImageDownloader(Context context, HttpClient httpclient)
    {
        super(context);
        httpClient = httpclient;
    }

    protected InputStream getStreamFromNetwork(String s, Object obj)
        throws IOException
    {
        s = new HttpGet(s);
        return (new BufferedHttpEntity(httpClient.execute(s).getEntity())).getContent();
    }
}
