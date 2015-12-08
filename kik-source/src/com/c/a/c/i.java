// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.a.u;
import java.io.Serializable;
import java.security.MessageDigest;

public abstract class i
{
    private static final class a extends i
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

        a(byte abyte0[])
        {
            a = (byte[])u.a(abyte0);
        }
    }


    private static final char a[] = "0123456789abcdef".toCharArray();

    i()
    {
    }

    static i a(byte abyte0[])
    {
        return new a(abyte0);
    }

    public abstract int a();

    abstract boolean a(i j);

    public abstract int b();

    public abstract long c();

    public abstract byte[] d();

    byte[] e()
    {
        return d();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof i)
        {
            obj = (i)obj;
            flag = flag1;
            if (a() == ((i) (obj)).a())
            {
                flag = flag1;
                if (a(((i) (obj))))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        if (a() < 32) goto _L2; else goto _L1
_L1:
        int l = b();
_L4:
        return l;
_L2:
        byte abyte0[] = d();
        int j = abyte0[0] & 0xff;
        int k = 1;
        do
        {
            l = j;
            if (k >= abyte0.length)
            {
                continue;
            }
            j |= (abyte0[k] & 0xff) << k * 8;
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        byte abyte0[] = d();
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int k = abyte0.length;
        for (int j = 0; j < k; j++)
        {
            byte byte0 = abyte0[j];
            stringbuilder.append(a[byte0 >> 4 & 0xf]).append(a[byte0 & 0xf]);
        }

        return stringbuilder.toString();
    }

}
