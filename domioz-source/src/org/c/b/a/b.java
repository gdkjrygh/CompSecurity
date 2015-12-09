// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package org.c.b.a:
//            a

public final class b extends a
{

    private final byte a[];
    private final String b;

    public b(byte abyte0[])
    {
        this(abyte0, "resource loaded from byte array");
    }

    public b(byte abyte0[], String s)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Byte array must not be null");
        }
        a = abyte0;
        if (s == null)
        {
            s = "";
        }
        b = s;
    }

    public final long contentLength()
    {
        return (long)a.length;
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof b) && Arrays.equals(((b)obj).a, a);
    }

    public final boolean exists()
    {
        return true;
    }

    public final byte[] getByteArray()
    {
        return a;
    }

    public final String getDescription()
    {
        return b;
    }

    public final InputStream getInputStream()
    {
        return new ByteArrayInputStream(a);
    }

    public final int hashCode()
    {
        return [B.hashCode() * 29 * a.length;
    }
}
