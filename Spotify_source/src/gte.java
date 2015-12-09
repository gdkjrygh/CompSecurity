// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.logging.Logger;
import okio.ByteString;

public final class gte
    implements gtt
{

    private static final Logger a = Logger.getLogger(gtg.getName());
    private static final ByteString b = ByteString.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public gte()
    {
    }

    static int a(int i, byte byte0, short word0)
    {
        int j = i;
        if ((byte0 & 8) != 0)
        {
            j = i - 1;
        }
        if (word0 > j)
        {
            throw c("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word0), Integer.valueOf(j)
            });
        } else
        {
            return (short)(j - word0);
        }
    }

    static int a(hcj hcj1)
    {
        return (hcj1.g() & 0xff) << 16 | (hcj1.g() & 0xff) << 8 | hcj1.g() & 0xff;
    }

    static IOException a(String s, Object aobj[])
    {
        return c(s, aobj);
    }

    static ByteString a()
    {
        return b;
    }

    static void a(hci hci1, int i)
    {
        hci1.h(i >>> 16 & 0xff);
        hci1.h(i >>> 8 & 0xff);
        hci1.h(i & 0xff);
    }

    static IllegalArgumentException b(String s, Object aobj[])
    {
        throw new IllegalArgumentException(String.format(s, aobj));
    }

    static Logger b()
    {
        return a;
    }

    private static transient IOException c(String s, Object aobj[])
    {
        throw new IOException(String.format(s, aobj));
    }

    public final gsq a(hcj hcj1, boolean flag)
    {
        return new gth(hcj1, flag);
    }

    public final gss a(hci hci1, boolean flag)
    {
        return new gti(hci1, flag);
    }

}
