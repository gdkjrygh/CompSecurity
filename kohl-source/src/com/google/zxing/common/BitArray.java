// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


public final class BitArray
{

    private int bits[];
    private int size;

    public BitArray()
    {
        size = 0;
        bits = new int[1];
    }

    public BitArray(int i)
    {
        size = i;
        bits = makeArray(i);
    }

    BitArray(int ai[], int i)
    {
        bits = ai;
        size = i;
    }

    private void ensureCapacity(int i)
    {
        if (i > bits.length * 32)
        {
            int ai[] = makeArray(i);
            System.arraycopy(bits, 0, ai, 0, bits.length);
            bits = ai;
        }
    }

    private static int[] makeArray(int i)
    {
        return new int[(i + 31) / 32];
    }

    public void appendBit(boolean flag)
    {
        ensureCapacity(size + 1);
        if (flag)
        {
            int ai[] = bits;
            int i = size / 32;
            ai[i] = ai[i] | 1 << (size & 0x1f);
        }
        size = size + 1;
    }

    public void appendBitArray(BitArray bitarray)
    {
        int j = bitarray.size;
        ensureCapacity(size + j);
        for (int i = 0; i < j; i++)
        {
            appendBit(bitarray.get(i));
        }

    }

    public void appendBits(int i, int j)
    {
        if (j < 0 || j > 32)
        {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        ensureCapacity(size + j);
        while (j > 0) 
        {
            boolean flag;
            if ((i >> j - 1 & 1) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            appendBit(flag);
            j--;
        }
    }

    public void clear()
    {
        int j = bits.length;
        for (int i = 0; i < j; i++)
        {
            bits[i] = 0;
        }

    }

    public void flip(int i)
    {
        int ai[] = bits;
        int j = i / 32;
        ai[j] = ai[j] ^ 1 << (i & 0x1f);
    }

    public boolean get(int i)
    {
        return (bits[i / 32] & 1 << (i & 0x1f)) != 0;
    }

    public int[] getBitArray()
    {
        return bits;
    }

    public int getNextSet(int i)
    {
        if (i >= size)
        {
            i = size;
        } else
        {
            int k = i / 32;
            int j = bits[k] & ~((1 << (i & 0x1f)) - 1);
            i = k;
            for (; j == 0; j = bits[i])
            {
                i++;
                if (i == bits.length)
                {
                    return size;
                }
            }

            j = i * 32 + Integer.numberOfTrailingZeros(j);
            i = j;
            if (j > size)
            {
                return size;
            }
        }
        return i;
    }

    public int getNextUnset(int i)
    {
        if (i >= size)
        {
            i = size;
        } else
        {
            int k = i / 32;
            int j = ~bits[k] & ~((1 << (i & 0x1f)) - 1);
            i = k;
            for (; j == 0; j = ~bits[i])
            {
                i++;
                if (i == bits.length)
                {
                    return size;
                }
            }

            j = i * 32 + Integer.numberOfTrailingZeros(j);
            i = j;
            if (j > size)
            {
                return size;
            }
        }
        return i;
    }

    public int getSize()
    {
        return size;
    }

    public int getSizeInBytes()
    {
        return (size + 7) / 8;
    }

    public boolean isRange(int i, int j, boolean flag)
    {
        if (j < i)
        {
            throw new IllegalArgumentException();
        }
        if (j != i) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int l;
        int k1;
        int l1;
        int i2;
        l1 = j - 1;
        k1 = i / 32;
        i2 = l1 / 32;
        l = k1;
_L8:
        int i1;
        if (l > i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l > k1)
        {
            j = 0;
        } else
        {
            j = i & 0x1f;
        }
        if (l < i2)
        {
            i1 = 31;
        } else
        {
            i1 = l1 & 0x1f;
        }
        if (j != 0 || i1 != 31) goto _L4; else goto _L3
_L3:
        j = -1;
_L6:
        i1 = bits[l];
        int k;
        int j1;
        if (flag)
        {
            k = j;
        } else
        {
            k = 0;
        }
        if ((i1 & j) != k)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_167;
_L4:
        k = 0;
        j1 = j;
        do
        {
            j = k;
            if (j1 > i1)
            {
                break;
            }
            k |= 1 << j1;
            j1++;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        l++;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void reverse()
    {
        int ai[] = new int[bits.length];
        int k = (size - 1) / 32;
        int k1 = k + 1;
        for (int i = 0; i < k1; i++)
        {
            long l2 = bits[i];
            l2 = l2 >> 1 & 0x55555555L | (0x55555555L & l2) << 1;
            l2 = l2 >> 2 & 0x33333333L | (0x33333333L & l2) << 2;
            l2 = l2 >> 4 & 0xf0f0f0fL | (0xf0f0f0fL & l2) << 4;
            l2 = l2 >> 8 & 0xff00ffL | (0xff00ffL & l2) << 8;
            ai[k - i] = (int)(l2 >> 16 & 65535L | (65535L & l2) << 16);
        }

        if (size != k1 * 32)
        {
            int l1 = k1 * 32 - size;
            int j = 1;
            for (int l = 0; l < 31 - l1; l++)
            {
                j = j << 1 | 1;
            }

            int j1 = ai[0] >> l1 & j;
            for (int i1 = 1; i1 < k1; i1++)
            {
                int i2 = ai[i1];
                ai[i1 - 1] = j1 | i2 << 32 - l1;
                j1 = i2 >> l1 & j;
            }

            ai[k1 - 1] = j1;
        }
        bits = ai;
    }

    public void set(int i)
    {
        int ai[] = bits;
        int j = i / 32;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public void setBulk(int i, int j)
    {
        bits[i / 32] = j;
    }

    public void setRange(int i, int j)
    {
        if (j < i)
        {
            throw new IllegalArgumentException();
        }
        if (j != i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        int k1;
        int l1;
        int i2;
        l1 = j - 1;
        k1 = i / 32;
        i2 = l1 / 32;
        k = k1;
_L6:
        if (k > i2) goto _L1; else goto _L3
_L3:
        int l;
        int j1;
        int ai[];
        if (k > k1)
        {
            j = 0;
        } else
        {
            j = i & 0x1f;
        }
        if (k < i2)
        {
            l = 31;
        } else
        {
            l = l1 & 0x1f;
        }
        if (j != 0 || l != 31) goto _L5; else goto _L4
_L4:
        j1 = -1;
_L8:
        ai = bits;
        ai[k] = ai[k] | j1;
        k++;
          goto _L6
_L5:
        int i1;
        j1 = 0;
        i1 = j;
        j = j1;
_L9:
        j1 = j;
        if (i1 > l) goto _L8; else goto _L7
_L7:
        j |= 1 << i1;
        i1++;
          goto _L9
    }

    public void toBytes(int i, byte abyte0[], int j, int k)
    {
        boolean flag = false;
        int l = i;
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            int j1 = 0;
            for (int i1 = 0; i1 < 8;)
            {
                int k1 = j1;
                if (get(l))
                {
                    k1 = j1 | 1 << 7 - i1;
                }
                l++;
                i1++;
                j1 = k1;
            }

            abyte0[j + i] = (byte)j1;
        }

    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size);
        int i = 0;
        while (i < size) 
        {
            if ((i & 7) == 0)
            {
                stringbuilder.append(' ');
            }
            char c;
            if (get(i))
            {
                c = 'X';
            } else
            {
                c = '.';
            }
            stringbuilder.append(c);
            i++;
        }
        return stringbuilder.toString();
    }

    public void xor(BitArray bitarray)
    {
        if (bits.length != bitarray.bits.length)
        {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i = 0; i < bits.length; i++)
        {
            int ai[] = bits;
            ai[i] = ai[i] ^ bitarray.bits[i];
        }

    }
}
