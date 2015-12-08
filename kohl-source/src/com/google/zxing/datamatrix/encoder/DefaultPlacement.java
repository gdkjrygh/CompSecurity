// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

public class DefaultPlacement
{

    private final byte bits[];
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence charsequence, int i, int j)
    {
        codewords = charsequence;
        numcols = i;
        numrows = j;
        bits = new byte[i * j];
        Arrays.fill(bits, (byte)-1);
    }

    private void corner1(int i)
    {
        module(numrows - 1, 0, i, 1);
        module(numrows - 1, 1, i, 2);
        module(numrows - 1, 2, i, 3);
        module(0, numcols - 2, i, 4);
        module(0, numcols - 1, i, 5);
        module(1, numcols - 1, i, 6);
        module(2, numcols - 1, i, 7);
        module(3, numcols - 1, i, 8);
    }

    private void corner2(int i)
    {
        module(numrows - 3, 0, i, 1);
        module(numrows - 2, 0, i, 2);
        module(numrows - 1, 0, i, 3);
        module(0, numcols - 4, i, 4);
        module(0, numcols - 3, i, 5);
        module(0, numcols - 2, i, 6);
        module(0, numcols - 1, i, 7);
        module(1, numcols - 1, i, 8);
    }

    private void corner3(int i)
    {
        module(numrows - 3, 0, i, 1);
        module(numrows - 2, 0, i, 2);
        module(numrows - 1, 0, i, 3);
        module(0, numcols - 2, i, 4);
        module(0, numcols - 1, i, 5);
        module(1, numcols - 1, i, 6);
        module(2, numcols - 1, i, 7);
        module(3, numcols - 1, i, 8);
    }

    private void corner4(int i)
    {
        module(numrows - 1, 0, i, 1);
        module(numrows - 1, numcols - 1, i, 2);
        module(0, numcols - 3, i, 3);
        module(0, numcols - 2, i, 4);
        module(0, numcols - 1, i, 5);
        module(1, numcols - 3, i, 6);
        module(1, numcols - 2, i, 7);
        module(1, numcols - 1, i, 8);
    }

    private void module(int i, int j, int k, int l)
    {
        boolean flag = true;
        int i1 = i;
        int j1 = j;
        if (i < 0)
        {
            i1 = i + numrows;
            j1 = j + (4 - (numrows + 4) % 8);
        }
        j = i1;
        i = j1;
        if (j1 < 0)
        {
            i = j1 + numcols;
            j = i1 + (4 - (numcols + 4) % 8);
        }
        if ((codewords.charAt(k) & 1 << 8 - l) == 0)
        {
            flag = false;
        }
        setBit(i, j, flag);
    }

    private void utah(int i, int j, int k)
    {
        module(i - 2, j - 2, k, 1);
        module(i - 2, j - 1, k, 2);
        module(i - 1, j - 2, k, 3);
        module(i - 1, j - 1, k, 4);
        module(i - 1, j, k, 5);
        module(i, j - 2, k, 6);
        module(i, j - 1, k, 7);
        module(i, j, k, 8);
    }

    public final boolean getBit(int i, int j)
    {
        return bits[numcols * j + i] == 1;
    }

    final byte[] getBits()
    {
        return bits;
    }

    final int getNumcols()
    {
        return numcols;
    }

    final int getNumrows()
    {
        return numrows;
    }

    final boolean hasBit(int i, int j)
    {
        return bits[numcols * j + i] >= 0;
    }

    public final void place()
    {
        int l = 0;
        int j = 4;
        int k = 0;
        int j1;
        do
        {
            int i;
            int i1;
            do
            {
                i = l;
                if (j == numrows)
                {
                    i = l;
                    if (k == 0)
                    {
                        corner1(l);
                        i = l + 1;
                    }
                }
                i1 = i;
                if (j == numrows - 2)
                {
                    i1 = i;
                    if (k == 0)
                    {
                        i1 = i;
                        if (numcols % 4 != 0)
                        {
                            corner2(i);
                            i1 = i + 1;
                        }
                    }
                }
                l = i1;
                if (j == numrows - 2)
                {
                    l = i1;
                    if (k == 0)
                    {
                        l = i1;
                        if (numcols % 8 == 4)
                        {
                            corner3(i1);
                            l = i1 + 1;
                        }
                    }
                }
                j1 = k;
                i = l;
                i1 = j;
                if (j == numrows + 4)
                {
                    j1 = k;
                    i = l;
                    i1 = j;
                    if (k == 2)
                    {
                        j1 = k;
                        i = l;
                        i1 = j;
                        if (numcols % 8 == 0)
                        {
                            corner4(l);
                            i = l + 1;
                            i1 = j;
                            j1 = k;
                        }
                    }
                }
                do
                {
                    j = i;
                    if (i1 < numrows)
                    {
                        j = i;
                        if (j1 >= 0)
                        {
                            j = i;
                            if (!hasBit(j1, i1))
                            {
                                utah(i1, j1, i);
                                j = i + 1;
                            }
                        }
                    }
                    l = i1 - 2;
                    k = j1 + 2;
                    if (l < 0)
                    {
                        break;
                    }
                    j1 = k;
                    i = j;
                    i1 = l;
                } while (k < numcols);
                i1 = l + 1;
                l = k + 3;
                i = j;
                k = i1;
                j = l;
                do
                {
                    if (k >= 0 && j < numcols && !hasBit(j, k))
                    {
                        l = i + 1;
                        utah(k, j, i);
                        i = l;
                    }
                    k += 2;
                    j -= 2;
                } while (k < numrows && j >= 0);
                i1 = k + 3;
                j1 = j + 1;
                k = j1;
                l = i;
                j = i1;
            } while (i1 < numrows);
            k = j1;
            l = i;
            j = i1;
        } while (j1 < numcols);
        if (!hasBit(numcols - 1, numrows - 1))
        {
            setBit(numcols - 1, numrows - 1, true);
            setBit(numcols - 2, numrows - 2, true);
        }
    }

    final void setBit(int i, int j, boolean flag)
    {
        byte abyte0[] = bits;
        int k = numcols;
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        abyte0[k * j + i] = byte0;
    }
}
