// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.Request;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public final class HttpUtils
{

    private HttpUtils()
    {
    }

    public static transient Request addQueryParams(Request request, String as[])
    {
        if (as != null)
        {
            if (as.length % 2 != 0)
            {
                throw new IllegalArgumentException("Query params must be passed in k/v pairs");
            }
            for (int i = 0; i < as.length; i += 2)
            {
                request.add(as[i], as[i + 1]);
            }

        }
        return request;
    }

    public static Uri getRedirectUri(HttpClient httpclient, Uri uri)
    {
        httpclient = httpclient.execute(new HttpGet(uri.toString()));
        if (302 != httpclient.getStatusLine().getStatusCode())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        httpclient = httpclient.getFirstHeader("Location");
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (!TextUtils.isEmpty(httpclient.getValue()))
        {
            return Uri.parse(httpclient.getValue());
        }
        break MISSING_BLOCK_LABEL_93;
        uri = SoundCloudApplication.TAG;
        (new StringBuilder("invalid status ")).append(httpclient.getStatusLine());
_L2:
        return null;
        httpclient;
        httpclient = SoundCloudApplication.TAG;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
