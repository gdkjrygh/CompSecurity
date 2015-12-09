// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public abstract class grv
    implements Closeable
{

    public grv()
    {
    }

    public static grv a(grn grn1, String s)
    {
        Charset charset = gsp.c;
        grn grn2 = grn1;
        int i;
        if (grn1 != null)
        {
            Charset charset1;
            if (grn1.a != null)
            {
                charset1 = Charset.forName(grn1.a);
            } else
            {
                charset1 = null;
            }
            charset = charset1;
            grn2 = grn1;
            if (charset1 == null)
            {
                charset = gsp.c;
                grn2 = grn.a((new StringBuilder()).append(grn1).append("; charset=utf-8").toString());
            }
        }
        grn1 = new hch();
        i = s.length();
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex < beginIndex: ")).append(i).append(" < 0").toString());
        }
        if (i > s.length())
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex > string.length: ")).append(i).append(" > ").append(s.length()).toString());
        }
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        long l;
        if (charset.equals(hcy.a))
        {
            grn1 = grn1.a(s);
        } else
        {
            s = s.substring(0, i).getBytes(charset);
            grn1 = grn1.b(s, 0, s.length);
        }
        l = ((hch) (grn1)).b;
        if (grn1 == null)
        {
            throw new NullPointerException("source == null");
        } else
        {
            return new grv(grn2, l, grn1) {

                private grn a;
                private long b;
                private hcj c;

                public final grn a()
                {
                    return a;
                }

                public final long b()
                {
                    return b;
                }

                public final hcj c()
                {
                    return c;
                }

            
            {
                a = grn1;
                b = l;
                c = hcj1;
                super();
            }
            };
        }
    }

    public abstract grn a();

    public abstract long b();

    public abstract hcj c();

    public void close()
    {
        c().close();
    }

    public final InputStream d()
    {
        return c().f();
    }

    public final byte[] e()
    {
        hcj hcj1;
        long l;
        l = b();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder("Cannot buffer entire body for content length: ")).append(l).toString());
        }
        hcj1 = c();
        Object obj = hcj1.r();
        gsp.a(hcj1);
        if (l != -1L && l != (long)obj.length)
        {
            throw new IOException("Content-Length and stream length disagree");
        } else
        {
            return ((byte []) (obj));
        }
        obj;
        gsp.a(hcj1);
        throw obj;
    }

    public final String f()
    {
        byte abyte0[] = e();
        grn grn1 = a();
        Charset charset;
        if (grn1 != null)
        {
            charset = gsp.c;
            if (grn1.a != null)
            {
                charset = Charset.forName(grn1.a);
            }
        } else
        {
            charset = gsp.c;
        }
        return new String(abyte0, charset.name());
    }
}
