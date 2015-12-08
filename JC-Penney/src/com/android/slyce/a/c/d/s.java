// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.ah;
import com.android.slyce.a.am;
import java.io.IOException;
import java.util.logging.Logger;

// Referenced classes of package com.android.slyce.a.c.d:
//            av, g, u, x, 
//            j, i, k

final class s
    implements av
{

    private static final Logger a = Logger.getLogger(com/android/slyce/a/c/d/s.getName());
    private static final g b = g.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    s()
    {
    }

    static IOException a(String s1, Object aobj[])
    {
        return d(s1, aobj);
    }

    static Logger a()
    {
        return a;
    }

    static short a(short word0, byte byte0, short word1)
    {
        return b(word0, byte0, word1);
    }

    static g b()
    {
        return b;
    }

    static IllegalArgumentException b(String s1, Object aobj[])
    {
        return c(s1, aobj);
    }

    private static short b(short word0, byte byte0, short word1)
    {
        short word2 = word0;
        if ((byte0 & 8) != 0)
        {
            word2 = (short)(word0 - 1);
        }
        if (word1 > word2)
        {
            throw d("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word1), Short.valueOf(word2)
            });
        } else
        {
            return (short)(word2 - word1);
        }
    }

    private static transient IllegalArgumentException c(String s1, Object aobj[])
    {
        throw new IllegalArgumentException(String.format(s1, aobj));
    }

    private static transient IOException d(String s1, Object aobj[])
    {
        throw new IOException(String.format(s1, aobj));
    }

    public i a(am am, j j, boolean flag)
    {
        return new u(am, j, 4096, flag);
    }

    public k a(ah ah, boolean flag)
    {
        return new x(ah, flag);
    }

}
