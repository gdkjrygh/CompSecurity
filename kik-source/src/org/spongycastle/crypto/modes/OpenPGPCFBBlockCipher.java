// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;

public class OpenPGPCFBBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private BlockCipher d;
    private int e;
    private int f;
    private boolean g;

    public OpenPGPCFBBlockCipher(BlockCipher blockcipher)
    {
        d = blockcipher;
        f = blockcipher.b();
        a = new byte[f];
        b = new byte[f];
        c = new byte[f];
    }

    private byte a(byte byte0, int i)
    {
        return (byte)(c[i] ^ byte0);
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k;
        int l;
        k = 2;
        l = 0;
        if (!g) goto _L2; else goto _L1
_L1:
        if (f + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (f + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (e <= f) goto _L4; else goto _L3
_L3:
        byte abyte2[] = b;
        l = f;
        byte byte0 = a(abyte0[i], f - 2);
        abyte1[j] = byte0;
        abyte2[l - 2] = byte0;
        abyte2 = b;
        l = f;
        byte0 = a(abyte0[i + 1], f - 1);
        abyte1[j + 1] = byte0;
        abyte2[l - 1] = byte0;
        d.a(b, 0, c, 0);
        for (; k < f; k++)
        {
            byte abyte3[] = b;
            byte byte1 = a(abyte0[i + k], k - 2);
            abyte1[j + k] = byte1;
            abyte3[k - 2] = byte1;
        }

          goto _L5
_L4:
        if (e != 0) goto _L7; else goto _L6
_L6:
        d.a(b, 0, c, 0);
        for (k = 0; k < f; k++)
        {
            byte abyte4[] = b;
            byte byte2 = a(abyte0[i + k], k);
            abyte1[j + k] = byte2;
            abyte4[k] = byte2;
        }

        e = e + f;
_L5:
        return f;
_L7:
        if (e == f)
        {
            d.a(b, 0, c, 0);
            abyte1[j] = a(abyte0[i], 0);
            abyte1[j + 1] = a(abyte0[i + 1], 1);
            System.arraycopy(b, 2, b, 0, f - 2);
            System.arraycopy(abyte1, j, b, f - 2, 2);
            d.a(b, 0, c, 0);
            for (; k < f; k++)
            {
                byte abyte5[] = b;
                byte byte3 = a(abyte0[i + k], k - 2);
                abyte1[j + k] = byte3;
                abyte5[k - 2] = byte3;
            }

            e = e + f;
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (f + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (f + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (e <= f) goto _L9; else goto _L8
_L8:
        byte byte4 = abyte0[i];
        b[f - 2] = byte4;
        abyte1[j] = a(byte4, f - 2);
        byte4 = abyte0[i + 1];
        b[f - 1] = byte4;
        abyte1[j + 1] = a(byte4, f - 1);
        d.a(b, 0, c, 0);
        for (; k < f; k++)
        {
            byte byte5 = abyte0[i + k];
            b[k - 2] = byte5;
            abyte1[j + k] = a(byte5, k - 2);
        }

          goto _L10
_L9:
        if (e != 0) goto _L12; else goto _L11
_L11:
        d.a(b, 0, c, 0);
        for (j = l; j < f; j++)
        {
            b[j] = abyte0[i + j];
            abyte1[j] = a(abyte0[i + j], j);
        }

        e = e + f;
_L10:
        return f;
_L12:
        if (e == f)
        {
            d.a(b, 0, c, 0);
            byte byte6 = abyte0[i];
            byte byte8 = abyte0[i + 1];
            abyte1[j] = a(byte6, 0);
            abyte1[j + 1] = a(byte8, 1);
            System.arraycopy(b, 2, b, 0, f - 2);
            b[f - 2] = byte6;
            b[f - 1] = byte8;
            d.a(b, 0, c, 0);
            for (; k < f; k++)
            {
                byte byte7 = abyte0[i + k];
                b[k - 2] = byte7;
                abyte1[j + k] = a(byte7, k - 2);
            }

            e = e + f;
        }
        if (true) goto _L10; else goto _L13
_L13:
    }

    public final String a()
    {
        return (new StringBuilder()).append(d.a()).append("/OpenPGPCFB").toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        g = flag;
        c();
        d.a(true, cipherparameters);
    }

    public final int b()
    {
        return d.b();
    }

    public final void c()
    {
        e = 0;
        System.arraycopy(a, 0, b, 0, b.length);
        d.c();
    }
}
