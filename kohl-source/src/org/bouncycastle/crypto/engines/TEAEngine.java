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

    private static final int block_size = 8;
    private static final int d_sum = 0xc6ef3720;
    private static final int delta = 0x9e3779b9;
    private static final int rounds = 32;
    private int _a;
    private int _b;
    private int _c;
    private int _d;
    private boolean _forEncryption;
    private boolean _initialised;

    public TEAEngine()
    {
        _initialised = false;
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
        int i1 = bytesToInt(abyte0, i);
        int j1 = bytesToInt(abyte0, i + 4);
        int l = 0xc6ef3720;
        int k = 0;
        i = i1;
        i1 = j1;
        for (; k != 32; k++)
        {
            i1 -= (i << 4) + _c ^ i + l ^ (i >>> 5) + _d;
            i -= (i1 << 4) + _a ^ i1 + l ^ (i1 >>> 5) + _b;
            l += 0x61c88647;
        }

        unpackInt(i, abyte1, j);
        unpackInt(i1, abyte1, j + 4);
        return 8;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = 0;
        int k = bytesToInt(abyte0, i);
        i = bytesToInt(abyte0, i + 4);
        int i1 = 0;
        for (; l != 32; l++)
        {
            i1 -= 0x61c88647;
            k += (i << 4) + _a ^ i + i1 ^ (i >>> 5) + _b;
            i += (k << 4) + _c ^ k + i1 ^ (k >>> 5) + _d;
        }

        unpackInt(k, abyte1, j);
        unpackInt(i, abyte1, j + 4);
        return 8;
    }

    private void setKey(byte abyte0[])
    {
        _a = bytesToInt(abyte0, 0);
        _b = bytesToInt(abyte0, 4);
        _c = bytesToInt(abyte0, 8);
        _d = bytesToInt(abyte0, 12);
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
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to TEA init - ").append(cipherparameters.getClass().getName()).toString());
        } else
        {
            _forEncryption = flag;
            _initialised = true;
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!_initialised)
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
        if (_forEncryption)
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
