// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package com.taplytics:
//            ic, ax, id, hx, 
//            a

abstract class hw
{

    static final ByteArrayBuffer a;
    static final ByteArrayBuffer b;
    private static final ByteArrayBuffer d;
    protected final Charset c;
    private final String e;
    private final String f;

    public hw(String s, Charset charset, String s1)
    {
        ax.a(s, "Multipart subtype");
        ax.a(s1, "Multipart boundary");
        e = s;
        if (charset == null)
        {
            charset = ic.a;
        }
        c = charset;
        f = s1;
    }

    private static ByteArrayBuffer a(Charset charset, String s)
    {
        charset = charset.encode(CharBuffer.wrap(s));
        s = new ByteArrayBuffer(charset.remaining());
        s.append(charset.array(), charset.position(), charset.remaining());
        return s;
    }

    protected static void a(id id1, Charset charset, OutputStream outputstream)
        throws IOException
    {
        a(id1.a, charset, outputstream);
        a(a, outputstream);
        a(id1.b, charset, outputstream);
        a(b, outputstream);
    }

    private void a(OutputStream outputstream, boolean flag)
        throws IOException
    {
        ByteArrayBuffer bytearraybuffer = a(c, f);
        for (Iterator iterator = a().iterator(); iterator.hasNext(); a(b, outputstream))
        {
            hx hx1 = (hx)iterator.next();
            a(d, outputstream);
            a(bytearraybuffer, outputstream);
            a(b, outputstream);
            a(hx1, outputstream);
            a(b, outputstream);
            if (flag)
            {
                hx1.b.a(outputstream);
            }
        }

        a(d, outputstream);
        a(bytearraybuffer, outputstream);
        a(d, outputstream);
        a(b, outputstream);
    }

    static void a(String s, OutputStream outputstream)
        throws IOException
    {
        a(a(ic.a, s), outputstream);
    }

    private static void a(String s, Charset charset, OutputStream outputstream)
        throws IOException
    {
        a(a(charset, s), outputstream);
    }

    static void a(ByteArrayBuffer bytearraybuffer, OutputStream outputstream)
        throws IOException
    {
        outputstream.write(bytearraybuffer.buffer(), 0, bytearraybuffer.length());
    }

    public abstract List a();

    protected abstract void a(hx hx1, OutputStream outputstream)
        throws IOException;

    public final void a(OutputStream outputstream)
        throws IOException
    {
        a(outputstream, true);
    }

    public final long b()
    {
        Object obj = a().iterator();
        long l = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            long l1 = ((hx)((Iterator) (obj)).next()).b.e();
            if (l1 >= 0L)
            {
                l = l1 + l;
            } else
            {
                return -1L;
            }
        }
        obj = new ByteArrayOutputStream();
        int i;
        try
        {
            a(((OutputStream) (obj)), false);
            i = ((ByteArrayOutputStream) (obj)).toByteArray().length;
        }
        catch (IOException ioexception)
        {
            return -1L;
        }
        return (long)i + l;
    }

    static 
    {
        a = a(ic.a, ": ");
        b = a(ic.a, "\r\n");
        d = a(ic.a, "--");
    }
}
