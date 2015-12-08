// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class SerpentEngine
    implements BlockCipher
{

    private boolean a;
    private int b[];
    private int c;
    private int d;
    private int e;
    private int f;

    public SerpentEngine()
    {
    }

    private static int a(int i1, int j1)
    {
        return i1 << j1 | i1 >>> -j1;
    }

    private static int a(byte abyte0[], int i1)
    {
        return (abyte0[i1] & 0xff) << 24 | (abyte0[i1 + 1] & 0xff) << 16 | (abyte0[i1 + 2] & 0xff) << 8 | abyte0[i1 + 3] & 0xff;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        int k2 = i1 ^ l1;
        int i2 = k1 ^ k2;
        int j2 = j1 ^ i2;
        f = i1 & l1 ^ j2;
        i1 = k2 & j1 ^ i1;
        e = j2 ^ (k1 | i1);
        j1 = f & (i2 ^ i1);
        d = ~i2 ^ j1;
        c = ~i1 ^ j1;
    }

    private static void a(int i1, byte abyte0[], int j1)
    {
        abyte0[j1 + 3] = (byte)i1;
        abyte0[j1 + 2] = (byte)(i1 >>> 8);
        abyte0[j1 + 1] = (byte)(i1 >>> 16);
        abyte0[j1] = (byte)(i1 >>> 24);
    }

    private static int b(int i1, int j1)
    {
        return i1 >>> j1 | i1 << -j1;
    }

    private void b(int i1, int j1, int k1, int l1)
    {
        int i2 = ~i1;
        int j2 = i1 ^ j1;
        j1 = (i2 | j2) ^ l1;
        k1 ^= j1;
        e = j2 ^ k1;
        l1 = i2 ^ j2 & l1;
        d = e & l1 ^ j1;
        f = i1 & j1 ^ (d | k1);
        c = l1 ^ k1 ^ f;
    }

    private void c(int i1, int j1, int k1, int l1)
    {
        int i2 = ~i1 ^ j1;
        i1 = (i1 | i2) ^ k1;
        e = l1 ^ i1;
        j1 = (l1 | i2) ^ j1;
        k1 = i2 ^ e;
        f = i1 & j1 ^ k1;
        j1 ^= i1;
        d = f ^ j1;
        c = k1 & j1 ^ i1;
    }

    private void d()
    {
        int i1 = a(c, 13);
        int j1 = a(e, 3);
        int k1 = d;
        int l1 = f;
        d = a(k1 ^ i1 ^ j1, 1);
        f = a(l1 ^ j1 ^ i1 << 3, 7);
        c = a(i1 ^ d ^ f, 5);
        e = a(f ^ j1 ^ d << 7, 22);
    }

    private void d(int i1, int j1, int k1, int l1)
    {
        l1 = j1 ^ l1;
        int i2 = j1 & l1 ^ i1;
        i1 = l1 ^ i2;
        f = k1 ^ i1;
        j1 = l1 & i2 ^ j1;
        d = i2 ^ (f | j1);
        k1 = ~d;
        j1 ^= f;
        c = k1 ^ j1;
        e = (j1 | k1) ^ i1;
    }

    private void e()
    {
        int i1 = b(e, 22) ^ f ^ d << 7;
        int j1 = b(c, 5) ^ d ^ f;
        int k1 = b(f, 7);
        int l1 = b(d, 1);
        f = k1 ^ i1 ^ j1 << 3;
        d = l1 ^ j1 ^ i1;
        e = b(i1, 3);
        c = b(j1, 13);
    }

    private void e(int i1, int j1, int k1, int l1)
    {
        int i2 = ~i1;
        int j2 = j1 ^ l1;
        c = k1 & i2 ^ j2;
        int k2 = k1 ^ i2;
        j1 = (c ^ k1) & j1;
        f = k2 ^ j1;
        e = (k2 | c) & (j1 | l1) ^ i1;
        i1 = f;
        d = (i2 | l1) ^ e ^ (j2 ^ i1);
    }

    private void f(int i1, int j1, int k1, int l1)
    {
        int j2 = j1 ^ l1;
        int i2 = i1 ^ k1;
        k1 ^= j2;
        c = j1 & k1 ^ i2;
        f = j2 ^ ((~j2 | i1) ^ l1 | i2);
        i1 = ~k1;
        j1 = c | f;
        d = i1 ^ j1;
        e = i1 & l1 ^ (j1 ^ i2);
    }

    private void g(int i1, int j1, int k1, int l1)
    {
        int j2 = i1 ^ j1;
        int k2 = i1 | l1;
        int i2 = k1 ^ l1;
        i1 = i1 & k1 | j2 & k2;
        e = i2 ^ i1;
        i1 ^= k2 ^ j1;
        c = j2 ^ i2 & i1;
        k1 = e & c;
        d = i1 ^ k1;
        f = k1 ^ i2 ^ (j1 | l1);
    }

    private void h(int i1, int j1, int k1, int l1)
    {
        int j2 = j1 ^ k1;
        int i2 = j1 & j2 ^ i1;
        int k2 = l1 | i2;
        c = j2 ^ k2;
        l1 = (j2 | k2) ^ l1;
        e = k1 ^ i2 ^ l1;
        i1 = (i1 | j1) ^ l1;
        f = c & i1 ^ i2;
        j1 = f;
        d = i1 ^ c ^ j1;
    }

    private void i(int i1, int j1, int k1, int l1)
    {
        int i2 = i1 ^ l1;
        k1 = l1 & i2 ^ k1;
        l1 = j1 | k1;
        f = i2 ^ l1;
        int j2 = ~j1;
        c = (i2 | j2) ^ k1;
        j1 = c;
        i2 ^= j2;
        e = l1 & i2 ^ j1 & i1;
        d = i2 & e ^ (k1 ^ i1);
    }

    private void j(int i1, int j1, int k1, int l1)
    {
        j1 = (k1 | l1) & i1 ^ j1;
        k1 = i1 & j1 ^ k1;
        d = l1 ^ k1;
        i1 = ~i1;
        f = k1 & d ^ j1;
        k1 = (d | i1) ^ l1;
        c = f ^ k1;
        e = j1 & k1 ^ (d ^ i1);
    }

    private void k(int i1, int j1, int k1, int l1)
    {
        int j2 = ~i1;
        int i2 = i1 ^ j1;
        i1 ^= l1;
        c = k1 ^ j2 ^ (i2 | i1);
        k1 = c & l1;
        d = c ^ i2 ^ k1;
        i1 = (j2 | c) ^ i1;
        e = (i2 | k1) ^ i1;
        f = i1 & d ^ (j1 ^ k1);
    }

    private void l(int i1, int j1, int k1, int l1)
    {
        int i2 = ~k1;
        int l2 = j1 & i2 ^ l1;
        int j2 = i1 & l2;
        f = j1 ^ i2 ^ j2;
        int k2 = f | j1;
        d = l2 ^ i1 & k2;
        l1 = i1 | l1;
        c = i2 ^ k2 ^ l1;
        e = j1 & l1 ^ (i1 ^ k1 | j2);
    }

    private void m(int i1, int j1, int k1, int l1)
    {
        int j2 = i1 ^ l1;
        int i2 = j1 ^ j2;
        i1 = (~i1 | j2) ^ k1;
        d = j1 ^ i1;
        j1 = (j2 | d) ^ l1;
        e = i1 & j1 ^ i2;
        j1 ^= i1;
        c = e ^ j1;
        f = ~i1 ^ j1 & i2;
    }

    private void n(int i1, int j1, int k1, int l1)
    {
        int i2 = ~i1;
        int j2 = i1 ^ j1;
        i1 = k1 ^ j2;
        k1 = (k1 | i2) ^ l1;
        d = i1 ^ k1;
        j2 ^= i1 & k1;
        f = k1 ^ (j1 | j2);
        j1 = f | j1;
        c = j2 ^ j1;
        e = i2 & l1 ^ (i1 ^ j1);
    }

    private void o(int i1, int j1, int k1, int l1)
    {
        int i2 = j1 ^ k1;
        k1 = k1 & i2 ^ l1;
        int j2 = i1 ^ k1;
        d = (l1 | i2) & j2 ^ j1;
        j1 = d;
        f = i2 ^ i1 & j2;
        i1 = j2 ^ (j1 | k1);
        e = k1 ^ f & i1;
        c = ~i1 ^ f & e;
    }

    private void p(int i1, int j1, int k1, int l1)
    {
        int i2 = i1 & j1 | k1;
        int j2 = (i1 | j1) & l1;
        f = i2 ^ j2;
        j1 = j2 ^ j1;
        d = (~l1 ^ f | j1) ^ i1;
        c = j1 ^ k1 ^ (d | l1);
        e = i2 ^ d ^ (c ^ f & i1);
    }

    public final int a(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        if (b == null)
        {
            throw new IllegalStateException("Serpent not initialised");
        }
        if (i1 + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j1 + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (a)
        {
            f = a(abyte0, i1);
            e = a(abyte0, i1 + 4);
            d = a(abyte0, i1 + 8);
            c = a(abyte0, i1 + 12);
            a(b[0] ^ c, b[1] ^ d, b[2] ^ e, b[3] ^ f);
            d();
            c(b[4] ^ c, b[5] ^ d, b[6] ^ e, b[7] ^ f);
            d();
            e(b[8] ^ c, b[9] ^ d, b[10] ^ e, b[11] ^ f);
            d();
            g(b[12] ^ c, b[13] ^ d, b[14] ^ e, b[15] ^ f);
            d();
            i(b[16] ^ c, b[17] ^ d, b[18] ^ e, b[19] ^ f);
            d();
            k(b[20] ^ c, b[21] ^ d, b[22] ^ e, b[23] ^ f);
            d();
            m(b[24] ^ c, b[25] ^ d, b[26] ^ e, b[27] ^ f);
            d();
            o(b[28] ^ c, b[29] ^ d, b[30] ^ e, b[31] ^ f);
            d();
            a(b[32] ^ c, b[33] ^ d, b[34] ^ e, b[35] ^ f);
            d();
            c(b[36] ^ c, b[37] ^ d, b[38] ^ e, b[39] ^ f);
            d();
            e(b[40] ^ c, b[41] ^ d, b[42] ^ e, b[43] ^ f);
            d();
            g(b[44] ^ c, b[45] ^ d, b[46] ^ e, b[47] ^ f);
            d();
            i(b[48] ^ c, b[49] ^ d, b[50] ^ e, b[51] ^ f);
            d();
            k(b[52] ^ c, b[53] ^ d, b[54] ^ e, b[55] ^ f);
            d();
            m(b[56] ^ c, b[57] ^ d, b[58] ^ e, b[59] ^ f);
            d();
            o(b[60] ^ c, b[61] ^ d, b[62] ^ e, b[63] ^ f);
            d();
            a(b[64] ^ c, b[65] ^ d, b[66] ^ e, b[67] ^ f);
            d();
            c(b[68] ^ c, b[69] ^ d, b[70] ^ e, b[71] ^ f);
            d();
            e(b[72] ^ c, b[73] ^ d, b[74] ^ e, b[75] ^ f);
            d();
            g(b[76] ^ c, b[77] ^ d, b[78] ^ e, b[79] ^ f);
            d();
            i(b[80] ^ c, b[81] ^ d, b[82] ^ e, b[83] ^ f);
            d();
            k(b[84] ^ c, b[85] ^ d, b[86] ^ e, b[87] ^ f);
            d();
            m(b[88] ^ c, b[89] ^ d, b[90] ^ e, b[91] ^ f);
            d();
            o(b[92] ^ c, b[93] ^ d, b[94] ^ e, b[95] ^ f);
            d();
            a(b[96] ^ c, b[97] ^ d, b[98] ^ e, b[99] ^ f);
            d();
            c(b[100] ^ c, b[101] ^ d, b[102] ^ e, b[103] ^ f);
            d();
            e(b[104] ^ c, b[105] ^ d, b[106] ^ e, b[107] ^ f);
            d();
            g(b[108] ^ c, b[109] ^ d, b[110] ^ e, b[111] ^ f);
            d();
            i(b[112] ^ c, b[113] ^ d, b[114] ^ e, b[115] ^ f);
            d();
            k(b[116] ^ c, b[117] ^ d, b[118] ^ e, b[119] ^ f);
            d();
            m(b[120] ^ c, b[121] ^ d, b[122] ^ e, b[123] ^ f);
            d();
            o(b[124] ^ c, b[125] ^ d, b[126] ^ e, b[127] ^ f);
            a(b[131] ^ f, abyte1, j1);
            a(b[130] ^ e, abyte1, j1 + 4);
            a(b[129] ^ d, abyte1, j1 + 8);
            a(b[128] ^ c, abyte1, j1 + 12);
            return 16;
        } else
        {
            f = b[131] ^ a(abyte0, i1);
            e = b[130] ^ a(abyte0, i1 + 4);
            d = b[129] ^ a(abyte0, i1 + 8);
            c = b[128] ^ a(abyte0, i1 + 12);
            p(c, d, e, f);
            c = c ^ b[124];
            d = d ^ b[125];
            e = e ^ b[126];
            f = f ^ b[127];
            e();
            n(c, d, e, f);
            c = c ^ b[120];
            d = d ^ b[121];
            e = e ^ b[122];
            f = f ^ b[123];
            e();
            l(c, d, e, f);
            c = c ^ b[116];
            d = d ^ b[117];
            e = e ^ b[118];
            f = f ^ b[119];
            e();
            j(c, d, e, f);
            c = c ^ b[112];
            d = d ^ b[113];
            e = e ^ b[114];
            f = f ^ b[115];
            e();
            h(c, d, e, f);
            c = c ^ b[108];
            d = d ^ b[109];
            e = e ^ b[110];
            f = f ^ b[111];
            e();
            f(c, d, e, f);
            c = c ^ b[104];
            d = d ^ b[105];
            e = e ^ b[106];
            f = f ^ b[107];
            e();
            d(c, d, e, f);
            c = c ^ b[100];
            d = d ^ b[101];
            e = e ^ b[102];
            f = f ^ b[103];
            e();
            b(c, d, e, f);
            c = c ^ b[96];
            d = d ^ b[97];
            e = e ^ b[98];
            f = f ^ b[99];
            e();
            p(c, d, e, f);
            c = c ^ b[92];
            d = d ^ b[93];
            e = e ^ b[94];
            f = f ^ b[95];
            e();
            n(c, d, e, f);
            c = c ^ b[88];
            d = d ^ b[89];
            e = e ^ b[90];
            f = f ^ b[91];
            e();
            l(c, d, e, f);
            c = c ^ b[84];
            d = d ^ b[85];
            e = e ^ b[86];
            f = f ^ b[87];
            e();
            j(c, d, e, f);
            c = c ^ b[80];
            d = d ^ b[81];
            e = e ^ b[82];
            f = f ^ b[83];
            e();
            h(c, d, e, f);
            c = c ^ b[76];
            d = d ^ b[77];
            e = e ^ b[78];
            f = f ^ b[79];
            e();
            f(c, d, e, f);
            c = c ^ b[72];
            d = d ^ b[73];
            e = e ^ b[74];
            f = f ^ b[75];
            e();
            d(c, d, e, f);
            c = c ^ b[68];
            d = d ^ b[69];
            e = e ^ b[70];
            f = f ^ b[71];
            e();
            b(c, d, e, f);
            c = c ^ b[64];
            d = d ^ b[65];
            e = e ^ b[66];
            f = f ^ b[67];
            e();
            p(c, d, e, f);
            c = c ^ b[60];
            d = d ^ b[61];
            e = e ^ b[62];
            f = f ^ b[63];
            e();
            n(c, d, e, f);
            c = c ^ b[56];
            d = d ^ b[57];
            e = e ^ b[58];
            f = f ^ b[59];
            e();
            l(c, d, e, f);
            c = c ^ b[52];
            d = d ^ b[53];
            e = e ^ b[54];
            f = f ^ b[55];
            e();
            j(c, d, e, f);
            c = c ^ b[48];
            d = d ^ b[49];
            e = e ^ b[50];
            f = f ^ b[51];
            e();
            h(c, d, e, f);
            c = c ^ b[44];
            d = d ^ b[45];
            e = e ^ b[46];
            f = f ^ b[47];
            e();
            f(c, d, e, f);
            c = c ^ b[40];
            d = d ^ b[41];
            e = e ^ b[42];
            f = f ^ b[43];
            e();
            d(c, d, e, f);
            c = c ^ b[36];
            d = d ^ b[37];
            e = e ^ b[38];
            f = f ^ b[39];
            e();
            b(c, d, e, f);
            c = c ^ b[32];
            d = d ^ b[33];
            e = e ^ b[34];
            f = f ^ b[35];
            e();
            p(c, d, e, f);
            c = c ^ b[28];
            d = d ^ b[29];
            e = e ^ b[30];
            f = f ^ b[31];
            e();
            n(c, d, e, f);
            c = c ^ b[24];
            d = d ^ b[25];
            e = e ^ b[26];
            f = f ^ b[27];
            e();
            l(c, d, e, f);
            c = c ^ b[20];
            d = d ^ b[21];
            e = e ^ b[22];
            f = f ^ b[23];
            e();
            j(c, d, e, f);
            c = c ^ b[16];
            d = d ^ b[17];
            e = e ^ b[18];
            f = f ^ b[19];
            e();
            h(c, d, e, f);
            c = c ^ b[12];
            d = d ^ b[13];
            e = e ^ b[14];
            f = f ^ b[15];
            e();
            f(c, d, e, f);
            c = c ^ b[8];
            d = d ^ b[9];
            e = e ^ b[10];
            f = f ^ b[11];
            e();
            d(c, d, e, f);
            c = c ^ b[4];
            d = d ^ b[5];
            e = e ^ b[6];
            f = f ^ b[7];
            e();
            b(c, d, e, f);
            a(f ^ b[3], abyte1, j1);
            a(e ^ b[2], abyte1, j1 + 4);
            a(d ^ b[1], abyte1, j1 + 8);
            a(c ^ b[0], abyte1, j1 + 12);
            return 16;
        }
    }

    public final String a()
    {
        return "Serpent";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            a = flag;
            int ai[] = ((KeyParameter)cipherparameters).a();
            cipherparameters = new int[16];
            int l1 = ai.length - 4;
            int i1;
            for (i1 = 0; l1 > 0; i1++)
            {
                cipherparameters[i1] = a(((byte []) (ai)), l1);
                l1 -= 4;
            }

            if (l1 == 0)
            {
                int i2 = i1 + 1;
                cipherparameters[i1] = a(((byte []) (ai)), 0);
                if (i2 < 8)
                {
                    cipherparameters[i2] = 1;
                }
                ai = new int[132];
                for (int j1 = 8; j1 < 16; j1++)
                {
                    cipherparameters[j1] = a(cipherparameters[j1 - 8] ^ cipherparameters[j1 - 5] ^ cipherparameters[j1 - 3] ^ cipherparameters[j1 - 1] ^ 0x9e3779b9 ^ j1 - 8, 11);
                }

            } else
            {
                throw new IllegalArgumentException("key must be a multiple of 4 bytes");
            }
            System.arraycopy(cipherparameters, 8, ai, 0, 8);
            for (int k1 = 8; k1 < 132; k1++)
            {
                ai[k1] = a(ai[k1 - 8] ^ ai[k1 - 5] ^ ai[k1 - 3] ^ ai[k1 - 1] ^ 0x9e3779b9 ^ k1, 11);
            }

            g(ai[0], ai[1], ai[2], ai[3]);
            ai[0] = c;
            ai[1] = d;
            ai[2] = e;
            ai[3] = f;
            e(ai[4], ai[5], ai[6], ai[7]);
            ai[4] = c;
            ai[5] = d;
            ai[6] = e;
            ai[7] = f;
            c(ai[8], ai[9], ai[10], ai[11]);
            ai[8] = c;
            ai[9] = d;
            ai[10] = e;
            ai[11] = f;
            a(ai[12], ai[13], ai[14], ai[15]);
            ai[12] = c;
            ai[13] = d;
            ai[14] = e;
            ai[15] = f;
            o(ai[16], ai[17], ai[18], ai[19]);
            ai[16] = c;
            ai[17] = d;
            ai[18] = e;
            ai[19] = f;
            m(ai[20], ai[21], ai[22], ai[23]);
            ai[20] = c;
            ai[21] = d;
            ai[22] = e;
            ai[23] = f;
            k(ai[24], ai[25], ai[26], ai[27]);
            ai[24] = c;
            ai[25] = d;
            ai[26] = e;
            ai[27] = f;
            i(ai[28], ai[29], ai[30], ai[31]);
            ai[28] = c;
            ai[29] = d;
            ai[30] = e;
            ai[31] = f;
            g(ai[32], ai[33], ai[34], ai[35]);
            ai[32] = c;
            ai[33] = d;
            ai[34] = e;
            ai[35] = f;
            e(ai[36], ai[37], ai[38], ai[39]);
            ai[36] = c;
            ai[37] = d;
            ai[38] = e;
            ai[39] = f;
            c(ai[40], ai[41], ai[42], ai[43]);
            ai[40] = c;
            ai[41] = d;
            ai[42] = e;
            ai[43] = f;
            a(ai[44], ai[45], ai[46], ai[47]);
            ai[44] = c;
            ai[45] = d;
            ai[46] = e;
            ai[47] = f;
            o(ai[48], ai[49], ai[50], ai[51]);
            ai[48] = c;
            ai[49] = d;
            ai[50] = e;
            ai[51] = f;
            m(ai[52], ai[53], ai[54], ai[55]);
            ai[52] = c;
            ai[53] = d;
            ai[54] = e;
            ai[55] = f;
            k(ai[56], ai[57], ai[58], ai[59]);
            ai[56] = c;
            ai[57] = d;
            ai[58] = e;
            ai[59] = f;
            i(ai[60], ai[61], ai[62], ai[63]);
            ai[60] = c;
            ai[61] = d;
            ai[62] = e;
            ai[63] = f;
            g(ai[64], ai[65], ai[66], ai[67]);
            ai[64] = c;
            ai[65] = d;
            ai[66] = e;
            ai[67] = f;
            e(ai[68], ai[69], ai[70], ai[71]);
            ai[68] = c;
            ai[69] = d;
            ai[70] = e;
            ai[71] = f;
            c(ai[72], ai[73], ai[74], ai[75]);
            ai[72] = c;
            ai[73] = d;
            ai[74] = e;
            ai[75] = f;
            a(ai[76], ai[77], ai[78], ai[79]);
            ai[76] = c;
            ai[77] = d;
            ai[78] = e;
            ai[79] = f;
            o(ai[80], ai[81], ai[82], ai[83]);
            ai[80] = c;
            ai[81] = d;
            ai[82] = e;
            ai[83] = f;
            m(ai[84], ai[85], ai[86], ai[87]);
            ai[84] = c;
            ai[85] = d;
            ai[86] = e;
            ai[87] = f;
            k(ai[88], ai[89], ai[90], ai[91]);
            ai[88] = c;
            ai[89] = d;
            ai[90] = e;
            ai[91] = f;
            i(ai[92], ai[93], ai[94], ai[95]);
            ai[92] = c;
            ai[93] = d;
            ai[94] = e;
            ai[95] = f;
            g(ai[96], ai[97], ai[98], ai[99]);
            ai[96] = c;
            ai[97] = d;
            ai[98] = e;
            ai[99] = f;
            e(ai[100], ai[101], ai[102], ai[103]);
            ai[100] = c;
            ai[101] = d;
            ai[102] = e;
            ai[103] = f;
            c(ai[104], ai[105], ai[106], ai[107]);
            ai[104] = c;
            ai[105] = d;
            ai[106] = e;
            ai[107] = f;
            a(ai[108], ai[109], ai[110], ai[111]);
            ai[108] = c;
            ai[109] = d;
            ai[110] = e;
            ai[111] = f;
            o(ai[112], ai[113], ai[114], ai[115]);
            ai[112] = c;
            ai[113] = d;
            ai[114] = e;
            ai[115] = f;
            m(ai[116], ai[117], ai[118], ai[119]);
            ai[116] = c;
            ai[117] = d;
            ai[118] = e;
            ai[119] = f;
            k(ai[120], ai[121], ai[122], ai[123]);
            ai[120] = c;
            ai[121] = d;
            ai[122] = e;
            ai[123] = f;
            i(ai[124], ai[125], ai[126], ai[127]);
            ai[124] = c;
            ai[125] = d;
            ai[126] = e;
            ai[127] = f;
            g(ai[128], ai[129], ai[130], ai[131]);
            ai[128] = c;
            ai[129] = d;
            ai[130] = e;
            ai[131] = f;
            b = ai;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to Serpent init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
    }
}
