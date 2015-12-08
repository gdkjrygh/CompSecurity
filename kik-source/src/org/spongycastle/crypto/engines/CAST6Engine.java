// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;


// Referenced classes of package org.spongycastle.crypto.engines:
//            CAST5Engine

public final class CAST6Engine extends CAST5Engine
{

    protected int k[];
    protected int l[];
    protected int m[];
    protected int n[];
    private int o[];

    public CAST6Engine()
    {
        k = new int[48];
        l = new int[48];
        m = new int[192];
        n = new int[192];
        o = new int[8];
    }

    public final String a()
    {
        return "CAST6";
    }

    protected final void a(byte abyte0[])
    {
        int j1 = 0x5a827999;
        int i = 19;
        int i2;
        for (int l1 = 0; l1 < 24; l1 = i2)
        {
            i2 = i;
            boolean flag = false;
            i = j1;
            j1 = i2;
            for (i2 = ((flag) ? 1 : 0); i2 < 8; i2++)
            {
                n[l1 * 8 + i2] = i;
                i += 0x6ed9eba1;
                m[l1 * 8 + i2] = j1;
                j1 = j1 + 17 & 0x1f;
            }

            i2 = l1 + 1;
            l1 = i;
            i = j1;
            j1 = l1;
        }

        byte abyte1[] = new byte[64];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        for (int j = 0; j < 8; j++)
        {
            o[j] = a(abyte1, j * 4);
        }

        for (int i1 = 0; i1 < 12; i1++)
        {
            int k1 = i1 * 2 * 8;
            abyte0 = o;
            abyte0[6] = abyte0[6] ^ a(o[7], n[k1], m[k1]);
            abyte0 = o;
            abyte0[5] = abyte0[5] ^ b(o[6], n[k1 + 1], m[k1 + 1]);
            abyte0 = o;
            abyte0[4] = abyte0[4] ^ c(o[5], n[k1 + 2], m[k1 + 2]);
            abyte0 = o;
            abyte0[3] = abyte0[3] ^ a(o[4], n[k1 + 3], m[k1 + 3]);
            abyte0 = o;
            abyte0[2] = abyte0[2] ^ b(o[3], n[k1 + 4], m[k1 + 4]);
            abyte0 = o;
            abyte0[1] = abyte0[1] ^ c(o[2], n[k1 + 5], m[k1 + 5]);
            abyte0 = o;
            abyte0[0] = abyte0[0] ^ a(o[1], n[k1 + 6], m[k1 + 6]);
            abyte0 = o;
            byte byte0 = abyte0[7];
            abyte0[7] = b(o[0], n[k1 + 7], m[k1 + 7]) ^ byte0;
            k1 = (i1 * 2 + 1) * 8;
            abyte0 = o;
            abyte0[6] = abyte0[6] ^ a(o[7], n[k1], m[k1]);
            abyte0 = o;
            abyte0[5] = abyte0[5] ^ b(o[6], n[k1 + 1], m[k1 + 1]);
            abyte0 = o;
            abyte0[4] = abyte0[4] ^ c(o[5], n[k1 + 2], m[k1 + 2]);
            abyte0 = o;
            abyte0[3] = abyte0[3] ^ a(o[4], n[k1 + 3], m[k1 + 3]);
            abyte0 = o;
            abyte0[2] = abyte0[2] ^ b(o[3], n[k1 + 4], m[k1 + 4]);
            abyte0 = o;
            abyte0[1] = abyte0[1] ^ c(o[2], n[k1 + 5], m[k1 + 5]);
            abyte0 = o;
            abyte0[0] = abyte0[0] ^ a(o[1], n[k1 + 6], m[k1 + 6]);
            abyte0 = o;
            byte0 = abyte0[7];
            abyte0[7] = b(o[0], n[k1 + 7], m[k1 + 7]) ^ byte0;
            k[i1 * 4] = o[0] & 0x1f;
            k[i1 * 4 + 1] = o[2] & 0x1f;
            k[i1 * 4 + 2] = o[4] & 0x1f;
            k[i1 * 4 + 3] = o[6] & 0x1f;
            l[i1 * 4] = o[7];
            l[i1 * 4 + 1] = o[5];
            l[i1 * 4 + 2] = o[3];
            l[i1 * 4 + 3] = o[1];
        }

    }

    public final int b()
    {
        return 16;
    }

    protected final int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        int k1 = a(abyte0, i);
        int j1 = a(abyte0, i + 4);
        int i1 = a(abyte0, i + 8);
        i = a(abyte0, i + 12);
        for (int l1 = 0; l1 < 6; l1++)
        {
            int j2 = l1 * 4;
            i1 ^= a(i, l[j2], k[j2]);
            j1 ^= b(i1, l[j2 + 1], k[j2 + 1]);
            k1 ^= c(j1, l[j2 + 2], k[j2 + 2]);
            i ^= a(k1, l[j2 + 3], k[j2 + 3]);
        }

        byte byte0 = 6;
        int i2 = i;
        for (i = byte0; i < 12; i++)
        {
            int k2 = i * 4;
            i2 ^= a(k1, l[k2 + 3], k[k2 + 3]);
            k1 ^= c(j1, l[k2 + 2], k[k2 + 2]);
            j1 ^= b(i1, l[k2 + 1], k[k2 + 1]);
            i1 ^= a(i2, l[k2], k[k2]);
        }

        ai[0] = k1;
        ai[1] = j1;
        ai[2] = i1;
        ai[3] = i2;
        a(ai[0], abyte1, j);
        a(ai[1], abyte1, j + 4);
        a(ai[2], abyte1, j + 8);
        a(ai[3], abyte1, j + 12);
        return 16;
    }

    protected final int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        int k1 = a(abyte0, i);
        int j1 = a(abyte0, i + 4);
        int i1 = a(abyte0, i + 8);
        i = a(abyte0, i + 12);
        for (int l1 = 0; l1 < 6; l1++)
        {
            int j2 = (11 - l1) * 4;
            i1 ^= a(i, l[j2], k[j2]);
            j1 ^= b(i1, l[j2 + 1], k[j2 + 1]);
            k1 ^= c(j1, l[j2 + 2], k[j2 + 2]);
            i ^= a(k1, l[j2 + 3], k[j2 + 3]);
        }

        byte byte0 = 6;
        int i2 = i;
        for (i = byte0; i < 12; i++)
        {
            int k2 = (11 - i) * 4;
            i2 ^= a(k1, l[k2 + 3], k[k2 + 3]);
            k1 ^= c(j1, l[k2 + 2], k[k2 + 2]);
            j1 ^= b(i1, l[k2 + 1], k[k2 + 1]);
            i1 ^= a(i2, l[k2], k[k2]);
        }

        ai[0] = k1;
        ai[1] = j1;
        ai[2] = i1;
        ai[3] = i2;
        a(ai[0], abyte1, j);
        a(ai[1], abyte1, j + 4);
        a(ai[2], abyte1, j + 8);
        a(ai[3], abyte1, j + 12);
        return 16;
    }

    public final void c()
    {
    }
}
