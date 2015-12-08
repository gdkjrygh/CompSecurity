// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            ResolverException, Request

public class Stream
    implements Serializable
{

    public static final String AMZ_BITRATE = "x-amz-meta-bitrate";
    public static final String AMZ_DURATION = "x-amz-meta-duration";
    public static final long DEFAULT_URL_LIFETIME = 60000L;
    static final String EXPIRES = "Expires";
    private static final long serialVersionUID = 0xe37beca41b2bd03aL;
    public final int bitRate;
    public final long contentLength;
    public final int duration;
    public final String eTag;
    public final long expires;
    public final long lastModified;
    public final String streamUrl;
    public final String url;

    public Stream(String s, String s1, String s2, long l, long l1, 
            int i, int j, long l2)
    {
        url = s;
        streamUrl = s1;
        eTag = s2;
        contentLength = l;
        lastModified = l1;
        duration = i;
        bitRate = j;
        expires = l2;
    }

    public Stream(String s, String s1, HttpResponse httpresponse)
        throws ResolverException
    {
        this(s, s1, getHeaderValue(httpresponse, "ETag"), getLongHeader(httpresponse, "Content-Length"), getDateHeader(httpresponse, "Last-Modified"), getIntHeader(httpresponse, "x-amz-meta-duration"), getIntHeader(httpresponse, "x-amz-meta-bitrate"), getExpires(s1));
    }

    public static SimpleDateFormat buildDateFormat()
    {
        return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    }

    public static long getDateHeader(HttpResponse httpresponse, String s)
        throws ResolverException
    {
        long l;
        try
        {
            l = buildDateFormat().parse(getHeaderValue(httpresponse, s)).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ResolverException(s, httpresponse);
        }
        return l;
    }

    private static long getExpires(String s)
    {
        int i;
        int j;
        i = 0;
        s = s.substring(Math.min(s.length(), s.indexOf('?') + 1), s.length()).split("&");
        j = s.length;
_L2:
        String as[];
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        as = s[i].split("=", 2);
        if (as == null || as.length != 2)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        String s1;
        if (!"Expires".equalsIgnoreCase(URLDecoder.decode(as[0], "UTF-8")))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = URLDecoder.decode(as[1], "UTF-8");
        long l = Long.parseLong(s1);
        return l * 1000L;
        Object obj;
        obj;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return System.currentTimeMillis() + 60000L;
        obj;
          goto _L3
    }

    private static String getHeaderValue(HttpResponse httpresponse, String s)
        throws ResolverException
    {
        Header header = httpresponse.getFirstHeader(s);
        if (header != null && header.getValue() != null)
        {
            return header.getValue();
        } else
        {
            throw new ResolverException((new StringBuilder("header ")).append(s).append(" not set").toString(), httpresponse);
        }
    }

    public static int getIntHeader(HttpResponse httpresponse, String s)
        throws ResolverException
    {
        int i;
        try
        {
            i = Integer.parseInt(getHeaderValue(httpresponse, s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ResolverException(s, httpresponse);
        }
        return i;
    }

    public static long getLongHeader(HttpResponse httpresponse, String s)
        throws ResolverException
    {
        long l;
        try
        {
            l = Long.parseLong(getHeaderValue(httpresponse, s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ResolverException(s, httpresponse);
        }
        return l;
    }

    public String toString()
    {
        return (new StringBuilder("Stream{url='")).append(url).append('\'').append(", streamUrl='").append(streamUrl).append('\'').append(", eTag='").append(eTag).append('\'').append(", contentLength=").append(contentLength).append(", lastModified=").append(lastModified).append(", duration=").append(duration).append(", bitRate=").append(bitRate).append(", expires=").append(expires).append('}').toString();
    }

    public Request url()
    {
        return Request.to(url, new Object[0]);
    }

    public Stream withNewStreamUrl(String s)
    {
        return new Stream(url, s, eTag, contentLength, lastModified, duration, bitRate, getExpires(s));
    }
}
