// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import b.a.a.d;
import com.dropbox.client2.exception.DropboxParseException;
import java.io.StringReader;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

public final class <init>
{

    private String charset;
    private long fileSize;
    private mimeType metadata;
    private String mimeType;

    private static long parseFileSize(HttpResponse httpresponse, <init> <init>1)
    {
        long l = httpresponse.getEntity().getContentLength();
        if (l >= 0L)
        {
            return l;
        }
        if (<init>1 != null)
        {
            return <init>1.<init>;
        } else
        {
            return -1L;
        }
    }

    private static <init> parseXDropboxMetadata(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            return null;
        }
        httpresponse = httpresponse.getFirstHeader("X-Dropbox-Metadata");
        if (httpresponse == null)
        {
            return null;
        }
        httpresponse = ((HttpResponse) (d.a(new StringReader(httpresponse.getValue()))));
        if (httpresponse == null)
        {
            return null;
        } else
        {
            return new <init>((Map)httpresponse);
        }
    }

    public final String getCharset()
    {
        return charset;
    }

    public final long getContentLength()
    {
        return getFileSize();
    }

    public final long getFileSize()
    {
        return fileSize;
    }

    public final fileSize getMetadata()
    {
        return metadata;
    }

    public final String getMimeType()
    {
        return mimeType;
    }

    private tion(HttpResponse httpresponse)
    {
        mimeType = null;
        fileSize = -1L;
        charset = null;
        metadata = null;
        metadata = parseXDropboxMetadata(httpresponse);
        if (metadata == null)
        {
            throw new DropboxParseException("Error parsing metadata.");
        }
        fileSize = parseFileSize(httpresponse, metadata);
        if (fileSize == -1L)
        {
            throw new DropboxParseException("Error determining file size.");
        }
        httpresponse = httpresponse.getFirstHeader("Content-Type");
        if (httpresponse != null)
        {
            httpresponse = httpresponse.getValue();
            if (httpresponse != null)
            {
                httpresponse = httpresponse.split(";");
                if (httpresponse.length > 0)
                {
                    mimeType = httpresponse[0].trim();
                }
                if (httpresponse.length > 1)
                {
                    httpresponse = httpresponse[1].split("=");
                    if (httpresponse.length > 1)
                    {
                        charset = httpresponse[1].trim();
                    }
                }
            }
        }
    }

    charset(HttpResponse httpresponse, charset charset1)
    {
        this(httpresponse);
    }
}
