// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.http;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class e
    implements HttpEntity
{

    private static final char d[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    ByteArrayOutputStream a;
    boolean b;
    boolean c;
    private String e;

    public e()
    {
        int i = 0;
        super();
        e = null;
        a = new ByteArrayOutputStream();
        b = false;
        c = false;
        StringBuffer stringbuffer = new StringBuffer();
        Random random = new Random();
        for (; i < 30; i++)
        {
            stringbuffer.append(d[random.nextInt(d.length)]);
        }

        e = stringbuffer.toString();
    }

    public void a()
    {
        if (!c)
        {
            try
            {
                a.write((new StringBuilder("--")).append(e).append("\r\n").toString().getBytes());
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        c = true;
    }

    public void a(String s, String s1)
    {
        a();
        try
        {
            a.write((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s).append("\"\r\n\r\n").toString().getBytes());
            a.write(s1.getBytes());
            a.write((new StringBuilder("\r\n--")).append(e).append("\r\n").toString().getBytes());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void a(String s, String s1, InputStream inputstream, String s2, boolean flag)
    {
        a();
        s2 = (new StringBuilder("Content-Type: ")).append(s2).append("\r\n").toString();
        a.write((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s).append("\"; filename=\"").append(s1).append("\"\r\n").toString().getBytes());
        a.write(s2.getBytes());
        a.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes());
        s = new byte[4096];
_L1:
        int i = inputstream.read(s);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        a.write(s, 0, i);
          goto _L1
        s;
        s.printStackTrace();
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_197;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        a.write((new StringBuilder("\r\n--")).append(e).append("\r\n").toString().getBytes());
        a.flush();
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        return;
        s;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        throw s;
    }

    public void a(String s, String s1, InputStream inputstream, boolean flag)
    {
        a(s, s1, inputstream, "application/octet-stream", flag);
    }

    public void b()
    {
        if (b)
        {
            return;
        }
        try
        {
            a.write((new StringBuilder("\r\n--")).append(e).append("--\r\n").toString().getBytes());
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        b = true;
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
        return new ByteArrayInputStream(a.toByteArray());
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        b();
        return (long)a.toByteArray().length;
    }

    public Header getContentType()
    {
        return new BasicHeader("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append(e).toString());
    }

    public boolean isChunked()
    {
        return false;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream.write(a.toByteArray());
    }

}
