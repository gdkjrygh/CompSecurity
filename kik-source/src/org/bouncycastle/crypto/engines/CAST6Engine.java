// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;


// Referenced classes of package org.bouncycastle.crypto.engines:
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

    protected final void CAST_Decipher(int i, int j, int i1, int j1, int ai[])
    {
        boolean flag = false;
        int k1 = j1;
        int l1 = i1;
        j1 = i;
        i1 = j;
        j = l1;
        i = k1;
        for (k1 = ((flag) ? 1 : 0); k1 < 6; k1++)
        {
            l1 = (11 - k1) * 4;
            j ^= F1(i, l[l1], k[l1]);
            i1 ^= F2(j, l[l1 + 1], k[l1 + 1]);
            j1 ^= F3(i1, l[l1 + 2], k[l1 + 2]);
            i ^= F1(j1, l[l1 + 3], k[l1 + 3]);
        }

        l1 = 6;
        k1 = i;
        for (i = l1; i < 12; i++)
        {
            int i2 = (11 - i) * 4;
            k1 ^= F1(j1, l[i2 + 3], k[i2 + 3]);
            j1 ^= F3(i1, l[i2 + 2], k[i2 + 2]);
            i1 ^= F2(j, l[i2 + 1], k[i2 + 1]);
            j ^= F1(k1, l[i2], k[i2]);
        }

        ai[0] = j1;
        ai[1] = i1;
        ai[2] = j;
        ai[3] = k1;
    }

    protected final void CAST_Encipher(int i, int j, int i1, int j1, int ai[])
    {
        boolean flag = false;
        int k1 = j1;
        int l1 = i1;
        j1 = i;
        i1 = j;
        j = l1;
        i = k1;
        for (k1 = ((flag) ? 1 : 0); k1 < 6; k1++)
        {
            l1 = k1 * 4;
            j ^= F1(i, l[l1], k[l1]);
            i1 ^= F2(j, l[l1 + 1], k[l1 + 1]);
            j1 ^= F3(i1, l[l1 + 2], k[l1 + 2]);
            i ^= F1(j1, l[l1 + 3], k[l1 + 3]);
        }

        l1 = 6;
        k1 = i;
        for (i = l1; i < 12; i++)
        {
            int i2 = i * 4;
            k1 ^= F1(j1, l[i2 + 3], k[i2 + 3]);
            j1 ^= F3(i1, l[i2 + 2], k[i2 + 2]);
            i1 ^= F2(j, l[i2 + 1], k[i2 + 1]);
            j ^= F1(k1, l[i2], k[i2]);
        }

        ai[0] = j1;
        ai[1] = i1;
        ai[2] = j;
        ai[3] = k1;
    }

    protected final int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        CAST_Decipher(BytesTo32bits(abyte0, i), BytesTo32bits(abyte0, i + 4), BytesTo32bits(abyte0, i + 8), BytesTo32bits(abyte0, i + 12), ai);
        Bits32ToBytes(ai[0], abyte1, j);
        Bits32ToBytes(ai[1], abyte1, j + 4);
        Bits32ToBytes(ai[2], abyte1, j + 8);
        Bits32ToBytes(ai[3], abyte1, j + 12);
        return 16;
    }

    protected final int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        CAST_Encipher(BytesTo32bits(abyte0, i), BytesTo32bits(abyte0, i + 4), BytesTo32bits(abyte0, i + 8), BytesTo32bits(abyte0, i + 12), ai);
        Bits32ToBytes(ai[0], abyte1, j);
        Bits32ToBytes(ai[1], abyte1, j + 4);
        Bits32ToBytes(ai[2], abyte1, j + 8);
        Bits32ToBytes(ai[3], abyte1, j + 12);
        return 16;
    }

    public final String getAlgorithmName()
    {
        return "CAST6";
    }

    public final int getBlockSize()
    {
        return 16;
    }

    public final void reset()
    {
    }

    protected final void setKey(byte abyte0[])
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
            o[j] = BytesTo32bits(abyte1, j * 4);
        }

        for (int i1 = 0; i1 < 12; i1++)
        {
            int k1 = i1 * 2 * 8;
            abyte0 = o;
            abyte0[6] = abyte0[6] ^ F1(o[7], n[k1], m[k1]);
            abyte0 = o;
            abyte0[5] = abyte0[5] ^ F2(o[6], n[k1 + 1], m[k1 + 1]);
            abyte0 = o;
            abyte0[4] = abyte0[4] ^ F3(o[5], n[k1 + 2], m[k1 + 2]);
            abyte0 = o;
            abyte0[3] = abyte0[3] ^ F1(o[4], n[k1 + 3], m[k1 + 3]);
            abyte0 = o;
            abyte0[2] = abyte0[2] ^ F2(o[3], n[k1 + 4], m[k1 + 4]);
            abyte0 = o;
            abyte0[1] = abyte0[1] ^ F3(o[2], n[k1 + 5], m[k1 + 5]);
            abyte0 = o;
            abyte0[0] = abyte0[0] ^ F1(o[1], n[k1 + 6], m[k1 + 6]);
            abyte0 = o;
            byte byte0 = abyte0[7];
            abyte0[7] = F2(o[0], n[k1 + 7], m[k1 + 7]) ^ byte0;
            k1 = (i1 * 2 + 1) * 8;
            abyte0 = o;
            abyte0[6] = abyte0[6] ^ F1(o[7], n[k1], m[k1]);
            abyte0 = o;
            abyte0[5] = abyte0[5] ^ F2(o[6], n[k1 + 1], m[k1 + 1]);
            abyte0 = o;
            abyte0[4] = abyte0[4] ^ F3(o[5], n[k1 + 2], m[k1 + 2]);
            abyte0 = o;
            abyte0[3] = abyte0[3] ^ F1(o[4], n[k1 + 3], m[k1 + 3]);
            abyte0 = o;
            abyte0[2] = abyte0[2] ^ F2(o[3], n[k1 + 4], m[k1 + 4]);
            abyte0 = o;
            abyte0[1] = abyte0[1] ^ F3(o[2], n[k1 + 5], m[k1 + 5]);
            abyte0 = o;
            abyte0[0] = abyte0[0] ^ F1(o[1], n[k1 + 6], m[k1 + 6]);
            abyte0 = o;
            byte0 = abyte0[7];
            abyte0[7] = F2(o[0], n[k1 + 7], m[k1 + 7]) ^ byte0;
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
}
