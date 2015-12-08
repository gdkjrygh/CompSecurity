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

    private byte a[];
    private byte b[];
    private byte c[];
    private int d[];
    private int e[];
    private int f;
    private int g;
    private boolean h;

    public Grain128Engine()
    {
        g = 4;
        h = false;
    }

    private byte getKeyStream()
    {
        if (g > 3)
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
        int k = e[0] >>> 12 | e[1] << 20;
        int l = e[0];
        int i1 = e[1];
        int j1 = e[1];
        int k1 = e[2];
        int l1 = e[1];
        int i2 = e[2];
        int j2 = e[2];
        int k2 = e[2];
        int l2 = e[3];
        int i3 = e[2];
        int j3 = e[3];
        int k3 = e[2] >>> 31 | e[3] << 1;
        int l3 = d[0];
        int i4 = d[1];
        int j4 = d[0];
        int k4 = d[1];
        int l4 = d[0];
        int i5 = d[1];
        int j5 = d[1];
        int k5 = d[2];
        int l5 = d[1];
        int i6 = d[2];
        int j6 = d[2];
        int k6 = d[3];
        int l6 = d[2];
        int i7 = d[3];
        return (i >>> 2 | j << 30) ^ (k & k3 & (d[2] >>> 31 | d[3] << 1) ^ ((l3 >>> 8 | i4 << 24) & k ^ (j4 >>> 13 | k4 << 19) & (l4 >>> 20 | i5 << 12) ^ k3 & (j5 >>> 10 | k5 << 22) ^ (l5 >>> 28 | i6 << 4) & (j6 >>> 15 | k6 << 17)) ^ (l6 >>> 29 | i7 << 3)) ^ (l >>> 15 | i1 << 17) ^ (j1 >>> 4 | k1 << 28) ^ (l1 >>> 13 | i2 << 19) ^ j2 ^ (k2 >>> 9 | l2 << 23) ^ (i3 >>> 25 | j3 << 7);
    }

    private int getOutputLFSR()
    {
        return d[0] ^ (d[0] >>> 7 | d[1] << 25) ^ (d[1] >>> 6 | d[2] << 26) ^ (d[2] >>> 6 | d[3] << 26) ^ (d[2] >>> 17 | d[3] << 15) ^ d[3];
    }

    private int getOutputNFSR()
    {
        int i = e[0];
        int j = e[0];
        int k = e[1];
        int l = e[0];
        int i1 = e[1];
        int j1 = e[0];
        int k1 = e[1];
        int l1 = e[0];
        int i2 = e[1];
        int j2 = e[0];
        int k2 = e[1];
        int l2 = e[0];
        int i3 = e[1];
        int j3 = e[0];
        int k3 = e[1];
        int l3 = e[1];
        int i4 = e[2];
        int j4 = e[1];
        int k4 = e[2];
        int l4 = e[1];
        int i5 = e[2];
        int j5 = e[1];
        int k5 = e[2];
        int l5 = e[1];
        int i6 = e[2];
        int j6 = e[2];
        int k6 = e[3];
        int l6 = e[2];
        int i7 = e[3];
        int j7 = e[2];
        int k7 = e[3];
        int l7 = e[2];
        int i8 = e[3];
        return i ^ (l2 >>> 26 | i3 << 6) ^ (l4 >>> 24 | i5 << 8) ^ (e[2] >>> 27 | e[3] << 5) ^ e[3] ^ (j >>> 3 | k << 29) & (l6 >>> 3 | i7 << 29) ^ (l >>> 11 | i1 << 21) & (j1 >>> 13 | k1 << 19) ^ (l1 >>> 17 | i2 << 15) & (j2 >>> 18 | k2 << 14) ^ (j3 >>> 27 | k3 << 5) & (j5 >>> 27 | k5 << 5) ^ (l3 >>> 8 | i4 << 24) & (j4 >>> 16 | k4 << 16) ^ (l5 >>> 29 | i6 << 3) & (j6 >>> 1 | k6 << 31) ^ (j7 >>> 4 | k7 << 28) & (l7 >>> 20 | i8 << 12);
    }

    private void initGrain()
    {
        for (int i = 0; i < 8; i++)
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
        c[2] = (byte)(f >> 16);
        c[3] = (byte)(f >> 24);
        e = shift(e, getOutputNFSR() ^ d[0]);
        d = shift(d, getOutputLFSR());
    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        abyte1[12] = -1;
        abyte1[13] = -1;
        abyte1[14] = -1;
        abyte1[15] = -1;
        a = abyte0;
        b = abyte1;
        int j = 0;
        for (; i < e.length; i++)
        {
            e[i] = a[j + 3] << 24 | a[j + 2] << 16 & 0xff0000 | a[j + 1] << 8 & 0xff00 | a[j] & 0xff;
            d[i] = b[j + 3] << 24 | b[j + 2] << 16 & 0xff0000 | b[j + 1] << 8 & 0xff00 | b[j] & 0xff;
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
            b = new byte[((KeyParameter) (obj)).getKey().length];
            a = new byte[((KeyParameter) (obj)).getKey().length];
            d = new int[4];
            e = new int[4];
            c = new byte[4];
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
        g = 4;
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
