// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;

class ViewInfoStore
{
    static class InfoRecord
    {

        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(20);
        int flags;
        RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        static void drainCache()
        {
            while (sPool.acquire() != null) ;
        }

        static InfoRecord obtain()
        {
            InfoRecord inforecord1 = (InfoRecord)sPool.acquire();
            InfoRecord inforecord = inforecord1;
            if (inforecord1 == null)
            {
                inforecord = new InfoRecord();
            }
            return inforecord;
        }

        static void recycle(InfoRecord inforecord)
        {
            inforecord.flags = 0;
            inforecord.preInfo = null;
            inforecord.postInfo = null;
            sPool.release(inforecord);
        }


        private InfoRecord()
        {
        }
    }

    static interface ProcessCallback
    {

        public abstract void processAppeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

        public abstract void processDisappeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

        public abstract void processPersistent(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

        public abstract void unused(RecyclerView.ViewHolder viewholder);
    }


    private static final boolean DEBUG = false;
    final ArrayMap mLayoutHolderMap = new ArrayMap();
    final LongSparseArray mOldChangedHolders = new LongSparseArray();

    ViewInfoStore()
    {
    }

    void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
    {
        InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(viewholder);
        InfoRecord inforecord = inforecord1;
        if (inforecord1 == null)
        {
            inforecord = InfoRecord.obtain();
            mLayoutHolderMap.put(viewholder, inforecord);
        }
        inforecord.flags = inforecord.flags | 2;
        inforecord.preInfo = itemholderinfo;
    }

    void addToDisappearedInLayout(RecyclerView.ViewHolder viewholder)
    {
        InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(viewholder);
        InfoRecord inforecord = inforecord1;
        if (inforecord1 == null)
        {
            inforecord = InfoRecord.obtain();
            mLayoutHolderMap.put(viewholder, inforecord);
        }
        inforecord.flags = inforecord.flags | 1;
    }

    void addToOldChangeHolders(long l, RecyclerView.ViewHolder viewholder)
    {
        mOldChangedHolders.put(l, viewholder);
    }

    void addToPostLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
    {
        InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(viewholder);
        InfoRecord inforecord = inforecord1;
        if (inforecord1 == null)
        {
            inforecord = InfoRecord.obtain();
            mLayoutHolderMap.put(viewholder, inforecord);
        }
        inforecord.postInfo = itemholderinfo;
        inforecord.flags = inforecord.flags | 8;
    }

    void addToPreLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
    {
        InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(viewholder);
        InfoRecord inforecord = inforecord1;
        if (inforecord1 == null)
        {
            inforecord = InfoRecord.obtain();
            mLayoutHolderMap.put(viewholder, inforecord);
        }
        inforecord.preInfo = itemholderinfo;
        inforecord.flags = inforecord.flags | 4;
    }

    void clear()
    {
        mLayoutHolderMap.clear();
        mOldChangedHolders.clear();
    }

    RecyclerView.ViewHolder getFromOldChangeHolders(long l)
    {
        return (RecyclerView.ViewHolder)mOldChangedHolders.get(l);
    }

    boolean isInPreLayout(RecyclerView.ViewHolder viewholder)
    {
        viewholder = (InfoRecord)mLayoutHolderMap.get(viewholder);
        return viewholder != null && (((InfoRecord) (viewholder)).flags & 4) != 0;
    }

    void onDetach()
    {
        InfoRecord.drainCache();
    }

    RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewholder)
    {
        int i = mLayoutHolderMap.indexOfKey(viewholder);
        if (i < 0)
        {
            return null;
        }
        viewholder = (InfoRecord)mLayoutHolderMap.valueAt(i);
        if (viewholder != null && (((InfoRecord) (viewholder)).flags & 4) != 0)
        {
            viewholder.flags = ((InfoRecord) (viewholder)).flags & -5;
            RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo = ((InfoRecord) (viewholder)).preInfo;
            if (((InfoRecord) (viewholder)).flags == 0)
            {
                mLayoutHolderMap.removeAt(i);
                InfoRecord.recycle(viewholder);
            }
            return itemholderinfo;
        } else
        {
            return null;
        }
    }

    void process(ProcessCallback processcallback)
    {
        int i = mLayoutHolderMap.size() - 1;
        while (i >= 0) 
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)mLayoutHolderMap.keyAt(i);
            InfoRecord inforecord = (InfoRecord)mLayoutHolderMap.removeAt(i);
            if ((inforecord.flags & 3) == 3)
            {
                processcallback.unused(viewholder);
            } else
            if ((inforecord.flags & 1) != 0)
            {
                processcallback.processDisappeared(viewholder, inforecord.preInfo, inforecord.postInfo);
            } else
            if ((inforecord.flags & 0xe) == 14)
            {
                processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
            } else
            if ((inforecord.flags & 0xc) == 12)
            {
                processcallback.processPersistent(viewholder, inforecord.preInfo, inforecord.postInfo);
            } else
            if ((inforecord.flags & 4) != 0)
            {
                processcallback.processDisappeared(viewholder, inforecord.preInfo, null);
            } else
            if ((inforecord.flags & 8) != 0)
            {
                processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
            } else
            if ((inforecord.flags & 2) == 0);
            InfoRecord.recycle(inforecord);
            i--;
        }
    }

    void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewholder)
    {
        viewholder = (InfoRecord)mLayoutHolderMap.get(viewholder);
        if (viewholder == null)
        {
            return;
        } else
        {
            viewholder.flags = ((InfoRecord) (viewholder)).flags & -2;
            return;
        }
    }

    void removeViewHolder(RecyclerView.ViewHolder viewholder)
    {
        int i = mOldChangedHolders.size() - 1;
        do
        {
label0:
            {
                if (i >= 0)
                {
                    if (viewholder != mOldChangedHolders.valueAt(i))
                    {
                        break label0;
                    }
                    mOldChangedHolders.removeAt(i);
                }
                viewholder = (InfoRecord)mLayoutHolderMap.remove(viewholder);
                if (viewholder != null)
                {
                    InfoRecord.recycle(viewholder);
                }
                return;
            }
            i--;
        } while (true);
    }
}
