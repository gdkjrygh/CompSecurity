// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

public class PGPCFBBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private byte d[];
    private BlockCipher e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public PGPCFBBlockCipher(BlockCipher blockcipher, boolean flag)
    {
        e = blockcipher;
        i = flag;
        g = blockcipher.b();
        a = new byte[g];
        b = new byte[g];
        c = new byte[g];
        d = new byte[g];
    }

    private byte a(byte byte0, int j)
    {
        return (byte)(c[j] ^ byte0);
    }

    public final int a(byte abyte0[], int j, byte abyte1[], int k)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (i)
        {
            if (h)
            {
                if (g + j > abyte0.length)
                {
                    throw new DataLengthException("input buffer too short");
                }
                if (g + k > abyte1.length)
                {
                    throw new DataLengthException("output buffer too short");
                }
                if (f == 0)
                {
                    e.a(b, 0, c, 0);
                    for (int l = 0; l < g; l++)
                    {
                        abyte1[k + l] = a(a[l], l);
                    }

                    System.arraycopy(abyte1, k, b, 0, g);
                    e.a(b, 0, c, 0);
                    abyte1[g + k] = a(a[g - 2], 0);
                    abyte1[g + k + 1] = a(a[g - 1], 1);
                    System.arraycopy(abyte1, k + 2, b, 0, g);
                    e.a(b, 0, c, 0);
                    for (int i1 = 0; i1 < g; i1++)
                    {
                        abyte1[g + k + 2 + i1] = a(abyte0[j + i1], i1);
                    }

                    System.arraycopy(abyte1, g + k + 2, b, 0, g);
                    f = f + (g * 2 + 2);
                    return g * 2 + 2;
                }
                if (f >= g + 2)
                {
                    e.a(b, 0, c, 0);
                    for (int j1 = 0; j1 < g; j1++)
                    {
                        abyte1[k + j1] = a(abyte0[j + j1], j1);
                    }

                    System.arraycopy(abyte1, k, b, 0, g);
                }
                return g;
            }
            if (g + j > abyte0.length)
            {
                throw new DataLengthException("input buffer too short");
            }
            if (g + k > abyte1.length)
            {
                throw new DataLengthException("output buffer too short");
            }
            if (f == 0)
            {
                for (k = 0; k < g; k++)
                {
                    b[k] = abyte0[j + k];
                }

                e.a(b, 0, c, 0);
                f = f + g;
                return 0;
            }
            if (f == g)
            {
                System.arraycopy(abyte0, j, d, 0, g);
                System.arraycopy(b, 2, b, 0, g - 2);
                b[g - 2] = d[0];
                b[g - 1] = d[1];
                e.a(b, 0, c, 0);
                for (j = 0; j < g - 2; j++)
                {
                    abyte1[k + j] = a(d[j + 2], j);
                }

                System.arraycopy(d, 2, b, 0, g - 2);
                f = f + 2;
                return g - 2;
            }
            if (f >= g + 2)
            {
                System.arraycopy(abyte0, j, d, 0, g);
                abyte1[k + 0] = a(d[0], g - 2);
                abyte1[k + 1] = a(d[1], g - 1);
                System.arraycopy(d, 0, b, g - 2, 2);
                e.a(b, 0, c, 0);
                for (j = 0; j < g - 2; j++)
                {
                    abyte1[k + j + 2] = a(d[j + 2], j);
                }

                System.arraycopy(d, 2, b, 0, g - 2);
            }
            return g;
        }
        if (h)
        {
            if (g + j > abyte0.length)
            {
                throw new DataLengthException("input buffer too short");
            }
            if (g + k > abyte1.length)
            {
                throw new DataLengthException("output buffer too short");
            }
            e.a(b, 0, c, 0);
            int k1 = 0;
            int i2;
            do
            {
                i2 = ((flag) ? 1 : 0);
                if (k1 >= g)
                {
                    break;
                }
                abyte1[k + k1] = a(abyte0[j + k1], k1);
                k1++;
            } while (true);
            for (; i2 < g; i2++)
            {
                b[i2] = abyte1[k + i2];
            }

            return g;
        }
        if (g + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.a(b, 0, c, 0);
        int l1 = 0;
        int j2;
        do
        {
            j2 = ((flag1) ? 1 : 0);
            if (l1 >= g)
            {
                break;
            }
            abyte1[k + l1] = a(abyte0[j + l1], l1);
            l1++;
        } while (true);
        for (; j2 < g; j2++)
        {
            b[j2] = abyte0[j + j2];
        }

        return g;
    }

    public final String a()
    {
        if (i)
        {
            return (new StringBuilder()).append(e.a()).append("/PGPCFBwithIV").toString();
        } else
        {
            return (new StringBuilder()).append(e.a()).append("/PGPCFB").toString();
        }
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        h = flag;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.a();
            if (abyte0.length < a.length)
            {
                System.arraycopy(abyte0, 0, a, a.length - abyte0.length, abyte0.length);
                for (int j = 0; j < a.length - abyte0.length; j++)
                {
                    a[j] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, a, 0, a.length);
            }
            c();
            e.a(true, cipherparameters.b());
            return;
        } else
        {
            c();
            e.a(true, cipherparameters);
            return;
        }
    }

    public final int b()
    {
        return e.b();
    }

    public final void c()
    {
        f = 0;
        int j = 0;
        while (j != b.length) 
        {
            if (i)
            {
                b[j] = 0;
            } else
            {
                b[j] = a[j];
            }
            j++;
        }
        e.c();
    }
}
