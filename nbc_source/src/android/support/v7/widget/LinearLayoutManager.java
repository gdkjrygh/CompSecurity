// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ScrollbarHelper, OrientationHelper, RecyclerView, LinearSmoothScroller

public class LinearLayoutManager extends RecyclerView.LayoutManager
{
    class AnchorInfo
    {

        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        final LinearLayoutManager this$0;

        private boolean isViewValidAsAnchor(View view, RecyclerView.State state)
        {
            view = (RecyclerView.LayoutParams)view.getLayoutParams();
            return !view.isItemRemoved() && view.getViewLayoutPosition() >= 0 && view.getViewLayoutPosition() < state.getItemCount();
        }

        void assignCoordinateFromPadding()
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

        public void assignFromView(View view)
        {
            if (mLayoutFromEnd)
            {
                mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
            } else
            {
                mCoordinate = mOrientationHelper.getDecoratedStart(view);
            }
            mPosition = getPosition(view);
        }

        public void assignFromViewAndKeepVisibleRect(View view)
        {
            int k = mOrientationHelper.getTotalSpaceChange();
            if (k < 0) goto _L2; else goto _L1
_L1:
            assignFromView(view);
_L4:
            return;
_L2:
            mPosition = getPosition(view);
            if (!mLayoutFromEnd)
            {
                break; /* Loop/switch isn't completed */
            }
            int i = mOrientationHelper.getEndAfterPadding() - k - mOrientationHelper.getDecoratedEnd(view);
            mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
            if (i > 0)
            {
                k = mOrientationHelper.getDecoratedMeasurement(view);
                int l = mCoordinate;
                int j1 = mOrientationHelper.getStartAfterPadding();
                k = l - k - (j1 + Math.min(mOrientationHelper.getDecoratedStart(view) - j1, 0));
                if (k < 0)
                {
                    mCoordinate = mCoordinate + Math.min(i, -k);
                    return;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            int i1 = mOrientationHelper.getDecoratedStart(view);
            int j = i1 - mOrientationHelper.getStartAfterPadding();
            mCoordinate = i1;
            if (j > 0)
            {
                int k1 = mOrientationHelper.getDecoratedMeasurement(view);
                int l1 = mOrientationHelper.getEndAfterPadding();
                int i2 = mOrientationHelper.getDecoratedEnd(view);
                k = mOrientationHelper.getEndAfterPadding() - Math.min(0, l1 - k - i2) - (i1 + k1);
                if (k < 0)
                {
                    mCoordinate = mCoordinate - Math.min(j, -k);
                    return;
                }
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        void reset()
        {
            mPosition = -1;
            mCoordinate = 0x80000000;
            mLayoutFromEnd = false;
        }

        public String toString()
        {
            return (new StringBuilder()).append("AnchorInfo{mPosition=").append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append('}').toString();
        }


        AnchorInfo()
        {
            this$0 = LinearLayoutManager.this;
            super();
        }
    }

    protected static class LayoutChunkResult
    {

        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        void resetInternal()
        {
            mConsumed = 0;
            mFinished = false;
            mIgnoreConsumed = false;
            mFocusable = false;
        }

        protected LayoutChunkResult()
        {
        }
    }

    static class LayoutState
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

        private View nextViewFromScrapList()
        {
            int i;
            int j;
            j = mScrapList.size();
            i = 0;
_L3:
            RecyclerView.ViewHolder viewholder;
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            viewholder = (RecyclerView.ViewHolder)mScrapList.get(i);
              goto _L1
_L5:
            i++;
            if (true) goto _L3; else goto _L2
_L1:
            if (viewholder.isRemoved() || mCurrentPosition != viewholder.getLayoutPosition()) goto _L5; else goto _L4
_L4:
            assignPositionFromScrapList(viewholder);
            return viewholder.itemView;
_L2:
            return null;
        }

        public void assignPositionFromScrapList()
        {
            assignPositionFromScrapList(null);
        }

        public void assignPositionFromScrapList(RecyclerView.ViewHolder viewholder)
        {
            viewholder = nextViewHolderInLimitedList(viewholder);
            int i;
            if (viewholder == null)
            {
                i = -1;
            } else
            {
                i = viewholder.getLayoutPosition();
            }
            mCurrentPosition = i;
        }

        boolean hasMore(RecyclerView.State state)
        {
            return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
        }

        View next(RecyclerView.Recycler recycler)
        {
            if (mScrapList != null)
            {
                return nextViewFromScrapList();
            } else
            {
                recycler = recycler.getViewForPosition(mCurrentPosition);
                mCurrentPosition = mCurrentPosition + mItemDirection;
                return recycler;
            }
        }

        public RecyclerView.ViewHolder nextViewHolderInLimitedList(RecyclerView.ViewHolder viewholder)
        {
            RecyclerView.ViewHolder viewholder1;
            int i;
            int j;
            int i1;
            i1 = mScrapList.size();
            viewholder1 = null;
            j = 0x7fffffff;
            i = 0;
_L2:
            RecyclerView.ViewHolder viewholder2;
            RecyclerView.ViewHolder viewholder3;
            int k;
            viewholder2 = viewholder1;
            if (i >= i1)
            {
                break MISSING_BLOCK_LABEL_143;
            }
            viewholder3 = (RecyclerView.ViewHolder)mScrapList.get(i);
            viewholder2 = viewholder1;
            k = j;
            if (viewholder3 != viewholder)
            {
                if (!viewholder3.isRemoved())
                {
                    break; /* Loop/switch isn't completed */
                }
                k = j;
                viewholder2 = viewholder1;
            }
_L4:
            i++;
            viewholder1 = viewholder2;
            j = k;
            if (true) goto _L2; else goto _L1
_L1:
            int l;
            l = (viewholder3.getLayoutPosition() - mCurrentPosition) * mItemDirection;
            viewholder2 = viewholder1;
            k = j;
            if (l < 0) goto _L4; else goto _L3
_L3:
            viewholder2 = viewholder1;
            k = j;
            if (l >= j) goto _L4; else goto _L5
_L5:
            viewholder1 = viewholder3;
            k = l;
            viewholder2 = viewholder1;
            if (l != 0) goto _L4; else goto _L6
_L6:
            viewholder2 = viewholder1;
            return viewholder2;
        }

        LayoutState()
        {
            mRecycle = true;
            mExtra = 0;
            mIsPreLayout = false;
            mScrapList = null;
        }
    }

    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
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
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        public int describeContents()
        {
            return 0;
        }

        boolean hasValidAnchor()
        {
            return mAnchorPosition >= 0;
        }

        void invalidateAnchor()
        {
            mAnchorPosition = -1;
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
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(Context context)
    {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean flag)
    {
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mStackFromEnd = false;
        mSmoothScrollbarEnabled = true;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mPendingSavedState = null;
        mAnchorInfo = new AnchorInfo();
        setOrientation(i);
        setReverseLayout(flag);
    }

    private int computeScrollExtent(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleChildClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i)
    {
        int j;
        byte byte0;
        boolean flag;
        int k;
        byte0 = -1;
        flag = true;
        k = 0x80000000;
        j = byte0;
        i;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 75
    //                   2: 77
    //                   17: 107
    //                   33: 79
    //                   66: 119
    //                   130: 92;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break MISSING_BLOCK_LABEL_75;
_L1:
        j = 0x80000000;
_L9:
        return j;
_L3:
        return 1;
_L5:
        j = byte0;
        if (mOrientation == 1) goto _L9; else goto _L8
_L8:
        return 0x80000000;
_L7:
        i = k;
        if (mOrientation == 1)
        {
            i = 1;
        }
        return i;
_L4:
        j = byte0;
        if (mOrientation == 0) goto _L9; else goto _L10
_L10:
        return 0x80000000;
_L6:
        if (mOrientation == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0x80000000;
        }
        return i;
    }

    private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findFirstVisibleChildClosestToEnd(boolean flag, boolean flag1)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(0, getChildCount(), flag, flag1);
        } else
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
        }
    }

    private View findFirstVisibleChildClosestToStart(boolean flag, boolean flag1)
    {
        if (mShouldReverseLayout)
        {
            return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
        } else
        {
            return findOneVisibleChild(0, getChildCount(), flag, flag1);
        }
    }

    private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mShouldReverseLayout)
        {
            return findFirstReferenceChild(recycler, state);
        } else
        {
            return findLastReferenceChild(recycler, state);
        }
    }

    private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mShouldReverseLayout)
        {
            return findLastReferenceChild(recycler, state);
        } else
        {
            return findFirstReferenceChild(recycler, state);
        }
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j = mOrientationHelper.getEndAfterPadding() - i;
        if (j > 0)
        {
            j = -scrollBy(-j, recycler, state);
            if (flag)
            {
                i = mOrientationHelper.getEndAfterPadding() - (i + j);
                if (i > 0)
                {
                    mOrientationHelper.offsetChildren(i);
                    return i + j;
                }
            }
        } else
        {
            return 0;
        }
        return j;
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j = i - mOrientationHelper.getStartAfterPadding();
        if (j > 0)
        {
            j = -scrollBy(j, recycler, state);
            if (flag)
            {
                i = (i + j) - mOrientationHelper.getStartAfterPadding();
                if (i > 0)
                {
                    mOrientationHelper.offsetChildren(-i);
                    return j - i;
                }
            }
        } else
        {
            return 0;
        }
        return j;
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

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j)
    {
        if (!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations())
        {
            return;
        }
        int l = 0;
        int i1 = 0;
        List list = recycler.getScrapList();
        int j1 = list.size();
        int k1 = getPosition(getChildAt(0));
        int k = 0;
        while (k < j1) 
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(k);
            if (!viewholder.isRemoved())
            {
                byte byte0;
                boolean flag;
                if (viewholder.getLayoutPosition() < k1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != mShouldReverseLayout)
                {
                    byte0 = -1;
                } else
                {
                    byte0 = 1;
                }
                if (byte0 == -1)
                {
                    l += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
                } else
                {
                    i1 += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
                }
            }
            k++;
        }
        mLayoutState.mScrapList = list;
        if (l > 0)
        {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            mLayoutState.mExtra = l;
            mLayoutState.mAvailable = 0;
            mLayoutState.assignPositionFromScrapList();
            fill(recycler, mLayoutState, state, false);
        }
        if (i1 > 0)
        {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
            mLayoutState.mExtra = i1;
            mLayoutState.mAvailable = 0;
            mLayoutState.assignPositionFromScrapList();
            fill(recycler, mLayoutState, state, false);
        }
        mLayoutState.mScrapList = null;
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (!layoutstate.mRecycle)
        {
            return;
        }
        if (layoutstate.mLayoutDirection == -1)
        {
            recycleViewsFromEnd(recycler, layoutstate.mScrollingOffset);
            return;
        } else
        {
            recycleViewsFromStart(recycler, layoutstate.mScrollingOffset);
            return;
        }
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

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i)
    {
        int j = getChildCount();
        if (i >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        k = mOrientationHelper.getEnd() - i;
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        while (i < j) 
        {
            View view = getChildAt(i);
            if (mOrientationHelper.getDecoratedStart(view) < k)
            {
                recycleChildren(recycler, 0, i);
                return;
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i = j - 1;
        while (i >= 0) 
        {
            View view1 = getChildAt(i);
            if (mOrientationHelper.getDecoratedStart(view1) < k)
            {
                recycleChildren(recycler, j - 1, i);
                return;
            }
            i--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i)
    {
        if (i >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        l = getChildCount();
        if (!mShouldReverseLayout)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = l - 1;
        while (j >= 0) 
        {
            View view = getChildAt(j);
            if (mOrientationHelper.getDecoratedEnd(view) > i)
            {
                recycleChildren(recycler, l - 1, j);
                return;
            }
            j--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k = 0;
        while (k < l) 
        {
            View view1 = getChildAt(k);
            if (mOrientationHelper.getDecoratedEnd(view1) > i)
            {
                recycleChildren(recycler, 0, k);
                return;
            }
            k++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag = true;
        if (mOrientation == 1 || !isLayoutRTL())
        {
            mShouldReverseLayout = mReverseLayout;
            return;
        }
        if (mReverseLayout)
        {
            flag = false;
        }
        mShouldReverseLayout = flag;
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
        if (getChildCount() != 0)
        {
            View view = getFocusedChild();
            if (view != null && anchorinfo.isViewValidAsAnchor(view, state))
            {
                anchorinfo.assignFromViewAndKeepVisibleRect(view);
                return true;
            }
            if (mLastStackFromEnd == mStackFromEnd)
            {
                if (anchorinfo.mLayoutFromEnd)
                {
                    recycler = findReferenceChildClosestToEnd(recycler, state);
                } else
                {
                    recycler = findReferenceChildClosestToStart(recycler, state);
                }
                if (recycler != null)
                {
                    anchorinfo.assignFromView(recycler);
                    if (!state.isPreLayout() && supportsPredictiveItemAnimations())
                    {
                        int i;
                        if (mOrientationHelper.getDecoratedStart(recycler) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(recycler) < mOrientationHelper.getStartAfterPadding())
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
                    return true;
                }
            }
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag1 = false;
        if (state.isPreLayout() || mPendingScrollPosition == -1)
        {
            return false;
        }
        if (mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            return false;
        }
        anchorinfo.mPosition = mPendingScrollPosition;
        if (mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
        {
            anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
            if (anchorinfo.mLayoutFromEnd)
            {
                anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
                return true;
            } else
            {
                anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
                return true;
            }
        }
        if (mPendingScrollPositionOffset == 0x80000000)
        {
            state = findViewByPosition(mPendingScrollPosition);
            if (state != null)
            {
                if (mOrientationHelper.getDecoratedMeasurement(state) > mOrientationHelper.getTotalSpace())
                {
                    anchorinfo.assignCoordinateFromPadding();
                    return true;
                }
                if (mOrientationHelper.getDecoratedStart(state) - mOrientationHelper.getStartAfterPadding() < 0)
                {
                    anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
                    anchorinfo.mLayoutFromEnd = false;
                    return true;
                }
                if (mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(state) < 0)
                {
                    anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
                    anchorinfo.mLayoutFromEnd = true;
                    return true;
                }
                int i;
                if (anchorinfo.mLayoutFromEnd)
                {
                    i = mOrientationHelper.getDecoratedEnd(state) + mOrientationHelper.getTotalSpaceChange();
                } else
                {
                    i = mOrientationHelper.getDecoratedStart(state);
                }
                anchorinfo.mCoordinate = i;
                return true;
            }
            if (getChildCount() > 0)
            {
                int j = getPosition(getChildAt(0));
                boolean flag;
                if (mPendingScrollPosition < j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag == mShouldReverseLayout)
                {
                    flag1 = true;
                }
                anchorinfo.mLayoutFromEnd = flag1;
            }
            anchorinfo.assignCoordinateFromPadding();
            return true;
        }
        anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
        if (mShouldReverseLayout)
        {
            anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
            return true;
        } else
        {
            anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
            return true;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(recycler, state, anchorinfo)) 
        {
            return;
        }
        anchorinfo.assignCoordinateFromPadding();
        int i;
        if (mStackFromEnd)
        {
            i = state.getItemCount() - 1;
        } else
        {
            i = 0;
        }
        anchorinfo.mPosition = i;
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

    public void assertNotInLayoutOrScroll(String s)
    {
        if (mPendingSavedState == null)
        {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    public boolean canScrollHorizontally()
    {
        return mOrientation == 0;
    }

    public boolean canScrollVertically()
    {
        return mOrientation == 1;
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    public PointF computeScrollVectorForPosition(int i)
    {
        boolean flag = false;
        if (getChildCount() == 0)
        {
            return null;
        }
        if (i < getPosition(getChildAt(0)))
        {
            flag = true;
        }
        if (flag != mShouldReverseLayout)
        {
            i = -1;
        } else
        {
            i = 1;
        }
        if (mOrientation == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }

    public int computeVerticalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    LayoutState createLayoutState()
    {
        return new LayoutState();
    }

    void ensureLayoutState()
    {
        if (mLayoutState == null)
        {
            mLayoutState = createLayoutState();
        }
        if (mOrientationHelper == null)
        {
            mOrientationHelper = OrientationHelper.createOrientationHelper(this, mOrientation);
        }
    }

    int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
    {
        LayoutChunkResult layoutchunkresult;
        int i;
        int k;
        k = layoutstate.mAvailable;
        if (layoutstate.mScrollingOffset != 0x80000000)
        {
            if (layoutstate.mAvailable < 0)
            {
                layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
            }
            recycleByLayoutState(recycler, layoutstate);
        }
        i = layoutstate.mAvailable + layoutstate.mExtra;
        layoutchunkresult = new LayoutChunkResult();
_L4:
        if (i <= 0 || !layoutstate.hasMore(state)) goto _L2; else goto _L1
_L1:
        layoutchunkresult.resetInternal();
        layoutChunk(recycler, state, layoutstate, layoutchunkresult);
        if (!layoutchunkresult.mFinished) goto _L3; else goto _L2
_L2:
        return k - layoutstate.mAvailable;
_L3:
        int j;
label0:
        {
            layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
            if (layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
            {
                j = i;
                if (state.isPreLayout())
                {
                    break label0;
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
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (!layoutchunkresult.mFocusable) goto _L4; else goto _L2
    }

    public int findFirstCompletelyVisibleItemPosition()
    {
        View view = findOneVisibleChild(0, getChildCount(), true, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int findFirstVisibleItemPosition()
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

    public int findLastVisibleItemPosition()
    {
        View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
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
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            i += byte0;
        }

        return view;
    }

    View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
    {
label0:
        {
            ensureLayoutState();
            state = null;
            recycler = null;
            int i1 = mOrientationHelper.getStartAfterPadding();
            int j1 = mOrientationHelper.getEndAfterPadding();
            Object obj;
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
                obj = state;
                Object obj1 = recycler;
                if (k1 >= 0)
                {
                    obj = state;
                    obj1 = recycler;
                    if (k1 < k)
                    {
                        if (((RecyclerView.LayoutParams)view.getLayoutParams()).isItemRemoved())
                        {
                            obj = state;
                            obj1 = recycler;
                            if (state == null)
                            {
                                obj1 = recycler;
                                obj = view;
                            }
                        } else
                        {
                            if (mOrientationHelper.getDecoratedStart(view) < j1)
                            {
                                obj = view;
                                if (mOrientationHelper.getDecoratedEnd(view) >= i1)
                                {
                                    break label0;
                                }
                            }
                            obj = state;
                            obj1 = recycler;
                            if (recycler == null)
                            {
                                obj = state;
                                obj1 = view;
                            }
                        }
                    }
                }
                i += l;
                state = ((RecyclerView.State) (obj));
                recycler = ((RecyclerView.Recycler) (obj1));
            }
            if (recycler == null)
            {
                recycler = state;
            }
            obj = recycler;
        }
        return ((View) (obj));
    }

    public View findViewByPosition(int i)
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

    protected int getExtraLayoutSpace(RecyclerView.State state)
    {
        if (state.hasTargetScrollPosition())
        {
            return mOrientationHelper.getTotalSpace();
        } else
        {
            return 0;
        }
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    protected boolean isLayoutRTL()
    {
        return getLayoutDirection() == 1;
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
                addView(recycler);
            } else
            {
                addView(recycler, 0);
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
                addDisappearingView(recycler);
            } else
            {
                addDisappearingView(recycler, 0);
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
        layoutDecorated(recycler, j + ((RecyclerView.LayoutParams) (state)).leftMargin, l + ((RecyclerView.LayoutParams) (state)).topMargin, k - ((RecyclerView.LayoutParams) (state)).rightMargin, i - ((RecyclerView.LayoutParams) (state)).bottomMargin);
        if (state.isItemRemoved() || state.isItemChanged())
        {
            layoutchunkresult.mIgnoreConsumed = true;
        }
        layoutchunkresult.mFocusable = recycler.isFocusable();
    }

    void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
    }

    public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        super.onDetachedFromWindow(recyclerview, recycler);
        if (mRecycleChildrenOnDetach)
        {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        resolveShouldLayoutReverse();
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        recycler = null;
_L4:
        return recycler;
_L2:
        i = convertFocusDirectionToLayoutDirection(i);
        if (i == 0x80000000)
        {
            return null;
        }
        ensureLayoutState();
        View view1;
        if (i == -1)
        {
            view1 = findReferenceChildClosestToStart(recycler, state);
        } else
        {
            view1 = findReferenceChildClosestToEnd(recycler, state);
        }
        if (view1 == null)
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
            view = getChildClosestToStart();
        } else
        {
            view = getChildClosestToEnd();
        }
        if (view == view1)
        {
            break; /* Loop/switch isn't completed */
        }
        recycler = view;
        if (view.isFocusable()) goto _L4; else goto _L3
_L3:
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (getChildCount() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            accessibilityevent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityevent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
        {
            mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        mAnchorInfo.reset();
        mAnchorInfo.mLayoutFromEnd = mShouldReverseLayout ^ mStackFromEnd;
        updateAnchorInfoForLayout(recycler, state, mAnchorInfo);
        int i = getExtraLayoutSpace(state);
        int j;
        int k;
        int l;
        if (mLayoutState.mLastScrollDelta >= 0)
        {
            j = 0;
        } else
        {
            j = i;
            i = 0;
        }
        k = j + mOrientationHelper.getStartAfterPadding();
        l = i + mOrientationHelper.getEndPadding();
        i = l;
        j = k;
        if (state.isPreLayout())
        {
            i = l;
            j = k;
            if (mPendingScrollPosition != -1)
            {
                i = l;
                j = k;
                if (mPendingScrollPositionOffset != 0x80000000)
                {
                    Object obj = findViewByPosition(mPendingScrollPosition);
                    i = l;
                    j = k;
                    if (obj != null)
                    {
                        int i1;
                        if (mShouldReverseLayout)
                        {
                            i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (obj))) - mPendingScrollPositionOffset;
                        } else
                        {
                            i = mOrientationHelper.getDecoratedStart(((View) (obj)));
                            j = mOrientationHelper.getStartAfterPadding();
                            i = mPendingScrollPositionOffset - (i - j);
                        }
                        if (i > 0)
                        {
                            j = k + i;
                            i = l;
                        } else
                        {
                            i = l - i;
                            j = k;
                        }
                    }
                }
            }
        }
        onAnchorReady(recycler, state, mAnchorInfo);
        detachAndScrapAttachedViews(recycler);
        mLayoutState.mIsPreLayout = state.isPreLayout();
        if (mAnchorInfo.mLayoutFromEnd)
        {
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.mExtra = j;
            fill(recycler, mLayoutState, state, false);
            k = mLayoutState.mOffset;
            i1 = mLayoutState.mCurrentPosition;
            j = i;
            if (mLayoutState.mAvailable > 0)
            {
                j = i + mLayoutState.mAvailable;
            }
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.mExtra = j;
            obj = mLayoutState;
            obj.mCurrentPosition = ((LayoutState) (obj)).mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state, false);
            l = mLayoutState.mOffset;
            i = l;
            j = k;
            if (mLayoutState.mAvailable > 0)
            {
                i = mLayoutState.mAvailable;
                updateLayoutStateToFillStart(i1, k);
                mLayoutState.mExtra = i;
                fill(recycler, mLayoutState, state, false);
                j = mLayoutState.mOffset;
                i = l;
            }
        } else
        {
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.mExtra = i;
            fill(recycler, mLayoutState, state, false);
            k = mLayoutState.mOffset;
            int j1 = mLayoutState.mCurrentPosition;
            i = j;
            if (mLayoutState.mAvailable > 0)
            {
                i = j + mLayoutState.mAvailable;
            }
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.mExtra = i;
            LayoutState layoutstate = mLayoutState;
            layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state, false);
            l = mLayoutState.mOffset;
            i = k;
            j = l;
            if (mLayoutState.mAvailable > 0)
            {
                i = mLayoutState.mAvailable;
                updateLayoutStateToFillEnd(j1, k);
                mLayoutState.mExtra = i;
                fill(recycler, mLayoutState, state, false);
                i = mLayoutState.mOffset;
                j = l;
            }
        }
        k = i;
        l = j;
        if (getChildCount() > 0)
        {
            if (mShouldReverseLayout ^ mStackFromEnd)
            {
                k = fixLayoutEndGap(i, recycler, state, true);
                l = j + k;
                j = fixLayoutStartGap(l, recycler, state, false);
                l += j;
                k = i + k + j;
            } else
            {
                k = fixLayoutStartGap(j, recycler, state, true);
                i += k;
                int k1 = fixLayoutEndGap(i, recycler, state, false);
                l = j + k + k1;
                k = i + k1;
            }
        }
        layoutForPredictiveAnimations(recycler, state, l, k);
        if (!state.isPreLayout())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            mOrientationHelper.onLayoutComplete();
        }
        mLastStackFromEnd = mStackFromEnd;
        mPendingSavedState = null;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            mPendingSavedState = (SavedState)parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        if (mPendingSavedState != null)
        {
            return new SavedState(mPendingSavedState);
        }
        SavedState savedstate = new SavedState();
        if (getChildCount() > 0)
        {
            ensureLayoutState();
            boolean flag = mLastStackFromEnd ^ mShouldReverseLayout;
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
            savedstate.invalidateAnchor();
            return savedstate;
        }
    }

    int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
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

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 1)
        {
            return 0;
        } else
        {
            return scrollBy(i, recycler, state);
        }
    }

    public void scrollToPosition(int i)
    {
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        if (mPendingSavedState != null)
        {
            mPendingSavedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int j)
    {
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = j;
        if (mPendingSavedState != null)
        {
            mPendingSavedState.invalidateAnchor();
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return 0;
        } else
        {
            return scrollBy(i, recycler, state);
        }
    }

    public void setOrientation(int i)
    {
        if (i != 0 && i != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid orientation:").append(i).toString());
        }
        assertNotInLayoutOrScroll(null);
        if (i == mOrientation)
        {
            return;
        } else
        {
            mOrientation = i;
            mOrientationHelper = null;
            requestLayout();
            return;
        }
    }

    public void setReverseLayout(boolean flag)
    {
        assertNotInLayoutOrScroll(null);
        if (flag == mReverseLayout)
        {
            return;
        } else
        {
            mReverseLayout = flag;
            requestLayout();
            return;
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
    {
        recyclerview = new LinearSmoothScroller(recyclerview.getContext()) {

            final LinearLayoutManager this$0;

            public PointF computeScrollVectorForPosition(int j)
            {
                return LinearLayoutManager.this.computeScrollVectorForPosition(j);
            }

            
            {
                this$0 = LinearLayoutManager.this;
                super(context);
            }
        };
        recyclerview.setTargetPosition(i);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
    }
}
