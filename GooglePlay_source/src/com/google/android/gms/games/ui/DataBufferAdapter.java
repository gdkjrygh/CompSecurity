// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferUtils;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesBaseAdapter

public abstract class DataBufferAdapter extends GamesBaseAdapter
    implements android.view.View.OnClickListener
{
    public static interface OnEndOfWindowReachedListener
    {

        public abstract void onEndOfWindowReached$13462e();
    }


    final Context mContext;
    int mCount;
    protected DataBuffer mDataBuffer;
    View mEmptyView;
    private boolean mHasNext;
    private boolean mHasPrev;
    private boolean mIsNextPageInRetry;
    private boolean mIsPaginationEnabled;
    private boolean mIsPrevPageInRetry;
    private View mLoadingView;
    private View mNextPageFooter;
    private View mNextPageProgressBar;
    private View mNextPageRetry;
    public OnEndOfWindowReachedListener mOnEndOfWindowReachedListener;
    private View mPrevPageHeader;
    private View mPrevPageProgressBar;
    private View mPrevPageRetry;
    boolean mShowLoadingView;
    protected int mStartOffset;
    private boolean mVisible;

    public DataBufferAdapter(Context context)
    {
        mIsPrevPageInRetry = false;
        mIsNextPageInRetry = false;
        mVisible = true;
        mHasNext = false;
        mHasPrev = false;
        mShowLoadingView = false;
        mIsPaginationEnabled = true;
        mCount = 0;
        mStartOffset = 0;
        mContext = context;
        context = (LayoutInflater)context.getSystemService("layout_inflater");
        mNextPageFooter = inflatePrevNextPage(context);
        mNextPageProgressBar = mNextPageFooter.findViewById(0x7f0d00e4);
        mNextPageRetry = mNextPageFooter.findViewById(0x7f0d0225);
        mNextPageRetry.setOnClickListener(this);
        mPrevPageHeader = inflatePrevNextPage(context);
        mPrevPageProgressBar = mNextPageFooter.findViewById(0x7f0d00e4);
        mPrevPageRetry = mNextPageFooter.findViewById(0x7f0d0225);
        mPrevPageRetry.setOnClickListener(this);
        mLoadingView = context.inflate(0x7f040096, null);
    }

    private void computeCount()
    {
        boolean flag1 = true;
        if (mDataBuffer == null)
        {
            mHasPrev = false;
            mHasNext = false;
            mCount = 0;
        } else
        {
            boolean flag;
            if (mIsPaginationEnabled && DataBufferUtils.hasPrevPage(mDataBuffer))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mHasPrev = flag;
            if (mIsPaginationEnabled && DataBufferUtils.hasNextPage(mDataBuffer))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            mHasNext = flag;
            mCount = getElementCount();
            if (mHasPrev)
            {
                mCount = mCount + 1;
            }
            if (mHasNext)
            {
                mCount = mCount + 1;
                return;
            }
        }
    }

    private static View inflatePrevNextPage(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(0x7f0400b2, null, false);
    }

    private boolean isEmptyViewVisible()
    {
        return !mShowLoadingView && mEmptyView != null && mCount == 0;
    }

    private boolean isNextPageFooter(int i)
    {
        return mHasNext && i == mCount - 1;
    }

    private boolean isPrevPageHeader(int i)
    {
        return mHasPrev && i == 0;
    }

    private void sendEndOfWindowReached(int i)
    {
        if (mOnEndOfWindowReachedListener != null)
        {
            mOnEndOfWindowReachedListener._mth13462e();
            switch (i)
            {
            default:
                throw new IllegalArgumentException("pageDirection needs to be NEXT or PREV");

            case 1: // '\001'
                mPrevPageProgressBar.setVisibility(0);
                mPrevPageRetry.setVisibility(8);
                mIsPrevPageInRetry = false;
                return;

            case 0: // '\0'
                mNextPageProgressBar.setVisibility(0);
                mNextPageRetry.setVisibility(8);
                mIsNextPageInRetry = false;
                return;
            }
        } else
        {
            GamesLog.w("DataBufferAdapter", "Reached the end of a paginated DataBuffer, but no OnEndOfWindowReachedListener registered!");
            return;
        }
    }

    public boolean areAllItemsEnabled()
    {
        if (mShowLoadingView)
        {
            return false;
        }
        if (isEmptyViewVisible())
        {
            return mEmptyView.isEnabled();
        } else
        {
            return super.areAllItemsEnabled();
        }
    }

    public abstract void bindView$675318ec(View view, Object obj);

    public int getCount()
    {
        if (!mVisible)
        {
            return 0;
        }
        if (mShowLoadingView || isEmptyViewVisible())
        {
            return 1;
        } else
        {
            return mCount;
        }
    }

    public final DataBuffer getDataBuffer()
    {
        return mDataBuffer;
    }

    public int getElementCount()
    {
        int i;
        if (mDataBuffer == null)
        {
            i = 0;
        } else
        {
            int j = mDataBuffer.getCount() + 0;
            i = j;
            if (j < 0)
            {
                return 0;
            }
        }
        return i;
    }

    public Object getItem(int i)
    {
_L2:
        return null;
        if (mShowLoadingView || isEmptyViewVisible() || mDataBuffer == null || isNextPageFooter(i)) goto _L2; else goto _L1
_L1:
        int j;
        j = i;
        if (!mHasPrev)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i - 1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L3
_L3:
        return mDataBuffer.get(j + 0);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (mShowLoadingView)
        {
            return 3;
        }
        if (isEmptyViewVisible())
        {
            return 4;
        }
        if (isPrevPageHeader(i))
        {
            return 1;
        }
        return !isNextPageFooter(i) ? 0 : 2;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (mShowLoadingView)
        {
            return mLoadingView;
        }
        if (isEmptyViewVisible())
        {
            return mEmptyView;
        }
        if (isNextPageFooter(i))
        {
            if (!mIsNextPageInRetry)
            {
                sendEndOfWindowReached(0);
            }
            return mNextPageFooter;
        }
        int j = i;
        if (mHasPrev)
        {
            if (i == 0)
            {
                sendEndOfWindowReached(1);
                return mPrevPageHeader;
            }
            j = i - 1;
        }
        if (view == mNextPageFooter || view == mPrevPageHeader)
        {
            throw new IllegalStateException("trying to convert header/footer");
        } else
        {
            return getViewForElement(j, view, viewgroup);
        }
    }

    protected View getViewForElement(int i, View view, ViewGroup viewgroup)
    {
        Object obj = mDataBuffer.get(i + 0);
        if (view == null)
        {
            view = newView$6591d710(mContext, viewgroup);
        }
        bindView$675318ec(view, obj);
        return view;
    }

    public int getViewTypeCount()
    {
        return 5;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEnabled(int i)
    {
        if (!mShowLoadingView)
        {
            if (isEmptyViewVisible())
            {
                return mEmptyView.isEnabled();
            }
            if (!isPrevPageHeader(i) && !isNextPageFooter(i))
            {
                return super.isEnabled(i);
            }
        }
        return false;
    }

    public abstract View newView$6591d710(Context context, ViewGroup viewgroup);

    public void notifyDataSetChanged()
    {
        computeCount();
        super.notifyDataSetChanged();
    }

    public void onClick(View view)
    {
        if (view == mNextPageRetry)
        {
            sendEndOfWindowReached(0);
        } else
        if (view == mNextPageRetry)
        {
            sendEndOfWindowReached(1);
            return;
        }
    }

    public final void setAdapterVisible(boolean flag)
    {
        if (mVisible != flag)
        {
            mVisible = flag;
            notifyDataSetChanged();
        }
    }

    public void setDataBuffer(DataBuffer databuffer)
    {
        if (mDataBuffer != null && mDataBuffer.equals(databuffer))
        {
            return;
        }
        if (mDataBuffer != null)
        {
            mDataBuffer.release();
        }
        mDataBuffer = databuffer;
        computeCount();
        mShowLoadingView = false;
        notifyDataSetChanged();
    }

    public final void showFooterErrorState()
    {
        mNextPageProgressBar.setVisibility(8);
        mNextPageRetry.setVisibility(0);
        mIsNextPageInRetry = true;
    }

    public final void showLoadingView$1385ff()
    {
        if (!mShowLoadingView)
        {
            mShowLoadingView = true;
            notifyDataSetChanged();
        }
    }
}
