// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class aex
{

    acn mChildHelper;
    private boolean mIsAttachedToWindow;
    public RecyclerView mRecyclerView;
    private boolean mRequestedSimpleAnimations;
    afj mSmoothScroller;

    public aex()
    {
        mRequestedSimpleAnimations = false;
        mIsAttachedToWindow = false;
    }

    private void addViewInt(View view, int i, boolean flag)
    {
        afn afn1;
        aez aez1;
        afn1 = RecyclerView.b(view);
        if (flag || afn1.o())
        {
            mRecyclerView.v.b(view);
        } else
        {
            mRecyclerView.v.a(view);
        }
        aez1 = (aez)view.getLayoutParams();
        if (!afn1.h() && !afn1.f()) goto _L2; else goto _L1
_L1:
        if (afn1.f())
        {
            afn1.g();
        } else
        {
            afn1.i();
        }
        mChildHelper.a(view, i, view.getLayoutParams(), false);
_L4:
        if (aez1.f)
        {
            afn1.a.invalidate();
            aez1.f = false;
        }
        return;
_L2:
        if (view.getParent() == mRecyclerView)
        {
            int k = mChildHelper.c(view);
            int j = i;
            if (i == -1)
            {
                j = mChildHelper.a();
            }
            if (k == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(mRecyclerView.indexOfChild(view)).toString());
            }
            if (k != j)
            {
                RecyclerView.d(mRecyclerView).moveView(k, j);
            }
        } else
        {
            mChildHelper.a(view, i, false);
            aez1.e = true;
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
        view = mChildHelper;
        i = view.a(i);
        ((acn) (view)).b.c(i);
        ((acn) (view)).a.c(i);
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

    public static aey getProperties(Context context, AttributeSet attributeset, int i, int j)
    {
        aey aey1 = new aey();
        context = context.obtainStyledAttributes(attributeset, aau.a, i, j);
        context.getInt(aau.b, 1);
        context.getInt(aau.e, 1);
        context.getBoolean(aau.d, false);
        context.getBoolean(aau.f, false);
        context.recycle();
        return aey1;
    }

    private void onSmoothScrollerStopped(afj afj1)
    {
        if (mSmoothScroller == afj1)
        {
            mSmoothScroller = null;
        }
    }

    private void scrapOrRecycleView(afe afe1, int i, View view)
    {
        afn afn1 = RecyclerView.b(view);
        if (afn1.b())
        {
            return;
        }
        if (afn1.k() && !afn1.o() && !afn1.m() && !RecyclerView.f(mRecyclerView).b)
        {
            removeViewAt(i);
            afe1.a(afn1);
            return;
        }
        detachViewAt(i);
        view = RecyclerView.b(view);
        view.m = afe1;
        if (!view.m() || !RecyclerView.h(afe1.e))
        {
            if (view.k() && !view.o() && !RecyclerView.f(afe1.e).b)
            {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            } else
            {
                afe1.a.add(view);
                return;
            }
        }
        if (afe1.b == null)
        {
            afe1.b = new ArrayList();
        }
        afe1.b.add(view);
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
        if (mRecyclerView != null && !mRecyclerView.g())
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

    public void assertNotInLayoutOrScroll(String s)
    {
        if (mRecyclerView != null)
        {
            mRecyclerView.a(s);
        }
    }

    public void attachView(View view)
    {
        attachView(view, -1);
    }

    public void attachView(View view, int i)
    {
        attachView(view, i, (aez)view.getLayoutParams());
    }

    public void attachView(View view, int i, aez aez1)
    {
        afn afn1 = RecyclerView.b(view);
        if (afn1.o())
        {
            mRecyclerView.v.b(view);
        } else
        {
            mRecyclerView.v.a(view);
        }
        mChildHelper.a(view, i, aez1, afn1.o());
    }

    public void calculateItemDecorationsForChild(View view, Rect rect)
    {
        if (mRecyclerView == null)
        {
            rect.set(0, 0, 0, 0);
            return;
        } else
        {
            rect.set(mRecyclerView.e(view));
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

    public boolean checkLayoutParams(aez aez1)
    {
        return aez1 != null;
    }

    public int computeHorizontalScrollExtent(afl afl1)
    {
        return 0;
    }

    public int computeHorizontalScrollOffset(afl afl1)
    {
        return 0;
    }

    public int computeHorizontalScrollRange(afl afl1)
    {
        return 0;
    }

    public int computeVerticalScrollExtent(afl afl1)
    {
        return 0;
    }

    public int computeVerticalScrollOffset(afl afl1)
    {
        return 0;
    }

    public int computeVerticalScrollRange(afl afl1)
    {
        return 0;
    }

    public void detachAndScrapAttachedViews(afe afe1)
    {
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            scrapOrRecycleView(afe1, i, getChildAt(i));
        }

    }

    public void detachAndScrapView(View view, afe afe1)
    {
        scrapOrRecycleView(afe1, mChildHelper.c(view), view);
    }

    public void detachAndScrapViewAt(int i, afe afe1)
    {
        scrapOrRecycleView(afe1, i, getChildAt(i));
    }

    public void detachView(View view)
    {
        int i = mChildHelper.c(view);
        if (i >= 0)
        {
            detachViewInternal(i, view);
        }
    }

    public void detachViewAt(int i)
    {
        detachViewInternal(i, getChildAt(i));
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerview)
    {
        mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerview);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerview, afe afe1)
    {
        mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerview, afe1);
    }

    public void endAnimation(View view)
    {
        if (mRecyclerView.q != null)
        {
            mRecyclerView.q.c(RecyclerView.b(view));
        }
    }

    public View findViewByPosition(int i)
    {
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            View view = getChildAt(j);
            afn afn1 = RecyclerView.b(view);
            if (afn1 != null && afn1.d() == i && !afn1.b() && (mRecyclerView.v.j || !afn1.o()))
            {
                return view;
            }
        }

        return null;
    }

    public abstract aez generateDefaultLayoutParams();

    public aez generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new aez(context, attributeset);
    }

    public aez generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof aez)
        {
            return new aez((aez)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new aez((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new aez(layoutparams);
        }
    }

    public int getBaseline()
    {
        return -1;
    }

    public int getBottomDecorationHeight(View view)
    {
        return ((aez)view.getLayoutParams()).d.bottom;
    }

    public View getChildAt(int i)
    {
        if (mChildHelper != null)
        {
            return mChildHelper.c(i);
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
        return mRecyclerView != null && RecyclerView.s(mRecyclerView);
    }

    public int getColumnCountForAccessibility(afe afe1, afl afl1)
    {
        while (mRecyclerView == null || RecyclerView.f(mRecyclerView) == null || !canScrollHorizontally()) 
        {
            return 1;
        }
        return RecyclerView.f(mRecyclerView).a();
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
        Rect rect = ((aez)view.getLayoutParams()).d;
        int i = view.getMeasuredHeight();
        int j = rect.top;
        return rect.bottom + (i + j);
    }

    public int getDecoratedMeasuredWidth(View view)
    {
        Rect rect = ((aez)view.getLayoutParams()).d;
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
            if ((view = mRecyclerView.getFocusedChild()) != null && !mChildHelper.d(view))
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
        aen aen1;
        if (mRecyclerView != null)
        {
            aen1 = mRecyclerView.d;
        } else
        {
            aen1 = null;
        }
        if (aen1 != null)
        {
            return aen1.a();
        } else
        {
            return 0;
        }
    }

    public int getItemViewType(View view)
    {
        return RecyclerView.b(view).e;
    }

    public int getLayoutDirection()
    {
        return mk.h(mRecyclerView);
    }

    public int getLeftDecorationWidth(View view)
    {
        return ((aez)view.getLayoutParams()).d.left;
    }

    public int getMinimumHeight()
    {
        return mk.q(mRecyclerView);
    }

    public int getMinimumWidth()
    {
        return mk.p(mRecyclerView);
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
            return mk.m(mRecyclerView);
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
            return mk.l(mRecyclerView);
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
        return ((aez)view.getLayoutParams()).c.d();
    }

    public int getRightDecorationWidth(View view)
    {
        return ((aez)view.getLayoutParams()).d.right;
    }

    public int getRowCountForAccessibility(afe afe1, afl afl1)
    {
        while (mRecyclerView == null || RecyclerView.f(mRecyclerView) == null || !canScrollVertically()) 
        {
            return 1;
        }
        return RecyclerView.f(mRecyclerView).a();
    }

    public int getSelectionModeForAccessibility(afe afe1, afl afl1)
    {
        return 0;
    }

    public int getTopDecorationHeight(View view)
    {
        return ((aez)view.getLayoutParams()).d.top;
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
            view = RecyclerView.b(view);
            view.b(128);
            mRecyclerView.v.a(view);
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

    public boolean isLayoutHierarchical(afe afe1, afl afl1)
    {
        return false;
    }

    public boolean isSmoothScrolling()
    {
        return mSmoothScroller != null && mSmoothScroller.isRunning();
    }

    public void layoutDecorated(View view, int i, int j, int k, int l)
    {
        Rect rect = ((aez)view.getLayoutParams()).d;
        view.layout(rect.left + i, rect.top + j, k - rect.right, l - rect.bottom);
    }

    public void measureChild(View view, int i, int j)
    {
        aez aez1 = (aez)view.getLayoutParams();
        Rect rect = mRecyclerView.e(view);
        int k = rect.left;
        int l = rect.right;
        int i1 = rect.top;
        int j1 = rect.bottom;
        view.measure(getChildMeasureSpec(getWidth(), k + l + i + (getPaddingLeft() + getPaddingRight()), aez1.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), j1 + i1 + j + (getPaddingTop() + getPaddingBottom()), aez1.height, canScrollVertically()));
    }

    public void measureChildWithMargins(View view, int i, int j)
    {
        aez aez1 = (aez)view.getLayoutParams();
        Rect rect = mRecyclerView.e(view);
        int k = rect.left;
        int l = rect.right;
        int i1 = rect.top;
        int j1 = rect.bottom;
        view.measure(getChildMeasureSpec(getWidth(), k + l + i + (getPaddingLeft() + getPaddingRight() + aez1.leftMargin + aez1.rightMargin), aez1.width, canScrollHorizontally()), getChildMeasureSpec(getHeight(), j1 + i1 + j + (getPaddingTop() + getPaddingBottom() + aez1.topMargin + aez1.bottomMargin), aez1.height, canScrollVertically()));
    }

    public void moveView(int i, int j)
    {
        View view = getChildAt(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(i).toString());
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
            RecyclerView recyclerview = mRecyclerView;
            int k = recyclerview.c.a();
            for (int j = 0; j < k; j++)
            {
                recyclerview.c.c(j).offsetLeftAndRight(i);
            }

        }
    }

    public void offsetChildrenVertical(int i)
    {
        if (mRecyclerView != null)
        {
            RecyclerView recyclerview = mRecyclerView;
            int k = recyclerview.c.a();
            for (int j = 0; j < k; j++)
            {
                recyclerview.c.c(j).offsetTopAndBottom(i);
            }

        }
    }

    public void onAdapterChanged(aen aen1, aen aen2)
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

    public void onDetachedFromWindow(RecyclerView recyclerview, afe afe1)
    {
        onDetachedFromWindow(recyclerview);
    }

    public View onFocusSearchFailed(View view, int i, afe afe1, afl afl1)
    {
        return null;
    }

    public void onInitializeAccessibilityEvent(afe afe1, afl afl1, AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        afe1 = ot.a(accessibilityevent);
        if (mRecyclerView != null)
        {
            boolean flag = flag1;
            if (!mk.b(mRecyclerView, 1))
            {
                flag = flag1;
                if (!mk.b(mRecyclerView, -1))
                {
                    flag = flag1;
                    if (!mk.a(mRecyclerView, -1))
                    {
                        if (mk.a(mRecyclerView, 1))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
            afe1.a(flag);
            if (RecyclerView.f(mRecyclerView) != null)
            {
                afe1.a(RecyclerView.f(mRecyclerView).a());
                return;
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        onInitializeAccessibilityEvent(mRecyclerView.a, mRecyclerView.v, accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(afe afe1, afl afl1, pa pa1)
    {
        if (mk.b(mRecyclerView, -1) || mk.a(mRecyclerView, -1))
        {
            pa1.a(8192);
            pa1.f(true);
        }
        if (mk.b(mRecyclerView, 1) || mk.a(mRecyclerView, 1))
        {
            pa1.a(4096);
            pa1.f(true);
        }
        int i = getRowCountForAccessibility(afe1, afl1);
        int j = getColumnCountForAccessibility(afe1, afl1);
        boolean flag = isLayoutHierarchical(afe1, afl1);
        int k = getSelectionModeForAccessibility(afe1, afl1);
        afe1 = new pk(pa.m().a(i, j, flag, k));
        pa.a.b(pa1.b, ((pk)afe1).a);
    }

    void onInitializeAccessibilityNodeInfo(pa pa1)
    {
        onInitializeAccessibilityNodeInfo(mRecyclerView.a, mRecyclerView.v, pa1);
    }

    public void onInitializeAccessibilityNodeInfoForItem(afe afe1, afl afl1, View view, pa pa1)
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
        pa1.a(pl.a(i, 1, j, 1, false, false));
    }

    void onInitializeAccessibilityNodeInfoForItem(View view, pa pa1)
    {
        afn afn1 = RecyclerView.b(view);
        if (afn1 != null && !afn1.o() && !mChildHelper.d(afn1.a))
        {
            onInitializeAccessibilityNodeInfoForItem(mRecyclerView.a, mRecyclerView.v, view, pa1);
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

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
    {
        onItemsUpdated(recyclerview, i, j);
    }

    public void onLayoutChildren(afe afe1, afl afl1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void onMeasure(afe afe1, afl afl1, int i, int j)
    {
        RecyclerView.b(mRecyclerView, i, j);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerview, afl afl1, View view, View view1)
    {
        return onRequestChildFocus(recyclerview, view, view1);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerview, View view, View view1)
    {
        return isSmoothScrolling() || recyclerview.g();
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
        return performAccessibilityAction(mRecyclerView.a, mRecyclerView.v, i, bundle);
    }

    public boolean performAccessibilityAction(afe afe1, afl afl1, int i, Bundle bundle)
    {
        if (mRecyclerView != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   4096: 129
    //                   8192: 62;
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
        if (mk.b(mRecyclerView, -1))
        {
            i = -(getHeight() - getPaddingTop() - getPaddingBottom());
        } else
        {
            i = 0;
        }
        j = i;
        if (!mk.a(mRecyclerView, -1)) goto _L7; else goto _L6
_L6:
        k = -(getWidth() - getPaddingLeft() - getPaddingRight());
        j = i;
        i = k;
          goto _L8
_L4:
        if (mk.b(mRecyclerView, 1))
        {
            i = getHeight() - getPaddingTop() - getPaddingBottom();
        } else
        {
            i = 0;
        }
        j = i;
        if (!mk.a(mRecyclerView, 1)) goto _L7; else goto _L9
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

    public boolean performAccessibilityActionForItem(afe afe1, afl afl1, View view, int i, Bundle bundle)
    {
        return false;
    }

    boolean performAccessibilityActionForItem(View view, int i, Bundle bundle)
    {
        return performAccessibilityActionForItem(mRecyclerView.a, mRecyclerView.v, view, i, bundle);
    }

    public void postOnAnimation(Runnable runnable)
    {
        if (mRecyclerView != null)
        {
            mk.a(mRecyclerView, runnable);
        }
    }

    public void removeAllViews()
    {
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            mChildHelper.b(i);
        }

    }

    public void removeAndRecycleAllViews(afe afe1)
    {
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            if (!RecyclerView.b(getChildAt(i)).b())
            {
                removeAndRecycleViewAt(i, afe1);
            }
        }

    }

    public void removeAndRecycleScrapInt(afe afe1)
    {
        int j = afe1.a.size();
        for (int i = j - 1; i >= 0; i--)
        {
            View view = ((afn)afe1.a.get(i)).a;
            afn afn1 = RecyclerView.b(view);
            if (afn1.b())
            {
                continue;
            }
            afn1.a(false);
            if (afn1.p())
            {
                mRecyclerView.removeDetachedView(view, false);
            }
            if (mRecyclerView.q != null)
            {
                mRecyclerView.q.c(afn1);
            }
            afn1.a(true);
            afe1.b(view);
        }

        afe1.a.clear();
        if (j > 0)
        {
            mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, afe afe1)
    {
        removeView(view);
        afe1.a(view);
    }

    public void removeAndRecycleViewAt(int i, afe afe1)
    {
        View view = getChildAt(i);
        removeViewAt(i);
        afe1.a(view);
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
        acn acn1 = mChildHelper;
        int i = acn1.a.a(view);
        if (i >= 0)
        {
            if (acn1.b.c(i))
            {
                acn1.b(view);
            }
            acn1.a.a(i);
        }
    }

    public void removeViewAt(int i)
    {
        if (getChildAt(i) != null)
        {
            mChildHelper.b(i);
        }
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerview, View view, Rect rect, boolean flag)
    {
        int k1 = getPaddingLeft();
        int l = getPaddingTop();
        int l1 = getWidth() - getPaddingRight();
        int j1 = getHeight();
        int k2 = getPaddingBottom();
        int i2 = view.getLeft() + rect.left;
        int i1 = view.getTop() + rect.top;
        int j2 = i2 + rect.width();
        int l2 = rect.height();
        int i = Math.min(0, i2 - k1);
        int j = Math.min(0, i1 - l);
        int k = Math.max(0, j2 - l1);
        j1 = Math.max(0, (i1 + l2) - (j1 - k2));
        if (getLayoutDirection() == 1)
        {
            if (k != 0)
            {
                i = k;
            } else
            {
                i = Math.max(i, j2 - l1);
            }
        } else
        if (i == 0)
        {
            i = Math.min(i2 - k1, k);
        }
        if (j == 0)
        {
            j = Math.min(i1 - l, j1);
        }
        if (i != 0 || j != 0)
        {
            if (flag)
            {
                recyclerview.scrollBy(i, j);
            } else
            if (recyclerview.e == null)
            {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else
            if (!recyclerview.j)
            {
                if (!recyclerview.e.canScrollHorizontally())
                {
                    i = 0;
                }
                if (!recyclerview.e.canScrollVertically())
                {
                    j = 0;
                }
                if (i != 0 || j != 0)
                {
                    recyclerview.u.a(i, j);
                }
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

    public int scrollHorizontallyBy(int i, afe afe1, afl afl1)
    {
        return 0;
    }

    public void scrollToPosition(int i)
    {
    }

    public int scrollVerticallyBy(int i, afe afe1, afl afl1)
    {
        return 0;
    }

    public void setMeasuredDimension(int i, int j)
    {
        RecyclerView.c(mRecyclerView, i, j);
    }

    public void setRecyclerView(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            mRecyclerView = null;
            mChildHelper = null;
            return;
        } else
        {
            mRecyclerView = recyclerview;
            mChildHelper = recyclerview.c;
            return;
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, afl afl1, int i)
    {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void startSmoothScroll(afj afj1)
    {
        if (mSmoothScroller != null && afj1 != mSmoothScroller && mSmoothScroller.isRunning())
        {
            mSmoothScroller.stop();
        }
        mSmoothScroller = afj1;
        mSmoothScroller.start(mRecyclerView, this);
    }

    public void stopIgnoringView(View view)
    {
        view = RecyclerView.b(view);
        view.i = ((afn) (view)).i & 0xffffff7f;
        view.r();
        view.b(4);
    }

    public void stopSmoothScroller()
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
    public static boolean access$1902(aex aex1, boolean flag)
    {
        aex1.mRequestedSimpleAnimations = flag;
        return flag;
    }

*/

}
