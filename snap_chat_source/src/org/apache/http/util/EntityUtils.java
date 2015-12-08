// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

// Referenced classes of package org.apache.http.util:
//            Args, CharArrayBuffer

public final class EntityUtils
{

    public static String toString(HttpEntity httpentity)
    {
        return toString(httpentity, null);
    }

    public static String toString(HttpEntity httpentity, Charset charset)
    {
        char ac[];
        InputStream inputstream;
        boolean flag;
        ac = null;
        flag = false;
        Args.notNull(httpentity, "Entity");
        inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return null;
        }
        if (httpentity.getContentLength() <= 0x7fffffffL)
        {
            flag = true;
        }
        long l;
        Args.check(flag, "HTTP entity too large to be buffered in memory");
        l = httpentity.getContentLength();
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
            break MISSING_BLOCK_LABEL_94;
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
            break MISSING_BLOCK_LABEL_112;
        }
        httpentity = HTTP.DEF_CONTENT_CHARSET;
        httpentity = new InputStreamReader(inputstream, httpentity);
        charset = new CharArrayBuffer(i);
        obj = new char[1024];
_L1:
        i = httpentity.read(((char []) (obj)));
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        charset.append(((char []) (obj)), 0, i);
          goto _L1
        httpentity;
        inputstream.close();
        throw httpentity;
        httpentity;
        throw new UnsupportedEncodingException(httpentity.getMessage());
        httpentity = charset.toString();
        inputstream.close();
        return httpentity;
    }
}
