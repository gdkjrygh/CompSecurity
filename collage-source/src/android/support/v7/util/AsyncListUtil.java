// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.util:
//            TileList, MessageThreadUtil, ThreadUtil

public class AsyncListUtil
{
    public static abstract class DataCallback
    {

        public abstract void fillData(Object aobj[], int i, int j);

        public int getMaxCachedTiles()
        {
            return 10;
        }

        public void recycleData(Object aobj[], int i)
        {
        }

        public abstract int refreshData();

        public DataCallback()
        {
        }
    }

    public static abstract class ViewCallback
    {

        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public void extendRangeInto(int ai[], int ai1[], int i)
        {
            int j = (ai[1] - ai[0]) + 1;
            int k = j / 2;
            int i1 = ai[0];
            int l;
            if (i == 1)
            {
                l = j;
            } else
            {
                l = k;
            }
            ai1[0] = i1 - l;
            l = ai[1];
            if (i != 2)
            {
                j = k;
            }
            ai1[1] = l + j;
        }

        public abstract void getItemRangeInto(int ai[]);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);

        public ViewCallback()
        {
        }
    }


    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncListUtil";
    private boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback mBackgroundCallback = new ThreadUtil.BackgroundCallback() {

        private int mFirstRequiredTileStart;
        private int mGeneration;
        private int mItemCount;
        private int mLastRequiredTileStart;
        final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
        private TileList.Tile mRecycledRoot;
        final AsyncListUtil this$0;

        private TileList.Tile acquireTile()
        {
            if (mRecycledRoot != null)
            {
                TileList.Tile tile = mRecycledRoot;
                mRecycledRoot = mRecycledRoot.mNext;
                return tile;
            } else
            {
                return new TileList.Tile(mTClass, mTileSize);
            }
        }

        private void addTile(TileList.Tile tile)
        {
            mLoadedTiles.put(tile.mStartPosition, true);
            mMainThreadProxy.addTile(mGeneration, tile);
        }

        private void flushTileCache(int j)
        {
            int k = mDataCallback.getMaxCachedTiles();
            do
            {
                if (mLoadedTiles.size() < k)
                {
                    break;
                }
                int l = mLoadedTiles.keyAt(0);
                int i1 = mLoadedTiles.keyAt(mLoadedTiles.size() - 1);
                int j1 = mFirstRequiredTileStart - l;
                int k1 = i1 - mLastRequiredTileStart;
                if (j1 > 0 && (j1 >= k1 || j == 2))
                {
                    removeTile(l);
                    continue;
                }
                if (k1 <= 0 || j1 >= k1 && j != 1)
                {
                    break;
                }
                removeTile(i1);
            } while (true);
        }

        private int getTileStart(int j)
        {
            return j - j % mTileSize;
        }

        private boolean isTileLoaded(int j)
        {
            return mLoadedTiles.get(j);
        }

        private transient void log(String s, Object aobj[])
        {
            Log.d("AsyncListUtil", (new StringBuilder()).append("[BKGR] ").append(String.format(s, aobj)).toString());
        }

        private void removeTile(int j)
        {
            mLoadedTiles.delete(j);
            mMainThreadProxy.removeTile(mGeneration, j);
        }

        private void requestTiles(int j, int k, int l, boolean flag)
        {
            int i1 = j;
            while (i1 <= k) 
            {
                int j1;
                if (flag)
                {
                    j1 = (k + j) - i1;
                } else
                {
                    j1 = i1;
                }
                mBackgroundProxy.loadTile(j1, l);
                i1 += mTileSize;
            }
        }

        public void loadTile(int j, int k)
        {
            if (isTileLoaded(j))
            {
                return;
            } else
            {
                TileList.Tile tile = acquireTile();
                tile.mStartPosition = j;
                tile.mItemCount = Math.min(mTileSize, mItemCount - tile.mStartPosition);
                mDataCallback.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
                flushTileCache(k);
                addTile(tile);
                return;
            }
        }

        public void recycleTile(TileList.Tile tile)
        {
            mDataCallback.recycleData(tile.mItems, tile.mItemCount);
            tile.mNext = mRecycledRoot;
            mRecycledRoot = tile;
        }

        public void refresh(int j)
        {
            mGeneration = j;
            mLoadedTiles.clear();
            mItemCount = mDataCallback.refreshData();
            mMainThreadProxy.updateItemCount(mGeneration, mItemCount);
        }

        public void updateRange(int j, int k, int l, int i1, int j1)
        {
            if (j > k)
            {
                return;
            }
            j = getTileStart(j);
            k = getTileStart(k);
            mFirstRequiredTileStart = getTileStart(l);
            mLastRequiredTileStart = getTileStart(i1);
            if (j1 == 1)
            {
                requestTiles(mFirstRequiredTileStart, k, j1, true);
                requestTiles(mTileSize + k, mLastRequiredTileStart, j1, false);
                return;
            } else
            {
                requestTiles(j, mLastRequiredTileStart, j1, false);
                requestTiles(mFirstRequiredTileStart, j - mTileSize, j1, true);
                return;
            }
        }

            
            {
                this$0 = AsyncListUtil.this;
                super();
            }
    };
    final ThreadUtil.BackgroundCallback mBackgroundProxy;
    final DataCallback mDataCallback;
    int mDisplayedGeneration;
    private int mItemCount;
    private final ThreadUtil.MainThreadCallback mMainThreadCallback = new ThreadUtil.MainThreadCallback() {

        final AsyncListUtil this$0;

        private boolean isRequestedGeneration(int j)
        {
            return j == mRequestedGeneration;
        }

        private void recycleAllTiles()
        {
            for (int j = 0; j < mTileList.size(); j++)
            {
                mBackgroundProxy.recycleTile(mTileList.getAtIndex(j));
            }

            mTileList.clear();
        }

        public void addTile(int j, TileList.Tile tile)
        {
            if (!isRequestedGeneration(j))
            {
                mBackgroundProxy.recycleTile(tile);
            } else
            {
                TileList.Tile tile1 = mTileList.addOrReplace(tile);
                if (tile1 != null)
                {
                    Log.e("AsyncListUtil", (new StringBuilder()).append("duplicate tile @").append(tile1.mStartPosition).toString());
                    mBackgroundProxy.recycleTile(tile1);
                }
                int k = tile.mStartPosition;
                int l = tile.mItemCount;
                j = 0;
                while (j < mMissingPositions.size()) 
                {
                    int i1 = mMissingPositions.keyAt(j);
                    if (tile.mStartPosition <= i1 && i1 < l + k)
                    {
                        mMissingPositions.removeAt(j);
                        mViewCallback.onItemLoaded(i1);
                    } else
                    {
                        j++;
                    }
                }
            }
        }

        public void removeTile(int j, int k)
        {
            if (!isRequestedGeneration(j))
            {
                return;
            }
            TileList.Tile tile = mTileList.removeAtPos(k);
            if (tile == null)
            {
                Log.e("AsyncListUtil", (new StringBuilder()).append("tile not found @").append(k).toString());
                return;
            } else
            {
                mBackgroundProxy.recycleTile(tile);
                return;
            }
        }

        public void updateItemCount(int j, int k)
        {
            if (!isRequestedGeneration(j))
            {
                return;
            } else
            {
                mItemCount = k;
                mViewCallback.onDataRefresh();
                mDisplayedGeneration = mRequestedGeneration;
                recycleAllTiles();
                mAllowScrollHints = false;
                updateRange();
                return;
            }
        }

            
            {
                this$0 = AsyncListUtil.this;
                super();
            }
    };
    final ThreadUtil.MainThreadCallback mMainThreadProxy;
    private final SparseIntArray mMissingPositions = new SparseIntArray();
    final int mPrevRange[] = new int[2];
    int mRequestedGeneration;
    private int mScrollHint;
    final Class mTClass;
    final TileList mTileList;
    final int mTileSize;
    final int mTmpRange[] = new int[2];
    final int mTmpRangeExtended[] = new int[2];
    final ViewCallback mViewCallback;

    public AsyncListUtil(Class class1, int i, DataCallback datacallback, ViewCallback viewcallback)
    {
        mScrollHint = 0;
        mItemCount = 0;
        mDisplayedGeneration = 0;
        mRequestedGeneration = mDisplayedGeneration;
        mTClass = class1;
        mTileSize = i;
        mDataCallback = datacallback;
        mViewCallback = viewcallback;
        mTileList = new TileList(mTileSize);
        class1 = new MessageThreadUtil();
        mMainThreadProxy = class1.getMainThreadProxy(mMainThreadCallback);
        mBackgroundProxy = class1.getBackgroundProxy(mBackgroundCallback);
        refresh();
    }

    private boolean isRefreshPending()
    {
        return mRequestedGeneration != mDisplayedGeneration;
    }

    private transient void log(String s, Object aobj[])
    {
        Log.d("AsyncListUtil", (new StringBuilder()).append("[MAIN] ").append(String.format(s, aobj)).toString());
    }

    private void updateRange()
    {
        mViewCallback.getItemRangeInto(mTmpRange);
        while (mTmpRange[0] > mTmpRange[1] || mTmpRange[0] < 0 || mTmpRange[1] >= mItemCount) 
        {
            return;
        }
        if (mAllowScrollHints) goto _L2; else goto _L1
_L1:
        mScrollHint = 0;
_L4:
        mPrevRange[0] = mTmpRange[0];
        mPrevRange[1] = mTmpRange[1];
        mViewCallback.extendRangeInto(mTmpRange, mTmpRangeExtended, mScrollHint);
        mTmpRangeExtended[0] = Math.min(mTmpRange[0], Math.max(mTmpRangeExtended[0], 0));
        mTmpRangeExtended[1] = Math.max(mTmpRange[1], Math.min(mTmpRangeExtended[1], mItemCount - 1));
        mBackgroundProxy.updateRange(mTmpRange[0], mTmpRange[1], mTmpRangeExtended[0], mTmpRangeExtended[1], mScrollHint);
        return;
_L2:
        if (mTmpRange[0] > mPrevRange[1] || mPrevRange[0] > mTmpRange[1])
        {
            mScrollHint = 0;
        } else
        if (mTmpRange[0] < mPrevRange[0])
        {
            mScrollHint = 1;
        } else
        if (mTmpRange[0] > mPrevRange[0])
        {
            mScrollHint = 2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object getItem(int i)
    {
        if (i < 0 || i >= mItemCount)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append(i).append(" is not within 0 and ").append(mItemCount).toString());
        }
        Object obj = mTileList.getItemAt(i);
        if (obj == null && !isRefreshPending())
        {
            mMissingPositions.put(i, 0);
        }
        return obj;
    }

    public int getItemCount()
    {
        return mItemCount;
    }

    public void onRangeChanged()
    {
        if (isRefreshPending())
        {
            return;
        } else
        {
            updateRange();
            mAllowScrollHints = true;
            return;
        }
    }

    public void refresh()
    {
        mMissingPositions.clear();
        ThreadUtil.BackgroundCallback backgroundcallback = mBackgroundProxy;
        int i = mRequestedGeneration + 1;
        mRequestedGeneration = i;
        backgroundcallback.refresh(i);
    }


/*
    static int access$002(AsyncListUtil asynclistutil, int i)
    {
        asynclistutil.mItemCount = i;
        return i;
    }

*/


/*
    static boolean access$102(AsyncListUtil asynclistutil, boolean flag)
    {
        asynclistutil.mAllowScrollHints = flag;
        return flag;
    }

*/


}
