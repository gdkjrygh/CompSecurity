// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class t
{

    final SparseIntArray a = new SparseIntArray();
    private boolean b;

    public t()
    {
        b = false;
    }

    public abstract int a(int i);

    public int a(int i, int j)
    {
        int i2 = a(i);
        if (i2 != j) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int k;
        int l;
        if (!b || a.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        l = a.size() - 1;
        for (k = 0; k <= l;)
        {
            int i1 = k + l >>> 1;
            if (a.keyAt(i1) < i)
            {
                k = i1 + 1;
            } else
            {
                l = i1 - 1;
            }
        }

        k--;
        int j1;
        if (k >= 0 && k < a.size())
        {
            k = a.keyAt(k);
        } else
        {
            k = -1;
        }
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        l = a.get(k) + a(k);
        j1 = k + 1;
        k = l;
        l = j1;
_L4:
        do
        {
            if (l >= i)
            {
                continue; /* Loop/switch isn't completed */
            }
            int k1 = a(l);
            int l1 = k + k1;
            if (l1 == j)
            {
                k = 0;
            } else
            {
                k = k1;
                if (l1 <= j)
                {
                    k = l1;
                }
            }
            l++;
        } while (true);
        if (k + i2 > j) goto _L1; else goto _L3
_L3:
        return k;
        l = 0;
        k = 0;
          goto _L4
    }

    final int b(int i, int j)
    {
        int k;
        if (!b)
        {
            k = a(i, j);
        } else
        {
            int l = a.get(i, -1);
            k = l;
            if (l == -1)
            {
                j = a(i, j);
                a.put(i, j);
                return j;
            }
        }
        return k;
    }

    public final int c(int i, int j)
    {
        int l1 = a(i);
        int i1 = 0;
        int k = 0;
        int l = 0;
        while (i1 < i) 
        {
            int j1 = a(i1);
            l += j1;
            if (l == j)
            {
                l = k + 1;
                k = 0;
            } else
            if (l > j)
            {
                l = k + 1;
                k = j1;
            } else
            {
                int k1 = l;
                l = k;
                k = k1;
            }
            j1 = i1 + 1;
            i1 = k;
            k = l;
            l = i1;
            i1 = j1;
        }
        i = k;
        if (l + l1 > j)
        {
            i = k + 1;
        }
        return i;
    }
}
