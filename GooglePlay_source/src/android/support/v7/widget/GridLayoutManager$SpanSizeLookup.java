// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.widget:
//            GridLayoutManager

public static abstract class mCacheSpanIndices
{

    private boolean mCacheSpanIndices;
    final SparseIntArray mSpanIndexCache = new SparseIntArray();

    public final int getSpanGroupIndex(int i, int j)
    {
        int k = 0;
        int l = 0;
        int i2 = getSpanSize(i);
        int j1 = 0;
        while (j1 < i) 
        {
            int k1 = getSpanSize(j1);
            int l1 = k + k1;
            int i1;
            if (l1 == j)
            {
                k = 0;
                i1 = l + 1;
            } else
            {
                i1 = l;
                k = l1;
                if (l1 > j)
                {
                    k = k1;
                    i1 = l + 1;
                }
            }
            j1++;
            l = i1;
        }
        i = l;
        if (k + i2 > j)
        {
            i = l + 1;
        }
        return i;
    }

    public int getSpanIndex(int i, int j)
    {
        int k1 = getSpanSize(i);
        if (k1 == j)
        {
            i = 0;
        } else
        {
            int k = 0;
            int l = 0;
            while (l < i) 
            {
                int i1 = getSpanSize(l);
                int j1 = k + i1;
                if (j1 == j)
                {
                    k = 0;
                } else
                {
                    k = j1;
                    if (j1 > j)
                    {
                        k = i1;
                    }
                }
                l++;
            }
            i = k;
            if (k + k1 > j)
            {
                return 0;
            }
        }
        return i;
    }

    public abstract int getSpanSize(int i);

    public ()
    {
        mCacheSpanIndices = false;
    }
}
