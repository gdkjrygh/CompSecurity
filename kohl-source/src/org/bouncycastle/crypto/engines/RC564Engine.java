// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RC5Parameters;

public class RC564Engine
    implements BlockCipher
{

    private static final long P64 = 0xb7e151628aed2a6bL;
    private static final long Q64 = 0x9e3779b97f4a7c15L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;
    private long _S[];
    private int _noRounds;
    private boolean forEncryption;

    public RC564Engine()
    {
        _noRounds = 12;
        _S = null;
    }

    private long bytesToWord(byte abyte0[], int i)
    {
        long l = 0L;
        for (int j = 7; j >= 0; j--)
        {
            l = (l << 8) + (long)(abyte0[j + i] & 0xff);
        }

        return l;
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        long l = bytesToWord(abyte0, i);
        long l1 = bytesToWord(abyte0, i + 8);
        for (i = _noRounds; i >= 1; i--)
        {
            l1 = rotateRight(l1 - _S[i * 2 + 1], l) ^ l;
            l = rotateRight(l - _S[i * 2], l1) ^ l1;
        }

        wordToBytes(l - _S[0], abyte1, j);
        wordToBytes(l1 - _S[1], abyte1, j + 8);
        return 16;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = true;
        long l = bytesToWord(abyte0, i);
        long l1 = _S[0] + l;
        l = bytesToWord(abyte0, i + 8) + _S[1];
        for (i = ((flag) ? 1 : 0); i <= _noRounds; i++)
        {
            l1 = rotateLeft(l1 ^ l, l) + _S[i * 2];
            l = rotateLeft(l ^ l1, l1) + _S[i * 2 + 1];
        }

        wordToBytes(l1, abyte1, j);
        wordToBytes(l, abyte1, j + 8);
        return 16;
    }

    private long rotateLeft(long l, long l1)
    {
        return l << (int)(l1 & 63L) | l >>> (int)(64L - (63L & l1));
    }

    private long rotateRight(long l, long l1)
    {
        return l >>> (int)(l1 & 63L) | l << (int)(64L - (63L & l1));
    }

    private void setKey(byte abyte0[])
    {
        int l = 0;
        long al[] = new long[(abyte0.length + 7) / 8];
        for (int i = 0; i != abyte0.length; i++)
        {
            int i1 = i / 8;
            al[i1] = al[i1] + ((long)(abyte0[i] & 0xff) << (i % 8) * 8);
        }

        _S = new long[(_noRounds + 1) * 2];
        _S[0] = 0xb7e151628aed2a6bL;
        for (int j = 1; j < _S.length; j++)
        {
            _S[j] = _S[j - 1] - 0x61c8864680b583ebL;
        }

        int k;
        int j1;
        int k1;
        long l1;
        long l2;
        if (al.length > _S.length)
        {
            k = al.length * 3;
        } else
        {
            k = _S.length * 3;
        }
        l1 = 0L;
        l2 = 0L;
        j1 = 0;
        k1 = 0;
        for (; l < k; l++)
        {
            abyte0 = _S;
            l2 = rotateLeft(l2 + _S[k1] + l1, 3L);
            abyte0[k1] = l2;
            l1 = rotateLeft(al[j1] + l2 + l1, l1 + l2);
            al[j1] = l1;
            k1 = (k1 + 1) % _S.length;
            j1 = (j1 + 1) % al.length;
        }

    }

    private void wordToBytes(long l, byte abyte0[], int i)
    {
        for (int j = 0; j < 8; j++)
        {
            abyte0[j + i] = (byte)(int)l;
            l >>>= 8;
        }

    }

    public String getAlgorithmName()
    {
        return "RC5-64";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof RC5Parameters))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to RC564 init - ").append(cipherparameters.getClass().getName()).toString());
        } else
        {
            cipherparameters = (RC5Parameters)cipherparameters;
            forEncryption = flag;
            _noRounds = cipherparameters.getRounds();
            setKey(cipherparameters.getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (forEncryption)
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
