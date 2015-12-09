// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferObserver;
import com.google.android.gms.common.data.DataBufferUtils;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesRecyclerAdapter, ClearableAdapter, LogflowEventListener, GamesFragmentActivity

public abstract class DatabufferRecyclerAdapter extends GamesRecyclerAdapter
    implements android.view.View.OnClickListener, DataBufferObserver, ClearableAdapter
{
    private static final class CachedInfo
    {

        public int count;
        public int dataCount;
        public boolean hadNext;
        public boolean hadPrev;

        private CachedInfo()
        {
        }

        CachedInfo(byte byte0)
        {
            this();
        }
    }

    private static final class DatabufferHeaderFooterViewHolder extends DatabufferViewHolder
    {

        private final View mProgressBar;
        private final View mRetry;

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            boolean flag1 = false;
            boolean flag = false;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (DatabufferRecyclerAdapter)mAdapter;
            int j = getLocalPosition();
            if (gamesrecycleradapter.isPrevPageHeader(j))
            {
                obj = mProgressBar;
                if (((DatabufferRecyclerAdapter) (gamesrecycleradapter)).mIsPrevPageInRetry)
                {
                    i = 8;
                } else
                {
                    i = 0;
                }
                ((View) (obj)).setVisibility(i);
                obj = mRetry;
                if (((DatabufferRecyclerAdapter) (gamesrecycleradapter)).mIsPrevPageInRetry)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                ((View) (obj)).setVisibility(i);
            } else
            if (gamesrecycleradapter.isNextPageFooter(j))
            {
                obj = mProgressBar;
                if (((DatabufferRecyclerAdapter) (gamesrecycleradapter)).mIsNextPageInRetry)
                {
                    i = 8;
                } else
                {
                    i = 0;
                }
                ((View) (obj)).setVisibility(i);
                obj = mRetry;
                if (((DatabufferRecyclerAdapter) (gamesrecycleradapter)).mIsNextPageInRetry)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                ((View) (obj)).setVisibility(i);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Given position is not a footer or a header: ")).append(j).toString());
            }
            mRetry.setOnClickListener(gamesrecycleradapter);
            mRetry.setTag(Integer.valueOf(j));
        }

        public DatabufferHeaderFooterViewHolder(View view)
        {
            super(view);
            mProgressBar = itemView.findViewById(0x7f0d00e4);
            mRetry = itemView.findViewById(0x7f0d0225);
        }
    }

    public static abstract class DatabufferViewHolder extends GamesRecyclerAdapter.GamesRecyclerViewHolder
    {

        private Object mData;

        public final Object getData()
        {
            if (mData instanceof Freezable)
            {
                if (((Freezable)mData).isDataValid())
                {
                    return mData;
                } else
                {
                    return null;
                }
            } else
            {
                return mData;
            }
        }

        public final DataBuffer getDataBuffer()
        {
            return ((DatabufferRecyclerAdapter)mAdapter).mDataBuffer;
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            super.populateViews(gamesrecycleradapter, i);
            mData = obj;
        }

        public final void repopulateViews()
        {
            populateViews(mAdapter, getLocalPosition(), getData());
        }

        public DatabufferViewHolder(View view)
        {
            super(view);
        }
    }

    public static interface OnEndOfWindowReachedListener
    {

        public abstract void onEndOfWindowReached(int i);
    }

    private static final class Range
    {

        public int mHigh;
        public int mLow;

        public final int getSize()
        {
            return mHigh - mLow;
        }

        public final boolean isEmpty()
        {
            return mLow >= mHigh;
        }

        public Range()
        {
            mLow = 0;
            mHigh = 0;
        }

        public Range(int i, int j)
        {
            mLow = i;
            mHigh = j;
        }
    }


    public final Context mContext;
    private int mCount;
    public DataBuffer mDataBuffer;
    public boolean mHasNext;
    private boolean mHasPrev;
    private boolean mHideIncompleteRowsForced;
    private boolean mHideIncompleteRowsFromLimiting;
    private boolean mHideIncompleteRowsWhenLimited;
    private boolean mHideIncompleteRowsWithNextFooter;
    public final LayoutInflater mInflater;
    private boolean mIsNextPageInRetry;
    private boolean mIsPaginationEnabled;
    private boolean mIsPrevPageInRetry;
    public int mMaxNumItems;
    public OnEndOfWindowReachedListener mOnEndOfWindowReachedListener;
    public int mStartOffset;
    private boolean mVisible;

    public DatabufferRecyclerAdapter(Context context)
    {
        mIsPaginationEnabled = true;
        mVisible = true;
        mHasNext = false;
        mHasPrev = false;
        mStartOffset = 0;
        mMaxNumItems = 0x7fffffff;
        mHideIncompleteRowsWhenLimited = true;
        mHideIncompleteRowsFromLimiting = false;
        mHideIncompleteRowsWithNextFooter = true;
        mHideIncompleteRowsForced = false;
        Asserts.checkState(context instanceof LogflowEventListener);
        mContext = context;
        mInflater = GamesFragmentActivity.getGamesLayoutInflater(context);
        mLogListener = (LogflowEventListener)mContext;
    }

    private void computeCount()
    {
        int i;
        boolean flag1;
        flag1 = false;
        i = 0;
        if (mDataBuffer != null) goto _L2; else goto _L1
_L1:
        mHasPrev = false;
        mHasNext = false;
        mCount = 0;
_L4:
        return;
_L2:
        boolean flag2;
        if (mIsPaginationEnabled && DataBufferUtils.hasPrevPage(mDataBuffer))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        mHasPrev = flag2;
        if (mIsPaginationEnabled && DataBufferUtils.hasNextPage(mDataBuffer))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        mHasNext = flag2;
        if (mDataBuffer != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        mCount = i;
        if (mHasPrev)
        {
            mCount = mCount + 1;
        }
        if (mHasNext)
        {
            mCount = mCount + 1;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag;
label0:
        {
            i = mDataBuffer.getCount() - mStartOffset;
            int j = i;
            if (i < 0)
            {
                j = 0;
            }
            i = j;
            if (mMaxNumItems != 0x7fffffff)
            {
                i = Math.min(mMaxNumItems, j);
            }
            if (!mHideIncompleteRowsFromLimiting)
            {
                flag = flag1;
                if (!mHideIncompleteRowsWithNextFooter)
                {
                    break label0;
                }
                flag = flag1;
                if (!mHasNext)
                {
                    break label0;
                }
            }
            flag = true;
        }
        int k = i;
        if (flag)
        {
            int l = getSpanCount();
            k = i;
            if (i > l)
            {
                l = i % l;
                k = i;
                if (l != 0)
                {
                    k = i - l;
                }
            }
        }
        i = k;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private CachedInfo createCachedInfo()
    {
        CachedInfo cachedinfo = new CachedInfo((byte)0);
        cachedinfo.hadPrev = mHasPrev;
        cachedinfo.hadNext = mHasNext;
        cachedinfo.count = getItemCount();
        cachedinfo.dataCount = getCachedDataCount();
        return cachedinfo;
    }

    private int getCachedDataCount()
    {
        int j = mCount;
        int i = j;
        if (mHasPrev)
        {
            i = j - 1;
        }
        j = i;
        if (mHasNext)
        {
            j = i - 1;
        }
        return j;
    }

    private boolean isNextPageFooter(int i)
    {
        return mHasNext && i == mCount - 1;
    }

    private boolean isPrevPageHeader(int i)
    {
        return mHasPrev && i == 0;
    }

    private void notifyHeaderFooterChanges(CachedInfo cachedinfo)
    {
        int j = cachedinfo.count;
        int i = j;
        if (cachedinfo.hadNext)
        {
            i = j;
            if (!mHasNext)
            {
                notifyItemRemoved(j - 1);
                i = j - 1;
            }
        }
        j = i;
        if (cachedinfo.hadPrev)
        {
            j = i;
            if (!mHasPrev)
            {
                notifyItemRemoved(0);
                j = i - 1;
            }
        }
        i = j;
        if (!cachedinfo.hadPrev)
        {
            i = j;
            if (mHasPrev)
            {
                notifyItemInserted(0);
                i = j + 1;
            }
        }
        if (!cachedinfo.hadNext && mHasNext)
        {
            notifyItemInserted(i);
        }
    }

    private void onEverythingChanged(CachedInfo cachedinfo)
    {
        onHeaderFooterLengthChanged(cachedinfo);
        int j;
        if (isVisible())
        {
            if ((j = Math.min(cachedinfo.dataCount, getCachedDataCount())) > 0)
            {
                int i;
                if (mHasPrev)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                notifyItemRangeChanged(i, j);
                return;
            }
        }
    }

    private void onHeaderFooterLengthChanged(CachedInfo cachedinfo)
    {
        computeCount();
        if (isVisible())
        {
            notifyHeaderFooterChanges(cachedinfo);
            int i;
            int j;
            if (mHasPrev)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = getCachedDataCount();
            if (j > cachedinfo.dataCount)
            {
                notifyItemRangeInserted(cachedinfo.dataCount + i, j - cachedinfo.dataCount);
                return;
            }
            if (j < cachedinfo.dataCount)
            {
                notifyItemRangeRemoved(j + i, cachedinfo.dataCount - j);
                return;
            }
        }
    }

    private void sendEndOfWindowReached(int i)
    {
        if (mOnEndOfWindowReachedListener != null)
        {
            mOnEndOfWindowReachedListener.onEndOfWindowReached(i);
            updateHeaderFooterState(i, true);
            return;
        } else
        {
            GamesLog.w("DBRecyclerAdapter", "Reached the end of a paginated DataBuffer, but no OnEndOfWindowReachedListener registered!");
            return;
        }
    }

    private void setMaxNumItems(int i)
    {
        boolean flag = true;
        if (i != mMaxNumItems)
        {
            CachedInfo cachedinfo = createCachedInfo();
            mMaxNumItems = i;
            computeCount();
            if (isVisible())
            {
                notifyHeaderFooterChanges(cachedinfo);
                int j;
                if (mHasPrev)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                j = getCachedDataCount();
                if (j > cachedinfo.dataCount)
                {
                    notifyItemRangeInserted(cachedinfo.dataCount + i, j - cachedinfo.dataCount);
                } else
                if (j < cachedinfo.dataCount)
                {
                    notifyItemRangeRemoved(j + i, cachedinfo.dataCount - j);
                }
            }
            if (!mHideIncompleteRowsWhenLimited || mMaxNumItems == 0x7fffffff)
            {
                flag = false;
            }
            if (mHideIncompleteRowsFromLimiting != flag)
            {
                cachedinfo = createCachedInfo();
                mHideIncompleteRowsFromLimiting = flag;
                onHeaderFooterLengthChanged(cachedinfo);
                return;
            }
        }
    }

    private void updateHeaderFooterState(int i, boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 76
    //                   1 43;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException("pageDirection needs to be NEXT or PREV");
_L3:
        if (mIsPrevPageInRetry != flag)
        {
            mIsPrevPageInRetry = flag;
            if (mHasPrev && isVisible())
            {
                notifyItemChanged(0);
            }
        }
_L5:
        return;
_L2:
        if (mIsNextPageInRetry != flag)
        {
            mIsNextPageInRetry = flag;
            if (mHasNext && isVisible())
            {
                notifyItemChanged(mCount - 1);
                return;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void clearData()
    {
        setDataBuffer(null);
    }

    public final void clearMaxNumItems()
    {
        setMaxNumItems(0x7fffffff);
    }

    public final void disablePagination()
    {
        CachedInfo cachedinfo = createCachedInfo();
        mIsPaginationEnabled = false;
        onHeaderFooterLengthChanged(cachedinfo);
    }

    public abstract int getCardItemViewType$134621();

    public final int getDataBufferCount()
    {
        if (mDataBuffer != null)
        {
            return mDataBuffer.getCount();
        } else
        {
            return 0;
        }
    }

    public final int getItemCount()
    {
        if (!isVisible())
        {
            return 0;
        } else
        {
            return mCount;
        }
    }

    public final int getItemViewType(int i)
    {
        while (isPrevPageHeader(i) || isNextPageFooter(i)) 
        {
            return 0x7f0d0032;
        }
        return getCardItemViewType$134621();
    }

    protected final int getSpanSize(int i)
    {
        for (int j = getSpanCount(); isPrevPageHeader(i) || isNextPageFooter(i);)
        {
            return j;
        }

        return 1;
    }

    public final boolean isVisible()
    {
        return super.isVisible() && mVisible;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((DatabufferViewHolder)viewholder, i);
    }

    public void onBindViewHolder(DatabufferViewHolder databufferviewholder, int i)
    {
        if (isNextPageFooter(i) && !mIsNextPageInRetry)
        {
            mOnEndOfWindowReachedListener.onEndOfWindowReached(0);
        }
        if (isPrevPageHeader(i) && !mIsPrevPageInRetry)
        {
            mOnEndOfWindowReachedListener.onEndOfWindowReached(1);
        }
        if (!isNextPageFooter(i)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        databufferviewholder.populateViews(this, i, obj);
        return;
_L2:
        int j;
        if (!mHasPrev)
        {
            break; /* Loop/switch isn't completed */
        }
        if (isPrevPageHeader(i))
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        j = i - 1;
_L5:
        if (mDataBuffer == null)
        {
            obj = null;
        } else
        {
            obj = mDataBuffer.get(j + mStartOffset);
        }
        if (true) goto _L4; else goto _L3
_L3:
        j = i;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d0225)
        {
            int i = ((Integer)view.getTag()).intValue();
            if (isPrevPageHeader(i))
            {
                sendEndOfWindowReached(1);
            } else
            if (isNextPageFooter(i))
            {
                sendEndOfWindowReached(0);
                return;
            }
        }
    }

    public abstract DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i);

    public final volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        if (i == 0x7f0d0032)
        {
            return new DatabufferHeaderFooterViewHolder(mInflater.inflate(0x7f0400b2, viewgroup, false));
        } else
        {
            return onCreateCardViewHolder(viewgroup, i);
        }
    }

    public void onDataChanged()
    {
        onEverythingChanged(createCachedInfo());
    }

    public void onDataRangeChanged(int i, int j)
    {
        boolean flag = false;
        if (isVisible())
        {
            Range range = new Range(i - mStartOffset, (i - mStartOffset) + j);
            i = mMaxNumItems;
            if (range.mLow < 0)
            {
                range.mLow = 0;
            }
            if (range.mHigh > i)
            {
                range.mHigh = i;
            }
            if (!range.isEmpty())
            {
                i = ((flag) ? 1 : 0);
                if (mHasPrev)
                {
                    i = 1;
                }
                notifyItemRangeChanged(range.mLow + i, range.getSize());
                return;
            }
        }
    }

    public void onDataRangeInserted(int i, int j)
    {
        boolean flag = false;
        Object obj = createCachedInfo();
        computeCount();
        if (isVisible())
        {
            int k = getCachedDataCount();
            notifyHeaderFooterChanges(((CachedInfo) (obj)));
            int l = mStartOffset;
            Range range = new Range();
            range.mLow = Math.max(i - l, 0);
            range.mHigh = Math.min(range.mLow + j, k);
            if (!range.isEmpty())
            {
                i = ((flag) ? 1 : 0);
                if (mHasPrev)
                {
                    i = 1;
                }
                if (range.mLow >= ((CachedInfo) (obj)).dataCount)
                {
                    notifyItemRangeInserted(((CachedInfo) (obj)).dataCount + i, k - ((CachedInfo) (obj)).dataCount);
                    return;
                }
                notifyItemRangeInserted(range.mLow + i, range.getSize());
                obj = new Range(k, ((CachedInfo) (obj)).dataCount + range.getSize());
                j = ((Range) (obj)).getSize();
                if (j > 0)
                {
                    notifyItemRangeRemoved(((Range) (obj)).mLow + i, j);
                    return;
                }
                if (j < 0)
                {
                    notifyItemRangeInserted(((Range) (obj)).mHigh + i, -j);
                    return;
                }
            }
        }
    }

    public final void onDataRangeRemoved(int i, int j)
    {
        boolean flag = false;
        Object obj = createCachedInfo();
        computeCount();
        if (isVisible())
        {
            int k = getCachedDataCount();
            notifyHeaderFooterChanges(((CachedInfo) (obj)));
            int l = mStartOffset;
            Range range = new Range();
            range.mLow = Math.max(i - l, 0);
            range.mHigh = Math.min(range.mLow + j, ((CachedInfo) (obj)).dataCount);
            if (!range.isEmpty())
            {
                i = ((flag) ? 1 : 0);
                if (mHasPrev)
                {
                    i = 1;
                }
                if (range.mLow >= k)
                {
                    notifyItemRangeRemoved(k + i, ((CachedInfo) (obj)).dataCount - k);
                    return;
                }
                j = range.getSize();
                notifyItemRangeRemoved(range.mLow + i, j);
                obj = new Range(((CachedInfo) (obj)).dataCount - j, k);
                j = ((Range) (obj)).getSize();
                if (j > 0)
                {
                    notifyItemRangeInserted(((Range) (obj)).mLow + i, j);
                    return;
                }
                if (j < 0)
                {
                    notifyItemRangeRemoved(((Range) (obj)).mHigh + i, -j);
                    return;
                }
            }
        }
    }

    public final void setAdapterVisible(boolean flag)
    {
        int i;
label0:
        {
            i = getItemCount();
            boolean flag1 = isVisible();
            mVisible = flag;
            flag = isVisible();
            if (flag1 != flag)
            {
                if (!flag)
                {
                    break label0;
                }
                notifyItemRangeInserted(0, getItemCount());
            }
            return;
        }
        notifyItemRangeRemoved(0, i);
    }

    public void setDataBuffer(DataBuffer databuffer)
    {
        if (!Objects.equal(mDataBuffer, databuffer))
        {
            CachedInfo cachedinfo = createCachedInfo();
            if (mDataBuffer != null)
            {
                if (mDataBuffer instanceof com.google.android.gms.common.data.DataBufferObserver.Observable)
                {
                    ((com.google.android.gms.common.data.DataBufferObserver.Observable)mDataBuffer).removeObserver(this);
                }
                mDataBuffer.release();
            }
            mDataBuffer = databuffer;
            onEverythingChanged(cachedinfo);
            if (mDataBuffer != null && (mDataBuffer instanceof com.google.android.gms.common.data.DataBufferObserver.Observable))
            {
                ((com.google.android.gms.common.data.DataBufferObserver.Observable)mDataBuffer).addObserver(this);
                return;
            }
        }
    }

    public final void setMaxRows(int i)
    {
        if (i == 0)
        {
            setMaxNumItems(0x7fffffff);
            return;
        }
        i = mContext.getResources().getInteger(i);
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxNumRows must be at least 1.");
        } else
        {
            setMaxNumItems(getSpanCount() * i);
            return;
        }
    }

    public final void setStartOffset(int i)
    {
        boolean flag2 = true;
        if (mStartOffset != i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        CachedInfo cachedinfo;
        Range range;
        Range range1;
        int j = mStartOffset;
        cachedinfo = createCachedInfo();
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mStartOffset = i;
        computeCount();
        if (!isVisible())
        {
            continue; /* Loop/switch isn't completed */
        }
        notifyHeaderFooterChanges(cachedinfo);
        range = new Range(j, cachedinfo.dataCount + j);
        range1 = new Range(mStartOffset, mStartOffset + getCachedDataCount());
        if (mHasPrev)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (Math.max(range.mLow, range1.mLow) < Math.min(range.mHigh, range1.mHigh))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = range.getSize();
        if (j > 0)
        {
            notifyItemRangeRemoved(i, j);
        }
        j = range1.getSize();
        if (j > 0)
        {
            notifyItemRangeInserted(i, j);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (range1.mLow >= range.mLow) goto _L5; else goto _L4
_L4:
        int k = range.mHigh - range1.mHigh;
        if (k <= 0) goto _L7; else goto _L6
_L6:
        notifyItemRangeRemoved((range1.mHigh - range.mLow) + i, k);
_L8:
        notifyItemRangeInserted(i, range.mLow - range1.mLow);
        return;
_L7:
        if (k < 0)
        {
            notifyItemRangeInserted(cachedinfo.dataCount + i, -k);
        }
        if (true) goto _L8; else goto _L5
_L5:
        int l = range1.mHigh - range.mHigh;
        boolean flag1;
        if (l > 0)
        {
            notifyItemRangeInserted(cachedinfo.dataCount + i, l);
        } else
        if (l < 0)
        {
            notifyItemRangeRemoved((range1.mHigh - range.mLow) + i, -l);
        }
        l = range1.mLow - range.mLow;
        if (l > 0)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1);
        notifyItemRangeRemoved(i, l);
        return;
    }

    public final void showFooterErrorState()
    {
        updateHeaderFooterState(0, false);
    }

    public final boolean usesLoadImage()
    {
        return true;
    }




}
