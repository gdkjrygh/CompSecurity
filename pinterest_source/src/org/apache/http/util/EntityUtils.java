// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

// Referenced classes of package org.apache.http.util:
//            ByteArrayBuffer, CharArrayBuffer

public final class EntityUtils
{

    private EntityUtils()
    {
    }

    public static void consume(HttpEntity httpentity)
    {
        if (httpentity != null && httpentity.isStreaming())
        {
            httpentity = httpentity.getContent();
            if (httpentity != null)
            {
                httpentity.close();
                return;
            }
        }
    }

    public static void consumeQuietly(HttpEntity httpentity)
    {
        try
        {
            consume(httpentity);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            return;
        }
    }

    public static String getContentCharSet(HttpEntity httpentity)
    {
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        Object obj = null;
        String s = obj;
        if (httpentity.getContentType() != null)
        {
            httpentity = httpentity.getContentType().getElements();
            s = obj;
            if (httpentity.length > 0)
            {
                httpentity = httpentity[0].getParameterByName("charset");
                s = obj;
                if (httpentity != null)
                {
                    s = httpentity.getValue();
                }
            }
        }
        return s;
    }

    public static String getContentMimeType(HttpEntity httpentity)
    {
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        Object obj = null;
        String s = obj;
        if (httpentity.getContentType() != null)
        {
            httpentity = httpentity.getContentType().getElements();
            s = obj;
            if (httpentity.length > 0)
            {
                s = httpentity[0].getName();
            }
        }
        return s;
    }

    public static byte[] toByteArray(HttpEntity httpentity)
    {
        InputStream inputstream;
        int i;
        i = 4096;
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return null;
        }
        if (httpentity.getContentLength() > 0x7fffffffL)
        {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        break MISSING_BLOCK_LABEL_61;
        httpentity;
        inputstream.close();
        throw httpentity;
        int j = (int)httpentity.getContentLength();
        byte abyte0[];
        if (j >= 0)
        {
            i = j;
        }
        httpentity = new ByteArrayBuffer(i);
        abyte0 = new byte[4096];
_L1:
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        httpentity.append(abyte0, 0, i);
          goto _L1
        httpentity = httpentity.toByteArray();
        inputstream.close();
        return httpentity;
    }

    public static String toString(HttpEntity httpentity)
    {
        return toString(httpentity, ((Charset) (null)));
    }

    public static String toString(HttpEntity httpentity, String s)
    {
        if (s != null)
        {
            s = Charset.forName(s);
        } else
        {
            s = null;
        }
        return toString(httpentity, ((Charset) (s)));
    }

    public static String toString(HttpEntity httpentity, Charset charset)
    {
        char ac[];
        InputStream inputstream;
        ac = null;
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return null;
        }
        if (httpentity.getContentLength() > 0x7fffffffL)
        {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        break MISSING_BLOCK_LABEL_59;
        httpentity;
        inputstream.close();
        throw httpentity;
        long l = httpentity.getContentLength();
        int i;
        int j = (int)l;
        i = j;
        if (j < 0)
        {
            i = 4096;
        }
        ContentType contenttype = ContentType.get(httpentity);
        httpentity = ac;
        if (contenttype == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        httpentity = contenttype.getCharset();
        Object obj = httpentity;
        if (httpentity == null)
        {
            obj = charset;
        }
        httpentity = ((HttpEntity) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        httpentity = HTTP.DEF_CONTENT_CHARSET;
        httpentity = new InputStreamReader(inputstream, httpentity);
        charset = new CharArrayBuffer(i);
        obj = new char[1024];
_L1:
        i = httpentity.read(((char []) (obj)));
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        charset.append(((char []) (obj)), 0, i);
          goto _L1
        httpentity;
        throw new UnsupportedEncodingException(httpentity.getMessage());
        httpentity = charset.toString();
        inputstream.close();
        return httpentity;
    }
}
