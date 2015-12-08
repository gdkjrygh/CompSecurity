// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            gm

public final class gl
{
    public static class a extends IOException
    {

        a(int k, int l)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(k).append(" limit ").append(l).append(").").toString());
        }
    }


    private final byte buffer[];
    private int position;
    private final int ux;

    private gl(byte abyte0[], int k, int l)
    {
        buffer = abyte0;
        position = k;
        ux = k + l;
    }

    public static gl a(byte abyte0[], int k, int l)
    {
        return new gl(abyte0, k, l);
    }

    public static gl g(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public void aD(int k)
        throws IOException
    {
        b((byte)k);
    }

    public void aE(int k)
        throws IOException
    {
        do
        {
            if ((k & 0xffffff80) == 0)
            {
                aD(k);
                return;
            }
            aD(k & 0x7f | 0x80);
            k >>>= 7;
        } while (true);
    }

    public void ab(String s)
        throws IOException
    {
        s = s.getBytes("UTF-8");
        aE(s.length);
        h(s);
    }

    public void b(byte byte0)
        throws IOException
    {
        if (position == ux)
        {
            throw new a(position, ux);
        } else
        {
            byte abyte0[] = buffer;
            int k = position;
            position = k + 1;
            abyte0[k] = byte0;
            return;
        }
    }

    public void b(int k, long l)
        throws IOException
    {
        d(k, 0);
        i(l);
    }

    public void b(int k, String s)
        throws IOException
    {
        d(k, 2);
        ab(s);
    }

    public void b(byte abyte0[], int k, int l)
        throws IOException
    {
        if (ux - position >= l)
        {
            System.arraycopy(abyte0, k, buffer, position, l);
            position = position + l;
            return;
        } else
        {
            throw new a(position, ux);
        }
    }

    public void d(int k, int l)
        throws IOException
    {
        aE(gm.e(k, l));
    }

    public int ec()
    {
        return ux - position;
    }

    public void h(byte abyte0[])
        throws IOException
    {
        b(abyte0, 0, abyte0.length);
    }

    public void i(long l)
        throws IOException
    {
        j(l);
    }

    public void j(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                aD((int)l);
                return;
            }
            aD((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }
}
