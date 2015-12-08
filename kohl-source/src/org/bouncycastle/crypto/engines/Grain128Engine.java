// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class Grain128Engine
    implements StreamCipher
{

    private static final int STATE_SIZE = 4;
    private int index;
    private boolean initialised;
    private int lfsr[];
    private int nfsr[];
    private byte out[];
    private int output;
    private byte workingIV[];
    private byte workingKey[];

    public Grain128Engine()
    {
        index = 4;
        initialised = false;
    }

    private byte getKeyStream()
    {
        if (index > 3)
        {
            oneRound();
            index = 0;
        }
        byte abyte0[] = out;
        int i = index;
        index = i + 1;
        return abyte0[i];
    }

    private int getOutput()
    {
        int i = nfsr[0];
        int j = nfsr[1];
        int k = nfsr[0] >>> 12 | nfsr[1] << 20;
        int l = nfsr[0];
        int i1 = nfsr[1];
        int j1 = nfsr[1];
        int k1 = nfsr[2];
        int l1 = nfsr[1];
        int i2 = nfsr[2];
        int j2 = nfsr[2];
        int k2 = nfsr[2];
        int l2 = nfsr[3];
        int i3 = nfsr[2];
        int j3 = nfsr[3];
        int k3 = nfsr[2] >>> 31 | nfsr[3] << 1;
        int l3 = lfsr[0];
        int i4 = lfsr[1];
        int j4 = lfsr[0];
        int k4 = lfsr[1];
        int l4 = lfsr[0];
        int i5 = lfsr[1];
        int j5 = lfsr[1];
        int k5 = lfsr[2];
        int l5 = lfsr[1];
        int i6 = lfsr[2];
        int j6 = lfsr[2];
        int k6 = lfsr[3];
        int l6 = lfsr[2];
        int i7 = lfsr[3];
        return (i >>> 2 | j << 30) ^ (k & k3 & (lfsr[2] >>> 31 | lfsr[3] << 1) ^ ((l3 >>> 8 | i4 << 24) & k ^ (j4 >>> 13 | k4 << 19) & (l4 >>> 20 | i5 << 12) ^ k3 & (j5 >>> 10 | k5 << 22) ^ (l5 >>> 28 | i6 << 4) & (j6 >>> 15 | k6 << 17)) ^ (l6 >>> 29 | i7 << 3)) ^ (l >>> 15 | i1 << 17) ^ (j1 >>> 4 | k1 << 28) ^ (l1 >>> 13 | i2 << 19) ^ j2 ^ (k2 >>> 9 | l2 << 23) ^ (i3 >>> 25 | j3 << 7);
    }

    private int getOutputLFSR()
    {
        return lfsr[0] ^ (lfsr[0] >>> 7 | lfsr[1] << 25) ^ (lfsr[1] >>> 6 | lfsr[2] << 26) ^ (lfsr[2] >>> 6 | lfsr[3] << 26) ^ (lfsr[2] >>> 17 | lfsr[3] << 15) ^ lfsr[3];
    }

    private int getOutputNFSR()
    {
        int i = nfsr[0];
        int j = nfsr[0];
        int k = nfsr[1];
        int l = nfsr[0];
        int i1 = nfsr[1];
        int j1 = nfsr[0];
        int k1 = nfsr[1];
        int l1 = nfsr[0];
        int i2 = nfsr[1];
        int j2 = nfsr[0];
        int k2 = nfsr[1];
        int l2 = nfsr[0];
        int i3 = nfsr[1];
        int j3 = nfsr[0];
        int k3 = nfsr[1];
        int l3 = nfsr[1];
        int i4 = nfsr[2];
        int j4 = nfsr[1];
        int k4 = nfsr[2];
        int l4 = nfsr[1];
        int i5 = nfsr[2];
        int j5 = nfsr[1];
        int k5 = nfsr[2];
        int l5 = nfsr[1];
        int i6 = nfsr[2];
        int j6 = nfsr[2];
        int k6 = nfsr[3];
        int l6 = nfsr[2];
        int i7 = nfsr[3];
        int j7 = nfsr[2];
        int k7 = nfsr[3];
        int l7 = nfsr[2];
        int i8 = nfsr[3];
        return i ^ (l2 >>> 26 | i3 << 6) ^ (l4 >>> 24 | i5 << 8) ^ (nfsr[2] >>> 27 | nfsr[3] << 5) ^ nfsr[3] ^ (j >>> 3 | k << 29) & (l6 >>> 3 | i7 << 29) ^ (l >>> 11 | i1 << 21) & (j1 >>> 13 | k1 << 19) ^ (l1 >>> 17 | i2 << 15) & (j2 >>> 18 | k2 << 14) ^ (j3 >>> 27 | k3 << 5) & (j5 >>> 27 | k5 << 5) ^ (l3 >>> 8 | i4 << 24) & (j4 >>> 16 | k4 << 16) ^ (l5 >>> 29 | i6 << 3) & (j6 >>> 1 | k6 << 31) ^ (j7 >>> 4 | k7 << 28) & (l7 >>> 20 | i8 << 12);
    }

    private void initGrain()
    {
        for (int i = 0; i < 8; i++)
        {
            output = getOutput();
            nfsr = shift(nfsr, getOutputNFSR() ^ lfsr[0] ^ output);
            lfsr = shift(lfsr, getOutputLFSR() ^ output);
        }

        initialised = true;
    }

    private void oneRound()
    {
        output = getOutput();
        out[0] = (byte)output;
        out[1] = (byte)(output >> 8);
        out[2] = (byte)(output >> 16);
        out[3] = (byte)(output >> 24);
        nfsr = shift(nfsr, getOutputNFSR() ^ lfsr[0]);
        lfsr = shift(lfsr, getOutputLFSR());
    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        abyte1[12] = -1;
        abyte1[13] = -1;
        abyte1[14] = -1;
        abyte1[15] = -1;
        workingKey = abyte0;
        workingIV = abyte1;
        int j = 0;
        for (; i < nfsr.length; i++)
        {
            nfsr[i] = workingKey[j + 3] << 24 | workingKey[j + 2] << 16 & 0xff0000 | workingKey[j + 1] << 8 & 0xff00 | workingKey[j] & 0xff;
            lfsr[i] = workingIV[j + 3] << 24 | workingIV[j + 2] << 16 & 0xff0000 | workingIV[j + 1] << 8 & 0xff00 | workingIV[j] & 0xff;
            j += 4;
        }

    }

    private int[] shift(int ai[], int i)
    {
        ai[0] = ai[1];
        ai[1] = ai[2];
        ai[2] = ai[3];
        ai[3] = i;
        return ai;
    }

    public String getAlgorithmName()
    {
        return "Grain-128";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        Object obj = (ParametersWithIV)cipherparameters;
        cipherparameters = ((ParametersWithIV) (obj)).getIV();
        if (cipherparameters == null || cipherparameters.length != 12)
        {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(((ParametersWithIV) (obj)).getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        } else
        {
            obj = (KeyParameter)((ParametersWithIV) (obj)).getParameters();
            workingIV = new byte[((KeyParameter) (obj)).getKey().length];
            workingKey = new byte[((KeyParameter) (obj)).getKey().length];
            lfsr = new int[4];
            nfsr = new int[4];
            out = new byte[4];
            System.arraycopy(cipherparameters, 0, workingIV, 0, cipherparameters.length);
            System.arraycopy(((KeyParameter) (obj)).getKey(), 0, workingKey, 0, ((KeyParameter) (obj)).getKey().length);
            setKey(workingKey, workingIV);
            initGrain();
            return;
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException
    {
        if (!initialised)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            abyte1[k + l] = (byte)(abyte0[i + l] ^ getKeyStream());
        }

    }

    public void reset()
    {
        index = 4;
        setKey(workingKey, workingIV);
        initGrain();
    }

    public byte returnByte(byte byte0)
    {
        if (!initialised)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        } else
        {
            return (byte)(getKeyStream() ^ byte0);
        }
    }
}
