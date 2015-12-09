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

    int findReferenceIndexFromCache(int i)
    {
        int j = 0;
        for (int k = mSpanIndexCache.size() - 1; j <= k;)
        {
            int l = j + k >>> 1;
            if (mSpanIndexCache.keyAt(l) < i)
            {
                j = l + 1;
            } else
            {
                k = l - 1;
            }
        }

        i = j - 1;
        if (i >= 0 && i < mSpanIndexCache.size())
        {
            return mSpanIndexCache.keyAt(i);
        } else
        {
            return -1;
        }
    }

    int getCachedSpanIndex(int i, int j)
    {
        int k;
        if (!mCacheSpanIndices)
        {
            k = getSpanIndex(i, j);
        } else
        {
            int l = mSpanIndexCache.get(i, -1);
            k = l;
            if (l == -1)
            {
                j = getSpanIndex(i, j);
                mSpanIndexCache.put(i, j);
                return j;
            }
        }
        return k;
    }

    public int getSpanGroupIndex(int i, int j)
    {
        int l1 = getSpanSize(i);
        int i1 = 0;
        int k = 0;
        int l = 0;
        while (i1 < i) 
        {
            int j1 = getSpanSize(i1);
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

    public int getSpanIndex(int i, int j)
    {
        int k1 = getSpanSize(i);
        if (k1 != j) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int k;
        int l;
        if (!mCacheSpanIndices || mSpanIndexCache.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l = findReferenceIndexFromCache(i);
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        k = mSpanIndexCache.get(l) + getSpanSize(l);
        l++;
_L4:
        do
        {
            if (l >= i)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i1 = getSpanSize(l);
            int j1 = k + i1;
            if (j1 == j)
            {
                k = 0;
            } else
            {
                k = i1;
                if (j1 <= j)
                {
                    k = j1;
                }
            }
            l++;
        } while (true);
        if (k + k1 > j) goto _L1; else goto _L3
_L3:
        return k;
        l = 0;
        k = 0;
          goto _L4
    }

    public abstract int getSpanSize(int i);

    public void invalidateSpanIndexCache()
    {
        mSpanIndexCache.clear();
    }

    public boolean isSpanIndexCacheEnabled()
    {
        return mCacheSpanIndices;
    }

    public void setSpanIndexCacheEnabled(boolean flag)
    {
        mCacheSpanIndices = flag;
    }

    public ()
    {
        mCacheSpanIndices = false;
    }
}
