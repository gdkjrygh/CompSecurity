// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewCompat

abstract class AbsSpinnerCompat extends AdapterViewCompat
{
    class RecycleBin
    {

        private final SparseArray mScrapHeap = new SparseArray();
        final AbsSpinnerCompat this$0;

        void clear()
        {
            SparseArray sparsearray = mScrapHeap;
            int j = sparsearray.size();
            for (int i = 0; i < j; i++)
            {
                View view = (View)sparsearray.valueAt(i);
                if (view != null)
                {
                    removeDetachedView(view, true);
                }
            }

            sparsearray.clear();
        }

        View get(int i)
        {
            View view = (View)mScrapHeap.get(i);
            if (view != null)
            {
                mScrapHeap.delete(i);
            }
            return view;
        }

        public void put(int i, View view)
        {
            mScrapHeap.put(i, view);
        }

        RecycleBin()
        {
            this$0 = AbsSpinnerCompat.this;
            super();
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        int position;
        long selectedId;

        public String toString()
        {
            return (new StringBuilder()).append("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" position=").append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeLong(selectedId);
            parcel.writeInt(position);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            selectedId = parcel.readLong();
            position = parcel.readInt();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    SpinnerAdapter mAdapter;
    private DataSetObserver mDataSetObserver;
    int mHeightMeasureSpec;
    final RecycleBin mRecycler;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    final Rect mSpinnerPadding;
    private Rect mTouchFrame;
    int mWidthMeasureSpec;

    AbsSpinnerCompat(Context context)
    {
        super(context);
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        mSpinnerPadding = new Rect();
        mRecycler = new RecycleBin();
        initAbsSpinner();
    }

    AbsSpinnerCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    AbsSpinnerCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        mSpinnerPadding = new Rect();
        mRecycler = new RecycleBin();
        initAbsSpinner();
    }

    private void initAbsSpinner()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public SpinnerAdapter getAdapter()
    {
        return mAdapter;
    }

    int getChildHeight(View view)
    {
        return view.getMeasuredHeight();
    }

    int getChildWidth(View view)
    {
        return view.getMeasuredWidth();
    }

    public int getCount()
    {
        return mItemCount;
    }

    public View getSelectedView()
    {
        if (mItemCount > 0 && mSelectedPosition >= 0)
        {
            return getChildAt(mSelectedPosition - mFirstPosition);
        } else
        {
            return null;
        }
    }

    abstract void layout(int i, boolean flag);

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1 = android.view.View.MeasureSpec.getMode(i);
        k = getPaddingLeft();
        int j1 = getPaddingTop();
        i1 = getPaddingRight();
        l = getPaddingBottom();
        Object obj = mSpinnerPadding;
        View view;
        if (k <= mSelectionLeftPadding)
        {
            k = mSelectionLeftPadding;
        }
        obj.left = k;
        obj = mSpinnerPadding;
        if (j1 > mSelectionTopPadding)
        {
            k = j1;
        } else
        {
            k = mSelectionTopPadding;
        }
        obj.top = k;
        obj = mSpinnerPadding;
        if (i1 > mSelectionRightPadding)
        {
            k = i1;
        } else
        {
            k = mSelectionRightPadding;
        }
        obj.right = k;
        obj = mSpinnerPadding;
        if (l > mSelectionBottomPadding)
        {
            k = l;
        } else
        {
            k = mSelectionBottomPadding;
        }
        obj.bottom = k;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        k = getSelectedItemPosition();
        if (k < 0 || mAdapter == null || k >= mAdapter.getCount()) goto _L2; else goto _L1
_L1:
        view = mRecycler.get(k);
        obj = view;
        if (view == null)
        {
            obj = mAdapter.getView(k, null, this);
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        mRecycler.put(k, ((View) (obj)));
        if (((View) (obj)).getLayoutParams() == null)
        {
            mBlockLayoutRequests = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            mBlockLayoutRequests = false;
        }
        measureChild(((View) (obj)), i, j);
        l = getChildHeight(((View) (obj))) + mSpinnerPadding.top + mSpinnerPadding.bottom;
        k = getChildWidth(((View) (obj))) + mSpinnerPadding.left + mSpinnerPadding.right;
        i1 = 0;
_L5:
        j1 = k;
        if (i1 != 0)
        {
            i1 = mSpinnerPadding.top + mSpinnerPadding.bottom;
            j1 = k;
            l = i1;
            if (k1 == 0)
            {
                j1 = mSpinnerPadding.left + mSpinnerPadding.right;
                l = i1;
            }
        }
        k = Math.max(l, getSuggestedMinimumHeight());
        l = Math.max(j1, getSuggestedMinimumWidth());
        k = ViewCompat.resolveSizeAndState(k, j, 0);
        setMeasuredDimension(ViewCompat.resolveSizeAndState(l, i, 0), k);
        mHeightMeasureSpec = j;
        mWidthMeasureSpec = i;
        return;
_L2:
        i1 = 1;
        k = 0;
        l = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).selectedId >= 0L)
        {
            mDataChanged = true;
            mNeedSync = true;
            mSyncRowId = ((SavedState) (parcelable)).selectedId;
            mSyncPosition = ((SavedState) (parcelable)).position;
            mSyncMode = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.selectedId = getSelectedItemId();
        if (savedstate.selectedId >= 0L)
        {
            savedstate.position = getSelectedItemPosition();
            return savedstate;
        } else
        {
            savedstate.position = -1;
            return savedstate;
        }
    }

    public int pointToPosition(int i, int j)
    {
        Rect rect1 = mTouchFrame;
        Rect rect = rect1;
        if (rect1 == null)
        {
            mTouchFrame = new Rect();
            rect = mTouchFrame;
        }
        for (int k = getChildCount() - 1; k >= 0; k--)
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(i, j))
            {
                return mFirstPosition + k;
            }
        }

        return -1;
    }

    void recycleAllViews()
    {
        int j = getChildCount();
        RecycleBin recyclebin = mRecycler;
        int k = mFirstPosition;
        for (int i = 0; i < j; i++)
        {
            recyclebin.put(k + i, getChildAt(i));
        }

    }

    public void requestLayout()
    {
        if (!mBlockLayoutRequests)
        {
            super.requestLayout();
        }
    }

    void resetList()
    {
        mDataChanged = false;
        mNeedSync = false;
        removeAllViewsInLayout();
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        byte byte0 = -1;
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
            resetList();
        }
        mAdapter = spinneradapter;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        if (mAdapter != null)
        {
            mOldItemCount = mItemCount;
            mItemCount = mAdapter.getCount();
            checkFocus();
            mDataSetObserver = new AdapterViewCompat.AdapterDataSetObserver(this);
            mAdapter.registerDataSetObserver(mDataSetObserver);
            if (mItemCount > 0)
            {
                byte0 = 0;
            }
            setSelectedPositionInt(byte0);
            setNextSelectedPositionInt(byte0);
            if (mItemCount == 0)
            {
                checkSelectionChanged();
            }
        } else
        {
            checkFocus();
            resetList();
            checkSelectionChanged();
        }
        requestLayout();
    }

    public void setSelection(int i)
    {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }

    public void setSelection(int i, boolean flag)
    {
        if (flag && mFirstPosition <= i && i <= (mFirstPosition + getChildCount()) - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setSelectionInt(i, flag);
    }

    void setSelectionInt(int i, boolean flag)
    {
        if (i != mOldSelectedPosition)
        {
            mBlockLayoutRequests = true;
            int j = mSelectedPosition;
            setNextSelectedPositionInt(i);
            layout(i - j, flag);
            mBlockLayoutRequests = false;
        }
    }

}
