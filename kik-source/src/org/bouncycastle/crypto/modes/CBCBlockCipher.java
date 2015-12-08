// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class CBCBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private BlockCipher e;
    private boolean f;

    public CBCBlockCipher(BlockCipher blockcipher)
    {
        e = null;
        e = blockcipher;
        d = blockcipher.getBlockSize();
        a = new byte[d];
        b = new byte[d];
        c = new byte[d];
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = false;
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(abyte0, i, c, 0, d);
        int l = e.processBlock(abyte0, i, abyte1, j);
        for (i = ((flag) ? 1 : 0); i < d; i++)
        {
            int k = j + i;
            abyte1[k] = (byte)(abyte1[k] ^ b[i]);
        }

        abyte0 = b;
        b = c;
        c = abyte0;
        return l;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        for (int k = 0; k < d; k++)
        {
            byte abyte2[] = b;
            abyte2[k] = (byte)(abyte2[k] ^ abyte0[i + k]);
        }

        i = e.processBlock(b, 0, abyte1, j);
        System.arraycopy(abyte1, j, b, 0, b.length);
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(e.getAlgorithmName()).append("/CBC").toString();
    }

    public int getBlockSize()
    {
        return e.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return e;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        f = flag;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length != d)
            {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            } else
            {
                System.arraycopy(abyte0, 0, a, 0, abyte0.length);
                reset();
                e.init(flag, cipherparameters.getParameters());
                return;
            }
        } else
        {
            reset();
            e.init(flag, cipherparameters);
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
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
        System.arraycopy(a, 0, b, 0, a.length);
        Arrays.a(c);
        e.reset();
    }
}
