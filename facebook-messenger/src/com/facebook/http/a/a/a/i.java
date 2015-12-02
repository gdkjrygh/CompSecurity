// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.a.a.a;

import com.facebook.http.a.a.a.a.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.facebook.http.a.a.a:
//            f, c, a

public class i
    implements HttpEntity
{

    private static final char a[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final c b;
    private final Header c;
    private long d;
    private volatile boolean e;

    public i()
    {
        this(f.STRICT, null, null);
    }

    public i(f f1, String s, Charset charset)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = a();
        }
        s = f1;
        if (f1 == null)
        {
            s = f.STRICT;
        }
        b = new c("form-data", charset, s1, s);
        c = new BasicHeader("Content-Type", a(s1, charset));
        e = true;
    }

    protected String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        int k = random.nextInt(11);
        for (int j = 0; j < k + 30; j++)
        {
            stringbuilder.append(a[random.nextInt(a.length)]);
        }

        return stringbuilder.toString();
    }

    protected String a(String s, Charset charset)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("multipart/form-data; boundary=");
        stringbuilder.append(s);
        if (charset != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(charset.name());
        }
        return stringbuilder.toString();
    }

    public void a(a a1)
    {
        b.a(a1);
        e = true;
    }

    public void a(String s, b b1)
    {
        a(new a(s, b1));
    }

    public void consumeContent()
    {
        if (isStreaming())
        {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        } else
        {
            return;
        }
    }

    public InputStream getContent()
    {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        if (e)
        {
            d = b.c();
            e = false;
        }
        return d;
    }

    public Header getContentType()
    {
        return c;
    }

    public boolean isChunked()
    {
        return !isRepeatable();
    }

    public boolean isRepeatable()
    {
        for (Iterator iterator = b.a().iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).().e() < 0L)
            {
                return false;
            }
        }

        return true;
    }

    public boolean isStreaming()
    {
        return !isRepeatable();
    }

    public void writeTo(OutputStream outputstream)
    {
        b.a(outputstream);
    }

}
