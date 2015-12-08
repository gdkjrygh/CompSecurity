// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, OrientationHelper

class tParams
{

    int mCachedEnd;
    int mCachedStart;
    int mDeletedSize;
    final int mIndex;
    private ArrayList mViews;
    final StaggeredGridLayoutManager this$0;

    void appendToSpan(View view)
    {
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = this;
        mViews.add(view);
        mCachedEnd = 0x80000000;
        if (mViews.size() == 1)
        {
            mCachedStart = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }

    void cacheReferenceLineAndClear(boolean flag, int i)
    {
        int j;
        if (flag)
        {
            j = getEndLine(0x80000000);
        } else
        {
            j = getStartLine(0x80000000);
        }
        clear();
        while (j == 0x80000000 || flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding()) 
        {
            return;
        }
        int k = j;
        if (i != 0x80000000)
        {
            k = j + i;
        }
        mCachedEnd = k;
        mCachedStart = k;
    }

    void calculateCachedEnd()
    {
        View view = (View)mViews.get(mViews.size() - 1);
        tParams tparams = getLayoutParams(view);
        mCachedEnd = mPrimaryOrientation.getDecoratedEnd(view);
        if (tparams.mFullSpan)
        {
            panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewPosition());
            if (fullspanitem != null && fullspanitem.mGapDir == 1)
            {
                mCachedEnd = mCachedEnd + fullspanitem.getGapForSpan(mIndex);
            }
        }
    }

    void calculateCachedStart()
    {
        View view = (View)mViews.get(0);
        tParams tparams = getLayoutParams(view);
        mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
        if (tparams.mFullSpan)
        {
            panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewPosition());
            if (fullspanitem != null && fullspanitem.mGapDir == -1)
            {
                mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
            }
        }
    }

    void clear()
    {
        mViews.clear();
        invalidateCache();
        mDeletedSize = 0;
    }

    public int getDeletedSize()
    {
        return mDeletedSize;
    }

    int getEndLine()
    {
        if (mCachedEnd != 0x80000000)
        {
            return mCachedEnd;
        } else
        {
            calculateCachedEnd();
            return mCachedEnd;
        }
    }

    int getEndLine(int i)
    {
        if (mCachedEnd != 0x80000000)
        {
            i = mCachedEnd;
        } else
        if (mViews.size() != 0)
        {
            calculateCachedEnd();
            return mCachedEnd;
        }
        return i;
    }

    tParams getLayoutParams(View view)
    {
        return (tParams)view.getLayoutParams();
    }

    int getStartLine()
    {
        if (mCachedStart != 0x80000000)
        {
            return mCachedStart;
        } else
        {
            calculateCachedStart();
            return mCachedStart;
        }
    }

    int getStartLine(int i)
    {
        if (mCachedStart != 0x80000000)
        {
            i = mCachedStart;
        } else
        if (mViews.size() != 0)
        {
            calculateCachedStart();
            return mCachedStart;
        }
        return i;
    }

    void invalidateCache()
    {
        mCachedStart = 0x80000000;
        mCachedEnd = 0x80000000;
    }

    void onOffset(int i)
    {
        if (mCachedStart != 0x80000000)
        {
            mCachedStart = mCachedStart + i;
        }
        if (mCachedEnd != 0x80000000)
        {
            mCachedEnd = mCachedEnd + i;
        }
    }

    void popEnd()
    {
        int i = mViews.size();
        View view = (View)mViews.remove(i - 1);
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = null;
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        if (i == 1)
        {
            mCachedStart = 0x80000000;
        }
        mCachedEnd = 0x80000000;
    }

    void popStart()
    {
        View view = (View)mViews.remove(0);
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = null;
        if (mViews.size() == 0)
        {
            mCachedEnd = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        mCachedStart = 0x80000000;
    }

    void prependToSpan(View view)
    {
        tParams tparams = getLayoutParams(view);
        tparams.mSpan = this;
        mViews.add(0, view);
        mCachedStart = 0x80000000;
        if (mViews.size() == 1)
        {
            mCachedEnd = 0x80000000;
        }
        if (tparams.isItemRemoved() || tparams.isItemChanged())
        {
            mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }

    void setLine(int i)
    {
        mCachedStart = i;
        mCachedEnd = i;
    }

}
