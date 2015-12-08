// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class Grainv1Engine
    implements StreamCipher
{

    private static final int STATE_SIZE = 5;
    private int index;
    private boolean initialised;
    private int lfsr[];
    private int nfsr[];
    private byte out[];
    private int output;
    private byte workingIV[];
    private byte workingKey[];

    public Grainv1Engine()
    {
        index = 2;
        initialised = false;
    }

    private byte getKeyStream()
    {
        if (index > 1)
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
        int k = nfsr[0];
        int l = nfsr[1];
        int i1 = nfsr[0];
        int j1 = nfsr[1];
        int k1 = nfsr[0];
        int l1 = nfsr[1];
        int i2 = nfsr[1];
        int j2 = nfsr[2];
        int k2 = nfsr[2];
        int l2 = nfsr[3];
        int i3 = nfsr[3];
        int j3 = nfsr[4];
        int k3 = nfsr[3] >>> 15 | nfsr[4] << 1;
        int l3 = lfsr[0] >>> 3 | lfsr[1] << 13;
        int i4 = lfsr[1] >>> 9 | lfsr[2] << 7;
        int j4 = lfsr[2] >>> 14 | lfsr[3] << 2;
        int k4 = lfsr[4];
        return ((i >>> 1 | j << 15) ^ (k3 & (j4 & k4) ^ (l3 & j4 & k3 ^ (i4 ^ k3 ^ l3 & k4 ^ j4 & k4 ^ k4 & k3 ^ l3 & i4 & j4 ^ l3 & j4 & k4) ^ i4 & j4 & k3)) ^ (k >>> 2 | l << 14) ^ (i1 >>> 4 | j1 << 12) ^ (k1 >>> 10 | l1 << 6) ^ (i2 >>> 15 | j2 << 1) ^ (k2 >>> 11 | l2 << 5) ^ (i3 >>> 8 | j3 << 8)) & 0xffff;
    }

    private int getOutputLFSR()
    {
        return (lfsr[0] ^ (lfsr[0] >>> 13 | lfsr[1] << 3) ^ (lfsr[1] >>> 7 | lfsr[2] << 9) ^ (lfsr[2] >>> 6 | lfsr[3] << 10) ^ (lfsr[3] >>> 3 | lfsr[4] << 13) ^ (lfsr[3] >>> 14 | lfsr[4] << 2)) & 0xffff;
    }

    private int getOutputNFSR()
    {
        int i = nfsr[0];
        int j = nfsr[0] >>> 9 | nfsr[1] << 7;
        int k = nfsr[0];
        int l = nfsr[1];
        int i1 = nfsr[0] >>> 15 | nfsr[1] << 1;
        int j1 = nfsr[1] >>> 5 | nfsr[2] << 11;
        int k1 = nfsr[1] >>> 12 | nfsr[2] << 4;
        int l1 = nfsr[2] >>> 1 | nfsr[3] << 15;
        int i2 = nfsr[2] >>> 5 | nfsr[3] << 11;
        int j2 = nfsr[2] >>> 13 | nfsr[3] << 3;
        int k2 = nfsr[3] >>> 4 | nfsr[4] << 12;
        int l2 = nfsr[3] >>> 12 | nfsr[4] << 4;
        int i3 = nfsr[3];
        int j3 = nfsr[4];
        int k3 = nfsr[3] >>> 15 | nfsr[4] << 1;
        return (i ^ ((k >>> 14 | l << 2) ^ ((i3 >>> 14 | j3 << 2) ^ l2 ^ k2 ^ j2 ^ i2 ^ l1 ^ k1 ^ j1) ^ j) ^ k3 & l2 ^ i2 & l1 ^ i1 & j ^ l2 & k2 & j2 ^ l1 & k1 & j1 ^ k3 & j2 & k1 & j ^ l2 & k2 & i2 & l1 ^ k3 & l2 & j1 & i1 ^ k3 & l2 & k2 & j2 & i2 ^ j & (l1 & k1 & j1 & i1) ^ k2 & j2 & i2 & l1 & k1 & j1) & 0xffff;
    }

    private void initGrain()
    {
        for (int i = 0; i < 10; i++)
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
        nfsr = shift(nfsr, getOutputNFSR() ^ lfsr[0]);
        lfsr = shift(lfsr, getOutputLFSR());
    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        abyte1[8] = -1;
        abyte1[9] = -1;
        workingKey = abyte0;
        workingIV = abyte1;
        int j = 0;
        for (; i < nfsr.length; i++)
        {
            nfsr[i] = (workingKey[j + 1] << 8 | workingKey[j] & 0xff) & 0xffff;
            lfsr[i] = (workingIV[j + 1] << 8 | workingIV[j] & 0xff) & 0xffff;
            j += 2;
        }

    }

    private int[] shift(int ai[], int i)
    {
        ai[0] = ai[1];
        ai[1] = ai[2];
        ai[2] = ai[3];
        ai[3] = ai[4];
        ai[4] = i;
        return ai;
    }

    public String getAlgorithmName()
    {
        return "Grain v1";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        Object obj = (ParametersWithIV)cipherparameters;
        cipherparameters = ((ParametersWithIV) (obj)).getIV();
        if (cipherparameters == null || cipherparameters.length != 8)
        {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(((ParametersWithIV) (obj)).getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        } else
        {
            obj = (KeyParameter)((ParametersWithIV) (obj)).getParameters();
            workingIV = new byte[((KeyParameter) (obj)).getKey().length];
            workingKey = new byte[((KeyParameter) (obj)).getKey().length];
            lfsr = new int[5];
            nfsr = new int[5];
            out = new byte[2];
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
        index = 2;
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
