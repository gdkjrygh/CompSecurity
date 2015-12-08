// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAdapterView

public abstract class IcsAbsSpinner extends IcsAdapterView
{
    class RecycleBin
    {

        private final SparseArray mScrapHeap = new SparseArray();
        final IcsAbsSpinner this$0;

        void clear()
        {
            SparseArray sparsearray = mScrapHeap;
            int j = sparsearray.size();
            int i = 0;
            do
            {
                if (i >= j)
                {
                    sparsearray.clear();
                    return;
                }
                View view = (View)sparsearray.valueAt(i);
                if (view != null)
                {
                    removeDetachedView(view, true);
                }
                i++;
            } while (true);
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
            this$0 = IcsAbsSpinner.this;
            super();
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int position;
        long selectedId;

        public String toString()
        {
            return (new StringBuilder("AbsSpinner.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" position=").append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeLong(selectedId);
            parcel.writeInt(position);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            selectedId = parcel.readLong();
            position = parcel.readInt();
        }

        SavedState(Parcel parcel, SavedState savedstate)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final boolean IS_HONEYCOMB;
    SpinnerAdapter mAdapter;
    boolean mBlockLayoutRequests;
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

    public IcsAbsSpinner(Context context)
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

    public IcsAbsSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IcsAbsSpinner(Context context, AttributeSet attributeset, int i)
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
        int l1 = android.view.View.MeasureSpec.getMode(i);
        int k = getPaddingLeft();
        int k1 = getPaddingTop();
        int i1 = getPaddingRight();
        int l = getPaddingBottom();
        Rect rect = mSpinnerPadding;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i2;
        if (k <= mSelectionLeftPadding)
        {
            k = mSelectionLeftPadding;
        }
        rect.left = k;
        rect = mSpinnerPadding;
        if (k1 > mSelectionTopPadding)
        {
            k = k1;
        } else
        {
            k = mSelectionTopPadding;
        }
        rect.top = k;
        rect = mSpinnerPadding;
        if (i1 > mSelectionRightPadding)
        {
            k = i1;
        } else
        {
            k = mSelectionRightPadding;
        }
        rect.right = k;
        rect = mSpinnerPadding;
        if (l > mSelectionBottomPadding)
        {
            k = l;
        } else
        {
            k = mSelectionBottomPadding;
        }
        rect.bottom = k;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        k1 = 0;
        flag1 = false;
        flag2 = true;
        i2 = getSelectedItemPosition();
        flag = flag2;
        l = k1;
        k = ((flag1) ? 1 : 0);
        if (i2 >= 0)
        {
            flag = flag2;
            l = k1;
            k = ((flag1) ? 1 : 0);
            if (mAdapter != null)
            {
                flag = flag2;
                l = k1;
                k = ((flag1) ? 1 : 0);
                if (i2 < mAdapter.getCount())
                {
                    View view1 = mRecycler.get(i2);
                    View view = view1;
                    if (view1 == null)
                    {
                        view = mAdapter.getView(i2, null, this);
                    }
                    if (view != null)
                    {
                        mRecycler.put(i2, view);
                    }
                    flag = flag2;
                    l = k1;
                    k = ((flag1) ? 1 : 0);
                    if (view != null)
                    {
                        if (view.getLayoutParams() == null)
                        {
                            mBlockLayoutRequests = true;
                            view.setLayoutParams(generateDefaultLayoutParams());
                            mBlockLayoutRequests = false;
                        }
                        measureChild(view, i, j);
                        l = getChildHeight(view) + mSpinnerPadding.top + mSpinnerPadding.bottom;
                        k = getChildWidth(view) + mSpinnerPadding.left + mSpinnerPadding.right;
                        flag = false;
                    }
                }
            }
        }
        k1 = l;
        l = k;
        if (flag)
        {
            int j1 = mSpinnerPadding.top + mSpinnerPadding.bottom;
            k1 = j1;
            l = k;
            if (l1 == 0)
            {
                l = mSpinnerPadding.left + mSpinnerPadding.right;
                k1 = j1;
            }
        }
        k = Math.max(k1, getSuggestedMinimumHeight());
        l = Math.max(l, getSuggestedMinimumWidth());
        if (IS_HONEYCOMB)
        {
            k = resolveSizeAndState(k, j, 0);
            l = resolveSizeAndState(l, i, 0);
        } else
        {
            k = resolveSize(k, j);
            l = resolveSize(l, i);
        }
        setMeasuredDimension(l, k);
        mHeightMeasureSpec = j;
        mWidthMeasureSpec = i;
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
        int k = getChildCount() - 1;
        do
        {
            if (k < 0)
            {
                return -1;
            }
            View view = getChildAt(k);
            if (view.getVisibility() == 0)
            {
                view.getHitRect(rect);
                if (rect.contains(i, j))
                {
                    return mFirstPosition + k;
                }
            }
            k--;
        } while (true);
    }

    void recycleAllViews()
    {
        int j = getChildCount();
        RecycleBin recyclebin = mRecycler;
        int k = mFirstPosition;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            recyclebin.put(k + i, getChildAt(i));
            i++;
        } while (true);
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
            mDataSetObserver = new IcsAdapterView.AdapterDataSetObserver(this);
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

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB = flag;
    }

}
