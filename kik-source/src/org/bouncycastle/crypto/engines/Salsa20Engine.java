// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Strings;

public class Salsa20Engine
    implements StreamCipher
{

    private static final byte a[] = Strings.d("expand 32-byte k");
    private static final byte b[] = Strings.d("expand 16-byte k");
    private int c;
    private int d[];
    private int e[];
    private byte f[];
    private byte g[];
    private byte h[];
    private boolean i;
    private int j;
    private int k;
    private int l;

    public Salsa20Engine()
    {
        c = 0;
        d = new int[16];
        e = new int[16];
        f = new byte[64];
        g = null;
        h = null;
        i = false;
    }

    private int byteToIntLittle(byte abyte0[], int i1)
    {
        return abyte0[i1] & 0xff | (abyte0[i1 + 1] & 0xff) << 8 | (abyte0[i1 + 2] & 0xff) << 16 | abyte0[i1 + 3] << 24;
    }

    private byte[] intToByteLittle(int i1, byte abyte0[], int j1)
    {
        abyte0[j1] = (byte)i1;
        abyte0[j1 + 1] = (byte)(i1 >>> 8);
        abyte0[j1 + 2] = (byte)(i1 >>> 16);
        abyte0[j1 + 3] = (byte)(i1 >>> 24);
        return abyte0;
    }

    private boolean limitExceeded()
    {
        boolean flag1 = false;
        j = j + 1;
        boolean flag = flag1;
        if (j == 0)
        {
            k = k + 1;
            flag = flag1;
            if (k == 0)
            {
                l = l + 1;
                flag = flag1;
                if ((l & 0x20) != 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean limitExceeded(int i1)
    {
        if (j >= 0)
        {
            j = j + i1;
        } else
        {
            j = j + i1;
            if (j >= 0)
            {
                k = k + 1;
                if (k == 0)
                {
                    l = l + 1;
                    if ((l & 0x20) != 0)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void resetCounter()
    {
        j = 0;
        k = 0;
        l = 0;
    }

    private int rotl(int i1, int j1)
    {
        return i1 << j1 | i1 >>> -j1;
    }

    private void salsa20WordToByte(int ai[], byte abyte0[])
    {
        int l1 = 0;
        System.arraycopy(ai, 0, e, 0, ai.length);
        for (int i1 = 0; i1 < 10; i1++)
        {
            int ai1[] = e;
            ai1[4] = ai1[4] ^ rotl(e[0] + e[12], 7);
            ai1 = e;
            ai1[8] = ai1[8] ^ rotl(e[4] + e[0], 9);
            ai1 = e;
            ai1[12] = ai1[12] ^ rotl(e[8] + e[4], 13);
            ai1 = e;
            ai1[0] = ai1[0] ^ rotl(e[12] + e[8], 18);
            ai1 = e;
            ai1[9] = ai1[9] ^ rotl(e[5] + e[1], 7);
            ai1 = e;
            ai1[13] = ai1[13] ^ rotl(e[9] + e[5], 9);
            ai1 = e;
            ai1[1] = ai1[1] ^ rotl(e[13] + e[9], 13);
            ai1 = e;
            ai1[5] = ai1[5] ^ rotl(e[1] + e[13], 18);
            ai1 = e;
            ai1[14] = ai1[14] ^ rotl(e[10] + e[6], 7);
            ai1 = e;
            ai1[2] = ai1[2] ^ rotl(e[14] + e[10], 9);
            ai1 = e;
            ai1[6] = ai1[6] ^ rotl(e[2] + e[14], 13);
            ai1 = e;
            ai1[10] = ai1[10] ^ rotl(e[6] + e[2], 18);
            ai1 = e;
            ai1[3] = ai1[3] ^ rotl(e[15] + e[11], 7);
            ai1 = e;
            ai1[7] = ai1[7] ^ rotl(e[3] + e[15], 9);
            ai1 = e;
            ai1[11] = ai1[11] ^ rotl(e[7] + e[3], 13);
            ai1 = e;
            ai1[15] = ai1[15] ^ rotl(e[11] + e[7], 18);
            ai1 = e;
            ai1[1] = ai1[1] ^ rotl(e[0] + e[3], 7);
            ai1 = e;
            ai1[2] = ai1[2] ^ rotl(e[1] + e[0], 9);
            ai1 = e;
            ai1[3] = ai1[3] ^ rotl(e[2] + e[1], 13);
            ai1 = e;
            ai1[0] = ai1[0] ^ rotl(e[3] + e[2], 18);
            ai1 = e;
            ai1[6] = ai1[6] ^ rotl(e[5] + e[4], 7);
            ai1 = e;
            ai1[7] = ai1[7] ^ rotl(e[6] + e[5], 9);
            ai1 = e;
            ai1[4] = ai1[4] ^ rotl(e[7] + e[6], 13);
            ai1 = e;
            ai1[5] = ai1[5] ^ rotl(e[4] + e[7], 18);
            ai1 = e;
            ai1[11] = ai1[11] ^ rotl(e[10] + e[9], 7);
            ai1 = e;
            ai1[8] = ai1[8] ^ rotl(e[11] + e[10], 9);
            ai1 = e;
            ai1[9] = ai1[9] ^ rotl(e[8] + e[11], 13);
            ai1 = e;
            ai1[10] = ai1[10] ^ rotl(e[9] + e[8], 18);
            ai1 = e;
            ai1[12] = ai1[12] ^ rotl(e[15] + e[14], 7);
            ai1 = e;
            ai1[13] = ai1[13] ^ rotl(e[12] + e[15], 9);
            ai1 = e;
            ai1[14] = ai1[14] ^ rotl(e[13] + e[12], 13);
            ai1 = e;
            ai1[15] = ai1[15] ^ rotl(e[14] + e[13], 18);
        }

        int j1 = 0;
        for (; l1 < 16; l1++)
        {
            intToByteLittle(e[l1] + ai[l1], abyte0, j1);
            j1 += 4;
        }

        byte byte0 = 16;
        l1 = j1;
        for (int k1 = byte0; k1 < e.length; k1++)
        {
            intToByteLittle(e[k1], abyte0, l1);
            l1 += 4;
        }

    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        g = abyte0;
        h = abyte1;
        c = 0;
        resetCounter();
        d[1] = byteToIntLittle(g, 0);
        d[2] = byteToIntLittle(g, 4);
        d[3] = byteToIntLittle(g, 8);
        d[4] = byteToIntLittle(g, 12);
        byte byte0;
        if (g.length == 32)
        {
            abyte0 = a;
            byte0 = 16;
        } else
        {
            abyte0 = b;
            byte0 = 0;
        }
        d[11] = byteToIntLittle(g, byte0);
        d[12] = byteToIntLittle(g, byte0 + 4);
        d[13] = byteToIntLittle(g, byte0 + 8);
        d[14] = byteToIntLittle(g, byte0 + 12);
        d[0] = byteToIntLittle(abyte0, 0);
        d[5] = byteToIntLittle(abyte0, 4);
        d[10] = byteToIntLittle(abyte0, 8);
        d[15] = byteToIntLittle(abyte0, 12);
        d[6] = byteToIntLittle(h, 0);
        d[7] = byteToIntLittle(h, 4);
        abyte0 = d;
        d[9] = 0;
        abyte0[8] = 0;
        i = true;
    }

    public String getAlgorithmName()
    {
        return "Salsa20";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        byte abyte0[] = cipherparameters.getIV();
        if (abyte0 == null || abyte0.length != 8)
        {
            throw new IllegalArgumentException("Salsa20 requires exactly 8 bytes of IV");
        }
        if (!(cipherparameters.getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include a key");
        } else
        {
            g = ((KeyParameter)cipherparameters.getParameters()).getKey();
            h = abyte0;
            setKey(g, h);
            return;
        }
    }

    public void processBytes(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        if (!i)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i1 + j1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k1 + j1 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (limitExceeded(j1))
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int l1 = 0; l1 < j1; l1++)
        {
            if (c == 0)
            {
                salsa20WordToByte(d, f);
                int ai[] = d;
                ai[8] = ai[8] + 1;
                if (d[8] == 0)
                {
                    int ai1[] = d;
                    ai1[9] = ai1[9] + 1;
                }
            }
            abyte1[l1 + k1] = (byte)(f[c] ^ abyte0[l1 + i1]);
            c = c + 1 & 0x3f;
        }

    }

    public void reset()
    {
        setKey(g, h);
    }

    public byte returnByte(byte byte0)
    {
        if (limitExceeded())
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        if (c == 0)
        {
            salsa20WordToByte(d, f);
            int ai[] = d;
            ai[8] = ai[8] + 1;
            if (d[8] == 0)
            {
                int ai1[] = d;
                ai1[9] = ai1[9] + 1;
            }
        }
        byte byte1 = (byte)(f[c] ^ byte0);
        c = c + 1 & 0x3f;
        return byte1;
    }

}
