// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

public class GOFBBlockCipher
    implements BlockCipher
{

    boolean a;
    int b;
    int c;
    private byte d[];
    private byte e[];
    private byte f[];
    private final int g;
    private final BlockCipher h;

    public GOFBBlockCipher(BlockCipher blockcipher)
    {
        a = true;
        h = blockcipher;
        g = blockcipher.b();
        if (g != 8)
        {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        } else
        {
            d = new byte[blockcipher.b()];
            e = new byte[blockcipher.b()];
            f = new byte[blockcipher.b()];
            return;
        }
    }

    private static int a(byte abyte0[], int i)
    {
        return (abyte0[i + 3] << 24 & 0xff000000) + (abyte0[i + 2] << 16 & 0xff0000) + (abyte0[i + 1] << 8 & 0xff00) + (abyte0[i] & 0xff);
    }

    private static void a(int i, byte abyte0[], int j)
    {
        abyte0[j + 3] = (byte)(i >>> 24);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j] = (byte)i;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (g + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (a)
        {
            a = false;
            h.a(e, 0, f, 0);
            b = a(f, 0);
            c = a(f, 4);
        }
        b = b + 0x1010101;
        c = c + 0x1010104;
        a(b, e, 0);
        a(c, e, 4);
        h.a(e, 0, f, 0);
        for (int k = 0; k < g; k++)
        {
            abyte1[j + k] = (byte)(f[k] ^ abyte0[i + k]);
        }

        System.arraycopy(e, g, e, 0, e.length - g);
        System.arraycopy(f, 0, e, e.length - g, g);
        return g;
    }

    public final String a()
    {
        return (new StringBuilder()).append(h.a()).append("/GCTR").toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a = true;
        b = 0;
        c = 0;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.a();
            if (abyte0.length < d.length)
            {
                System.arraycopy(abyte0, 0, d, d.length - abyte0.length, abyte0.length);
                for (int i = 0; i < d.length - abyte0.length; i++)
                {
                    d[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, d, 0, d.length);
            }
            c();
            if (cipherparameters.b() != null)
            {
                h.a(true, cipherparameters.b());
            }
        } else
        {
            c();
            if (cipherparameters != null)
            {
                h.a(true, cipherparameters);
                return;
            }
        }
    }

    public final int b()
    {
        return g;
    }

    public final void c()
    {
        System.arraycopy(d, 0, e, 0, d.length);
        h.c();
    }
}
