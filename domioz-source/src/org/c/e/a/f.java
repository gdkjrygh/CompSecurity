// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.c.c.l;

// Referenced classes of package org.c.e.a:
//            k

public abstract class f extends k
{

    private static final Charset a = Charset.forName("ISO-8859-1");
    private final l b;
    private final String c;
    private final byte d[];
    private final Charset e;

    protected f(l l1)
    {
        this(l1, l1.name(), null, null);
    }

    protected f(l l1, String s)
    {
        this(l1, s, null, null);
    }

    protected f(l l1, String s, byte abyte0[], Charset charset)
    {
        super((new StringBuilder()).append(l1.value()).append(" ").append(s).toString());
        b = l1;
        c = s;
        if (abyte0 == null)
        {
            abyte0 = new byte[0];
        }
        d = abyte0;
        if (charset == null)
        {
            charset = a;
        }
        e = charset;
    }

    public byte[] getResponseBodyAsByteArray()
    {
        return d;
    }

    public String getResponseBodyAsString()
    {
        String s;
        try
        {
            s = new String(d, e.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new InternalError(unsupportedencodingexception.getMessage());
        }
        return s;
    }

    public l getStatusCode()
    {
        return b;
    }

    public String getStatusText()
    {
        return c;
    }

}
