// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import ca;
import df;
import dq;
import ds;
import eb;
import er;
import es;
import fb;
import fm;
import ft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator, RecyclerViewAccessibilityDelegate, ChildHelper, AdapterHelper

public class RecyclerView extends ViewGroup
{
    public static abstract class Adapter
    {

        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable = new AdapterDataObservable();

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

        public final boolean hasObservers()
        {
            return mObservable.hasObservers();
        }

        public final boolean hasStableIds()
        {
            return mHasStableIds;
        }

        public final void notifyDataSetChanged()
        {
            mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i)
        {
            mObservable.notifyItemRangeChanged(i, 1);
        }

        public final void notifyItemInserted(int i)
        {
            mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemMoved(int i, int j)
        {
            mObservable.notifyItemMoved(i, j);
        }

        public final void notifyItemRangeChanged(int i, int j)
        {
            mObservable.notifyItemRangeChanged(i, j);
        }

        public final void notifyItemRangeInserted(int i, int j)
        {
            mObservable.notifyItemRangeInserted(i, j);
        }

        public final void notifyItemRangeRemoved(int i, int j)
        {
            mObservable.notifyItemRangeRemoved(i, j);
        }

        public final void notifyItemRemoved(int i)
        {
            mObservable.notifyItemRangeRemoved(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerview)
        {
        }

        public abstract void onBindViewHolder(ViewHolder viewholder, int i);

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerview)
        {
        }

        public void onViewAttachedToWindow(ViewHolder viewholder)
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

        public void setHasStableIds(boolean flag)
        {
            if (hasObservers())
            {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else
            {
                mHasStableIds = flag;
                return;
            }
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.unregisterObserver(adapterdataobserver);
        }

        public Adapter()
        {
            mHasStableIds = false;
        }
    }

    static class AdapterDataObservable extends Observable
    {

        public boolean hasObservers()
        {
            return !mObservers.isEmpty();
        }

        public void notifyChanged()
        {
            for (int i = mObservers.size() - 1; i >= 0; i--)
            {
                ((AdapterDataObserver)mObservers.get(i)).onChanged();
            }

        }

        public void notifyItemMoved(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeMoved(i, j, 1);
            }

        }

        public void notifyItemRangeChanged(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeChanged(i, j);
            }

        }

        public void notifyItemRangeInserted(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeInserted(i, j);
            }

        }

        public void notifyItemRangeRemoved(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeRemoved(i, j);
            }

        }

        AdapterDataObservable()
        {
        }
    }

    public static abstract class AdapterDataObserver
    {

        public void onChanged()
        {
        }

        public void onItemRangeChanged(int i, int j)
        {
        }

        public void onItemRangeInserted(int i, int j)
        {
        }

        public void onItemRangeMoved(int i, int j, int k)
        {
        }

        public void onItemRangeRemoved(int i, int j)
        {
        }

        public AdapterDataObserver()
        {
        }
    }

    public static abstract class ItemAnimator
    {

        private long mAddDuration;
        private long mChangeDuration;
        private ArrayList mFinishedListeners;
        private ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;
        private boolean mSupportsChangeAnimations;

        public abstract boolean animateAdd(ViewHolder viewholder);

        public abstract boolean animateChange(ViewHolder viewholder, ViewHolder viewholder1, int i, int j, int k, int l);

        public abstract boolean animateMove(ViewHolder viewholder, int i, int j, int k, int l);

        public abstract boolean animateRemove(ViewHolder viewholder);

        public final void dispatchAddFinished(ViewHolder viewholder)
        {
            onAddFinished(viewholder);
            if (mListener != null)
            {
                mListener.onAddFinished(viewholder);
            }
        }

        public final void dispatchAddStarting(ViewHolder viewholder)
        {
            onAddStarting(viewholder);
        }

        public final void dispatchAnimationsFinished()
        {
            int j = mFinishedListeners.size();
            for (int i = 0; i < j; i++)
            {
                ((ItemAnimatorFinishedListener)mFinishedListeners.get(i)).onAnimationsFinished();
            }

            mFinishedListeners.clear();
        }

        public final void dispatchChangeFinished(ViewHolder viewholder, boolean flag)
        {
            onChangeFinished(viewholder, flag);
            if (mListener != null)
            {
                mListener.onChangeFinished(viewholder);
            }
        }

        public final void dispatchChangeStarting(ViewHolder viewholder, boolean flag)
        {
            onChangeStarting(viewholder, flag);
        }

        public final void dispatchMoveFinished(ViewHolder viewholder)
        {
            onMoveFinished(viewholder);
            if (mListener != null)
            {
                mListener.onMoveFinished(viewholder);
            }
        }

        public final void dispatchMoveStarting(ViewHolder viewholder)
        {
            onMoveStarting(viewholder);
        }

        public final void dispatchRemoveFinished(ViewHolder viewholder)
        {
            onRemoveFinished(viewholder);
            if (mListener != null)
            {
                mListener.onRemoveFinished(viewholder);
            }
        }

        public final void dispatchRemoveStarting(ViewHolder viewholder)
        {
            onRemoveStarting(viewholder);
        }

        public abstract void endAnimation(ViewHolder viewholder);

        public abstract void endAnimations();

        public long getAddDuration()
        {
            return mAddDuration;
        }

        public long getChangeDuration()
        {
            return mChangeDuration;
        }

        public long getMoveDuration()
        {
            return mMoveDuration;
        }

        public long getRemoveDuration()
        {
            return mRemoveDuration;
        }

        public boolean getSupportsChangeAnimations()
        {
            return mSupportsChangeAnimations;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(ItemAnimatorFinishedListener itemanimatorfinishedlistener)
        {
            boolean flag;
label0:
            {
                flag = isRunning();
                if (itemanimatorfinishedlistener != null)
                {
                    if (flag)
                    {
                        break label0;
                    }
                    itemanimatorfinishedlistener.onAnimationsFinished();
                }
                return flag;
            }
            mFinishedListeners.add(itemanimatorfinishedlistener);
            return flag;
        }

        public void onAddFinished(ViewHolder viewholder)
        {
        }

        public void onAddStarting(ViewHolder viewholder)
        {
        }

        public void onChangeFinished(ViewHolder viewholder, boolean flag)
        {
        }

        public void onChangeStarting(ViewHolder viewholder, boolean flag)
        {
        }

        public void onMoveFinished(ViewHolder viewholder)
        {
        }

        public void onMoveStarting(ViewHolder viewholder)
        {
        }

        public void onRemoveFinished(ViewHolder viewholder)
        {
        }

        public void onRemoveStarting(ViewHolder viewholder)
        {
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long l)
        {
            mAddDuration = l;
        }

        public void setChangeDuration(long l)
        {
            mChangeDuration = l;
        }

        void setListener(ItemAnimatorListener itemanimatorlistener)
        {
            mListener = itemanimatorlistener;
        }

        public void setMoveDuration(long l)
        {
            mMoveDuration = l;
        }

        public void setRemoveDuration(long l)
        {
            mRemoveDuration = l;
        }

        public void setSupportsChangeAnimations(boolean flag)
        {
            mSupportsChangeAnimations = flag;
        }

        public ItemAnimator()
        {
            mListener = null;
            mFinishedListeners = new ArrayList();
            mAddDuration = 120L;
            mRemoveDuration = 120L;
            mMoveDuration = 250L;
            mChangeDuration = 250L;
            mSupportsChangeAnimations = false;
        }
    }

    public static interface ItemAnimator.ItemAnimatorFinishedListener
    {

        public abstract void onAnimationsFinished();
    }

    static interface ItemAnimator.ItemAnimatorListener
    {

        public abstract void onAddFinished(ViewHolder viewholder);

        public abstract void onChangeFinished(ViewHolder viewholder);

        public abstract void onMoveFinished(ViewHolder viewholder);

        public abstract void onRemoveFinished(ViewHolder viewholder);
    }

    class ItemAnimatorRestoreListener
        implements ItemAnimator.ItemAnimatorListener
    {

        final RecyclerView this$0;

        public void onAddFinished(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (viewholder.isRecyclable())
            {
                removeAnimatingView(viewholder.itemView);
            }
        }

        public void onChangeFinished(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (viewholder.mShadowedHolder != null && viewholder.mShadowingHolder == null)
            {
                viewholder.mShadowedHolder = null;
                viewholder.setFlags(-65, viewholder.mFlags);
            }
            viewholder.mShadowingHolder = null;
            if (viewholder.isRecyclable())
            {
                removeAnimatingView(viewholder.itemView);
            }
        }

        public void onMoveFinished(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (viewholder.isRecyclable())
            {
                removeAnimatingView(viewholder.itemView);
            }
        }

        public void onRemoveFinished(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (!removeAnimatingView(viewholder.itemView) && viewholder.isTmpDetached())
            {
                removeDetachedView(viewholder.itemView, false);
            }
        }

        private ItemAnimatorRestoreListener()
        {
            this$0 = RecyclerView.this;
            super();
        }

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

    static class ItemHolderInfo
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
            int i1;
            i1 = 0x40000000;
            l = Math.max(0, i - j);
            if (!flag) goto _L2; else goto _L1
_L1:
            if (k >= 0)
            {
                i = k;
                j = i1;
            } else
            {
                j = 0;
                i = 0;
            }
_L4:
            return android.view.View.MeasureSpec.makeMeasureSpec(i, j);
_L2:
            j = i1;
            i = k;
            if (k < 0)
            {
                if (k == -1)
                {
                    i = l;
                    j = i1;
                } else
                if (k == -2)
                {
                    j = 0x80000000;
                    i = l;
                } else
                {
                    j = 0;
                    i = 0;
                }
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

        public void assertInLayoutOrScroll(String s)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.assertInLayoutOrScroll(s);
            }
        }

        public void assertNotInLayoutOrScroll(String s)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.assertNotInLayoutOrScroll(s);
            }
        }

        public void attachView(View view)
        {
            attachView(view, -1);
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

        public void calculateItemDecorationsForChild(View view, Rect rect)
        {
            if (mRecyclerView == null)
            {
                rect.set(0, 0, 0, 0);
                return;
            } else
            {
                rect.set(mRecyclerView.getItemDecorInsetsForChild(view));
                return;
            }
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

        public void detachAndScrapView(View view, Recycler recycler)
        {
            scrapOrRecycleView(recycler, mChildHelper.indexOfChild(view), view);
        }

        public void detachAndScrapViewAt(int i, Recycler recycler)
        {
            scrapOrRecycleView(recycler, i, getChildAt(i));
        }

        public void detachView(View view)
        {
            int i = mChildHelper.indexOfChild(view);
            if (i >= 0)
            {
                detachViewInternal(i, view);
            }
        }

        public void detachViewAt(int i)
        {
            detachViewInternal(i, getChildAt(i));
        }

        public void endAnimation(View view)
        {
            if (mRecyclerView.mItemAnimator != null)
            {
                mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
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

        public boolean getClipToPadding()
        {
            return mRecyclerView != null && mRecyclerView.mClipToPadding;
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
            int i = view.getMeasuredHeight();
            int j = rect.top;
            return rect.bottom + (i + j);
        }

        public int getDecoratedMeasuredWidth(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).mDecorInsets;
            int i = view.getMeasuredWidth();
            int j = rect.left;
            return rect.right + (i + j);
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
            View view;
            if (mRecyclerView != null)
            {
                if ((view = mRecyclerView.getFocusedChild()) != null && !mChildHelper.isHidden(view))
                {
                    return view;
                }
            }
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

        public int getItemCount()
        {
            Adapter adapter;
            if (mRecyclerView != null)
            {
                adapter = mRecyclerView.getAdapter();
            } else
            {
                adapter = null;
            }
            if (adapter != null)
            {
                return adapter.getItemCount();
            } else
            {
                return 0;
            }
        }

        public int getItemViewType(View view)
        {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection()
        {
            return ds.h(mRecyclerView);
        }

        public int getLeftDecorationWidth(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mDecorInsets.left;
        }

        public int getMinimumHeight()
        {
            return ds.r(mRecyclerView);
        }

        public int getMinimumWidth()
        {
            return ds.q(mRecyclerView);
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

        public int getPaddingEnd()
        {
            if (mRecyclerView != null)
            {
                return ds.n(mRecyclerView);
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

        public int getPaddingStart()
        {
            if (mRecyclerView != null)
            {
                return ds.m(mRecyclerView);
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

        public boolean hasFocus()
        {
            return mRecyclerView != null && mRecyclerView.hasFocus();
        }

        public void ignoreView(View view)
        {
            if (view.getParent() != mRecyclerView || mRecyclerView.indexOfChild(view) == -1)
            {
                throw new IllegalArgumentException("View should be fully attached to be ignored");
            } else
            {
                view = RecyclerView.getChildViewHolderInt(view);
                view.addFlags(128);
                mRecyclerView.mState.onViewIgnored(view);
                return;
            }
        }

        public boolean isFocused()
        {
            return mRecyclerView != null && mRecyclerView.isFocused();
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

        public void measureChild(View view, int i, int j)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
            int k = rect.left;
            int l = rect.right;
            int i1 = rect.top;
            int j1 = rect.bottom;
            view.measure(getChildMeasureSpec(getWidth(), k + l + i + (getPaddingLeft() + getPaddingRight()), layoutparams.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), j1 + i1 + j + (getPaddingTop() + getPaddingBottom()), layoutparams.height, canScrollVertically()));
        }

        public void measureChildWithMargins(View view, int i, int j)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
            int k = rect.left;
            int l = rect.right;
            int i1 = rect.top;
            int j1 = rect.bottom;
            view.measure(getChildMeasureSpec(getWidth(), k + l + i + (getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), j1 + i1 + j + (getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, canScrollVertically()));
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
            recycler = er.a(accessibilityevent);
            if (mRecyclerView != null && recycler != null)
            {
                boolean flag = flag1;
                if (!ds.b(mRecyclerView, 1))
                {
                    flag = flag1;
                    if (!ds.b(mRecyclerView, -1))
                    {
                        flag = flag1;
                        if (!ds.a(mRecyclerView, -1))
                        {
                            if (ds.a(mRecyclerView, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                recycler.a(flag);
                if (mRecyclerView.mAdapter != null)
                {
                    recycler.a(mRecyclerView.mAdapter.getItemCount());
                    return;
                }
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
        }

        public void onInitializeAccessibilityNodeInfo(Recycler recycler, State state, es es1)
        {
            es1.b(android/support/v7/widget/RecyclerView.getName());
            if (ds.b(mRecyclerView, -1) || ds.a(mRecyclerView, -1))
            {
                es1.a(8192);
                es1.i(true);
            }
            if (ds.b(mRecyclerView, 1) || ds.a(mRecyclerView, 1))
            {
                es1.a(4096);
                es1.i(true);
            }
            es1.b(es.i.a(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        void onInitializeAccessibilityNodeInfo(es es1)
        {
            onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, es1);
        }

        public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, es es1)
        {
            int i;
            int j;
            if (canScrollVertically())
            {
                i = getPosition(view);
            } else
            {
                i = 0;
            }
            if (canScrollHorizontally())
            {
                j = getPosition(view);
            } else
            {
                j = 0;
            }
            es1.c(es.j.a(i, 1, j, 1, false, false));
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, es es1)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder != null && !viewholder.isRemoved())
            {
                onInitializeAccessibilityNodeInfoForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, es1);
            }
        }

        public View onInterceptFocusSearch(View view, int i)
        {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerview, int i, int j)
        {
        }

        public void onItemsChanged(RecyclerView recyclerview)
        {
        }

        public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
        {
        }

        public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
        {
        }

        public void onItemsUpdated(RecyclerView recyclerview, int i, int j)
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
                    break;
                }
                break;
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
            i;
            JVM INSTR lookupswitch 2: default 36
        //                       4096: 129
        //                       8192: 62;
               goto _L3 _L4 _L5
_L3:
            int j;
            i = 0;
            j = 0;
_L8:
            if (j != 0 || i != 0)
            {
                mRecyclerView.scrollBy(i, j);
                return true;
            }
              goto _L1
_L5:
            int k;
            int l;
            int i1;
            if (ds.b(mRecyclerView, -1))
            {
                i = -(getHeight() - getPaddingTop() - getPaddingBottom());
            } else
            {
                i = 0;
            }
            j = i;
            if (!ds.a(mRecyclerView, -1)) goto _L7; else goto _L6
_L6:
            k = -(getWidth() - getPaddingLeft() - getPaddingRight());
            j = i;
            i = k;
              goto _L8
_L4:
            if (ds.b(mRecyclerView, 1))
            {
                i = getHeight() - getPaddingTop() - getPaddingBottom();
            } else
            {
                i = 0;
            }
            j = i;
            if (!ds.a(mRecyclerView, 1)) goto _L7; else goto _L9
_L9:
            k = getWidth();
            l = getPaddingLeft();
            i1 = getPaddingRight();
            j = i;
            i = k - l - i1;
              goto _L8
_L7:
            i = 0;
              goto _L8
        }

        public boolean performAccessibilityActionForItem(Recycler recycler, State state, View view, int i, Bundle bundle)
        {
            return false;
        }

        boolean performAccessibilityActionForItem(View view, int i, Bundle bundle)
        {
            return performAccessibilityActionForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, i, bundle);
        }

        public void removeAllViews()
        {
            for (int i = getChildCount() - 1; i >= 0; i--)
            {
                getChildAt(i);
                mChildHelper.removeViewAt(i);
            }

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

        public void removeDetachedView(View view)
        {
            mRecyclerView.removeDetachedView(view, false);
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
            int j = getPaddingLeft();
            int l = getPaddingTop();
            int k = getWidth();
            int l1 = getPaddingRight();
            int i = getHeight();
            int i1 = getPaddingBottom();
            int i2 = view.getLeft() + rect.left;
            int j1 = view.getTop() + rect.top;
            int j2 = rect.width();
            int k1 = rect.height();
            j = Math.min(0, i2 - j);
            l = Math.min(0, j1 - l);
            k = Math.max(0, (j2 + i2) - (k - l1));
            i1 = Math.max(0, (k1 + j1) - (i - i1));
            if (ds.h(recyclerview) == 1)
            {
                if (k != 0)
                {
                    i = k;
                } else
                {
                    i = j;
                }
            } else
            {
                i = j;
                if (j == 0)
                {
                    i = k;
                }
            }
            if (l != 0)
            {
                j = l;
            } else
            {
                j = i1;
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

        public void scrollToPosition(int i)
        {
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

        public void smoothScrollToPosition(RecyclerView recyclerview, State state, int i)
        {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(SmoothScroller smoothscroller)
        {
            if (mSmoothScroller != null && smoothscroller != mSmoothScroller && mSmoothScroller.isRunning())
            {
                mSmoothScroller.stop();
            }
            mSmoothScroller = smoothscroller;
            mSmoothScroller.start(mRecyclerView, this);
        }

        public void stopIgnoringView(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.stopIgnoring();
            view.resetInternal();
            view.addFlags(4);
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

        public boolean isViewInvalid()
        {
            return mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate()
        {
            return mViewHolder.needsUpdate();
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

        public OnScrollListener()
        {
        }
    }

    public static class RecycledViewPool
    {

        private static final int DEFAULT_MAX_SCRAP = 5;
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

        public void setMaxRecycledViews(int i, int j)
        {
            mMaxScrap.put(i, j);
            ArrayList arraylist = (ArrayList)mScrap.get(i);
            if (arraylist != null)
            {
                for (; arraylist.size() > j; arraylist.remove(arraylist.size() - 1)) { }
            }
        }

        int size()
        {
            int i = 0;
            int j;
            int k;
            for (j = 0; i < mScrap.size(); j = k)
            {
                ArrayList arraylist = (ArrayList)mScrap.valueAt(i);
                k = j;
                if (arraylist != null)
                {
                    k = j + arraylist.size();
                }
                i++;
            }

            return j;
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

        private static final int DEFAULT_CACHE_SIZE = 2;
        final ArrayList mAttachedScrap = new ArrayList();
        final ArrayList mCachedViews = new ArrayList();
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
                if (ds.e(view) == 0)
                {
                    ds.c(view, 1);
                }
                if (!ds.b(view))
                {
                    ds.a(view, mAccessibilityDelegate.getItemDelegate());
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

        public void bindViewToPosition(View view, int i)
        {
            boolean flag = true;
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder == null)
            {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            }
            int j = mAdapterHelper.findPositionOffset(i);
            if (j < 0 || j >= mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(j).append(").").append("state:").append(mState.getItemCount()).toString());
            }
            mAdapter.bindViewHolder(viewholder, j);
            attachAccessibilityDelegate(view);
            if (mState.isPreLayout())
            {
                viewholder.mPreLayoutPosition = i;
            }
            view = viewholder.itemView.getLayoutParams();
            if (view == null)
            {
                view = (LayoutParams)generateDefaultLayoutParams();
                viewholder.itemView.setLayoutParams(view);
            } else
            if (!checkLayoutParams(view))
            {
                view = (LayoutParams)generateLayoutParams(view);
                viewholder.itemView.setLayoutParams(view);
            } else
            {
                view = (LayoutParams)view;
            }
            view.mInsetsDirty = true;
            view.mViewHolder = viewholder;
            if (viewholder.itemView.getParent() != null)
            {
                flag = false;
            }
            view.mPendingInvalidate = flag;
        }

        public void clear()
        {
            mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        void clearOldPositions()
        {
            boolean flag = false;
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
                for (int k = ((flag) ? 1 : 0); k < i1; k++)
                {
                    ((ViewHolder)mChangedScrap.get(k)).clearOldPosition();
                }

            }
        }

        void clearScrap()
        {
            mAttachedScrap.clear();
        }

        public int convertPreLayoutPositionToPostLayout(int i)
        {
            if (i < 0 || i >= mState.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("invalid position ").append(i).append(". State ").append("item count is ").append(mState.getItemCount()).toString());
            }
            if (!mState.isPreLayout())
            {
                return i;
            } else
            {
                return mAdapterHelper.findPositionOffset(i);
            }
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
            boolean flag;
            int k;
label0:
            {
                flag = false;
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
                    for (i = ((flag) ? 1 : 0); i < k; i++)
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
            boolean flag1;
            int l;
            flag1 = false;
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
            j = ((flag1) ? 1 : 0);
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
            boolean flag1 = true;
            if (i < 0 || i >= mState.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).toString());
            }
            Object obj;
            Object obj1;
            Object obj2;
            int j;
            int k;
            int l;
            int i1;
            if (mState.isPreLayout())
            {
                obj1 = getChangedScrapViewForPosition(i);
                if (obj1 != null)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
            } else
            {
                obj1 = null;
                j = 0;
            }
            obj = obj1;
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            obj1 = getScrapViewForPosition(i, -1, flag);
            obj = obj1;
            if (obj1 == null) goto _L2; else goto _L3
_L3:
            if (validateViewHolderForOffsetPosition(((ViewHolder) (obj1)))) goto _L5; else goto _L4
_L4:
            if (flag) goto _L7; else goto _L6
_L6:
            ((ViewHolder) (obj1)).addFlags(4);
            if (!((ViewHolder) (obj1)).isScrap()) goto _L9; else goto _L8
_L8:
            removeDetachedView(((ViewHolder) (obj1)).itemView, false);
            ((ViewHolder) (obj1)).unScrap();
_L17:
            recycleViewHolderInternal(((ViewHolder) (obj1)));
_L7:
            obj = null;
_L2:
            obj2 = obj;
            l = j;
            if (obj != null) goto _L11; else goto _L10
_L10:
            i1 = mAdapterHelper.findPositionOffset(i);
            if (i1 < 0 || i1 >= mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(i1).append(").").append("state:").append(mState.getItemCount()).toString());
            }
            l = mAdapter.getItemViewType(i1);
            obj1 = obj;
            k = j;
            if (mAdapter.hasStableIds())
            {
                obj = getScrapViewForId(mAdapter.getItemId(i1), l, flag);
                obj1 = obj;
                k = j;
                if (obj != null)
                {
                    obj.mPosition = i1;
                    k = 1;
                    obj1 = obj;
                }
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = obj1;
                if (mViewCacheExtension != null)
                {
                    obj2 = mViewCacheExtension.getViewForPositionAndType(this, i, l);
                    obj = obj1;
                    if (obj2 != null)
                    {
                        obj1 = getChildViewHolder(((View) (obj2)));
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                        }
                        obj = obj1;
                        if (((ViewHolder) (obj1)).shouldIgnore())
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj = getRecycledViewPool().getRecycledView(mAdapter.getItemViewType(i1));
                obj1 = obj;
                if (obj != null)
                {
                    ((ViewHolder) (obj)).resetInternal();
                    obj1 = obj;
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
                    {
                        invalidateDisplayListInt(((ViewHolder) (obj)));
                        obj1 = obj;
                    }
                }
            }
            obj2 = obj1;
            l = k;
              goto _L12
_L9:
            if (((ViewHolder) (obj1)).wasReturnedFromScrap())
            {
                ((ViewHolder) (obj1)).clearReturnedFromScrapFlag();
            }
            continue; /* Loop/switch isn't completed */
_L5:
            j = 1;
            obj = obj1;
              goto _L2
_L12:
            if (obj1 != null) goto _L11; else goto _L13
_L13:
            obj1 = mAdapter.createViewHolder(RecyclerView.this, mAdapter.getItemViewType(i1));
            j = k;
_L15:
            if (mState.isPreLayout() && ((ViewHolder) (obj1)).isBound())
            {
                obj1.mPreLayoutPosition = i;
                i = 0;
            } else
            if (!((ViewHolder) (obj1)).isBound() || ((ViewHolder) (obj1)).needsUpdate() || ((ViewHolder) (obj1)).isInvalid())
            {
                k = mAdapterHelper.findPositionOffset(i);
                mAdapter.bindViewHolder(((ViewHolder) (obj1)), k);
                attachAccessibilityDelegate(((ViewHolder) (obj1)).itemView);
                if (mState.isPreLayout())
                {
                    obj1.mPreLayoutPosition = i;
                }
                i = 1;
            } else
            {
                i = 0;
            }
            obj = ((ViewHolder) (obj1)).itemView.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)generateDefaultLayoutParams();
                ((ViewHolder) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                ((ViewHolder) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.mViewHolder = ((ViewHolder) (obj1));
            if (j != 0 && i != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            obj.mPendingInvalidate = flag;
            return ((ViewHolder) (obj1)).itemView;
_L11:
            j = l;
            obj1 = obj2;
            if (true) goto _L15; else goto _L14
_L14:
            if (true) goto _L17; else goto _L16
_L16:
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

        void offsetPositionRecordsForInsert(int i, int j)
        {
            int l = mCachedViews.size();
            for (int k = 0; k < l; k++)
            {
                ViewHolder viewholder = (ViewHolder)mCachedViews.get(k);
                if (viewholder != null && viewholder.getPosition() >= i)
                {
                    viewholder.offsetPosition(j, true);
                }
            }

        }

        void offsetPositionRecordsForMove(int i, int j)
        {
            byte byte0;
            int k;
            int l;
            int i1;
            int j1;
            if (i < j)
            {
                byte0 = -1;
                k = j;
                l = i;
            } else
            {
                byte0 = 1;
                k = i;
                l = j;
            }
            j1 = mCachedViews.size();
            i1 = 0;
            while (i1 < j1) 
            {
                ViewHolder viewholder = (ViewHolder)mCachedViews.get(i1);
                if (viewholder != null && viewholder.mPosition >= l && viewholder.mPosition <= k)
                {
                    if (viewholder.mPosition == i)
                    {
                        viewholder.offsetPosition(j - i, false);
                    } else
                    {
                        viewholder.offsetPosition(byte0, false);
                    }
                }
                i1++;
            }
        }

        void offsetPositionRecordsForRemove(int i, int j, boolean flag)
        {
            int k = mCachedViews.size() - 1;
            while (k >= 0) 
            {
                ViewHolder viewholder = (ViewHolder)mCachedViews.get(k);
                if (viewholder != null)
                {
                    if (viewholder.getPosition() >= i + j)
                    {
                        viewholder.offsetPosition(-j, flag);
                    } else
                    if (viewholder.getPosition() >= i && !tryToRecycleCachedViewAt(k))
                    {
                        viewholder.addFlags(4);
                    }
                }
                k--;
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
            boolean flag;
            boolean flag1 = true;
            flag = false;
            if (viewholder.isScrap() || viewholder.itemView.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(viewholder.isScrap()).append(" isAttached:");
                if (viewholder.itemView.getParent() == null)
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
            int i = ((flag) ? 1 : 0);
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

        void recycleViewInternal(View view)
        {
            recycleViewHolderInternal(RecyclerView.getChildViewHolderInt(view));
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

        void viewRangeUpdate(int i, int j)
        {
            int l = mCachedViews.size();
            int k = 0;
            while (k < l) 
            {
                ViewHolder viewholder = (ViewHolder)mCachedViews.get(k);
                if (viewholder != null)
                {
                    int i1 = viewholder.getPosition();
                    if (i1 >= i && i1 < i + j)
                    {
                        viewholder.addFlags(2);
                    }
                }
                k++;
            }
        }


        public Recycler()
        {
            this$0 = RecyclerView.this;
            super();
            mChangedScrap = null;
            mUnmodifiableAttachedScrap = Collections.unmodifiableList(mAttachedScrap);
            mViewCacheMax = 2;
        }
    }

    public static interface RecyclerListener
    {

        public abstract void onViewRecycled(ViewHolder viewholder);
    }

    class RecyclerViewDataObserver extends AdapterDataObserver
    {

        final RecyclerView this$0;

        public void onChanged()
        {
            assertNotInLayoutOrScroll(null);
            if (mAdapter.hasStableIds())
            {
                mState.mStructureChanged = true;
                mDataSetHasChangedAfterLayout = true;
            } else
            {
                mState.mStructureChanged = true;
                mDataSetHasChangedAfterLayout = true;
            }
            if (!mAdapterHelper.hasPendingUpdates())
            {
                requestLayout();
            }
        }

        public void onItemRangeChanged(int i, int j)
        {
            assertNotInLayoutOrScroll(null);
            if (mAdapterHelper.onItemRangeChanged(i, j))
            {
                triggerUpdateProcessor();
            }
        }

        public void onItemRangeInserted(int i, int j)
        {
            assertNotInLayoutOrScroll(null);
            if (mAdapterHelper.onItemRangeInserted(i, j))
            {
                triggerUpdateProcessor();
            }
        }

        public void onItemRangeMoved(int i, int j, int k)
        {
            assertNotInLayoutOrScroll(null);
            if (mAdapterHelper.onItemRangeMoved(i, j, k))
            {
                triggerUpdateProcessor();
            }
        }

        public void onItemRangeRemoved(int i, int j)
        {
            assertNotInLayoutOrScroll(null);
            if (mAdapterHelper.onItemRangeRemoved(i, j))
            {
                triggerUpdateProcessor();
            }
        }

        void triggerUpdateProcessor()
        {
            if (mPostUpdatesOnAnimation && mHasFixedSize && mIsAttached)
            {
                ds.a(RecyclerView.this, mUpdateChildViewsRunnable);
                return;
            } else
            {
                mAdapterUpdateDuringMeasure = true;
                requestLayout();
                return;
            }
        }

        private RecyclerViewDataObserver()
        {
            this$0 = RecyclerView.this;
            super();
        }

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
        private final Action mRecyclingAction = new Action(0, 0);
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

        public View findViewByPosition(int i)
        {
            return mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount()
        {
            return mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view)
        {
            return mRecyclerView.getChildPosition(view);
        }

        public LayoutManager getLayoutManager()
        {
            return mLayoutManager;
        }

        public int getTargetPosition()
        {
            return mTargetPosition;
        }

        public void instantScrollToPosition(int i)
        {
            mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun()
        {
            return mPendingInitialRun;
        }

        public boolean isRunning()
        {
            return mRunning;
        }

        protected void normalize(PointF pointf)
        {
            double d = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
            pointf.x = (float)((double)pointf.x / d);
            pointf.y = (float)((double)pointf.y / d);
        }

        protected void onChildAttachedToWindow(View view)
        {
            if (getChildPosition(view) == getTargetPosition())
            {
                mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i, int j, State state, Action action);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i)
        {
            mTargetPosition = i;
        }

        void start(RecyclerView recyclerview, LayoutManager layoutmanager)
        {
            mRecyclerView = recyclerview;
            mLayoutManager = layoutmanager;
            if (mTargetPosition == -1)
            {
                throw new IllegalArgumentException("Invalid target position");
            } else
            {
                mRecyclerView.mState.mTargetPosition = mTargetPosition;
                mRunning = true;
                mPendingInitialRun = true;
                mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                mRecyclerView.mViewFlinger.postOnAnimation();
                return;
            }
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


        public SmoothScroller()
        {
            mTargetPosition = -1;
        }
    }

    public static class SmoothScroller.Action
    {

        public static final int UNDEFINED_DURATION = 0x80000000;
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

        public int getDuration()
        {
            return mDuration;
        }

        public int getDx()
        {
            return mDx;
        }

        public int getDy()
        {
            return mDy;
        }

        public Interpolator getInterpolator()
        {
            return mInterpolator;
        }

        public void setDuration(int i)
        {
            changed = true;
            mDuration = i;
        }

        public void setDx(int i)
        {
            changed = true;
            mDx = i;
        }

        public void setDy(int i)
        {
            changed = true;
            mDy = i;
        }

        public void setInterpolator(Interpolator interpolator)
        {
            changed = true;
            mInterpolator = interpolator;
        }

        public void update(int i, int j, int k, Interpolator interpolator)
        {
            mDx = i;
            mDy = j;
            mDuration = k;
            mInterpolator = interpolator;
            changed = true;
        }


        public SmoothScroller.Action(int i, int j)
        {
            this(i, j, 0x80000000, null);
        }

        public SmoothScroller.Action(int i, int j, int k)
        {
            this(i, j, k, null);
        }

        public SmoothScroller.Action(int i, int j, int k, Interpolator interpolator)
        {
            changed = false;
            consecutiveUpdates = 0;
            mDx = i;
            mDy = j;
            mDuration = k;
            mInterpolator = interpolator;
        }
    }

    public static class State
    {

        private SparseArray mData;
        private int mDeletedInvisibleItemCountSincePreviousLayout;
        private boolean mInPreLayout;
        int mItemCount;
        ca mOldChangedHolders;
        ca mPostLayoutHolderMap;
        ca mPreLayoutHolderMap;
        private int mPreviousLayoutItemCount;
        private boolean mRunPredictiveAnimations;
        private boolean mRunSimpleAnimations;
        private boolean mStructureChanged;
        private int mTargetPosition;

        private void removeFrom(ca ca1, ViewHolder viewholder)
        {
            int i = ca1.size() - 1;
            do
            {
label0:
                {
                    if (i >= 0)
                    {
                        if (viewholder != ca1.c(i))
                        {
                            break label0;
                        }
                        ca1.d(i);
                    }
                    return;
                }
                i--;
            } while (true);
        }

        public boolean didStructureChange()
        {
            return mStructureChanged;
        }

        public Object get(int i)
        {
            if (mData == null)
            {
                return null;
            } else
            {
                return mData.get(i);
            }
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

        public void onViewIgnored(ViewHolder viewholder)
        {
            onViewRecycled(viewholder);
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

        public void put(int i, Object obj)
        {
            if (mData == null)
            {
                mData = new SparseArray();
            }
            mData.put(i, obj);
        }

        public void remove(int i)
        {
            if (mData == null)
            {
                return;
            } else
            {
                mData.remove(i);
                return;
            }
        }

        State reset()
        {
            mTargetPosition = -1;
            if (mData != null)
            {
                mData.clear();
            }
            mItemCount = 0;
            mStructureChanged = false;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("State{mTargetPosition=").append(mTargetPosition).append(", mPreLayoutHolderMap=").append(mPreLayoutHolderMap).append(", mPostLayoutHolderMap=").append(mPostLayoutHolderMap).append(", mData=").append(mData).append(", mItemCount=").append(mItemCount).append(", mPreviousLayoutItemCount=").append(mPreviousLayoutItemCount).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(mDeletedInvisibleItemCountSincePreviousLayout).append(", mStructureChanged=").append(mStructureChanged).append(", mInPreLayout=").append(mInPreLayout).append(", mRunSimpleAnimations=").append(mRunSimpleAnimations).append(", mRunPredictiveAnimations=").append(mRunPredictiveAnimations).append('}').toString();
        }

        public boolean willRunPredictiveAnimations()
        {
            return mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations()
        {
            return mRunSimpleAnimations;
        }


/*
        static int access$1002(State state, int i)
        {
            state.mDeletedInvisibleItemCountSincePreviousLayout = i;
            return i;
        }

*/


/*
        static int access$1012(State state, int i)
        {
            i = state.mDeletedInvisibleItemCountSincePreviousLayout + i;
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

        public State()
        {
            mTargetPosition = -1;
            mPreLayoutHolderMap = new ca();
            mPostLayoutHolderMap = new ca();
            mOldChangedHolders = new ca();
            mItemCount = 0;
            mPreviousLayoutItemCount = 0;
            mDeletedInvisibleItemCountSincePreviousLayout = 0;
            mStructureChanged = false;
            mInPreLayout = false;
            mRunSimpleAnimations = false;
            mRunPredictiveAnimations = false;
        }
    }

    public static abstract class ViewCacheExtension
    {

        public abstract View getViewForPositionAndType(Recycler recycler, int i, int j);

        public ViewCacheExtension()
        {
        }
    }

    class ViewFlinger
        implements Runnable
    {

        private boolean mEatRunOnAnimationRequest;
        private Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        private boolean mReSchedulePostAnimationCallback;
        private ft mScroller;
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
            f2 = Math.min(1.0F, ((float)j * 1.0F) / (float)i);
            f = l;
            f1 = l;
            f2 = distanceInfluenceForSnapDuration(f2);
            if (k > 0)
            {
                i = Math.round(1000F * Math.abs((f2 * f1 + f) / (float)k)) * 4;
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
            mScroller.a(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
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
                ds.a(RecyclerView.this, this);
                return;
            }
        }

        public void run()
        {
            ft ft1;
            SmoothScroller smoothscroller;
            disableRunOnAnimationRequests();
            consumePendingUpdateOperations();
            ft1 = mScroller;
            smoothscroller = mLayout.mSmoothScroller;
            if (!ft1.g()) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            int k;
            int k2 = ft1.b();
            int l2 = ft1.c();
            int i3 = k2 - mLastFlingX;
            int j3 = l2 - mLastFlingY;
            int i1 = 0;
            boolean flag1 = false;
            int l = 0;
            int j1 = 0;
            mLastFlingX = k2;
            mLastFlingY = l2;
            j = 0;
            i = 0;
            k = 0;
            boolean flag = false;
            if (mAdapter != null)
            {
                eatRequestLayout();
                mRunningLayoutOrScroll = true;
                j = ((flag1) ? 1 : 0);
                if (i3 != 0)
                {
                    j = mLayout.scrollHorizontallyBy(i3, mRecycler, mState);
                    i = i3 - j;
                }
                k = ((flag) ? 1 : 0);
                l = j1;
                if (j3 != 0)
                {
                    l = mLayout.scrollVerticallyBy(j3, mRecycler, mState);
                    k = j3 - l;
                }
                if (supportsChangeAnimations())
                {
                    j1 = mChildHelper.getChildCount();
                    i1 = 0;
                    while (i1 < j1) 
                    {
                        View view = mChildHelper.getChildAt(i1);
                        Object obj = getChildViewHolder(view);
                        if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                        {
                            continue;
                        }
                        int k1;
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
                        k1 = view.getLeft();
                        i2 = view.getTop();
                        if (k1 != ((View) (obj)).getLeft() || i2 != ((View) (obj)).getTop())
                        {
                            ((View) (obj)).layout(k1, i2, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + i2);
                        }
                        i1++;
                    }
                }
                if (smoothscroller != null && !smoothscroller.isPendingInitialRun() && smoothscroller.isRunning())
                {
                    i1 = mState.getItemCount();
                    if (i1 == 0)
                    {
                        smoothscroller.stop();
                    } else
                    if (smoothscroller.getTargetPosition() >= i1)
                    {
                        smoothscroller.setTargetPosition(i1 - 1);
                        smoothscroller.onAnimation(i3 - i, j3 - k);
                    } else
                    {
                        smoothscroller.onAnimation(i3 - i, j3 - k);
                    }
                }
                mRunningLayoutOrScroll = false;
                resumeRequestLayout(false);
                i1 = j;
                j = i;
            }
            if (i3 == i1 && j3 == l)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (!mItemDecorations.isEmpty())
            {
                invalidate();
            }
            if (ds.a(RecyclerView.this) != 2)
            {
                considerReleasingGlowsOnScroll(i3, j3);
            }
            if (j == 0 && k == 0) goto _L4; else goto _L3
_L3:
            int l1 = (int)ft1.f();
            int j2;
            if (j != k2)
            {
                if (j < 0)
                {
                    i = -l1;
                } else
                if (j > 0)
                {
                    i = l1;
                } else
                {
                    i = 0;
                }
                j2 = i;
            } else
            {
                j2 = 0;
            }
            if (k == l2) goto _L6; else goto _L5
_L5:
            if (k >= 0) goto _L8; else goto _L7
_L7:
            i = -l1;
_L10:
            if (ds.a(RecyclerView.this) != 2)
            {
                absorbGlows(j2, i);
            }
            if ((j2 != 0 || j == k2 || ft1.d() == 0) && (i != 0 || k == l2 || ft1.e() == 0))
            {
                ft1.h();
            }
_L4:
            if (i1 != 0 || l != 0)
            {
                onScrollChanged(0, 0, 0, 0);
                if (mScrollListener != null)
                {
                    mScrollListener.onScrolled(RecyclerView.this, i1, l);
                }
            }
            if (!awakenScrollBars())
            {
                invalidate();
            }
            if (ft1.a() || !j1)
            {
                setScrollState(0);
            } else
            {
                postOnAnimation();
            }
_L2:
            if (smoothscroller != null && smoothscroller.isPendingInitialRun())
            {
                smoothscroller.onAnimation(0, 0);
            }
            enableRunOnAnimationRequests();
            return;
_L8:
            i = l1;
            if (k <= 0)
            {
                i = 0;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            i = 0;
            if (true) goto _L10; else goto _L9
_L9:
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
                mScroller = ft.a(getContext(), interpolator);
            }
            setScrollState(2);
            mLastFlingY = 0;
            mLastFlingX = 0;
            mScroller.a(0, 0, i, j, k);
            postOnAnimation();
        }

        public void stop()
        {
            removeCallbacks(this);
            mScroller.h();
        }

        public ViewFlinger()
        {
            this$0 = RecyclerView.this;
            super();
            mInterpolator = RecyclerView.sQuinticInterpolator;
            mEatRunOnAnimationRequest = false;
            mReSchedulePostAnimationCallback = false;
            mScroller = ft.a(getContext(), RecyclerView.sQuinticInterpolator);
        }
    }

    public static abstract class ViewHolder
    {

        static final int FLAG_BOUND = 1;
        static final int FLAG_CHANGED = 64;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
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

        void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
        {
            addFlags(8);
            offsetPosition(j, flag);
            mPosition = i;
        }

        public final long getItemId()
        {
            return mItemId;
        }

        public final int getItemViewType()
        {
            return mItemViewType;
        }

        public final int getOldPosition()
        {
            return mOldPosition;
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
            return (mFlags & 0x10) == 0 && !ds.c(itemView);
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

        void offsetPosition(int i, boolean flag)
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
            if (mPreLayoutPosition == -1)
            {
                mPreLayoutPosition = mPosition;
            }
            if (flag)
            {
                mPreLayoutPosition = mPreLayoutPosition + i;
            }
            mPosition = mPosition + i;
            if (itemView.getLayoutParams() != null)
            {
                ((LayoutParams)itemView.getLayoutParams()).mInsetsDirty = true;
            }
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

        void stopIgnoring()
        {
            mFlags = mFlags & 0xffffff7f;
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


        public ViewHolder(View view)
        {
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mItemViewType = -1;
            mPreLayoutPosition = -1;
            mShadowedHolder = null;
            mShadowingHolder = null;
            mIsRecyclableCount = 0;
            mScrapContainer = null;
            if (view == null)
            {
                throw new IllegalArgumentException("itemView may not be null");
            } else
            {
                itemView = view;
                return;
            }
        }
    }


    private static final boolean DEBUG = false;
    private static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final int VERTICAL = 1;
    private static final Interpolator sQuinticInterpolator = new Interpolator() {

        public float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

    };
    private RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private OnItemTouchListener mActiveOnItemTouchListener;
    private Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    private boolean mAdapterUpdateDuringMeasure;
    private fm mBottomGlow;
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
    private Runnable mItemAnimatorRunner = new Runnable() {

        final RecyclerView this$0;

        public void run()
        {
            if (mItemAnimator != null)
            {
                mItemAnimator.runPendingAnimations();
            }
            mPostedAnimatorRunner = false;
        }

            
            {
                this$0 = RecyclerView.this;
                super();
            }
    };
    private final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    private LayoutManager mLayout;
    private boolean mLayoutRequestEaten;
    private fm mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final RecyclerViewDataObserver mObserver;
    private final ArrayList mOnItemTouchListeners;
    private SavedState mPendingSavedState;
    private final boolean mPostUpdatesOnAnimation;
    private boolean mPostedAnimatorRunner;
    final Recycler mRecycler;
    private RecyclerListener mRecyclerListener;
    private fm mRightGlow;
    private boolean mRunningLayoutOrScroll;
    private OnScrollListener mScrollListener;
    private int mScrollPointerId;
    private int mScrollState;
    final State mState;
    private final Rect mTempRect;
    private fm mTopGlow;
    private int mTouchSlop;
    private final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    private final ViewFlinger mViewFlinger;

    public RecyclerView(Context context)
    {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeset, int i)
    {
        boolean flag1 = false;
        super(context, attributeset, i);
        mObserver = new RecyclerViewDataObserver();
        mRecycler = new Recycler();
        mDisappearingViewsInLayoutPass = new ArrayList();
        mUpdateChildViewsRunnable = new Runnable() {

            final RecyclerView this$0;

            public void run()
            {
                if (mFirstLayoutComplete)
                {
                    if (mDataSetHasChangedAfterLayout)
                    {
                        dispatchLayout();
                        return;
                    }
                    if (mAdapterHelper.hasPendingUpdates())
                    {
                        eatRequestLayout();
                        mAdapterHelper.preProcess();
                        if (!mLayoutRequestEaten)
                        {
                            rebindUpdatedViewHolders();
                        }
                        resumeRequestLayout(true);
                        return;
                    }
                }
            }

            
            {
                this$0 = RecyclerView.this;
                super();
            }
        };
        mTempRect = new Rect();
        mItemDecorations = new ArrayList();
        mOnItemTouchListeners = new ArrayList();
        mDataSetHasChangedAfterLayout = false;
        mRunningLayoutOrScroll = false;
        mItemAnimator = new DefaultItemAnimator();
        mScrollState = 0;
        mScrollPointerId = -1;
        mViewFlinger = new ViewFlinger();
        mState = new State();
        mItemsAddedOrRemoved = false;
        mItemsChanged = false;
        mItemAnimatorListener = new ItemAnimatorRestoreListener();
        mPostedAnimatorRunner = false;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPostUpdatesOnAnimation = flag;
        context = ViewConfiguration.get(context);
        mTouchSlop = context.getScaledTouchSlop();
        mMinFlingVelocity = context.getScaledMinimumFlingVelocity();
        mMaxFlingVelocity = context.getScaledMaximumFlingVelocity();
        flag = flag1;
        if (ds.a(this) == 2)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        mItemAnimator.setListener(mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        if (ds.e(this) == 0)
        {
            ds.c(this, 1);
        }
        mAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
    }

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
            j = l;
            i = k;
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
            if (!mLeftGlow.a())
            {
                flag = flag1;
                if (i > 0)
                {
                    flag = mLeftGlow.c();
                }
            }
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag;
            if (!mRightGlow.a())
            {
                flag1 = flag;
                if (i < 0)
                {
                    flag1 = flag | mRightGlow.c();
                }
            }
        }
        flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1;
            if (!mTopGlow.a())
            {
                flag = flag1;
                if (j > 0)
                {
                    flag = flag1 | mTopGlow.c();
                }
            }
        }
        flag1 = flag;
        if (mBottomGlow != null)
        {
            flag1 = flag;
            if (!mBottomGlow.a())
            {
                flag1 = flag;
                if (j < 0)
                {
                    flag1 = flag | mBottomGlow.c();
                }
            }
        }
        if (flag1)
        {
            ds.d(this);
        }
    }

    private void consumePendingUpdateOperations()
    {
        mUpdateChildViewsRunnable.run();
    }

    private void dispatchChildAttached(View view)
    {
        if (mAdapter != null)
        {
            mAdapter.onViewAttachedToWindow(getChildViewHolderInt(view));
        }
        onChildAttachedToWindow(view);
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
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        OnItemTouchListener onitemtouchlistener = (OnItemTouchListener)mOnItemTouchListeners.get(i);
        if (onitemtouchlistener.onInterceptTouchEvent(this, motionevent))
        {
            mActiveOnItemTouchListener = onitemtouchlistener;
            return true;
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        mActiveOnItemTouchListener.onTouchEvent(this, motionevent);
        if (i == 3 || i == 1)
        {
            mActiveOnItemTouchListener = null;
        }
        return true;
        if (true) goto _L7; else goto _L6
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

    private void initChildrenHelper()
    {
        mChildHelper = new ChildHelper(new ChildHelper.Callback() {

            final RecyclerView this$0;

            public void addView(View view, int i)
            {
                RecyclerView.this.addView(view, i);
                dispatchChildAttached(view);
            }

            public void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
            {
                ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
                if (viewholder != null)
                {
                    if (!viewholder.isTmpDetached() && !viewholder.shouldIgnore())
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Called attach on a child which is not detached: ").append(viewholder).toString());
                    }
                    viewholder.clearTmpDetachFlag();
                }
                RecyclerView.this.attachViewToParent(view, i, layoutparams);
            }

            public void detachViewFromParent(int i)
            {
                Object obj = getChildAt(i);
                if (obj != null)
                {
                    obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
                    if (obj != null)
                    {
                        if (((ViewHolder) (obj)).isTmpDetached() && !((ViewHolder) (obj)).shouldIgnore())
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("called detach on an already detached child ").append(obj).toString());
                        }
                        ((ViewHolder) (obj)).addFlags(256);
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            public View getChildAt(int i)
            {
                return RecyclerView.this.getChildAt(i);
            }

            public int getChildCount()
            {
                return RecyclerView.this.getChildCount();
            }

            public ViewHolder getChildViewHolder(View view)
            {
                return RecyclerView.getChildViewHolderInt(view);
            }

            public int indexOfChild(View view)
            {
                return RecyclerView.this.indexOfChild(view);
            }

            public void removeAllViews()
            {
                int j = getChildCount();
                for (int i = 0; i < j; i++)
                {
                    dispatchChildDetached(getChildAt(i));
                }

                RecyclerView.this.removeAllViews();
            }

            public void removeViewAt(int i)
            {
                View view = RecyclerView.this.getChildAt(i);
                if (view != null)
                {
                    dispatchChildDetached(view);
                }
                RecyclerView.this.removeViewAt(i);
            }

            
            {
                this$0 = RecyclerView.this;
                super();
            }
        });
    }

    private void onPointerUp(MotionEvent motionevent)
    {
        int i = df.b(motionevent);
        if (df.b(motionevent, i) == mScrollPointerId)
        {
            int j;
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mScrollPointerId = df.b(motionevent, i);
            j = (int)(df.c(motionevent, i) + 0.5F);
            mLastTouchX = j;
            mInitialTouchX = j;
            i = (int)(df.d(motionevent, i) + 0.5F);
            mLastTouchY = i;
            mInitialTouchY = i;
        }
    }

    private void postAnimationRunner()
    {
        if (!mPostedAnimatorRunner && mIsAttached)
        {
            ds.a(this, mItemAnimatorRunner);
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

    private void processDisappearingList(ca ca1)
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
            if (ca1.remove(view) != null)
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
            mLeftGlow.a((float)(-i) / (float)getWidth());
        } else
        if (i > 0)
        {
            ensureRightGlow();
            mRightGlow.a((float)i / (float)getWidth());
        }
        if (j < 0)
        {
            ensureTopGlow();
            mTopGlow.a((float)(-j) / (float)getHeight());
        } else
        if (j > 0)
        {
            ensureBottomGlow();
            mBottomGlow.a((float)j / (float)getHeight());
        }
        if (i != 0 || j != 0)
        {
            ds.d(this);
        }
    }

    private void releaseGlows()
    {
        boolean flag1 = false;
        if (mLeftGlow != null)
        {
            flag1 = mLeftGlow.c();
        }
        boolean flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1 | mTopGlow.c();
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag | mRightGlow.c();
        }
        flag = flag1;
        if (mBottomGlow != null)
        {
            flag = flag1 | mBottomGlow.c();
        }
        if (flag)
        {
            ds.d(this);
        }
    }

    private boolean removeAnimatingView(View view)
    {
        eatRequestLayout();
        boolean flag = mChildHelper.removeViewIfHidden(view);
        if (flag)
        {
            view = getChildViewHolderInt(view);
            mRecycler.unscrapView(view);
            mRecycler.recycleViewHolderInternal(view);
        }
        resumeRequestLayout(false);
        return flag;
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
            mLeftGlow.a(-i);
        } else
        if (i > 0)
        {
            ensureRightGlow();
            mRightGlow.a(i);
        }
        if (j < 0)
        {
            ensureTopGlow();
            mTopGlow.a(-j);
        } else
        if (j > 0)
        {
            ensureBottomGlow();
            mBottomGlow.a(j);
        }
        if (i != 0 || j != 0)
        {
            ds.d(this);
        }
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        if (!mLayout.onAddFocusables(this, arraylist, i, j))
        {
            super.addFocusables(arraylist, i, j);
        }
    }

    public void addItemDecoration(ItemDecoration itemdecoration)
    {
        addItemDecoration(itemdecoration, -1);
    }

    public void addItemDecoration(ItemDecoration itemdecoration, int i)
    {
        if (mLayout != null)
        {
            mLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (mItemDecorations.isEmpty())
        {
            setWillNotDraw(false);
        }
        if (i < 0)
        {
            mItemDecorations.add(itemdecoration);
        } else
        {
            mItemDecorations.add(i, itemdecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnItemTouchListener(OnItemTouchListener onitemtouchlistener)
    {
        mOnItemTouchListeners.add(onitemtouchlistener);
    }

    void assertInLayoutOrScroll(String s)
    {
        if (!mRunningLayoutOrScroll)
        {
            if (s == null)
            {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s);
            }
        } else
        {
            return;
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
        if (mAdapter == null)
        {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        mDisappearingViewsInLayoutPass.clear();
        eatRequestLayout();
        mRunningLayoutOrScroll = true;
        processAdapterUpdatesAndSetAnimationFlags();
        State state1 = mState;
        Object obj;
        if (mState.mRunSimpleAnimations && mItemsChanged && supportsChangeAnimations())
        {
            obj = new ca();
        } else
        {
            obj = null;
        }
        state1.mOldChangedHolders = ((ca) (obj));
        mItemsChanged = false;
        mItemsAddedOrRemoved = false;
        mState.mInPreLayout = mState.mRunPredictiveAnimations;
        mState.mItemCount = mAdapter.getItemCount();
        if (mState.mRunSimpleAnimations)
        {
            mState.mPreLayoutHolderMap.clear();
            mState.mPostLayoutHolderMap.clear();
            int j1 = mChildHelper.getChildCount();
            int i = 0;
            while (i < j1) 
            {
                obj = getChildViewHolderInt(mChildHelper.getChildAt(i));
                if (!((ViewHolder) (obj)).shouldIgnore() && (!((ViewHolder) (obj)).isInvalid() || mAdapter.hasStableIds()))
                {
                    View view1 = ((ViewHolder) (obj)).itemView;
                    mState.mPreLayoutHolderMap.put(obj, new ItemHolderInfo(((ViewHolder) (obj)), view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom()));
                }
                i++;
            }
        }
        if (!mState.mRunPredictiveAnimations) goto _L2; else goto _L1
_L1:
        Object obj2;
        int k;
        saveOldPositions();
        if (mState.mOldChangedHolders != null)
        {
            int k1 = mChildHelper.getChildCount();
            for (int j = 0; j < k1; j++)
            {
                ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getChildAt(j));
                if (viewholder.isChanged() && !viewholder.isRemoved() && !viewholder.shouldIgnore())
                {
                    long l2 = getChangedHolderKey(viewholder);
                    mState.mOldChangedHolders.put(Long.valueOf(l2), viewholder);
                    mState.mPreLayoutHolderMap.remove(viewholder);
                }
            }

        }
        boolean flag = mState.mStructureChanged;
        mState.mStructureChanged = false;
        mLayout.onLayoutChildren(mRecycler, mState);
        mState.mStructureChanged = flag;
        obj2 = new ca();
        k = 0;
_L7:
        if (k >= mChildHelper.getChildCount()) goto _L4; else goto _L3
_L3:
        View view = mChildHelper.getChildAt(k);
        if (!getChildViewHolderInt(view).shouldIgnore()) goto _L6; else goto _L5
_L5:
        k++;
          goto _L7
_L6:
        int l1 = 0;
_L12:
        if (l1 >= mState.mPreLayoutHolderMap.size()) goto _L9; else goto _L8
_L8:
        if (((ViewHolder)mState.mPreLayoutHolderMap.b(l1)).itemView != view) goto _L11; else goto _L10
_L10:
        l1 = 1;
_L16:
        if (l1 == 0)
        {
            ((ca) (obj2)).put(view, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
          goto _L5
_L11:
        l1++;
          goto _L12
_L4:
        clearOldPositions();
        mAdapterHelper.consumePostponedUpdates();
_L15:
        mState.mItemCount = mAdapter.getItemCount();
        mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        mState.mInPreLayout = false;
        mLayout.onLayoutChildren(mRecycler, mState);
        mState.mStructureChanged = false;
        mPendingSavedState = null;
        State state = mState;
        int l;
        long l3;
        boolean flag1;
        if (mState.mRunSimpleAnimations && mItemAnimator != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        state.mRunSimpleAnimations = flag1;
        if (mState.mRunSimpleAnimations)
        {
            break MISSING_BLOCK_LABEL_684;
        }
          goto _L13
_L2:
        clearOldPositions();
        mAdapterHelper.consumeUpdatesInOnePass();
        Object obj3;
        Object obj4;
        ItemHolderInfo itemholderinfo;
        int i1;
        long l4;
        if (mState.mOldChangedHolders != null)
        {
            l1 = mChildHelper.getChildCount();
            for (l = 0; l < l1; l++)
            {
                obj1 = getChildViewHolderInt(mChildHelper.getChildAt(l));
                if (((ViewHolder) (obj1)).isChanged() && !((ViewHolder) (obj1)).isRemoved() && !((ViewHolder) (obj1)).shouldIgnore())
                {
                    l3 = getChangedHolderKey(((ViewHolder) (obj1)));
                    mState.mOldChangedHolders.put(Long.valueOf(l3), obj1);
                    mState.mPreLayoutHolderMap.remove(obj1);
                }
            }

        }
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        {
            if (mState.mOldChangedHolders != null)
            {
                obj1 = new ca();
            } else
            {
                obj1 = null;
            }
            l1 = mChildHelper.getChildCount();
            l = 0;
            while (l < l1) 
            {
                ViewHolder viewholder1 = getChildViewHolderInt(mChildHelper.getChildAt(l));
                if (!viewholder1.shouldIgnore())
                {
                    obj4 = viewholder1.itemView;
                    l4 = getChangedHolderKey(viewholder1);
                    if (obj1 != null && mState.mOldChangedHolders.get(Long.valueOf(l4)) != null)
                    {
                        ((ca) (obj1)).put(Long.valueOf(l4), viewholder1);
                    } else
                    {
                        mState.mPostLayoutHolderMap.put(viewholder1, new ItemHolderInfo(viewholder1, ((View) (obj4)).getLeft(), ((View) (obj4)).getTop(), ((View) (obj4)).getRight(), ((View) (obj4)).getBottom()));
                    }
                }
                l++;
            }
            processDisappearingList(((ca) (obj2)));
            for (i1 = mState.mPreLayoutHolderMap.size() - 1; i1 >= 0; i1--)
            {
                obj3 = (ViewHolder)mState.mPreLayoutHolderMap.b(i1);
                if (!mState.mPostLayoutHolderMap.containsKey(obj3))
                {
                    obj3 = (ItemHolderInfo)mState.mPreLayoutHolderMap.c(i1);
                    mState.mPreLayoutHolderMap.d(i1);
                    obj4 = ((ItemHolderInfo) (obj3)).holder.itemView;
                    mRecycler.unscrapView(((ItemHolderInfo) (obj3)).holder);
                    animateDisappearance(((ItemHolderInfo) (obj3)));
                }
            }

            i1 = mState.mPostLayoutHolderMap.size();
            if (i1 > 0)
            {
                i1--;
                while (i1 >= 0) 
                {
                    obj4 = (ViewHolder)mState.mPostLayoutHolderMap.b(i1);
                    itemholderinfo = (ItemHolderInfo)mState.mPostLayoutHolderMap.c(i1);
                    if (mState.mPreLayoutHolderMap.isEmpty() || !mState.mPreLayoutHolderMap.containsKey(obj4))
                    {
                        mState.mPostLayoutHolderMap.d(i1);
                        if (obj2 != null)
                        {
                            obj3 = (Rect)((ca) (obj2)).get(((ViewHolder) (obj4)).itemView);
                        } else
                        {
                            obj3 = null;
                        }
                        animateAppearance(((ViewHolder) (obj4)), ((Rect) (obj3)), itemholderinfo.left, itemholderinfo.top);
                    }
                    i1--;
                }
            }
            l1 = mState.mPostLayoutHolderMap.size();
            for (i1 = 0; i1 < l1; i1++)
            {
                obj2 = (ViewHolder)mState.mPostLayoutHolderMap.b(i1);
                obj3 = (ItemHolderInfo)mState.mPostLayoutHolderMap.c(i1);
                obj4 = (ItemHolderInfo)mState.mPreLayoutHolderMap.get(obj2);
                if (obj4 == null || obj3 == null || ((ItemHolderInfo) (obj4)).left == ((ItemHolderInfo) (obj3)).left && ((ItemHolderInfo) (obj4)).top == ((ItemHolderInfo) (obj3)).top)
                {
                    continue;
                }
                ((ViewHolder) (obj2)).setIsRecyclable(false);
                if (mItemAnimator.animateMove(((ViewHolder) (obj2)), ((ItemHolderInfo) (obj4)).left, ((ItemHolderInfo) (obj4)).top, ((ItemHolderInfo) (obj3)).left, ((ItemHolderInfo) (obj3)).top))
                {
                    postAnimationRunner();
                }
            }

            if (mState.mOldChangedHolders != null)
            {
                i1 = mState.mOldChangedHolders.size();
            } else
            {
                i1 = 0;
            }
            i1--;
        }
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l4 = ((Long)mState.mOldChangedHolders.b(i1)).longValue();
        obj2 = (ViewHolder)mState.mOldChangedHolders.get(Long.valueOf(l4));
        obj3 = ((ViewHolder) (obj2)).itemView;
        if (!((ViewHolder) (obj2)).shouldIgnore() && mRecycler.mChangedScrap != null && mRecycler.mChangedScrap.contains(obj2))
        {
            animateChange(((ViewHolder) (obj2)), (ViewHolder)((ca) (obj1)).get(Long.valueOf(l4)));
        }
        i1--;
        if (true) goto _L14; else goto _L13
_L14:
        break MISSING_BLOCK_LABEL_1418;
_L13:
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
        if (true) goto _L15; else goto _L9
_L9:
        l1 = 0;
          goto _L16
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        boolean flag1 = false;
        super.draw(canvas);
        int k = mItemDecorations.size();
        for (int i = 0; i < k; i++)
        {
            ((ItemDecoration)mItemDecorations.get(i)).onDrawOver(canvas, this, mState);
        }

        int j;
        if (mLeftGlow != null && !mLeftGlow.a())
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
            canvas.translate(j + -getHeight(), 0.0F);
            if (mLeftGlow != null && mLeftGlow.a(canvas))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            canvas.restoreToCount(l);
        } else
        {
            k = 0;
        }
        j = k;
        if (mTopGlow != null)
        {
            j = k;
            if (!mTopGlow.a())
            {
                l = canvas.save();
                if (mClipToPadding)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (mTopGlow != null && mTopGlow.a(canvas))
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
            if (!mRightGlow.a())
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
                if (mRightGlow != null && mRightGlow.a(canvas))
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
            if (!mBottomGlow.a())
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
                j = ((flag1) ? 1 : 0);
                if (mBottomGlow != null)
                {
                    j = ((flag1) ? 1 : 0);
                    if (mBottomGlow.a(canvas))
                    {
                        j = 1;
                    }
                }
                j = k | j;
                canvas.restoreToCount(l);
            }
        }
        if (j == 0 && mItemAnimator != null && mItemDecorations.size() > 0 && mItemAnimator.isRunning())
        {
            j = ((flag) ? 1 : 0);
        }
        if (j != 0)
        {
            ds.d(this);
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
        mBottomGlow = new fm(getContext());
        if (mClipToPadding)
        {
            mBottomGlow.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mBottomGlow.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    void ensureLeftGlow()
    {
        if (mLeftGlow != null)
        {
            return;
        }
        mLeftGlow = new fm(getContext());
        if (mClipToPadding)
        {
            mLeftGlow.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mLeftGlow.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureRightGlow()
    {
        if (mRightGlow != null)
        {
            return;
        }
        mRightGlow = new fm(getContext());
        if (mClipToPadding)
        {
            mRightGlow.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mRightGlow.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureTopGlow()
    {
        if (mTopGlow != null)
        {
            return;
        }
        mTopGlow = new fm(getContext());
        if (mClipToPadding)
        {
            mTopGlow.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mTopGlow.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public View findChildViewUnder(float f, float f1)
    {
        for (int i = mChildHelper.getChildCount() - 1; i >= 0; i--)
        {
            View view = mChildHelper.getChildAt(i);
            float f2 = ds.o(view);
            float f3 = ds.p(view);
            if (f >= (float)view.getLeft() + f2 && f <= f2 + (float)view.getRight() && f1 >= (float)view.getTop() + f3 && f1 <= (float)view.getBottom() + f3)
            {
                return view;
            }
        }

        return null;
    }

    public ViewHolder findViewHolderForItemId(long l)
    {
        int j = mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(i));
            if (viewholder != null && viewholder.getItemId() == l)
            {
                return viewholder;
            }
        }

        return null;
    }

    public ViewHolder findViewHolderForPosition(int i)
    {
        return findViewHolderForPosition(i, false);
    }

    ViewHolder findViewHolderForPosition(int i, boolean flag)
    {
        int k = mChildHelper.getUnfilteredChildCount();
        for (int j = 0; j < k; j++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
            if (viewholder != null && !viewholder.isRemoved() && (flag ? viewholder.mPosition == i : viewholder.getPosition() == i))
            {
                return viewholder;
            }
        }

        return null;
    }

    public boolean fling(int i, int j)
    {
        boolean flag = false;
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
            flag = true;
        }
        return flag;
    }

    public View focusSearch(View view, int i)
    {
        View view2 = mLayout.onInterceptFocusSearch(view, i);
        if (view2 == null)
        {
            view2 = FocusFinder.getInstance().findNextFocus(this, view, i);
            View view1 = view2;
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
            view2 = view1;
            if (view1 == null)
            {
                return super.focusSearch(view, i);
            }
        }
        return view2;
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

    public long getChildItemId(View view)
    {
        if (mAdapter != null && mAdapter.hasStableIds())
        {
            if ((view = getChildViewHolderInt(view)) != null)
            {
                return view.getItemId();
            }
        }
        return -1L;
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

    public boolean hasFixedSize()
    {
        return mHasFixedSize;
    }

    void initAdapterManager()
    {
        mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback() {

            final RecyclerView this$0;

            void dispatchUpdate(AdapterHelper.UpdateOp updateop)
            {
                switch (updateop.cmd)
                {
                default:
                    return;

                case 0: // '\0'
                    mLayout.onItemsAdded(RecyclerView.this, updateop.positionStart, updateop.itemCount);
                    return;

                case 1: // '\001'
                    mLayout.onItemsRemoved(RecyclerView.this, updateop.positionStart, updateop.itemCount);
                    return;

                case 2: // '\002'
                    mLayout.onItemsUpdated(RecyclerView.this, updateop.positionStart, updateop.itemCount);
                    return;

                case 3: // '\003'
                    mLayout.onItemsMoved(RecyclerView.this, updateop.positionStart, updateop.itemCount, 1);
                    break;
                }
            }

            public ViewHolder findViewHolder(int i)
            {
                return findViewHolderForPosition(i, true);
            }

            public void markViewHoldersUpdated(int i, int j)
            {
                viewRangeUpdate(i, j);
                mItemsChanged = true;
            }

            public void offsetPositionsForAdd(int i, int j)
            {
                offsetPositionRecordsForInsert(i, j);
                mItemsAddedOrRemoved = true;
            }

            public void offsetPositionsForMove(int i, int j)
            {
                offsetPositionRecordsForMove(i, j);
                mItemsAddedOrRemoved = true;
            }

            public void offsetPositionsForRemovingInvisible(int i, int j)
            {
                offsetPositionRecordsForRemove(i, j, true);
                mItemsAddedOrRemoved = true;
                i = ((LayoutManager) (this)).onItemsRemoved + i;
            }

            public void offsetPositionsForRemovingLaidOutOrNewView(int i, int j)
            {
                offsetPositionRecordsForRemove(i, j, false);
                mItemsAddedOrRemoved = true;
            }

            public void onDispatchFirstPass(AdapterHelper.UpdateOp updateop)
            {
                dispatchUpdate(updateop);
            }

            public void onDispatchSecondPass(AdapterHelper.UpdateOp updateop)
            {
                dispatchUpdate(updateop);
            }

            
            {
                this$0 = RecyclerView.this;
                super();
            }
        });
    }

    void invalidateGlows()
    {
        mBottomGlow = null;
        mTopGlow = null;
        mRightGlow = null;
        mLeftGlow = null;
    }

    public void invalidateItemDecorations()
    {
        if (mItemDecorations.size() == 0)
        {
            return;
        }
        if (mLayout != null)
        {
            mLayout.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
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

    void offsetPositionRecordsForInsert(int i, int j)
    {
        int l = mChildHelper.getUnfilteredChildCount();
        for (int k = 0; k < l; k++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(k));
            if (viewholder != null && !viewholder.shouldIgnore() && viewholder.mPosition >= i)
            {
                viewholder.offsetPosition(j, false);
                mState.mStructureChanged = true;
            }
        }

        mRecycler.offsetPositionRecordsForInsert(i, j);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i, int j)
    {
        int j1 = mChildHelper.getUnfilteredChildCount();
        byte byte0;
        int k;
        int l;
        int i1;
        if (i < j)
        {
            byte0 = -1;
            k = j;
            l = i;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        i1 = 0;
        while (i1 < j1) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(i1));
            if (viewholder != null && viewholder.mPosition >= l && viewholder.mPosition <= k)
            {
                if (viewholder.mPosition == i)
                {
                    viewholder.offsetPosition(j - i, false);
                } else
                {
                    viewholder.offsetPosition(byte0, false);
                }
                mState.mStructureChanged = true;
            }
            i1++;
        }
        mRecycler.offsetPositionRecordsForMove(i, j);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int j, boolean flag)
    {
        int l = mChildHelper.getUnfilteredChildCount();
        int k = 0;
        while (k < l) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(k));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                if (viewholder.mPosition >= i + j)
                {
                    viewholder.offsetPosition(-j, flag);
                    mState.mStructureChanged = true;
                } else
                if (viewholder.mPosition >= i)
                {
                    viewholder.flagRemovedAndOffsetPosition(i - 1, -j, flag);
                    mState.mStructureChanged = true;
                }
            }
            k++;
        }
        mRecycler.offsetPositionRecordsForRemove(i, j, flag);
        requestLayout();
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

    public void onChildAttachedToWindow(View view)
    {
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
        byte byte0 = -1;
        if (!dispatchOnItemTouchIntercept(motionevent)) goto _L2; else goto _L1
_L1:
        cancelTouch();
_L11:
        return true;
_L2:
        int i;
        int k;
        boolean flag;
        boolean flag1;
        flag = mLayout.canScrollHorizontally();
        flag1 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        k = df.a(motionevent);
        i = df.b(motionevent);
        k;
        JVM INSTR tableswitch 0 6: default 112
    //                   0 122
    //                   1 483
    //                   2 251
    //                   3 493
    //                   4 112
    //                   5 197
    //                   6 475;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9
_L7:
        break MISSING_BLOCK_LABEL_493;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L12:
        if (mScrollState != 1)
        {
            return false;
        }
        if (true) goto _L11; else goto _L10
_L10:
        mScrollPointerId = df.b(motionevent, 0);
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
          goto _L12
_L8:
        mScrollPointerId = df.b(motionevent, i);
        int l = (int)(df.c(motionevent, i) + 0.5F);
        mLastTouchX = l;
        mInitialTouchX = l;
        i = (int)(df.d(motionevent, i) + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
          goto _L12
_L6:
        int i1 = df.a(motionevent, mScrollPointerId);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j = (int)(df.c(motionevent, i1) + 0.5F);
        i1 = (int)(df.d(motionevent, i1) + 0.5F);
        if (mScrollState != 1)
        {
            j -= mInitialTouchX;
            int k1 = i1 - mInitialTouchY;
            if (flag && Math.abs(j) > mTouchSlop)
            {
                int j1 = mInitialTouchX;
                int l1 = mTouchSlop;
                if (j < 0)
                {
                    j = -1;
                } else
                {
                    j = 1;
                }
                mLastTouchX = j * l1 + j1;
                j = 1;
            } else
            {
                j = 0;
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
                        j = byte0;
                    } else
                    {
                        j = 1;
                    }
                    mLastTouchY = j1 + j * l1;
                    j1 = 1;
                }
            }
            if (j1 != 0)
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        }
          goto _L12
_L9:
        onPointerUp(motionevent);
          goto _L12
_L5:
        mVelocityTracker.clear();
          goto _L12
        cancelTouch();
          goto _L12
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

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        mPendingSavedState = (SavedState)parcelable;
        super.onRestoreInstanceState(mPendingSavedState.getSuperState());
        if (mLayout != null && mPendingSavedState.mLayoutState != null)
        {
            mLayout.onRestoreInstanceState(mPendingSavedState.mLayoutState);
        }
    }

    public Parcelable onSaveInstanceState()
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
        byte byte0 = -1;
        if (dispatchOnItemTouch(motionevent))
        {
            cancelTouch();
            return true;
        }
        boolean flag = mLayout.canScrollHorizontally();
        boolean flag1 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        int l = df.a(motionevent);
        int i = df.b(motionevent);
        switch (l)
        {
        case 4: // '\004'
        default:
            return true;

        case 0: // '\0'
            mScrollPointerId = df.b(motionevent, 0);
            i = (int)(motionevent.getX() + 0.5F);
            mLastTouchX = i;
            mInitialTouchX = i;
            i = (int)(motionevent.getY() + 0.5F);
            mLastTouchY = i;
            mInitialTouchY = i;
            return true;

        case 5: // '\005'
            mScrollPointerId = df.b(motionevent, i);
            int i1 = (int)(df.c(motionevent, i) + 0.5F);
            mLastTouchX = i1;
            mInitialTouchX = i1;
            i = (int)(df.d(motionevent, i) + 0.5F);
            mLastTouchY = i;
            mInitialTouchY = i;
            return true;

        case 2: // '\002'
            int j = df.a(motionevent, mScrollPointerId);
            if (j < 0)
            {
                Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
                return false;
            }
            int k1 = (int)(df.c(motionevent, j) + 0.5F);
            int l1 = (int)(df.d(motionevent, j) + 0.5F);
            if (mScrollState != 1)
            {
                int k = k1 - mInitialTouchX;
                int i2 = l1 - mInitialTouchY;
                float f;
                float f1;
                int j1;
                if (flag && Math.abs(k) > mTouchSlop)
                {
                    j1 = mInitialTouchX;
                    int j2 = mTouchSlop;
                    if (k < 0)
                    {
                        k = -1;
                    } else
                    {
                        k = 1;
                    }
                    mLastTouchX = k * j2 + j1;
                    k = 1;
                } else
                {
                    k = 0;
                }
                j1 = k;
                if (flag1)
                {
                    j1 = k;
                    if (Math.abs(i2) > mTouchSlop)
                    {
                        j1 = mInitialTouchY;
                        j2 = mTouchSlop;
                        if (i2 < 0)
                        {
                            k = byte0;
                        } else
                        {
                            k = 1;
                        }
                        mLastTouchY = j1 + k * j2;
                        j1 = 1;
                    }
                }
                if (j1 != 0)
                {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
            }
            if (mScrollState == 1)
            {
                k = mLastTouchX;
                j1 = mLastTouchY;
                if (flag)
                {
                    k = -(k1 - k);
                } else
                {
                    k = 0;
                }
                if (flag1)
                {
                    j1 = -(l1 - j1);
                } else
                {
                    j1 = 0;
                }
                scrollByInternal(k, j1);
            }
            mLastTouchX = k1;
            mLastTouchY = l1;
            return true;

        case 6: // '\006'
            onPointerUp(motionevent);
            return true;

        case 1: // '\001'
            mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocity);
            if (flag)
            {
                f = -dq.a(mVelocityTracker, mScrollPointerId);
            } else
            {
                f = 0.0F;
            }
            if (flag1)
            {
                f1 = -dq.b(mVelocityTracker, mScrollPointerId);
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
            return true;

        case 3: // '\003'
            cancelTouch();
            return true;
        }
    }

    void rebindUpdatedViewHolders()
    {
        int j = mChildHelper.getChildCount();
        int i = 0;
        while (i < j) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.getChildAt(i));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                if (viewholder.isRemoved() || viewholder.isInvalid())
                {
                    requestLayout();
                } else
                if (viewholder.needsUpdate())
                {
                    int k = mAdapter.getItemViewType(viewholder.mPosition);
                    if (viewholder.getItemViewType() == k)
                    {
                        if (!viewholder.isChanged() || !supportsChangeAnimations())
                        {
                            mAdapter.bindViewHolder(viewholder, viewholder.mPosition);
                        } else
                        {
                            requestLayout();
                        }
                    } else
                    {
                        viewholder.addFlags(4);
                        requestLayout();
                    }
                }
            }
            i++;
        }
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

    public void removeItemDecoration(ItemDecoration itemdecoration)
    {
        if (mLayout != null)
        {
            mLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        mItemDecorations.remove(itemdecoration);
        if (mItemDecorations.isEmpty())
        {
            boolean flag;
            if (ds.a(this) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setWillNotDraw(flag);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnItemTouchListener(OnItemTouchListener onitemtouchlistener)
    {
        mOnItemTouchListeners.remove(onitemtouchlistener);
        if (mActiveOnItemTouchListener == onitemtouchlistener)
        {
            mActiveOnItemTouchListener = null;
        }
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
        consumePendingUpdateOperations();
        int k;
        int l;
        int i1;
        int j1;
        if (mAdapter != null)
        {
            eatRequestLayout();
            mRunningLayoutOrScroll = true;
            int l1;
            int j2;
            if (i != 0)
            {
                l = mLayout.scrollHorizontallyBy(i, mRecycler, mState);
                k = i - l;
            } else
            {
                l = 0;
                k = 0;
            }
            if (j != 0)
            {
                i1 = mLayout.scrollVerticallyBy(j, mRecycler, mState);
                j1 = j - i1;
            } else
            {
                i1 = 0;
                j1 = 0;
            }
            if (supportsChangeAnimations())
            {
                int i2 = mChildHelper.getChildCount();
                int k1 = 0;
                while (k1 < i2) 
                {
                    View view = mChildHelper.getChildAt(k1);
                    Object obj = getChildViewHolder(view);
                    if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((ViewHolder) (obj)).mShadowingHolder;
                    int k2;
                    int l2;
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
                    k2 = view.getLeft();
                    l2 = view.getTop();
                    if (k2 != ((View) (obj)).getLeft() || l2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(k2, l2, ((View) (obj)).getWidth() + k2, ((View) (obj)).getHeight() + l2);
                    }
                    k1++;
                }
            }
            mRunningLayoutOrScroll = false;
            resumeRequestLayout(false);
            l1 = j1;
            j2 = l;
            j1 = k;
            l = l1;
            k = j2;
        } else
        {
            i1 = 0;
            k = 0;
            l = 0;
            j1 = 0;
        }
        if (!mItemDecorations.isEmpty())
        {
            invalidate();
        }
        if (ds.a(this) != 2)
        {
            considerReleasingGlowsOnScroll(i, j);
            pullGlows(j1, l);
        }
        if (k != 0 || i1 != 0)
        {
            onScrollChanged(0, 0, 0, 0);
            if (mScrollListener != null)
            {
                mScrollListener.onScrolled(this, k, i1);
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

    public void scrollToPosition(int i)
    {
        stopScroll();
        mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        mAccessibilityDelegate = recyclerviewaccessibilitydelegate;
        ds.a(this, mAccessibilityDelegate);
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
            mTouchSlop = eb.a(viewconfiguration);
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

    public void smoothScrollToPosition(int i)
    {
        mLayout.smoothScrollToPosition(this, mState, i);
    }

    public void stopScroll()
    {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(Adapter adapter, boolean flag)
    {
        setAdapterInternal(adapter, true, flag);
        mDataSetHasChangedAfterLayout = true;
        requestLayout();
    }

    void viewRangeUpdate(int i, int j)
    {
        int l = mChildHelper.getUnfilteredChildCount();
        int k = 0;
        do
        {
            if (k >= l)
            {
                break;
            }
            View view = mChildHelper.getUnfilteredChildAt(k);
            ViewHolder viewholder = getChildViewHolderInt(view);
            if (viewholder != null && !viewholder.shouldIgnore() && viewholder.mPosition >= i && viewholder.mPosition < i + j)
            {
                viewholder.addFlags(2);
                if (supportsChangeAnimations())
                {
                    viewholder.addFlags(64);
                }
                ((LayoutParams)view.getLayoutParams()).mInsetsDirty = true;
            }
            k++;
        } while (true);
        mRecycler.viewRangeUpdate(i, j);
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
    static boolean access$202(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mDataSetHasChangedAfterLayout = flag;
        return flag;
    }

*/





/*
    static boolean access$2302(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mRunningLayoutOrScroll = flag;
        return flag;
    }

*/














/*
    static boolean access$3602(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mAdapterUpdateDuringMeasure = flag;
        return flag;
    }

*/












/*
    static boolean access$502(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mPostedAnimatorRunner = flag;
        return flag;
    }

*/




}
