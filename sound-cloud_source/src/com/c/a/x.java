// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.g;
import com.c.a.a.i;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package com.c.a:
//            z, r, y

public abstract class x
{

    public x()
    {
    }

    public static x create(r r1, File file)
    {
        if (file == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new z(r1, file);
        }
    }

    public static x create(r r1, String s)
    {
        Charset charset1 = i.c;
        r r2 = r1;
        if (r1 != null)
        {
            Charset charset;
            if (r1.b != null)
            {
                charset = Charset.forName(r1.b);
            } else
            {
                charset = null;
            }
            charset1 = charset;
            r2 = r1;
            if (charset == null)
            {
                charset1 = i.c;
                r2 = r.a((new StringBuilder()).append(r1).append("; charset=utf-8").toString());
            }
        }
        return create(r2, s.getBytes(charset1));
    }

    public static x create(r r1, byte abyte0[])
    {
        return create(r1, abyte0, 0, abyte0.length);
    }

    public static x create(r r1, byte abyte0[], int j, int k)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            i.a(abyte0.length, j, k);
            return new y(r1, k, abyte0, j);
        }
    }

    public long contentLength()
        throws IOException
    {
        return -1L;
    }

    public abstract r contentType();

    public abstract void writeTo(g g)
        throws IOException;
}
