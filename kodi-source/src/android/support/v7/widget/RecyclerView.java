// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ChildHelper, AdapterHelper, RecyclerViewAccessibilityDelegate

public class RecyclerView extends ViewGroup
{
    public static abstract class Adapter
    {

        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable;

        public final void bindViewHolder(ViewHolder viewholder, int i)
        {
            viewholder.mPosition = i;
            if (hasStableIds())
            {
                viewholder.mItemId = getItemId(i);
            }
            onBindViewHolder(viewholder, i);
            viewholder.setFlags(1, 7);
        }

        public final ViewHolder createViewHolder(ViewGroup viewgroup, int i)
        {
            viewgroup = onCreateViewHolder(viewgroup, i);
            viewgroup.mItemViewType = i;
            return viewgroup;
        }

        public abstract int getItemCount();

        public long getItemId(int i)
        {
            return -1L;
        }

        public int getItemViewType(int i)
        {
            return 0;
        }

        public final boolean hasStableIds()
        {
            return mHasStableIds;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerview)
        {
        }

        public abstract void onBindViewHolder(ViewHolder viewholder, int i);

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerview)
        {
        }

        public void onViewDetachedFromWindow(ViewHolder viewholder)
        {
        }

        public void onViewRecycled(ViewHolder viewholder)
        {
        }

        public void registerAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.registerObserver(adapterdataobserver);
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.unregisterObserver(adapterdataobserver);
        }
    }

    static class AdapterDataObservable extends Observable
    {
    }

    public static abstract class AdapterDataObserver
    {
    }

    public static abstract class ItemAnimator
    {

        private ItemAnimatorListener mListener;
        private boolean mSupportsChangeAnimations;

        public abstract boolean animateAdd(ViewHolder viewholder);

        public abstract boolean animateChange(ViewHolder viewholder, ViewHolder viewholder1, int i, int j, int k, int l);

        public abstract boolean animateMove(ViewHolder viewholder, int i, int j, int k, int l);

        public abstract boolean animateRemove(ViewHolder viewholder);

        public abstract void endAnimation(ViewHolder viewholder);

        public abstract void endAnimations();

        public boolean getSupportsChangeAnimations()
        {
            return mSupportsChangeAnimations;
        }

        public abstract boolean isRunning();

        void setListener(ItemAnimatorListener itemanimatorlistener)
        {
            mListener = itemanimatorlistener;
        }
    }

    static interface ItemAnimator.ItemAnimatorListener
    {
    }

    public static abstract class ItemDecoration
    {

        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerview)
        {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, State state)
        {
            getItemOffsets(rect, ((LayoutParams)view.getLayoutParams()).getViewPosition(), recyclerview);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, State state)
        {
            onDraw(canvas, recyclerview);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview, State state)
        {
            onDrawOver(canvas, recyclerview);
        }

        public ItemDecoration()
        {
        }
    }

    private static class ItemHolderInfo
    {

        int bottom;
        ViewHolder holder;
        int left;
        int right;
        int top;

        ItemHolderInfo(ViewHolder viewholder, int i, int j, int k, int l)
        {
            holder = viewholder;
            left = i;
            top = j;
            right = k;
            bottom = l;
        }
    }

    public static abstract class LayoutManager
    {

        ChildHelper mChildHelper;
        RecyclerView mRecyclerView;
        private boolean mRequestedSimpleAnimations;
        SmoothScroller mSmoothScroller;

        private void addViewInt(View view, int i, boolean flag)
        {
            ViewHolder viewholder;
            LayoutParams layoutparams;
            viewholder = RecyclerView.getChildViewHolderInt(view);
            if (flag || viewholder.isRemoved())
            {
                mRecyclerView.addToDisappearingList(view);
            } else
            {
                mRecyclerView.removeFromDisappearingList(view);
            }
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!viewholder.wasReturnedFromScrap() && !viewholder.isScrap()) goto _L2; else goto _L1
_L1:
            if (viewholder.isScrap())
            {
                viewholder.unScrap();
            } else
            {
                viewholder.clearReturnedFromScrapFlag();
            }
            mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
_L4:
            if (layoutparams.mPendingInvalidate)
            {
                viewholder.itemView.invalidate();
                layoutparams.mPendingInvalidate = false;
            }
            return;
_L2:
            if (view.getParent() == mRecyclerView)
            {
                int k = mChildHelper.indexOfChild(view);
                int j = i;
                if (i == -1)
                {
                    j = mChildHelper.getChildCount();
                }
                if (k == -1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(mRecyclerView.indexOfChild(view)).toString());
                }
                if (k != j)
                {
                    mRecyclerView.mLayout.moveView(k, j);
                }
            } else
            {
                mChildHelper.addView(view, i, false);
                layoutparams.mInsetsDirty = true;
                if (mSmoothScroller != null && mSmoothScroller.isRunning())
                {
                    mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void detachViewInternal(int i, View view)
        {
            mChildHelper.detachViewFromParent(i);
        }

        public static int getChildMeasureSpec(int i, int j, int k, boolean flag)
        {
            int l;
            l = Math.max(0, i - j);
            j = 0;
            i = 0;
            if (!flag) goto _L2; else goto _L1
_L1:
            if (k >= 0)
            {
                j = k;
                i = 0x40000000;
            } else
            {
                j = 0;
                i = 0;
            }
_L4:
            return android.view.View.MeasureSpec.makeMeasureSpec(j, i);
_L2:
            if (k >= 0)
            {
                j = k;
                i = 0x40000000;
            } else
            if (k == -1)
            {
                j = l;
                i = 0x40000000;
            } else
            if (k == -2)
            {
                j = l;
                i = 0x80000000;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void onSmoothScrollerStopped(SmoothScroller smoothscroller)
        {
            if (mSmoothScroller == smoothscroller)
            {
                mSmoothScroller = null;
            }
        }

        private void scrapOrRecycleView(Recycler recycler, int i, View view)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.shouldIgnore())
            {
                return;
            }
            if (viewholder.isInvalid() && !viewholder.isRemoved() && !viewholder.isChanged() && !mRecyclerView.mAdapter.hasStableIds())
            {
                removeViewAt(i);
                recycler.recycleViewHolderInternal(viewholder);
                return;
            } else
            {
                detachViewAt(i);
                recycler.scrapView(view);
                return;
            }
        }

        public void addDisappearingView(View view)
        {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i)
        {
            addViewInt(view, i, true);
        }

        public void addView(View view)
        {
            addView(view, -1);
        }

        public void addView(View view, int i)
        {
            addViewInt(view, i, false);
        }

        public void assertNotInLayoutOrScroll(String s)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.assertNotInLayoutOrScroll(s);
            }
        }

        public void attachView(View view, int i)
        {
            attachView(view, i, (LayoutParams)view.getLayoutParams());
        }

        public void attachView(View view, int i, LayoutParams layoutparams)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.isRemoved())
            {
                mRecyclerView.addToDisappearingList(view);
            } else
            {
                mRecyclerView.removeFromDisappearingList(view);
            }
            mChildHelper.attachViewToParent(view, i, layoutparams, viewholder.isRemoved());
        }

        public boolean canScrollHorizontally()
        {
            return false;
        }

        public boolean canScrollVertically()
        {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutparams)
        {
            return layoutparams != null;
        }

        public int computeHorizontalScrollExtent(State state)
        {
            return 0;
        }

        public int computeHorizontalScrollOffset(State state)
        {
            return 0;
        }

        public int computeHorizontalScrollRange(State state)
        {
            return 0;
        }

        public int computeVerticalScrollExtent(State state)
        {
            return 0;
        }

        public int computeVerticalScrollOffset(State state)
        {
            return 0;
        }

        public int computeVerticalScrollRange(State state)
        {
            return 0;
        }

        public void detachAndScrapAttachedViews(Recycler recycler)
        {
            for (int i = getChildCount() - 1; i >= 0; i--)
            {
                scrapOrRecycleView(recycler, i, getChildAt(i));
            }

        }

        public void detachViewAt(int i)
        {
            detachViewInternal(i, getChildAt(i));
        }

        public View findViewByPosition(int i)
        {
            int j;
            int k;
            k = getChildCount();
            j = 0;
_L3:
            View view;
            ViewHolder viewholder;
            if (j >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            view = getChildAt(j);
            viewholder = RecyclerView.getChildViewHolderInt(view);
              goto _L1
_L5:
            j++;
            if (true) goto _L3; else goto _L2
_L1:
            if (viewholder == null || viewholder.getPosition() != i || viewholder.shouldIgnore() || !mRecyclerView.mState.isPreLayout() && viewholder.isRemoved()) goto _L5; else goto _L4
_L4:
            return view;
_L2:
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
        {
            return new LayoutParams(context, attributeset);
        }

        public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            if (layoutparams instanceof LayoutParams)
            {
                return new LayoutParams((LayoutParams)layoutparams);
            }
            if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
            {
                return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
            } else
            {
                return new LayoutParams(layoutparams);
            }
        }

        public int getBottomDecorationHeight(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mDecorInsets.bottom;
        }

        public View getChildAt(int i)
        {
            if (mChildHelper != null)
            {
                return mChildHelper.getChildAt(i);
            } else
            {
                return null;
            }
        }

        public int getChildCount()
        {
            if (mChildHelper != null)
            {
                return mChildHelper.getChildCount();
            } else
            {
                return 0;
            }
        }

        public int getColumnCountForAccessibility(Recycler recycler, State state)
        {
            while (mRecyclerView == null || mRecyclerView.mAdapter == null || !canScrollHorizontally()) 
            {
                return 1;
            }
            return mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view)
        {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public int getDecoratedLeft(View view)
        {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view)
        {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view)
        {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild()
        {
            if (mRecyclerView != null) goto _L2; else goto _L1
_L1:
            View view = null;
_L4:
            return view;
_L2:
            View view1;
            view1 = mRecyclerView.getFocusedChild();
            if (view1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            view = view1;
            if (!mChildHelper.isHidden(view1)) goto _L4; else goto _L3
_L3:
            return null;
        }

        public int getHeight()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getHeight();
            } else
            {
                return 0;
            }
        }

        public int getLayoutDirection()
        {
            return ViewCompat.getLayoutDirection(mRecyclerView);
        }

        public int getLeftDecorationWidth(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mDecorInsets.left;
        }

        public int getMinimumHeight()
        {
            return ViewCompat.getMinimumHeight(mRecyclerView);
        }

        public int getMinimumWidth()
        {
            return ViewCompat.getMinimumWidth(mRecyclerView);
        }

        public int getPaddingBottom()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getPaddingBottom();
            } else
            {
                return 0;
            }
        }

        public int getPaddingLeft()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getPaddingLeft();
            } else
            {
                return 0;
            }
        }

        public int getPaddingRight()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getPaddingRight();
            } else
            {
                return 0;
            }
        }

        public int getPaddingTop()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getPaddingTop();
            } else
            {
                return 0;
            }
        }

        public int getPosition(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).getViewPosition();
        }

        public int getRightDecorationWidth(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mDecorInsets.right;
        }

        public int getRowCountForAccessibility(Recycler recycler, State state)
        {
            while (mRecyclerView == null || mRecyclerView.mAdapter == null || !canScrollVertically()) 
            {
                return 1;
            }
            return mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(Recycler recycler, State state)
        {
            return 0;
        }

        public int getTopDecorationHeight(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mDecorInsets.top;
        }

        public int getWidth()
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.getWidth();
            } else
            {
                return 0;
            }
        }

        public boolean isLayoutHierarchical(Recycler recycler, State state)
        {
            return false;
        }

        public boolean isSmoothScrolling()
        {
            return mSmoothScroller != null && mSmoothScroller.isRunning();
        }

        public void layoutDecorated(View view, int i, int j, int k, int l)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).mDecorInsets;
            view.layout(rect.left + i, rect.top + j, k - rect.right, l - rect.bottom);
        }

        public void measureChildWithMargins(View view, int i, int j)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
            int k = rect.left;
            int l = rect.right;
            int i1 = rect.top;
            int j1 = rect.bottom;
            view.measure(getChildMeasureSpec(getWidth(), getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin + (i + (k + l)), layoutparams.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin + (j + (i1 + j1)), layoutparams.height, canScrollVertically()));
        }

        public void moveView(int i, int j)
        {
            View view = getChildAt(i);
            if (view == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot move a child from non-existing index:").append(i).toString());
            } else
            {
                detachViewAt(i);
                attachView(view, j);
                return;
            }
        }

        public void offsetChildrenHorizontal(int i)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter1)
        {
        }

        public boolean onAddFocusables(RecyclerView recyclerview, ArrayList arraylist, int i, int j)
        {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerview)
        {
        }

        public void onDetachedFromWindow(RecyclerView recyclerview)
        {
        }

        public void onDetachedFromWindow(RecyclerView recyclerview, Recycler recycler)
        {
            onDetachedFromWindow(recyclerview);
        }

        public View onFocusSearchFailed(View view, int i, Recycler recycler, State state)
        {
            return null;
        }

        public void onInitializeAccessibilityEvent(Recycler recycler, State state, AccessibilityEvent accessibilityevent)
        {
            boolean flag1 = true;
            recycler = AccessibilityEventCompat.asRecord(accessibilityevent);
            if (mRecyclerView != null && recycler != null)
            {
                boolean flag = flag1;
                if (!ViewCompat.canScrollVertically(mRecyclerView, 1))
                {
                    flag = flag1;
                    if (!ViewCompat.canScrollVertically(mRecyclerView, -1))
                    {
                        flag = flag1;
                        if (!ViewCompat.canScrollHorizontally(mRecyclerView, -1))
                        {
                            if (ViewCompat.canScrollHorizontally(mRecyclerView, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                recycler.setScrollable(flag);
                if (mRecyclerView.mAdapter != null)
                {
                    recycler.setItemCount(mRecyclerView.mAdapter.getItemCount());
                    return;
                }
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
        }

        void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilitynodeinfocompat);
        }

        public void onInitializeAccessibilityNodeInfo(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            accessibilitynodeinfocompat.setClassName(android/support/v7/widget/RecyclerView.getName());
            if (ViewCompat.canScrollVertically(mRecyclerView, -1) || ViewCompat.canScrollHorizontally(mRecyclerView, -1))
            {
                accessibilitynodeinfocompat.addAction(8192);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            if (ViewCompat.canScrollVertically(mRecyclerView, 1) || ViewCompat.canScrollHorizontally(mRecyclerView, 1))
            {
                accessibilitynodeinfocompat.addAction(4096);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            accessibilitynodeinfocompat.setCollectionInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public View onInterceptFocusSearch(View view, int i)
        {
            return null;
        }

        public void onItemsChanged(RecyclerView recyclerview)
        {
        }

        public void onLayoutChildren(Recycler recycler, State state)
        {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(Recycler recycler, State state, int i, int j)
        {
            int l = android.view.View.MeasureSpec.getMode(i);
            int k = android.view.View.MeasureSpec.getMode(j);
            i = android.view.View.MeasureSpec.getSize(i);
            j = android.view.View.MeasureSpec.getSize(j);
            switch (l)
            {
            default:
                i = getMinimumWidth();
                // fall through

            case -2147483648: 
            case 1073741824: 
                switch (k)
                {
                default:
                    j = getMinimumHeight();
                    // fall through

                case -2147483648: 
                case 1073741824: 
                    setMeasuredDimension(i, j);
                    return;
                }
            }
        }

        public boolean onRequestChildFocus(RecyclerView recyclerview, State state, View view, View view1)
        {
            return onRequestChildFocus(recyclerview, view, view1);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
        {
            return isSmoothScrolling() || recyclerview.mRunningLayoutOrScroll;
        }

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState()
        {
            return null;
        }

        public void onScrollStateChanged(int i)
        {
        }

        boolean performAccessibilityAction(int i, Bundle bundle)
        {
            return performAccessibilityAction(mRecyclerView.mRecycler, mRecyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityAction(Recycler recycler, State state, int i, Bundle bundle)
        {
            if (mRecyclerView != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int l;
            boolean flag1;
            boolean flag2;
            flag1 = false;
            flag2 = false;
            boolean flag = false;
            l = 0;
            switch (i)
            {
            default:
                i = ((flag) ? 1 : 0);
                break;

            case 4096: 
                break MISSING_BLOCK_LABEL_141;

            case 8192: 
                break; /* Loop/switch isn't completed */
            }
_L4:
            if (i != 0 || l != 0)
            {
                mRecyclerView.scrollBy(l, i);
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            int j = ((flag1) ? 1 : 0);
            if (ViewCompat.canScrollVertically(mRecyclerView, -1))
            {
                j = -(getHeight() - getPaddingTop() - getPaddingBottom());
            }
            i = j;
            if (ViewCompat.canScrollHorizontally(mRecyclerView, -1))
            {
                l = -(getWidth() - getPaddingLeft() - getPaddingRight());
                i = j;
            }
              goto _L4
            int k = ((flag2) ? 1 : 0);
            if (ViewCompat.canScrollVertically(mRecyclerView, 1))
            {
                k = getHeight() - getPaddingTop() - getPaddingBottom();
            }
            i = k;
            if (ViewCompat.canScrollHorizontally(mRecyclerView, 1))
            {
                l = getWidth() - getPaddingLeft() - getPaddingRight();
                i = k;
            }
              goto _L4
        }

        public void removeAndRecycleAllViews(Recycler recycler)
        {
            for (int i = getChildCount() - 1; i >= 0; i--)
            {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore())
                {
                    removeAndRecycleViewAt(i, recycler);
                }
            }

        }

        void removeAndRecycleScrapInt(Recycler recycler)
        {
            int j = recycler.getScrapCount();
            int i = 0;
            while (i < j) 
            {
                View view = recycler.getScrapViewAt(i);
                ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
                if (!viewholder.shouldIgnore())
                {
                    if (viewholder.isTmpDetached())
                    {
                        mRecyclerView.removeDetachedView(view, false);
                    }
                    recycler.quickRecycleScrapView(view);
                }
                i++;
            }
            recycler.clearScrap();
            if (j > 0)
            {
                mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, Recycler recycler)
        {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i, Recycler recycler)
        {
            View view = getChildAt(i);
            removeViewAt(i);
            recycler.recycleView(view);
        }

        public void removeView(View view)
        {
            mChildHelper.removeView(view);
        }

        public void removeViewAt(int i)
        {
            if (getChildAt(i) != null)
            {
                mChildHelper.removeViewAt(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag)
        {
            int i = getPaddingLeft();
            int k = getPaddingTop();
            int j = getWidth();
            int l1 = getPaddingRight();
            int l = getHeight();
            int i1 = getPaddingBottom();
            int i2 = view.getLeft() + rect.left;
            int j1 = view.getTop() + rect.top;
            int j2 = rect.width();
            int k1 = rect.height();
            i = Math.min(0, i2 - i);
            k = Math.min(0, j1 - k);
            j = Math.max(0, (i2 + j2) - (j - l1));
            l = Math.max(0, (j1 + k1) - (l - i1));
            if (ViewCompat.getLayoutDirection(recyclerview) == 1)
            {
                if (j != 0)
                {
                    i = j;
                }
            } else
            if (i == 0)
            {
                i = j;
            }
            if (k != 0)
            {
                j = k;
            } else
            {
                j = l;
            }
            if (i != 0 || j != 0)
            {
                if (flag)
                {
                    recyclerview.scrollBy(i, j);
                } else
                {
                    recyclerview.smoothScrollBy(i, j);
                }
                return true;
            } else
            {
                return false;
            }
        }

        public void requestLayout()
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout()
        {
            mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, Recycler recycler, State state)
        {
            return 0;
        }

        public int scrollVerticallyBy(int i, Recycler recycler, State state)
        {
            return 0;
        }

        public void setMeasuredDimension(int i, int j)
        {
            mRecyclerView.setMeasuredDimension(i, j);
        }

        void setRecyclerView(RecyclerView recyclerview)
        {
            if (recyclerview == null)
            {
                mRecyclerView = null;
                mChildHelper = null;
                return;
            } else
            {
                mRecyclerView = recyclerview;
                mChildHelper = recyclerview.mChildHelper;
                return;
            }
        }

        void stopSmoothScroller()
        {
            if (mSmoothScroller != null)
            {
                mSmoothScroller.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations()
        {
            return false;
        }



/*
        static boolean access$1702(LayoutManager layoutmanager, boolean flag)
        {
            layoutmanager.mRequestedSimpleAnimations = flag;
            return flag;
        }

*/


        public LayoutManager()
        {
            mRequestedSimpleAnimations = false;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        ViewHolder mViewHolder;

        public int getViewPosition()
        {
            return mViewHolder.getPosition();
        }

        public boolean isItemChanged()
        {
            return mViewHolder.isChanged();
        }

        public boolean isItemRemoved()
        {
            return mViewHolder.isRemoved();
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mDecorInsets = new Rect();
            mInsetsDirty = true;
            mPendingInvalidate = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mDecorInsets = new Rect();
            mInsetsDirty = true;
            mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            mDecorInsets = new Rect();
            mInsetsDirty = true;
            mPendingInvalidate = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mDecorInsets = new Rect();
            mInsetsDirty = true;
            mPendingInvalidate = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mDecorInsets = new Rect();
            mInsetsDirty = true;
            mPendingInvalidate = false;
        }
    }

    public static interface OnItemTouchListener
    {

        public abstract boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);

        public abstract void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);
    }

    public static abstract class OnScrollListener
    {

        public void onScrollStateChanged(RecyclerView recyclerview, int i)
        {
        }

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
        }
    }

    public static class RecycledViewPool
    {

        private int mAttachCount;
        private SparseIntArray mMaxScrap;
        private SparseArray mScrap;

        private ArrayList getScrapHeapForType(int i)
        {
            ArrayList arraylist1 = (ArrayList)mScrap.get(i);
            ArrayList arraylist = arraylist1;
            if (arraylist1 == null)
            {
                ArrayList arraylist2 = new ArrayList();
                mScrap.put(i, arraylist2);
                arraylist = arraylist2;
                if (mMaxScrap.indexOfKey(i) < 0)
                {
                    mMaxScrap.put(i, 5);
                    arraylist = arraylist2;
                }
            }
            return arraylist;
        }

        void attach(Adapter adapter)
        {
            mAttachCount = mAttachCount + 1;
        }

        public void clear()
        {
            mScrap.clear();
        }

        void detach()
        {
            mAttachCount = mAttachCount - 1;
        }

        public ViewHolder getRecycledView(int i)
        {
            ArrayList arraylist = (ArrayList)mScrap.get(i);
            if (arraylist != null && !arraylist.isEmpty())
            {
                i = arraylist.size() - 1;
                ViewHolder viewholder = (ViewHolder)arraylist.get(i);
                arraylist.remove(i);
                return viewholder;
            } else
            {
                return null;
            }
        }

        void onAdapterChanged(Adapter adapter, Adapter adapter1, boolean flag)
        {
            if (adapter != null)
            {
                detach();
            }
            if (!flag && mAttachCount == 0)
            {
                clear();
            }
            if (adapter1 != null)
            {
                attach(adapter1);
            }
        }

        public void putRecycledView(ViewHolder viewholder)
        {
            int i = viewholder.getItemViewType();
            ArrayList arraylist = getScrapHeapForType(i);
            if (mMaxScrap.get(i) <= arraylist.size())
            {
                return;
            } else
            {
                viewholder.resetInternal();
                arraylist.add(viewholder);
                return;
            }
        }

        public RecycledViewPool()
        {
            mScrap = new SparseArray();
            mMaxScrap = new SparseIntArray();
            mAttachCount = 0;
        }
    }

    public final class Recycler
    {

        final ArrayList mAttachedScrap;
        final ArrayList mCachedViews;
        private ArrayList mChangedScrap;
        private RecycledViewPool mRecyclerPool;
        private final List mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        private int mViewCacheMax;
        final RecyclerView this$0;

        private void attachAccessibilityDelegate(View view)
        {
            if (mAccessibilityManager != null && mAccessibilityManager.isEnabled())
            {
                if (ViewCompat.getImportantForAccessibility(view) == 0)
                {
                    ViewCompat.setImportantForAccessibility(view, 1);
                }
                if (!ViewCompat.hasAccessibilityDelegate(view))
                {
                    ViewCompat.setAccessibilityDelegate(view, mAccessibilityDelegate.getItemDelegate());
                }
            }
        }

        private void invalidateDisplayListInt(ViewHolder viewholder)
        {
            if (viewholder.itemView instanceof ViewGroup)
            {
                invalidateDisplayListInt((ViewGroup)viewholder.itemView, false);
            }
        }

        private void invalidateDisplayListInt(ViewGroup viewgroup, boolean flag)
        {
            for (int i = viewgroup.getChildCount() - 1; i >= 0; i--)
            {
                View view = viewgroup.getChildAt(i);
                if (view instanceof ViewGroup)
                {
                    invalidateDisplayListInt((ViewGroup)view, true);
                }
            }

            if (!flag)
            {
                return;
            }
            if (viewgroup.getVisibility() == 4)
            {
                viewgroup.setVisibility(0);
                viewgroup.setVisibility(4);
                return;
            } else
            {
                int j = viewgroup.getVisibility();
                viewgroup.setVisibility(4);
                viewgroup.setVisibility(j);
                return;
            }
        }

        public void clear()
        {
            mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        void clearOldPositions()
        {
            int l = mCachedViews.size();
            for (int i = 0; i < l; i++)
            {
                ((ViewHolder)mCachedViews.get(i)).clearOldPosition();
            }

            l = mAttachedScrap.size();
            for (int j = 0; j < l; j++)
            {
                ((ViewHolder)mAttachedScrap.get(j)).clearOldPosition();
            }

            if (mChangedScrap != null)
            {
                int i1 = mChangedScrap.size();
                for (int k = 0; k < i1; k++)
                {
                    ((ViewHolder)mChangedScrap.get(k)).clearOldPosition();
                }

            }
        }

        void clearScrap()
        {
            mAttachedScrap.clear();
        }

        void dispatchViewRecycled(ViewHolder viewholder)
        {
            if (mRecyclerListener != null)
            {
                mRecyclerListener.onViewRecycled(viewholder);
            }
            if (mAdapter != null)
            {
                mAdapter.onViewRecycled(viewholder);
            }
            if (mState != null)
            {
                mState.onViewRecycled(viewholder);
            }
        }

        ViewHolder getChangedScrapViewForPosition(int i)
        {
            int k;
label0:
            {
                if (mChangedScrap != null)
                {
                    k = mChangedScrap.size();
                    if (k != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int j = 0; j < k; j++)
            {
                ViewHolder viewholder = (ViewHolder)mChangedScrap.get(j);
                if (!viewholder.wasReturnedFromScrap() && viewholder.getPosition() == i)
                {
                    viewholder.addFlags(32);
                    return viewholder;
                }
            }

            if (mAdapter.hasStableIds())
            {
                i = mAdapterHelper.findPositionOffset(i);
                if (i > 0 && i < mAdapter.getItemCount())
                {
                    long l = mAdapter.getItemId(i);
                    for (i = 0; i < k; i++)
                    {
                        ViewHolder viewholder1 = (ViewHolder)mChangedScrap.get(i);
                        if (!viewholder1.wasReturnedFromScrap() && viewholder1.getItemId() == l)
                        {
                            viewholder1.addFlags(32);
                            return viewholder1;
                        }
                    }

                }
            }
            return null;
        }

        RecycledViewPool getRecycledViewPool()
        {
            if (mRecyclerPool == null)
            {
                mRecyclerPool = new RecycledViewPool();
            }
            return mRecyclerPool;
        }

        int getScrapCount()
        {
            return mAttachedScrap.size();
        }

        public List getScrapList()
        {
            return mUnmodifiableAttachedScrap;
        }

        View getScrapViewAt(int i)
        {
            return ((ViewHolder)mAttachedScrap.get(i)).itemView;
        }

        ViewHolder getScrapViewForId(long l, int i, boolean flag)
        {
            int j = mAttachedScrap.size() - 1;
_L5:
            if (j < 0) goto _L2; else goto _L1
_L1:
            ViewHolder viewholder1;
            viewholder1 = (ViewHolder)mAttachedScrap.get(j);
            if (viewholder1.getItemId() != l || viewholder1.wasReturnedFromScrap())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (i != viewholder1.getItemViewType()) goto _L4; else goto _L3
_L3:
            ViewHolder viewholder;
            viewholder1.addFlags(32);
            viewholder = viewholder1;
            if (viewholder1.isRemoved())
            {
                viewholder = viewholder1;
                if (!mState.isPreLayout())
                {
                    viewholder1.setFlags(2, 14);
                    viewholder = viewholder1;
                }
            }
_L8:
            return viewholder;
_L4:
            if (!flag)
            {
                mAttachedScrap.remove(j);
                removeDetachedView(viewholder1.itemView, false);
                quickRecycleScrapView(viewholder1.itemView);
            }
            j--;
              goto _L5
_L2:
            j = mCachedViews.size() - 1;
_L9:
            if (j < 0) goto _L7; else goto _L6
_L6:
label0:
            {
                ViewHolder viewholder2 = (ViewHolder)mCachedViews.get(j);
                if (viewholder2.getItemId() != l)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (i != viewholder2.getItemViewType())
                {
                    break label0;
                }
                viewholder = viewholder2;
                if (!flag)
                {
                    mCachedViews.remove(j);
                    return viewholder2;
                }
            }
              goto _L8
            if (!flag)
            {
                tryToRecycleCachedViewAt(j);
            }
            j--;
              goto _L9
_L7:
            return null;
              goto _L8
        }

        ViewHolder getScrapViewForPosition(int i, int j, boolean flag)
        {
            int k;
            int l;
            l = mAttachedScrap.size();
            k = 0;
_L10:
            if (k >= l) goto _L2; else goto _L1
_L1:
            Object obj = (ViewHolder)mAttachedScrap.get(k);
            if (((ViewHolder) (obj)).wasReturnedFromScrap() || ((ViewHolder) (obj)).getPosition() != i || ((ViewHolder) (obj)).isInvalid() || !mState.mInPreLayout && ((ViewHolder) (obj)).isRemoved()) goto _L4; else goto _L3
_L3:
            if (j == -1 || ((ViewHolder) (obj)).getItemViewType() == j) goto _L6; else goto _L5
_L5:
            Log.e("RecyclerView", (new StringBuilder()).append("Scrap view for position ").append(i).append(" isn't dirty but has").append(" wrong view type! (found ").append(((ViewHolder) (obj)).getItemViewType()).append(" but expected ").append(j).append(")").toString());
_L2:
            if (!flag)
            {
                obj = mChildHelper.findHiddenNonRemovedView(i, j);
                if (obj != null)
                {
                    mItemAnimator.endAnimation(getChildViewHolder(((View) (obj))));
                }
            }
            k = mCachedViews.size();
            j = 0;
_L8:
            if (j >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (ViewHolder)mCachedViews.get(j);
            if (!((ViewHolder) (obj)).isInvalid() && ((ViewHolder) (obj)).getPosition() == i)
            {
                if (!flag)
                {
                    mCachedViews.remove(j);
                }
                return ((ViewHolder) (obj));
            }
            j++;
            continue; /* Loop/switch isn't completed */
_L6:
            ((ViewHolder) (obj)).addFlags(32);
            return ((ViewHolder) (obj));
_L4:
            k++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L8; else goto _L7
_L7:
            return null;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public View getViewForPosition(int i)
        {
            return getViewForPosition(i, false);
        }

        View getViewForPosition(int i, boolean flag)
        {
            boolean flag3 = true;
            if (i < 0 || i >= mState.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).toString());
            }
            boolean flag1 = false;
            ViewHolder viewholder = null;
            Object obj;
            int j;
            int k;
            if (mState.isPreLayout())
            {
                viewholder = getChangedScrapViewForPosition(i);
                if (viewholder != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
            j = ((flag1) ? 1 : 0);
            obj = viewholder;
            if (viewholder == null)
            {
                viewholder = getScrapViewForPosition(i, -1, flag);
                j = ((flag1) ? 1 : 0);
                obj = viewholder;
                if (viewholder != null)
                {
                    if (!validateViewHolderForOffsetPosition(viewholder))
                    {
                        if (!flag)
                        {
                            viewholder.addFlags(4);
                            if (viewholder.isScrap())
                            {
                                removeDetachedView(viewholder.itemView, false);
                                viewholder.unScrap();
                            } else
                            if (viewholder.wasReturnedFromScrap())
                            {
                                viewholder.clearReturnedFromScrapFlag();
                            }
                            recycleViewHolderInternal(viewholder);
                        }
                        obj = null;
                        j = ((flag1) ? 1 : 0);
                    } else
                    {
                        j = 1;
                        obj = viewholder;
                    }
                }
            }
            k = j;
            viewholder = ((ViewHolder) (obj));
            if (obj == null)
            {
                int l = mAdapterHelper.findPositionOffset(i);
                if (l < 0 || l >= mAdapter.getItemCount())
                {
                    throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(l).append(").").append("state:").append(mState.getItemCount()).toString());
                }
                k = mAdapter.getItemViewType(l);
                flag1 = j;
                viewholder = ((ViewHolder) (obj));
                if (mAdapter.hasStableIds())
                {
                    obj = getScrapViewForId(mAdapter.getItemId(l), k, flag);
                    flag1 = j;
                    viewholder = ((ViewHolder) (obj));
                    if (obj != null)
                    {
                        obj.mPosition = l;
                        flag1 = true;
                        viewholder = ((ViewHolder) (obj));
                    }
                }
                obj = viewholder;
                if (viewholder == null)
                {
                    obj = viewholder;
                    if (mViewCacheExtension != null)
                    {
                        View view = mViewCacheExtension.getViewForPositionAndType(this, i, k);
                        obj = viewholder;
                        if (view != null)
                        {
                            viewholder = getChildViewHolder(view);
                            if (viewholder == null)
                            {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                            }
                            obj = viewholder;
                            if (viewholder.shouldIgnore())
                            {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                            }
                        }
                    }
                }
                ViewHolder viewholder1 = ((ViewHolder) (obj));
                if (obj == null)
                {
                    obj = getRecycledViewPool().getRecycledView(mAdapter.getItemViewType(l));
                    viewholder1 = ((ViewHolder) (obj));
                    if (obj != null)
                    {
                        ((ViewHolder) (obj)).resetInternal();
                        viewholder1 = ((ViewHolder) (obj));
                        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
                        {
                            invalidateDisplayListInt(((ViewHolder) (obj)));
                            viewholder1 = ((ViewHolder) (obj));
                        }
                    }
                }
                k = ((flag1) ? 1 : 0);
                viewholder = viewholder1;
                if (viewholder1 == null)
                {
                    viewholder = mAdapter.createViewHolder(RecyclerView.this, mAdapter.getItemViewType(l));
                    k = ((flag1) ? 1 : 0);
                }
            }
            j = 0;
            if (mState.isPreLayout() && viewholder.isBound())
            {
                viewholder.mPreLayoutPosition = i;
            } else
            if (!viewholder.isBound() || viewholder.needsUpdate() || viewholder.isInvalid())
            {
                j = mAdapterHelper.findPositionOffset(i);
                mAdapter.bindViewHolder(viewholder, j);
                attachAccessibilityDelegate(viewholder.itemView);
                boolean flag2 = true;
                j = ((flag2) ? 1 : 0);
                if (mState.isPreLayout())
                {
                    viewholder.mPreLayoutPosition = i;
                    j = ((flag2) ? 1 : 0);
                }
            }
            obj = viewholder.itemView.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)generateDefaultLayoutParams();
                viewholder.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                viewholder.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.mViewHolder = viewholder;
            if (k != 0 && j != 0)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            obj.mPendingInvalidate = flag;
            return viewholder.itemView;
        }

        void markItemDecorInsetsDirty()
        {
            int j = mCachedViews.size();
            for (int i = 0; i < j; i++)
            {
                LayoutParams layoutparams = (LayoutParams)((ViewHolder)mCachedViews.get(i)).itemView.getLayoutParams();
                if (layoutparams != null)
                {
                    layoutparams.mInsetsDirty = true;
                }
            }

        }

        void markKnownViewsInvalid()
        {
            if (mAdapter != null && mAdapter.hasStableIds())
            {
                int k = mCachedViews.size();
                for (int i = 0; i < k; i++)
                {
                    ViewHolder viewholder = (ViewHolder)mCachedViews.get(i);
                    if (viewholder != null)
                    {
                        viewholder.addFlags(6);
                    }
                }

            } else
            {
                for (int j = mCachedViews.size() - 1; j >= 0; j--)
                {
                    if (!tryToRecycleCachedViewAt(j))
                    {
                        ((ViewHolder)mCachedViews.get(j)).addFlags(6);
                    }
                }

            }
        }

        void onAdapterChanged(Adapter adapter, Adapter adapter1, boolean flag)
        {
            clear();
            getRecycledViewPool().onAdapterChanged(adapter, adapter1, flag);
        }

        void quickRecycleScrapView(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.mScrapContainer = null;
            view.clearReturnedFromScrapFlag();
            recycleViewHolderInternal(view);
        }

        void recycleAndClearCachedViews()
        {
            for (int i = mCachedViews.size() - 1; i >= 0; i--)
            {
                tryToRecycleCachedViewAt(i);
            }

            mCachedViews.clear();
        }

        public void recycleView(View view)
        {
            ViewHolder viewholder;
            viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.isTmpDetached())
            {
                removeDetachedView(view, false);
            }
            if (!viewholder.isScrap()) goto _L2; else goto _L1
_L1:
            viewholder.unScrap();
_L4:
            recycleViewHolderInternal(viewholder);
            return;
_L2:
            if (viewholder.wasReturnedFromScrap())
            {
                viewholder.clearReturnedFromScrapFlag();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        void recycleViewHolderInternal(ViewHolder viewholder)
        {
            if (viewholder.isScrap() || viewholder.itemView.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(viewholder.isScrap()).append(" isAttached:");
                boolean flag1;
                if (viewholder.itemView.getParent() != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                throw new IllegalArgumentException(stringbuilder.append(flag1).toString());
            }
            if (viewholder.isTmpDetached())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(viewholder).toString());
            }
            if (viewholder.shouldIgnore())
            {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            }
            if (!viewholder.isRecyclable()) goto _L2; else goto _L1
_L1:
            int i;
            boolean flag;
            flag = false;
            i = ((flag) ? 1 : 0);
            if (viewholder.isInvalid()) goto _L4; else goto _L3
_L3:
            if (mState.mInPreLayout) goto _L6; else goto _L5
_L5:
            i = ((flag) ? 1 : 0);
            if (viewholder.isRemoved()) goto _L4; else goto _L6
_L6:
            i = ((flag) ? 1 : 0);
            if (viewholder.isChanged()) goto _L4; else goto _L7
_L7:
            if (mCachedViews.size() != mViewCacheMax || mCachedViews.isEmpty()) goto _L9; else goto _L8
_L8:
            i = 0;
_L12:
            if (i < mCachedViews.size() && !tryToRecycleCachedViewAt(i)) goto _L10; else goto _L9
_L9:
            i = ((flag) ? 1 : 0);
            if (mCachedViews.size() < mViewCacheMax)
            {
                mCachedViews.add(viewholder);
                i = 1;
            }
_L4:
            if (i == 0)
            {
                getRecycledViewPool().putRecycledView(viewholder);
                dispatchViewRecycled(viewholder);
            }
_L2:
            mState.onViewRecycled(viewholder);
            return;
_L10:
            i++;
            if (true) goto _L12; else goto _L11
_L11:
        }

        void scrapView(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.setScrapContainer(this);
            if (!view.isChanged() || !supportsChangeAnimations())
            {
                if (view.isInvalid() && !view.isRemoved() && !mAdapter.hasStableIds())
                {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                } else
                {
                    mAttachedScrap.add(view);
                    return;
                }
            }
            if (mChangedScrap == null)
            {
                mChangedScrap = new ArrayList();
            }
            mChangedScrap.add(view);
        }

        void setRecycledViewPool(RecycledViewPool recycledviewpool)
        {
            if (mRecyclerPool != null)
            {
                mRecyclerPool.detach();
            }
            mRecyclerPool = recycledviewpool;
            if (recycledviewpool != null)
            {
                mRecyclerPool.attach(getAdapter());
            }
        }

        void setViewCacheExtension(ViewCacheExtension viewcacheextension)
        {
            mViewCacheExtension = viewcacheextension;
        }

        public void setViewCacheSize(int i)
        {
            mViewCacheMax = i;
            for (int j = mCachedViews.size() - 1; j >= 0 && mCachedViews.size() > i; j--)
            {
                tryToRecycleCachedViewAt(j);
            }

            for (; mCachedViews.size() > i; mCachedViews.remove(mCachedViews.size() - 1)) { }
        }

        boolean tryToRecycleCachedViewAt(int i)
        {
            ViewHolder viewholder = (ViewHolder)mCachedViews.get(i);
            if (viewholder.isRecyclable())
            {
                getRecycledViewPool().putRecycledView(viewholder);
                dispatchViewRecycled(viewholder);
                mCachedViews.remove(i);
                return true;
            } else
            {
                return false;
            }
        }

        void unscrapView(ViewHolder viewholder)
        {
            if (!viewholder.isChanged() || !supportsChangeAnimations() || mChangedScrap == null)
            {
                mAttachedScrap.remove(viewholder);
            } else
            {
                mChangedScrap.remove(viewholder);
            }
            viewholder.mScrapContainer = null;
            viewholder.clearReturnedFromScrapFlag();
        }

        boolean validateViewHolderForOffsetPosition(ViewHolder viewholder)
        {
            if (!viewholder.isRemoved())
            {
                if (viewholder.mPosition < 0 || viewholder.mPosition >= mAdapter.getItemCount())
                {
                    throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid view holder adapter position").append(viewholder).toString());
                }
                if (!mState.isPreLayout() && mAdapter.getItemViewType(viewholder.mPosition) != viewholder.getItemViewType())
                {
                    return false;
                }
                if (mAdapter.hasStableIds() && viewholder.getItemId() != mAdapter.getItemId(viewholder.mPosition))
                {
                    return false;
                }
            }
            return true;
        }

    }

    public static interface RecyclerListener
    {

        public abstract void onViewRecycled(ViewHolder viewholder);
    }

    private class RecyclerViewDataObserver extends AdapterDataObserver
    {
    }

    static class SavedState extends android.view.View.BaseSavedState
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
        Parcelable mLayoutState;

        private void copyFrom(SavedState savedstate)
        {
            mLayoutState = savedstate.mLayoutState;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(mLayoutState, 0);
        }



        SavedState(Parcel parcel)
        {
            super(parcel);
            mLayoutState = parcel.readParcelable(android/support/v7/widget/RecyclerView$LayoutManager.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static abstract class SmoothScroller
    {

        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private int mTargetPosition;
        private View mTargetView;

        private void onAnimation(int i, int j)
        {
            if (!mRunning || mTargetPosition == -1)
            {
                stop();
            }
            mPendingInitialRun = false;
            if (mTargetView != null)
            {
                if (getChildPosition(mTargetView) == mTargetPosition)
                {
                    onTargetFound(mTargetView, mRecyclerView.mState, mRecyclingAction);
                    mRecyclingAction.runIfNecessary(mRecyclerView);
                    stop();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    mTargetView = null;
                }
            }
            if (mRunning)
            {
                onSeekTargetStep(i, j, mRecyclerView.mState, mRecyclingAction);
                mRecyclingAction.runIfNecessary(mRecyclerView);
            }
        }

        public int getChildPosition(View view)
        {
            return mRecyclerView.getChildPosition(view);
        }

        public int getTargetPosition()
        {
            return mTargetPosition;
        }

        public boolean isPendingInitialRun()
        {
            return mPendingInitialRun;
        }

        public boolean isRunning()
        {
            return mRunning;
        }

        protected void onChildAttachedToWindow(View view)
        {
            if (getChildPosition(view) == getTargetPosition())
            {
                mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i, int j, State state, Action action);

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i)
        {
            mTargetPosition = i;
        }

        protected final void stop()
        {
            if (!mRunning)
            {
                return;
            } else
            {
                onStop();
                mRecyclerView.mState.mTargetPosition = -1;
                mTargetView = null;
                mTargetPosition = -1;
                mPendingInitialRun = false;
                mRunning = false;
                mLayoutManager.onSmoothScrollerStopped(this);
                mLayoutManager = null;
                mRecyclerView = null;
                return;
            }
        }

    }

    public static class SmoothScroller.Action
    {

        private boolean changed;
        private int consecutiveUpdates;
        private int mDuration;
        private int mDx;
        private int mDy;
        private Interpolator mInterpolator;

        private void runIfNecessary(RecyclerView recyclerview)
        {
            if (changed)
            {
                validate();
                if (mInterpolator == null)
                {
                    if (mDuration == 0x80000000)
                    {
                        recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy);
                    } else
                    {
                        recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration);
                    }
                } else
                {
                    recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
                }
                consecutiveUpdates = consecutiveUpdates + 1;
                if (consecutiveUpdates > 10)
                {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                changed = false;
                return;
            } else
            {
                consecutiveUpdates = 0;
                return;
            }
        }

        private void validate()
        {
            if (mInterpolator != null && mDuration < 1)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (mDuration < 1)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            } else
            {
                return;
            }
        }

    }

    public static class State
    {

        private SparseArray mData;
        private int mDeletedInvisibleItemCountSincePreviousLayout;
        private boolean mInPreLayout;
        int mItemCount;
        ArrayMap mOldChangedHolders;
        ArrayMap mPostLayoutHolderMap;
        ArrayMap mPreLayoutHolderMap;
        private int mPreviousLayoutItemCount;
        private boolean mRunPredictiveAnimations;
        private boolean mRunSimpleAnimations;
        private boolean mStructureChanged;
        private int mTargetPosition;

        private void removeFrom(ArrayMap arraymap, ViewHolder viewholder)
        {
            int i = arraymap.size() - 1;
            do
            {
label0:
                {
                    if (i >= 0)
                    {
                        if (viewholder != arraymap.valueAt(i))
                        {
                            break label0;
                        }
                        arraymap.removeAt(i);
                    }
                    return;
                }
                i--;
            } while (true);
        }

        public int getItemCount()
        {
            if (mInPreLayout)
            {
                return mPreviousLayoutItemCount - mDeletedInvisibleItemCountSincePreviousLayout;
            } else
            {
                return mItemCount;
            }
        }

        public int getTargetScrollPosition()
        {
            return mTargetPosition;
        }

        public boolean hasTargetScrollPosition()
        {
            return mTargetPosition != -1;
        }

        public boolean isPreLayout()
        {
            return mInPreLayout;
        }

        public void onViewRecycled(ViewHolder viewholder)
        {
            mPreLayoutHolderMap.remove(viewholder);
            mPostLayoutHolderMap.remove(viewholder);
            if (mOldChangedHolders != null)
            {
                removeFrom(mOldChangedHolders, viewholder);
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append("State{mTargetPosition=").append(mTargetPosition).append(", mPreLayoutHolderMap=").append(mPreLayoutHolderMap).append(", mPostLayoutHolderMap=").append(mPostLayoutHolderMap).append(", mData=").append(mData).append(", mItemCount=").append(mItemCount).append(", mPreviousLayoutItemCount=").append(mPreviousLayoutItemCount).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(mDeletedInvisibleItemCountSincePreviousLayout).append(", mStructureChanged=").append(mStructureChanged).append(", mInPreLayout=").append(mInPreLayout).append(", mRunSimpleAnimations=").append(mRunSimpleAnimations).append(", mRunPredictiveAnimations=").append(mRunPredictiveAnimations).append('}').toString();
        }

        public boolean willRunPredictiveAnimations()
        {
            return mRunPredictiveAnimations;
        }


/*
        static int access$1002(State state, int i)
        {
            state.mDeletedInvisibleItemCountSincePreviousLayout = i;
            return i;
        }

*/



/*
        static boolean access$1202(State state, boolean flag)
        {
            state.mStructureChanged = flag;
            return flag;
        }

*/



/*
        static boolean access$1402(State state, boolean flag)
        {
            state.mRunPredictiveAnimations = flag;
            return flag;
        }

*/



/*
        static boolean access$1502(State state, boolean flag)
        {
            state.mInPreLayout = flag;
            return flag;
        }

*/



/*
        static boolean access$1602(State state, boolean flag)
        {
            state.mRunSimpleAnimations = flag;
            return flag;
        }

*/


/*
        static int access$1902(State state, int i)
        {
            state.mPreviousLayoutItemCount = i;
            return i;
        }

*/


/*
        static int access$4602(State state, int i)
        {
            state.mTargetPosition = i;
            return i;
        }

*/
    }

    public static abstract class ViewCacheExtension
    {

        public abstract View getViewForPositionAndType(Recycler recycler, int i, int j);
    }

    private class ViewFlinger
        implements Runnable
    {

        private boolean mEatRunOnAnimationRequest;
        private Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        private boolean mReSchedulePostAnimationCallback;
        private ScrollerCompat mScroller;
        final RecyclerView this$0;

        private int computeScrollDuration(int i, int j, int k, int l)
        {
            int i1 = Math.abs(i);
            int j1 = Math.abs(j);
            float f;
            float f1;
            float f2;
            boolean flag;
            if (i1 > j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = (int)Math.sqrt(k * k + l * l);
            j = (int)Math.sqrt(i * i + j * j);
            if (flag)
            {
                i = getWidth();
            } else
            {
                i = getHeight();
            }
            l = i / 2;
            f2 = Math.min(1.0F, (1.0F * (float)j) / (float)i);
            f = l;
            f1 = l;
            f2 = distanceInfluenceForSnapDuration(f2);
            if (k > 0)
            {
                i = Math.round(1000F * Math.abs((f + f1 * f2) / (float)k)) * 4;
            } else
            {
                if (flag)
                {
                    j = i1;
                } else
                {
                    j = j1;
                }
                i = (int)(((float)j / (float)i + 1.0F) * 300F);
            }
            return Math.min(i, 2000);
        }

        private void disableRunOnAnimationRequests()
        {
            mReSchedulePostAnimationCallback = false;
            mEatRunOnAnimationRequest = true;
        }

        private float distanceInfluenceForSnapDuration(float f)
        {
            return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
        }

        private void enableRunOnAnimationRequests()
        {
            mEatRunOnAnimationRequest = false;
            if (mReSchedulePostAnimationCallback)
            {
                postOnAnimation();
            }
        }

        public void fling(int i, int j)
        {
            setScrollState(2);
            mLastFlingY = 0;
            mLastFlingX = 0;
            mScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
            postOnAnimation();
        }

        void postOnAnimation()
        {
            if (mEatRunOnAnimationRequest)
            {
                mReSchedulePostAnimationCallback = true;
                return;
            } else
            {
                ViewCompat.postOnAnimation(RecyclerView.this, this);
                return;
            }
        }

        public void run()
        {
            disableRunOnAnimationRequests();
            consumePendingUpdateOperations();
            ScrollerCompat scrollercompat = mScroller;
            SmoothScroller smoothscroller = mLayout.mSmoothScroller;
            if (scrollercompat.computeScrollOffset())
            {
                int k2 = scrollercompat.getCurrX();
                int l2 = scrollercompat.getCurrY();
                int i3 = k2 - mLastFlingX;
                int j3 = l2 - mLastFlingY;
                int l = 0;
                int i = 0;
                int k1 = 0;
                int l1 = 0;
                mLastFlingX = k2;
                mLastFlingY = l2;
                int i1 = 0;
                int k = 0;
                int j1 = 0;
                boolean flag = false;
                if (mAdapter != null)
                {
                    eatRequestLayout();
                    mRunningLayoutOrScroll = true;
                    if (i3 != 0)
                    {
                        i = mLayout.scrollHorizontallyBy(i3, mRecycler, mState);
                        k = i3 - i;
                    }
                    l = ((flag) ? 1 : 0);
                    i1 = l1;
                    if (j3 != 0)
                    {
                        i1 = mLayout.scrollVerticallyBy(j3, mRecycler, mState);
                        l = j3 - i1;
                    }
                    if (supportsChangeAnimations())
                    {
                        k1 = mChildHelper.getChildCount();
                        j1 = 0;
                        while (j1 < k1) 
                        {
                            View view = mChildHelper.getChildAt(j1);
                            Object obj = getChildViewHolder(view);
                            if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                            {
                                continue;
                            }
                            int i2;
                            if (((ViewHolder) (obj)).mShadowingHolder != null)
                            {
                                obj = ((ViewHolder) (obj)).mShadowingHolder.itemView;
                            } else
                            {
                                obj = null;
                            }
                            if (obj == null)
                            {
                                continue;
                            }
                            l1 = view.getLeft();
                            i2 = view.getTop();
                            if (l1 != ((View) (obj)).getLeft() || i2 != ((View) (obj)).getTop())
                            {
                                ((View) (obj)).layout(l1, i2, ((View) (obj)).getWidth() + l1, ((View) (obj)).getHeight() + i2);
                            }
                            j1++;
                        }
                    }
                    if (smoothscroller != null && !smoothscroller.isPendingInitialRun() && smoothscroller.isRunning())
                    {
                        j1 = mState.getItemCount();
                        if (j1 == 0)
                        {
                            smoothscroller.stop();
                        } else
                        if (smoothscroller.getTargetPosition() >= j1)
                        {
                            smoothscroller.setTargetPosition(j1 - 1);
                            smoothscroller.onAnimation(i3 - k, j3 - l);
                        } else
                        {
                            smoothscroller.onAnimation(i3 - k, j3 - l);
                        }
                    }
                    mRunningLayoutOrScroll = false;
                    resumeRequestLayout(false);
                    k1 = i1;
                    j1 = l;
                    i1 = k;
                    l = i;
                }
                if (i3 == l && j3 == k1)
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                if (!mItemDecorations.isEmpty())
                {
                    invalidate();
                }
                if (ViewCompat.getOverScrollMode(RecyclerView.this) != 2)
                {
                    considerReleasingGlowsOnScroll(i3, j3);
                }
                if (i1 != 0 || j1 != 0)
                {
                    int j2 = (int)scrollercompat.getCurrVelocity();
                    int j = 0;
                    if (i1 != k2)
                    {
                        if (i1 < 0)
                        {
                            j = -j2;
                        } else
                        if (i1 > 0)
                        {
                            j = j2;
                        } else
                        {
                            j = 0;
                        }
                    }
                    k = 0;
                    if (j1 != l2)
                    {
                        if (j1 < 0)
                        {
                            k = -j2;
                        } else
                        if (j1 > 0)
                        {
                            k = j2;
                        } else
                        {
                            k = 0;
                        }
                    }
                    if (ViewCompat.getOverScrollMode(RecyclerView.this) != 2)
                    {
                        absorbGlows(j, k);
                    }
                    if ((j != 0 || i1 == k2 || scrollercompat.getFinalX() == 0) && (k != 0 || j1 == l2 || scrollercompat.getFinalY() == 0))
                    {
                        scrollercompat.abortAnimation();
                    }
                }
                if (l != 0 || k1 != 0)
                {
                    onScrollChanged(0, 0, 0, 0);
                    if (mScrollListener != null)
                    {
                        mScrollListener.onScrolled(RecyclerView.this, l, k1);
                    }
                }
                if (!awakenScrollBars())
                {
                    invalidate();
                }
                if (scrollercompat.isFinished() || !l1)
                {
                    setScrollState(0);
                } else
                {
                    postOnAnimation();
                }
            }
            if (smoothscroller != null && smoothscroller.isPendingInitialRun())
            {
                smoothscroller.onAnimation(0, 0);
            }
            enableRunOnAnimationRequests();
        }

        public void smoothScrollBy(int i, int j)
        {
            smoothScrollBy(i, j, 0, 0);
        }

        public void smoothScrollBy(int i, int j, int k)
        {
            smoothScrollBy(i, j, k, RecyclerView.sQuinticInterpolator);
        }

        public void smoothScrollBy(int i, int j, int k, int l)
        {
            smoothScrollBy(i, j, computeScrollDuration(i, j, k, l));
        }

        public void smoothScrollBy(int i, int j, int k, Interpolator interpolator)
        {
            if (mInterpolator != interpolator)
            {
                mInterpolator = interpolator;
                mScroller = ScrollerCompat.create(getContext(), interpolator);
            }
            setScrollState(2);
            mLastFlingY = 0;
            mLastFlingX = 0;
            mScroller.startScroll(0, 0, i, j, k);
            postOnAnimation();
        }

        public void stop()
        {
            removeCallbacks(this);
            mScroller.abortAnimation();
        }
    }

    public static abstract class ViewHolder
    {

        public final View itemView;
        private int mFlags;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        int mOldPosition;
        int mPosition;
        int mPreLayoutPosition;
        private Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;

        void addFlags(int i)
        {
            mFlags = mFlags | i;
        }

        void clearOldPosition()
        {
            mOldPosition = -1;
            mPreLayoutPosition = -1;
        }

        void clearReturnedFromScrapFlag()
        {
            mFlags = mFlags & 0xffffffdf;
        }

        void clearTmpDetachFlag()
        {
            mFlags = mFlags & 0xfffffeff;
        }

        public final long getItemId()
        {
            return mItemId;
        }

        public final int getItemViewType()
        {
            return mItemViewType;
        }

        public final int getPosition()
        {
            if (mPreLayoutPosition == -1)
            {
                return mPosition;
            } else
            {
                return mPreLayoutPosition;
            }
        }

        boolean isBound()
        {
            return (mFlags & 1) != 0;
        }

        boolean isChanged()
        {
            return (mFlags & 0x40) != 0;
        }

        boolean isInvalid()
        {
            return (mFlags & 4) != 0;
        }

        public final boolean isRecyclable()
        {
            return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
        }

        boolean isRemoved()
        {
            return (mFlags & 8) != 0;
        }

        boolean isScrap()
        {
            return mScrapContainer != null;
        }

        boolean isTmpDetached()
        {
            return (mFlags & 0x100) != 0;
        }

        boolean needsUpdate()
        {
            return (mFlags & 2) != 0;
        }

        void resetInternal()
        {
            mFlags = 0;
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mPreLayoutPosition = -1;
            mIsRecyclableCount = 0;
            mShadowedHolder = null;
            mShadowingHolder = null;
        }

        void saveOldPosition()
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
        }

        void setFlags(int i, int j)
        {
            mFlags = mFlags & ~j | i & j;
        }

        public final void setIsRecyclable(boolean flag)
        {
            int i;
            if (flag)
            {
                i = mIsRecyclableCount - 1;
            } else
            {
                i = mIsRecyclableCount + 1;
            }
            mIsRecyclableCount = i;
            if (mIsRecyclableCount < 0)
            {
                mIsRecyclableCount = 0;
                Log.e("View", (new StringBuilder()).append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString());
            } else
            {
                if (!flag && mIsRecyclableCount == 1)
                {
                    mFlags = mFlags | 0x10;
                    return;
                }
                if (flag && mIsRecyclableCount == 0)
                {
                    mFlags = mFlags & 0xffffffef;
                    return;
                }
            }
        }

        void setScrapContainer(Recycler recycler)
        {
            mScrapContainer = recycler;
        }

        boolean shouldIgnore()
        {
            return (mFlags & 0x80) != 0;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("ViewHolder{").append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
            if (isScrap())
            {
                stringbuilder.append(" scrap");
            }
            if (isInvalid())
            {
                stringbuilder.append(" invalid");
            }
            if (!isBound())
            {
                stringbuilder.append(" unbound");
            }
            if (needsUpdate())
            {
                stringbuilder.append(" update");
            }
            if (isRemoved())
            {
                stringbuilder.append(" removed");
            }
            if (shouldIgnore())
            {
                stringbuilder.append(" ignored");
            }
            if (isChanged())
            {
                stringbuilder.append(" changed");
            }
            if (isTmpDetached())
            {
                stringbuilder.append(" tmpDetached");
            }
            if (!isRecyclable())
            {
                stringbuilder.append((new StringBuilder()).append(" not recyclable(").append(mIsRecyclableCount).append(")").toString());
            }
            if (itemView.getParent() == null)
            {
                stringbuilder.append(" no parent");
            }
            stringbuilder.append("}");
            return stringbuilder.toString();
        }

        void unScrap()
        {
            mScrapContainer.unscrapView(this);
        }

        boolean wasReturnedFromScrap()
        {
            return (mFlags & 0x20) != 0;
        }


/*
        static Recycler access$4002(ViewHolder viewholder, Recycler recycler)
        {
            viewholder.mScrapContainer = recycler;
            return recycler;
        }

*/
    }


    private static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    private static final Interpolator sQuinticInterpolator = new Interpolator() {

        public float getInterpolation(float f)
        {
            f--;
            return f * f * f * f * f + 1.0F;
        }

    };
    private RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private OnItemTouchListener mActiveOnItemTouchListener;
    private Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    private boolean mAdapterUpdateDuringMeasure;
    private EdgeEffectCompat mBottomGlow;
    ChildHelper mChildHelper;
    private boolean mClipToPadding;
    private boolean mDataSetHasChangedAfterLayout;
    final List mDisappearingViewsInLayoutPass;
    private boolean mEatRequestLayout;
    private boolean mFirstLayoutComplete;
    private boolean mHasFixedSize;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    private final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    private LayoutManager mLayout;
    private boolean mLayoutRequestEaten;
    private EdgeEffectCompat mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final RecyclerViewDataObserver mObserver;
    private final ArrayList mOnItemTouchListeners;
    private SavedState mPendingSavedState;
    private boolean mPostedAnimatorRunner;
    final Recycler mRecycler;
    private RecyclerListener mRecyclerListener;
    private EdgeEffectCompat mRightGlow;
    private boolean mRunningLayoutOrScroll;
    private OnScrollListener mScrollListener;
    private int mScrollPointerId;
    private int mScrollState;
    final State mState;
    private final Rect mTempRect;
    private EdgeEffectCompat mTopGlow;
    private int mTouchSlop;
    private final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    private final ViewFlinger mViewFlinger;

    private void addAnimatingView(ViewHolder viewholder)
    {
        View view = viewholder.itemView;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRecycler.unscrapView(getChildViewHolder(view));
        if (viewholder.isTmpDetached())
        {
            mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            mChildHelper.addView(view, true);
            return;
        } else
        {
            mChildHelper.hide(view);
            return;
        }
    }

    private void addToDisappearingList(View view)
    {
        if (!mDisappearingViewsInLayoutPass.contains(view))
        {
            mDisappearingViewsInLayoutPass.add(view);
        }
    }

    private void animateAppearance(ViewHolder viewholder, Rect rect, int i, int j)
    {
        View view = viewholder.itemView;
        if (rect != null && (rect.left != i || rect.top != j))
        {
            viewholder.setIsRecyclable(false);
            if (mItemAnimator.animateMove(viewholder, rect.left, rect.top, i, j))
            {
                postAnimationRunner();
            }
        } else
        {
            viewholder.setIsRecyclable(false);
            if (mItemAnimator.animateAdd(viewholder))
            {
                postAnimationRunner();
                return;
            }
        }
    }

    private void animateChange(ViewHolder viewholder, ViewHolder viewholder1)
    {
        viewholder.setIsRecyclable(false);
        addAnimatingView(viewholder);
        viewholder.mShadowedHolder = viewholder1;
        mRecycler.unscrapView(viewholder);
        int k = viewholder.itemView.getLeft();
        int l = viewholder.itemView.getTop();
        int i;
        int j;
        if (viewholder1 == null || viewholder1.shouldIgnore())
        {
            i = k;
            j = l;
        } else
        {
            i = viewholder1.itemView.getLeft();
            j = viewholder1.itemView.getTop();
            viewholder1.setIsRecyclable(false);
            viewholder1.mShadowingHolder = viewholder;
        }
        if (mItemAnimator.animateChange(viewholder, viewholder1, k, l, i, j))
        {
            postAnimationRunner();
        }
    }

    private void animateDisappearance(ItemHolderInfo itemholderinfo)
    {
        View view = itemholderinfo.holder.itemView;
        addAnimatingView(itemholderinfo.holder);
        int i = itemholderinfo.left;
        int j = itemholderinfo.top;
        int k = view.getLeft();
        int l = view.getTop();
        if (i != k || j != l)
        {
            itemholderinfo.holder.setIsRecyclable(false);
            view.layout(k, l, view.getWidth() + k, view.getHeight() + l);
            if (mItemAnimator.animateMove(itemholderinfo.holder, i, j, k, l))
            {
                postAnimationRunner();
            }
        } else
        {
            itemholderinfo.holder.setIsRecyclable(false);
            if (mItemAnimator.animateRemove(itemholderinfo.holder))
            {
                postAnimationRunner();
                return;
            }
        }
    }

    private void cancelTouch()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.clear();
        }
        releaseGlows();
        setScrollState(0);
    }

    private void considerReleasingGlowsOnScroll(int i, int j)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mLeftGlow != null)
        {
            flag = flag1;
            if (!mLeftGlow.isFinished())
            {
                flag = flag1;
                if (i > 0)
                {
                    flag = mLeftGlow.onRelease();
                }
            }
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag;
            if (!mRightGlow.isFinished())
            {
                flag1 = flag;
                if (i < 0)
                {
                    flag1 = flag | mRightGlow.onRelease();
                }
            }
        }
        flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1;
            if (!mTopGlow.isFinished())
            {
                flag = flag1;
                if (j > 0)
                {
                    flag = flag1 | mTopGlow.onRelease();
                }
            }
        }
        flag1 = flag;
        if (mBottomGlow != null)
        {
            flag1 = flag;
            if (!mBottomGlow.isFinished())
            {
                flag1 = flag;
                if (j < 0)
                {
                    flag1 = flag | mBottomGlow.onRelease();
                }
            }
        }
        if (flag1)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void consumePendingUpdateOperations()
    {
        mUpdateChildViewsRunnable.run();
    }

    private void dispatchChildDetached(View view)
    {
        if (mAdapter != null)
        {
            mAdapter.onViewDetachedFromWindow(getChildViewHolderInt(view));
        }
        onChildDetachedFromWindow(view);
    }

    private boolean dispatchOnItemTouch(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (mActiveOnItemTouchListener == null) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        mActiveOnItemTouchListener = null;
_L2:
        if (i == 0) goto _L6; else goto _L5
_L5:
        int j;
        j = mOnItemTouchListeners.size();
        i = 0;
_L11:
        OnItemTouchListener onitemtouchlistener;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        onitemtouchlistener = (OnItemTouchListener)mOnItemTouchListeners.get(i);
        if (!onitemtouchlistener.onInterceptTouchEvent(this, motionevent)) goto _L8; else goto _L7
_L7:
        mActiveOnItemTouchListener = onitemtouchlistener;
_L10:
        return true;
_L4:
        mActiveOnItemTouchListener.onTouchEvent(this, motionevent);
        if (i != 3 && i != 1) goto _L10; else goto _L9
_L9:
        mActiveOnItemTouchListener = null;
        return true;
_L8:
        i++;
        if (true) goto _L11; else goto _L6
_L6:
        return false;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionevent)
    {
        int j = motionevent.getAction();
        if (j == 3 || j == 0)
        {
            mActiveOnItemTouchListener = null;
        }
        int k = mOnItemTouchListeners.size();
        for (int i = 0; i < k; i++)
        {
            OnItemTouchListener onitemtouchlistener = (OnItemTouchListener)mOnItemTouchListeners.get(i);
            if (onitemtouchlistener.onInterceptTouchEvent(this, motionevent) && j != 3)
            {
                mActiveOnItemTouchListener = onitemtouchlistener;
                return true;
            }
        }

        return false;
    }

    static ViewHolder getChildViewHolderInt(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).mViewHolder;
        }
    }

    private void onPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == mScrollPointerId)
        {
            int j;
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mScrollPointerId = MotionEventCompat.getPointerId(motionevent, i);
            j = (int)(MotionEventCompat.getX(motionevent, i) + 0.5F);
            mLastTouchX = j;
            mInitialTouchX = j;
            i = (int)(MotionEventCompat.getY(motionevent, i) + 0.5F);
            mLastTouchY = i;
            mInitialTouchY = i;
        }
    }

    private void postAnimationRunner()
    {
        if (!mPostedAnimatorRunner && mIsAttached)
        {
            ViewCompat.postOnAnimation(this, mItemAnimatorRunner);
            mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled()
    {
        return mItemAnimator != null && mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags()
    {
        boolean flag2 = true;
        if (mDataSetHasChangedAfterLayout)
        {
            mAdapterHelper.reset();
            markKnownViewsInvalid();
            mLayout.onItemsChanged(this);
        }
        State state;
        boolean flag;
        boolean flag1;
        if (mItemAnimator != null && mLayout.supportsPredictiveItemAnimations())
        {
            mAdapterHelper.preProcess();
        } else
        {
            mAdapterHelper.consumeUpdatesInOnePass();
        }
        if (mItemsAddedOrRemoved && !mItemsChanged || mItemsAddedOrRemoved || mItemsChanged && supportsChangeAnimations())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        state = mState;
        if (mFirstLayoutComplete && mItemAnimator != null && (mDataSetHasChangedAfterLayout || flag || mLayout.mRequestedSimpleAnimations) && (!mDataSetHasChangedAfterLayout || mAdapter.hasStableIds()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        state.mRunSimpleAnimations = flag1;
        state = mState;
        if (mState.mRunSimpleAnimations && flag && !mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        state.mRunPredictiveAnimations = flag1;
    }

    private void processDisappearingList(ArrayMap arraymap)
    {
        int j = mDisappearingViewsInLayoutPass.size();
        int i = 0;
        while (i < j) 
        {
            View view = (View)mDisappearingViewsInLayoutPass.get(i);
            ViewHolder viewholder = getChildViewHolderInt(view);
            ItemHolderInfo itemholderinfo = (ItemHolderInfo)mState.mPreLayoutHolderMap.remove(viewholder);
            if (!mState.isPreLayout())
            {
                mState.mPostLayoutHolderMap.remove(viewholder);
            }
            if (arraymap.remove(view) != null)
            {
                mLayout.removeAndRecycleView(view, mRecycler);
            } else
            if (itemholderinfo != null)
            {
                animateDisappearance(itemholderinfo);
            } else
            {
                animateDisappearance(new ItemHolderInfo(viewholder, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i++;
        }
        mDisappearingViewsInLayoutPass.clear();
    }

    private void pullGlows(int i, int j)
    {
        if (i < 0)
        {
            ensureLeftGlow();
            mLeftGlow.onPull((float)(-i) / (float)getWidth());
        } else
        if (i > 0)
        {
            ensureRightGlow();
            mRightGlow.onPull((float)i / (float)getWidth());
        }
        if (j < 0)
        {
            ensureTopGlow();
            mTopGlow.onPull((float)(-j) / (float)getHeight());
        } else
        if (j > 0)
        {
            ensureBottomGlow();
            mBottomGlow.onPull((float)j / (float)getHeight());
        }
        if (i != 0 || j != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void releaseGlows()
    {
        boolean flag1 = false;
        if (mLeftGlow != null)
        {
            flag1 = mLeftGlow.onRelease();
        }
        boolean flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1 | mTopGlow.onRelease();
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag | mRightGlow.onRelease();
        }
        flag = flag1;
        if (mBottomGlow != null)
        {
            flag = flag1 | mBottomGlow.onRelease();
        }
        if (flag)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void removeFromDisappearingList(View view)
    {
        mDisappearingViewsInLayoutPass.remove(view);
    }

    private void setAdapterInternal(Adapter adapter, boolean flag, boolean flag1)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterAdapterDataObserver(mObserver);
            mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!flag || flag1)
        {
            if (mItemAnimator != null)
            {
                mItemAnimator.endAnimations();
            }
            if (mLayout != null)
            {
                mLayout.removeAndRecycleAllViews(mRecycler);
                mLayout.removeAndRecycleScrapInt(mRecycler);
            }
        }
        mAdapterHelper.reset();
        Adapter adapter1 = mAdapter;
        mAdapter = adapter;
        if (adapter != null)
        {
            adapter.registerAdapterDataObserver(mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        if (mLayout != null)
        {
            mLayout.onAdapterChanged(adapter1, mAdapter);
        }
        mRecycler.onAdapterChanged(adapter1, mAdapter, flag);
        mState.mStructureChanged = true;
        markKnownViewsInvalid();
    }

    private void setScrollState(int i)
    {
        if (i == mScrollState)
        {
            return;
        }
        mScrollState = i;
        if (i != 2)
        {
            stopScrollersInternal();
        }
        if (mScrollListener != null)
        {
            mScrollListener.onScrollStateChanged(this, i);
        }
        mLayout.onScrollStateChanged(i);
    }

    private void stopScrollersInternal()
    {
        mViewFlinger.stop();
        mLayout.stopSmoothScroller();
    }

    private boolean supportsChangeAnimations()
    {
        return mItemAnimator != null && mItemAnimator.getSupportsChangeAnimations();
    }

    void absorbGlows(int i, int j)
    {
        if (i < 0)
        {
            ensureLeftGlow();
            mLeftGlow.onAbsorb(-i);
        } else
        if (i > 0)
        {
            ensureRightGlow();
            mRightGlow.onAbsorb(i);
        }
        if (j < 0)
        {
            ensureTopGlow();
            mTopGlow.onAbsorb(-j);
        } else
        if (j > 0)
        {
            ensureBottomGlow();
            mBottomGlow.onAbsorb(j);
        }
        if (i != 0 || j != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        if (!mLayout.onAddFocusables(this, arraylist, i, j))
        {
            super.addFocusables(arraylist, i, j);
        }
    }

    void assertNotInLayoutOrScroll(String s)
    {
        if (mRunningLayoutOrScroll)
        {
            if (s == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s);
            }
        } else
        {
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && mLayout.checkLayoutParams((LayoutParams)layoutparams);
    }

    void clearOldPositions()
    {
        int j = mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(i));
            if (!viewholder.shouldIgnore())
            {
                viewholder.clearOldPosition();
            }
        }

        mRecycler.clearOldPositions();
    }

    protected int computeHorizontalScrollExtent()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollExtent(mState);
        } else
        {
            return 0;
        }
    }

    protected int computeHorizontalScrollOffset()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollOffset(mState);
        } else
        {
            return 0;
        }
    }

    protected int computeHorizontalScrollRange()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollRange(mState);
        } else
        {
            return 0;
        }
    }

    protected int computeVerticalScrollExtent()
    {
        if (mLayout.canScrollVertically())
        {
            return mLayout.computeVerticalScrollExtent(mState);
        } else
        {
            return 0;
        }
    }

    protected int computeVerticalScrollOffset()
    {
        if (mLayout.canScrollVertically())
        {
            return mLayout.computeVerticalScrollOffset(mState);
        } else
        {
            return 0;
        }
    }

    protected int computeVerticalScrollRange()
    {
        if (mLayout.canScrollVertically())
        {
            return mLayout.computeVerticalScrollRange(mState);
        } else
        {
            return 0;
        }
    }

    void dispatchLayout()
    {
        Object obj;
        if (mAdapter == null)
        {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        mDisappearingViewsInLayoutPass.clear();
        eatRequestLayout();
        mRunningLayoutOrScroll = true;
        processAdapterUpdatesAndSetAnimationFlags();
        State state = mState;
        if (mState.mRunSimpleAnimations && mItemsChanged && supportsChangeAnimations())
        {
            obj = new ArrayMap();
        } else
        {
            obj = null;
        }
        state.mOldChangedHolders = ((ArrayMap) (obj));
        mItemsChanged = false;
        mItemsAddedOrRemoved = false;
        obj = null;
        mState.mInPreLayout = mState.mRunPredictiveAnimations;
        mState.mItemCount = mAdapter.getItemCount();
        if (mState.mRunSimpleAnimations)
        {
            mState.mPreLayoutHolderMap.clear();
            mState.mPostLayoutHolderMap.clear();
            int k1 = mChildHelper.getChildCount();
            int i = 0;
            while (i < k1) 
            {
                ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getChildAt(i));
                if (!viewholder.shouldIgnore() && (!viewholder.isInvalid() || mAdapter.hasStableIds()))
                {
                    View view = viewholder.itemView;
                    mState.mPreLayoutHolderMap.put(viewholder, new ItemHolderInfo(viewholder, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                }
                i++;
            }
        }
        if (!mState.mRunPredictiveAnimations) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k;
        saveOldPositions();
        if (mState.mOldChangedHolders != null)
        {
            int l1 = mChildHelper.getChildCount();
            for (int j = 0; j < l1; j++)
            {
                obj = getChildViewHolderInt(mChildHelper.getChildAt(j));
                if (((ViewHolder) (obj)).isChanged() && !((ViewHolder) (obj)).isRemoved() && !((ViewHolder) (obj)).shouldIgnore())
                {
                    long l2 = getChangedHolderKey(((ViewHolder) (obj)));
                    mState.mOldChangedHolders.put(Long.valueOf(l2), obj);
                    mState.mPreLayoutHolderMap.remove(obj);
                }
            }

        }
        boolean flag2 = mState.mStructureChanged;
        mState.mStructureChanged = false;
        mLayout.onLayoutChildren(mRecycler, mState);
        mState.mStructureChanged = flag2;
        obj1 = new ArrayMap();
        k = 0;
_L7:
        if (k >= mChildHelper.getChildCount()) goto _L4; else goto _L3
_L3:
        boolean flag1;
        flag1 = false;
        obj = mChildHelper.getChildAt(k);
        if (!getChildViewHolderInt(((View) (obj))).shouldIgnore()) goto _L6; else goto _L5
_L5:
        k++;
          goto _L7
_L6:
        int i2 = 0;
_L8:
label0:
        {
            boolean flag = flag1;
            if (i2 < mState.mPreLayoutHolderMap.size())
            {
                if (((ViewHolder)mState.mPreLayoutHolderMap.keyAt(i2)).itemView != obj)
                {
                    break label0;
                }
                flag = true;
            }
            if (!flag)
            {
                ((ArrayMap) (obj1)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
            }
        }
          goto _L5
        i2++;
          goto _L8
_L4:
        clearOldPositions();
        mAdapterHelper.consumePostponedUpdates();
_L12:
        mState.mItemCount = mAdapter.getItemCount();
        mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        mState.mInPreLayout = false;
        mLayout.onLayoutChildren(mRecycler, mState);
        mState.mStructureChanged = false;
        mPendingSavedState = null;
        obj = mState;
        int l;
        int j2;
        long l3;
        boolean flag3;
        if (mState.mRunSimpleAnimations && mItemAnimator != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        obj.mRunSimpleAnimations = flag3;
        if (!mState.mRunSimpleAnimations) goto _L10; else goto _L9
_L2:
        clearOldPositions();
        mAdapterHelper.consumeUpdatesInOnePass();
        obj1 = obj;
        if (mState.mOldChangedHolders == null) goto _L12; else goto _L11
_L11:
        j2 = mChildHelper.getChildCount();
        l = 0;
_L14:
        obj1 = obj;
        if (l >= j2) goto _L12; else goto _L13
_L13:
        obj1 = getChildViewHolderInt(mChildHelper.getChildAt(l));
        if (((ViewHolder) (obj1)).isChanged() && !((ViewHolder) (obj1)).isRemoved() && !((ViewHolder) (obj1)).shouldIgnore())
        {
            l3 = getChangedHolderKey(((ViewHolder) (obj1)));
            mState.mOldChangedHolders.put(Long.valueOf(l3), obj1);
            mState.mPreLayoutHolderMap.remove(obj1);
        }
        l++;
          goto _L14
_L9:
        long l5;
        {
            if (mState.mOldChangedHolders != null)
            {
                obj = new ArrayMap();
            } else
            {
                obj = null;
            }
            j2 = mChildHelper.getChildCount();
            l = 0;
            while (l < j2) 
            {
                ViewHolder viewholder1 = getChildViewHolderInt(mChildHelper.getChildAt(l));
                if (!viewholder1.shouldIgnore())
                {
                    View view2 = viewholder1.itemView;
                    long l4 = getChangedHolderKey(viewholder1);
                    if (obj != null && mState.mOldChangedHolders.get(Long.valueOf(l4)) != null)
                    {
                        ((ArrayMap) (obj)).put(Long.valueOf(l4), viewholder1);
                    } else
                    {
                        mState.mPostLayoutHolderMap.put(viewholder1, new ItemHolderInfo(viewholder1, view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()));
                    }
                }
                l++;
            }
            processDisappearingList(((ArrayMap) (obj1)));
            for (int i1 = mState.mPreLayoutHolderMap.size() - 1; i1 >= 0; i1--)
            {
                ViewHolder viewholder2 = (ViewHolder)mState.mPreLayoutHolderMap.keyAt(i1);
                if (!mState.mPostLayoutHolderMap.containsKey(viewholder2))
                {
                    ItemHolderInfo itemholderinfo = (ItemHolderInfo)mState.mPreLayoutHolderMap.valueAt(i1);
                    mState.mPreLayoutHolderMap.removeAt(i1);
                    View view3 = itemholderinfo.holder.itemView;
                    mRecycler.unscrapView(itemholderinfo.holder);
                    animateDisappearance(itemholderinfo);
                }
            }

            int j1 = mState.mPostLayoutHolderMap.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    ViewHolder viewholder3 = (ViewHolder)mState.mPostLayoutHolderMap.keyAt(j1);
                    ItemHolderInfo itemholderinfo3 = (ItemHolderInfo)mState.mPostLayoutHolderMap.valueAt(j1);
                    if (mState.mPreLayoutHolderMap.isEmpty() || !mState.mPreLayoutHolderMap.containsKey(viewholder3))
                    {
                        mState.mPostLayoutHolderMap.removeAt(j1);
                        Rect rect;
                        if (obj1 != null)
                        {
                            rect = (Rect)((ArrayMap) (obj1)).get(viewholder3.itemView);
                        } else
                        {
                            rect = null;
                        }
                        animateAppearance(viewholder3, rect, itemholderinfo3.left, itemholderinfo3.top);
                    }
                    j1--;
                }
            }
            int k2 = mState.mPostLayoutHolderMap.size();
            for (j1 = 0; j1 < k2; j1++)
            {
                obj1 = (ViewHolder)mState.mPostLayoutHolderMap.keyAt(j1);
                ItemHolderInfo itemholderinfo1 = (ItemHolderInfo)mState.mPostLayoutHolderMap.valueAt(j1);
                ItemHolderInfo itemholderinfo2 = (ItemHolderInfo)mState.mPreLayoutHolderMap.get(obj1);
                if (itemholderinfo2 == null || itemholderinfo1 == null || itemholderinfo2.left == itemholderinfo1.left && itemholderinfo2.top == itemholderinfo1.top)
                {
                    continue;
                }
                ((ViewHolder) (obj1)).setIsRecyclable(false);
                if (mItemAnimator.animateMove(((ViewHolder) (obj1)), itemholderinfo2.left, itemholderinfo2.top, itemholderinfo1.left, itemholderinfo1.top))
                {
                    postAnimationRunner();
                }
            }

            View view1;
            if (mState.mOldChangedHolders != null)
            {
                j1 = mState.mOldChangedHolders.size();
            } else
            {
                j1 = 0;
            }
            j1--;
        }
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l5 = ((Long)mState.mOldChangedHolders.keyAt(j1)).longValue();
        obj1 = (ViewHolder)mState.mOldChangedHolders.get(Long.valueOf(l5));
        view1 = ((ViewHolder) (obj1)).itemView;
        if (!((ViewHolder) (obj1)).shouldIgnore() && mRecycler.mChangedScrap != null && mRecycler.mChangedScrap.contains(obj1))
        {
            animateChange(((ViewHolder) (obj1)), (ViewHolder)((ArrayMap) (obj)).get(Long.valueOf(l5)));
        }
        j1--;
        if (true) goto _L15; else goto _L10
_L15:
        break MISSING_BLOCK_LABEL_1432;
_L10:
        resumeRequestLayout(false);
        mLayout.removeAndRecycleScrapInt(mRecycler);
        mState.mPreviousLayoutItemCount = mState.mItemCount;
        mDataSetHasChangedAfterLayout = false;
        mState.mRunSimpleAnimations = false;
        mState.mRunPredictiveAnimations = false;
        mRunningLayoutOrScroll = false;
        mLayout.mRequestedSimpleAnimations = false;
        if (mRecycler.mChangedScrap != null)
        {
            mRecycler.mChangedScrap.clear();
        }
        mState.mOldChangedHolders = null;
        return;
          goto _L5
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        super.draw(canvas);
        int k = mItemDecorations.size();
        for (int i = 0; i < k; i++)
        {
            ((ItemDecoration)mItemDecorations.get(i)).onDrawOver(canvas, this, mState);
        }

        int j = 0;
        k = j;
        if (mLeftGlow != null)
        {
            k = j;
            if (!mLeftGlow.isFinished())
            {
                int l = canvas.save();
                int i1;
                if (mClipToPadding)
                {
                    j = getPaddingBottom();
                } else
                {
                    j = 0;
                }
                canvas.rotate(270F);
                canvas.translate(-getHeight() + j, 0.0F);
                if (mLeftGlow != null && mLeftGlow.draw(canvas))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                canvas.restoreToCount(l);
            }
        }
        j = k;
        if (mTopGlow != null)
        {
            j = k;
            if (!mTopGlow.isFinished())
            {
                l = canvas.save();
                if (mClipToPadding)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (mTopGlow != null && mTopGlow.draw(canvas))
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                j = k | j;
                canvas.restoreToCount(l);
            }
        }
        k = j;
        if (mRightGlow != null)
        {
            k = j;
            if (!mRightGlow.isFinished())
            {
                l = canvas.save();
                i1 = getWidth();
                if (mClipToPadding)
                {
                    k = getPaddingTop();
                } else
                {
                    k = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k, -i1);
                if (mRightGlow != null && mRightGlow.draw(canvas))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                k = j | k;
                canvas.restoreToCount(l);
            }
        }
        j = k;
        if (mBottomGlow != null)
        {
            j = k;
            if (!mBottomGlow.isFinished())
            {
                l = canvas.save();
                canvas.rotate(180F);
                if (mClipToPadding)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                if (mBottomGlow != null && mBottomGlow.draw(canvas))
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                j = k | j;
                canvas.restoreToCount(l);
            }
        }
        k = j;
        if (j == 0)
        {
            k = j;
            if (mItemAnimator != null)
            {
                k = j;
                if (mItemDecorations.size() > 0)
                {
                    k = j;
                    if (mItemAnimator.isRunning())
                    {
                        k = 1;
                    }
                }
            }
        }
        if (k != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void eatRequestLayout()
    {
        if (!mEatRequestLayout)
        {
            mEatRequestLayout = true;
            mLayoutRequestEaten = false;
        }
    }

    void ensureBottomGlow()
    {
        if (mBottomGlow != null)
        {
            return;
        }
        mBottomGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mBottomGlow.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    void ensureLeftGlow()
    {
        if (mLeftGlow != null)
        {
            return;
        }
        mLeftGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mLeftGlow.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureRightGlow()
    {
        if (mRightGlow != null)
        {
            return;
        }
        mRightGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mRightGlow.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureTopGlow()
    {
        if (mTopGlow != null)
        {
            return;
        }
        mTopGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mTopGlow.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public boolean fling(int i, int j)
    {
        int k = i;
        if (Math.abs(i) < mMinFlingVelocity)
        {
            k = 0;
        }
        i = j;
        if (Math.abs(j) < mMinFlingVelocity)
        {
            i = 0;
        }
        j = Math.max(-mMaxFlingVelocity, Math.min(k, mMaxFlingVelocity));
        i = Math.max(-mMaxFlingVelocity, Math.min(i, mMaxFlingVelocity));
        if (j != 0 || i != 0)
        {
            mViewFlinger.fling(j, i);
            return true;
        } else
        {
            return false;
        }
    }

    public View focusSearch(View view, int i)
    {
        View view1 = mLayout.onInterceptFocusSearch(view, i);
        if (view1 != null)
        {
            return view1;
        }
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i);
        view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (mAdapter != null)
            {
                eatRequestLayout();
                view1 = mLayout.onFocusSearchFailed(view, i, mRecycler, mState);
                resumeRequestLayout(false);
            }
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return super.focusSearch(view, i);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.generateDefaultLayoutParams();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.generateLayoutParams(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.generateLayoutParams(layoutparams);
        }
    }

    public Adapter getAdapter()
    {
        return mAdapter;
    }

    long getChangedHolderKey(ViewHolder viewholder)
    {
        if (mAdapter.hasStableIds())
        {
            return viewholder.getItemId();
        } else
        {
            return (long)viewholder.mPosition;
        }
    }

    public int getChildPosition(View view)
    {
        view = getChildViewHolderInt(view);
        if (view != null)
        {
            return view.getPosition();
        } else
        {
            return -1;
        }
    }

    public ViewHolder getChildViewHolder(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return getChildViewHolderInt(view);
        }
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate()
    {
        return mAccessibilityDelegate;
    }

    public ItemAnimator getItemAnimator()
    {
        return mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mInsetsDirty)
        {
            return layoutparams.mDecorInsets;
        }
        Rect rect = layoutparams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int j = mItemDecorations.size();
        for (int i = 0; i < j; i++)
        {
            mTempRect.set(0, 0, 0, 0);
            ((ItemDecoration)mItemDecorations.get(i)).getItemOffsets(mTempRect, view, this, mState);
            rect.left = rect.left + mTempRect.left;
            rect.top = rect.top + mTempRect.top;
            rect.right = rect.right + mTempRect.right;
            rect.bottom = rect.bottom + mTempRect.bottom;
        }

        layoutparams.mInsetsDirty = false;
        return rect;
    }

    public LayoutManager getLayoutManager()
    {
        return mLayout;
    }

    public RecycledViewPool getRecycledViewPool()
    {
        return mRecycler.getRecycledViewPool();
    }

    public int getScrollState()
    {
        return mScrollState;
    }

    void invalidateGlows()
    {
        mBottomGlow = null;
        mTopGlow = null;
        mRightGlow = null;
        mLeftGlow = null;
    }

    void markItemDecorInsetsDirty()
    {
        int j = mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < j; i++)
        {
            ((LayoutParams)mChildHelper.getUnfilteredChildAt(i).getLayoutParams()).mInsetsDirty = true;
        }

        mRecycler.markItemDecorInsetsDirty();
    }

    void markKnownViewsInvalid()
    {
        int j = mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(i));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                viewholder.addFlags(6);
            }
        }

        markItemDecorInsetsDirty();
        mRecycler.markKnownViewsInvalid();
    }

    public void offsetChildrenHorizontal(int i)
    {
        int k = mChildHelper.getChildCount();
        for (int j = 0; j < k; j++)
        {
            mChildHelper.getChildAt(j).offsetLeftAndRight(i);
        }

    }

    public void offsetChildrenVertical(int i)
    {
        int k = mChildHelper.getChildCount();
        for (int j = 0; j < k; j++)
        {
            mChildHelper.getChildAt(j).offsetTopAndBottom(i);
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mIsAttached = true;
        mFirstLayoutComplete = false;
        if (mLayout != null)
        {
            mLayout.onAttachedToWindow(this);
        }
        mPostedAnimatorRunner = false;
    }

    public void onChildDetachedFromWindow(View view)
    {
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mItemAnimator != null)
        {
            mItemAnimator.endAnimations();
        }
        mFirstLayoutComplete = false;
        stopScroll();
        mIsAttached = false;
        if (mLayout != null)
        {
            mLayout.onDetachedFromWindow(this, mRecycler);
        }
        removeCallbacks(mItemAnimatorRunner);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j = mItemDecorations.size();
        for (int i = 0; i < j; i++)
        {
            ((ItemDecoration)mItemDecorations.get(i)).onDraw(canvas, this, mState);
        }

    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        int k;
        boolean flag;
        boolean flag1;
        if (dispatchOnItemTouchIntercept(motionevent))
        {
            cancelTouch();
            return true;
        }
        flag = mLayout.canScrollHorizontally();
        flag1 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        k = MotionEventCompat.getActionMasked(motionevent);
        i = MotionEventCompat.getActionIndex(motionevent);
        k;
        JVM INSTR tableswitch 0 6: default 108
    //                   0 118
    //                   1 488
    //                   2 247
    //                   3 498
    //                   4 108
    //                   5 193
    //                   6 480;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_498;
_L8:
        return mScrollState == 1;
_L2:
        mScrollPointerId = MotionEventCompat.getPointerId(motionevent, 0);
        i = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i;
        mInitialTouchX = i;
        i = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        if (mScrollState == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
        }
          goto _L8
_L6:
        mScrollPointerId = MotionEventCompat.getPointerId(motionevent, i);
        int l = (int)(MotionEventCompat.getX(motionevent, i) + 0.5F);
        mLastTouchX = l;
        mInitialTouchX = l;
        i = (int)(MotionEventCompat.getY(motionevent, i) + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
          goto _L8
_L4:
        int i1 = MotionEventCompat.findPointerIndex(motionevent, mScrollPointerId);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        if (mScrollState != 1)
        {
            int l1 = j - mInitialTouchX;
            int k1 = i1 - mInitialTouchY;
            i1 = 0;
            j = i1;
            if (flag)
            {
                j = i1;
                if (Math.abs(l1) > mTouchSlop)
                {
                    int j1 = mInitialTouchX;
                    int i2 = mTouchSlop;
                    if (l1 < 0)
                    {
                        j = -1;
                    } else
                    {
                        j = 1;
                    }
                    mLastTouchX = j * i2 + j1;
                    j = 1;
                }
            }
            j1 = j;
            if (flag1)
            {
                j1 = j;
                if (Math.abs(k1) > mTouchSlop)
                {
                    j1 = mInitialTouchY;
                    l1 = mTouchSlop;
                    if (k1 < 0)
                    {
                        j = -1;
                    } else
                    {
                        j = 1;
                    }
                    mLastTouchY = j * l1 + j1;
                    j1 = 1;
                }
            }
            if (j1 != 0)
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        }
          goto _L8
_L7:
        onPointerUp(motionevent);
          goto _L8
_L3:
        mVelocityTracker.clear();
          goto _L8
        cancelTouch();
          goto _L8
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        eatRequestLayout();
        dispatchLayout();
        resumeRequestLayout(false);
        mFirstLayoutComplete = true;
    }

    protected void onMeasure(int i, int j)
    {
        if (mAdapterUpdateDuringMeasure)
        {
            eatRequestLayout();
            processAdapterUpdatesAndSetAnimationFlags();
            if (mState.mRunPredictiveAnimations)
            {
                mState.mInPreLayout = true;
            } else
            {
                mAdapterHelper.consumeUpdatesInOnePass();
                mState.mInPreLayout = false;
            }
            mAdapterUpdateDuringMeasure = false;
            resumeRequestLayout(false);
        }
        if (mAdapter != null)
        {
            mState.mItemCount = mAdapter.getItemCount();
        } else
        {
            mState.mItemCount = 0;
        }
        mLayout.onMeasure(mRecycler, mState, i, j);
        mState.mInPreLayout = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        mPendingSavedState = (SavedState)parcelable;
        super.onRestoreInstanceState(mPendingSavedState.getSuperState());
        if (mLayout != null && mPendingSavedState.mLayoutState != null)
        {
            mLayout.onRestoreInstanceState(mPendingSavedState.mLayoutState);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mPendingSavedState != null)
        {
            savedstate.copyFrom(mPendingSavedState);
            return savedstate;
        }
        if (mLayout != null)
        {
            savedstate.mLayoutState = mLayout.onSaveInstanceState();
            return savedstate;
        } else
        {
            savedstate.mLayoutState = null;
            return savedstate;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k || j != l)
        {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        int k;
        boolean flag1;
        boolean flag2;
        if (dispatchOnItemTouch(motionevent))
        {
            cancelTouch();
            return true;
        }
        flag1 = mLayout.canScrollHorizontally();
        flag2 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        k = MotionEventCompat.getActionMasked(motionevent);
        i = MotionEventCompat.getActionIndex(motionevent);
        k;
        JVM INSTR tableswitch 0 6: default 112
    //                   0 114
    //                   1 584
    //                   2 235
    //                   3 687
    //                   4 112
    //                   5 172
    //                   6 576;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L2:
        mScrollPointerId = MotionEventCompat.getPointerId(motionevent, 0);
        i = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i;
        mInitialTouchX = i;
        i = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        continue; /* Loop/switch isn't completed */
_L6:
        mScrollPointerId = MotionEventCompat.getPointerId(motionevent, i);
        int l = (int)(MotionEventCompat.getX(motionevent, i) + 0.5F);
        mLastTouchX = l;
        mInitialTouchX = l;
        i = (int)(MotionEventCompat.getY(motionevent, i) + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = MotionEventCompat.findPointerIndex(motionevent, mScrollPointerId);
        if (j < 0)
        {
            Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int k1 = (int)(MotionEventCompat.getX(motionevent, j) + 0.5F);
        int l1 = (int)(MotionEventCompat.getY(motionevent, j) + 0.5F);
        if (mScrollState != 1)
        {
            int k2 = k1 - mInitialTouchX;
            int i2 = l1 - mInitialTouchY;
            boolean flag = false;
            j = ((flag) ? 1 : 0);
            if (flag1)
            {
                j = ((flag) ? 1 : 0);
                if (Math.abs(k2) > mTouchSlop)
                {
                    int i1 = mInitialTouchX;
                    int j2 = mTouchSlop;
                    if (k2 < 0)
                    {
                        j = -1;
                    } else
                    {
                        j = 1;
                    }
                    mLastTouchX = j * j2 + i1;
                    j = 1;
                }
            }
            i1 = j;
            if (flag2)
            {
                i1 = j;
                if (Math.abs(i2) > mTouchSlop)
                {
                    i1 = mInitialTouchY;
                    j2 = mTouchSlop;
                    if (i2 < 0)
                    {
                        j = -1;
                    } else
                    {
                        j = 1;
                    }
                    mLastTouchY = j * j2 + i1;
                    i1 = 1;
                }
            }
            if (i1 != 0)
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        }
        if (mScrollState == 1)
        {
            j = mLastTouchX;
            i1 = mLastTouchY;
            int j1;
            if (flag1)
            {
                j = -(k1 - j);
            } else
            {
                j = 0;
            }
            if (flag2)
            {
                j1 = -(l1 - i1);
            } else
            {
                j1 = 0;
            }
            scrollByInternal(j, j1);
        }
        mLastTouchX = k1;
        mLastTouchY = l1;
        continue; /* Loop/switch isn't completed */
_L7:
        onPointerUp(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocity);
        float f;
        float f1;
        if (flag1)
        {
            f = -VelocityTrackerCompat.getXVelocity(mVelocityTracker, mScrollPointerId);
        } else
        {
            f = 0.0F;
        }
        if (flag2)
        {
            f1 = -VelocityTrackerCompat.getYVelocity(mVelocityTracker, mScrollPointerId);
        } else
        {
            f1 = 0.0F;
        }
        if (f == 0.0F && f1 == 0.0F || !fling((int)f, (int)f1))
        {
            setScrollState(0);
        }
        mVelocityTracker.clear();
        releaseGlows();
        continue; /* Loop/switch isn't completed */
_L5:
        cancelTouch();
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        ViewHolder viewholder = getChildViewHolderInt(view);
        if (viewholder != null)
        {
            if (viewholder.isTmpDetached())
            {
                viewholder.clearTmpDetachFlag();
            } else
            if (!viewholder.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Called removeDetachedView with a view which is not flagged as tmp detached.").append(viewholder).toString());
            }
        }
        dispatchChildDetached(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        boolean flag = false;
        if (!mLayout.onRequestChildFocus(this, mState, view, view1) && view1 != null)
        {
            mTempRect.set(0, 0, view1.getWidth(), view1.getHeight());
            offsetDescendantRectToMyCoords(view1, mTempRect);
            offsetRectIntoDescendantCoords(view, mTempRect);
            Rect rect = mTempRect;
            if (!mFirstLayoutComplete)
            {
                flag = true;
            }
            requestChildRectangleOnScreen(view, rect, flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        return mLayout.requestChildRectangleOnScreen(this, view, rect, flag);
    }

    public void requestLayout()
    {
        if (!mEatRequestLayout)
        {
            super.requestLayout();
            return;
        } else
        {
            mLayoutRequestEaten = true;
            return;
        }
    }

    void resumeRequestLayout(boolean flag)
    {
        if (mEatRequestLayout)
        {
            if (flag && mLayoutRequestEaten && mLayout != null && mAdapter != null)
            {
                dispatchLayout();
            }
            mEatRequestLayout = false;
            mLayoutRequestEaten = false;
        }
    }

    void saveOldPositions()
    {
        int j = mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(i));
            if (!viewholder.shouldIgnore())
            {
                viewholder.saveOldPosition();
            }
        }

    }

    public void scrollBy(int i, int j)
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        }
        boolean flag = mLayout.canScrollHorizontally();
        boolean flag1 = mLayout.canScrollVertically();
        if (flag || flag1)
        {
            if (!flag)
            {
                i = 0;
            }
            if (!flag1)
            {
                j = 0;
            }
            scrollByInternal(i, j);
        }
    }

    void scrollByInternal(int i, int j)
    {
        int l = 0;
        boolean flag2 = false;
        int i1 = 0;
        boolean flag1 = false;
        int k = 0;
        boolean flag3 = false;
        int j1 = 0;
        boolean flag = false;
        consumePendingUpdateOperations();
        if (mAdapter != null)
        {
            eatRequestLayout();
            mRunningLayoutOrScroll = true;
            k = ((flag3) ? 1 : 0);
            l = ((flag2) ? 1 : 0);
            if (i != 0)
            {
                k = mLayout.scrollHorizontallyBy(i, mRecycler, mState);
                l = i - k;
            }
            i1 = ((flag1) ? 1 : 0);
            j1 = ((flag) ? 1 : 0);
            if (j != 0)
            {
                j1 = mLayout.scrollVerticallyBy(j, mRecycler, mState);
                i1 = j - j1;
            }
            if (supportsChangeAnimations())
            {
                int l1 = mChildHelper.getChildCount();
                int k1 = 0;
                while (k1 < l1) 
                {
                    View view = mChildHelper.getChildAt(k1);
                    Object obj = getChildViewHolder(view);
                    if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((ViewHolder) (obj)).mShadowingHolder;
                    int i2;
                    int j2;
                    if (obj != null)
                    {
                        obj = ((ViewHolder) (obj)).itemView;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i2 = view.getLeft();
                    j2 = view.getTop();
                    if (i2 != ((View) (obj)).getLeft() || j2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i2, j2, ((View) (obj)).getWidth() + i2, ((View) (obj)).getHeight() + j2);
                    }
                    k1++;
                }
            }
            mRunningLayoutOrScroll = false;
            resumeRequestLayout(false);
        }
        if (!mItemDecorations.isEmpty())
        {
            invalidate();
        }
        if (ViewCompat.getOverScrollMode(this) != 2)
        {
            considerReleasingGlowsOnScroll(i, j);
            pullGlows(l, i1);
        }
        if (k != 0 || j1 != 0)
        {
            onScrollChanged(0, 0, 0, 0);
            if (mScrollListener != null)
            {
                mScrollListener.onScrolled(this, k, j1);
            }
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
    }

    public void scrollTo(int i, int j)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        mAccessibilityDelegate = recyclerviewaccessibilitydelegate;
        ViewCompat.setAccessibilityDelegate(this, mAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter)
    {
        setAdapterInternal(adapter, false, true);
        requestLayout();
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != mClipToPadding)
        {
            invalidateGlows();
        }
        mClipToPadding = flag;
        super.setClipToPadding(flag);
        if (mFirstLayoutComplete)
        {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean flag)
    {
        mHasFixedSize = flag;
    }

    public void setItemAnimator(ItemAnimator itemanimator)
    {
        if (mItemAnimator != null)
        {
            mItemAnimator.endAnimations();
            mItemAnimator.setListener(null);
        }
        mItemAnimator = itemanimator;
        if (mItemAnimator != null)
        {
            mItemAnimator.setListener(mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i)
    {
        mRecycler.setViewCacheSize(i);
    }

    public void setLayoutManager(LayoutManager layoutmanager)
    {
        if (layoutmanager == mLayout)
        {
            return;
        }
        if (mLayout != null)
        {
            if (mIsAttached)
            {
                mLayout.onDetachedFromWindow(this, mRecycler);
            }
            mLayout.setRecyclerView(null);
        }
        mRecycler.clear();
        mChildHelper.removeAllViewsUnfiltered();
        mLayout = layoutmanager;
        if (layoutmanager != null)
        {
            if (layoutmanager.mRecyclerView != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("LayoutManager ").append(layoutmanager).append(" is already attached to a RecyclerView: ").append(layoutmanager.mRecyclerView).toString());
            }
            mLayout.setRecyclerView(this);
            if (mIsAttached)
            {
                mLayout.onAttachedToWindow(this);
            }
        }
        requestLayout();
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        mScrollListener = onscrolllistener;
    }

    public void setRecycledViewPool(RecycledViewPool recycledviewpool)
    {
        mRecycler.setRecycledViewPool(recycledviewpool);
    }

    public void setRecyclerListener(RecyclerListener recyclerlistener)
    {
        mRecyclerListener = recyclerlistener;
    }

    public void setScrollingTouchSlop(int i)
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        switch (i)
        {
        default:
            Log.w("RecyclerView", (new StringBuilder()).append("setScrollingTouchSlop(): bad argument constant ").append(i).append("; using default value").toString());
            // fall through

        case 0: // '\0'
            mTouchSlop = viewconfiguration.getScaledTouchSlop();
            return;

        case 1: // '\001'
            mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewconfiguration);
            break;
        }
    }

    public void setViewCacheExtension(ViewCacheExtension viewcacheextension)
    {
        mRecycler.setViewCacheExtension(viewcacheextension);
    }

    public void smoothScrollBy(int i, int j)
    {
        if (i != 0 || j != 0)
        {
            mViewFlinger.smoothScrollBy(i, j);
        }
    }

    public void stopScroll()
    {
        setScrollState(0);
        stopScrollersInternal();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FORCE_INVALIDATE_DISPLAY_LIST = flag;
    }







/*
    static boolean access$2302(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mRunningLayoutOrScroll = flag;
        return flag;
    }

*/















}
