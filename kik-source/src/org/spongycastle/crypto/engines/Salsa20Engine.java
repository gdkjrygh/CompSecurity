// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.util.Pack;
import org.spongycastle.util.Strings;

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

    private static int a(int i1, int j1)
    {
        return i1 << j1 | i1 >>> -j1;
    }

    private void a(byte abyte0[])
    {
        int ai[] = d;
        int ai1[] = e;
        System.arraycopy(ai, 0, ai1, 0, ai.length);
        for (int i1 = 20; i1 > 0; i1 -= 2)
        {
            ai1[4] = ai1[4] ^ a(ai1[0] + ai1[12], 7);
            ai1[8] = ai1[8] ^ a(ai1[4] + ai1[0], 9);
            ai1[12] = ai1[12] ^ a(ai1[8] + ai1[4], 13);
            ai1[0] = ai1[0] ^ a(ai1[12] + ai1[8], 18);
            ai1[9] = ai1[9] ^ a(ai1[5] + ai1[1], 7);
            ai1[13] = ai1[13] ^ a(ai1[9] + ai1[5], 9);
            ai1[1] = ai1[1] ^ a(ai1[13] + ai1[9], 13);
            ai1[5] = ai1[5] ^ a(ai1[1] + ai1[13], 18);
            ai1[14] = ai1[14] ^ a(ai1[10] + ai1[6], 7);
            ai1[2] = ai1[2] ^ a(ai1[14] + ai1[10], 9);
            ai1[6] = ai1[6] ^ a(ai1[2] + ai1[14], 13);
            ai1[10] = ai1[10] ^ a(ai1[6] + ai1[2], 18);
            ai1[3] = ai1[3] ^ a(ai1[15] + ai1[11], 7);
            ai1[7] = ai1[7] ^ a(ai1[3] + ai1[15], 9);
            ai1[11] = ai1[11] ^ a(ai1[7] + ai1[3], 13);
            ai1[15] = ai1[15] ^ a(ai1[11] + ai1[7], 18);
            ai1[1] = ai1[1] ^ a(ai1[0] + ai1[3], 7);
            ai1[2] = ai1[2] ^ a(ai1[1] + ai1[0], 9);
            ai1[3] = ai1[3] ^ a(ai1[2] + ai1[1], 13);
            ai1[0] = ai1[0] ^ a(ai1[3] + ai1[2], 18);
            ai1[6] = ai1[6] ^ a(ai1[5] + ai1[4], 7);
            ai1[7] = ai1[7] ^ a(ai1[6] + ai1[5], 9);
            ai1[4] = ai1[4] ^ a(ai1[7] + ai1[6], 13);
            ai1[5] = ai1[5] ^ a(ai1[4] + ai1[7], 18);
            ai1[11] = ai1[11] ^ a(ai1[10] + ai1[9], 7);
            ai1[8] = ai1[8] ^ a(ai1[11] + ai1[10], 9);
            ai1[9] = ai1[9] ^ a(ai1[8] + ai1[11], 13);
            ai1[10] = ai1[10] ^ a(ai1[9] + ai1[8], 18);
            ai1[12] = ai1[12] ^ a(ai1[15] + ai1[14], 7);
            ai1[13] = ai1[13] ^ a(ai1[12] + ai1[15], 9);
            ai1[14] = ai1[14] ^ a(ai1[13] + ai1[12], 13);
            ai1[15] = ai1[15] ^ a(ai1[14] + ai1[13], 18);
        }

        for (int j1 = 0; j1 < 16; j1++)
        {
            ai1[j1] = ai1[j1] + ai[j1];
        }

        Pack.b(e, abyte0, 0);
    }

    private void a(byte abyte0[], byte abyte1[])
    {
        g = abyte0;
        h = abyte1;
        c = 0;
        j = 0;
        k = 0;
        l = 0;
        d[1] = Pack.c(g, 0);
        d[2] = Pack.c(g, 4);
        d[3] = Pack.c(g, 8);
        d[4] = Pack.c(g, 12);
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
        d[11] = Pack.c(g, byte0);
        d[12] = Pack.c(g, byte0 + 4);
        d[13] = Pack.c(g, byte0 + 8);
        d[14] = Pack.c(g, byte0 + 12);
        d[0] = Pack.c(abyte0, 0);
        d[5] = Pack.c(abyte0, 4);
        d[10] = Pack.c(abyte0, 8);
        d[15] = Pack.c(abyte0, 12);
        d[6] = Pack.c(h, 0);
        d[7] = Pack.c(h, 4);
        abyte0 = d;
        d[9] = 0;
        abyte0[8] = 0;
        i = true;
    }

    public final byte a(byte byte0)
    {
        boolean flag1 = false;
        int j1 = j + 1;
        j = j1;
        boolean flag = flag1;
        if (j1 == 0)
        {
            int k1 = k + 1;
            k = k1;
            flag = flag1;
            if (k1 == 0)
            {
                int l1 = l + 1;
                l = l1;
                flag = flag1;
                if ((l1 & 0x20) != 0)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        if (c == 0)
        {
            a(f);
            int ai[] = d;
            int i1 = ai[8] + 1;
            ai[8] = i1;
            if (i1 == 0)
            {
                int ai1[] = d;
                ai1[9] = ai1[9] + 1;
            }
        }
        byte byte1 = (byte)(f[c] ^ byte0);
        c = c + 1 & 0x3f;
        return byte1;
    }

    public final String a()
    {
        return "Salsa20";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        byte abyte0[] = cipherparameters.a();
        if (abyte0 == null || abyte0.length != 8)
        {
            throw new IllegalArgumentException("Salsa20 requires exactly 8 bytes of IV");
        }
        if (!(cipherparameters.b() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include a key");
        } else
        {
            g = ((KeyParameter)cipherparameters.b()).a();
            h = abyte0;
            a(g, h);
            return;
        }
    }

    public final void a(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        int k2;
        k2 = 0;
        if (!i)
        {
            throw new IllegalStateException("Salsa20 not initialised");
        }
        if (i1 + j1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k1 + j1 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        j = j + j1;
        if (j >= j1 || j < 0) goto _L2; else goto _L1
_L1:
        int l1;
        l1 = k + 1;
        k = l1;
        if (l1 != 0) goto _L2; else goto _L3
_L3:
        boolean flag;
        int i2 = l + 1;
        l = i2;
        if ((i2 & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L5:
        if (flag)
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        for (; k2 < j1; k2++)
        {
            if (c == 0)
            {
                a(f);
                int ai[] = d;
                int j2 = ai[8] + 1;
                ai[8] = j2;
                if (j2 == 0)
                {
                    int ai1[] = d;
                    ai1[9] = ai1[9] + 1;
                }
            }
            abyte1[k2 + k1] = (byte)(f[c] ^ abyte0[k2 + i1]);
            c = c + 1 & 0x3f;
        }

        return;
    }

    public final void b()
    {
        a(g, h);
    }

}
