// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class SimpleMultipartEntity
    implements HttpEntity
{

    private static final byte a[] = "\r\n".getBytes();
    private static final byte b[] = "Content-Transfer-Encoding: binary\r\n".getBytes();
    private static final char c[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final String d;
    private final byte e[];
    private final byte f[];
    private boolean g;
    private final List h = new ArrayList();
    private final ByteArrayOutputStream i = new ByteArrayOutputStream();
    private int j;
    private int k;

    public SimpleMultipartEntity()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        for (int l = 0; l < 30; l++)
        {
            stringbuilder.append(c[random.nextInt(c.length)]);
        }

        d = stringbuilder.toString();
        e = (new StringBuilder("--")).append(d).append("\r\n").toString().getBytes();
        f = (new StringBuilder("--")).append(d).append("--\r\n").toString().getBytes();
    }

    static byte[] a()
    {
        return b;
    }

    static byte[] a(SimpleMultipartEntity simplemultipartentity)
    {
        return simplemultipartentity.e;
    }

    static byte[] a(String s)
    {
        return c(s);
    }

    static byte[] a(String s, String s1)
    {
        return b(s, s1);
    }

    private static String b(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "application/octet-stream";
        }
        return s1;
    }

    static byte[] b()
    {
        return a;
    }

    private static byte[] b(String s, String s1)
    {
        return (new StringBuilder("Content-Disposition: form-data; name=\"")).append(s).append("\"; filename=\"").append(s1).append("\"\r\n").toString().getBytes();
    }

    private static byte[] c(String s)
    {
        return (new StringBuilder("Content-Type: ")).append(b(s)).append("\r\n").toString().getBytes();
    }

    public final void a(String s, File file, String s1)
    {
        h.add(new FilePart(s, file, b(s1)));
    }

    public final void a(String s, String s1, InputStream inputstream, String s2)
    {
        i.write(e);
        i.write(b(s, s1));
        i.write(c(s2));
        i.write(b);
        i.write(a);
        s = new byte[4096];
        do
        {
            int l = inputstream.read(s);
            if (l != -1)
            {
                i.write(s, 0, l);
            } else
            {
                i.write(a);
                i.flush();
                IOUtils.closeQuietly(i);
                return;
            }
        } while (true);
    }

    public final void a(String s, String s1, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "UTF-8";
        }
        s2 = (new StringBuilder("text/plain; charset=")).append(s3).toString();
        try
        {
            i.write(e);
            i.write((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s).append("\"\r\n").toString().getBytes());
            i.write(c(s2));
            i.write(a);
            i.write(s1.getBytes());
            i.write(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SimpleMultipartEntity", "addPart ByteArrayOutputStream exception", s);
        }
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
        throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        long l = i.size();
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            FilePart filepart = (FilePart)iterator.next();
            long l1 = filepart.a.length();
            long l2 = a.length;
            l1 = (long)filepart.b.length + (l1 + l2);
            if (l1 < 0L)
            {
                return -1L;
            }
            l = l1 + l;
        }

        return (long)f.length + l;
    }

    public Header getContentType()
    {
        return new BasicHeader("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append(d).toString());
    }

    public boolean isChunked()
    {
        return false;
    }

    public boolean isRepeatable()
    {
        return g;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
    {
        j = 0;
        k = (int)getContentLength();
        i.writeTo(outputstream);
        Object obj;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); IOUtils.closeQuietly(((InputStream) (obj))))
        {
            obj = (FilePart)iterator.next();
            outputstream.write(((FilePart) (obj)).b);
            obj = new FileInputStream(((FilePart) (obj)).a);
            byte abyte0[] = new byte[4096];
            do
            {
                int l = ((FileInputStream) (obj)).read(abyte0);
                if (l == -1)
                {
                    break;
                }
                outputstream.write(abyte0, 0, l);
            } while (true);
            outputstream.write(a);
            outputstream.flush();
        }

        outputstream.write(f);
    }


    private class FilePart
    {

        public File a;
        public byte b[];
        final SimpleMultipartEntity c;

        private byte[] a(String s, String s1, String s2)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            try
            {
                bytearrayoutputstream.write(SimpleMultipartEntity.a(c));
                bytearrayoutputstream.write(SimpleMultipartEntity.a(s, s1));
                bytearrayoutputstream.write(SimpleMultipartEntity.a(s2));
                bytearrayoutputstream.write(SimpleMultipartEntity.a());
                bytearrayoutputstream.write(SimpleMultipartEntity.b());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", s);
            }
            return bytearrayoutputstream.toByteArray();
        }

        public FilePart(String s, File file, String s1)
        {
            c = SimpleMultipartEntity.this;
            super();
            b = a(s, file.getName(), s1);
            a = file;
        }
    }

}
