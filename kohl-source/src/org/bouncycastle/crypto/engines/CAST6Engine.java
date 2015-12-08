// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;


// Referenced classes of package org.bouncycastle.crypto.engines:
//            CAST5Engine

public final class CAST6Engine extends CAST5Engine
{

    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int _Km[];
    protected int _Kr[];
    protected int _Tm[];
    protected int _Tr[];
    private int _workingKey[];

    public CAST6Engine()
    {
        _Kr = new int[48];
        _Km = new int[48];
        _Tr = new int[192];
        _Tm = new int[192];
        _workingKey = new int[8];
    }

    protected final void CAST_Decipher(int i, int j, int k, int l, int ai[])
    {
        boolean flag = false;
        int i1 = l;
        int j1 = k;
        l = i;
        k = j;
        j = j1;
        i = i1;
        for (i1 = ((flag) ? 1 : 0); i1 < 6; i1++)
        {
            j1 = (11 - i1) * 4;
            j ^= F1(i, _Km[j1], _Kr[j1]);
            k ^= F2(j, _Km[j1 + 1], _Kr[j1 + 1]);
            l ^= F3(k, _Km[j1 + 2], _Kr[j1 + 2]);
            i ^= F1(l, _Km[j1 + 3], _Kr[j1 + 3]);
        }

        j1 = 6;
        i1 = i;
        for (i = j1; i < 12; i++)
        {
            int k1 = (11 - i) * 4;
            i1 ^= F1(l, _Km[k1 + 3], _Kr[k1 + 3]);
            l ^= F3(k, _Km[k1 + 2], _Kr[k1 + 2]);
            k ^= F2(j, _Km[k1 + 1], _Kr[k1 + 1]);
            j ^= F1(i1, _Km[k1], _Kr[k1]);
        }

        ai[0] = l;
        ai[1] = k;
        ai[2] = j;
        ai[3] = i1;
    }

    protected final void CAST_Encipher(int i, int j, int k, int l, int ai[])
    {
        boolean flag = false;
        int i1 = l;
        int j1 = k;
        l = i;
        k = j;
        j = j1;
        i = i1;
        for (i1 = ((flag) ? 1 : 0); i1 < 6; i1++)
        {
            j1 = i1 * 4;
            j ^= F1(i, _Km[j1], _Kr[j1]);
            k ^= F2(j, _Km[j1 + 1], _Kr[j1 + 1]);
            l ^= F3(k, _Km[j1 + 2], _Kr[j1 + 2]);
            i ^= F1(l, _Km[j1 + 3], _Kr[j1 + 3]);
        }

        j1 = 6;
        i1 = i;
        for (i = j1; i < 12; i++)
        {
            int k1 = i * 4;
            i1 ^= F1(l, _Km[k1 + 3], _Kr[k1 + 3]);
            l ^= F3(k, _Km[k1 + 2], _Kr[k1 + 2]);
            k ^= F2(j, _Km[k1 + 1], _Kr[k1 + 1]);
            j ^= F1(i1, _Km[k1], _Kr[k1]);
        }

        ai[0] = l;
        ai[1] = k;
        ai[2] = j;
        ai[3] = i1;
    }

    protected int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        CAST_Decipher(BytesTo32bits(abyte0, i), BytesTo32bits(abyte0, i + 4), BytesTo32bits(abyte0, i + 8), BytesTo32bits(abyte0, i + 12), ai);
        Bits32ToBytes(ai[0], abyte1, j);
        Bits32ToBytes(ai[1], abyte1, j + 4);
        Bits32ToBytes(ai[2], abyte1, j + 8);
        Bits32ToBytes(ai[3], abyte1, j + 12);
        return 16;
    }

    protected int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int ai[] = new int[4];
        CAST_Encipher(BytesTo32bits(abyte0, i), BytesTo32bits(abyte0, i + 4), BytesTo32bits(abyte0, i + 8), BytesTo32bits(abyte0, i + 12), ai);
        Bits32ToBytes(ai[0], abyte1, j);
        Bits32ToBytes(ai[1], abyte1, j + 4);
        Bits32ToBytes(ai[2], abyte1, j + 8);
        Bits32ToBytes(ai[3], abyte1, j + 12);
        return 16;
    }

    public String getAlgorithmName()
    {
        return "CAST6";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void reset()
    {
    }

    protected void setKey(byte abyte0[])
    {
        int l = 0x5a827999;
        int i = 19;
        int k1;
        for (int j1 = 0; j1 < 24; j1 = k1)
        {
            k1 = i;
            boolean flag = false;
            i = l;
            l = k1;
            for (k1 = ((flag) ? 1 : 0); k1 < 8; k1++)
            {
                _Tm[j1 * 8 + k1] = i;
                i += 0x6ed9eba1;
                _Tr[j1 * 8 + k1] = l;
                l = l + 17 & 0x1f;
            }

            k1 = j1 + 1;
            j1 = i;
            i = l;
            l = j1;
        }

        byte abyte1[] = new byte[64];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        for (int j = 0; j < 8; j++)
        {
            _workingKey[j] = BytesTo32bits(abyte1, j * 4);
        }

        for (int k = 0; k < 12; k++)
        {
            int i1 = k * 2 * 8;
            abyte0 = _workingKey;
            abyte0[6] = abyte0[6] ^ F1(_workingKey[7], _Tm[i1], _Tr[i1]);
            abyte0 = _workingKey;
            abyte0[5] = abyte0[5] ^ F2(_workingKey[6], _Tm[i1 + 1], _Tr[i1 + 1]);
            abyte0 = _workingKey;
            abyte0[4] = abyte0[4] ^ F3(_workingKey[5], _Tm[i1 + 2], _Tr[i1 + 2]);
            abyte0 = _workingKey;
            abyte0[3] = abyte0[3] ^ F1(_workingKey[4], _Tm[i1 + 3], _Tr[i1 + 3]);
            abyte0 = _workingKey;
            abyte0[2] = abyte0[2] ^ F2(_workingKey[3], _Tm[i1 + 4], _Tr[i1 + 4]);
            abyte0 = _workingKey;
            abyte0[1] = abyte0[1] ^ F3(_workingKey[2], _Tm[i1 + 5], _Tr[i1 + 5]);
            abyte0 = _workingKey;
            abyte0[0] = abyte0[0] ^ F1(_workingKey[1], _Tm[i1 + 6], _Tr[i1 + 6]);
            abyte0 = _workingKey;
            byte byte0 = abyte0[7];
            abyte0[7] = F2(_workingKey[0], _Tm[i1 + 7], _Tr[i1 + 7]) ^ byte0;
            i1 = (k * 2 + 1) * 8;
            abyte0 = _workingKey;
            abyte0[6] = abyte0[6] ^ F1(_workingKey[7], _Tm[i1], _Tr[i1]);
            abyte0 = _workingKey;
            abyte0[5] = abyte0[5] ^ F2(_workingKey[6], _Tm[i1 + 1], _Tr[i1 + 1]);
            abyte0 = _workingKey;
            abyte0[4] = abyte0[4] ^ F3(_workingKey[5], _Tm[i1 + 2], _Tr[i1 + 2]);
            abyte0 = _workingKey;
            abyte0[3] = abyte0[3] ^ F1(_workingKey[4], _Tm[i1 + 3], _Tr[i1 + 3]);
            abyte0 = _workingKey;
            abyte0[2] = abyte0[2] ^ F2(_workingKey[3], _Tm[i1 + 4], _Tr[i1 + 4]);
            abyte0 = _workingKey;
            abyte0[1] = abyte0[1] ^ F3(_workingKey[2], _Tm[i1 + 5], _Tr[i1 + 5]);
            abyte0 = _workingKey;
            abyte0[0] = abyte0[0] ^ F1(_workingKey[1], _Tm[i1 + 6], _Tr[i1 + 6]);
            abyte0 = _workingKey;
            byte0 = abyte0[7];
            abyte0[7] = F2(_workingKey[0], _Tm[i1 + 7], _Tr[i1 + 7]) ^ byte0;
            _Kr[k * 4] = _workingKey[0] & 0x1f;
            _Kr[k * 4 + 1] = _workingKey[2] & 0x1f;
            _Kr[k * 4 + 2] = _workingKey[4] & 0x1f;
            _Kr[k * 4 + 3] = _workingKey[6] & 0x1f;
            _Km[k * 4] = _workingKey[7];
            _Km[k * 4 + 1] = _workingKey[5];
            _Km[k * 4 + 2] = _workingKey[3];
            _Km[k * 4 + 3] = _workingKey[1];
        }

    }
}
