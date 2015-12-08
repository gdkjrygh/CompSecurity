// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


// Referenced classes of package com.google.zxing.common:
//            BitArray

public final class BitMatrix
{

    private final int bits[];
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int i)
    {
        this(i, i);
    }

    public BitMatrix(int i, int j)
    {
        if (i < 1 || j < 1)
        {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        } else
        {
            width = i;
            height = j;
            rowSize = i + 31 >> 5;
            bits = new int[rowSize * j];
            return;
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

    public boolean equals(Object obj)
    {
        if (obj instanceof BitMatrix) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (width == ((BitMatrix) (obj = (BitMatrix)obj)).width && height == ((BitMatrix) (obj)).height && rowSize == ((BitMatrix) (obj)).rowSize && bits.length == ((BitMatrix) (obj)).bits.length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= bits.length)
                    {
                        break label1;
                    }
                    if (bits[i] != ((BitMatrix) (obj)).bits[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public void flip(int i, int j)
    {
        j = rowSize * j + (i >> 5);
        int ai[] = bits;
        ai[j] = ai[j] ^ 1 << (i & 0x1f);
    }

    public boolean get(int i, int j)
    {
        int k = rowSize;
        return (bits[k * j + (i >> 5)] >>> (i & 0x1f) & 1) != 0;
    }

    public int[] getBottomRightOnBit()
    {
        int i;
        for (i = bits.length - 1; i >= 0 && bits[i] == 0; i--) { }
        if (i < 0)
        {
            return null;
        }
        int k = i / rowSize;
        int l = rowSize;
        int i1 = bits[i];
        int j;
        for (j = 31; i1 >>> j == 0; j--) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public int[] getEnclosingRectangle()
    {
        int i;
        int k;
        int l;
        int i1;
        int l1;
        i1 = width;
        l = height;
        k = -1;
        l1 = -1;
        i = 0;
_L12:
        if (i >= height) goto _L2; else goto _L1
_L1:
        int i2 = 0;
_L11:
        if (i2 >= rowSize) goto _L4; else goto _L3
_L3:
        int j1;
        int j2;
        j2 = bits[rowSize * i + i2];
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        j1 = l;
        if (i < l)
        {
            j1 = i;
        }
        l = l1;
        if (i > l1)
        {
            l = i;
        }
        if (i2 * 32 >= i1) goto _L6; else goto _L5
_L5:
        for (l1 = 0; j2 << 31 - l1 == 0; l1++) { }
        if (i2 * 32 + l1 >= i1) goto _L6; else goto _L7
_L7:
        l1 = i2 * 32 + l1;
_L14:
        if (i2 * 32 + 31 <= k) goto _L9; else goto _L8
_L8:
        for (i1 = 31; j2 >>> i1 == 0; i1--) { }
        if (i2 * 32 + i1 <= k) goto _L9; else goto _L10
_L10:
        int k2 = i2 * 32 + i1;
        k = l;
        i1 = j1;
        l = k2;
_L13:
        i2++;
        j1 = l1;
        l1 = k;
        k = l;
        l = i1;
        i1 = j1;
          goto _L11
_L4:
        i++;
          goto _L12
_L2:
        int j = k - i1;
        k = l1 - l;
        if (j < 0 || k < 0)
        {
            return null;
        } else
        {
            return (new int[] {
                i1, l, j, k
            });
        }
_L9:
        i1 = j1;
        j1 = k;
        k = l;
        l = j1;
          goto _L13
_L6:
        l1 = i1;
          goto _L14
        int k1 = i1;
        i1 = l;
        l = k;
        k = l1;
        l1 = k1;
          goto _L13
    }

    public int getHeight()
    {
        return height;
    }

    public BitArray getRow(int i, BitArray bitarray)
    {
        BitArray bitarray1;
label0:
        {
            if (bitarray != null)
            {
                bitarray1 = bitarray;
                if (bitarray.getSize() >= width)
                {
                    break label0;
                }
            }
            bitarray1 = new BitArray(width);
        }
        int k = rowSize;
        for (int j = 0; j < rowSize; j++)
        {
            bitarray1.setBulk(j << 5, bits[i * k + j]);
        }

        return bitarray1;
    }

    public int[] getTopLeftOnBit()
    {
        int i;
        for (i = 0; i < bits.length && bits[i] == 0; i++) { }
        if (i == bits.length)
        {
            return null;
        }
        int k = i / rowSize;
        int l = rowSize;
        int i1 = bits[i];
        int j;
        for (j = 0; i1 << 31 - j == 0; j++) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public int getWidth()
    {
        return width;
    }

    public int hashCode()
    {
        int i = width;
        int k = width;
        int l = height;
        k = rowSize + ((i * 31 + k) * 31 + l) * 31;
        int ai[] = bits;
        l = ai.length;
        for (int j = 0; j < l; j++)
        {
            k = k * 31 + ai[j];
        }

        return k;
    }

    public void set(int i, int j)
    {
        j = rowSize * j + (i >> 5);
        int ai[] = bits;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public void setRegion(int i, int j, int k, int l)
    {
        int i1;
        if (j < 0 || i < 0)
        {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (l < 1 || k < 1)
        {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        i1 = i + k;
        l = j + l;
        if (l > height || i1 > width)
        {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
_L3:
        if (j < l)
        {
            int j1 = rowSize;
            k = i;
            while (k < i1) 
            {
                int ai[] = bits;
                int k1 = (k >> 5) + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
                k++;
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        j++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public void setRow(int i, BitArray bitarray)
    {
        System.arraycopy(bitarray.getBitArray(), 0, bits, rowSize * i, rowSize);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(height * (width + 1));
        for (int i = 0; i < height; i++)
        {
            int j = 0;
            while (j < width) 
            {
                String s;
                if (get(j, i))
                {
                    s = "X ";
                } else
                {
                    s = "  ";
                }
                stringbuilder.append(s);
                j++;
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }
}
