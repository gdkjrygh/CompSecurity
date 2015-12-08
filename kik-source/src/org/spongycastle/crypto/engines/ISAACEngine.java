// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;

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

    private void a(byte abyte0[])
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
            abyte0 = d;
            int i2 = i1 + 1;
            byte byte0 = abyte1[i1];
            int i3 = i2 + 1;
            abyte0[i1 >> 2] = (abyte1[i2] & 0xff) << 8 | byte0 & 0xff | (abyte1[i3] & 0xff) << 16 | abyte1[i3 + 1] << 24;
        }

        abyte0 = new int[8];
        for (int j1 = 0; j1 < 8; j1++)
        {
            abyte0[j1] = 0x9e3779b9;
        }

        for (int k1 = 0; k1 < 4; k1++)
        {
            a(((int []) (abyte0)));
        }

        for (int l1 = 0; l1 < 2; l1++)
        {
            for (int j2 = 0; j2 < 256; j2 += 8)
            {
                int k2 = 0;
                while (k2 < 8) 
                {
                    byte byte1 = abyte0[k2];
                    int j3;
                    if (l1 <= 0)
                    {
                        j3 = d[j2 + k2];
                    } else
                    {
                        j3 = c[j2 + k2];
                    }
                    abyte0[k2] = j3 + byte1;
                    k2++;
                }
                a(((int []) (abyte0)));
                for (int l2 = 0; l2 < 8; l2++)
                {
                    c[j2 + l2] = abyte0[l2];
                }

            }

        }

        c();
        k = true;
    }

    private static void a(int ai[])
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

    private static byte[] b(int ai[])
    {
        byte abyte0[] = new byte[ai.length * 4];
        int l = 0;
        for (int i1 = 0; i1 < ai.length;)
        {
            int j1 = ai[i1];
            byte byte0 = (byte)j1;
            byte byte1 = (byte)(j1 >>> 8);
            byte byte2 = (byte)(j1 >>> 16);
            System.arraycopy(new byte[] {
                (byte)(j1 >>> 24), byte2, byte1, byte0
            }, 0, abyte0, l, 4);
            i1++;
            l += 4;
        }

        return abyte0;
    }

    private void c()
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

    public final byte a(byte byte0)
    {
        if (h == 0)
        {
            c();
            i = b(d);
        }
        byte byte1 = (byte)(i[h] ^ byte0);
        h = h + 1 & 0x3ff;
        return byte1;
    }

    public final String a()
    {
        return "ISAAC";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to ISAAC init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            a(((KeyParameter)cipherparameters).a());
            return;
        }
    }

    public final void a(byte abyte0[], int l, int i1, byte abyte1[], int j1)
    {
        if (!k)
        {
            throw new IllegalStateException("ISAAC not initialised");
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
                c();
                i = b(d);
            }
            abyte1[k1 + j1] = (byte)(i[h] ^ abyte0[k1 + l]);
            h = h + 1 & 0x3ff;
        }

    }

    public final void b()
    {
        a(j);
    }
}
