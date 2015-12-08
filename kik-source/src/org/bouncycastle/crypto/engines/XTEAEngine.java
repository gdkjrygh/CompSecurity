// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class XTEAEngine
    implements BlockCipher
{

    private int a[];
    private int b[];
    private int c[];
    private boolean d;
    private boolean e;

    public XTEAEngine()
    {
        a = new int[4];
        b = new int[32];
        c = new int[32];
        d = false;
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
        int k = bytesToInt(abyte0, i);
        int l = bytesToInt(abyte0, i + 4);
        for (i = 31; i >= 0; i--)
        {
            l -= (k << 4 ^ k >>> 5) + k ^ c[i];
            k -= (l << 4 ^ l >>> 5) + l ^ b[i];
        }

        unpackInt(k, abyte1, j);
        unpackInt(l, abyte1, j + 4);
        return 8;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = bytesToInt(abyte0, i);
        int k = bytesToInt(abyte0, i + 4);
        for (i = 0; i < 32; i++)
        {
            l += (k << 4 ^ k >>> 5) + k ^ b[i];
            k += (l << 4 ^ l >>> 5) + l ^ c[i];
        }

        unpackInt(l, abyte1, j);
        unpackInt(k, abyte1, j + 4);
        return 8;
    }

    private void setKey(byte abyte0[])
    {
        boolean flag = false;
        int i = 0;
        for (int j = 0; j < 4;)
        {
            a[j] = bytesToInt(abyte0, i);
            j++;
            i += 4;
        }

        i = 0;
        int k = ((flag) ? 1 : 0);
        for (; i < 32; i++)
        {
            b[i] = a[k & 3] + k;
            k -= 0x61c88647;
            c[i] = a[k >>> 11 & 3] + k;
        }

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
        return "XTEA";
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
            e = flag;
            d = true;
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!d)
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
        if (e)
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
