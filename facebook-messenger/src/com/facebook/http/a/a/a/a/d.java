// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.a.a.a.a;

import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package com.facebook.http.a.a.a.a:
//            a

public class d extends a
{

    private final int a;
    private final byte b[];
    private final Charset c;

    public d(String s, String s1, Charset charset)
    {
        super(s1);
        a = 4096;
        if (s == null)
        {
            throw new IllegalArgumentException("Text may not be null");
        }
        s1 = charset;
        if (charset == null)
        {
            s1 = Charset.forName("US-ASCII");
        }
        b = s.getBytes(s1.name());
        c = s1;
    }

    public d(String s, Charset charset)
    {
        this(s, "text/plain", charset);
    }

    public void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        int j = b.length;
        for (int i = 0; i < j; i += 4096)
        {
            outputstream.write(b, i, Math.min(j - i, 4096));
        }

        outputstream.flush();
    }

    public String b()
    {
        return null;
    }

    public String c()
    {
        return c.name();
    }

    public String d()
    {
        return "8bit";
    }

    public long e()
    {
        return (long)b.length;
    }
}
