// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewCompat

abstract class AbsSpinnerCompat extends AdapterViewCompat
{
    final class RecycleBin
    {

        private final SparseArray mScrapHeap;
        final AbsSpinnerCompat this$0;

        final void clear()
        {
            SparseArray sparsearray = mScrapHeap;
            int j = sparsearray.size();
            for (int i = 0; i < j; i++)
            {
                View view = (View)sparsearray.valueAt(i);
                if (view != null)
                {
                    removeDetachedView(view);
                }
            }

            sparsearray.clear();
        }

        final View get(int i)
        {
            View view = (View)mScrapHeap.get(i);
            if (view != null)
            {
                mScrapHeap.delete(i);
            }
            return view;
        }

        public final void put(int i, View view)
        {
            mScrapHeap.put(i, view);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
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
    }


    SpinnerAdapter mAdapter;
    int mHeightMeasureSpec;
    final RecycleBin mRecycler;
    final Rect mSpinnerPadding;
    int mWidthMeasureSpec;

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public final volatile Adapter getAdapter()
    {
        return mAdapter;
    }

    public final View getSelectedView()
    {
        if (mItemCount > 0 && mSelectedPosition >= 0)
        {
            return getChildAt(mSelectedPosition - mFirstPosition);
        } else
        {
            return null;
        }
    }

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
        if (k <= 0)
        {
            k = 0;
        }
        rect.left = k;
        rect = mSpinnerPadding;
        if (k1 > 0)
        {
            k = k1;
        } else
        {
            k = 0;
        }
        rect.top = k;
        rect = mSpinnerPadding;
        if (i1 > 0)
        {
            k = i1;
        } else
        {
            k = 0;
        }
        rect.right = k;
        rect = mSpinnerPadding;
        if (l > 0)
        {
            k = l;
        } else
        {
            k = 0;
        }
        rect.bottom = k;
        if (mDataChanged)
        {
            handleDataChanged();
        }
        k1 = 0;
        flag1 = false;
        flag2 = true;
        i2 = super.mNextSelectedPosition;
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
                    flag = flag2;
                    l = k1;
                    k = ((flag1) ? 1 : 0);
                    if (view != null)
                    {
                        mRecycler.put(i2, view);
                        if (view.getLayoutParams() == null)
                        {
                            mBlockLayoutRequests = true;
                            view.setLayoutParams(generateDefaultLayoutParams());
                            mBlockLayoutRequests = false;
                        }
                        measureChild(view, i, j);
                        l = view.getMeasuredHeight() + mSpinnerPadding.top + mSpinnerPadding.bottom;
                        k = view.getMeasuredWidth() + mSpinnerPadding.left + mSpinnerPadding.right;
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
        k = ViewCompat.resolveSizeAndState(k, j, 0);
        setMeasuredDimension(ViewCompat.resolveSizeAndState(l, i, 0), k);
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
        savedstate.selectedId = super.mNextSelectedRowId;
        if (savedstate.selectedId >= 0L)
        {
            savedstate.position = super.mNextSelectedPosition;
            return savedstate;
        } else
        {
            savedstate.position = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!mBlockLayoutRequests)
        {
            super.requestLayout();
        }
    }

    final void resetList()
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

    public final void setSelection(int i)
    {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }

}
