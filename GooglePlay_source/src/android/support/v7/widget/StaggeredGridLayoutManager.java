// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ScrollbarHelper, OrientationHelper, LayoutState, RecyclerView

public final class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
{
    private final class AnchorInfo
    {

        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        final StaggeredGridLayoutManager this$0;
    }

    public static final class LayoutParams extends RecyclerView.LayoutParams
    {

        Span mSpan;

        public LayoutParams()
        {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }

    static final class LazySpanLookup
    {

        int mData[];
        List mFullSpanItems;

        final void clear()
        {
            throw new NullPointerException();
        }

        final void ensureSize(int i)
        {
            if (mData == null)
            {
                mData = new int[Math.max(i, 10) + 1];
                Arrays.fill(mData, -1);
            } else
            if (i >= mData.length)
            {
                int ai[] = mData;
                int j;
                for (j = mData.length; j <= i; j *= 2) { }
                mData = new int[j];
                System.arraycopy(ai, 0, mData, 0, ai.length);
                Arrays.fill(mData, ai.length, mData.length, -1);
                return;
            }
        }

        final void offsetForAddition(int i, int j)
        {
            throw new NullPointerException();
        }

        final void offsetForRemoval(int i, int j)
        {
            throw new NullPointerException();
        }
    }

    static class LazySpanLookup.FullSpanItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new LazySpanLookup.FullSpanItem(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new LazySpanLookup.FullSpanItem[i];
            }

        };
        int mGapDir;
        int mGapPerSpan[];
        boolean mHasUnwantedGapAfter;
        int mPosition;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder("FullSpanItem{mPosition=")).append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mPosition);
            parcel.writeInt(mGapDir);
            if (mHasUnwantedGapAfter)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (mGapPerSpan != null && mGapPerSpan.length > 0)
            {
                parcel.writeInt(mGapPerSpan.length);
                parcel.writeIntArray(mGapPerSpan);
                return;
            } else
            {
                parcel.writeInt(0);
                return;
            }
        }


        public LazySpanLookup.FullSpanItem()
        {
        }

        public LazySpanLookup.FullSpanItem(Parcel parcel)
        {
            boolean flag = true;
            super();
            mPosition = parcel.readInt();
            mGapDir = parcel.readInt();
            int i;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            mHasUnwantedGapAfter = flag;
            i = parcel.readInt();
            if (i > 0)
            {
                mGapPerSpan = new int[i];
                parcel.readIntArray(mGapPerSpan);
            }
        }
    }

    static class SavedState
        implements Parcelable
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
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int mSpanLookup[];
        int mSpanLookupSize;
        int mSpanOffsets[];
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            boolean flag = true;
            parcel.writeInt(mAnchorPosition);
            parcel.writeInt(mVisibleAnchorPosition);
            parcel.writeInt(mSpanOffsetsSize);
            if (mSpanOffsetsSize > 0)
            {
                parcel.writeIntArray(mSpanOffsets);
            }
            parcel.writeInt(mSpanLookupSize);
            if (mSpanLookupSize > 0)
            {
                parcel.writeIntArray(mSpanLookup);
            }
            if (mReverseLayout)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (mAnchorLayoutFromEnd)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (mLastLayoutRTL)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeList(mFullSpanItems);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag1 = true;
            super();
            mAnchorPosition = parcel.readInt();
            mVisibleAnchorPosition = parcel.readInt();
            mSpanOffsetsSize = parcel.readInt();
            if (mSpanOffsetsSize > 0)
            {
                mSpanOffsets = new int[mSpanOffsetsSize];
                parcel.readIntArray(mSpanOffsets);
            }
            mSpanLookupSize = parcel.readInt();
            if (mSpanLookupSize > 0)
            {
                mSpanLookup = new int[mSpanLookupSize];
                parcel.readIntArray(mSpanLookup);
            }
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mReverseLayout = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mAnchorLayoutFromEnd = flag;
            if (parcel.readInt() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            mLastLayoutRTL = flag;
            mFullSpanItems = parcel.readArrayList(android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getClassLoader());
        }

        public SavedState(SavedState savedstate)
        {
            mSpanOffsetsSize = savedstate.mSpanOffsetsSize;
            mAnchorPosition = savedstate.mAnchorPosition;
            mVisibleAnchorPosition = savedstate.mVisibleAnchorPosition;
            mSpanOffsets = savedstate.mSpanOffsets;
            mSpanLookupSize = savedstate.mSpanLookupSize;
            mSpanLookup = savedstate.mSpanLookup;
            mReverseLayout = savedstate.mReverseLayout;
            mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
            mLastLayoutRTL = savedstate.mLastLayoutRTL;
            mFullSpanItems = savedstate.mFullSpanItems;
        }
    }

    final class Span
    {

        int mCachedEnd;
        int mCachedStart;
        int mDeletedSize;
        final int mIndex;
        final StaggeredGridLayoutManager this$0;

        void calculateCachedEnd()
        {
            throw new NullPointerException();
        }

        void calculateCachedStart()
        {
            throw new NullPointerException();
        }

        final int getEndLine(int i)
        {
            throw new NullPointerException();
        }

        final int getStartLine(int i)
        {
            throw new NullPointerException();
        }
    }


    private final AnchorInfo mAnchorInfo;
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mHeightSpec;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private LayoutState mLayoutState;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    OrientationHelper mPrimaryOrientation;
    private boolean mReverseLayout;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private final Rect mTmpRect;
    private int mWidthSpec;

    private int computeScrollExtent(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureOrientationHelper();
            return ScrollbarHelper.computeScrollExtent(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart$2930a1b7(true), findFirstVisibleItemClosestToEnd$2930a1b7(true), this, false);
        }
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureOrientationHelper();
            return ScrollbarHelper.computeScrollOffset(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart$2930a1b7(true), findFirstVisibleItemClosestToEnd$2930a1b7(true), this, false, mShouldReverseLayout);
        }
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureOrientationHelper();
            return ScrollbarHelper.computeScrollRange(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart$2930a1b7(true), findFirstVisibleItemClosestToEnd$2930a1b7(true), this, false);
        }
    }

    private void ensureOrientationHelper()
    {
        if (mPrimaryOrientation == null)
        {
            mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, 0);
            mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1);
            mLayoutState = new LayoutState();
        }
    }

    private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
    {
        throw new NullPointerException();
    }

    private View findFirstVisibleItemClosestToEnd$2930a1b7(boolean flag)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int i = getChildCount() - 1; i >= 0;)
        {
            View view2 = getChildAt(i);
            int l = mPrimaryOrientation.getDecoratedStart(view2);
            int i1 = mPrimaryOrientation.getDecoratedEnd(view2);
            View view1 = view;
            if (i1 > j)
            {
                view1 = view;
                if (l < k)
                {
                    if (i1 <= k || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (view == null)
                    {
                        view1 = view2;
                    }
                }
            }
            i--;
            view = view1;
        }

        return view;
    }

    private View findFirstVisibleItemClosestToStart$2930a1b7(boolean flag)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        int l = getChildCount();
        View view = null;
        for (int i = 0; i < l;)
        {
            View view2 = getChildAt(i);
            int i1 = mPrimaryOrientation.getDecoratedStart(view2);
            View view1 = view;
            if (mPrimaryOrientation.getDecoratedEnd(view2) > j)
            {
                view1 = view;
                if (i1 < k)
                {
                    if (i1 >= j || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (view == null)
                    {
                        view1 = view2;
                    }
                }
            }
            i++;
            view = view1;
        }

        return view;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        mPrimaryOrientation.getEndAfterPadding();
        throw new NullPointerException();
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        mPrimaryOrientation.getStartAfterPadding();
        throw new NullPointerException();
    }

    private int getFirstChildPosition()
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(0));
        }
    }

    private int getLastChildPosition()
    {
        int i = getChildCount();
        if (i == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(i - 1));
        }
    }

    private void handleUpdate(int i, int j, int k)
    {
        int l;
        if (mShouldReverseLayout)
        {
            l = getLastChildPosition();
        } else
        {
            l = getFirstChildPosition();
        }
        if (k == 3)
        {
            if (i < j)
            {
                j++;
                i = j;
            } else
            {
                i++;
                i = j;
            }
        } else
        {
            k = i;
            i += j;
            i = k;
        }
        throw new NullPointerException();
    }

    private boolean isLayoutRTL()
    {
        return ViewCompat.getLayoutDirection(super.mRecyclerView) == 1;
    }

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (layoutstate.mAvailable == 0)
        {
            if (layoutstate.mLayoutDirection == -1)
            {
                recycleFromEnd(recycler, layoutstate.mEndLine);
                return;
            } else
            {
                recycleFromStart(recycler, layoutstate.mStartLine);
                return;
            }
        }
        if (layoutstate.mLayoutDirection == -1)
        {
            int i = layoutstate.mStartLine;
            i = layoutstate.mStartLine;
            throw new NullPointerException();
        } else
        {
            int j = layoutstate.mEndLine;
            throw new NullPointerException();
        }
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
    {
        int j = getChildCount() - 1;
        if (j >= 0)
        {
            recycler = getChildAt(j);
            if (mPrimaryOrientation.getDecoratedStart(recycler) >= i)
            {
                recycler = (LayoutParams)recycler.getLayoutParams();
                throw new NullPointerException();
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i)
    {
        if (getChildCount() > 0)
        {
            recycler = getChildAt(0);
            if (mPrimaryOrientation.getDecoratedEnd(recycler) <= i)
            {
                recycler = (LayoutParams)recycler.getLayoutParams();
                throw new NullPointerException();
            }
        }
    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag;
        if (!isLayoutRTL())
        {
            flag = mReverseLayout;
        } else
        if (!mReverseLayout)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mShouldReverseLayout = flag;
    }

    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        ensureOrientationHelper();
        int j;
        int k;
        if (i > 0)
        {
            j = 1;
            k = getLastChildPosition();
        } else
        {
            j = -1;
            k = getFirstChildPosition();
        }
        updateLayoutState$1991e86f(k);
        setLayoutStateDirection(j);
        mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + k;
        k = Math.abs(i);
        mLayoutState.mAvailable = k;
        j = fill(recycler, mLayoutState, state);
        if (k >= j)
        {
            if (i < 0)
            {
                i = -j;
            } else
            {
                i = j;
            }
        }
        mPrimaryOrientation.offsetChildren(-i);
        mLastLayoutFromEnd = mShouldReverseLayout;
        return i;
    }

    private void setLayoutStateDirection(int i)
    {
        boolean flag = true;
        mLayoutState.mLayoutDirection = i;
        LayoutState layoutstate = mLayoutState;
        boolean flag2 = mShouldReverseLayout;
        boolean flag1;
        if (i == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = -1;
        }
        layoutstate.mItemDirection = i;
    }

    private void updateLayoutState$1991e86f(int i)
    {
        mLayoutState.mAvailable = 0;
        mLayoutState.mCurrentPosition = i;
        if (super.mRecyclerView != null && RecyclerView.access$4300(super.mRecyclerView))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() + 0;
            mLayoutState.mEndLine = mPrimaryOrientation.getEndAfterPadding() + 0;
            return;
        } else
        {
            mLayoutState.mEndLine = mPrimaryOrientation.getEnd() + 0;
            mLayoutState.mStartLine = 0;
            return;
        }
    }

    private static int updateSpecWithExtra(int i, int j, int k)
    {
        int l;
        if (j != 0 || k != 0)
        {
            if ((l = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || l == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j - k, l);
            }
        }
        return i;
    }

    public final void assertNotInLayoutOrScroll(String s)
    {
        if (mPendingSavedState == null)
        {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    public final boolean canScrollHorizontally()
    {
        return true;
    }

    public final boolean canScrollVertically()
    {
        return false;
    }

    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int computeHorizontalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public final int computeHorizontalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public final int computeHorizontalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    public final int computeVerticalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public final int computeVerticalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public final int computeVerticalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    public final RecyclerView.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public final RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return super.getColumnCountForAccessibility(recycler, state);
    }

    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return 0;
    }

    public final void offsetChildrenHorizontal(int i)
    {
        super.offsetChildrenHorizontal(i);
    }

    public final void offsetChildrenVertical(int i)
    {
        super.offsetChildrenVertical(i);
    }

    public final void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        recyclerview = mCheckForGapsRunnable;
        if (super.mRecyclerView != null)
        {
            super.mRecyclerView.removeCallbacks(recyclerview);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            if (getChildCount() > 0)
            {
                accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
                view = findFirstVisibleItemClosestToStart$2930a1b7(false);
                view1 = findFirstVisibleItemClosestToEnd$2930a1b7(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i = getPosition(view);
        int j = getPosition(view1);
        if (i < j)
        {
            accessibilityevent.setFromIndex(i);
            accessibilityevent.setToIndex(j);
            return;
        } else
        {
            accessibilityevent.setFromIndex(j);
            accessibilityevent.setToIndex(i);
            return;
        }
    }

    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        recycler = view.getLayoutParams();
        if (!(recycler instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
            return;
        }
        recycler = (LayoutParams)recycler;
        int i;
        if (((LayoutParams) (recycler)).mSpan == null)
        {
            i = -1;
        } else
        {
            i = ((LayoutParams) (recycler)).mSpan.mIndex;
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain$430787b1(i, 1, -1, -1, false));
    }

    public final void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 0);
    }

    public final void onItemsChanged(RecyclerView recyclerview)
    {
        throw new NullPointerException();
    }

    public final void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        handleUpdate(i, j, 3);
    }

    public final void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 1);
    }

    public final void onItemsUpdated(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 2);
    }

    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        AnchorInfo anchorinfo;
        int i;
        ensureOrientationHelper();
        anchorinfo = mAnchorInfo;
        anchorinfo.mPosition = -1;
        anchorinfo.mOffset = 0x80000000;
        anchorinfo.mLayoutFromEnd = false;
        anchorinfo.mInvalidateOffsets = false;
        if (mPendingSavedState != null)
        {
            if (mPendingSavedState.mSpanOffsetsSize > 0 && mPendingSavedState.mSpanOffsetsSize != 0)
            {
                SavedState savedstate = mPendingSavedState;
                savedstate.mSpanOffsets = null;
                savedstate.mSpanOffsetsSize = 0;
                savedstate.mSpanLookupSize = 0;
                savedstate.mSpanLookup = null;
                savedstate.mFullSpanItems = null;
                mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
            }
            mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
            boolean flag = mPendingSavedState.mReverseLayout;
            assertNotInLayoutOrScroll(null);
            if (mPendingSavedState != null && mPendingSavedState.mReverseLayout != flag)
            {
                mPendingSavedState.mReverseLayout = flag;
            }
            mReverseLayout = flag;
            requestLayout();
            resolveShouldLayoutReverse();
            int j;
            int l;
            if (mPendingSavedState.mAnchorPosition != -1)
            {
                mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
                anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
            } else
            {
                anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
            }
            if (mPendingSavedState.mSpanLookupSize > 1)
            {
                int ai[] = mPendingSavedState.mSpanLookup;
                List list = mPendingSavedState.mFullSpanItems;
            }
        } else
        {
            resolveShouldLayoutReverse();
            anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
        }
        if (state.mInPreLayout || mPendingScrollPosition == -1)
        {
            i = 0;
        } else
        {
label0:
            {
                if (mPendingScrollPosition >= 0 && mPendingScrollPosition < state.getItemCount())
                {
                    break label0;
                }
                mPendingScrollPosition = -1;
                mPendingScrollPositionOffset = 0x80000000;
                i = 0;
            }
        }
_L11:
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!mLastLayoutFromEnd) goto _L4; else goto _L3
_L3:
        l = state.getItemCount();
        i = getChildCount() - 1;
_L20:
        if (i < 0) goto _L6; else goto _L5
_L5:
        j = getPosition(getChildAt(i));
        if (j < 0 || j >= l) goto _L8; else goto _L7
_L7:
        i = j;
_L21:
        anchorinfo.mPosition = i;
        anchorinfo.mOffset = 0x80000000;
_L2:
        if (mPendingSavedState == null && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
        {
            throw new NullPointerException();
        }
        if (getChildCount() > 0 && mPendingSavedState != null)
        {
            i = mPendingSavedState.mSpanOffsetsSize;
        }
        detachAndScrapAttachedViews(recycler);
        mLaidOutInvalidFullSpan = false;
        mSizePerSpan = mSecondaryOrientation.getTotalSpace() / 0;
        mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSecondaryOrientation.getTotalSpace(), 0x40000000);
        mHeightSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSizePerSpan, 0x40000000);
        mWidthSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        updateLayoutState$1991e86f(anchorinfo.mPosition);
        View view;
        int k;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        if (anchorinfo.mLayoutFromEnd)
        {
            setLayoutStateDirection(-1);
            fill(recycler, mLayoutState, state);
            setLayoutStateDirection(1);
            mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state);
        } else
        {
            setLayoutStateDirection(1);
            fill(recycler, mLayoutState, state);
            setLayoutStateDirection(-1);
            mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state);
        }
        if (getChildCount() > 0)
        {
            if (mShouldReverseLayout)
            {
                fixEndGap(recycler, state, true);
                fixStartGap(recycler, state, false);
            } else
            {
                fixStartGap(recycler, state, true);
                fixEndGap(recycler, state, false);
            }
        }
        if (!state.mInPreLayout)
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
        }
        mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
        mLastLayoutRTL = isLayoutRTL();
        mPendingSavedState = null;
        return;
        if (mPendingSavedState != null && mPendingSavedState.mAnchorPosition != -1 && mPendingSavedState.mSpanOffsetsSize > 0)
        {
            break MISSING_BLOCK_LABEL_1124;
        }
        view = findViewByPosition(mPendingScrollPosition);
        if (view == null) goto _L10; else goto _L9
_L9:
label1:
        {
            if (mShouldReverseLayout)
            {
                i = getLastChildPosition();
            } else
            {
                i = getFirstChildPosition();
            }
            anchorinfo.mPosition = i;
            if (mPendingScrollPositionOffset == 0x80000000)
            {
                break label1;
            }
            if (anchorinfo.mLayoutFromEnd)
            {
                anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(view);
            } else
            {
                anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(view);
            }
            i = 1;
        }
          goto _L11
        if (mPrimaryOrientation.getDecoratedMeasurement(view) > mPrimaryOrientation.getTotalSpace())
        {
            if (anchorinfo.mLayoutFromEnd)
            {
                i = mPrimaryOrientation.getEndAfterPadding();
            } else
            {
                i = mPrimaryOrientation.getStartAfterPadding();
            }
            anchorinfo.mOffset = i;
        } else
        {
            i = mPrimaryOrientation.getDecoratedStart(view) - mPrimaryOrientation.getStartAfterPadding();
            if (i < 0)
            {
                anchorinfo.mOffset = -i;
            } else
            {
                i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(view);
                if (i < 0)
                {
                    anchorinfo.mOffset = i;
                } else
                {
                    anchorinfo.mOffset = 0x80000000;
                }
            }
        }
_L16:
        i = 1;
          goto _L11
_L10:
        anchorinfo.mPosition = mPendingScrollPosition;
        if (mPendingScrollPositionOffset != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1071;
        }
        i = anchorinfo.mPosition;
        if (getChildCount() != 0) goto _L13; else goto _L12
_L12:
        if (mShouldReverseLayout) goto _L15; else goto _L14
_L14:
        i = -1;
_L18:
        if (i == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        anchorinfo.mLayoutFromEnd = flag1;
        if (anchorinfo.mLayoutFromEnd)
        {
            i = anchorinfo._fld0.mPrimaryOrientation.getEndAfterPadding();
        } else
        {
            i = anchorinfo._fld0.mPrimaryOrientation.getStartAfterPadding();
        }
        anchorinfo.mOffset = i;
_L19:
        anchorinfo.mInvalidateOffsets = true;
          goto _L16
_L13:
        if (i < getFirstChildPosition())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 == mShouldReverseLayout) goto _L15; else goto _L17
_L17:
        i = -1;
          goto _L18
_L15:
        i = 1;
          goto _L18
        i = mPendingScrollPositionOffset;
        if (anchorinfo.mLayoutFromEnd)
        {
            anchorinfo.mOffset = anchorinfo._fld0.mPrimaryOrientation.getEndAfterPadding() - i;
        } else
        {
            anchorinfo.mOffset = i + anchorinfo._fld0.mPrimaryOrientation.getStartAfterPadding();
        }
          goto _L19
        anchorinfo.mOffset = 0x80000000;
        anchorinfo.mPosition = mPendingScrollPosition;
          goto _L16
_L8:
        i--;
          goto _L20
_L6:
        i = 0;
          goto _L21
_L4:
        j1 = state.getItemCount();
        k1 = getChildCount();
        k = 0;
_L25:
        if (k >= k1) goto _L23; else goto _L22
_L22:
        i1 = getPosition(getChildAt(k));
        if (i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = i1;
        if (i1 < j1) goto _L21; else goto _L24
_L24:
        k++;
          goto _L25
_L23:
        i = 0;
          goto _L21
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            mPendingSavedState = (SavedState)parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        if (mPendingSavedState != null)
        {
            return new SavedState(mPendingSavedState);
        }
        SavedState savedstate = new SavedState();
        savedstate.mReverseLayout = mReverseLayout;
        savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
        savedstate.mLastLayoutRTL = mLastLayoutRTL;
        savedstate.mSpanLookupSize = 0;
        if (getChildCount() > 0)
        {
            ensureOrientationHelper();
            View view;
            int i;
            if (mLastLayoutFromEnd)
            {
                i = getLastChildPosition();
            } else
            {
                i = getFirstChildPosition();
            }
            savedstate.mAnchorPosition = i;
            if (mShouldReverseLayout)
            {
                view = findFirstVisibleItemClosestToEnd$2930a1b7(true);
            } else
            {
                view = findFirstVisibleItemClosestToStart$2930a1b7(true);
            }
            if (view == null)
            {
                i = -1;
            } else
            {
                i = getPosition(view);
            }
            savedstate.mVisibleAnchorPosition = i;
            savedstate.mSpanOffsetsSize = 0;
            savedstate.mSpanOffsets = new int[0];
            return savedstate;
        } else
        {
            savedstate.mAnchorPosition = -1;
            savedstate.mVisibleAnchorPosition = -1;
            savedstate.mSpanOffsetsSize = 0;
            return savedstate;
        }
    }

    public final void onScrollStateChanged(int i)
    {
        if (i == 0)
        {
            getChildCount();
        }
    }

    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public final void scrollToPosition(int i)
    {
        if (mPendingSavedState != null && mPendingSavedState.mAnchorPosition != i)
        {
            SavedState savedstate = mPendingSavedState;
            savedstate.mSpanOffsets = null;
            savedstate.mSpanOffsetsSize = 0;
            savedstate.mAnchorPosition = -1;
            savedstate.mVisibleAnchorPosition = -1;
        }
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public final boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null;
    }
}
