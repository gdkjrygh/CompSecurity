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
        int i1 = width;
        int j1 = height;
        int i2 = -1;
        int k1 = -1;
        for (int i = 0; i < height; i++)
        {
            for (int l1 = 0; l1 < rowSize;)
            {
                int j3 = bits[rowSize * i + l1];
                int k2 = k1;
                int l2 = i1;
                int i3 = i2;
                int j2 = j1;
                if (j3 != 0)
                {
                    int k = j1;
                    if (i < j1)
                    {
                        k = i;
                    }
                    j1 = k1;
                    if (i > k1)
                    {
                        j1 = i;
                    }
                    k1 = i1;
                    if (l1 * 32 < i1)
                    {
                        for (j2 = 0; j3 << 31 - j2 == 0; j2++) { }
                        k1 = i1;
                        if (l1 * 32 + j2 < i1)
                        {
                            k1 = l1 * 32 + j2;
                        }
                    }
                    k2 = j1;
                    l2 = k1;
                    i3 = i2;
                    j2 = k;
                    if (l1 * 32 + 31 > i2)
                    {
                        for (i1 = 31; j3 >>> i1 == 0; i1--) { }
                        k2 = j1;
                        l2 = k1;
                        i3 = i2;
                        j2 = k;
                        if (l1 * 32 + i1 > i2)
                        {
                            i3 = l1 * 32 + i1;
                            j2 = k;
                            l2 = k1;
                            k2 = j1;
                        }
                    }
                }
                l1++;
                k1 = k2;
                i1 = l2;
                i2 = i3;
                j1 = j2;
            }

        }

        int j = i2 - i1;
        int l = k1 - j1;
        if (j < 0 || l < 0)
        {
            return null;
        } else
        {
            return (new int[] {
                i1, j1, j, l
            });
        }
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
        int j = ((width * 31 + width) * 31 + height) * 31 + rowSize;
        int ai[] = bits;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            j = j * 31 + ai[i];
        }

        return j;
    }

    public void set(int i, int j)
    {
        j = rowSize * j + (i >> 5);
        int ai[] = bits;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public void setRegion(int i, int j, int k, int l)
    {
        if (j < 0 || i < 0)
        {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (l < 1 || k < 1)
        {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i1 = i + k;
        l = j + l;
        if (l > height || i1 > width)
        {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        for (; j < l; j++)
        {
            int j1 = rowSize;
            for (k = i; k < i1; k++)
            {
                int ai[] = bits;
                int k1 = (k >> 5) + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
            }

        }

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
