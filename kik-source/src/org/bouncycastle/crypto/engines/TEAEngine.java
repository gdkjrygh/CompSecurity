// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

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

    private int bytesToInt(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 16 | i << 24 | (abyte0[k] & 0xff) << 8 | abyte0[k + 1] & 0xff;
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = bytesToInt(abyte0, i);
        int i1 = bytesToInt(abyte0, i + 4);
        i = 0xc6ef3720;
        for (int k = 0; k != 32; k++)
        {
            i1 -= (l << 4) + c ^ l + i ^ (l >>> 5) + d;
            l -= (i1 << 4) + a ^ i1 + i ^ (i1 >>> 5) + b;
            i += 0x61c88647;
        }

        unpackInt(l, abyte1, j);
        unpackInt(i1, abyte1, j + 4);
        return 8;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        int l = bytesToInt(abyte0, i);
        i = bytesToInt(abyte0, i + 4);
        int i1 = 0;
        for (; k != 32; k++)
        {
            i1 -= 0x61c88647;
            l += (i << 4) + a ^ i + i1 ^ (i >>> 5) + b;
            i += (l << 4) + c ^ l + i1 ^ (l >>> 5) + d;
        }

        unpackInt(l, abyte1, j);
        unpackInt(i, abyte1, j + 4);
        return 8;
    }

    private void setKey(byte abyte0[])
    {
        a = bytesToInt(abyte0, 0);
        b = bytesToInt(abyte0, 4);
        c = bytesToInt(abyte0, 8);
        d = bytesToInt(abyte0, 12);
    }

    private void unpackInt(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 24);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 16);
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    public String getAlgorithmName()
    {
        return "TEA";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to TEA init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            f = flag;
            e = true;
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!e)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
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
            return encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            return decryptBlock(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
    }
}
