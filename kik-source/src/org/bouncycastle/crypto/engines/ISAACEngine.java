// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class ISAACEngine
    implements StreamCipher
{

    private final int a = 8;
    private final int b = 256;
    private int c[];
    private int d[];
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i[];
    private byte j[];
    private boolean k;

    public ISAACEngine()
    {
        c = null;
        d = null;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = new byte[1024];
        j = null;
        k = false;
    }

    private int byteToIntLittle(byte abyte0[], int l)
    {
        int i1 = l + 1;
        l = abyte0[l];
        int j1 = i1 + 1;
        return (abyte0[i1] & 0xff) << 8 | l & 0xff | (abyte0[j1] & 0xff) << 16 | abyte0[j1 + 1] << 24;
    }

    private byte[] intToByteLittle(int l)
    {
        byte byte0 = (byte)l;
        byte byte1 = (byte)(l >>> 8);
        byte byte2 = (byte)(l >>> 16);
        return (new byte[] {
            (byte)(l >>> 24), byte2, byte1, byte0
        });
    }

    private byte[] intToByteLittle(int ai[])
    {
        byte abyte0[] = new byte[ai.length * 4];
        int l = 0;
        for (int i1 = 0; i1 < ai.length;)
        {
            System.arraycopy(intToByteLittle(ai[i1]), 0, abyte0, l, 4);
            i1++;
            l += 4;
        }

        return abyte0;
    }

    private void isaac()
    {
        int l;
        l = f;
        int i1 = g + 1;
        g = i1;
        f = l + i1;
        l = 0;
_L7:
        int j1;
        if (l >= 256)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        j1 = c[l];
        l & 3;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 167
    //                   1 186
    //                   2 205
    //                   3 223;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_223;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        e = e + c[l + 128 & 0xff];
        int ai[] = c;
        int k1 = c[j1 >>> 2 & 0xff] + e + f;
        ai[l] = k1;
        ai = d;
        j1 += c[k1 >>> 10 & 0xff];
        f = j1;
        ai[l] = j1;
        l++;
        if (true) goto _L7; else goto _L6
_L6:
        e = e ^ e << 13;
          goto _L8
_L3:
        e = e ^ e >>> 6;
          goto _L8
_L4:
        e = e ^ e << 2;
          goto _L8
        e = e ^ e >>> 16;
          goto _L8
    }

    private void mix(int ai[])
    {
        ai[0] = ai[0] ^ ai[1] << 11;
        ai[3] = ai[3] + ai[0];
        ai[1] = ai[1] + ai[2];
        ai[1] = ai[1] ^ ai[2] >>> 2;
        ai[4] = ai[4] + ai[1];
        ai[2] = ai[2] + ai[3];
        ai[2] = ai[2] ^ ai[3] << 8;
        ai[5] = ai[5] + ai[2];
        ai[3] = ai[3] + ai[4];
        ai[3] = ai[3] ^ ai[4] >>> 16;
        ai[6] = ai[6] + ai[3];
        ai[4] = ai[4] + ai[5];
        ai[4] = ai[4] ^ ai[5] << 10;
        ai[7] = ai[7] + ai[4];
        ai[5] = ai[5] + ai[6];
        ai[5] = ai[5] ^ ai[6] >>> 4;
        ai[0] = ai[0] + ai[5];
        ai[6] = ai[6] + ai[7];
        ai[6] = ai[6] ^ ai[7] << 8;
        ai[1] = ai[1] + ai[6];
        ai[7] = ai[7] + ai[0];
        ai[7] = ai[7] ^ ai[0] >>> 9;
        ai[2] = ai[2] + ai[7];
        ai[0] = ai[0] + ai[1];
    }

    private void setKey(byte abyte0[])
    {
        j = abyte0;
        if (c == null)
        {
            c = new int[256];
        }
        if (d == null)
        {
            d = new int[256];
        }
        for (int l = 0; l < 256; l++)
        {
            int ai[] = c;
            d[l] = 0;
            ai[l] = 0;
        }

        g = 0;
        f = 0;
        e = 0;
        h = 0;
        byte abyte1[] = new byte[abyte0.length + (abyte0.length & 3)];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        for (int i1 = 0; i1 < abyte1.length; i1 += 4)
        {
            d[i1 >> 2] = byteToIntLittle(abyte1, i1);
        }

        abyte0 = new int[8];
        for (int j1 = 0; j1 < 8; j1++)
        {
            abyte0[j1] = 0x9e3779b9;
        }

        for (int k1 = 0; k1 < 4; k1++)
        {
            mix(abyte0);
        }

        for (int l1 = 0; l1 < 2; l1++)
        {
            for (int i2 = 0; i2 < 256; i2 += 8)
            {
                int j2 = 0;
                while (j2 < 8) 
                {
                    byte byte0 = abyte0[j2];
                    int l2;
                    if (l1 <= 0)
                    {
                        l2 = d[i2 + j2];
                    } else
                    {
                        l2 = c[i2 + j2];
                    }
                    abyte0[j2] = l2 + byte0;
                    j2++;
                }
                mix(abyte0);
                for (int k2 = 0; k2 < 8; k2++)
                {
                    c[i2 + k2] = abyte0[k2];
                }

            }

        }

        isaac();
        k = true;
    }

    public String getAlgorithmName()
    {
        return "ISAAC";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to ISAAC init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public void processBytes(byte abyte0[], int l, int i1, byte abyte1[], int j1)
    {
        if (!k)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (l + i1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j1 + i1 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int k1 = 0; k1 < i1; k1++)
        {
            if (h == 0)
            {
                isaac();
                i = intToByteLittle(d);
            }
            abyte1[k1 + j1] = (byte)(i[h] ^ abyte0[k1 + l]);
            h = h + 1 & 0x3ff;
        }

    }

    public void reset()
    {
        setKey(j);
    }

    public byte returnByte(byte byte0)
    {
        if (h == 0)
        {
            isaac();
            i = intToByteLittle(d);
        }
        byte byte1 = (byte)(i[h] ^ byte0);
        h = h + 1 & 0x3ff;
        return byte1;
    }
}
