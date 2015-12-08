// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.util.SparseArray;
import java.lang.reflect.Array;

class TileList
{
    public static class Tile
    {

        public int mItemCount;
        public final Object mItems[];
        Tile mNext;
        public int mStartPosition;

        boolean containsPosition(int i)
        {
            return mStartPosition <= i && i < mStartPosition + mItemCount;
        }

        Object getByPosition(int i)
        {
            return mItems[i - mStartPosition];
        }

        public Tile(Class class1, int i)
        {
            mItems = (Object[])(Object[])Array.newInstance(class1, i);
        }
    }


    Tile mLastAccessedTile;
    final int mTileSize;
    private final SparseArray mTiles = new SparseArray(10);

    public TileList(int i)
    {
        mTileSize = i;
    }

    public Tile addOrReplace(Tile tile)
    {
        int i = mTiles.indexOfKey(tile.mStartPosition);
        Tile tile1;
        if (i < 0)
        {
            mTiles.put(tile.mStartPosition, tile);
            tile1 = null;
        } else
        {
            Tile tile2 = (Tile)mTiles.valueAt(i);
            mTiles.setValueAt(i, tile);
            tile1 = tile2;
            if (mLastAccessedTile == tile2)
            {
                mLastAccessedTile = tile;
                return tile2;
            }
        }
        return tile1;
    }

    public void clear()
    {
        mTiles.clear();
    }

    public Tile getAtIndex(int i)
    {
        return (Tile)mTiles.valueAt(i);
    }

    public Object getItemAt(int i)
    {
        if (mLastAccessedTile == null || !mLastAccessedTile.containsPosition(i))
        {
            int j = mTileSize;
            j = mTiles.indexOfKey(i - i % j);
            if (j < 0)
            {
                return null;
            }
            mLastAccessedTile = (Tile)mTiles.valueAt(j);
        }
        return mLastAccessedTile.getByPosition(i);
    }

    public Tile removeAtPos(int i)
    {
        Tile tile = (Tile)mTiles.get(i);
        if (mLastAccessedTile == tile)
        {
            mLastAccessedTile = null;
        }
        mTiles.delete(i);
        return tile;
    }

    public int size()
    {
        return mTiles.size();
    }
}
