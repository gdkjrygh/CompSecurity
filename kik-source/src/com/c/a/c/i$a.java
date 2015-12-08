// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.a.u;
import java.io.Serializable;
import java.security.MessageDigest;

// Referenced classes of package com.c.a.c:
//            i

private static final class ct extends i
    implements Serializable
{

    final byte a[];

    public final int a()
    {
        return a.length * 8;
    }

    final boolean a(i j)
    {
        return MessageDigest.isEqual(a, j.e());
    }

    public final int b()
    {
        boolean flag;
        if (a.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] {
            Integer.valueOf(a.length)
        });
        return a[0] & 0xff | (a[1] & 0xff) << 8 | (a[2] & 0xff) << 16 | (a[3] & 0xff) << 24;
    }

    public final long c()
    {
        int j = 1;
        long l;
        boolean flag;
        if (a.length >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", new Object[] {
            Integer.valueOf(a.length)
        });
        l = a[0] & 0xff;
        for (; j < Math.min(a.length, 8); j++)
        {
            l |= ((long)a[j] & 255L) << j * 8;
        }

        return l;
    }

    public final byte[] d()
    {
        return (byte[])a.clone();
    }

    final byte[] e()
    {
        return a;
    }

    ct(byte abyte0[])
    {
        a = (byte[])u.a(abyte0);
    }
}
