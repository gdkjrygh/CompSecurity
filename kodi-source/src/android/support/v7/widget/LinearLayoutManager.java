// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ScrollbarHelper, OrientationHelper, RecyclerView

public class LinearLayoutManager extends RecyclerView.LayoutManager
{
    class AnchorInfo
    {

        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        final LinearLayoutManager this$0;

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

        public boolean assignFromViewIfValid(View view, RecyclerView.State state)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            if (!layoutparams.isItemRemoved() && layoutparams.getViewPosition() >= 0 && layoutparams.getViewPosition() < state.getItemCount())
            {
                assignFromView(view);
                return true;
            } else
            {
                return false;
            }
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
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle;
        List mScrapList;
        int mScrollingOffset;

        private View nextFromLimitedList()
        {
            RecyclerView.ViewHolder viewholder;
            int i;
            int j;
            int i1;
            i1 = mScrapList.size();
            viewholder = null;
            j = 0x7fffffff;
            i = 0;
_L2:
            RecyclerView.ViewHolder viewholder1;
            RecyclerView.ViewHolder viewholder2;
            int k;
            viewholder1 = viewholder;
            if (i >= i1)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            viewholder2 = (RecyclerView.ViewHolder)mScrapList.get(i);
            if (mIsPreLayout || !viewholder2.isRemoved())
            {
                break; /* Loop/switch isn't completed */
            }
            k = j;
            viewholder1 = viewholder;
_L4:
            i++;
            viewholder = viewholder1;
            j = k;
            if (true) goto _L2; else goto _L1
_L1:
            int l;
            l = (viewholder2.getPosition() - mCurrentPosition) * mItemDirection;
            viewholder1 = viewholder;
            k = j;
            if (l < 0) goto _L4; else goto _L3
_L3:
            viewholder1 = viewholder;
            k = j;
            if (l >= j) goto _L4; else goto _L5
_L5:
            viewholder = viewholder2;
            k = l;
            viewholder1 = viewholder;
            if (l != 0) goto _L4; else goto _L6
_L6:
            viewholder1 = viewholder;
            if (viewholder1 != null)
            {
                mCurrentPosition = viewholder1.getPosition() + mItemDirection;
                return viewholder1.itemView;
            } else
            {
                return null;
            }
        }

        boolean hasMore(RecyclerView.State state)
        {
            return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
        }

        View next(RecyclerView.Recycler recycler)
        {
            if (mScrapList != null)
            {
                return nextFromLimitedList();
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

    private int computeScrollExtent(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureLayoutState();
            return ScrollbarHelper.computeScrollExtent(state, mOrientationHelper, getChildClosestToStart(), getChildClosestToEnd(), this, mSmoothScrollbarEnabled);
        }
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureLayoutState();
            return ScrollbarHelper.computeScrollOffset(state, mOrientationHelper, getChildClosestToStart(), getChildClosestToEnd(), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
        }
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            ensureLayoutState();
            return ScrollbarHelper.computeScrollRange(state, mOrientationHelper, getChildClosestToStart(), getChildClosestToEnd(), this, mSmoothScrollbarEnabled);
        }
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

    private View findFirstReferenceChild(int i)
    {
        return findReferenceChild(0, getChildCount(), i);
    }

    private View findLastReferenceChild(int i)
    {
        return findReferenceChild(getChildCount() - 1, -1, i);
    }

    private View findReferenceChild(int i, int j, int k)
    {
label0:
        {
            ensureLayoutState();
            View view1 = null;
            View view = null;
            int i1 = mOrientationHelper.getStartAfterPadding();
            int j1 = mOrientationHelper.getEndAfterPadding();
            View view3;
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
                View view2 = getChildAt(i);
                int k1 = getPosition(view2);
                view3 = view1;
                View view4 = view;
                if (k1 >= 0)
                {
                    view3 = view1;
                    view4 = view;
                    if (k1 < k)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).isItemRemoved())
                        {
                            view3 = view1;
                            view4 = view;
                            if (view1 == null)
                            {
                                view4 = view;
                                view3 = view2;
                            }
                        } else
                        {
                            if (mOrientationHelper.getDecoratedStart(view2) < j1)
                            {
                                view3 = view2;
                                if (mOrientationHelper.getDecoratedEnd(view2) >= i1)
                                {
                                    break label0;
                                }
                            }
                            view3 = view1;
                            view4 = view;
                            if (view == null)
                            {
                                view3 = view1;
                                view4 = view2;
                            }
                        }
                    }
                }
                i += l;
                view1 = view3;
                view = view4;
            }
            if (view == null)
            {
                view = view1;
            }
            view3 = view;
        }
        return view3;
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
        int j1 = 0;
        int k = 0;
        List list = recycler.getScrapList();
        int k1 = list.size();
        int l1 = getPosition(getChildAt(0));
        int l = 0;
        while (l < k1) 
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(l);
            byte byte0;
            boolean flag;
            if (viewholder.getPosition() < l1)
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
                j1 += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
            } else
            {
                k += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
            }
            l++;
        }
        mLayoutState.mScrapList = list;
        if (j1 > 0)
        {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            mLayoutState.mExtra = j1;
            mLayoutState.mAvailable = 0;
            LayoutState layoutstate = mLayoutState;
            int i1 = layoutstate.mCurrentPosition;
            if (mShouldReverseLayout)
            {
                i = 1;
            } else
            {
                i = -1;
            }
            layoutstate.mCurrentPosition = i + i1;
            fill(recycler, mLayoutState, state, false);
        }
        if (k > 0)
        {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
            mLayoutState.mExtra = k;
            mLayoutState.mAvailable = 0;
            layoutstate = mLayoutState;
            j = layoutstate.mCurrentPosition;
            if (mShouldReverseLayout)
            {
                i = -1;
            } else
            {
                i = 1;
            }
            layoutstate.mCurrentPosition = i + j;
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

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        if (getChildCount() != 0)
        {
            View view = getFocusedChild();
            if (view != null && anchorinfo.assignFromViewIfValid(view, state))
            {
                return true;
            }
            if (mLastStackFromEnd == mStackFromEnd)
            {
                View view1;
                if (anchorinfo.mLayoutFromEnd)
                {
                    view1 = findReferenceChildClosestToEnd(state);
                } else
                {
                    view1 = findReferenceChildClosestToStart(state);
                }
                if (view1 != null)
                {
                    anchorinfo.assignFromView(view1);
                    if (!state.isPreLayout() && supportsPredictiveItemAnimations())
                    {
                        int i;
                        if (mOrientationHelper.getDecoratedStart(view1) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(view1) < mOrientationHelper.getStartAfterPadding())
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

    private void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(state, anchorinfo)) 
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

    void ensureLayoutState()
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

    public int findFirstVisibleItemPosition()
    {
        View view = findOneVisibleChild(0, getChildCount(), false);
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
        View view = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    View findOneVisibleChild(int i, int j, boolean flag)
    {
        ensureLayoutState();
        int k = mOrientationHelper.getStartAfterPadding();
        int l = mOrientationHelper.getEndAfterPadding();
        byte byte0;
        if (j > i)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        for (; i != j; i += byte0)
        {
            View view = getChildAt(i);
            int i1 = mOrientationHelper.getDecoratedStart(view);
            int j1 = mOrientationHelper.getDecoratedEnd(view);
            if (i1 < l && j1 > k && (!flag || i1 >= k && j1 <= l))
            {
                return view;
            }
        }

        return null;
    }

    public View findViewByPosition(int i)
    {
        int j = getChildCount();
        if (j != 0)
        {
            if ((i -= getPosition(getChildAt(0))) >= 0 && i < j)
            {
                return getChildAt(i);
            }
        }
        return null;
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

    void onAnchorReady(RecyclerView.State state, AnchorInfo anchorinfo)
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
            view1 = findReferenceChildClosestToStart(state);
        } else
        {
            view1 = findReferenceChildClosestToEnd(state);
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
        updateAnchorInfoForLayout(state, mAnchorInfo);
        int i = getExtraLayoutSpace(state);
        int j;
        int k;
        int l;
        boolean flag;
        if (state.getTargetScrollPosition() < mAnchorInfo.mPosition)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == mShouldReverseLayout)
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
        onAnchorReady(state, mAnchorInfo);
        detachAndScrapAttachedViews(recycler);
        mLayoutState.mIsPreLayout = state.isPreLayout();
        if (mAnchorInfo.mLayoutFromEnd)
        {
            updateLayoutStateToFillStart(mAnchorInfo);
            mLayoutState.mExtra = j;
            fill(recycler, mLayoutState, state, false);
            k = mLayoutState.mOffset;
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
            i = mLayoutState.mOffset;
            j = k;
        } else
        {
            updateLayoutStateToFillEnd(mAnchorInfo);
            mLayoutState.mExtra = i;
            fill(recycler, mLayoutState, state, false);
            k = mLayoutState.mOffset;
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
            j = mLayoutState.mOffset;
            i = k;
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
                int i1 = fixLayoutEndGap(i, recycler, state, false);
                l = j + k + i1;
                k = i + i1;
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

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
    }
}
