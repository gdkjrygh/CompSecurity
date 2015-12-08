// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class TEAEngine
    implements BlockCipher
{

    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public TEAEngine()
    {
        e = false;
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

    private int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        int l = a(abyte0, i);
        i = a(abyte0, i + 4);
        int i1 = 0;
        for (; k != 32; k++)
        {
            i1 -= 0x61c88647;
            l += (i << 4) + a ^ i + i1 ^ (i >>> 5) + b;
            i += (l << 4) + c ^ l + i1 ^ (l >>> 5) + d;
        }

        a(l, abyte1, j);
        a(i, abyte1, j + 4);
        return 8;
    }

    private int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = a(abyte0, i);
        int i1 = a(abyte0, i + 4);
        i = 0xc6ef3720;
        for (int k = 0; k != 32; k++)
        {
            i1 -= (l << 4) + c ^ l + i ^ (l >>> 5) + d;
            l -= (i1 << 4) + a ^ i1 + i ^ (i1 >>> 5) + b;
            i += 0x61c88647;
        }

        a(l, abyte1, j);
        a(i1, abyte1, j + 4);
        return 8;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!e)
        {
            throw new IllegalStateException("TEA not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (f)
        {
            return b(abyte0, i, abyte1, j);
        } else
        {
            return c(abyte0, i, abyte1, j);
        }
    }

    public final String a()
    {
        return "TEA";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to TEA init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            f = flag;
            e = true;
            cipherparameters = ((KeyParameter)cipherparameters).a();
            a = a(((byte []) (cipherparameters)), 0);
            b = a(((byte []) (cipherparameters)), 4);
            c = a(((byte []) (cipherparameters)), 8);
            d = a(((byte []) (cipherparameters)), 12);
            return;
        }
    }

    public final int b()
    {
        return 8;
    }

    public final void c()
    {
    }
}
