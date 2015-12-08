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

    private byte a[];
    private byte b[];
    private byte c[];
    private int d[];
    private int e[];
    private int f;
    private int g;
    private boolean h;

    public Grainv1Engine()
    {
        g = 2;
        h = false;
    }

    private byte getKeyStream()
    {
        if (g > 1)
        {
            oneRound();
            g = 0;
        }
        byte abyte0[] = c;
        int i = g;
        g = i + 1;
        return abyte0[i];
    }

    private int getOutput()
    {
        int i = e[0];
        int j = e[1];
        int k = e[0];
        int l = e[1];
        int i1 = e[0];
        int j1 = e[1];
        int k1 = e[0];
        int l1 = e[1];
        int i2 = e[1];
        int j2 = e[2];
        int k2 = e[2];
        int l2 = e[3];
        int i3 = e[3];
        int j3 = e[4];
        int k3 = e[3] >>> 15 | e[4] << 1;
        int l3 = d[0] >>> 3 | d[1] << 13;
        int i4 = d[1] >>> 9 | d[2] << 7;
        int j4 = d[2] >>> 14 | d[3] << 2;
        int k4 = d[4];
        return ((i >>> 1 | j << 15) ^ (k3 & (j4 & k4) ^ (l3 & j4 & k3 ^ (i4 ^ k3 ^ l3 & k4 ^ j4 & k4 ^ k4 & k3 ^ l3 & i4 & j4 ^ l3 & j4 & k4) ^ i4 & j4 & k3)) ^ (k >>> 2 | l << 14) ^ (i1 >>> 4 | j1 << 12) ^ (k1 >>> 10 | l1 << 6) ^ (i2 >>> 15 | j2 << 1) ^ (k2 >>> 11 | l2 << 5) ^ (i3 >>> 8 | j3 << 8)) & 0xffff;
    }

    private int getOutputLFSR()
    {
        return (d[0] ^ (d[0] >>> 13 | d[1] << 3) ^ (d[1] >>> 7 | d[2] << 9) ^ (d[2] >>> 6 | d[3] << 10) ^ (d[3] >>> 3 | d[4] << 13) ^ (d[3] >>> 14 | d[4] << 2)) & 0xffff;
    }

    private int getOutputNFSR()
    {
        int i = e[0];
        int j = e[0] >>> 9 | e[1] << 7;
        int k = e[0];
        int l = e[1];
        int i1 = e[0] >>> 15 | e[1] << 1;
        int j1 = e[1] >>> 5 | e[2] << 11;
        int k1 = e[1] >>> 12 | e[2] << 4;
        int l1 = e[2] >>> 1 | e[3] << 15;
        int i2 = e[2] >>> 5 | e[3] << 11;
        int j2 = e[2] >>> 13 | e[3] << 3;
        int k2 = e[3] >>> 4 | e[4] << 12;
        int l2 = e[3] >>> 12 | e[4] << 4;
        int i3 = e[3];
        int j3 = e[4];
        int k3 = e[3] >>> 15 | e[4] << 1;
        return (i ^ ((k >>> 14 | l << 2) ^ ((i3 >>> 14 | j3 << 2) ^ l2 ^ k2 ^ j2 ^ i2 ^ l1 ^ k1 ^ j1) ^ j) ^ k3 & l2 ^ i2 & l1 ^ i1 & j ^ l2 & k2 & j2 ^ l1 & k1 & j1 ^ k3 & j2 & k1 & j ^ l2 & k2 & i2 & l1 ^ k3 & l2 & j1 & i1 ^ k3 & l2 & k2 & j2 & i2 ^ j & (l1 & k1 & j1 & i1) ^ k2 & j2 & i2 & l1 & k1 & j1) & 0xffff;
    }

    private void initGrain()
    {
        for (int i = 0; i < 10; i++)
        {
            f = getOutput();
            e = shift(e, getOutputNFSR() ^ d[0] ^ f);
            d = shift(d, getOutputLFSR() ^ f);
        }

        h = true;
    }

    private void oneRound()
    {
        f = getOutput();
        c[0] = (byte)f;
        c[1] = (byte)(f >> 8);
        e = shift(e, getOutputNFSR() ^ d[0]);
        d = shift(d, getOutputLFSR());
    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        abyte1[8] = -1;
        abyte1[9] = -1;
        a = abyte0;
        b = abyte1;
        int j = 0;
        for (; i < e.length; i++)
        {
            e[i] = (a[j + 1] << 8 | a[j] & 0xff) & 0xffff;
            d[i] = (b[j + 1] << 8 | b[j] & 0xff) & 0xffff;
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
            b = new byte[((KeyParameter) (obj)).getKey().length];
            a = new byte[((KeyParameter) (obj)).getKey().length];
            d = new int[5];
            e = new int[5];
            c = new byte[2];
            System.arraycopy(cipherparameters, 0, b, 0, cipherparameters.length);
            System.arraycopy(((KeyParameter) (obj)).getKey(), 0, a, 0, ((KeyParameter) (obj)).getKey().length);
            setKey(a, b);
            initGrain();
            return;
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (!h)
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
        g = 2;
        setKey(a, b);
        initGrain();
    }

    public byte returnByte(byte byte0)
    {
        if (!h)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        } else
        {
            return (byte)(getKeyStream() ^ byte0);
        }
    }
}
