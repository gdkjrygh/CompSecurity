// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import com.mopub.common.util.ResponseHeader;
import com.mopub.common.util.Streams;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public class DownloadResponse
{

    private byte a[];
    private final int b;
    private final long c;
    private final Header d[];

    public DownloadResponse(HttpResponse httpresponse)
    {
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        a = new byte[0];
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj1 = null;
        Object obj = httpresponse.getEntity();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new BufferedInputStream(((HttpEntity) (obj)).getContent());
        Streams.copyContent(((java.io.InputStream) (obj)), bytearrayoutputstream);
        a = bytearrayoutputstream.toByteArray();
_L5:
        Streams.closeStream(((java.io.Closeable) (obj)));
        Streams.closeStream(bytearrayoutputstream);
        b = httpresponse.getStatusLine().getStatusCode();
        c = a.length;
        d = httpresponse.getAllHeaders();
        return;
        httpresponse;
        obj = obj1;
_L3:
        Streams.closeStream(((java.io.Closeable) (obj)));
        Streams.closeStream(bytearrayoutputstream);
        throw httpresponse;
        httpresponse;
        if (true) goto _L3; else goto _L2
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] getByteArray()
    {
        return a;
    }

    public long getContentLength()
    {
        return c;
    }

    public String getFirstHeader(ResponseHeader responseheader)
    {
        Header aheader[] = d;
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (header.getName().equalsIgnoreCase(responseheader.getKey()))
            {
                return header.getValue();
            }
        }

        return null;
    }

    public int getStatusCode()
    {
        return b;
    }
}
