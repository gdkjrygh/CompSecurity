// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class NoekeonEngine
    implements BlockCipher
{

    private static final int a[] = {
        0, 0, 0, 0
    };
    private static final int b[] = {
        128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 
        188, 99, 198, 151, 53, 106, 212
    };
    private int c[];
    private int d[];
    private int e[];
    private boolean f;
    private boolean g;

    public NoekeonEngine()
    {
        c = new int[4];
        d = new int[4];
        e = new int[4];
        f = false;
    }

    private static int a(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private static int a(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 16 | i << 24 | (abyte0[k] & 0xff) << 8 | abyte0[k + 1] & 0xff;
    }

    private static void a(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 24);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 16);
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    private static void a(int ai[])
    {
        ai[1] = ai[1] ^ ~ai[3] & ~ai[2];
        ai[0] = ai[0] ^ ai[2] & ai[1];
        int i = ai[3];
        ai[3] = ai[0];
        ai[0] = i;
        ai[2] = ai[2] ^ (ai[0] ^ ai[1] ^ ai[3]);
        ai[1] = ai[1] ^ ~ai[3] & ~ai[2];
        ai[0] = ai[0] ^ ai[2] & ai[1];
    }

    private static void a(int ai[], int ai1[])
    {
        int i = ai[0] ^ ai[2];
        i ^= a(i, 8) ^ a(i, 24);
        ai[1] = ai[1] ^ i;
        ai[3] = i ^ ai[3];
        for (i = 0; i < 4; i++)
        {
            ai[i] = ai[i] ^ ai1[i];
        }

        i = ai[1] ^ ai[3];
        i ^= a(i, 8) ^ a(i, 24);
        ai[0] = ai[0] ^ i;
        ai[2] = i ^ ai[2];
    }

    private int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        c[0] = a(abyte0, i);
        c[1] = a(abyte0, i + 4);
        c[2] = a(abyte0, i + 8);
        c[3] = a(abyte0, i + 12);
        for (i = 0; i < 16; i++)
        {
            abyte0 = c;
            abyte0[0] = abyte0[0] ^ b[i];
            a(c, d);
            b(c);
            a(c);
            c(c);
        }

        abyte0 = c;
        byte byte0 = abyte0[0];
        abyte0[0] = b[i] ^ byte0;
        a(c, d);
        a(c[0], abyte1, j);
        a(c[1], abyte1, j + 4);
        a(c[2], abyte1, j + 8);
        a(c[3], abyte1, j + 12);
        return 16;
    }

    private static void b(int ai[])
    {
        ai[1] = a(ai[1], 1);
        ai[2] = a(ai[2], 5);
        ai[3] = a(ai[3], 2);
    }

    private int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        c[0] = a(abyte0, i);
        c[1] = a(abyte0, i + 4);
        c[2] = a(abyte0, i + 8);
        c[3] = a(abyte0, i + 12);
        System.arraycopy(d, 0, e, 0, d.length);
        a(e, a);
        for (i = 16; i > 0; i--)
        {
            a(c, e);
            abyte0 = c;
            abyte0[0] = abyte0[0] ^ b[i];
            b(c);
            a(c);
            c(c);
        }

        a(c, e);
        abyte0 = c;
        byte byte0 = abyte0[0];
        abyte0[0] = b[i] ^ byte0;
        a(c[0], abyte1, j);
        a(c[1], abyte1, j + 4);
        a(c[2], abyte1, j + 8);
        a(c[3], abyte1, j + 12);
        return 16;
    }

    private static void c(int ai[])
    {
        ai[1] = a(ai[1], 31);
        ai[2] = a(ai[2], 27);
        ai[3] = a(ai[3], 30);
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!f)
        {
            throw new IllegalStateException("Noekeon not initialised");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (g)
        {
            return b(abyte0, i, abyte1, j);
        } else
        {
            return c(abyte0, i, abyte1, j);
        }
    }

    public final String a()
    {
        return "Noekeon";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to Noekeon init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            g = flag;
            f = true;
            cipherparameters = ((KeyParameter)cipherparameters).a();
            d[0] = a(((byte []) (cipherparameters)), 0);
            d[1] = a(((byte []) (cipherparameters)), 4);
            d[2] = a(((byte []) (cipherparameters)), 8);
            d[3] = a(((byte []) (cipherparameters)), 12);
            return;
        }
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
    }

}
