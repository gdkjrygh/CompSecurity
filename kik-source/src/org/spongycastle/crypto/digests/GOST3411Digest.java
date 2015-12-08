// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.engines.GOST28147Engine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.util.Pack;

public class GOST3411Digest
    implements ExtendedDigest
{

    private static final byte s[] = {
        0, -1, 0, -1, 0, -1, 0, -1, -1, 0, 
        -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, 
        -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 
        0, -1
    };
    byte a[];
    short b[];
    short c[];
    byte d[];
    byte e[];
    byte f[];
    byte g[];
    private byte h[];
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l[][];
    private byte m[];
    private int n;
    private long o;
    private BlockCipher p;
    private byte q[];
    private byte r[];

    public GOST3411Digest()
    {
        h = new byte[32];
        i = new byte[32];
        j = new byte[32];
        k = new byte[32];
        l = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 32
        });
        m = new byte[32];
        p = new GOST28147Engine();
        r = new byte[32];
        a = new byte[8];
        b = new short[16];
        c = new short[16];
        d = new byte[32];
        e = new byte[32];
        f = new byte[32];
        g = new byte[32];
        q = GOST28147Engine.a("D-A");
        p.a(true, new ParametersWithSBox(null, q));
        c();
    }

    public GOST3411Digest(GOST3411Digest gost3411digest)
    {
        h = new byte[32];
        i = new byte[32];
        j = new byte[32];
        k = new byte[32];
        l = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 32
        });
        m = new byte[32];
        p = new GOST28147Engine();
        r = new byte[32];
        a = new byte[8];
        b = new short[16];
        c = new short[16];
        d = new byte[32];
        e = new byte[32];
        f = new byte[32];
        g = new byte[32];
        q = gost3411digest.q;
        p.a(true, new ParametersWithSBox(null, q));
        c();
        System.arraycopy(gost3411digest.h, 0, h, 0, gost3411digest.h.length);
        System.arraycopy(gost3411digest.i, 0, i, 0, gost3411digest.i.length);
        System.arraycopy(gost3411digest.j, 0, j, 0, gost3411digest.j.length);
        System.arraycopy(gost3411digest.k, 0, k, 0, gost3411digest.k.length);
        System.arraycopy(gost3411digest.l[1], 0, l[1], 0, gost3411digest.l[1].length);
        System.arraycopy(gost3411digest.l[2], 0, l[2], 0, gost3411digest.l[2].length);
        System.arraycopy(gost3411digest.l[3], 0, l[3], 0, gost3411digest.l[3].length);
        System.arraycopy(gost3411digest.m, 0, m, 0, gost3411digest.m.length);
        n = gost3411digest.n;
        o = gost3411digest.o;
    }

    private void a(byte abyte0[], byte abyte1[], int i1, byte abyte2[], int j1)
    {
        p.a(true, new KeyParameter(abyte0));
        p.a(abyte2, j1, abyte1, i1);
    }

    private byte[] a(byte abyte0[])
    {
        for (int i1 = 0; i1 < 8; i1++)
        {
            r[i1 * 4] = abyte0[i1];
            r[i1 * 4 + 1] = abyte0[i1 + 8];
            r[i1 * 4 + 2] = abyte0[i1 + 16];
            r[i1 * 4 + 3] = abyte0[i1 + 24];
        }

        return r;
    }

    private byte[] b(byte abyte0[])
    {
        for (int i1 = 0; i1 < 8; i1++)
        {
            a[i1] = (byte)(abyte0[i1] ^ abyte0[i1 + 8]);
        }

        System.arraycopy(abyte0, 8, abyte0, 0, 24);
        System.arraycopy(a, 0, abyte0, 24, 8);
        return abyte0;
    }

    private void c(byte abyte0[])
    {
        boolean flag = false;
        short aword0[] = b;
        for (int i1 = 0; i1 < abyte0.length / 2; i1++)
        {
            aword0[i1] = (short)(abyte0[i1 * 2 + 1] << 8 & 0xff00 | abyte0[i1 * 2] & 0xff);
        }

        c[15] = (short)(b[0] ^ b[1] ^ b[2] ^ b[3] ^ b[12] ^ b[15]);
        System.arraycopy(b, 1, c, 0, 15);
        aword0 = c;
        for (int j1 = ((flag) ? 1 : 0); j1 < abyte0.length / 2; j1++)
        {
            abyte0[j1 * 2 + 1] = (byte)(aword0[j1] >> 8);
            abyte0[j1 * 2] = (byte)aword0[j1];
        }

    }

    private void d(byte abyte0[])
    {
        System.arraycopy(abyte0, 0, j, 0, 32);
        System.arraycopy(h, 0, e, 0, 32);
        System.arraycopy(j, 0, f, 0, 32);
        for (int i1 = 0; i1 < 32; i1++)
        {
            g[i1] = (byte)(e[i1] ^ f[i1]);
        }

        a(a(g), d, 0, h, 0);
        for (int j1 = 1; j1 < 4; j1++)
        {
            abyte0 = b(e);
            for (int k2 = 0; k2 < 32; k2++)
            {
                e[k2] = (byte)(abyte0[k2] ^ l[j1][k2]);
            }

            f = b(b(f));
            for (int l2 = 0; l2 < 32; l2++)
            {
                g[l2] = (byte)(e[l2] ^ f[l2]);
            }

            a(a(g), d, j1 * 8, h, j1 * 8);
        }

        for (int k1 = 0; k1 < 12; k1++)
        {
            c(d);
        }

        for (int l1 = 0; l1 < 32; l1++)
        {
            d[l1] = (byte)(d[l1] ^ j[l1]);
        }

        c(d);
        for (int i2 = 0; i2 < 32; i2++)
        {
            d[i2] = (byte)(h[i2] ^ d[i2]);
        }

        for (int j2 = 0; j2 < 61; j2++)
        {
            c(d);
        }

        System.arraycopy(d, 0, h, 0, h.length);
    }

    private void e(byte abyte0[])
    {
        int i1 = 0;
        int j1 = 0;
        for (; i1 != k.length; i1++)
        {
            j1 += (k[i1] & 0xff) + (abyte0[i1] & 0xff);
            k[i1] = (byte)j1;
            j1 >>>= 8;
        }

    }

    public final int a(byte abyte0[], int i1)
    {
        Pack.a(o * 8L, i);
        while (n != 0) 
        {
            a((byte)0);
        }
        d(i);
        d(k);
        System.arraycopy(h, 0, abyte0, i1, h.length);
        c();
        return 32;
    }

    public final String a()
    {
        return "GOST3411";
    }

    public final void a(byte byte0)
    {
        byte abyte0[] = m;
        int i1 = n;
        n = i1 + 1;
        abyte0[i1] = byte0;
        if (n == m.length)
        {
            e(m);
            d(m);
            n = 0;
        }
        o = o + 1L;
    }

    public final void a(byte abyte0[], int i1, int j1)
    {
        int k1 = j1;
        int l1 = i1;
        do
        {
            i1 = l1;
            j1 = k1;
            if (n == 0)
            {
                break;
            }
            i1 = l1;
            j1 = k1;
            if (k1 <= 0)
            {
                break;
            }
            a(abyte0[l1]);
            l1++;
            k1--;
        } while (true);
        do
        {
            k1 = i1;
            l1 = j1;
            if (j1 <= m.length)
            {
                break;
            }
            System.arraycopy(abyte0, i1, m, 0, m.length);
            e(m);
            d(m);
            i1 += m.length;
            j1 -= m.length;
            o = o + (long)m.length;
        } while (true);
        for (; l1 > 0; l1--)
        {
            a(abyte0[k1]);
            k1++;
        }

    }

    public final int b()
    {
        return 32;
    }

    public final void c()
    {
        o = 0L;
        n = 0;
        for (int i1 = 0; i1 < h.length; i1++)
        {
            h[i1] = 0;
        }

        for (int j1 = 0; j1 < i.length; j1++)
        {
            i[j1] = 0;
        }

        for (int k1 = 0; k1 < j.length; k1++)
        {
            j[k1] = 0;
        }

        for (int l1 = 0; l1 < l[1].length; l1++)
        {
            l[1][l1] = 0;
        }

        for (int i2 = 0; i2 < l[3].length; i2++)
        {
            l[3][i2] = 0;
        }

        for (int j2 = 0; j2 < k.length; j2++)
        {
            k[j2] = 0;
        }

        for (int k2 = 0; k2 < m.length; k2++)
        {
            m[k2] = 0;
        }

        System.arraycopy(s, 0, l[2], 0, s.length);
    }

    public final int d()
    {
        return 32;
    }

}
