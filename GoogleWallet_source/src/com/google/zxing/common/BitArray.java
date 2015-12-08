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

    private void ensureCapacity(int i)
    {
        if (i > bits.length << 5)
        {
            int ai[] = makeArray(i);
            System.arraycopy(bits, 0, ai, 0, bits.length);
            bits = ai;
        }
    }

    private static int[] makeArray(int i)
    {
        return new int[i + 31 >> 5];
    }

    public final void appendBit(boolean flag)
    {
        ensureCapacity(size + 1);
        if (flag)
        {
            int ai[] = bits;
            int i = size >> 5;
            ai[i] = ai[i] | 1 << (size & 0x1f);
        }
        size = size + 1;
    }

    public final void appendBitArray(BitArray bitarray)
    {
        int j = bitarray.size;
        ensureCapacity(size + j);
        for (int i = 0; i < j; i++)
        {
            appendBit(bitarray.get(i));
        }

    }

    public final void appendBits(int i, int j)
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

    public final void clear()
    {
        int j = bits.length;
        for (int i = 0; i < j; i++)
        {
            bits[i] = 0;
        }

    }

    public final boolean get(int i)
    {
        return (bits[i >> 5] & 1 << (i & 0x1f)) != 0;
    }

    public final int[] getBitArray()
    {
        return bits;
    }

    public final int getNextSet(int i)
    {
        if (i >= size)
        {
            i = size;
        } else
        {
            int k = i >> 5;
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

            j = (i << 5) + Integer.numberOfTrailingZeros(j);
            i = j;
            if (j > size)
            {
                return size;
            }
        }
        return i;
    }

    public final int getNextUnset(int i)
    {
        if (i >= size)
        {
            i = size;
        } else
        {
            int k = i >> 5;
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

            j = (i << 5) + Integer.numberOfTrailingZeros(j);
            i = j;
            if (j > size)
            {
                return size;
            }
        }
        return i;
    }

    public final int getSize()
    {
        return size;
    }

    public final int getSizeInBytes()
    {
        return size + 7 >> 3;
    }

    public final boolean isRange(int i, int j, boolean flag)
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
        k1 = i >> 5;
        i2 = l1 >> 5;
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
        break MISSING_BLOCK_LABEL_165;
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

    public final void reverse()
    {
        int ai[] = new int[bits.length];
        int j = size;
        for (int i = 0; i < j; i++)
        {
            if (get(j - i - 1))
            {
                int k = i >> 5;
                ai[k] = ai[k] | 1 << (i & 0x1f);
            }
        }

        bits = ai;
    }

    public final void set(int i)
    {
        int ai[] = bits;
        int j = i >> 5;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public final void setBulk(int i, int j)
    {
        bits[i >> 5] = j;
    }

    public final void toBytes(int i, byte abyte0[], int j, int k)
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

    public final String toString()
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

    public final void xor(BitArray bitarray)
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
