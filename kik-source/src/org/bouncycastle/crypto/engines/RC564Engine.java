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

    private int a;
    private long b[];
    private boolean c;

    public RC564Engine()
    {
        a = 12;
        b = null;
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
        for (i = a; i > 0; i--)
        {
            l1 = rotateRight(l1 - b[i * 2 + 1], l) ^ l;
            l = rotateRight(l - b[i * 2], l1) ^ l1;
        }

        wordToBytes(l - b[0], abyte1, j);
        wordToBytes(l1 - b[1], abyte1, j + 8);
        return 16;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = true;
        long l = bytesToWord(abyte0, i);
        long l1 = b[0] + l;
        l = bytesToWord(abyte0, i + 8) + b[1];
        for (i = ((flag) ? 1 : 0); i <= a; i++)
        {
            l1 = rotateLeft(l1 ^ l, l) + b[i * 2];
            l = rotateLeft(l ^ l1, l1) + b[i * 2 + 1];
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

        b = new long[(a + 1) * 2];
        b[0] = 0xb7e151628aed2a6bL;
        for (int j = 1; j < b.length; j++)
        {
            b[j] = b[j - 1] - 0x61c8864680b583ebL;
        }

        int k;
        int j1;
        int k1;
        long l1;
        long l2;
        if (al.length > b.length)
        {
            k = al.length * 3;
        } else
        {
            k = b.length * 3;
        }
        l1 = 0L;
        l2 = 0L;
        j1 = 0;
        k1 = 0;
        for (; l < k; l++)
        {
            abyte0 = b;
            l2 = rotateLeft(l2 + b[k1] + l1, 3L);
            abyte0[k1] = l2;
            l1 = rotateLeft(al[j1] + l2 + l1, l1 + l2);
            al[j1] = l1;
            k1 = (k1 + 1) % b.length;
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
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC564 init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            cipherparameters = (RC5Parameters)cipherparameters;
            c = flag;
            a = cipherparameters.getRounds();
            setKey(cipherparameters.getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (c)
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
