// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.util.Log;
import android.util.SparseBooleanArray;

// Referenced classes of package android.support.v7.util:
//            AsyncListUtil

class this._cls0
    implements roundCallback
{

    private int mFirstRequiredTileStart;
    private int mGeneration;
    private int mItemCount;
    private int mLastRequiredTileStart;
    final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
    private ileSize mRecycledRoot;
    final AsyncListUtil this$0;

    private roundCallback acquireTile()
    {
        if (mRecycledRoot != null)
        {
            roundCallback roundcallback = mRecycledRoot;
            mRecycledRoot = mRecycledRoot.ext;
            return roundcallback;
        } else
        {
            return new nit>(mTClass, mTileSize);
        }
    }

    private void addTile(ileSize ilesize)
    {
        mLoadedTiles.put(ilesize.tartPosition, true);
        mMainThreadProxy.addTile(mGeneration, ilesize);
    }

    private void flushTileCache(int i)
    {
        int j = mDataCallback.getMaxCachedTiles();
        do
        {
            if (mLoadedTiles.size() < j)
            {
                break;
            }
            int k = mLoadedTiles.keyAt(0);
            int l = mLoadedTiles.keyAt(mLoadedTiles.size() - 1);
            int i1 = mFirstRequiredTileStart - k;
            int j1 = l - mLastRequiredTileStart;
            if (i1 > 0 && (i1 >= j1 || i == 2))
            {
                removeTile(k);
                continue;
            }
            if (j1 <= 0 || i1 >= j1 && i != 1)
            {
                break;
            }
            removeTile(l);
        } while (true);
    }

    private int getTileStart(int i)
    {
        return i - i % mTileSize;
    }

    private boolean isTileLoaded(int i)
    {
        return mLoadedTiles.get(i);
    }

    private transient void log(String s, Object aobj[])
    {
        Log.d("AsyncListUtil", (new StringBuilder()).append("[BKGR] ").append(String.format(s, aobj)).toString());
    }

    private void removeTile(int i)
    {
        mLoadedTiles.delete(i);
        mMainThreadProxy.removeTile(mGeneration, i);
    }

    private void requestTiles(int i, int j, int k, boolean flag)
    {
        int l = i;
        while (l <= j) 
        {
            int i1;
            if (flag)
            {
                i1 = (j + i) - l;
            } else
            {
                i1 = l;
            }
            mBackgroundProxy.loadTile(i1, k);
            l += mTileSize;
        }
    }

    public void loadTile(int i, int j)
    {
        if (isTileLoaded(i))
        {
            return;
        } else
        {
            ileSize ilesize = acquireTile();
            ilesize.tartPosition = i;
            ilesize.temCount = Math.min(mTileSize, mItemCount - ilesize.tartPosition);
            mDataCallback.fillData(ilesize.tems, ilesize.tartPosition, ilesize.temCount);
            flushTileCache(j);
            addTile(ilesize);
            return;
        }
    }

    public void recycleTile(addTile addtile)
    {
        mDataCallback.recycleData(addtile.tems, addtile.temCount);
        addtile.ext = mRecycledRoot;
        mRecycledRoot = addtile;
    }

    public void refresh(int i)
    {
        mGeneration = i;
        mLoadedTiles.clear();
        mItemCount = mDataCallback.refreshData();
        mMainThreadProxy.updateItemCount(mGeneration, mItemCount);
    }

    public void updateRange(int i, int j, int k, int l, int i1)
    {
        if (i > j)
        {
            return;
        }
        i = getTileStart(i);
        j = getTileStart(j);
        mFirstRequiredTileStart = getTileStart(k);
        mLastRequiredTileStart = getTileStart(l);
        if (i1 == 1)
        {
            requestTiles(mFirstRequiredTileStart, j, i1, true);
            requestTiles(mTileSize + j, mLastRequiredTileStart, i1, false);
            return;
        } else
        {
            requestTiles(i, mLastRequiredTileStart, i1, false);
            requestTiles(mFirstRequiredTileStart, i - mTileSize, i1, true);
            return;
        }
    }

    taCallback()
    {
        this$0 = AsyncListUtil.this;
        super();
    }
}
