// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ScrollbarHelper, OrientationHelper, RecyclerView, ChildHelper

public class LinearLayoutManager extends RecyclerView.LayoutManager
{
    final class AnchorInfo
    {

        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        final LinearLayoutManager this$0;

        final void assignCoordinateFromPadding()
        {
            int i;
            if (mLayoutFromEnd)
            {
                i = mOrientationHelper.getEndAfterPadding();
            } else
            {
                i = mOrientationHelper.getStartAfterPadding();
            }
            mCoordinate = i;
        }

        public final void assignFromView(View view)
        {
            if (mLayoutFromEnd)
            {
                mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
            } else
            {
                mCoordinate = mOrientationHelper.getDecoratedStart(view);
            }
            mPosition = LinearLayoutManager.getPosition(view);
        }

        public final String toString()
        {
            return (new StringBuilder("AnchorInfo{mPosition=")).append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append('}').toString();
        }

        AnchorInfo()
        {
            this$0 = LinearLayoutManager.this;
            super();
        }
    }

    protected static final class LayoutChunkResult
    {

        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult()
        {
        }
    }

    static final class LayoutState
    {

        int mAvailable;
        int mCurrentPosition;
        int mExtra;
        boolean mIsPreLayout;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle;
        List mScrapList;
        int mScrollingOffset;

        public final void assignPositionFromScrapList(RecyclerView.ViewHolder viewholder)
        {
_L2:
            int j;
            if (viewholder2 == null)
            {
                j = -1;
            } else
            {
                j = viewholder2.getLayoutPosition();
            }
            mCurrentPosition = j;
            return;
            int i1 = mScrapList.size();
            RecyclerView.ViewHolder viewholder1 = null;
            int i = 0x7fffffff;
            RecyclerView.ViewHolder viewholder2;
            for (int k = 0; k < i1; k++)
            {
                viewholder2 = (RecyclerView.ViewHolder)mScrapList.get(k);
                if (viewholder2 != viewholder && !viewholder2.isRemoved())
                {
                    int l = (viewholder2.getLayoutPosition() - mCurrentPosition) * mItemDirection;
                    if (l >= 0 && l < i)
                    {
                        if (l == 0)
                        {
                            break MISSING_BLOCK_LABEL_102;
                        }
                        viewholder1 = viewholder2;
                        i = l;
                    }
                }
            }

            viewholder2 = viewholder1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        final boolean hasMore(RecyclerView.State state)
        {
            return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
        }

        final View next(RecyclerView.Recycler recycler)
        {
            if (mScrapList != null)
            {
                int j = mScrapList.size();
                for (int i = 0; i < j; i++)
                {
                    recycler = (RecyclerView.ViewHolder)mScrapList.get(i);
                    if (!recycler.isRemoved() && mCurrentPosition == recycler.getLayoutPosition())
                    {
                        assignPositionFromScrapList(recycler);
                        return ((RecyclerView.ViewHolder) (recycler)).itemView;
                    }
                }

                return null;
            } else
            {
                recycler = recycler.getViewForPosition(mCurrentPosition);
                mCurrentPosition = mCurrentPosition + mItemDirection;
                return recycler;
            }
        }

        LayoutState()
        {
            mRecycle = true;
            mExtra = 0;
            mIsPreLayout = false;
            mScrapList = null;
        }
    }

    public static class SavedState
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
        int mAnchorOffset;
        public int mAnchorPosition;

        public int describeContents()
        {
            return 0;
        }

        final boolean hasValidAnchor()
        {
            return mAnchorPosition >= 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mAnchorPosition);
            parcel.writeInt(mAnchorOffset);
            if (mAnchorLayoutFromEnd)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag = true;
            super();
            mAnchorPosition = parcel.readInt();
            mAnchorOffset = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            mAnchorLayoutFromEnd = flag;
        }

        public SavedState(SavedState savedstate)
        {
            mAnchorPosition = savedstate.mAnchorPosition;
            mAnchorOffset = savedstate.mAnchorOffset;
            mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
        }
    }


    final AnchorInfo mAnchorInfo;
    private boolean mLastStackFromEnd;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager()
    {
        this((byte)0);
    }

    private LinearLayoutManager(byte byte0)
    {
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mStackFromEnd = false;
        mSmoothScrollbarEnabled = true;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mPendingSavedState = null;
        mAnchorInfo = new AnchorInfo();
        assertNotInLayoutOrScroll(null);
        if (1 != mOrientation)
        {
            mOrientation = 1;
            mOrientationHelper = null;
            requestLayout();
        }
        assertNotInLayoutOrScroll(null);
    }

    private int computeScrollExtent(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationhelper = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart$2930a1b7(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleChildClosestToEnd$2930a1b7(flag), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationhelper = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart$2930a1b7(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleChildClosestToEnd$2930a1b7(flag), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationhelper = mOrientationHelper;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleChildClosestToStart$2930a1b7(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleChildClosestToEnd$2930a1b7(flag), this, mSmoothScrollbarEnabled);
    }

    private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
    {
        int k = layoutstate.mAvailable;
        if (layoutstate.mScrollingOffset != 0x80000000)
        {
            if (layoutstate.mAvailable < 0)
            {
                layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
            }
            recycleByLayoutState(recycler, layoutstate);
        }
        int i = layoutstate.mAvailable + layoutstate.mExtra;
        LayoutChunkResult layoutchunkresult = new LayoutChunkResult();
label0:
        do
        {
            int j;
            do
            {
label1:
                {
                    if (i <= 0 || !layoutstate.hasMore(state))
                    {
                        break label0;
                    }
                    layoutchunkresult.mConsumed = 0;
                    layoutchunkresult.mFinished = false;
                    layoutchunkresult.mIgnoreConsumed = false;
                    layoutchunkresult.mFocusable = false;
                    layoutChunk(recycler, state, layoutstate, layoutchunkresult);
                    if (layoutchunkresult.mFinished)
                    {
                        break label0;
                    }
                    layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
                    if (layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
                    {
                        j = i;
                        if (state.mInPreLayout)
                        {
                            break label1;
                        }
                    }
                    layoutstate.mAvailable = layoutstate.mAvailable - layoutchunkresult.mConsumed;
                    j = i - layoutchunkresult.mConsumed;
                }
                if (layoutstate.mScrollingOffset != 0x80000000)
                {
                    layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutchunkresult.mConsumed;
                    if (layoutstate.mAvailable < 0)
                    {
                        layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
                    }
                    recycleByLayoutState(recycler, layoutstate);
                }
                i = j;
            } while (!flag);
            i = j;
        } while (!layoutchunkresult.mFocusable);
        return k - layoutstate.mAvailable;
    }

    private View findFirstReferenceChild(int i)
    {
        return findReferenceChild(0, getChildCount(), i);
    }

    private View findFirstVisibleChildClosestToEnd$2930a1b7(boolean flag)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(0, getChildCount(), flag, true);
        } else
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, true);
        }
    }

    private View findFirstVisibleChildClosestToStart$2930a1b7(boolean flag)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, true);
        } else
        {
            return findOneVisibleChild(0, getChildCount(), flag, true);
        }
    }

    private View findLastReferenceChild(int i)
    {
        return findReferenceChild(getChildCount() - 1, -1, i);
    }

    private View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
    {
        ensureLayoutState();
        int k = mOrientationHelper.getStartAfterPadding();
        int l = mOrientationHelper.getEndAfterPadding();
        View view;
        View view1;
        byte byte0;
        if (j > i)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        for (view = null; i != j; view = view1)
        {
            View view2 = getChildAt(i);
            int i1 = mOrientationHelper.getDecoratedStart(view2);
            int j1 = mOrientationHelper.getDecoratedEnd(view2);
            view1 = view;
            if (i1 < l)
            {
                view1 = view;
                if (j1 > k)
                {
                    if (!flag || i1 >= k && j1 <= l)
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
            i += byte0;
        }

        return view;
    }

    private View findReferenceChildClosestToEnd(RecyclerView.State state)
    {
        if (mShouldReverseLayout)
        {
            return findFirstReferenceChild(state.getItemCount());
        } else
        {
            return findLastReferenceChild(state.getItemCount());
        }
    }

    private View findReferenceChildClosestToStart(RecyclerView.State state)
    {
        if (mShouldReverseLayout)
        {
            return findLastReferenceChild(state.getItemCount());
        } else
        {
            return findFirstReferenceChild(state.getItemCount());
        }
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j = mOrientationHelper.getEndAfterPadding() - i;
        if (j > 0)
        {
            int k = -scrollBy(-j, recycler, state);
            j = k;
            if (flag)
            {
                i = mOrientationHelper.getEndAfterPadding() - (i + k);
                j = k;
                if (i > 0)
                {
                    mOrientationHelper.offsetChildren(i);
                    j = k + i;
                }
            }
            return j;
        } else
        {
            return 0;
        }
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j = i - mOrientationHelper.getStartAfterPadding();
        if (j > 0)
        {
            int k = -scrollBy(j, recycler, state);
            j = k;
            if (flag)
            {
                i = (i + k) - mOrientationHelper.getStartAfterPadding();
                j = k;
                if (i > 0)
                {
                    mOrientationHelper.offsetChildren(-i);
                    j = k - i;
                }
            }
            return j;
        } else
        {
            return 0;
        }
    }

    private View getChildClosestToEnd()
    {
        int i;
        if (mShouldReverseLayout)
        {
            i = 0;
        } else
        {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    private View getChildClosestToStart()
    {
        int i;
        if (mShouldReverseLayout)
        {
            i = getChildCount() - 1;
        } else
        {
            i = 0;
        }
        return getChildAt(i);
    }

    private int getExtraLayoutSpace(RecyclerView.State state)
    {
        int i = 0;
        boolean flag;
        if (state.mTargetPosition != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = mOrientationHelper.getTotalSpace();
        }
        return i;
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (layoutstate.mRecycle) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (layoutstate.mLayoutDirection != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = layoutstate.mScrollingOffset;
        int j1 = getChildCount();
        if (i >= 0)
        {
            int l1 = mOrientationHelper.getEnd() - i;
            if (mShouldReverseLayout)
            {
                int j = 0;
                while (j < j1) 
                {
                    layoutstate = getChildAt(j);
                    if (mOrientationHelper.getDecoratedStart(layoutstate) < l1)
                    {
                        recycleChildren(recycler, 0, j);
                        return;
                    }
                    j++;
                }
            } else
            {
                int k = j1 - 1;
                while (k >= 0) 
                {
                    layoutstate = getChildAt(k);
                    if (mOrientationHelper.getDecoratedStart(layoutstate) < l1)
                    {
                        recycleChildren(recycler, j1 - 1, k);
                        return;
                    }
                    k--;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k1;
        int i2;
        k1 = layoutstate.mScrollingOffset;
        if (k1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i2 = getChildCount();
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = i2 - 1;
        while (l >= 0) 
        {
            layoutstate = getChildAt(l);
            if (mOrientationHelper.getDecoratedEnd(layoutstate) > k1)
            {
                recycleChildren(recycler, i2 - 1, l);
                return;
            }
            l--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i1 = 0;
        while (i1 < i2) 
        {
            layoutstate = getChildAt(i1);
            if (mOrientationHelper.getDecoratedEnd(layoutstate) > k1)
            {
                recycleChildren(recycler, 0, i1);
                return;
            }
            i1++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i, int j)
    {
        if (i != j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j <= i)
        {
            break; /* Loop/switch isn't completed */
        }
        j--;
        while (j >= i) 
        {
            removeAndRecycleViewAt(j, recycler);
            j--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (i > j) 
        {
            removeAndRecycleViewAt(i, recycler);
            i--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag = true;
        if (mOrientation == 1 || !isLayoutRTL())
        {
            flag = false;
        }
        mShouldReverseLayout = flag;
    }

    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (getChildCount() != 0 && i != 0)
        {
            mLayoutState.mRecycle = true;
            ensureLayoutState();
            int j;
            int k;
            int l;
            if (i > 0)
            {
                j = 1;
            } else
            {
                j = -1;
            }
            k = Math.abs(i);
            updateLayoutState(j, k, true, state);
            l = mLayoutState.mScrollingOffset + fill(recycler, mLayoutState, state, false);
            if (l >= 0)
            {
                if (k > l)
                {
                    i = j * l;
                }
                mOrientationHelper.offsetChildren(-i);
                mLayoutState.mLastScrollDelta = i;
                return i;
            }
        }
        return 0;
    }

    private void updateLayoutState(int i, int j, boolean flag, RecyclerView.State state)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        mLayoutState.mExtra = getExtraLayoutSpace(state);
        mLayoutState.mLayoutDirection = i;
        if (i == 1)
        {
            state = mLayoutState;
            state.mExtra = ((LayoutState) (state)).mExtra + mOrientationHelper.getEndPadding();
            state = getChildClosestToEnd();
            LayoutState layoutstate = mLayoutState;
            if (mShouldReverseLayout)
            {
                i = byte0;
            } else
            {
                i = 1;
            }
            layoutstate.mItemDirection = i;
            mLayoutState.mCurrentPosition = getPosition(state) + mLayoutState.mItemDirection;
            mLayoutState.mOffset = mOrientationHelper.getDecoratedEnd(state);
            i = mOrientationHelper.getDecoratedEnd(state) - mOrientationHelper.getEndAfterPadding();
        } else
        {
            state = getChildClosestToStart();
            LayoutState layoutstate1 = mLayoutState;
            layoutstate1.mExtra = layoutstate1.mExtra + mOrientationHelper.getStartAfterPadding();
            layoutstate1 = mLayoutState;
            if (mShouldReverseLayout)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = -1;
            }
            layoutstate1.mItemDirection = i;
            mLayoutState.mCurrentPosition = getPosition(state) + mLayoutState.mItemDirection;
            mLayoutState.mOffset = mOrientationHelper.getDecoratedStart(state);
            i = -mOrientationHelper.getDecoratedStart(state) + mOrientationHelper.getStartAfterPadding();
        }
        mLayoutState.mAvailable = j;
        if (flag)
        {
            state = mLayoutState;
            state.mAvailable = ((LayoutState) (state)).mAvailable - i;
        }
        mLayoutState.mScrollingOffset = i;
    }

    private void updateLayoutStateToFillEnd(int i, int j)
    {
        mLayoutState.mAvailable = mOrientationHelper.getEndAfterPadding() - j;
        LayoutState layoutstate = mLayoutState;
        int k;
        if (mShouldReverseLayout)
        {
            k = -1;
        } else
        {
            k = 1;
        }
        layoutstate.mItemDirection = k;
        mLayoutState.mCurrentPosition = i;
        mLayoutState.mLayoutDirection = 1;
        mLayoutState.mOffset = j;
        mLayoutState.mScrollingOffset = 0x80000000;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorinfo)
    {
        updateLayoutStateToFillEnd(anchorinfo.mPosition, anchorinfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(int i, int j)
    {
        mLayoutState.mAvailable = j - mOrientationHelper.getStartAfterPadding();
        mLayoutState.mCurrentPosition = i;
        LayoutState layoutstate = mLayoutState;
        if (mShouldReverseLayout)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        layoutstate.mItemDirection = i;
        mLayoutState.mLayoutDirection = -1;
        mLayoutState.mOffset = j;
        mLayoutState.mScrollingOffset = 0x80000000;
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorinfo)
    {
        updateLayoutStateToFillStart(anchorinfo.mPosition, anchorinfo.mCoordinate);
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
        return mOrientation == 0;
    }

    public final boolean canScrollVertically()
    {
        return mOrientation == 1;
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

    final void ensureLayoutState()
    {
        if (mLayoutState == null)
        {
            mLayoutState = new LayoutState();
        }
        if (mOrientationHelper == null)
        {
            mOrientationHelper = OrientationHelper.createOrientationHelper(this, mOrientation);
        }
    }

    public final int findFirstVisibleItemPosition()
    {
        View view = findOneVisibleChild(0, getChildCount(), false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    View findReferenceChild(int i, int j, int k)
    {
        View view1;
label0:
        {
            View view2;
label1:
            {
                ensureLayoutState();
                view1 = null;
                Object obj = null;
                int i1 = mOrientationHelper.getStartAfterPadding();
                int j1 = mOrientationHelper.getEndAfterPadding();
                int l;
                if (j > i)
                {
                    l = 1;
                } else
                {
                    l = -1;
                }
                while (i != j) 
                {
                    View view = getChildAt(i);
                    int k1 = getPosition(view);
                    view2 = view1;
                    View view3 = obj;
                    if (k1 >= 0)
                    {
                        view2 = view1;
                        view3 = obj;
                        if (k1 < k)
                        {
                            if (((RecyclerView.LayoutParams)view.getLayoutParams()).mViewHolder.isRemoved())
                            {
                                view2 = view1;
                                view3 = obj;
                                if (view1 == null)
                                {
                                    view3 = obj;
                                    view2 = view;
                                }
                            } else
                            {
                                if (mOrientationHelper.getDecoratedStart(view) < j1)
                                {
                                    view2 = view;
                                    if (mOrientationHelper.getDecoratedEnd(view) >= i1)
                                    {
                                        break label1;
                                    }
                                }
                                view2 = view1;
                                view3 = obj;
                                if (obj == null)
                                {
                                    view2 = view1;
                                    view3 = view;
                                }
                            }
                        }
                    }
                    i += l;
                    view1 = view2;
                    obj = view3;
                }
                if (obj == null)
                {
                    break label0;
                }
                view2 = obj;
            }
            return view2;
        }
        return view1;
    }

    public final View findViewByPosition(int i)
    {
        int j = getChildCount();
        if (j != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k = i - getPosition(getChildAt(0));
        if (k < 0 || k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(k);
        view = view1;
        if (getPosition(view1) == i) goto _L4; else goto _L3
_L3:
        return super.findViewByPosition(i);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams()
    {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    protected final boolean isLayoutRTL()
    {
        return ViewCompat.getLayoutDirection(super.mRecyclerView) == 1;
    }

    void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutstate, LayoutChunkResult layoutchunkresult)
    {
        recycler = layoutstate.next(recycler);
        if (recycler == null)
        {
            layoutchunkresult.mFinished = true;
            return;
        }
        state = (RecyclerView.LayoutParams)recycler.getLayoutParams();
        int i;
        int j;
        int k;
        int l;
        if (layoutstate.mScrapList == null)
        {
            boolean flag2 = mShouldReverseLayout;
            boolean flag;
            if (layoutstate.mLayoutDirection == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                super.addViewInt(recycler, -1, false);
            } else
            {
                super.addViewInt(recycler, 0, false);
            }
        } else
        {
            boolean flag3 = mShouldReverseLayout;
            boolean flag1;
            if (layoutstate.mLayoutDirection == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                super.addViewInt(recycler, -1, true);
            } else
            {
                super.addViewInt(recycler, 0, true);
            }
        }
        measureChildWithMargins(recycler, 0, 0);
        layoutchunkresult.mConsumed = mOrientationHelper.getDecoratedMeasurement(recycler);
        if (mOrientation == 1)
        {
            if (isLayoutRTL())
            {
                k = getWidth() - getPaddingRight();
                j = k - mOrientationHelper.getDecoratedMeasurementInOther(recycler);
            } else
            {
                j = getPaddingLeft();
                k = j + mOrientationHelper.getDecoratedMeasurementInOther(recycler);
            }
            if (layoutstate.mLayoutDirection == -1)
            {
                i = layoutstate.mOffset;
                l = layoutstate.mOffset - layoutchunkresult.mConsumed;
            } else
            {
                l = layoutstate.mOffset;
                i = layoutstate.mOffset + layoutchunkresult.mConsumed;
            }
        } else
        {
            l = getPaddingTop();
            i = l + mOrientationHelper.getDecoratedMeasurementInOther(recycler);
            if (layoutstate.mLayoutDirection == -1)
            {
                k = layoutstate.mOffset;
                j = layoutstate.mOffset - layoutchunkresult.mConsumed;
            } else
            {
                j = layoutstate.mOffset;
                k = layoutstate.mOffset + layoutchunkresult.mConsumed;
            }
        }
        layoutDecorated(recycler, ((RecyclerView.LayoutParams) (state)).leftMargin + j, ((RecyclerView.LayoutParams) (state)).topMargin + l, k - ((RecyclerView.LayoutParams) (state)).rightMargin, i - ((RecyclerView.LayoutParams) (state)).bottomMargin);
        if (((RecyclerView.LayoutParams) (state)).mViewHolder.isRemoved() || ((RecyclerView.LayoutParams) (state)).mViewHolder.isChanged())
        {
            layoutchunkresult.mIgnoreConsumed = true;
        }
        layoutchunkresult.mFocusable = recycler.isFocusable();
    }

    void onAnchorReady(RecyclerView.State state, AnchorInfo anchorinfo)
    {
    }

    public final void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        super.onDetachedFromWindow(recyclerview, recycler);
    }

    public final View onFocusSearchFailed$1539f5dc(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        resolveShouldLayoutReverse();
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        state = null;
_L13:
        return state;
_L2:
        i;
        JVM INSTR lookupswitch 6: default 76
    //                   1: 87
    //                   2: 92
    //                   17: 135
    //                   33: 97
    //                   66: 153
    //                   130: 116;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i = 0x80000000;
_L11:
        if (i == 0x80000000)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = -1;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L7:
        if (mOrientation == 1)
        {
            i = -1;
        } else
        {
            i = 0x80000000;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (mOrientation == 1)
        {
            i = 1;
        } else
        {
            i = 0x80000000;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (mOrientation == 0)
        {
            i = -1;
        } else
        {
            i = 0x80000000;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (mOrientation == 0)
        {
            i = 1;
        } else
        {
            i = 0x80000000;
        }
        if (true) goto _L11; else goto _L10
_L10:
        ensureLayoutState();
        View view;
        if (i == -1)
        {
            view = findReferenceChildClosestToStart(state);
        } else
        {
            view = findReferenceChildClosestToEnd(state);
        }
        if (view == null)
        {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(i, (int)(0.33F * (float)mOrientationHelper.getTotalSpace()), false, state);
        mLayoutState.mScrollingOffset = 0x80000000;
        mLayoutState.mRecycle = false;
        fill(recycler, mLayoutState, state, true);
        if (i == -1)
        {
            recycler = getChildClosestToStart();
        } else
        {
            recycler = getChildClosestToEnd();
        }
        if (recycler == view)
        {
            break; /* Loop/switch isn't completed */
        }
        state = recycler;
        if (recycler.isFocusable()) goto _L13; else goto _L12
_L12:
        return null;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        int i = -1;
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (getChildCount() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            accessibilityevent.setFromIndex(findFirstVisibleItemPosition());
            View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
            if (view != null)
            {
                i = getPosition(view);
            }
            accessibilityevent.setToIndex(i);
        }
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        Object obj;
        AnchorInfo anchorinfo;
        int i;
        int k;
        if (mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
        {
            mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        obj = mAnchorInfo;
        obj.mPosition = -1;
        obj.mCoordinate = 0x80000000;
        obj.mLayoutFromEnd = false;
        mAnchorInfo.mLayoutFromEnd = mShouldReverseLayout ^ false;
        anchorinfo = mAnchorInfo;
        RecyclerView.LayoutParams layoutparams;
        int k1;
        if (state.mInPreLayout || mPendingScrollPosition == -1)
        {
            i = 0;
        } else
        if (mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            i = 0;
        } else
        {
label0:
            {
                anchorinfo.mPosition = mPendingScrollPosition;
                if (mPendingSavedState == null || !mPendingSavedState.hasValidAnchor())
                {
                    break label0;
                }
                anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
                if (anchorinfo.mLayoutFromEnd)
                {
                    anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
                } else
                {
                    anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
                }
                i = 1;
            }
        }
_L8:
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (getChildCount() == 0)
        {
            break MISSING_BLOCK_LABEL_1679;
        }
        boolean flag;
        if (super.mRecyclerView == null)
        {
            obj = null;
        } else
        {
            obj = super.mRecyclerView.getFocusedChild();
            if (obj == null || super.mChildHelper.isHidden(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        if (!layoutparams.mViewHolder.isRemoved() && layoutparams.mViewHolder.getLayoutPosition() >= 0 && layoutparams.mViewHolder.getLayoutPosition() < state.getItemCount())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L5
_L5:
        k = anchorinfo._fld0.mOrientationHelper.getTotalSpaceChange();
        if (k >= 0)
        {
            anchorinfo.assignFromView(((View) (obj)));
        } else
        {
            anchorinfo.mPosition = getPosition(((View) (obj)));
            if (anchorinfo.mLayoutFromEnd)
            {
                i = anchorinfo._fld0.mOrientationHelper.getEndAfterPadding() - k - anchorinfo._fld0.mOrientationHelper.getDecoratedEnd(((View) (obj)));
                anchorinfo.mCoordinate = anchorinfo._fld0.mOrientationHelper.getEndAfterPadding() - i;
                if (i > 0)
                {
                    k = anchorinfo._fld0.mOrientationHelper.getDecoratedMeasurement(((View) (obj)));
                    i1 = anchorinfo.mCoordinate;
                    j1 = anchorinfo._fld0.mOrientationHelper.getStartAfterPadding();
                    k = i1 - k - (Math.min(anchorinfo._fld0.mOrientationHelper.getDecoratedStart(((View) (obj))) - j1, 0) + j1);
                    if (k < 0)
                    {
                        i1 = anchorinfo.mCoordinate;
                        anchorinfo.mCoordinate = Math.min(i, -k) + i1;
                    }
                }
            } else
            {
                i1 = anchorinfo._fld0.mOrientationHelper.getDecoratedStart(((View) (obj)));
                i = i1 - anchorinfo._fld0.mOrientationHelper.getStartAfterPadding();
                anchorinfo.mCoordinate = i1;
                if (i > 0)
                {
                    j1 = anchorinfo._fld0.mOrientationHelper.getDecoratedMeasurement(((View) (obj)));
                    int l1 = anchorinfo._fld0.mOrientationHelper.getEndAfterPadding();
                    int l2 = anchorinfo._fld0.mOrientationHelper.getDecoratedEnd(((View) (obj)));
                    k = anchorinfo._fld0.mOrientationHelper.getEndAfterPadding() - Math.min(0, l1 - k - l2) - (i1 + j1);
                    if (k < 0)
                    {
                        anchorinfo.mCoordinate = anchorinfo.mCoordinate - Math.min(i, -k);
                    }
                }
            }
        }
        i = 1;
_L11:
        if (i == 0)
        {
            anchorinfo.assignCoordinateFromPadding();
            anchorinfo.mPosition = 0;
        }
_L2:
        i = getExtraLayoutSpace(state);
        int i1;
        int j1;
        if (mLayoutState.mLastScrollDelta >= 0)
        {
            k = 0;
        } else
        {
            k = i;
            i = 0;
        }
        i1 = k + mOrientationHelper.getStartAfterPadding();
        j1 = i + mOrientationHelper.getEndPadding();
        i = j1;
        k = i1;
        if (state.mInPreLayout)
        {
            i = j1;
            k = i1;
            if (mPendingScrollPosition != -1)
            {
                i = j1;
                k = i1;
                if (mPendingScrollPositionOffset != 0x80000000)
                {
                    obj = findViewByPosition(mPendingScrollPosition);
                    i = j1;
                    k = i1;
                    if (obj != null)
                    {
                        if (mShouldReverseLayout)
                        {
                            i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (obj))) - mPendingScrollPositionOffset;
                        } else
                        {
                            i = mOrientationHelper.getDecoratedStart(((View) (obj)));
                            k = mOrientationHelper.getStartAfterPadding();
                            i = mPendingScrollPositionOffset - (i - k);
                        }
                        if (i > 0)
                        {
                            k = i1 + i;
                            i = j1;
                        } else
                        {
                            i = j1 - i;
                            k = i1;
                        }
                    }
                }
            }
        }
        onAnchorReady(state, mAnchorInfo);
        detachAndScrapAttachedViews(recycler);
        mLayoutState.mIsPreLayout = state.mInPreLayout;
        if (mAnchorInfo.mLayoutFromEnd)
        {
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.mExtra = k;
            fill(recycler, mLayoutState, state, false);
            i1 = mLayoutState.mOffset;
            k1 = mLayoutState.mCurrentPosition;
            k = i;
            if (mLayoutState.mAvailable > 0)
            {
                k = i + mLayoutState.mAvailable;
            }
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.mExtra = k;
            obj = mLayoutState;
            obj.mCurrentPosition = ((LayoutState) (obj)).mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state, false);
            j1 = mLayoutState.mOffset;
            i = j1;
            k = i1;
            if (mLayoutState.mAvailable > 0)
            {
                i = mLayoutState.mAvailable;
                updateLayoutStateToFillStart(k1, i1);
                mLayoutState.mExtra = i;
                fill(recycler, mLayoutState, state, false);
                k = mLayoutState.mOffset;
                i = j1;
            }
        } else
        {
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.mExtra = i;
            fill(recycler, mLayoutState, state, false);
            i1 = mLayoutState.mOffset;
            int i2 = mLayoutState.mCurrentPosition;
            i = k;
            if (mLayoutState.mAvailable > 0)
            {
                i = k + mLayoutState.mAvailable;
            }
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.mExtra = i;
            LayoutState layoutstate = mLayoutState;
            layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state, false);
            j1 = mLayoutState.mOffset;
            i = i1;
            k = j1;
            if (mLayoutState.mAvailable > 0)
            {
                i = mLayoutState.mAvailable;
                updateLayoutStateToFillEnd(i2, i1);
                mLayoutState.mExtra = i;
                fill(recycler, mLayoutState, state, false);
                i = mLayoutState.mOffset;
                k = j1;
            }
        }
        i1 = i;
        j1 = k;
        if (getChildCount() > 0)
        {
            if (mShouldReverseLayout ^ false)
            {
                i1 = fixLayoutEndGap(i, recycler, state, true);
                j1 = k + i1;
                k = fixLayoutStartGap(j1, recycler, state, false);
                j1 += k;
                i1 = i + i1 + k;
            } else
            {
                i1 = fixLayoutStartGap(k, recycler, state, true);
                i += i1;
                int j2 = fixLayoutEndGap(i, recycler, state, false);
                j1 = k + i1 + j2;
                i1 = i + j2;
            }
        }
        if (state.mRunPredictiveAnimations && getChildCount() != 0 && !state.mInPreLayout && supportsPredictiveItemAnimations())
        {
            int j = 0;
            int l = 0;
            List list = recycler.mUnmodifiableAttachedScrap;
            int l3 = list.size();
            int i4 = getPosition(getChildAt(0));
            int k2 = 0;
            while (k2 < l3) 
            {
                RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(k2);
                if (!viewholder.isRemoved())
                {
                    int i3;
                    boolean flag1;
                    if (viewholder.getLayoutPosition() < i4)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != mShouldReverseLayout)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = mOrientationHelper.getDecoratedMeasurement(viewholder.itemView) + j;
                        j = l;
                        l = i3;
                    } else
                    {
                        int j3 = mOrientationHelper.getDecoratedMeasurement(viewholder.itemView) + l;
                        l = j;
                        j = j3;
                    }
                } else
                {
                    int k3 = j;
                    j = l;
                    l = k3;
                }
                i3 = k2 + 1;
                k2 = l;
                l = j;
                j = k2;
                k2 = i3;
            }
            mLayoutState.mScrapList = list;
            if (j > 0)
            {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), j1);
                mLayoutState.mExtra = j;
                mLayoutState.mAvailable = 0;
                mLayoutState.assignPositionFromScrapList(null);
                fill(recycler, mLayoutState, state, false);
            }
            if (l > 0)
            {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i1);
                mLayoutState.mExtra = l;
                mLayoutState.mAvailable = 0;
                mLayoutState.assignPositionFromScrapList(null);
                fill(recycler, mLayoutState, state, false);
            }
            mLayoutState.mScrapList = null;
        }
        if (!state.mInPreLayout)
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            recycler = mOrientationHelper;
            recycler.mLastTotalSpace = recycler.getTotalSpace();
        }
        mLastStackFromEnd = false;
        mPendingSavedState = null;
        return;
        if (mPendingScrollPositionOffset != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1140;
        }
        obj = findViewByPosition(mPendingScrollPosition);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (mOrientationHelper.getDecoratedMeasurement(((View) (obj))) > mOrientationHelper.getTotalSpace())
        {
            anchorinfo.assignCoordinateFromPadding();
        } else
        if (mOrientationHelper.getDecoratedStart(((View) (obj))) - mOrientationHelper.getStartAfterPadding() < 0)
        {
            anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
            anchorinfo.mLayoutFromEnd = false;
        } else
        {
label1:
            {
                if (mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (obj))) >= 0)
                {
                    break label1;
                }
                anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
                anchorinfo.mLayoutFromEnd = true;
            }
        }
_L10:
        i = 1;
          goto _L8
        if (anchorinfo.mLayoutFromEnd)
        {
            i = mOrientationHelper.getDecoratedEnd(((View) (obj))) + mOrientationHelper.getTotalSpaceChange();
        } else
        {
            i = mOrientationHelper.getDecoratedStart(((View) (obj)));
        }
        anchorinfo.mCoordinate = i;
_L9:
        i = 1;
          goto _L8
_L7:
        if (getChildCount() > 0)
        {
            i = getPosition(getChildAt(0));
            if (mPendingScrollPosition < i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == mShouldReverseLayout)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            anchorinfo.mLayoutFromEnd = flag;
        }
        anchorinfo.assignCoordinateFromPadding();
          goto _L9
        anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
        if (mShouldReverseLayout)
        {
            anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
        } else
        {
            anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
        }
          goto _L10
_L4:
        if (anchorinfo.mLayoutFromEnd)
        {
            obj = findReferenceChildClosestToEnd(state);
        } else
        {
            obj = findReferenceChildClosestToStart(state);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1679;
        }
        anchorinfo.assignFromView(((View) (obj)));
        if (!state.mInPreLayout && supportsPredictiveItemAnimations())
        {
            if (mOrientationHelper.getDecoratedStart(((View) (obj))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (obj))) < mOrientationHelper.getStartAfterPadding())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                if (anchorinfo.mLayoutFromEnd)
                {
                    i = mOrientationHelper.getEndAfterPadding();
                } else
                {
                    i = mOrientationHelper.getStartAfterPadding();
                }
                anchorinfo.mCoordinate = i;
            }
        }
        i = 1;
          goto _L11
        i = 0;
          goto _L11
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
        if (getChildCount() > 0)
        {
            ensureLayoutState();
            boolean flag = mShouldReverseLayout ^ false;
            savedstate.mAnchorLayoutFromEnd = flag;
            if (flag)
            {
                View view = getChildClosestToEnd();
                savedstate.mAnchorOffset = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view);
                savedstate.mAnchorPosition = getPosition(view);
                return savedstate;
            } else
            {
                View view1 = getChildClosestToStart();
                savedstate.mAnchorPosition = getPosition(view1);
                savedstate.mAnchorOffset = mOrientationHelper.getDecoratedStart(view1) - mOrientationHelper.getStartAfterPadding();
                return savedstate;
            }
        } else
        {
            savedstate.mAnchorPosition = -1;
            return savedstate;
        }
    }

    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 1)
        {
            return 0;
        } else
        {
            return scrollBy(i, recycler, state);
        }
    }

    public final void scrollToPosition(int i)
    {
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        if (mPendingSavedState != null)
        {
            mPendingSavedState.mAnchorPosition = -1;
        }
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return 0;
        } else
        {
            return scrollBy(i, recycler, state);
        }
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null;
    }
}
