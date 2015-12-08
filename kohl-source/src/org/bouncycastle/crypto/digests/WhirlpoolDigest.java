// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

public final class WhirlpoolDigest
    implements ExtendedDigest
{

    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final long C0[] = new long[256];
    private static final long C1[] = new long[256];
    private static final long C2[] = new long[256];
    private static final long C3[] = new long[256];
    private static final long C4[] = new long[256];
    private static final long C5[] = new long[256];
    private static final long C6[] = new long[256];
    private static final long C7[] = new long[256];
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short EIGHT[];
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private static final int SBOX[] = {
        24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 
        210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 
        163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 
        254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 
        88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 
        16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 
        167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 
        71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 
        99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 
        91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 
        190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 
        26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 
        64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 
        207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 
        69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 
        47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 
        178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 
        37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 
        209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 
        252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 
        59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 
        148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 
        86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 
        157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 
        22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 
        152, 164, 40, 92, 248, 134
    };
    private long _K[];
    private long _L[];
    private short _bitCount[];
    private long _block[];
    private byte _buffer[];
    private int _bufferPos;
    private long _hash[];
    private final long _rc[];
    private long _state[];

    public WhirlpoolDigest()
    {
        _rc = new long[11];
        _buffer = new byte[64];
        _bufferPos = 0;
        _bitCount = new short[32];
        _hash = new long[8];
        _K = new long[8];
        _L = new long[8];
        _block = new long[8];
        _state = new long[8];
        for (int i = 0; i < 256; i++)
        {
            int k = SBOX[i];
            int i1 = maskWithReductionPolynomial(k << 1);
            int j1 = maskWithReductionPolynomial(i1 << 1);
            int k1 = j1 ^ k;
            int l1 = maskWithReductionPolynomial(j1 << 1);
            int i2 = l1 ^ k;
            C0[i] = packIntoLong(k, k, j1, k, l1, k1, i1, i2);
            C1[i] = packIntoLong(i2, k, k, j1, k, l1, k1, i1);
            C2[i] = packIntoLong(i1, i2, k, k, j1, k, l1, k1);
            C3[i] = packIntoLong(k1, i1, i2, k, k, j1, k, l1);
            C4[i] = packIntoLong(l1, k1, i1, i2, k, k, j1, k);
            C5[i] = packIntoLong(k, l1, k1, i1, i2, k, k, j1);
            C6[i] = packIntoLong(j1, k, l1, k1, i1, i2, k, k);
            C7[i] = packIntoLong(k, j1, k, l1, k1, i1, i2, k);
        }

        _rc[0] = 0L;
        for (int j = 1; j <= 10; j++)
        {
            int l = (j - 1) * 8;
            _rc[j] = C0[l] & 0xff00000000000000L ^ C1[l + 1] & 0xff000000000000L ^ C2[l + 2] & 0xff0000000000L ^ C3[l + 3] & 0xff00000000L ^ C4[l + 4] & 0xff000000L ^ C5[l + 5] & 0xff0000L ^ C6[l + 6] & 65280L ^ C7[l + 7] & 255L;
        }

    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpooldigest)
    {
        _rc = new long[11];
        _buffer = new byte[64];
        _bufferPos = 0;
        _bitCount = new short[32];
        _hash = new long[8];
        _K = new long[8];
        _L = new long[8];
        _block = new long[8];
        _state = new long[8];
        System.arraycopy(whirlpooldigest._rc, 0, _rc, 0, _rc.length);
        System.arraycopy(whirlpooldigest._buffer, 0, _buffer, 0, _buffer.length);
        _bufferPos = whirlpooldigest._bufferPos;
        System.arraycopy(whirlpooldigest._bitCount, 0, _bitCount, 0, _bitCount.length);
        System.arraycopy(whirlpooldigest._hash, 0, _hash, 0, _hash.length);
        System.arraycopy(whirlpooldigest._K, 0, _K, 0, _K.length);
        System.arraycopy(whirlpooldigest._L, 0, _L, 0, _L.length);
        System.arraycopy(whirlpooldigest._block, 0, _block, 0, _block.length);
        System.arraycopy(whirlpooldigest._state, 0, _state, 0, _state.length);
    }

    private long bytesToLongFromBuffer(byte abyte0[], int i)
    {
        return ((long)abyte0[i + 0] & 255L) << 56 | ((long)abyte0[i + 1] & 255L) << 48 | ((long)abyte0[i + 2] & 255L) << 40 | ((long)abyte0[i + 3] & 255L) << 32 | ((long)abyte0[i + 4] & 255L) << 24 | ((long)abyte0[i + 5] & 255L) << 16 | ((long)abyte0[i + 6] & 255L) << 8 | (long)abyte0[i + 7] & 255L;
    }

    private void convertLongToByteArray(long l, byte abyte0[], int i)
    {
        for (int j = 0; j < 8; j++)
        {
            abyte0[i + j] = (byte)(int)(l >> 56 - j * 8 & 255L);
        }

    }

    private byte[] copyBitLength()
    {
        byte abyte0[] = new byte[32];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(_bitCount[i] & 0xff);
        }

        return abyte0;
    }

    private void finish()
    {
        byte abyte0[] = copyBitLength();
        byte abyte1[] = _buffer;
        int i = _bufferPos;
        _bufferPos = i + 1;
        abyte1[i] = (byte)(abyte1[i] | 0x80);
        if (_bufferPos == _buffer.length)
        {
            processFilledBuffer(_buffer, 0);
        }
        if (_bufferPos > 32)
        {
            while (_bufferPos != 0) 
            {
                update((byte)0);
            }
        }
        while (_bufferPos <= 32) 
        {
            update((byte)0);
        }
        System.arraycopy(abyte0, 0, _buffer, 32, abyte0.length);
        processFilledBuffer(_buffer, 0);
    }

    private void increment()
    {
        int j = 0;
        for (int i = _bitCount.length - 1; i >= 0; i--)
        {
            int k = (_bitCount[i] & 0xff) + EIGHT[i] + j;
            j = k >>> 8;
            _bitCount[i] = (short)(k & 0xff);
        }

    }

    private int maskWithReductionPolynomial(int i)
    {
        int j = i;
        if ((long)i >= 256L)
        {
            j = i ^ 0x11d;
        }
        return j;
    }

    private long packIntoLong(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        return (long)i << 56 ^ (long)j << 48 ^ (long)k << 40 ^ (long)l << 32 ^ (long)i1 << 24 ^ (long)j1 << 16 ^ (long)k1 << 8 ^ (long)l1;
    }

    private void processFilledBuffer(byte abyte0[], int i)
    {
        for (i = 0; i < _state.length; i++)
        {
            _block[i] = bytesToLongFromBuffer(_buffer, i * 8);
        }

        processBlock();
        _bufferPos = 0;
        Arrays.fill(_buffer, (byte)0);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        for (int j = 0; j < 8; j++)
        {
            convertLongToByteArray(_hash[j], abyte0, j * 8 + i);
        }

        reset();
        return getDigestSize();
    }

    public String getAlgorithmName()
    {
        return "Whirlpool";
    }

    public int getByteLength()
    {
        return 64;
    }

    public int getDigestSize()
    {
        return 64;
    }

    protected void processBlock()
    {
        boolean flag = false;
        for (int i = 0; i < 8; i++)
        {
            long al[] = _state;
            long l = _block[i];
            long al5[] = _K;
            long l1 = _hash[i];
            al5[i] = l1;
            al[i] = l ^ l1;
        }

        int j = 1;
        int k;
        do
        {
            k = ((flag) ? 1 : 0);
            if (j > 10)
            {
                break;
            }
            for (k = 0; k < 8; k++)
            {
                _L[k] = 0L;
                long al1[] = _L;
                al1[k] = al1[k] ^ C0[(int)(_K[k + 0 & 7] >>> 56) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C1[(int)(_K[k - 1 & 7] >>> 48) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C2[(int)(_K[k - 2 & 7] >>> 40) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C3[(int)(_K[k - 3 & 7] >>> 32) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C4[(int)(_K[k - 4 & 7] >>> 24) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C5[(int)(_K[k - 5 & 7] >>> 16) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C6[(int)(_K[k - 6 & 7] >>> 8) & 0xff];
                al1 = _L;
                al1[k] = al1[k] ^ C7[(int)_K[k - 7 & 7] & 0xff];
            }

            System.arraycopy(_L, 0, _K, 0, _K.length);
            long al2[] = _K;
            al2[0] = al2[0] ^ _rc[j];
            for (k = 0; k < 8; k++)
            {
                _L[k] = _K[k];
                long al3[] = _L;
                al3[k] = al3[k] ^ C0[(int)(_state[k + 0 & 7] >>> 56) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C1[(int)(_state[k - 1 & 7] >>> 48) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C2[(int)(_state[k - 2 & 7] >>> 40) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C3[(int)(_state[k - 3 & 7] >>> 32) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C4[(int)(_state[k - 4 & 7] >>> 24) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C5[(int)(_state[k - 5 & 7] >>> 16) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C6[(int)(_state[k - 6 & 7] >>> 8) & 0xff];
                al3 = _L;
                al3[k] = al3[k] ^ C7[(int)_state[k - 7 & 7] & 0xff];
            }

            System.arraycopy(_L, 0, _state, 0, _state.length);
            j++;
        } while (true);
        for (; k < 8; k++)
        {
            long al4[] = _hash;
            al4[k] = al4[k] ^ (_state[k] ^ _block[k]);
        }

    }

    public void reset()
    {
        _bufferPos = 0;
        Arrays.fill(_bitCount, (short)0);
        Arrays.fill(_buffer, (byte)0);
        Arrays.fill(_hash, 0L);
        Arrays.fill(_K, 0L);
        Arrays.fill(_L, 0L);
        Arrays.fill(_block, 0L);
        Arrays.fill(_state, 0L);
    }

    public void update(byte byte0)
    {
        _buffer[_bufferPos] = byte0;
        _bufferPos = _bufferPos + 1;
        if (_bufferPos == _buffer.length)
        {
            processFilledBuffer(_buffer, 0);
        }
        increment();
    }

    public void update(byte abyte0[], int i, int j)
    {
        for (; j > 0; j--)
        {
            update(abyte0[i]);
            i++;
        }

    }

    static 
    {
        EIGHT = new short[32];
        EIGHT[31] = 8;
    }
}
