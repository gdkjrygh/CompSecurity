// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

public class NullEngine
    implements BlockCipher
{

    protected static final int BLOCK_SIZE = 1;
    private boolean initialised;

    public NullEngine()
    {
    }

    public String getAlgorithmName()
    {
        return "Null";
    }

    public int getBlockSize()
    {
        return 1;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        initialised = true;
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        if (!initialised)
        {
            throw new IllegalStateException("Null engine not initialised");
        }
        if (i + 1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 1 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int k = 0; k < 1; k++)
        {
            abyte1[j + k] = abyte0[i + k];
        }

        return 1;
    }

    public void reset()
    {
    }
}
