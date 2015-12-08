// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;

public class MD2Digest
    implements ExtendedDigest
{

    private static final byte g[] = {
        41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 
        84, -95, -20, -16, 6, 19, 98, -89, 5, -13, 
        -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, 
        -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 
        103, 66, 111, 24, -118, 23, -27, 18, -66, 78, 
        -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, 
        -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 
        7, 63, -108, -62, 16, -119, 11, 34, 95, 33, 
        -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, 
        -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 
        72, -91, -75, -47, -41, 94, -110, 42, -84, 86, 
        -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 
        118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 
        112, 89, 100, 113, -121, 32, -122, 91, -49, 101, 
        -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, 
        -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 
        85, 71, -93, 35, -35, 81, -81, 58, -61, 92, 
        -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, 
        -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 
        77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 
        36, -31, 123, 8, 12, -67, -79, 74, 120, -120, 
        -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 
        59, 0, 29, 57, -14, -17, -73, 14, 102, 88, 
        -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 
        49, 68, 80, -76, -113, -19, 31, 26, -37, -103, 
        -115, 51, -97, 17, -125, 20
    };
    private byte a[];
    private int b;
    private byte c[];
    private int d;
    private byte e[];
    private int f;

    public MD2Digest()
    {
        a = new byte[48];
        c = new byte[16];
        e = new byte[16];
        c();
    }

    public MD2Digest(MD2Digest md2digest)
    {
        a = new byte[48];
        c = new byte[16];
        e = new byte[16];
        System.arraycopy(md2digest.a, 0, a, 0, md2digest.a.length);
        b = md2digest.b;
        System.arraycopy(md2digest.c, 0, c, 0, md2digest.c.length);
        d = md2digest.d;
        System.arraycopy(md2digest.e, 0, e, 0, md2digest.e.length);
        f = md2digest.f;
    }

    private void a(byte abyte0[])
    {
        byte byte0 = e[15];
        for (int i = 0; i < 16; i++)
        {
            byte abyte1[] = e;
            byte byte1 = abyte1[i];
            abyte1[i] = (byte)(g[(byte0 ^ abyte0[i]) & 0xff] ^ byte1);
            byte0 = e[i];
        }

    }

    private void b(byte abyte0[])
    {
        for (int i = 0; i < 16; i++)
        {
            a[i + 16] = abyte0[i];
            a[i + 32] = (byte)(abyte0[i] ^ a[i]);
        }

        int j = 0;
        for (int k = 0; k < 18; k++)
        {
            boolean flag = false;
            int l = j;
            for (j = ((flag) ? 1 : 0); j < 48; j++)
            {
                abyte0 = a;
                byte byte1 = abyte0[j];
                byte byte0 = (byte)(g[l] ^ byte1);
                abyte0[j] = byte0;
                l = byte0 & 0xff;
            }

            j = (l + k) % 256;
        }

    }

    public final int a(byte abyte0[], int i)
    {
        byte byte0 = (byte)(c.length - d);
        for (int j = d; j < c.length; j++)
        {
            c[j] = byte0;
        }

        a(c);
        b(c);
        b(e);
        System.arraycopy(a, b, abyte0, i, 16);
        c();
        return 16;
    }

    public final String a()
    {
        return "MD2";
    }

    public final void a(byte byte0)
    {
        byte abyte0[] = c;
        int i = d;
        d = i + 1;
        abyte0[i] = byte0;
        if (d == 16)
        {
            a(c);
            b(c);
            d = 0;
        }
    }

    public final void a(byte abyte0[], int i, int j)
    {
_L2:
        do
        {
            int k = i;
            int i1 = j;
            if (i > 16)
            {
                System.arraycopy(abyte0, j, c, 0, 16);
                a(c);
                b(c);
                i -= 16;
                j += 16;
            } else
            {
                for (; k > 0; k--)
                {
                    a(abyte0[i1]);
                    i1++;
                }

                return;
            }
        } while (true);
        for (; d != 0 && j > 0; j--)
        {
            a(abyte0[i]);
            i++;
        }

        int l = i;
        i = j;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
        b = 0;
        for (int i = 0; i != a.length; i++)
        {
            a[i] = 0;
        }

        d = 0;
        for (int j = 0; j != c.length; j++)
        {
            c[j] = 0;
        }

        f = 0;
        for (int k = 0; k != e.length; k++)
        {
            e[k] = 0;
        }

    }

    public final int d()
    {
        return 16;
    }

}
