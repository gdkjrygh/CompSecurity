// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.util;

import com.google.common.base.Preconditions;

public final class MoreArrays
{

    public static boolean equals(byte abyte0[], int i, byte abyte1[], int j, int k)
        throws IndexOutOfBoundsException, IllegalArgumentException
    {
        int l = i + k;
        if (k > 0)
        {
            Preconditions.checkPositionIndexes(i, l - 1, abyte0.length);
            Preconditions.checkPositionIndexes(j, (j + k) - 1, abyte1.length);
        } else
        {
            boolean flag;
            if (k == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "len may not be negative: %s", new Object[] {
                Integer.valueOf(k)
            });
            if (abyte0.length > 0)
            {
                Preconditions.checkElementIndex(i, abyte0.length, String.format("base1 is out of bounds: base1=%s, a1.length=%s", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(abyte0.length)
                }));
            } else
            {
                boolean flag1;
                if (i == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkArgument(flag1, "base1 must be zero for zero-length array: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (abyte1.length > 0)
            {
                Preconditions.checkElementIndex(j, abyte1.length, String.format("base2 is out of bounds: base2=%s, a2.length=%s", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(abyte1.length)
                }));
            } else
            {
                boolean flag2;
                if (j == 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Preconditions.checkArgument(flag2, "base2 must be zero for zero-length array: %s", new Object[] {
                    Integer.valueOf(j)
                });
            }
        }
        while (i < l) 
        {
            if (abyte0[i] != abyte1[j])
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
