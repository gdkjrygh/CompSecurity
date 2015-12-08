// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.widget:
//            GridLayoutManager

public static abstract class 
{

    final SparseIntArray a = new SparseIntArray();

    public abstract int a(int i);

    public int a(int i, int j)
    {
        int k1 = a(i);
        if (k1 != j) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int k;
        int l;
        l = 0;
        k = 0;
_L4:
        int i1;
        int j1;
        if (l >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = a(l);
        j1 = k + i1;
        if (j1 != j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
_L5:
        l++;
        if (true) goto _L4; else goto _L3
_L3:
        k = i1;
        if (j1 <= j)
        {
            k = j1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        if (k + k1 > j) goto _L1; else goto _L7
_L7:
        return k;
    }

    public final int b(int i, int j)
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

    public ()
    {
    }
}
