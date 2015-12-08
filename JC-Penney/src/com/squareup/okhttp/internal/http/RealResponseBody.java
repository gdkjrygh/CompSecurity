// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.j;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            OkHeaders

public final class RealResponseBody extends ResponseBody
{

    private final Headers headers;
    private final j source;

    public RealResponseBody(Headers headers1, j j)
    {
        headers = headers1;
        source = j;
    }

    public long contentLength()
    {
        return OkHeaders.contentLength(headers);
    }

    public MediaType contentType()
    {
        String s = headers.get("Content-Type");
        if (s != null)
        {
            return MediaType.parse(s);
        } else
        {
            return null;
        }
    }

    public j source()
    {
        return source;
    }
}
