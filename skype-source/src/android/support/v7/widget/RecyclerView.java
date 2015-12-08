// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.d;
import android.support.v4.view.ab;
import android.support.v4.view.accessibility.a;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.u;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            f, m, e, a

public class RecyclerView extends ViewGroup
    implements android.support.v4.view.n, android.support.v4.view.u
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        Parcelable a;

        static void a(SavedState savedstate, SavedState savedstate1)
        {
            savedstate.a = savedstate1.a;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeParcelable(a, 0);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readParcelable(android/support/v7/widget/RecyclerView$i.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static abstract class a
    {

        private boolean mHasStableIds;
        private final b mObservable = new b();

        public final void bindViewHolder(v v1, int i1)
        {
            v1.mPosition = i1;
            if (hasStableIds())
            {
                v1.mItemId = getItemId(i1);
            }
            v1.setFlags(1, 519);
            android.support.v4.os.d.a("RV OnBindView");
            onBindViewHolder(v1, i1, v1.getUnmodifiedPayloads());
            v1.clearPayload();
            android.support.v4.os.d.a();
        }

        public final v createViewHolder(ViewGroup viewgroup, int i1)
        {
            android.support.v4.os.d.a("RV CreateView");
            viewgroup = onCreateViewHolder(viewgroup, i1);
            viewgroup.mItemViewType = i1;
            android.support.v4.os.d.a();
            return viewgroup;
        }

        public abstract int getItemCount();

        public long getItemId(int i1)
        {
            return -1L;
        }

        public int getItemViewType(int i1)
        {
            return 0;
        }

        public final boolean hasObservers()
        {
            return mObservable.a();
        }

        public final boolean hasStableIds()
        {
            return mHasStableIds;
        }

        public final void notifyDataSetChanged()
        {
            mObservable.b();
        }

        public final void notifyItemChanged(int i1)
        {
            mObservable.a(i1, 1);
        }

        public final void notifyItemChanged(int i1, Object obj)
        {
            mObservable.a(i1, 1, obj);
        }

        public final void notifyItemInserted(int i1)
        {
            mObservable.b(i1, 1);
        }

        public final void notifyItemMoved(int i1, int j1)
        {
            mObservable.d(i1, j1);
        }

        public final void notifyItemRangeChanged(int i1, int j1)
        {
            mObservable.a(i1, j1);
        }

        public final void notifyItemRangeChanged(int i1, int j1, Object obj)
        {
            mObservable.a(i1, j1, obj);
        }

        public final void notifyItemRangeInserted(int i1, int j1)
        {
            mObservable.b(i1, j1);
        }

        public final void notifyItemRangeRemoved(int i1, int j1)
        {
            mObservable.c(i1, j1);
        }

        public final void notifyItemRemoved(int i1)
        {
            mObservable.c(i1, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerview)
        {
        }

        public abstract void onBindViewHolder(v v1, int i1);

        public void onBindViewHolder(v v1, int i1, List list)
        {
            onBindViewHolder(v1, i1);
        }

        public abstract v onCreateViewHolder(ViewGroup viewgroup, int i1);

        public void onDetachedFromRecyclerView(RecyclerView recyclerview)
        {
        }

        public boolean onFailedToRecycleView(v v1)
        {
            return false;
        }

        public void onViewAttachedToWindow(v v1)
        {
        }

        public void onViewDetachedFromWindow(v v1)
        {
        }

        public void onViewRecycled(v v1)
        {
        }

        public void registerAdapterDataObserver(c c1)
        {
            mObservable.registerObserver(c1);
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

        public void unregisterAdapterDataObserver(c c1)
        {
            mObservable.unregisterObserver(c1);
        }

        public a()
        {
            mHasStableIds = false;
        }
    }

    static final class b extends Observable
    {

        public final void a(int i1, int j1)
        {
            a(i1, j1, null);
        }

        public final void a(int i1, int j1, Object obj)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).onItemRangeChanged(i1, j1, obj);
            }

        }

        public final boolean a()
        {
            return !mObservers.isEmpty();
        }

        public final void b()
        {
            for (int i1 = mObservers.size() - 1; i1 >= 0; i1--)
            {
                ((c)mObservers.get(i1)).onChanged();
            }

        }

        public final void b(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).onItemRangeInserted(i1, j1);
            }

        }

        public final void c(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).onItemRangeRemoved(i1, j1);
            }

        }

        public final void d(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).onItemRangeMoved(i1, j1, 1);
            }

        }

        b()
        {
        }
    }

    public static abstract class c
    {

        public void onChanged()
        {
        }

        public void onItemRangeChanged(int i1, int j1)
        {
        }

        public void onItemRangeChanged(int i1, int j1, Object obj)
        {
            onItemRangeChanged(i1, j1);
        }

        public void onItemRangeInserted(int i1, int j1)
        {
        }

        public void onItemRangeMoved(int i1, int j1, int k1)
        {
        }

        public void onItemRangeRemoved(int i1, int j1)
        {
        }

        public c()
        {
        }
    }

    public static interface d
    {

        public abstract int a();
    }

    public static abstract class e
    {

        private a a;
        private ArrayList b;
        private long c;
        private long d;
        private long e;
        private long f;
        private boolean g;

        public abstract void a();

        public final void a(long l1)
        {
            f = l1;
        }

        final void a(a a1)
        {
            a = a1;
        }

        public abstract boolean a(v v1);

        public abstract boolean a(v v1, int i1, int j1, int k1, int l1);

        public abstract boolean a(v v1, v v2, int i1, int j1, int k1, int l1);

        public abstract boolean b();

        public abstract boolean b(v v1);

        public abstract void c();

        public abstract void c(v v1);

        public final long d()
        {
            return e;
        }

        public final void d(v v1)
        {
            if (a != null)
            {
                a.a(v1);
            }
        }

        public final long e()
        {
            return c;
        }

        public final void e(v v1)
        {
            if (a != null)
            {
                a.c(v1);
            }
        }

        public final long f()
        {
            return d;
        }

        public final void f(v v1)
        {
            if (a != null)
            {
                a.b(v1);
            }
        }

        public final long g()
        {
            return f;
        }

        public final void g(v v1)
        {
            if (a != null)
            {
                a.d(v1);
            }
        }

        public final boolean h()
        {
            return g;
        }

        public final void i()
        {
            int j1 = b.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                b.get(i1);
            }

            b.clear();
        }

        public e()
        {
            a = null;
            b = new ArrayList();
            c = 120L;
            d = 120L;
            e = 250L;
            f = 250L;
            g = true;
        }
    }

    static interface e.a
    {

        public abstract void a(v v1);

        public abstract void b(v v1);

        public abstract void c(v v1);

        public abstract void d(v v1);
    }

    private final class f
        implements e.a
    {

        final RecyclerView a;

        public final void a(v v1)
        {
            v1.setIsRecyclable(true);
            if (!a.removeAnimatingView(v1.itemView) && v1.isTmpDetached())
            {
                a.removeDetachedView(v1.itemView, false);
            }
        }

        public final void b(v v1)
        {
            v1.setIsRecyclable(true);
            if (!v1.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(v1.itemView);
            }
        }

        public final void c(v v1)
        {
            v1.setIsRecyclable(true);
            if (!v1.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(v1.itemView);
            }
        }

        public final void d(v v1)
        {
            v1.setIsRecyclable(true);
            if (v1.mShadowedHolder != null && v1.mShadowingHolder == null)
            {
                v1.mShadowedHolder = null;
                v1.setFlags(-65, v1.mFlags);
            }
            v1.mShadowingHolder = null;
            if (!v1.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(v1.itemView);
            }
        }

        private f()
        {
            a = RecyclerView.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    public static abstract class g
    {

        public void getItemOffsets(Rect rect, int i1, RecyclerView recyclerview)
        {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, s s1)
        {
            getItemOffsets(rect, ((j)view.getLayoutParams()).a.getLayoutPosition(), recyclerview);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, s s1)
        {
            onDraw(canvas, recyclerview);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview, s s1)
        {
            onDrawOver(canvas, recyclerview);
        }

        public g()
        {
        }
    }

    private static final class h
    {

        v a;
        int b;
        int c;
        int d;
        int e;

        h(v v1, int i1, int j1, int k1, int l1)
        {
            a = v1;
            b = i1;
            c = j1;
            d = k1;
            e = l1;
        }
    }

    public static abstract class i
    {

        android.support.v7.widget.e mChildHelper;
        private boolean mIsAttachedToWindow;
        RecyclerView mRecyclerView;
        private boolean mRequestedSimpleAnimations;
        r mSmoothScroller;

        private void addViewInt(View view, int i1, boolean flag)
        {
            v v1;
            j j1;
            v1 = RecyclerView.getChildViewHolderInt(view);
            if (flag || v1.isRemoved())
            {
                mRecyclerView.mState.b(view);
            } else
            {
                mRecyclerView.mState.a(view);
            }
            j1 = (j)view.getLayoutParams();
            if (!v1.wasReturnedFromScrap() && !v1.isScrap()) goto _L2; else goto _L1
_L1:
            if (v1.isScrap())
            {
                v1.unScrap();
            } else
            {
                v1.clearReturnedFromScrapFlag();
            }
            mChildHelper.a(view, i1, view.getLayoutParams(), false);
_L4:
            if (j1.d)
            {
                v1.itemView.invalidate();
                j1.d = false;
            }
            return;
_L2:
            if (view.getParent() == mRecyclerView)
            {
                int l1 = mChildHelper.c(view);
                int k1 = i1;
                if (i1 == -1)
                {
                    k1 = mChildHelper.a();
                }
                if (l1 == -1)
                {
                    throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(mRecyclerView.indexOfChild(view)).toString());
                }
                if (l1 != k1)
                {
                    mRecyclerView.mLayout.moveView(l1, k1);
                }
            } else
            {
                mChildHelper.a(view, i1, false);
                j1.c = true;
                if (mSmoothScroller != null && mSmoothScroller.e())
                {
                    mSmoothScroller.a(view);
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void detachViewInternal(int i1, View view)
        {
            mChildHelper.d(i1);
        }

        public static int getChildMeasureSpec(int i1, int j1, int k1, boolean flag)
        {
            int l1;
            l1 = Math.max(0, i1 - j1);
            j1 = 0;
            i1 = 0;
            if (!flag) goto _L2; else goto _L1
_L1:
            if (k1 >= 0)
            {
                j1 = k1;
                i1 = 0x40000000;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
_L4:
            return android.view.View.MeasureSpec.makeMeasureSpec(j1, i1);
_L2:
            if (k1 >= 0)
            {
                j1 = k1;
                i1 = 0x40000000;
            } else
            if (k1 == -1)
            {
                j1 = l1;
                i1 = 0x40000000;
            } else
            if (k1 == -2)
            {
                j1 = l1;
                i1 = 0x80000000;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public static a getProperties(Context context, AttributeSet attributeset, int i1, int j1)
        {
            a a1 = new a();
            context = context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.a.a.RecyclerView, i1, j1);
            a1.a = context.getInt(android.support.v7.recyclerview.a.a.RecyclerView_android_orientation, 1);
            a1.b = context.getInt(android.support.v7.recyclerview.a.a.RecyclerView_spanCount, 1);
            a1.c = context.getBoolean(android.support.v7.recyclerview.a.a.RecyclerView_reverseLayout, false);
            a1.d = context.getBoolean(android.support.v7.recyclerview.a.a.RecyclerView_stackFromEnd, false);
            context.recycle();
            return a1;
        }

        private void onSmoothScrollerStopped(r r1)
        {
            if (mSmoothScroller == r1)
            {
                mSmoothScroller = null;
            }
        }

        private void scrapOrRecycleView(o o1, int i1, View view)
        {
            v v1 = RecyclerView.getChildViewHolderInt(view);
            if (v1.shouldIgnore())
            {
                return;
            }
            if (v1.isInvalid() && !v1.isRemoved() && !v1.isChanged() && !mRecyclerView.mAdapter.hasStableIds())
            {
                removeViewAt(i1);
                o1.a(v1);
                return;
            } else
            {
                detachViewAt(i1);
                o1.c(view);
                return;
            }
        }

        public void addDisappearingView(View view)
        {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i1)
        {
            addViewInt(view, i1, true);
        }

        public void addView(View view)
        {
            addView(view, -1);
        }

        public void addView(View view, int i1)
        {
            addViewInt(view, i1, false);
        }

        public void assertInLayoutOrScroll(String s1)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.assertInLayoutOrScroll(s1);
            }
        }

        public void assertNotInLayoutOrScroll(String s1)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.assertNotInLayoutOrScroll(s1);
            }
        }

        public void attachView(View view)
        {
            attachView(view, -1);
        }

        public void attachView(View view, int i1)
        {
            attachView(view, i1, (j)view.getLayoutParams());
        }

        public void attachView(View view, int i1, j j1)
        {
            v v1 = RecyclerView.getChildViewHolderInt(view);
            if (v1.isRemoved())
            {
                mRecyclerView.mState.b(view);
            } else
            {
                mRecyclerView.mState.a(view);
            }
            mChildHelper.a(view, i1, j1, v1.isRemoved());
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

        public boolean checkLayoutParams(j j1)
        {
            return j1 != null;
        }

        public int computeHorizontalScrollExtent(s s1)
        {
            return 0;
        }

        public int computeHorizontalScrollOffset(s s1)
        {
            return 0;
        }

        public int computeHorizontalScrollRange(s s1)
        {
            return 0;
        }

        public int computeVerticalScrollExtent(s s1)
        {
            return 0;
        }

        public int computeVerticalScrollOffset(s s1)
        {
            return 0;
        }

        public int computeVerticalScrollRange(s s1)
        {
            return 0;
        }

        public void detachAndScrapAttachedViews(o o1)
        {
            for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
            {
                scrapOrRecycleView(o1, i1, getChildAt(i1));
            }

        }

        public void detachAndScrapView(View view, o o1)
        {
            scrapOrRecycleView(o1, mChildHelper.c(view), view);
        }

        public void detachAndScrapViewAt(int i1, o o1)
        {
            scrapOrRecycleView(o1, i1, getChildAt(i1));
        }

        public void detachView(View view)
        {
            int i1 = mChildHelper.c(view);
            if (i1 >= 0)
            {
                detachViewInternal(i1, view);
            }
        }

        public void detachViewAt(int i1)
        {
            detachViewInternal(i1, getChildAt(i1));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerview)
        {
            mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerview);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerview, o o1)
        {
            mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerview, o1);
        }

        public void endAnimation(View view)
        {
            if (mRecyclerView.mItemAnimator != null)
            {
                mRecyclerView.mItemAnimator.c(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findViewByPosition(int i1)
        {
            int k1 = getChildCount();
            for (int j1 = 0; j1 < k1; j1++)
            {
                View view = getChildAt(j1);
                v v1 = RecyclerView.getChildViewHolderInt(view);
                if (v1 != null && v1.getLayoutPosition() == i1 && !v1.shouldIgnore() && (mRecyclerView.mState.a() || !v1.isRemoved()))
                {
                    return view;
                }
            }

            return null;
        }

        public abstract j generateDefaultLayoutParams();

        public j generateLayoutParams(Context context, AttributeSet attributeset)
        {
            return new j(context, attributeset);
        }

        public j generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            if (layoutparams instanceof j)
            {
                return new j((j)layoutparams);
            }
            if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
            {
                return new j((android.view.ViewGroup.MarginLayoutParams)layoutparams);
            } else
            {
                return new j(layoutparams);
            }
        }

        public int getBaseline()
        {
            return -1;
        }

        public int getBottomDecorationHeight(View view)
        {
            return ((j)view.getLayoutParams()).b.bottom;
        }

        public View getChildAt(int i1)
        {
            if (mChildHelper != null)
            {
                return mChildHelper.b(i1);
            } else
            {
                return null;
            }
        }

        public int getChildCount()
        {
            if (mChildHelper != null)
            {
                return mChildHelper.a();
            } else
            {
                return 0;
            }
        }

        public boolean getClipToPadding()
        {
            return mRecyclerView != null && mRecyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(o o1, s s1)
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
            Rect rect = ((j)view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view)
        {
            Rect rect = ((j)view.getLayoutParams()).b;
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
            if (!mChildHelper.d(view1)) goto _L4; else goto _L3
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

        public int getItemCount()
        {
            a a1;
            if (mRecyclerView != null)
            {
                a1 = mRecyclerView.getAdapter();
            } else
            {
                a1 = null;
            }
            if (a1 != null)
            {
                return a1.getItemCount();
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
            return x.h(mRecyclerView);
        }

        public int getLeftDecorationWidth(View view)
        {
            return ((j)view.getLayoutParams()).b.left;
        }

        public int getMinimumHeight()
        {
            return x.r(mRecyclerView);
        }

        public int getMinimumWidth()
        {
            return x.q(mRecyclerView);
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
                return x.n(mRecyclerView);
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
                return x.m(mRecyclerView);
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
            return ((j)view.getLayoutParams()).a.getLayoutPosition();
        }

        public int getRightDecorationWidth(View view)
        {
            return ((j)view.getLayoutParams()).b.right;
        }

        public int getRowCountForAccessibility(o o1, s s1)
        {
            while (mRecyclerView == null || mRecyclerView.mAdapter == null || !canScrollVertically()) 
            {
                return 1;
            }
            return mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(o o1, s s1)
        {
            return 0;
        }

        public int getTopDecorationHeight(View view)
        {
            return ((j)view.getLayoutParams()).b.top;
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
                mRecyclerView.mState.a(view);
                return;
            }
        }

        public boolean isAttachedToWindow()
        {
            return mIsAttachedToWindow;
        }

        public boolean isFocused()
        {
            return mRecyclerView != null && mRecyclerView.isFocused();
        }

        public boolean isLayoutHierarchical(o o1, s s1)
        {
            return false;
        }

        public boolean isSmoothScrolling()
        {
            return mSmoothScroller != null && mSmoothScroller.e();
        }

        public void layoutDecorated(View view, int i1, int j1, int k1, int l1)
        {
            Rect rect = ((j)view.getLayoutParams()).b;
            view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
        }

        public void measureChild(View view, int i1, int j1)
        {
            j j2 = (j)view.getLayoutParams();
            Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
            int k1 = rect.left;
            int l1 = rect.right;
            int i2 = rect.top;
            int k2 = rect.bottom;
            view.measure(getChildMeasureSpec(getWidth(), getPaddingLeft() + getPaddingRight() + (i1 + (k1 + l1)), j2.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), getPaddingTop() + getPaddingBottom() + (j1 + (i2 + k2)), j2.height, canScrollVertically()));
        }

        public void measureChildWithMargins(View view, int i1, int j1)
        {
            j j2 = (j)view.getLayoutParams();
            Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
            int k1 = rect.left;
            int l1 = rect.right;
            int i2 = rect.top;
            int k2 = rect.bottom;
            view.measure(getChildMeasureSpec(getWidth(), getPaddingLeft() + getPaddingRight() + j2.leftMargin + j2.rightMargin + (i1 + (k1 + l1)), j2.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), getPaddingTop() + getPaddingBottom() + j2.topMargin + j2.bottomMargin + (j1 + (i2 + k2)), j2.height, canScrollVertically()));
        }

        public void moveView(int i1, int j1)
        {
            View view = getChildAt(i1);
            if (view == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(i1).toString());
            } else
            {
                detachViewAt(i1);
                attachView(view, j1);
                return;
            }
        }

        public void offsetChildrenHorizontal(int i1)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.offsetChildrenHorizontal(i1);
            }
        }

        public void offsetChildrenVertical(int i1)
        {
            if (mRecyclerView != null)
            {
                mRecyclerView.offsetChildrenVertical(i1);
            }
        }

        public void onAdapterChanged(a a1, a a2)
        {
        }

        public boolean onAddFocusables(RecyclerView recyclerview, ArrayList arraylist, int i1, int j1)
        {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerview)
        {
        }

        public void onDetachedFromWindow(RecyclerView recyclerview)
        {
        }

        public void onDetachedFromWindow(RecyclerView recyclerview, o o1)
        {
            onDetachedFromWindow(recyclerview);
        }

        public View onFocusSearchFailed(View view, int i1, o o1, s s1)
        {
            return null;
        }

        public void onInitializeAccessibilityEvent(o o1, s s1, AccessibilityEvent accessibilityevent)
        {
            boolean flag1 = true;
            o1 = android.support.v4.view.accessibility.a.a(accessibilityevent);
            if (mRecyclerView != null)
            {
                boolean flag = flag1;
                if (!x.b(mRecyclerView, 1))
                {
                    flag = flag1;
                    if (!x.b(mRecyclerView, -1))
                    {
                        flag = flag1;
                        if (!x.a(mRecyclerView, -1))
                        {
                            if (x.a(mRecyclerView, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                o1.a(flag);
                if (mRecyclerView.mAdapter != null)
                {
                    o1.a(mRecyclerView.mAdapter.getItemCount());
                    return;
                }
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            onInitializeAccessibilityEvent(mRecyclerView.mRecycler, mRecyclerView.mState, accessibilityevent);
        }

        void onInitializeAccessibilityNodeInfo(android.support.v4.view.accessibility.c c1)
        {
            onInitializeAccessibilityNodeInfo(mRecyclerView.mRecycler, mRecyclerView.mState, c1);
        }

        public void onInitializeAccessibilityNodeInfo(o o1, s s1, android.support.v4.view.accessibility.c c1)
        {
            if (x.b(mRecyclerView, -1) || x.a(mRecyclerView, -1))
            {
                c1.a(8192);
                c1.i(true);
            }
            if (x.b(mRecyclerView, 1) || x.a(mRecyclerView, 1))
            {
                c1.a(4096);
                c1.i(true);
            }
            c1.a(android.support.v4.view.accessibility.c.k.a(getRowCountForAccessibility(o1, s1), getColumnCountForAccessibility(o1, s1), isLayoutHierarchical(o1, s1), getSelectionModeForAccessibility(o1, s1)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(o o1, s s1, View view, android.support.v4.view.accessibility.c c1)
        {
            int i1;
            int j1;
            if (canScrollVertically())
            {
                i1 = getPosition(view);
            } else
            {
                i1 = 0;
            }
            if (canScrollHorizontally())
            {
                j1 = getPosition(view);
            } else
            {
                j1 = 0;
            }
            c1.b(android.support.v4.view.accessibility.c.l.a(i1, 1, j1, 1, false));
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, android.support.v4.view.accessibility.c c1)
        {
            v v1 = RecyclerView.getChildViewHolderInt(view);
            if (v1 != null && !v1.isRemoved() && !mChildHelper.d(v1.itemView))
            {
                onInitializeAccessibilityNodeInfoForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, c1);
            }
        }

        public View onInterceptFocusSearch(View view, int i1)
        {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public void onItemsChanged(RecyclerView recyclerview)
        {
        }

        public void onItemsMoved(RecyclerView recyclerview, int i1, int j1, int k1)
        {
        }

        public void onItemsRemoved(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public void onItemsUpdated(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public void onItemsUpdated(RecyclerView recyclerview, int i1, int j1, Object obj)
        {
            onItemsUpdated(recyclerview, i1, j1);
        }

        public void onLayoutChildren(o o1, s s1)
        {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(o o1, s s1, int i1, int j1)
        {
            mRecyclerView.defaultOnMeasure(i1, j1);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerview, s s1, View view, View view1)
        {
            return onRequestChildFocus(recyclerview, view, view1);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
        {
            return isSmoothScrolling() || recyclerview.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState()
        {
            return null;
        }

        public void onScrollStateChanged(int i1)
        {
        }

        boolean performAccessibilityAction(int i1, Bundle bundle)
        {
            return performAccessibilityAction(mRecyclerView.mRecycler, mRecyclerView.mState, i1, bundle);
        }

        public boolean performAccessibilityAction(o o1, s s1, int i1, Bundle bundle)
        {
            if (mRecyclerView != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int l1;
            boolean flag1;
            boolean flag2;
            flag1 = false;
            flag2 = false;
            boolean flag = false;
            l1 = 0;
            switch (i1)
            {
            default:
                i1 = ((flag) ? 1 : 0);
                break;

            case 4096: 
                break MISSING_BLOCK_LABEL_141;

            case 8192: 
                break; /* Loop/switch isn't completed */
            }
_L4:
            if (i1 != 0 || l1 != 0)
            {
                mRecyclerView.scrollBy(l1, i1);
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            int j1 = ((flag1) ? 1 : 0);
            if (x.b(mRecyclerView, -1))
            {
                j1 = -(getHeight() - getPaddingTop() - getPaddingBottom());
            }
            i1 = j1;
            if (x.a(mRecyclerView, -1))
            {
                l1 = -(getWidth() - getPaddingLeft() - getPaddingRight());
                i1 = j1;
            }
              goto _L4
            int k1 = ((flag2) ? 1 : 0);
            if (x.b(mRecyclerView, 1))
            {
                k1 = getHeight() - getPaddingTop() - getPaddingBottom();
            }
            i1 = k1;
            if (x.a(mRecyclerView, 1))
            {
                l1 = getWidth() - getPaddingLeft() - getPaddingRight();
                i1 = k1;
            }
              goto _L4
        }

        public boolean performAccessibilityActionForItem(o o1, s s1, View view, int i1, Bundle bundle)
        {
            return false;
        }

        boolean performAccessibilityActionForItem(View view, int i1, Bundle bundle)
        {
            return performAccessibilityActionForItem(mRecyclerView.mRecycler, mRecyclerView.mState, view, i1, bundle);
        }

        public void postOnAnimation(Runnable runnable)
        {
            if (mRecyclerView != null)
            {
                x.a(mRecyclerView, runnable);
            }
        }

        public void removeAllViews()
        {
            for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
            {
                mChildHelper.a(i1);
            }

        }

        public void removeAndRecycleAllViews(o o1)
        {
            for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
            {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(i1)).shouldIgnore())
                {
                    removeAndRecycleViewAt(i1, o1);
                }
            }

        }

        void removeAndRecycleScrapInt(o o1)
        {
            int j1 = o1.a.size();
            for (int i1 = j1 - 1; i1 >= 0; i1--)
            {
                View view = ((v)o1.a.get(i1)).itemView;
                v v1 = RecyclerView.getChildViewHolderInt(view);
                if (v1.shouldIgnore())
                {
                    continue;
                }
                v1.setIsRecyclable(false);
                if (v1.isTmpDetached())
                {
                    mRecyclerView.removeDetachedView(view, false);
                }
                if (mRecyclerView.mItemAnimator != null)
                {
                    mRecyclerView.mItemAnimator.c(v1);
                }
                v1.setIsRecyclable(true);
                o1.b(view);
            }

            o1.a.clear();
            if (j1 > 0)
            {
                mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, o o1)
        {
            removeView(view);
            o1.a(view);
        }

        public void removeAndRecycleViewAt(int i1, o o1)
        {
            View view = getChildAt(i1);
            removeViewAt(i1);
            o1.a(view);
        }

        public boolean removeCallbacks(Runnable runnable)
        {
            if (mRecyclerView != null)
            {
                return mRecyclerView.removeCallbacks(runnable);
            } else
            {
                return false;
            }
        }

        public void removeDetachedView(View view)
        {
            mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view)
        {
            mChildHelper.b(view);
        }

        public void removeViewAt(int i1)
        {
            if (getChildAt(i1) != null)
            {
                mChildHelper.a(i1);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag)
        {
            int k2 = getPaddingLeft();
            int l1 = getPaddingTop();
            int l2 = getWidth() - getPaddingRight();
            int j2 = getHeight();
            int k3 = getPaddingBottom();
            int i3 = view.getLeft() + rect.left;
            int i2 = view.getTop() + rect.top;
            int j3 = i3 + rect.width();
            int l3 = rect.height();
            int i1 = Math.min(0, i3 - k2);
            int j1 = Math.min(0, i2 - l1);
            int k1 = Math.max(0, j3 - l2);
            j2 = Math.max(0, (i2 + l3) - (j2 - k3));
            if (getLayoutDirection() == 1)
            {
                if (k1 != 0)
                {
                    i1 = k1;
                } else
                {
                    i1 = Math.max(i1, j3 - l2);
                }
            } else
            if (i1 == 0)
            {
                i1 = Math.min(i3 - k2, k1);
            }
            if (j1 == 0)
            {
                j1 = Math.min(i2 - l1, j2);
            }
            if (i1 != 0 || j1 != 0)
            {
                if (flag)
                {
                    recyclerview.scrollBy(i1, j1);
                } else
                {
                    recyclerview.smoothScrollBy(i1, j1);
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

        public int scrollHorizontallyBy(int i1, o o1, s s1)
        {
            return 0;
        }

        public void scrollToPosition(int i1)
        {
        }

        public int scrollVerticallyBy(int i1, o o1, s s1)
        {
            return 0;
        }

        public void setMeasuredDimension(int i1, int j1)
        {
            mRecyclerView.setMeasuredDimension(i1, j1);
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

        public void smoothScrollToPosition(RecyclerView recyclerview, s s1, int i1)
        {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(r r1)
        {
            if (mSmoothScroller != null && r1 != mSmoothScroller && mSmoothScroller.e())
            {
                mSmoothScroller.c();
            }
            mSmoothScroller = r1;
            mSmoothScroller.a(mRecyclerView, this);
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
                mSmoothScroller.c();
            }
        }

        public boolean supportsPredictiveItemAnimations()
        {
            return false;
        }



/*
        static boolean access$1902(i i1, boolean flag)
        {
            i1.mRequestedSimpleAnimations = flag;
            return flag;
        }

*/


        public i()
        {
            mRequestedSimpleAnimations = false;
            mIsAttachedToWindow = false;
        }
    }

    public static final class i.a
    {

        public int a;
        public int b;
        public boolean c;
        public boolean d;

        public i.a()
        {
        }
    }

    public static class j extends android.view.ViewGroup.MarginLayoutParams
    {

        v a;
        final Rect b;
        boolean c;
        boolean d;

        public j(int i1)
        {
            super(i1, -2);
            b = new Rect();
            c = true;
            d = false;
        }

        public j(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = new Rect();
            c = true;
            d = false;
        }

        public j(j j1)
        {
            super(j1);
            b = new Rect();
            c = true;
            d = false;
        }

        public j(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public j(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = new Rect();
            c = true;
            d = false;
        }
    }

    public static interface k
    {
    }

    public static interface l
    {

        public abstract boolean a();
    }

    public static abstract class m
    {

        public void onScrollStateChanged(RecyclerView recyclerview, int i1)
        {
        }

        public void onScrolled(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public m()
        {
        }
    }

    public static final class n
    {

        private SparseArray a;
        private SparseIntArray b;
        private int c;

        public final v a(int i1)
        {
            ArrayList arraylist = (ArrayList)a.get(i1);
            if (arraylist != null && !arraylist.isEmpty())
            {
                i1 = arraylist.size() - 1;
                v v1 = (v)arraylist.get(i1);
                arraylist.remove(i1);
                return v1;
            } else
            {
                return null;
            }
        }

        final void a()
        {
            c = c + 1;
        }

        public final void a(int i1, int j1)
        {
            b.put(i1, j1);
            ArrayList arraylist = (ArrayList)a.get(i1);
            if (arraylist != null)
            {
                for (; arraylist.size() > j1; arraylist.remove(arraylist.size() - 1)) { }
            }
        }

        final void a(a a1, a a2, boolean flag)
        {
            if (a1 != null)
            {
                b();
            }
            if (!flag && c == 0)
            {
                a.clear();
            }
            if (a2 != null)
            {
                a();
            }
        }

        public final void a(v v1)
        {
            int i1 = v1.getItemViewType();
            ArrayList arraylist = (ArrayList)a.get(i1);
            if (arraylist == null)
            {
                ArrayList arraylist1 = new ArrayList();
                a.put(i1, arraylist1);
                arraylist = arraylist1;
                if (b.indexOfKey(i1) < 0)
                {
                    b.put(i1, 5);
                    arraylist = arraylist1;
                }
            }
            if (b.get(i1) <= arraylist.size())
            {
                return;
            } else
            {
                v1.resetInternal();
                arraylist.add(v1);
                return;
            }
        }

        final void b()
        {
            c = c - 1;
        }

        public n()
        {
            a = new SparseArray();
            b = new SparseIntArray();
            c = 0;
        }
    }

    public final class o
    {

        final ArrayList a = new ArrayList();
        final ArrayList b = new ArrayList();
        final RecyclerView c;
        private ArrayList d;
        private final List e;
        private int f;
        private n g;
        private t h;

        private v a(long l1, int i1)
        {
            for (int j1 = a.size() - 1; j1 >= 0; j1--)
            {
                v v1 = (v)a.get(j1);
                if (v1.getItemId() != l1 || v1.wasReturnedFromScrap())
                {
                    continue;
                }
                if (i1 == v1.getItemViewType())
                {
                    v1.addFlags(32);
                    if (v1.isRemoved() && !c.mState.a())
                    {
                        v1.setFlags(2, 14);
                    }
                    return v1;
                }
                a.remove(j1);
                c.removeDetachedView(v1.itemView, false);
                b(v1.itemView);
            }

            for (int k1 = b.size() - 1; k1 >= 0; k1--)
            {
                v v2 = (v)b.get(k1);
                if (v2.getItemId() != l1)
                {
                    continue;
                }
                if (i1 == v2.getItemViewType())
                {
                    b.remove(k1);
                    return v2;
                }
                d(k1);
            }

            return null;
        }

        static ArrayList a(o o1)
        {
            return o1.d;
        }

        private void a(ViewGroup viewgroup, boolean flag)
        {
            for (int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
            {
                View view = viewgroup.getChildAt(i1);
                if (view instanceof ViewGroup)
                {
                    a((ViewGroup)view, true);
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
                int j1 = viewgroup.getVisibility();
                viewgroup.setVisibility(4);
                viewgroup.setVisibility(j1);
                return;
            }
        }

        private void c(v v1)
        {
            x.a(v1.itemView, null);
            if (c.mRecyclerListener != null)
            {
                p _tmp = c.mRecyclerListener;
            }
            if (c.mAdapter != null)
            {
                c.mAdapter.onViewRecycled(v1);
            }
            if (c.mState != null)
            {
                c.mState.a(v1);
            }
            v1.mOwnerRecyclerView = null;
            d().a(v1);
        }

        private v e(int i1)
        {
            int k1;
label0:
            {
                if (d != null)
                {
                    k1 = d.size();
                    if (k1 != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int j1 = 0; j1 < k1; j1++)
            {
                v v1 = (v)d.get(j1);
                if (!v1.wasReturnedFromScrap() && v1.getLayoutPosition() == i1)
                {
                    v1.addFlags(32);
                    return v1;
                }
            }

            if (c.mAdapter.hasStableIds())
            {
                i1 = c.mAdapterHelper.a(i1, 0);
                if (i1 > 0 && i1 < c.mAdapter.getItemCount())
                {
                    long l1 = c.mAdapter.getItemId(i1);
                    for (i1 = 0; i1 < k1; i1++)
                    {
                        v v2 = (v)d.get(i1);
                        if (!v2.wasReturnedFromScrap() && v2.getItemId() == l1)
                        {
                            v2.addFlags(32);
                            return v2;
                        }
                    }

                }
            }
            return null;
        }

        private v f(int i1)
        {
            android.support.v7.widget.e e1;
            int k1;
            int l1;
            l1 = a.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                v v1 = (v)a.get(j1);
                if (!v1.wasReturnedFromScrap() && v1.getLayoutPosition() == i1 && !v1.isInvalid() && (s.e(c.mState) || !v1.isRemoved()))
                {
                    v1.addFlags(32);
                    return v1;
                }
            }

            e1 = c.mChildHelper;
            l1 = e1.c.size();
            k1 = 0;
_L7:
            if (k1 >= l1) goto _L2; else goto _L1
_L1:
            Object obj;
            v v2;
            obj = (View)e1.c.get(k1);
            v2 = e1.a.b(((View) (obj)));
            if (v2.getLayoutPosition() != i1 || v2.isInvalid()) goto _L4; else goto _L3
_L3:
            if (obj != null)
            {
                c.mItemAnimator.c(c.getChildViewHolder(((View) (obj))));
            }
            l1 = b.size();
            k1 = 0;
_L5:
            if (k1 >= l1)
            {
                break MISSING_BLOCK_LABEL_268;
            }
            obj = (v)b.get(k1);
            if (!((v) (obj)).isInvalid() && ((v) (obj)).getLayoutPosition() == i1)
            {
                b.remove(k1);
                return ((v) (obj));
            }
            break MISSING_BLOCK_LABEL_259;
_L4:
            k1++;
            continue; /* Loop/switch isn't completed */
_L2:
            obj = null;
              goto _L3
            k1++;
              goto _L5
            return null;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void a()
        {
            a.clear();
            c();
        }

        public final void a(int i1)
        {
            f = i1;
            for (int j1 = b.size() - 1; j1 >= 0 && b.size() > i1; j1--)
            {
                d(j1);
            }

        }

        final void a(n n1)
        {
            if (g != null)
            {
                g.b();
            }
            g = n1;
            if (n1 != null)
            {
                n1 = g;
                c.getAdapter();
                n1.a();
            }
        }

        final void a(t t1)
        {
            h = t1;
        }

        final void a(v v1)
        {
label0:
            {
                boolean flag4 = true;
                if (v1.isScrap() || v1.itemView.getParent() != null)
                {
                    StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(v1.isScrap()).append(" isAttached:");
                    if (v1.itemView.getParent() == null)
                    {
                        flag4 = false;
                    }
                    throw new IllegalArgumentException(stringbuilder.append(flag4).toString());
                }
                if (v1.isTmpDetached())
                {
                    throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(v1).toString());
                }
                if (v1.shouldIgnore())
                {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                }
                flag4 = v1.doesTransientStatePreventRecycling();
                boolean flag;
                int i1;
                boolean flag1;
                boolean flag2;
                boolean flag3;
                if (c.mAdapter != null && flag4 && c.mAdapter.onFailedToRecycleView(v1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = 0;
                flag3 = false;
                flag2 = false;
                if (!flag)
                {
                    flag1 = flag2;
                    if (!v1.isRecyclable())
                    {
                        break label0;
                    }
                }
                flag = flag3;
                if (!v1.hasAnyOfTheFlags(78))
                {
                    i1 = b.size();
                    if (i1 == f && i1 > 0)
                    {
                        d(0);
                    }
                    flag = flag3;
                    if (i1 < f)
                    {
                        b.add(v1);
                        flag = true;
                    }
                }
                i1 = ((flag) ? 1 : 0);
                flag1 = flag2;
                if (!flag)
                {
                    c(v1);
                    flag1 = true;
                    i1 = ((flag) ? 1 : 0);
                }
            }
            c.mState.a(v1);
            if (i1 == 0 && !flag1 && flag4)
            {
                v1.mOwnerRecyclerView = null;
            }
        }

        public final void a(View view)
        {
            v v1;
            v1 = RecyclerView.getChildViewHolderInt(view);
            if (v1.isTmpDetached())
            {
                c.removeDetachedView(view, false);
            }
            if (!v1.isScrap()) goto _L2; else goto _L1
_L1:
            v1.unScrap();
_L4:
            a(v1);
            return;
_L2:
            if (v1.wasReturnedFromScrap())
            {
                v1.clearReturnedFromScrapFlag();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final int b(int i1)
        {
            if (i1 < 0 || i1 >= c.mState.e())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i1).append(". State item count is ").append(c.mState.e()).toString());
            }
            if (!c.mState.a())
            {
                return i1;
            } else
            {
                return c.mAdapterHelper.a(i1);
            }
        }

        public final List b()
        {
            return e;
        }

        final void b(v v1)
        {
            if (!v1.isChanged() || !c.supportsChangeAnimations() || d == null)
            {
                a.remove(v1);
            } else
            {
                d.remove(v1);
            }
            v1.mScrapContainer = null;
            v1.clearReturnedFromScrapFlag();
        }

        final void b(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.mScrapContainer = null;
            view.clearReturnedFromScrapFlag();
            a(view);
        }

        public final View c(int i1)
        {
            boolean flag1 = true;
            if (i1 < 0 || i1 >= c.mState.e())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i1).append("(").append(i1).append("). Item count:").append(c.mState.e()).toString());
            }
            Object obj;
            v v1;
            v v2;
            int j1;
            boolean flag;
            int k1;
            int l1;
            int i2;
            if (c.mState.a())
            {
                v1 = e(i1);
                if (v1 != null)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
            } else
            {
                v1 = null;
                j1 = 0;
            }
            obj = v1;
            if (v1 != null) goto _L2; else goto _L1
_L1:
            v1 = f(i1);
            obj = v1;
            if (v1 == null) goto _L2; else goto _L3
_L3:
            if (v1.isRemoved()) goto _L5; else goto _L4
_L4:
            if (v1.mPosition < 0 || v1.mPosition >= c.mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(v1).toString());
            }
            if (c.mState.a() || c.mAdapter.getItemViewType(v1.mPosition) == v1.getItemViewType()) goto _L7; else goto _L6
_L6:
            flag = false;
_L15:
            if (!flag)
            {
                v1.addFlags(4);
                if (v1.isScrap())
                {
                    c.removeDetachedView(v1.itemView, false);
                    v1.unScrap();
                } else
                if (v1.wasReturnedFromScrap())
                {
                    v1.clearReturnedFromScrapFlag();
                }
                a(v1);
                obj = null;
            } else
            {
                j1 = 1;
                obj = v1;
            }
_L2:
            v2 = ((v) (obj));
            l1 = j1;
            if (obj != null) goto _L9; else goto _L8
_L8:
            l1 = c.mAdapterHelper.a(i1);
            if (l1 < 0 || l1 >= c.mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i1).append("(offset:").append(l1).append(").state:").append(c.mState.e()).toString());
            }
            i2 = c.mAdapter.getItemViewType(l1);
            flag = j1;
            if (c.mAdapter.hasStableIds())
            {
                v1 = a(c.mAdapter.getItemId(l1), i2);
                obj = v1;
                flag = j1;
                if (v1 != null)
                {
                    v1.mPosition = l1;
                    flag = true;
                    obj = v1;
                }
            }
            if (obj == null && h != null)
            {
                h.a(i2);
            }
            v1 = ((v) (obj));
            if (obj == null)
            {
                v1 = d().a(i2);
                if (v1 != null)
                {
                    v1.resetInternal();
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST && (v1.itemView instanceof ViewGroup))
                    {
                        a((ViewGroup)v1.itemView, false);
                    }
                }
            }
            v2 = v1;
            l1 = ((flag) ? 1 : 0);
              goto _L10
_L7:
            if (c.mAdapter.hasStableIds() && v1.getItemId() != c.mAdapter.getItemId(v1.mPosition))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = true;
            continue; /* Loop/switch isn't completed */
_L10:
            if (v1 != null) goto _L9; else goto _L11
_L11:
            v1 = c.mAdapter.createViewHolder(c, i2);
            j1 = ((flag) ? 1 : 0);
_L13:
            if (c.mState.a() && v1.isBound())
            {
                v1.mPreLayoutPosition = i1;
                i1 = 0;
            } else
            if (!v1.isBound() || v1.needsUpdate() || v1.isInvalid())
            {
                k1 = c.mAdapterHelper.a(i1);
                v1.mOwnerRecyclerView = c;
                c.mAdapter.bindViewHolder(v1, k1);
                obj = v1.itemView;
                if (c.isAccessibilityEnabled())
                {
                    if (x.e(((View) (obj))) == 0)
                    {
                        x.c(((View) (obj)), 1);
                    }
                    if (!x.b(((View) (obj))))
                    {
                        x.a(((View) (obj)), c.mAccessibilityDelegate.c);
                    }
                }
                if (c.mState.a())
                {
                    v1.mPreLayoutPosition = i1;
                }
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            obj = v1.itemView.getLayoutParams();
            if (obj == null)
            {
                obj = (j)c.generateDefaultLayoutParams();
                v1.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!c.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (j)c.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                v1.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (j)obj;
            }
            obj.a = v1;
            if (j1 == 0 || i1 == 0)
            {
                flag1 = false;
            }
            obj.d = flag1;
            return v1.itemView;
_L9:
            j1 = l1;
            v1 = v2;
            if (true) goto _L13; else goto _L12
_L12:
            if (true) goto _L15; else goto _L14
_L14:
        }

        final void c()
        {
            for (int i1 = b.size() - 1; i1 >= 0; i1--)
            {
                d(i1);
            }

            b.clear();
        }

        final void c(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.setScrapContainer(this);
            if (!view.isChanged() || !c.supportsChangeAnimations())
            {
                if (view.isInvalid() && !view.isRemoved() && !c.mAdapter.hasStableIds())
                {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                } else
                {
                    a.add(view);
                    return;
                }
            }
            if (d == null)
            {
                d = new ArrayList();
            }
            d.add(view);
        }

        final n d()
        {
            if (g == null)
            {
                g = new n();
            }
            return g;
        }

        final void d(int i1)
        {
            c((v)b.get(i1));
            b.remove(i1);
        }

        final void e()
        {
            int l1 = b.size();
            for (int i1 = 0; i1 < l1; i1++)
            {
                ((v)b.get(i1)).clearOldPosition();
            }

            l1 = a.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                ((v)a.get(j1)).clearOldPosition();
            }

            if (d != null)
            {
                int i2 = d.size();
                for (int k1 = 0; k1 < i2; k1++)
                {
                    ((v)d.get(k1)).clearOldPosition();
                }

            }
        }

        public o()
        {
            c = RecyclerView.this;
            super();
            d = null;
            e = Collections.unmodifiableList(a);
            f = 2;
        }
    }

    public static interface p
    {
    }

    private final class q extends c
    {

        final RecyclerView a;

        private void a()
        {
            if (a.mPostUpdatesOnAnimation && a.mHasFixedSize && a.mIsAttached)
            {
                x.a(a, a.mUpdateChildViewsRunnable);
                return;
            } else
            {
                a.mAdapterUpdateDuringMeasure = true;
                a.requestLayout();
                return;
            }
        }

        public final void onChanged()
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapter.hasStableIds())
            {
                android.support.v7.widget.s.a(a.mState, true);
                a.setDataSetChangedAfterLayout();
            } else
            {
                android.support.v7.widget.s.a(a.mState, true);
                a.setDataSetChangedAfterLayout();
            }
            if (!a.mAdapterHelper.d())
            {
                a.requestLayout();
            }
        }

        public final void onItemRangeChanged(int i1, int j1, Object obj)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.a(i1, j1, obj))
            {
                a();
            }
        }

        public final void onItemRangeInserted(int i1, int j1)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.b(i1, j1))
            {
                a();
            }
        }

        public final void onItemRangeMoved(int i1, int j1, int k1)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.a(i1, j1, k1))
            {
                a();
            }
        }

        public final void onItemRangeRemoved(int i1, int j1)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.c(i1, j1))
            {
                a();
            }
        }

        private q()
        {
            a = RecyclerView.this;
            super();
        }

        q(byte byte0)
        {
            this();
        }
    }

    public static abstract class r
    {

        private int a;
        private RecyclerView b;
        private i c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a();

        static void a(r r1, int i1, int j1)
        {
label0:
            {
                RecyclerView recyclerview = r1.b;
                if (!r1.e || r1.a == -1 || recyclerview == null)
                {
                    r1.c();
                }
                r1.d = false;
                if (r1.f != null)
                {
                    if (r1.b(r1.f) == r1.a)
                    {
                        View view = r1.f;
                        s s2 = recyclerview.mState;
                        r1.a(view, r1.g);
                        android.support.v7.widget.a.a(r1.g, recyclerview);
                        r1.c();
                    } else
                    {
                        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                        r1.f = null;
                    }
                }
                if (r1.e)
                {
                    s s1 = recyclerview.mState;
                    r1.a(i1, j1, r1.g);
                    boolean flag = r1.g.a();
                    android.support.v7.widget.a.a(r1.g, recyclerview);
                    if (flag)
                    {
                        if (!r1.e)
                        {
                            break label0;
                        }
                        r1.d = true;
                        recyclerview.mViewFlinger.a();
                    }
                }
                return;
            }
            r1.c();
        }

        private int b(View view)
        {
            return b.getChildLayoutPosition(view);
        }

        protected abstract void a();

        protected abstract void a(int i1, int j1, a a1);

        final void a(RecyclerView recyclerview, i i1)
        {
            b = recyclerview;
            c = i1;
            if (a == -1)
            {
                throw new IllegalArgumentException("Invalid target position");
            } else
            {
                s.c(b.mState, a);
                e = true;
                d = true;
                int j1 = a;
                f = b.mLayout.findViewByPosition(j1);
                b.mViewFlinger.a();
                return;
            }
        }

        protected final void a(View view)
        {
            if (b(view) == a)
            {
                f = view;
            }
        }

        protected abstract void a(View view, a a1);

        public final i b()
        {
            return c;
        }

        public final void b(int i1)
        {
            a = i1;
        }

        protected final void c()
        {
            if (!e)
            {
                return;
            } else
            {
                a();
                s.c(b.mState, -1);
                f = null;
                a = -1;
                d = false;
                e = false;
                c.onSmoothScrollerStopped(this);
                c = null;
                b = null;
                return;
            }
        }

        public final boolean d()
        {
            return d;
        }

        public final boolean e()
        {
            return e;
        }

        public final int f()
        {
            return a;
        }

        public final int g()
        {
            return b.mLayout.getChildCount();
        }

        public r()
        {
            a = -1;
        }
    }

    public static final class r.a
    {

        private int a;
        private int b;
        private int c;
        private int d;
        private Interpolator e;
        private boolean f;
        private int g;

        static void a(r.a a1, RecyclerView recyclerview)
        {
            if (a1.d >= 0)
            {
                int i1 = a1.d;
                a1.d = -1;
                recyclerview.jumpToPositionForSmoothScroller(i1);
                a1.f = false;
                return;
            }
            if (a1.f)
            {
                if (a1.e != null && a1.c <= 0)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (a1.c <= 0)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                if (a1.e == null)
                {
                    if (a1.c == 0x80000000)
                    {
                        recyclerview.mViewFlinger.b(a1.a, a1.b);
                    } else
                    {
                        recyclerview.mViewFlinger.a(a1.a, a1.b, a1.c);
                    }
                } else
                {
                    recyclerview.mViewFlinger.a(a1.a, a1.b, a1.c, a1.e);
                }
                a1.g = a1.g + 1;
                if (a1.g > 10)
                {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                a1.f = false;
                return;
            } else
            {
                a1.g = 0;
                return;
            }
        }

        public final void a(int i1)
        {
            d = i1;
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            a = i1;
            b = j1;
            c = k1;
            e = interpolator;
            f = true;
        }

        final boolean a()
        {
            return d >= 0;
        }

        public r.a()
        {
            this((byte)0);
        }

        private r.a(byte byte0)
        {
            d = -1;
            f = false;
            g = 0;
            a = 0;
            b = 0;
            c = 0x80000000;
            e = null;
        }
    }

    public static final class s
    {

        android.support.v4.util.a a;
        android.support.v4.util.a b;
        android.support.v4.util.a c;
        final List d = new ArrayList();
        int e;
        private int f;
        private SparseArray g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        static int a(s s1, int i1)
        {
            i1 = s1.i + i1;
            s1.i = i1;
            return i1;
        }

        static boolean a(s s1)
        {
            return s1.m;
        }

        static boolean a(s s1, boolean flag)
        {
            s1.j = flag;
            return flag;
        }

        static int b(s s1, int i1)
        {
            s1.h = i1;
            return i1;
        }

        static boolean b(s s1)
        {
            return s1.l;
        }

        static boolean b(s s1, boolean flag)
        {
            s1.k = flag;
            return flag;
        }

        static int c(s s1, int i1)
        {
            s1.f = i1;
            return i1;
        }

        static boolean c(s s1)
        {
            return s1.j;
        }

        static boolean c(s s1, boolean flag)
        {
            s1.l = flag;
            return flag;
        }

        static int d(s s1)
        {
            s1.i = 0;
            return 0;
        }

        static boolean d(s s1, boolean flag)
        {
            s1.m = flag;
            return flag;
        }

        static boolean e(s s1)
        {
            return s1.k;
        }

        final void a(v v1)
        {
            a.remove(v1);
            b.remove(v1);
            if (c == null) goto _L2; else goto _L1
_L1:
            android.support.v4.util.a a1;
            int i1;
            a1 = c;
            i1 = a1.size() - 1;
_L7:
            if (i1 < 0) goto _L2; else goto _L3
_L3:
            if (v1 != a1.c(i1)) goto _L5; else goto _L4
_L4:
            a1.d(i1);
_L2:
            d.remove(v1.itemView);
            return;
_L5:
            i1--;
            if (true) goto _L7; else goto _L6
_L6:
        }

        final void a(View view)
        {
            d.remove(view);
        }

        public final boolean a()
        {
            return k;
        }

        final void b(View view)
        {
            if (!d.contains(view))
            {
                d.add(view);
            }
        }

        public final boolean b()
        {
            return m;
        }

        public final int c()
        {
            return f;
        }

        public final boolean d()
        {
            return f != -1;
        }

        public final int e()
        {
            if (k)
            {
                return h - i;
            } else
            {
                return e;
            }
        }

        public final String toString()
        {
            return (new StringBuilder("State{mTargetPosition=")).append(f).append(", mPreLayoutHolderMap=").append(a).append(", mPostLayoutHolderMap=").append(b).append(", mData=").append(g).append(", mItemCount=").append(e).append(", mPreviousLayoutItemCount=").append(h).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(i).append(", mStructureChanged=").append(j).append(", mInPreLayout=").append(k).append(", mRunSimpleAnimations=").append(l).append(", mRunPredictiveAnimations=").append(m).append('}').toString();
        }

        public s()
        {
            f = -1;
            a = new android.support.v4.util.a();
            b = new android.support.v4.util.a();
            c = new android.support.v4.util.a();
            e = 0;
            h = 0;
            i = 0;
            j = false;
            k = false;
            l = false;
            m = false;
        }
    }

    public static abstract class t
    {

        public abstract View a(int i1);

        public t()
        {
        }
    }

    private final class u
        implements Runnable
    {

        final RecyclerView a;
        private int b;
        private int c;
        private android.support.v4.widget.p d;
        private Interpolator e;
        private boolean f;
        private boolean g;

        final void a()
        {
            if (f)
            {
                g = true;
                return;
            } else
            {
                a.removeCallbacks(this);
                x.a(a, this);
                return;
            }
        }

        public final void a(int i1, int j1)
        {
            a.setScrollState(2);
            c = 0;
            b = 0;
            d.a(0, i1, j1, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
            a();
        }

        public final void a(int i1, int j1, int k1)
        {
            a(i1, j1, k1, RecyclerView.sQuinticInterpolator);
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            if (e != interpolator)
            {
                e = interpolator;
                d = android.support.v4.widget.p.a(a.getContext(), interpolator);
            }
            a.setScrollState(2);
            c = 0;
            b = 0;
            d.a(0, 0, i1, j1, k1);
            a();
        }

        public final void b()
        {
            a.removeCallbacks(this);
            d.h();
        }

        public final void b(int i1, int j1)
        {
            int i2 = Math.abs(i1);
            int j2 = Math.abs(j1);
            float f1;
            float f2;
            float f3;
            int k1;
            boolean flag;
            int k2;
            int l2;
            int i3;
            if (i2 > j2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k2 = (int)Math.sqrt(0.0D);
            l2 = (int)Math.sqrt(i1 * i1 + j1 * j1);
            if (flag)
            {
                k1 = a.getWidth();
            } else
            {
                k1 = a.getHeight();
            }
            i3 = k1 / 2;
            f3 = Math.min(1.0F, ((float)l2 * 1.0F) / (float)k1);
            f1 = i3;
            f2 = i3;
            f3 = (float)Math.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
            if (k2 > 0)
            {
                k1 = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k2)) * 4;
            } else
            {
                int l1;
                if (flag)
                {
                    l1 = i2;
                } else
                {
                    l1 = j2;
                }
                k1 = (int)(((float)l1 / (float)k1 + 1.0F) * 300F);
            }
            a(i1, j1, Math.min(k1, 2000));
        }

        public final void run()
        {
            g = false;
            f = true;
            a.consumePendingUpdateOperations();
            android.support.v4.widget.p p1 = d;
            r r1 = a.mLayout.mSmoothScroller;
            if (p1.g())
            {
                int k3 = p1.b();
                int l3 = p1.c();
                int i3 = k3 - b;
                int j3 = l3 - c;
                int i2 = 0;
                int i1 = 0;
                int l2 = 0;
                int l1 = 0;
                b = k3;
                c = l3;
                int j2 = 0;
                int j1 = 0;
                int k2 = 0;
                int k1 = 0;
                if (a.mAdapter != null)
                {
                    a.eatRequestLayout();
                    a.onEnterLayoutOrScroll();
                    android.support.v4.os.d.a("RV Scroll");
                    if (i3 != 0)
                    {
                        i1 = a.mLayout.scrollHorizontallyBy(i3, a.mRecycler, a.mState);
                        j1 = i3 - i1;
                    }
                    if (j3 != 0)
                    {
                        l1 = a.mLayout.scrollVerticallyBy(j3, a.mRecycler, a.mState);
                        k1 = j3 - l1;
                    }
                    android.support.v4.os.d.a();
                    if (a.supportsChangeAnimations())
                    {
                        j2 = a.mChildHelper.a();
                        for (i2 = 0; i2 < j2; i2++)
                        {
                            View view = a.mChildHelper.b(i2);
                            Object obj = a.getChildViewHolder(view);
                            if (obj == null || ((v) (obj)).mShadowingHolder == null)
                            {
                                continue;
                            }
                            obj = ((v) (obj)).mShadowingHolder.itemView;
                            k2 = view.getLeft();
                            l2 = view.getTop();
                            if (k2 != ((View) (obj)).getLeft() || l2 != ((View) (obj)).getTop())
                            {
                                ((View) (obj)).layout(k2, l2, ((View) (obj)).getWidth() + k2, ((View) (obj)).getHeight() + l2);
                            }
                        }

                    }
                    a.onExitLayoutOrScroll();
                    a.resumeRequestLayout(false);
                    i2 = i1;
                    j2 = j1;
                    k2 = k1;
                    l2 = l1;
                    if (r1 != null)
                    {
                        i2 = i1;
                        j2 = j1;
                        k2 = k1;
                        l2 = l1;
                        if (!r1.d())
                        {
                            i2 = i1;
                            j2 = j1;
                            k2 = k1;
                            l2 = l1;
                            if (r1.e())
                            {
                                i2 = a.mState.e();
                                if (i2 == 0)
                                {
                                    r1.c();
                                    l2 = l1;
                                    k2 = k1;
                                    j2 = j1;
                                    i2 = i1;
                                } else
                                {
                                    if (r1.f() >= i2)
                                    {
                                        r1.b(i2 - 1);
                                    }
                                    android.support.v7.widget.r.a(r1, i3 - j1, j3 - k1);
                                    i2 = i1;
                                    j2 = j1;
                                    k2 = k1;
                                    l2 = l1;
                                }
                            }
                        }
                    }
                }
                if (!a.mItemDecorations.isEmpty())
                {
                    a.invalidate();
                }
                if (x.a(a) != 2)
                {
                    a.considerReleasingGlowsOnScroll(i3, j3);
                }
                if (j2 != 0 || k2 != 0)
                {
                    k1 = (int)p1.f();
                    i1 = 0;
                    if (j2 != k3)
                    {
                        if (j2 < 0)
                        {
                            i1 = -k1;
                        } else
                        if (j2 > 0)
                        {
                            i1 = k1;
                        } else
                        {
                            i1 = 0;
                        }
                    }
                    j1 = 0;
                    if (k2 != l3)
                    {
                        if (k2 < 0)
                        {
                            j1 = -k1;
                        } else
                        if (k2 > 0)
                        {
                            j1 = k1;
                        } else
                        {
                            j1 = 0;
                        }
                    }
                    if (x.a(a) != 2)
                    {
                        a.absorbGlows(i1, j1);
                    }
                    if ((i1 != 0 || j2 == k3 || p1.d() == 0) && (j1 != 0 || k2 == l3 || p1.e() == 0))
                    {
                        p1.h();
                    }
                }
                if (i2 != 0 || l2 != 0)
                {
                    a.dispatchOnScrolled(i2, l2);
                }
                if (!a.awakenScrollBars())
                {
                    a.invalidate();
                }
                if (j3 != 0 && a.mLayout.canScrollVertically() && l2 == j3)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i3 != 0 && a.mLayout.canScrollHorizontally() && i2 == i3)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (i3 == 0 && j3 == 0 || j1 != 0 || i1 != 0)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (p1.a() || i1 == 0)
                {
                    a.setScrollState(0);
                } else
                {
                    a();
                }
            }
            if (r1 != null)
            {
                if (r1.d())
                {
                    android.support.v7.widget.r.a(r1, 0, 0);
                }
                if (!g)
                {
                    r1.c();
                }
            }
            f = false;
            if (g)
            {
                a();
            }
        }

        public u()
        {
            a = RecyclerView.this;
            super();
            e = RecyclerView.sQuinticInterpolator;
            f = false;
            g = false;
            d = android.support.v4.widget.p.a(getContext(), RecyclerView.sQuinticInterpolator);
        }
    }

    public static abstract class v
    {

        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_BOUND = 1;
        static final int FLAG_CHANGED = 64;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS;
        public final View itemView;
        private int mFlags;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        int mPosition;
        int mPreLayoutPosition;
        private o mScrapContainer;
        v mShadowedHolder;
        v mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        private void createPayloadsIfNeeded()
        {
            if (mPayloads == null)
            {
                mPayloads = new ArrayList();
                mUnmodifiedPayloads = Collections.unmodifiableList(mPayloads);
            }
        }

        private boolean doesTransientStatePreventRecycling()
        {
            return (mFlags & 0x10) == 0 && x.c(itemView);
        }

        private void onEnteredHiddenState()
        {
            mWasImportantForAccessibilityBeforeHidden = x.e(itemView);
            x.c(itemView, 4);
        }

        private void onLeftHiddenState()
        {
            x.c(itemView, mWasImportantForAccessibilityBeforeHidden);
            mWasImportantForAccessibilityBeforeHidden = 0;
        }

        private boolean shouldBeKeptAsChild()
        {
            return (mFlags & 0x10) != 0;
        }

        void addChangePayload(Object obj)
        {
            if (obj == null)
            {
                addFlags(1024);
            } else
            if ((mFlags & 0x400) == 0)
            {
                createPayloadsIfNeeded();
                mPayloads.add(obj);
                return;
            }
        }

        void addFlags(int i1)
        {
            mFlags = mFlags | i1;
        }

        void clearOldPosition()
        {
            mOldPosition = -1;
            mPreLayoutPosition = -1;
        }

        void clearPayload()
        {
            if (mPayloads != null)
            {
                mPayloads.clear();
            }
            mFlags = mFlags & 0xfffffbff;
        }

        void clearReturnedFromScrapFlag()
        {
            mFlags = mFlags & 0xffffffdf;
        }

        void clearTmpDetachFlag()
        {
            mFlags = mFlags & 0xfffffeff;
        }

        void flagRemovedAndOffsetPosition(int i1, int j1, boolean flag)
        {
            addFlags(8);
            offsetPosition(j1, flag);
            mPosition = i1;
        }

        public final int getAdapterPosition()
        {
            if (mOwnerRecyclerView == null)
            {
                return -1;
            } else
            {
                return mOwnerRecyclerView.getAdapterPositionFor(this);
            }
        }

        public final long getItemId()
        {
            return mItemId;
        }

        public final int getItemViewType()
        {
            return mItemViewType;
        }

        public final int getLayoutPosition()
        {
            if (mPreLayoutPosition == -1)
            {
                return mPosition;
            } else
            {
                return mPreLayoutPosition;
            }
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

        List getUnmodifiedPayloads()
        {
            if ((mFlags & 0x400) == 0)
            {
                if (mPayloads == null || mPayloads.size() == 0)
                {
                    return FULLUPDATE_PAYLOADS;
                } else
                {
                    return mUnmodifiedPayloads;
                }
            } else
            {
                return FULLUPDATE_PAYLOADS;
            }
        }

        boolean hasAnyOfTheFlags(int i1)
        {
            return (mFlags & i1) != 0;
        }

        boolean isAdapterPositionUnknown()
        {
            return (mFlags & 0x200) != 0 || isInvalid();
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
            return (mFlags & 0x10) == 0 && !x.c(itemView);
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

        void offsetPosition(int i1, boolean flag)
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
                mPreLayoutPosition = mPreLayoutPosition + i1;
            }
            mPosition = mPosition + i1;
            if (itemView.getLayoutParams() != null)
            {
                ((j)itemView.getLayoutParams()).c = true;
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
            clearPayload();
            mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void saveOldPosition()
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
        }

        void setFlags(int i1, int j1)
        {
            mFlags = mFlags & ~j1 | i1 & j1;
        }

        public final void setIsRecyclable(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = mIsRecyclableCount - 1;
            } else
            {
                i1 = mIsRecyclableCount + 1;
            }
            mIsRecyclableCount = i1;
            if (mIsRecyclableCount < 0)
            {
                mIsRecyclableCount = 0;
                Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
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

        void setScrapContainer(o o1)
        {
            mScrapContainer = o1;
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
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
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
                stringbuilder.append((new StringBuilder(" not recyclable(")).append(mIsRecyclableCount).append(")").toString());
            }
            if (isAdapterPositionUnknown())
            {
                stringbuilder.append("undefined adapter position");
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
            mScrapContainer.b(this);
        }

        boolean wasReturnedFromScrap()
        {
            return (mFlags & 0x20) != 0;
        }

        static 
        {
            FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        }





/*
        static o access$4202(v v1, o o1)
        {
            v1.mScrapContainer = o1;
            return o1;
        }

*/



        public v(View view)
        {
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mItemViewType = -1;
            mPreLayoutPosition = -1;
            mShadowedHolder = null;
            mShadowingHolder = null;
            mPayloads = null;
            mUnmodifiedPayloads = null;
            mIsRecyclableCount = 0;
            mScrapContainer = null;
            mWasImportantForAccessibilityBeforeHidden = 0;
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
    private static final Class LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE[];
    private static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    private static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    private static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    private static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int VERTICAL = 1;
    private static final Interpolator sQuinticInterpolator = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * f1 * f1 * f1 * f1 + 1.0F;
        }

    };
    private android.support.v7.widget.m mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private l mActiveOnItemTouchListener;
    private a mAdapter;
    android.support.v7.widget.a mAdapterHelper;
    private boolean mAdapterUpdateDuringMeasure;
    private android.support.v4.widget.i mBottomGlow;
    private d mChildDrawingOrderCallback;
    android.support.v7.widget.e mChildHelper;
    private boolean mClipToPadding;
    private boolean mDataSetHasChangedAfterLayout;
    private boolean mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    private boolean mFirstLayoutComplete;
    private boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mIsAttached;
    e mItemAnimator;
    private e.a mItemAnimatorListener;
    private Runnable mItemAnimatorRunner = new Runnable() {

        final RecyclerView a;

        public final void run()
        {
            if (a.mItemAnimator != null)
            {
                a.mItemAnimator.a();
            }
            a.mPostedAnimatorRunner = false;
        }

            
            {
                a = RecyclerView.this;
                super();
            }
    };
    private final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    private i mLayout;
    private boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    private boolean mLayoutRequestEaten;
    private android.support.v4.widget.i mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mMinMaxLayoutPositions[];
    private final int mNestedOffsets[];
    private final q mObserver;
    private List mOnChildAttachStateListeners;
    private final ArrayList mOnItemTouchListeners;
    private SavedState mPendingSavedState;
    private final boolean mPostUpdatesOnAnimation;
    private boolean mPostedAnimatorRunner;
    final o mRecycler;
    private p mRecyclerListener;
    private android.support.v4.widget.i mRightGlow;
    private final int mScrollConsumed[];
    private float mScrollFactor;
    private m mScrollListener;
    private List mScrollListeners;
    private final int mScrollOffset[];
    private int mScrollPointerId;
    private int mScrollState;
    private final android.support.v4.view.o mScrollingChildHelper;
    final s mState;
    private final Rect mTempRect;
    private android.support.v4.widget.i mTopGlow;
    private int mTouchSlop;
    private final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    private final u mViewFlinger;

    public RecyclerView(Context context)
    {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        mObserver = new q((byte)0);
        mRecycler = new o();
        mUpdateChildViewsRunnable = new Runnable() {

            final RecyclerView a;

            public final void run()
            {
                if (a.mFirstLayoutComplete)
                {
                    if (a.mDataSetHasChangedAfterLayout)
                    {
                        android.support.v4.os.d.a("RV FullInvalidate");
                        a.dispatchLayout();
                        android.support.v4.os.d.a();
                        return;
                    }
                    if (a.mAdapterHelper.d())
                    {
                        android.support.v4.os.d.a("RV PartialInvalidate");
                        a.eatRequestLayout();
                        a.mAdapterHelper.b();
                        if (!a.mLayoutRequestEaten)
                        {
                            a.rebindUpdatedViewHolders();
                        }
                        a.resumeRequestLayout(true);
                        android.support.v4.os.d.a();
                        return;
                    }
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
        mTempRect = new Rect();
        mItemDecorations = new ArrayList();
        mOnItemTouchListeners = new ArrayList();
        mDataSetHasChangedAfterLayout = false;
        mLayoutOrScrollCounter = 0;
        mItemAnimator = new android.support.v7.widget.f();
        mScrollState = 0;
        mScrollPointerId = -1;
        mScrollFactor = 1.401298E-45F;
        mViewFlinger = new u();
        mState = new s();
        mItemsAddedOrRemoved = false;
        mItemsChanged = false;
        mItemAnimatorListener = new f((byte)0);
        mPostedAnimatorRunner = false;
        mMinMaxLayoutPositions = new int[2];
        mScrollOffset = new int[2];
        mScrollConsumed = new int[2];
        mNestedOffsets = new int[2];
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewconfiguration;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPostUpdatesOnAnimation = flag;
        viewconfiguration = ViewConfiguration.get(context);
        mTouchSlop = viewconfiguration.getScaledTouchSlop();
        mMinFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
        mMaxFlingVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        if (x.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        mItemAnimator.a(mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        if (x.e(this) == 0)
        {
            x.c(this, 1);
        }
        mAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new android.support.v7.widget.m(this));
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.a.a.RecyclerView, i1, 0);
            String s1 = typedarray.getString(android.support.v7.recyclerview.a.a.RecyclerView_layoutManager);
            typedarray.recycle();
            createLayoutManager(context, s1, attributeset, i1, 0);
        }
        mScrollingChildHelper = new android.support.v4.view.o(this);
        setNestedScrollingEnabled(true);
    }

    private void addAnimatingView(v v1)
    {
        View view = v1.itemView;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRecycler.b(getChildViewHolder(view));
        if (v1.isTmpDetached())
        {
            mChildHelper.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            mChildHelper.a(view);
            return;
        } else
        {
            mChildHelper.e(view);
            return;
        }
    }

    private void animateAppearance(v v1, Rect rect, int i1, int j1)
    {
        View view = v1.itemView;
        if (rect != null && (rect.left != i1 || rect.top != j1))
        {
            v1.setIsRecyclable(false);
            if (mItemAnimator.a(v1, rect.left, rect.top, i1, j1))
            {
                postAnimationRunner();
            }
            return;
        } else
        {
            v1.setIsRecyclable(false);
            mItemAnimator.b(v1);
            postAnimationRunner();
            return;
        }
    }

    private void animateChange(v v1, v v2)
    {
        v1.setIsRecyclable(false);
        addAnimatingView(v1);
        v1.mShadowedHolder = v2;
        mRecycler.b(v1);
        int k1 = v1.itemView.getLeft();
        int l1 = v1.itemView.getTop();
        int i1;
        int j1;
        if (v2 == null || v2.shouldIgnore())
        {
            i1 = k1;
            j1 = l1;
        } else
        {
            i1 = v2.itemView.getLeft();
            j1 = v2.itemView.getTop();
            v2.setIsRecyclable(false);
            v2.mShadowingHolder = v1;
        }
        mItemAnimator.a(v1, v2, k1, l1, i1, j1);
        postAnimationRunner();
    }

    private void animateDisappearance(h h1)
    {
        View view = h1.a.itemView;
        addAnimatingView(h1.a);
        int i1 = h1.b;
        int j1 = h1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!h1.a.isRemoved() && (i1 != k1 || j1 != l1))
        {
            h1.a.setIsRecyclable(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (mItemAnimator.a(h1.a, i1, j1, k1, l1))
            {
                postAnimationRunner();
            }
            return;
        } else
        {
            h1.a.setIsRecyclable(false);
            mItemAnimator.a(h1.a);
            postAnimationRunner();
            return;
        }
    }

    private void cancelTouch()
    {
        resetTouch();
        setScrollState(0);
    }

    private void considerReleasingGlowsOnScroll(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mLeftGlow != null)
        {
            flag = flag1;
            if (!mLeftGlow.a())
            {
                flag = flag1;
                if (i1 > 0)
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
                if (i1 < 0)
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
                if (j1 > 0)
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
                if (j1 < 0)
                {
                    flag1 = flag | mBottomGlow.c();
                }
            }
        }
        if (flag1)
        {
            x.d(this);
        }
    }

    private void consumePendingUpdateOperations()
    {
        mUpdateChildViewsRunnable.run();
    }

    private void createLayoutManager(Context context, String s1, AttributeSet attributeset, int i1, int j1)
    {
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.trim();
        if (s1.length() == 0) goto _L2; else goto _L3
_L3:
        String s2 = getFullClassName(context, s1);
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        s1 = getClass().getClassLoader();
_L8:
        Class class1 = s1.loadClass(s2).asSubclass(android/support/v7/widget/RecyclerView$i);
        s1 = null;
        Constructor constructor = class1.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
        s1 = ((String) (new Object[] {
            context, attributeset, Integer.valueOf(i1), Integer.valueOf(j1)
        }));
        context = constructor;
_L6:
        NoSuchMethodException nosuchmethodexception;
        try
        {
            context.setAccessible(true);
            setLayoutManager((i)context.newInstance(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(s2).toString(), context);
        }
_L5:
        s1 = context.getClassLoader();
        continue; /* Loop/switch isn't completed */
        nosuchmethodexception;
        context = class1.getConstructor(new Class[0]);
          goto _L6
        context;
        context.initCause(nosuchmethodexception);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(s2).toString(), context);
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void defaultOnMeasure(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = x.q(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = x.r(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                return;
            }
        }
    }

    private boolean didChildRangeChange(int i1, int j1)
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = mChildHelper.a();
        if (l1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (i1 == 0)
            {
                flag = flag1;
                if (j1 == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        int k1 = 0;
        do
        {
            flag = flag1;
            if (k1 >= l1)
            {
                continue;
            }
            v v1 = getChildViewHolderInt(mChildHelper.b(k1));
            if (!v1.shouldIgnore())
            {
                int i2 = v1.getLayoutPosition();
                if (i2 < i1 || i2 > j1)
                {
                    return true;
                }
            }
            k1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void dispatchChildAttached(View view)
    {
        v v1 = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (mAdapter != null && v1 != null)
        {
            mAdapter.onViewAttachedToWindow(v1);
        }
        if (mOnChildAttachStateListeners != null)
        {
            for (int i1 = mOnChildAttachStateListeners.size() - 1; i1 >= 0; i1--)
            {
                mOnChildAttachStateListeners.get(i1);
            }

        }
    }

    private void dispatchChildDetached(View view)
    {
        v v1 = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (mAdapter != null && v1 != null)
        {
            mAdapter.onViewDetachedFromWindow(v1);
        }
        if (mOnChildAttachStateListeners != null)
        {
            for (int i1 = mOnChildAttachStateListeners.size() - 1; i1 >= 0; i1--)
            {
                mOnChildAttachStateListeners.get(i1);
            }

        }
    }

    private void dispatchContentChangedIfNecessary()
    {
        int i1 = mEatenAccessibilityChangeFlags;
        mEatenAccessibilityChangeFlags = 0;
        if (i1 != 0 && isAccessibilityEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
            accessibilityevent.setEventType(2048);
            android.support.v4.view.accessibility.a.a(accessibilityevent, i1);
            sendAccessibilityEventUnchecked(accessibilityevent);
        }
    }

    private boolean dispatchOnItemTouch(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (mActiveOnItemTouchListener == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        mActiveOnItemTouchListener = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = mOnItemTouchListeners.size();
        i1 = 0;
_L11:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        motionevent = (l)mOnItemTouchListeners.get(i1);
        if (!motionevent.a()) goto _L8; else goto _L7
_L7:
        mActiveOnItemTouchListener = motionevent;
_L10:
        return true;
_L4:
        if (i1 != 3 && i1 != 1) goto _L10; else goto _L9
_L9:
        mActiveOnItemTouchListener = null;
        return true;
_L8:
        i1++;
        if (true) goto _L11; else goto _L6
_L6:
        return false;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionevent)
    {
        int j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            mActiveOnItemTouchListener = null;
        }
        int k1 = mOnItemTouchListeners.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            motionevent = (l)mOnItemTouchListeners.get(i1);
            if (motionevent.a() && j1 != 3)
            {
                mActiveOnItemTouchListener = motionevent;
                return true;
            }
        }

        return false;
    }

    private void findMinMaxChildLayoutPositions(int ai[])
    {
        int l2 = mChildHelper.a();
        if (l2 == 0)
        {
            ai[0] = 0;
            ai[1] = 0;
            return;
        }
        int i1 = 0x7fffffff;
        int l1 = 0x80000000;
        for (int k1 = 0; k1 < l2;)
        {
            v v1 = getChildViewHolderInt(mChildHelper.b(k1));
            int k2 = l1;
            int i2 = i1;
            if (!v1.shouldIgnore())
            {
                int j2 = v1.getLayoutPosition();
                int j1 = i1;
                if (j2 < i1)
                {
                    j1 = j2;
                }
                k2 = l1;
                i2 = j1;
                if (j2 > l1)
                {
                    i2 = j1;
                    k2 = j2;
                }
            }
            k1++;
            l1 = k2;
            i1 = i2;
        }

        ai[0] = i1;
        ai[1] = l1;
    }

    private int getAdapterPositionFor(v v1)
    {
        if (!v1.hasAnyOfTheFlags(524) && v1.isBound()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        android.support.v7.widget.a a1;
        int j1;
        int l1;
        int i2;
        a1 = mAdapterHelper;
        j1 = v1.mPosition;
        i2 = a1.a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        v1 = (a.b)a1.a.get(l1);
        i1 = j1;
        ((a.b) (v1)).a;
        JVM INSTR tableswitch 0 3: default 104
    //                   0 119
    //                   1 142
    //                   2 107
    //                   3 181;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_181;
_L8:
        break; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
_L11:
        l1++;
        j1 = i1;
          goto _L10
_L6:
        i1 = j1;
        if (((a.b) (v1)).b <= j1)
        {
            i1 = j1 + ((a.b) (v1)).d;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((a.b) (v1)).b <= j1)
        {
            if (((a.b) (v1)).b + ((a.b) (v1)).d > j1)
            {
                return -1;
            }
            i1 = j1 - ((a.b) (v1)).d;
        }
          goto _L11
        if (((a.b) (v1)).b == j1)
        {
            i1 = ((a.b) (v1)).d;
        } else
        {
            int k1 = j1;
            if (((a.b) (v1)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((a.b) (v1)).d <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
    }

    static v getChildViewHolderInt(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((j)view.getLayoutParams()).a;
        }
    }

    private String getFullClassName(Context context, String s1)
    {
        if (s1.charAt(0) == '.')
        {
            context = (new StringBuilder()).append(context.getPackageName()).append(s1).toString();
        } else
        {
            context = s1;
            if (!s1.contains("."))
            {
                return (new StringBuilder()).append(android/support/v7/widget/RecyclerView.getPackage().getName()).append('.').append(s1).toString();
            }
        }
        return context;
    }

    private float getScrollFactor()
    {
label0:
        {
            if (mScrollFactor == 1.401298E-45F)
            {
                TypedValue typedvalue = new TypedValue();
                if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                {
                    break label0;
                }
                mScrollFactor = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
            }
            return mScrollFactor;
        }
        return 0.0F;
    }

    private void initChildrenHelper()
    {
        mChildHelper = new android.support.v7.widget.e(new e.b() {

            final RecyclerView a;

            public final int a()
            {
                return a.getChildCount();
            }

            public final int a(View view)
            {
                return a.indexOfChild(view);
            }

            public final void a(int i1)
            {
                View view = a.getChildAt(i1);
                if (view != null)
                {
                    a.dispatchChildDetached(view);
                }
                a.removeViewAt(i1);
            }

            public final void a(View view, int i1)
            {
                a.addView(view, i1);
                a.dispatchChildAttached(view);
            }

            public final void a(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
            {
                v v1 = RecyclerView.getChildViewHolderInt(view);
                if (v1 != null)
                {
                    if (!v1.isTmpDetached() && !v1.shouldIgnore())
                    {
                        throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(v1).toString());
                    }
                    v1.clearTmpDetachFlag();
                }
                a.attachViewToParent(view, i1, layoutparams);
            }

            public final v b(View view)
            {
                return RecyclerView.getChildViewHolderInt(view);
            }

            public final View b(int i1)
            {
                return a.getChildAt(i1);
            }

            public final void b()
            {
                int j1 = a.getChildCount();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a.dispatchChildDetached(b(i1));
                }

                a.removeAllViews();
            }

            public final void c(int i1)
            {
                Object obj = b(i1);
                if (obj != null)
                {
                    obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
                    if (obj != null)
                    {
                        if (((v) (obj)).isTmpDetached() && !((v) (obj)).shouldIgnore())
                        {
                            throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                        }
                        ((v) (obj)).addFlags(256);
                    }
                }
                a.detachViewFromParent(i1);
            }

            public final void c(View view)
            {
                view = RecyclerView.getChildViewHolderInt(view);
                if (view != null)
                {
                    view.onEnteredHiddenState();
                }
            }

            public final void d(View view)
            {
                view = RecyclerView.getChildViewHolderInt(view);
                if (view != null)
                {
                    view.onLeftHiddenState();
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
    }

    private void jumpToPositionForSmoothScroller(int i1)
    {
        if (mLayout == null)
        {
            return;
        } else
        {
            mLayout.scrollToPosition(i1);
            awakenScrollBars();
            return;
        }
    }

    private void onEnterLayoutOrScroll()
    {
        mLayoutOrScrollCounter = mLayoutOrScrollCounter + 1;
    }

    private void onExitLayoutOrScroll()
    {
        mLayoutOrScrollCounter = mLayoutOrScrollCounter - 1;
        if (mLayoutOrScrollCounter <= 0)
        {
            mLayoutOrScrollCounter = 0;
            dispatchContentChangedIfNecessary();
        }
    }

    private void onPointerUp(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.b(motionevent);
        if (android.support.v4.view.m.b(motionevent, i1) == mScrollPointerId)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            mScrollPointerId = android.support.v4.view.m.b(motionevent, i1);
            j1 = (int)(android.support.v4.view.m.c(motionevent, i1) + 0.5F);
            mLastTouchX = j1;
            mInitialTouchX = j1;
            i1 = (int)(android.support.v4.view.m.d(motionevent, i1) + 0.5F);
            mLastTouchY = i1;
            mInitialTouchY = i1;
        }
    }

    private void postAnimationRunner()
    {
        if (!mPostedAnimatorRunner && mIsAttached)
        {
            x.a(this, mItemAnimatorRunner);
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
            mAdapterHelper.a();
            markKnownViewsInvalid();
            mLayout.onItemsChanged(this);
        }
        s s1;
        boolean flag;
        boolean flag1;
        if (mItemAnimator != null && mLayout.supportsPredictiveItemAnimations())
        {
            mAdapterHelper.b();
        } else
        {
            mAdapterHelper.e();
        }
        if (mItemsAddedOrRemoved && !mItemsChanged || mItemsAddedOrRemoved || mItemsChanged && supportsChangeAnimations())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = mState;
        if (mFirstLayoutComplete && mItemAnimator != null && (mDataSetHasChangedAfterLayout || flag || mLayout.mRequestedSimpleAnimations) && (!mDataSetHasChangedAfterLayout || mAdapter.hasStableIds()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s.c(s1, flag1);
        s1 = mState;
        if (s.b(mState) && flag && !mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        android.support.v7.widget.s.d(s1, flag1);
    }

    private void processDisappearingList(android.support.v4.util.a a1)
    {
        List list = mState.d;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            v v1 = getChildViewHolderInt(view);
            h h1 = (h)mState.a.remove(v1);
            if (!mState.a())
            {
                mState.b.remove(v1);
            }
            if (a1.remove(view) != null)
            {
                mLayout.removeAndRecycleView(view, mRecycler);
            } else
            if (h1 != null)
            {
                animateDisappearance(h1);
            } else
            {
                animateDisappearance(new h(v1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
    }

    private void pullGlows(float f1, float f2, float f3, float f4)
    {
        boolean flag1 = false;
        boolean flag;
        if (f2 < 0.0F)
        {
            ensureLeftGlow();
            flag = flag1;
            if (mLeftGlow.a(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
            {
                flag = true;
            }
        } else
        {
            flag = flag1;
            if (f2 > 0.0F)
            {
                ensureRightGlow();
                flag = flag1;
                if (mRightGlow.a(f2 / (float)getWidth(), f3 / (float)getHeight()))
                {
                    flag = true;
                }
            }
        }
        if (f4 < 0.0F)
        {
            ensureTopGlow();
            flag1 = flag;
            if (mTopGlow.a(-f4 / (float)getHeight(), f1 / (float)getWidth()))
            {
                flag1 = true;
            }
        } else
        {
            flag1 = flag;
            if (f4 > 0.0F)
            {
                ensureBottomGlow();
                flag1 = flag;
                if (mBottomGlow.a(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                {
                    flag1 = true;
                }
            }
        }
        if (flag1 || f2 != 0.0F || f4 != 0.0F)
        {
            x.d(this);
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
            x.d(this);
        }
    }

    private boolean removeAnimatingView(View view)
    {
        eatRequestLayout();
        boolean flag = mChildHelper.f(view);
        if (flag)
        {
            view = getChildViewHolderInt(view);
            mRecycler.b(view);
            mRecycler.a(view);
        }
        resumeRequestLayout(false);
        return flag;
    }

    private void resetTouch()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.clear();
        }
        stopNestedScroll();
        releaseGlows();
    }

    private void setAdapterInternal(a a1, boolean flag, boolean flag1)
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
                mItemAnimator.c();
            }
            if (mLayout != null)
            {
                mLayout.removeAndRecycleAllViews(mRecycler);
                mLayout.removeAndRecycleScrapInt(mRecycler);
            }
            mRecycler.a();
        }
        mAdapterHelper.a();
        a a2 = mAdapter;
        mAdapter = a1;
        if (a1 != null)
        {
            a1.registerAdapterDataObserver(mObserver);
            a1.onAttachedToRecyclerView(this);
        }
        if (mLayout != null)
        {
            mLayout.onAdapterChanged(a2, mAdapter);
        }
        a1 = mRecycler;
        a a3 = mAdapter;
        a1.a();
        a1.d().a(a2, a3, flag);
        android.support.v7.widget.s.a(mState, true);
        markKnownViewsInvalid();
    }

    private void setDataSetChangedAfterLayout()
    {
        if (!mDataSetHasChangedAfterLayout)
        {
            mDataSetHasChangedAfterLayout = true;
            int k1 = mChildHelper.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                v v1 = getChildViewHolderInt(mChildHelper.c(i1));
                if (v1 != null && !v1.shouldIgnore())
                {
                    v1.addFlags(512);
                }
            }

            o o1 = mRecycler;
            k1 = o1.b.size();
            int j1 = 0;
            while (j1 < k1) 
            {
                v v2 = (v)o1.b.get(j1);
                if (v2 != null)
                {
                    v2.addFlags(512);
                }
                j1++;
            }
        }
    }

    private void setScrollState(int i1)
    {
        if (i1 == mScrollState)
        {
            return;
        }
        mScrollState = i1;
        if (i1 != 2)
        {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i1);
    }

    private void stopScrollersInternal()
    {
        mViewFlinger.b();
        if (mLayout != null)
        {
            mLayout.stopSmoothScroller();
        }
    }

    private boolean supportsChangeAnimations()
    {
        return mItemAnimator != null && mItemAnimator.h();
    }

    void absorbGlows(int i1, int j1)
    {
        if (i1 < 0)
        {
            ensureLeftGlow();
            mLeftGlow.a(-i1);
        } else
        if (i1 > 0)
        {
            ensureRightGlow();
            mRightGlow.a(i1);
        }
        if (j1 < 0)
        {
            ensureTopGlow();
            mTopGlow.a(-j1);
        } else
        if (j1 > 0)
        {
            ensureBottomGlow();
            mBottomGlow.a(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            x.d(this);
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        if (mLayout == null || !mLayout.onAddFocusables(this, arraylist, i1, j1))
        {
            super.addFocusables(arraylist, i1, j1);
        }
    }

    public void addItemDecoration(g g1)
    {
        addItemDecoration(g1, -1);
    }

    public void addItemDecoration(g g1, int i1)
    {
        if (mLayout != null)
        {
            mLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (mItemDecorations.isEmpty())
        {
            setWillNotDraw(false);
        }
        if (i1 < 0)
        {
            mItemDecorations.add(g1);
        } else
        {
            mItemDecorations.add(i1, g1);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(k k1)
    {
        if (mOnChildAttachStateListeners == null)
        {
            mOnChildAttachStateListeners = new ArrayList();
        }
        mOnChildAttachStateListeners.add(k1);
    }

    public void addOnItemTouchListener(l l1)
    {
        mOnItemTouchListeners.add(l1);
    }

    public void addOnScrollListener(m m1)
    {
        if (mScrollListeners == null)
        {
            mScrollListeners = new ArrayList();
        }
        mScrollListeners.add(m1);
    }

    void assertInLayoutOrScroll(String s1)
    {
        if (!isComputingLayout())
        {
            if (s1 == null)
            {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s1);
            }
        } else
        {
            return;
        }
    }

    void assertNotInLayoutOrScroll(String s1)
    {
        if (isComputingLayout())
        {
            if (s1 == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s1);
            }
        } else
        {
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof j) && mLayout.checkLayoutParams((j)layoutparams);
    }

    void clearOldPositions()
    {
        int j1 = mChildHelper.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(i1));
            if (!v1.shouldIgnore())
            {
                v1.clearOldPosition();
            }
        }

        mRecycler.e();
    }

    public void clearOnChildAttachStateChangeListeners()
    {
        if (mOnChildAttachStateListeners != null)
        {
            mOnChildAttachStateListeners.clear();
        }
    }

    public void clearOnScrollListeners()
    {
        if (mScrollListeners != null)
        {
            mScrollListeners.clear();
        }
    }

    public int computeHorizontalScrollExtent()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollExtent(mState);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollOffset(mState);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (mLayout.canScrollHorizontally())
        {
            return mLayout.computeHorizontalScrollRange(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (mLayout.canScrollVertically())
        {
            return mLayout.computeVerticalScrollExtent(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (mLayout.canScrollVertically())
        {
            return mLayout.computeVerticalScrollOffset(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
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
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L12:
        return;
_L2:
        Object obj;
        if (mLayout == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        mState.d.clear();
        eatRequestLayout();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        s s1 = mState;
        if (s.b(mState) && mItemsChanged && supportsChangeAnimations())
        {
            obj = new android.support.v4.util.a();
        } else
        {
            obj = null;
        }
        s1.c = ((android.support.v4.util.a) (obj));
        mItemsChanged = false;
        mItemsAddedOrRemoved = false;
        obj = null;
        s.b(mState, android.support.v7.widget.s.a(mState));
        mState.e = mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(mMinMaxLayoutPositions);
        if (s.b(mState))
        {
            mState.a.clear();
            mState.b.clear();
            int k2 = mChildHelper.a();
            for (int i1 = 0; i1 < k2; i1++)
            {
                v v1 = getChildViewHolderInt(mChildHelper.b(i1));
                if (!v1.shouldIgnore() && (!v1.isInvalid() || mAdapter.hasStableIds()))
                {
                    View view = v1.itemView;
                    mState.a.put(v1, new h(v1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                }
            }

        }
        if (!android.support.v7.widget.s.a(mState)) goto _L4; else goto _L3
_L3:
        Object obj1;
        int k1;
        saveOldPositions();
        if (mState.c != null)
        {
            int l2 = mChildHelper.a();
            for (int j1 = 0; j1 < l2; j1++)
            {
                obj = getChildViewHolderInt(mChildHelper.b(j1));
                if (((v) (obj)).isChanged() && !((v) (obj)).isRemoved() && !((v) (obj)).shouldIgnore())
                {
                    long l4 = getChangedHolderKey(((v) (obj)));
                    mState.c.put(Long.valueOf(l4), obj);
                    mState.a.remove(obj);
                }
            }

        }
        boolean flag2 = s.c(mState);
        android.support.v7.widget.s.a(mState, false);
        mLayout.onLayoutChildren(mRecycler, mState);
        android.support.v7.widget.s.a(mState, flag2);
        obj1 = new android.support.v4.util.a();
        k1 = 0;
_L7:
        boolean flag1;
        if (k1 >= mChildHelper.a())
        {
            break MISSING_BLOCK_LABEL_600;
        }
        flag1 = false;
        obj = mChildHelper.b(k1);
        if (getChildViewHolderInt(((View) (obj))).shouldIgnore()) goto _L6; else goto _L5
_L5:
        int i3 = 0;
_L8:
        boolean flag = flag1;
        if (i3 < mState.a.size())
        {
            if (((v)mState.a.b(i3)).itemView != obj)
            {
                break MISSING_BLOCK_LABEL_591;
            }
            flag = true;
        }
        if (!flag)
        {
            ((android.support.v4.util.a) (obj1)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L6:
        k1++;
          goto _L7
        i3++;
          goto _L8
        clearOldPositions();
        mAdapterHelper.c();
_L10:
        mState.e = mAdapter.getItemCount();
        android.support.v7.widget.s.d(mState);
        s.b(mState, false);
        mLayout.onLayoutChildren(mRecycler, mState);
        android.support.v7.widget.s.a(mState, false);
        mPendingSavedState = null;
        obj = mState;
        int l1;
        int j3;
        boolean flag3;
        if (s.b(mState) && mItemAnimator != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s.c(((s) (obj)), flag3);
        if (!s.b(mState))
        {
            break MISSING_BLOCK_LABEL_1560;
        }
        if (mState.c != null)
        {
            obj = new android.support.v4.util.a();
        } else
        {
            obj = null;
        }
        j3 = mChildHelper.a();
        l1 = 0;
        while (l1 < j3) 
        {
            v v4 = getChildViewHolderInt(mChildHelper.b(l1));
            if (!v4.shouldIgnore())
            {
                View view2 = v4.itemView;
                long l5 = getChangedHolderKey(v4);
                int k3;
                if (obj != null && mState.c.get(Long.valueOf(l5)) != null)
                {
                    ((android.support.v4.util.a) (obj)).put(Long.valueOf(l5), v4);
                } else
                {
                    mState.b.put(v4, new h(v4, view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()));
                }
            }
            l1++;
        }
        break; /* Loop/switch isn't completed */
_L4:
        clearOldPositions();
        mAdapterHelper.e();
        obj1 = obj;
        if (mState.c != null)
        {
            k3 = mChildHelper.a();
            l1 = 0;
            do
            {
                obj1 = obj;
                if (l1 >= k3)
                {
                    break;
                }
                obj1 = getChildViewHolderInt(mChildHelper.b(l1));
                if (((v) (obj1)).isChanged() && !((v) (obj1)).isRemoved() && !((v) (obj1)).shouldIgnore())
                {
                    l5 = getChangedHolderKey(((v) (obj1)));
                    mState.c.put(Long.valueOf(l5), obj1);
                    mState.a.remove(obj1);
                }
                l1++;
            } while (true);
        }
        if (true) goto _L10; else goto _L9
_L9:
        processDisappearingList(((android.support.v4.util.a) (obj1)));
        for (int i2 = mState.a.size() - 1; i2 >= 0; i2--)
        {
            v v5 = (v)mState.a.b(i2);
            if (!mState.b.containsKey(v5))
            {
                h h1 = (h)mState.a.c(i2);
                mState.a.d(i2);
                View view3 = h1.a.itemView;
                mRecycler.b(h1.a);
                animateDisappearance(h1);
            }
        }

        int j2 = mState.b.size();
        if (j2 > 0)
        {
            j2--;
            while (j2 >= 0) 
            {
                v v6 = (v)mState.b.b(j2);
                h h4 = (h)mState.b.c(j2);
                if (mState.a.isEmpty() || !mState.a.containsKey(v6))
                {
                    mState.b.d(j2);
                    Rect rect;
                    if (obj1 != null)
                    {
                        rect = (Rect)((android.support.v4.util.a) (obj1)).get(v6.itemView);
                    } else
                    {
                        rect = null;
                    }
                    animateAppearance(v6, rect, h4.b, h4.c);
                }
                j2--;
            }
        }
        int l3 = mState.b.size();
        for (j2 = 0; j2 < l3; j2++)
        {
            v v2 = (v)mState.b.b(j2);
            h h2 = (h)mState.b.c(j2);
            h h3 = (h)mState.a.get(v2);
            if (h3 == null || h2 == null || h3.b == h2.b && h3.c == h2.c)
            {
                continue;
            }
            v2.setIsRecyclable(false);
            if (mItemAnimator.a(v2, h3.b, h3.c, h2.b, h2.c))
            {
                postAnimationRunner();
            }
        }

        if (mState.c != null)
        {
            j2 = mState.c.size();
        } else
        {
            j2 = 0;
        }
        for (j2--; j2 >= 0; j2--)
        {
            long l6 = ((Long)mState.c.b(j2)).longValue();
            v v3 = (v)mState.c.get(Long.valueOf(l6));
            View view1 = v3.itemView;
            if (!v3.shouldIgnore() && android.support.v7.widget.o.a(mRecycler) != null && android.support.v7.widget.o.a(mRecycler).contains(v3))
            {
                animateChange(v3, (v)((android.support.v4.util.a) (obj)).get(Long.valueOf(l6)));
            }
        }

        resumeRequestLayout(false);
        mLayout.removeAndRecycleScrapInt(mRecycler);
        s.b(mState, mState.e);
        mDataSetHasChangedAfterLayout = false;
        s.c(mState, false);
        android.support.v7.widget.s.d(mState, false);
        onExitLayoutOrScroll();
        mLayout.mRequestedSimpleAnimations = false;
        if (android.support.v7.widget.o.a(mRecycler) != null)
        {
            android.support.v7.widget.o.a(mRecycler).clear();
        }
        mState.c = null;
        if (didChildRangeChange(mMinMaxLayoutPositions[0], mMinMaxLayoutPositions[1]))
        {
            dispatchOnScrolled(0, 0);
            return;
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return mScrollingChildHelper.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return mScrollingChildHelper.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
    {
        return mScrollingChildHelper.a(i1, j1, ai, ai1);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
    {
        return mScrollingChildHelper.a(i1, j1, k1, l1, ai);
    }

    void dispatchOnScrollStateChanged(int i1)
    {
        if (mLayout != null)
        {
            mLayout.onScrollStateChanged(i1);
        }
        onScrollStateChanged(i1);
        if (mScrollListener != null)
        {
            mScrollListener.onScrollStateChanged(this, i1);
        }
        if (mScrollListeners != null)
        {
            for (int j1 = mScrollListeners.size() - 1; j1 >= 0; j1--)
            {
                ((m)mScrollListeners.get(j1)).onScrollStateChanged(this, i1);
            }

        }
    }

    void dispatchOnScrolled(int i1, int j1)
    {
        int k1 = getScrollX();
        int i2 = getScrollY();
        onScrollChanged(k1, i2, k1, i2);
        onScrolled(i1, j1);
        if (mScrollListener != null)
        {
            mScrollListener.onScrolled(this, i1, j1);
        }
        if (mScrollListeners != null)
        {
            for (int l1 = mScrollListeners.size() - 1; l1 >= 0; l1--)
            {
                ((m)mScrollListeners.get(l1)).onScrolled(this, i1, j1);
            }

        }
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        super.draw(canvas);
        int k1 = mItemDecorations.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((g)mItemDecorations.get(i1)).onDrawOver(canvas, this, mState);
        }

        int j1 = 0;
        k1 = j1;
        if (mLeftGlow != null)
        {
            k1 = j1;
            if (!mLeftGlow.a())
            {
                int l1 = canvas.save();
                int i2;
                if (mClipToPadding)
                {
                    j1 = getPaddingBottom();
                } else
                {
                    j1 = 0;
                }
                canvas.rotate(270F);
                canvas.translate(-getHeight() + j1, 0.0F);
                if (mLeftGlow != null && mLeftGlow.a(canvas))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                canvas.restoreToCount(l1);
            }
        }
        j1 = k1;
        if (mTopGlow != null)
        {
            j1 = k1;
            if (!mTopGlow.a())
            {
                l1 = canvas.save();
                if (mClipToPadding)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (mTopGlow != null && mTopGlow.a(canvas))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        k1 = j1;
        if (mRightGlow != null)
        {
            k1 = j1;
            if (!mRightGlow.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (mClipToPadding)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (mRightGlow != null && mRightGlow.a(canvas))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                k1 = j1 | k1;
                canvas.restoreToCount(l1);
            }
        }
        j1 = k1;
        if (mBottomGlow != null)
        {
            j1 = k1;
            if (!mBottomGlow.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (mClipToPadding)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                if (mBottomGlow != null && mBottomGlow.a(canvas))
                {
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    j1 = 0;
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        k1 = j1;
        if (j1 == 0)
        {
            k1 = j1;
            if (mItemAnimator != null)
            {
                k1 = j1;
                if (mItemDecorations.size() > 0)
                {
                    k1 = j1;
                    if (mItemAnimator.b())
                    {
                        k1 = 1;
                    }
                }
            }
        }
        if (k1 != 0)
        {
            x.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    void eatRequestLayout()
    {
        if (!mEatRequestLayout)
        {
            mEatRequestLayout = true;
            if (!mLayoutFrozen)
            {
                mLayoutRequestEaten = false;
            }
        }
    }

    void ensureBottomGlow()
    {
        if (mBottomGlow != null)
        {
            return;
        }
        mBottomGlow = new android.support.v4.widget.i(getContext());
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
        mLeftGlow = new android.support.v4.widget.i(getContext());
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
        mRightGlow = new android.support.v4.widget.i(getContext());
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
        mTopGlow = new android.support.v4.widget.i(getContext());
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

    public View findChildViewUnder(float f1, float f2)
    {
        for (int i1 = mChildHelper.a() - 1; i1 >= 0; i1--)
        {
            View view = mChildHelper.b(i1);
            float f3 = x.o(view);
            float f4 = x.p(view);
            if (f1 >= (float)view.getLeft() + f3 && f1 <= (float)view.getRight() + f3 && f2 >= (float)view.getTop() + f4 && f2 <= (float)view.getBottom() + f4)
            {
                return view;
            }
        }

        return null;
    }

    public v findViewHolderForAdapterPosition(int i1)
    {
        if (!mDataSetHasChangedAfterLayout) goto _L2; else goto _L1
_L1:
        v v1 = null;
_L6:
        return v1;
_L2:
        int j1;
        int k1;
        k1 = mChildHelper.b();
        j1 = 0;
_L7:
        if (j1 >= k1) goto _L4; else goto _L3
_L3:
        v v2;
        v2 = getChildViewHolderInt(mChildHelper.c(j1));
        if (v2 == null || v2.isRemoved())
        {
            continue; /* Loop/switch isn't completed */
        }
        v1 = v2;
        if (getAdapterPositionFor(v2) == i1) goto _L6; else goto _L5
_L5:
        j1++;
          goto _L7
_L4:
        return null;
    }

    public v findViewHolderForItemId(long l1)
    {
        int j1 = mChildHelper.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(i1));
            if (v1 != null && v1.getItemId() == l1)
            {
                return v1;
            }
        }

        return null;
    }

    public v findViewHolderForLayoutPosition(int i1)
    {
        return findViewHolderForPosition(i1, false);
    }

    public v findViewHolderForPosition(int i1)
    {
        return findViewHolderForPosition(i1, false);
    }

    v findViewHolderForPosition(int i1, boolean flag)
    {
        int k1 = mChildHelper.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(j1));
            if (v1 != null && !v1.isRemoved() && (flag ? v1.mPosition == i1 : v1.getLayoutPosition() == i1))
            {
                return v1;
            }
        }

        return null;
    }

    public boolean fling(int i1, int j1)
    {
        if (mLayout != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L4:
        return false;
_L2:
        int k1;
        boolean flag;
        boolean flag1;
label0:
        {
            if (mLayoutFrozen)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = mLayout.canScrollHorizontally();
            flag1 = mLayout.canScrollVertically();
            if (flag)
            {
                k1 = i1;
                if (Math.abs(i1) >= mMinFlingVelocity)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        if (flag1)
        {
            i1 = j1;
            if (Math.abs(j1) >= mMinFlingVelocity)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        if (k1 == 0 && i1 == 0 || dispatchNestedPreFling(k1, i1)) goto _L4; else goto _L3
_L3:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(k1, i1, flag);
        if (flag)
        {
            j1 = Math.max(-mMaxFlingVelocity, Math.min(k1, mMaxFlingVelocity));
            i1 = Math.max(-mMaxFlingVelocity, Math.min(i1, mMaxFlingVelocity));
            mViewFlinger.a(j1, i1);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public View focusSearch(View view, int i1)
    {
        View view1 = mLayout.onInterceptFocusSearch(view, i1);
        if (view1 != null)
        {
            return view1;
        }
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (mAdapter != null)
            {
                view1 = view2;
                if (mLayout != null)
                {
                    view1 = view2;
                    if (!isComputingLayout())
                    {
                        view1 = view2;
                        if (!mLayoutFrozen)
                        {
                            eatRequestLayout();
                            view1 = mLayout.onFocusSearchFailed(view, i1, mRecycler, mState);
                            resumeRequestLayout(false);
                        }
                    }
                }
            }
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return super.focusSearch(view, i1);
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

    public a getAdapter()
    {
        return mAdapter;
    }

    public int getBaseline()
    {
        if (mLayout != null)
        {
            return mLayout.getBaseline();
        } else
        {
            return super.getBaseline();
        }
    }

    long getChangedHolderKey(v v1)
    {
        if (mAdapter.hasStableIds())
        {
            return v1.getItemId();
        } else
        {
            return (long)v1.mPosition;
        }
    }

    public int getChildAdapterPosition(View view)
    {
        view = getChildViewHolderInt(view);
        if (view != null)
        {
            return view.getAdapterPosition();
        } else
        {
            return -1;
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (mChildDrawingOrderCallback == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return mChildDrawingOrderCallback.a();
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

    public int getChildLayoutPosition(View view)
    {
        view = getChildViewHolderInt(view);
        if (view != null)
        {
            return view.getLayoutPosition();
        } else
        {
            return -1;
        }
    }

    public int getChildPosition(View view)
    {
        return getChildAdapterPosition(view);
    }

    public v getChildViewHolder(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return getChildViewHolderInt(view);
        }
    }

    public android.support.v7.widget.m getCompatAccessibilityDelegate()
    {
        return mAccessibilityDelegate;
    }

    public e getItemAnimator()
    {
        return mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view)
    {
        j j1 = (j)view.getLayoutParams();
        if (!j1.c)
        {
            return j1.b;
        }
        Rect rect = j1.b;
        rect.set(0, 0, 0, 0);
        int k1 = mItemDecorations.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            mTempRect.set(0, 0, 0, 0);
            ((g)mItemDecorations.get(i1)).getItemOffsets(mTempRect, view, this, mState);
            rect.left = rect.left + mTempRect.left;
            rect.top = rect.top + mTempRect.top;
            rect.right = rect.right + mTempRect.right;
            rect.bottom = rect.bottom + mTempRect.bottom;
        }

        j1.c = false;
        return rect;
    }

    public i getLayoutManager()
    {
        return mLayout;
    }

    public int getMaxFlingVelocity()
    {
        return mMaxFlingVelocity;
    }

    public int getMinFlingVelocity()
    {
        return mMinFlingVelocity;
    }

    public n getRecycledViewPool()
    {
        return mRecycler.d();
    }

    public int getScrollState()
    {
        return mScrollState;
    }

    public boolean hasFixedSize()
    {
        return mHasFixedSize;
    }

    public boolean hasNestedScrollingParent()
    {
        return mScrollingChildHelper.b();
    }

    public boolean hasPendingAdapterUpdates()
    {
        return !mFirstLayoutComplete || mDataSetHasChangedAfterLayout || mAdapterHelper.d();
    }

    void initAdapterManager()
    {
        mAdapterHelper = new android.support.v7.widget.a(new a.a() {

            final RecyclerView a;

            private void c(a.b b1)
            {
                switch (b1.a)
                {
                default:
                    return;

                case 0: // '\0'
                    a.mLayout.onItemsAdded(a, b1.b, b1.d);
                    return;

                case 1: // '\001'
                    a.mLayout.onItemsRemoved(a, b1.b, b1.d);
                    return;

                case 2: // '\002'
                    a.mLayout.onItemsUpdated(a, b1.b, b1.d, b1.c);
                    return;

                case 3: // '\003'
                    a.mLayout.onItemsMoved(a, b1.b, b1.d, 1);
                    break;
                }
            }

            public final v a(int i1)
            {
                v v2 = a.findViewHolderForPosition(i1, true);
                v v1;
                if (v2 == null)
                {
                    v1 = null;
                } else
                {
                    v1 = v2;
                    if (a.mChildHelper.d(v2.itemView))
                    {
                        return null;
                    }
                }
                return v1;
            }

            public final void a(int i1, int j1)
            {
                a.offsetPositionRecordsForRemove(i1, j1, true);
                a.mItemsAddedOrRemoved = true;
                android.support.v7.widget.s.a(a.mState, j1);
            }

            public final void a(int i1, int j1, Object obj)
            {
                a.viewRangeUpdate(i1, j1, obj);
                a.mItemsChanged = true;
            }

            public final void a(a.b b1)
            {
                c(b1);
            }

            public final void b(int i1, int j1)
            {
                a.offsetPositionRecordsForRemove(i1, j1, false);
                a.mItemsAddedOrRemoved = true;
            }

            public final void b(a.b b1)
            {
                c(b1);
            }

            public final void c(int i1, int j1)
            {
                a.offsetPositionRecordsForInsert(i1, j1);
                a.mItemsAddedOrRemoved = true;
            }

            public final void d(int i1, int j1)
            {
                a.offsetPositionRecordsForMove(i1, j1);
                a.mItemsAddedOrRemoved = true;
            }

            
            {
                a = RecyclerView.this;
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

    boolean isAccessibilityEnabled()
    {
        return mAccessibilityManager != null && mAccessibilityManager.isEnabled();
    }

    public boolean isAnimating()
    {
        return mItemAnimator != null && mItemAnimator.b();
    }

    public boolean isAttachedToWindow()
    {
        return mIsAttached;
    }

    public boolean isComputingLayout()
    {
        return mLayoutOrScrollCounter > 0;
    }

    public boolean isLayoutFrozen()
    {
        return mLayoutFrozen;
    }

    public boolean isNestedScrollingEnabled()
    {
        return mScrollingChildHelper.a();
    }

    void markItemDecorInsetsDirty()
    {
        int l1 = mChildHelper.b();
        for (int i1 = 0; i1 < l1; i1++)
        {
            ((j)mChildHelper.c(i1).getLayoutParams()).c = true;
        }

        o o1 = mRecycler;
        l1 = o1.b.size();
        for (int k1 = 0; k1 < l1; k1++)
        {
            j j1 = (j)((v)o1.b.get(k1)).itemView.getLayoutParams();
            if (j1 != null)
            {
                j1.c = true;
            }
        }

    }

    void markKnownViewsInvalid()
    {
        int k1 = mChildHelper.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(i1));
            if (v1 != null && !v1.shouldIgnore())
            {
                v1.addFlags(6);
            }
        }

        markItemDecorInsetsDirty();
        o o1 = mRecycler;
        if (o1.c.mAdapter != null && o1.c.mAdapter.hasStableIds())
        {
            int l1 = o1.b.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                v v2 = (v)o1.b.get(j1);
                if (v2 != null)
                {
                    v2.addFlags(6);
                    v2.addChangePayload(null);
                }
            }

        } else
        {
            o1.c();
        }
    }

    public void offsetChildrenHorizontal(int i1)
    {
        int k1 = mChildHelper.a();
        for (int j1 = 0; j1 < k1; j1++)
        {
            mChildHelper.b(j1).offsetLeftAndRight(i1);
        }

    }

    public void offsetChildrenVertical(int i1)
    {
        int k1 = mChildHelper.a();
        for (int j1 = 0; j1 < k1; j1++)
        {
            mChildHelper.b(j1).offsetTopAndBottom(i1);
        }

    }

    void offsetPositionRecordsForInsert(int i1, int j1)
    {
        int i2 = mChildHelper.b();
        for (int k1 = 0; k1 < i2; k1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(k1));
            if (v1 != null && !v1.shouldIgnore() && v1.mPosition >= i1)
            {
                v1.offsetPosition(j1, false);
                android.support.v7.widget.s.a(mState, true);
            }
        }

        o o1 = mRecycler;
        i2 = o1.b.size();
        for (int l1 = 0; l1 < i2; l1++)
        {
            v v2 = (v)o1.b.get(l1);
            if (v2 != null && v2.getLayoutPosition() >= i1)
            {
                v2.offsetPosition(j1, true);
            }
        }

        requestLayout();
    }

    void offsetPositionRecordsForMove(int i1, int j1)
    {
        int k2 = mChildHelper.b();
        int k1;
        int l1;
        int i2;
        int j2;
        if (i1 < j1)
        {
            i2 = i1;
            k1 = j1;
            l1 = -1;
        } else
        {
            i2 = j1;
            k1 = i1;
            l1 = 1;
        }
        j2 = 0;
        while (j2 < k2) 
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(j2));
            if (v1 != null && v1.mPosition >= i2 && v1.mPosition <= k1)
            {
                if (v1.mPosition == i1)
                {
                    v1.offsetPosition(j1 - i1, false);
                } else
                {
                    v1.offsetPosition(l1, false);
                }
                android.support.v7.widget.s.a(mState, true);
            }
            j2++;
        }
        o o1 = mRecycler;
        if (i1 < j1)
        {
            k1 = -1;
            l1 = j1;
            i2 = i1;
        } else
        {
            k1 = 1;
            l1 = i1;
            i2 = j1;
        }
        k2 = o1.b.size();
        j2 = 0;
        while (j2 < k2) 
        {
            v v2 = (v)o1.b.get(j2);
            if (v2 != null && v2.mPosition >= i2 && v2.mPosition <= l1)
            {
                if (v2.mPosition == i1)
                {
                    v2.offsetPosition(j1 - i1, false);
                } else
                {
                    v2.offsetPosition(k1, false);
                }
            }
            j2++;
        }
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i1, int j1, boolean flag)
    {
        int l1 = i1 + j1;
        int i2 = mChildHelper.b();
        int k1 = 0;
        while (k1 < i2) 
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(k1));
            if (v1 != null && !v1.shouldIgnore())
            {
                if (v1.mPosition >= l1)
                {
                    v1.offsetPosition(-j1, flag);
                    android.support.v7.widget.s.a(mState, true);
                } else
                if (v1.mPosition >= i1)
                {
                    v1.flagRemovedAndOffsetPosition(i1 - 1, -j1, flag);
                    android.support.v7.widget.s.a(mState, true);
                }
            }
            k1++;
        }
        o o1 = mRecycler;
        k1 = o1.b.size() - 1;
        while (k1 >= 0) 
        {
            v v2 = (v)o1.b.get(k1);
            if (v2 != null)
            {
                if (v2.getLayoutPosition() >= l1)
                {
                    v2.offsetPosition(-j1, flag);
                } else
                if (v2.getLayoutPosition() >= i1)
                {
                    v2.addFlags(8);
                    o1.d(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mLayoutOrScrollCounter = 0;
        mIsAttached = true;
        mFirstLayoutComplete = false;
        if (mLayout != null)
        {
            mLayout.dispatchAttachedToWindow(this);
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
            mItemAnimator.c();
        }
        mFirstLayoutComplete = false;
        stopScroll();
        mIsAttached = false;
        if (mLayout != null)
        {
            mLayout.dispatchDetachedFromWindow(this, mRecycler);
        }
        removeCallbacks(mItemAnimatorRunner);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = mItemDecorations.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((g)mItemDecorations.get(i1)).onDraw(canvas, this, mState);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if (mLayout != null && !mLayoutFrozen && (android.support.v4.view.m.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (mLayout.canScrollVertically())
            {
                f1 = -android.support.v4.view.m.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (mLayout.canScrollHorizontally())
            {
                f2 = android.support.v4.view.m.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
                float f3 = getScrollFactor();
                scrollByInternal((int)(f2 * f3), (int)(f1 * f3), motionevent);
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int k1;
        boolean flag;
        boolean flag1;
        if (mLayoutFrozen)
        {
            return false;
        }
        if (dispatchOnItemTouchIntercept(motionevent))
        {
            cancelTouch();
            return true;
        }
        if (mLayout == null)
        {
            return false;
        }
        flag = mLayout.canScrollHorizontally();
        flag1 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        k1 = android.support.v4.view.m.a(motionevent);
        i1 = android.support.v4.view.m.b(motionevent);
        k1;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 134
    //                   1 544
    //                   2 301
    //                   3 558
    //                   4 124
    //                   5 247
    //                   6 536;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_558;
_L8:
        return mScrollState == 1;
_L2:
        if (mIgnoreMotionEventTillDown)
        {
            mIgnoreMotionEventTillDown = false;
        }
        mScrollPointerId = android.support.v4.view.m.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i1;
        mInitialTouchX = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i1;
        mInitialTouchY = i1;
        if (mScrollState == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
        }
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        k1 = i1;
        if (flag1)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
          goto _L8
_L6:
        mScrollPointerId = android.support.v4.view.m.b(motionevent, i1);
        int l1 = (int)(android.support.v4.view.m.c(motionevent, i1) + 0.5F);
        mLastTouchX = l1;
        mInitialTouchX = l1;
        i1 = (int)(android.support.v4.view.m.d(motionevent, i1) + 0.5F);
        mLastTouchY = i1;
        mInitialTouchY = i1;
          goto _L8
_L4:
        int i2 = android.support.v4.view.m.a(motionevent, mScrollPointerId);
        if (i2 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j1 = (int)(android.support.v4.view.m.c(motionevent, i2) + 0.5F);
        i2 = (int)(android.support.v4.view.m.d(motionevent, i2) + 0.5F);
        if (mScrollState != 1)
        {
            int l2 = j1 - mInitialTouchX;
            int k2 = i2 - mInitialTouchY;
            i2 = 0;
            j1 = i2;
            if (flag)
            {
                j1 = i2;
                if (Math.abs(l2) > mTouchSlop)
                {
                    int j2 = mInitialTouchX;
                    int i3 = mTouchSlop;
                    if (l2 < 0)
                    {
                        j1 = -1;
                    } else
                    {
                        j1 = 1;
                    }
                    mLastTouchX = j1 * i3 + j2;
                    j1 = 1;
                }
            }
            j2 = j1;
            if (flag1)
            {
                j2 = j1;
                if (Math.abs(k2) > mTouchSlop)
                {
                    j2 = mInitialTouchY;
                    l2 = mTouchSlop;
                    if (k2 < 0)
                    {
                        j1 = -1;
                    } else
                    {
                        j1 = 1;
                    }
                    mLastTouchY = j1 * l2 + j2;
                    j2 = 1;
                }
            }
            if (j2 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        }
          goto _L8
_L7:
        onPointerUp(motionevent);
          goto _L8
_L3:
        mVelocityTracker.clear();
        stopNestedScroll();
          goto _L8
        cancelTouch();
          goto _L8
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        eatRequestLayout();
        android.support.v4.os.d.a("RV OnLayout");
        dispatchLayout();
        android.support.v4.os.d.a();
        resumeRequestLayout(false);
        mFirstLayoutComplete = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (mAdapterUpdateDuringMeasure)
        {
            eatRequestLayout();
            processAdapterUpdatesAndSetAnimationFlags();
            if (android.support.v7.widget.s.a(mState))
            {
                s.b(mState, true);
            } else
            {
                mAdapterHelper.e();
                s.b(mState, false);
            }
            mAdapterUpdateDuringMeasure = false;
            resumeRequestLayout(false);
        }
        if (mAdapter != null)
        {
            mState.e = mAdapter.getItemCount();
        } else
        {
            mState.e = 0;
        }
        if (mLayout == null)
        {
            defaultOnMeasure(i1, j1);
        } else
        {
            mLayout.onMeasure(mRecycler, mState, i1, j1);
        }
        s.b(mState, false);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        mPendingSavedState = (SavedState)parcelable;
        super.onRestoreInstanceState(mPendingSavedState.getSuperState());
        if (mLayout != null && mPendingSavedState.a != null)
        {
            mLayout.onRestoreInstanceState(mPendingSavedState.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mPendingSavedState != null)
        {
            android.support.v7.widget.SavedState.a(savedstate, mPendingSavedState);
            return savedstate;
        }
        if (mLayout != null)
        {
            savedstate.a = mLayout.onSaveInstanceState();
            return savedstate;
        } else
        {
            savedstate.a = null;
            return savedstate;
        }
    }

    public void onScrollStateChanged(int i1)
    {
    }

    public void onScrolled(int i1, int j1)
    {
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        MotionEvent motionevent1;
        int i1;
        int j1;
        int l1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (mLayoutFrozen || mIgnoreMotionEventTillDown)
        {
            return false;
        }
        if (dispatchOnItemTouch(motionevent))
        {
            cancelTouch();
            return true;
        }
        if (mLayout == null)
        {
            return false;
        }
        flag1 = mLayout.canScrollHorizontally();
        flag2 = mLayout.canScrollVertically();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        flag = false;
        motionevent1 = MotionEvent.obtain(motionevent);
        l1 = android.support.v4.view.m.a(motionevent);
        j1 = android.support.v4.view.m.b(motionevent);
        if (l1 == 0)
        {
            int ai[] = mNestedOffsets;
            mNestedOffsets[1] = 0;
            ai[0] = 0;
        }
        motionevent1.offsetLocation(mNestedOffsets[0], mNestedOffsets[1]);
        i1 = ((flag) ? 1 : 0);
        l1;
        JVM INSTR tableswitch 0 6: default 184
    //                   0 209
    //                   1 859
    //                   2 371
    //                   3 967
    //                   4 188
    //                   5 304
    //                   6 847;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = ((flag) ? 1 : 0);
_L10:
        if (i1 == 0)
        {
            mVelocityTracker.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L2:
        mScrollPointerId = android.support.v4.view.m.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i1;
        mInitialTouchX = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i1;
        mInitialTouchY = i1;
        i1 = 0;
        if (flag1)
        {
            i1 = 1;
        }
        j1 = i1;
        if (flag2)
        {
            j1 = i1 | 2;
        }
        startNestedScroll(j1);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L7:
        mScrollPointerId = android.support.v4.view.m.b(motionevent, j1);
        i1 = (int)(android.support.v4.view.m.c(motionevent, j1) + 0.5F);
        mLastTouchX = i1;
        mInitialTouchX = i1;
        i1 = (int)(android.support.v4.view.m.d(motionevent, j1) + 0.5F);
        mLastTouchY = i1;
        mInitialTouchY = i1;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = android.support.v4.view.m.a(motionevent, mScrollPointerId);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j3 = (int)(android.support.v4.view.m.c(motionevent, i1) + 0.5F);
        int k3 = (int)(android.support.v4.view.m.d(motionevent, i1) + 0.5F);
        int k2 = mLastTouchX - j3;
        int i2 = mLastTouchY - k3;
        int k1 = k2;
        i1 = i2;
        if (dispatchNestedPreScroll(k2, i2, mScrollConsumed, mScrollOffset))
        {
            k1 = k2 - mScrollConsumed[0];
            i1 = i2 - mScrollConsumed[1];
            motionevent1.offsetLocation(mScrollOffset[0], mScrollOffset[1]);
            motionevent = mNestedOffsets;
            motionevent[0] = motionevent[0] + mScrollOffset[0];
            motionevent = mNestedOffsets;
            motionevent[1] = motionevent[1] + mScrollOffset[1];
        }
        int l2 = k1;
        k2 = i1;
        if (mScrollState != 1)
        {
            l2 = 0;
            int j2 = k1;
            k2 = l2;
            if (flag1)
            {
                j2 = k1;
                k2 = l2;
                if (Math.abs(k1) > mTouchSlop)
                {
                    int i3;
                    if (k1 > 0)
                    {
                        j2 = k1 - mTouchSlop;
                    } else
                    {
                        j2 = k1 + mTouchSlop;
                    }
                    k2 = 1;
                }
            }
            k1 = i1;
            i3 = k2;
            if (flag2)
            {
                k1 = i1;
                i3 = k2;
                if (Math.abs(i1) > mTouchSlop)
                {
                    if (i1 > 0)
                    {
                        k1 = i1 - mTouchSlop;
                    } else
                    {
                        k1 = i1 + mTouchSlop;
                    }
                    i3 = 1;
                }
            }
            l2 = j2;
            k2 = k1;
            if (i3 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
                k2 = k1;
                l2 = j2;
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (mScrollState == 1)
        {
            mLastTouchX = j3 - mScrollOffset[0];
            mLastTouchY = k3 - mScrollOffset[1];
            if (!flag1)
            {
                l2 = 0;
            }
            if (!flag2)
            {
                k2 = 0;
            }
            i1 = ((flag) ? 1 : 0);
            if (scrollByInternal(l2, k2, motionevent1))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                i1 = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        onPointerUp(motionevent);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        mVelocityTracker.addMovement(motionevent1);
        i1 = 1;
        mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocity);
        float f1;
        float f2;
        if (flag1)
        {
            f1 = -w.a(mVelocityTracker, mScrollPointerId);
        } else
        {
            f1 = 0.0F;
        }
        if (flag2)
        {
            f2 = -w.b(mVelocityTracker, mScrollPointerId);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F || !fling((int)f1, (int)f2))
        {
            setScrollState(0);
        }
        resetTouch();
        continue; /* Loop/switch isn't completed */
_L5:
        cancelTouch();
        i1 = ((flag) ? 1 : 0);
        if (true) goto _L10; else goto _L9
_L9:
    }

    void rebindUpdatedViewHolders()
    {
        int i1;
        int j1;
        j1 = mChildHelper.a();
        i1 = 0;
_L2:
        v v1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        v1 = getChildViewHolderInt(mChildHelper.b(i1));
        if (v1 != null && !v1.shouldIgnore())
        {
            if (!v1.isRemoved() && !v1.isInvalid())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!v1.needsUpdate()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = mAdapter.getItemViewType(v1.mPosition);
            if (v1.getItemViewType() != k1)
            {
                break label0;
            }
            if (!v1.isChanged() || !supportsChangeAnimations())
            {
                mAdapter.bindViewHolder(v1, v1.mPosition);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        v v1 = getChildViewHolderInt(view);
        if (v1 != null)
        {
            if (v1.isTmpDetached())
            {
                v1.clearTmpDetachFlag();
            } else
            if (!v1.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(v1).toString());
            }
        }
        dispatchChildDetached(view);
        super.removeDetachedView(view, flag);
    }

    public void removeItemDecoration(g g1)
    {
        if (mLayout != null)
        {
            mLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        mItemDecorations.remove(g1);
        if (mItemDecorations.isEmpty())
        {
            boolean flag;
            if (x.a(this) == 2)
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

    public void removeOnChildAttachStateChangeListener(k k1)
    {
        if (mOnChildAttachStateListeners == null)
        {
            return;
        } else
        {
            mOnChildAttachStateListeners.remove(k1);
            return;
        }
    }

    public void removeOnItemTouchListener(l l1)
    {
        mOnItemTouchListeners.remove(l1);
        if (mActiveOnItemTouchListener == l1)
        {
            mActiveOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(m m1)
    {
        if (mScrollListeners != null)
        {
            mScrollListeners.remove(m1);
        }
    }

    public void requestChildFocus(View view, View view1)
    {
        boolean flag = false;
        if (!mLayout.onRequestChildFocus(this, mState, view, view1) && view1 != null)
        {
            mTempRect.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof j)
            {
                obj = (j)obj;
                if (!((j) (obj)).c)
                {
                    obj = ((j) (obj)).b;
                    Rect rect = mTempRect;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = mTempRect;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = mTempRect;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = mTempRect;
                    rect.bottom = rect.bottom + ((Rect) (obj)).bottom;
                }
            }
            offsetDescendantRectToMyCoords(view1, mTempRect);
            offsetRectIntoDescendantCoords(view, mTempRect);
            obj = mTempRect;
            if (!mFirstLayoutComplete)
            {
                flag = true;
            }
            requestChildRectangleOnScreen(view, ((Rect) (obj)), flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        return mLayout.requestChildRectangleOnScreen(this, view, rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j1 = mOnItemTouchListeners.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            mOnItemTouchListeners.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!mEatRequestLayout && !mLayoutFrozen)
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
            if (flag && mLayoutRequestEaten && !mLayoutFrozen && mLayout != null && mAdapter != null)
            {
                dispatchLayout();
            }
            mEatRequestLayout = false;
            if (!mLayoutFrozen)
            {
                mLayoutRequestEaten = false;
            }
        }
    }

    void saveOldPositions()
    {
        int j1 = mChildHelper.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            v v1 = getChildViewHolderInt(mChildHelper.c(i1));
            if (!v1.shouldIgnore())
            {
                v1.saveOldPosition();
            }
        }

    }

    public void scrollBy(int i1, int j1)
    {
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!mLayoutFrozen)
        {
            boolean flag = mLayout.canScrollHorizontally();
            boolean flag1 = mLayout.canScrollVertically();
            if (flag || flag1)
            {
                if (!flag)
                {
                    i1 = 0;
                }
                if (!flag1)
                {
                    j1 = 0;
                }
                scrollByInternal(i1, j1, null);
                return;
            }
        }
    }

    boolean scrollByInternal(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = 0;
        boolean flag2 = false;
        int j2 = 0;
        boolean flag = false;
        int k1 = 0;
        boolean flag3 = false;
        int i2 = 0;
        boolean flag1 = false;
        consumePendingUpdateOperations();
        if (mAdapter != null)
        {
            eatRequestLayout();
            onEnterLayoutOrScroll();
            android.support.v4.os.d.a("RV Scroll");
            k1 = ((flag3) ? 1 : 0);
            l1 = ((flag2) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = mLayout.scrollHorizontallyBy(i1, mRecycler, mState);
                l1 = i1 - k1;
            }
            i2 = ((flag1) ? 1 : 0);
            j2 = ((flag) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = mLayout.scrollVerticallyBy(j1, mRecycler, mState);
                j2 = j1 - i2;
            }
            android.support.v4.os.d.a();
            if (supportsChangeAnimations())
            {
                int l2 = mChildHelper.a();
                int k2 = 0;
                while (k2 < l2) 
                {
                    View view = mChildHelper.b(k2);
                    Object obj = getChildViewHolder(view);
                    if (obj == null || ((v) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((v) (obj)).mShadowingHolder;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((v) (obj)).itemView;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i3 = view.getLeft();
                    j3 = view.getTop();
                    if (i3 != ((View) (obj)).getLeft() || j3 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i3, j3, ((View) (obj)).getWidth() + i3, ((View) (obj)).getHeight() + j3);
                    }
                    k2++;
                }
            }
            onExitLayoutOrScroll();
            resumeRequestLayout(false);
        }
        if (!mItemDecorations.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k1, i2, l1, j2, mScrollOffset))
        {
            mLastTouchX = mLastTouchX - mScrollOffset[0];
            mLastTouchY = mLastTouchY - mScrollOffset[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(mScrollOffset[0], mScrollOffset[1]);
            }
            motionevent = mNestedOffsets;
            motionevent[0] = motionevent[0] + mScrollOffset[0];
            motionevent = mNestedOffsets;
            motionevent[1] = motionevent[1] + mScrollOffset[1];
        } else
        if (x.a(this) != 2)
        {
            if (motionevent != null)
            {
                pullGlows(motionevent.getX(), l1, motionevent.getY(), j2);
            }
            considerReleasingGlowsOnScroll(i1, j1);
        }
        if (k1 != 0 || i2 != 0)
        {
            dispatchOnScrolled(k1, i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k1 != 0 || i2 != 0;
    }

    public void scrollTo(int i1, int j1)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void scrollToPosition(int i1)
    {
        if (mLayoutFrozen)
        {
            return;
        }
        stopScroll();
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            mLayout.scrollToPosition(i1);
            awakenScrollBars();
            return;
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        if (shouldDeferAccessibilityEvent(accessibilityevent))
        {
            return;
        } else
        {
            super.sendAccessibilityEventUnchecked(accessibilityevent);
            return;
        }
    }

    public void setAccessibilityDelegateCompat(android.support.v7.widget.m m1)
    {
        mAccessibilityDelegate = m1;
        x.a(this, mAccessibilityDelegate);
    }

    public void setAdapter(a a1)
    {
        setLayoutFrozen(false);
        setAdapterInternal(a1, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d d1)
    {
        if (d1 == mChildDrawingOrderCallback)
        {
            return;
        }
        mChildDrawingOrderCallback = d1;
        boolean flag;
        if (mChildDrawingOrderCallback != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChildrenDrawingOrderEnabled(flag);
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

    public void setItemAnimator(e e1)
    {
        if (mItemAnimator != null)
        {
            mItemAnimator.c();
            mItemAnimator.a(null);
        }
        mItemAnimator = e1;
        if (mItemAnimator != null)
        {
            mItemAnimator.a(mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i1)
    {
        mRecycler.a(i1);
    }

    public void setLayoutFrozen(boolean flag)
    {
label0:
        {
            if (flag != mLayoutFrozen)
            {
                assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
                if (flag)
                {
                    break label0;
                }
                mLayoutFrozen = flag;
                if (mLayoutRequestEaten && mLayout != null && mAdapter != null)
                {
                    requestLayout();
                }
                mLayoutRequestEaten = false;
            }
            return;
        }
        long l1 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
        mLayoutFrozen = flag;
        mIgnoreMotionEventTillDown = true;
        stopScroll();
    }

    public void setLayoutManager(i i1)
    {
        if (i1 == mLayout)
        {
            return;
        }
        if (mLayout != null)
        {
            if (mIsAttached)
            {
                mLayout.dispatchDetachedFromWindow(this, mRecycler);
            }
            mLayout.setRecyclerView(null);
        }
        mRecycler.a();
        android.support.v7.widget.e e1 = mChildHelper;
        e.a a1 = e1.b;
        do
        {
            a1.a = 0L;
            if (a1.b == null)
            {
                break;
            }
            a1 = a1.b;
        } while (true);
        for (int j1 = e1.c.size() - 1; j1 >= 0; j1--)
        {
            e1.a.d((View)e1.c.get(j1));
            e1.c.remove(j1);
        }

        e1.a.b();
        mLayout = i1;
        if (i1 != null)
        {
            if (i1.mRecyclerView != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(i1).append(" is already attached to a RecyclerView: ").append(i1.mRecyclerView).toString());
            }
            mLayout.setRecyclerView(this);
            if (mIsAttached)
            {
                mLayout.dispatchAttachedToWindow(this);
            }
        }
        requestLayout();
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        mScrollingChildHelper.a(flag);
    }

    public void setOnScrollListener(m m1)
    {
        mScrollListener = m1;
    }

    public void setRecycledViewPool(n n1)
    {
        mRecycler.a(n1);
    }

    public void setRecyclerListener(p p1)
    {
        mRecyclerListener = p1;
    }

    public void setScrollingTouchSlop(int i1)
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        switch (i1)
        {
        default:
            Log.w("RecyclerView", (new StringBuilder("setScrollingTouchSlop(): bad argument constant ")).append(i1).append("; using default value").toString());
            // fall through

        case 0: // '\0'
            mTouchSlop = viewconfiguration.getScaledTouchSlop();
            return;

        case 1: // '\001'
            mTouchSlop = ab.a(viewconfiguration);
            break;
        }
    }

    public void setViewCacheExtension(t t1)
    {
        mRecycler.a(t1);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (isComputingLayout())
        {
            int i1 = 0;
            if (accessibilityevent != null)
            {
                i1 = android.support.v4.view.accessibility.a.b(accessibilityevent);
            }
            int j1 = i1;
            if (i1 == 0)
            {
                j1 = 0;
            }
            mEatenAccessibilityChangeFlags = mEatenAccessibilityChangeFlags | j1;
            return true;
        } else
        {
            return false;
        }
    }

    public void smoothScrollBy(int i1, int j1)
    {
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!mLayoutFrozen)
        {
            if (!mLayout.canScrollHorizontally())
            {
                i1 = 0;
            }
            if (!mLayout.canScrollVertically())
            {
                j1 = 0;
            }
            if (i1 != 0 || j1 != 0)
            {
                mViewFlinger.b(i1, j1);
                return;
            }
        }
    }

    public void smoothScrollToPosition(int i1)
    {
        if (mLayoutFrozen)
        {
            return;
        }
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            mLayout.smoothScrollToPosition(this, mState, i1);
            return;
        }
    }

    public boolean startNestedScroll(int i1)
    {
        return mScrollingChildHelper.a(i1);
    }

    public void stopNestedScroll()
    {
        mScrollingChildHelper.c();
    }

    public void stopScroll()
    {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(a a1, boolean flag)
    {
        setLayoutFrozen(false);
        setAdapterInternal(a1, true, flag);
        setDataSetChangedAfterLayout();
        requestLayout();
    }

    void viewRangeUpdate(int i1, int j1, Object obj)
    {
        int l1 = mChildHelper.b();
        int k1 = i1 + j1;
        for (j1 = 0; j1 < l1; j1++)
        {
            View view = mChildHelper.c(j1);
            v v2 = getChildViewHolderInt(view);
            if (v2 == null || v2.shouldIgnore() || v2.mPosition < i1 || v2.mPosition >= k1)
            {
                continue;
            }
            v2.addFlags(2);
            v2.addChangePayload(obj);
            if (supportsChangeAnimations())
            {
                v2.addFlags(64);
            }
            ((j)view.getLayoutParams()).c = true;
        }

        obj = mRecycler;
        for (j1 = ((o) (obj)).b.size() - 1; j1 >= 0; j1--)
        {
            v v1 = (v)((o) (obj)).b.get(j1);
            if (v1 == null)
            {
                continue;
            }
            int i2 = v1.getLayoutPosition();
            if (i2 >= i1 && i2 < k1)
            {
                v1.addFlags(2);
                ((o) (obj)).d(j1);
            }
        }

    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FORCE_INVALIDATE_DISPLAY_LIST = flag;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }





















/*
    static boolean access$3802(RecyclerView recyclerview, boolean flag)
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
