// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.NTRUEncryptionParameters;

public class IndexGenerator
{
    public static class BitString
    {

        byte a[];
        int b;
        int c;

        final void a(byte abyte0[])
        {
            int l = 0;
            while (l != abyte0.length) 
            {
                byte byte0 = abyte0[l];
                if (b == a.length)
                {
                    a = IndexGenerator.a(a, a.length * 2);
                }
                if (b == 0)
                {
                    b = 1;
                    a[0] = byte0;
                    c = 8;
                } else
                if (c == 8)
                {
                    byte abyte1[] = a;
                    int i1 = b;
                    b = i1 + 1;
                    abyte1[i1] = byte0;
                } else
                {
                    int j1 = c;
                    byte abyte2[] = a;
                    int k1 = b - 1;
                    abyte2[k1] = (byte)(abyte2[k1] | (byte0 & 0xff) << c);
                    abyte2 = a;
                    k1 = b;
                    b = k1 + 1;
                    abyte2[k1] = (byte)((byte0 & 0xff) >> 8 - j1);
                }
                l++;
            }
        }

        public BitString()
        {
            a = new byte[4];
        }
    }


    private byte a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private BitString g;
    private int h;
    private boolean i;
    private Digest j;
    private int k;

    IndexGenerator(byte abyte0[], NTRUEncryptionParameters ntruencryptionparameters)
    {
        a = abyte0;
        b = ntruencryptionparameters.a;
        c = ntruencryptionparameters.s;
        d = ntruencryptionparameters.t;
        e = 0;
        f = 0;
        h = 0;
        j = ntruencryptionparameters.A;
        k = j.b();
        i = false;
    }

    private void a(BitString bitstring, byte abyte0[])
    {
        j.a(a, 0, a.length);
        Digest digest = j;
        int l = h;
        digest.a((byte)(l >> 24));
        digest.a((byte)(l >> 16));
        digest.a((byte)(l >> 8));
        digest.a((byte)l);
        j.a(abyte0, 0);
        bitstring.a(abyte0);
    }

    static byte[] a(byte abyte0[], int l)
    {
        byte abyte1[] = new byte[l];
        if (l >= abyte0.length)
        {
            l = abyte0.length;
        }
        System.arraycopy(abyte0, 0, abyte1, 0, l);
        return abyte1;
    }

    final int a()
    {
        if (!i)
        {
            g = new BitString();
            byte abyte0[] = new byte[j.b()];
            for (; h < d; h = h + 1)
            {
                a(g, abyte0);
            }

            e = d * 8 * k;
            f = e;
            i = true;
        }
        int i2;
        do
        {
            e = e + c;
            BitString bitstring1 = g;
            int k1 = f;
            BitString bitstring = new BitString();
            bitstring.b = (k1 + 7) / 8;
            bitstring.a = new byte[bitstring.b];
            for (int l = 0; l < bitstring.b; l++)
            {
                bitstring.a[l] = bitstring1.a[l];
            }

            bitstring.c = k1 % 8;
            if (bitstring.c == 0)
            {
                bitstring.c = 8;
            } else
            {
                i1 = 32 - bitstring.c;
                bitstring.a[bitstring.b - 1] = (byte)((bitstring.a[bitstring.b - 1] << i1) >>> i1);
            }
            int j1;
            if (f < c)
            {
                int i1 = c - f;
                k1 = h;
                int l1 = ((k + i1) - 1) / k;
                byte abyte1[] = new byte[j.b()];
                do
                {
                    if (h >= k1 + l1)
                    {
                        break;
                    }
                    a(bitstring, abyte1);
                    h = h + 1;
                    if (i1 > k * 8)
                    {
                        i1 -= k * 8;
                    }
                } while (true);
                f = k * 8 - i1;
                g = new BitString();
                g.a(abyte1);
            } else
            {
                f = f - c;
            }
            j1 = c;
            j1 = ((bitstring.b - 1) * 8 + bitstring.c) - j1;
            k1 = j1 / 8;
            j1 %= 8;
            i2 = (bitstring.a[k1] & 0xff) >>> j1;
            j1 = 8 - j1;
            for (k1++; k1 < bitstring.b; k1++)
            {
                i2 |= (bitstring.a[k1] & 0xff) << j1;
                j1 += 8;
            }

        } while (i2 >= (1 << c) - (1 << c) % b);
        return i2 % b;
    }
}
