// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import adp;
import aen;
import aex;
import aez;
import afe;
import afl;
import afn;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package org.lucasr.twowayview:
//            ItemSelectionSupport

public abstract class TwoWayLayoutManager extends aex
{

    private static final String LOGTAG = "TwoWayLayoutManager";
    private boolean mIsVertical;
    private int mLayoutEnd;
    private int mLayoutStart;
    private SavedState mPendingSavedState;
    private int mPendingScrollOffset;
    private int mPendingScrollPosition;
    private RecyclerView mRecyclerView;

    public TwoWayLayoutManager(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TwoWayLayoutManager(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        super();
        mIsVertical = true;
        mPendingSavedState = null;
        mPendingScrollPosition = -1;
        mPendingScrollOffset = 0;
        context = context.obtainStyledAttributes(attributeset, R.styleable.twowayview_TwoWayLayoutManager, i, 0);
        int k = context.getIndexCount();
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            int j = context.getIndex(i);
            if (j != R.styleable.twowayview_TwoWayLayoutManager_android_orientation)
            {
                continue;
            }
            j = context.getInt(j, -1);
            if (j >= 0)
            {
                setOrientation(Orientation.values()[j]);
            }
        }

        context.recycle();
    }

    public TwoWayLayoutManager(Orientation orientation)
    {
        boolean flag = true;
        super();
        mIsVertical = true;
        mPendingSavedState = null;
        mPendingScrollPosition = -1;
        mPendingScrollOffset = 0;
        if (orientation != Orientation.VERTICAL)
        {
            flag = false;
        }
        mIsVertical = flag;
    }

    private void adjustViewsStartOrEnd()
    {
        if (getChildCount() != 0)
        {
            int i;
            int j;
            if (getFirstVisiblePosition() == 0)
            {
                i = getStartWithPadding();
            } else
            {
                i = getLayoutableStart();
            }
            j = mLayoutStart - i;
            i = j;
            if (j < 0)
            {
                i = 0;
            }
            if (i != 0)
            {
                offsetChildren(-i);
                return;
            }
        }
    }

    private void correctTooHigh(int i, afe afe1, afl afl1)
    {
        if (getLastVisiblePosition() == afl1.b() - 1 && i != 0)
        {
            int j = getEndWithPadding();
            int k = getFirstVisiblePosition();
            if (k == 0)
            {
                i = getStartWithPadding();
            } else
            {
                i = getLayoutableStart();
            }
            j -= mLayoutEnd;
            if (j > 0 && (k > 0 || mLayoutStart < i))
            {
                if (k == 0)
                {
                    i = Math.min(j, i - mLayoutStart);
                } else
                {
                    i = j;
                }
                offsetChildren(i);
                if (k > 0)
                {
                    fillBefore(k - 1, afe1);
                    adjustViewsStartOrEnd();
                    return;
                }
            }
        }
    }

    private void correctTooLow(int i, afe afe1, afl afl1)
    {
        if (getFirstVisiblePosition() == 0 && i != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int k;
        int l;
        j = getStartWithPadding();
        k = afl1.b();
        l = getLastVisiblePosition();
        if (l == k - 1)
        {
            i = getEndWithPadding();
        } else
        {
            i = getLayoutableEnd();
        }
        j = mLayoutStart - j;
        if (j <= 0) goto _L1; else goto _L3
_L3:
        if (l >= k - 1 && mLayoutEnd <= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l == k - 1)
        {
            i = Math.min(j, mLayoutEnd - i);
        } else
        {
            i = j;
        }
        offsetChildren(-i);
        if (l >= k - 1) goto _L1; else goto _L4
_L4:
        fillAfter(l + 1, afe1, afl1);
        adjustViewsStartOrEnd();
        return;
        if (l != k - 1) goto _L1; else goto _L5
_L5:
        adjustViewsStartOrEnd();
        return;
    }

    private void fillAfter(int i, afe afe1, afl afl1)
    {
        fillAfter(i, afe1, afl1, 0);
    }

    private void fillAfter(int i, afe afe1, afl afl1, int j)
    {
        int k = getLayoutableEnd();
        for (int l = afl1.b(); canAddMoreViews(Direction.END, k + j) && i < l; i++)
        {
            makeAndAddView(i, Direction.END, afe1);
        }

    }

    private void fillBefore(int i, afe afe1)
    {
        fillBefore(i, afe1, 0);
    }

    private void fillBefore(int i, afe afe1, int j)
    {
        for (int k = getLayoutableStart(); canAddMoreViews(Direction.START, k - j) && i >= 0; i--)
        {
            makeAndAddView(i, Direction.START, afe1);
        }

    }

    private void fillFromScrapList(List list, Direction direction)
    {
        int i = getFirstVisiblePosition();
        if (direction == Direction.END)
        {
            i += getChildCount();
        } else
        {
            i--;
        }
        do
        {
            View view = findNextScrapView(list, direction, i);
            if (view != null)
            {
                setupChild(view, direction);
                int j;
                if (direction == Direction.END)
                {
                    j = 1;
                } else
                {
                    j = -1;
                }
                i += j;
            } else
            {
                return;
            }
        } while (true);
    }

    private void fillGap(Direction direction, afe afe1, afl afl1)
    {
        int i = getChildCount();
        int j = getExtraLayoutSpace(afl1);
        int k = getFirstVisiblePosition();
        if (direction == Direction.END)
        {
            fillAfter(k + i, afe1, afl1, j);
            correctTooHigh(i, afe1, afl1);
            return;
        } else
        {
            fillBefore(k - 1, afe1, j);
            correctTooLow(i, afe1, afl1);
            return;
        }
    }

    private void fillSpecific(int i, afe afe1, afl afl1)
    {
        boolean flag = false;
        if (afl1.b() <= 0)
        {
            return;
        }
        makeAndAddView(i, Direction.END, afe1);
        int j = getExtraLayoutSpace(afl1);
        int k;
        if (afl1.a < i)
        {
            k = j;
            j = ((flag) ? 1 : 0);
        } else
        {
            k = 0;
        }
        fillBefore(i - 1, afe1, k);
        adjustViewsStartOrEnd();
        fillAfter(i + 1, afe1, afl1, j);
        correctTooHigh(getChildCount(), afe1, afl1);
    }

    private int findFirstValidChildPosition(int i)
    {
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            int l = getPosition(getChildAt(j));
            if (l >= 0 && l < i)
            {
                return l;
            }
        }

        return 0;
    }

    private static View findNextScrapView(List list, Direction direction, int i)
    {
        int i1 = list.size();
        int j = 0x7fffffff;
        int k = 0;
        afn afn1 = null;
        for (; k < i1; k++)
        {
            afn afn2 = (afn)list.get(k);
            int j1 = afn2.c() - i;
            if (j1 < 0 && direction == Direction.END || j1 > 0 && direction == Direction.START)
            {
                continue;
            }
            int l = Math.abs(j1);
            if (l >= j)
            {
                continue;
            }
            afn1 = afn2;
            if (j1 == 0)
            {
                break;
            }
            afn1 = afn2;
            j = l;
        }

        if (afn1 != null)
        {
            return afn1.a;
        } else
        {
            return null;
        }
    }

    private Bundle getPendingItemSelectionState()
    {
        if (mPendingSavedState != null)
        {
            return mPendingSavedState.itemSelectionState;
        } else
        {
            return null;
        }
    }

    private int getTotalSpace()
    {
        if (mIsVertical)
        {
            if (!getClipToPadding())
            {
                return getHeight();
            } else
            {
                return getHeight() - getPaddingBottom() - getPaddingTop();
            }
        }
        if (!getClipToPadding())
        {
            return getWidth();
        } else
        {
            return getWidth() - getPaddingRight() - getPaddingLeft();
        }
    }

    private View makeAndAddView(int i, Direction direction, afe afe1)
    {
        afe1 = afe1.b(i);
        boolean flag = ((aez)afe1.getLayoutParams()).c.o();
        if (!flag)
        {
            if (direction == Direction.END)
            {
                i = -1;
            } else
            {
                i = 0;
            }
            addView(afe1, i);
        }
        setupChild(afe1, direction);
        if (!flag)
        {
            updateLayoutEdgesFromNewChild(afe1);
        }
        return afe1;
    }

    private void offsetChildren(int i)
    {
        if (mIsVertical)
        {
            offsetChildrenVertical(i);
        } else
        {
            offsetChildrenHorizontal(i);
        }
        mLayoutStart = mLayoutStart + i;
        mLayoutEnd = mLayoutEnd + i;
    }

    private void recycleChildrenFromEnd(Direction direction, afe afe1)
    {
        int i1 = getLayoutableEnd();
        int i = getChildCount();
        int k = 0;
        i--;
        int j = 0;
        int l;
        do
        {
            l = j;
            if (i < 0)
            {
                break;
            }
            View view = getChildAt(i);
            l = j;
            if (getChildStart(view) <= i1)
            {
                break;
            }
            detachChild(view, direction);
            j++;
            k = i;
            i--;
        } while (true);
        do
        {
            l--;
            if (l >= 0)
            {
                View view1 = getChildAt(k);
                removeAndRecycleViewAt(k, afe1);
                updateLayoutEdgesFromRemovedChild(view1, direction);
            } else
            {
                return;
            }
        } while (true);
    }

    private void recycleChildrenFromStart(Direction direction, afe afe1)
    {
        int l = getChildCount();
        int i1 = getLayoutableStart();
        int j = 0;
        int i = 0;
        int k;
        do
        {
            k = i;
            if (j >= l)
            {
                break;
            }
            View view = getChildAt(j);
            k = i;
            if (getChildEnd(view) >= i1)
            {
                break;
            }
            detachChild(view, direction);
            j++;
            i++;
        } while (true);
        do
        {
            k--;
            if (k >= 0)
            {
                View view1 = getChildAt(0);
                removeAndRecycleView(view1, afe1);
                updateLayoutEdgesFromRemovedChild(view1, direction);
            } else
            {
                return;
            }
        } while (true);
    }

    private void recycleChildrenOutOfBounds(Direction direction, afe afe1)
    {
        if (direction == Direction.END)
        {
            recycleChildrenFromStart(direction, afe1);
            return;
        } else
        {
            recycleChildrenFromEnd(direction, afe1);
            return;
        }
    }

    private void resetLayoutEdges()
    {
        mLayoutStart = 0x7fffffff;
        mLayoutEnd = 0x80000000;
    }

    private void saveScrollPosition()
    {
        if (getPendingScrollPosition() == -1)
        {
            int i = getFirstCompletelyVisiblePosition();
            View view = findViewByPosition(i);
            if (view != null)
            {
                setPendingScrollPositionWithOffset(i, getChildStart(view) - getStartWithPadding());
            }
        }
    }

    private int scrollBy(int i, afe afe1, afl afl1)
    {
        boolean flag = true;
        int i1 = getChildCount();
        if (i1 != 0 && i != 0)
        {
            int k = getLayoutableStart();
            int l = getLayoutableEnd();
            int j1 = getFirstVisiblePosition();
            int j = getTotalSpace();
            if (i < 0)
            {
                i = Math.max(-(j - 1), i);
            } else
            {
                i = Math.min(j - 1, i);
            }
            if (j1 == 0 && mLayoutStart >= getStartWithPadding() && i <= 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i1 + j1 != afl1.b() || mLayoutEnd > getEndWithPadding() || i < 0)
            {
                flag = false;
            }
            if (!flag && j == 0)
            {
                offsetChildren(-i);
                Direction direction;
                if (i > 0)
                {
                    direction = Direction.END;
                } else
                {
                    direction = Direction.START;
                }
                recycleChildrenOutOfBounds(direction, afe1);
                j = Math.abs(i);
                if (canAddMoreViews(Direction.START, k - j) || canAddMoreViews(Direction.END, j + l))
                {
                    fillGap(direction, afe1, afl1);
                }
                return i;
            }
        }
        return 0;
    }

    private void setupChild(View view, Direction direction)
    {
        ItemSelectionSupport itemselectionsupport = ItemSelectionSupport.from(mRecyclerView);
        if (itemselectionsupport != null)
        {
            itemselectionsupport.setViewChecked(view, itemselectionsupport.isItemChecked(getPosition(view)));
        }
        measureChild(view, direction);
        layoutChild(view, direction);
    }

    private void updateLayoutEdgesFromNewChild(View view)
    {
        int i = getChildStart(view);
        if (i < mLayoutStart)
        {
            mLayoutStart = i;
        }
        i = getChildEnd(view);
        if (i > mLayoutEnd)
        {
            mLayoutEnd = i;
        }
    }

    private void updateLayoutEdgesFromRemovedChild(View view, Direction direction)
    {
        int l = getChildCount();
        if (l != 0) goto _L2; else goto _L1
_L1:
        resetLayoutEdges();
_L4:
        return;
_L2:
        int j;
        int k;
        k = getChildStart(view);
        j = getChildEnd(view);
        if (k > mLayoutStart && j < mLayoutEnd) goto _L4; else goto _L3
_L3:
        int i;
        if (direction == Direction.END)
        {
            mLayoutStart = 0x7fffffff;
            i = 0;
        } else
        {
            mLayoutEnd = 0x80000000;
            i = l - 1;
            j = k;
        }
_L7:
        if (i < 0 || i > l - 1) goto _L4; else goto _L5
_L5:
        view = getChildAt(i);
        if (direction != Direction.END)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        k = getChildStart(view);
        if (k < mLayoutStart)
        {
            mLayoutStart = k;
        }
        if (k >= j) goto _L4; else goto _L6
_L6:
        i++;
          goto _L7
        k = getChildEnd(view);
        if (k > mLayoutEnd)
        {
            mLayoutEnd = k;
        }
        if (k <= j) goto _L4; else goto _L8
_L8:
        i--;
          goto _L7
    }

    public abstract boolean canAddMoreViews(Direction direction, int i);

    public boolean canScrollHorizontally()
    {
        return !mIsVertical;
    }

    public boolean canScrollVertically()
    {
        return mIsVertical;
    }

    public int computeHorizontalScrollExtent(afl afl1)
    {
        return getChildCount();
    }

    public int computeHorizontalScrollOffset(afl afl1)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getFirstVisiblePosition();
        }
    }

    public int computeHorizontalScrollRange(afl afl1)
    {
        return afl1.b();
    }

    public int computeVerticalScrollExtent(afl afl1)
    {
        return getChildCount();
    }

    public int computeVerticalScrollOffset(afl afl1)
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getFirstVisiblePosition();
        }
    }

    public int computeVerticalScrollRange(afl afl1)
    {
        return afl1.b();
    }

    protected void detachChild(View view, Direction direction)
    {
    }

    public aez generateDefaultLayoutParams()
    {
        if (mIsVertical)
        {
            return new aez(-1, -2);
        } else
        {
            return new aez(-2, -1);
        }
    }

    public aen getAdapter()
    {
        if (mRecyclerView != null)
        {
            return mRecyclerView.d;
        } else
        {
            return null;
        }
    }

    protected int getAnchorItemPosition(afl afl1)
    {
        int i;
        int k;
label0:
        {
            k = afl1.b();
            int j = getPendingScrollPosition();
            i = j;
            if (j == -1)
            {
                break label0;
            }
            if (j >= 0)
            {
                i = j;
                if (j < k)
                {
                    break label0;
                }
            }
            i = -1;
        }
        if (i != -1)
        {
            return i;
        }
        if (getChildCount() > 0)
        {
            return findFirstValidChildPosition(k);
        } else
        {
            return 0;
        }
    }

    protected int getChildEnd(View view)
    {
        if (mIsVertical)
        {
            return getDecoratedBottom(view);
        } else
        {
            return getDecoratedRight(view);
        }
    }

    protected int getChildStart(View view)
    {
        if (mIsVertical)
        {
            return getDecoratedTop(view);
        } else
        {
            return getDecoratedLeft(view);
        }
    }

    public int getDecoratedBottom(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = super.getDecoratedBottom(view);
        return marginlayoutparams.bottomMargin + i;
    }

    public int getDecoratedLeft(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return super.getDecoratedLeft(view) - marginlayoutparams.leftMargin;
    }

    public int getDecoratedMeasuredHeight(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = super.getDecoratedMeasuredHeight(view);
        int j = marginlayoutparams.topMargin;
        return marginlayoutparams.bottomMargin + (i + j);
    }

    public int getDecoratedMeasuredWidth(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = super.getDecoratedMeasuredWidth(view);
        int j = marginlayoutparams.leftMargin;
        return marginlayoutparams.rightMargin + (i + j);
    }

    public int getDecoratedRight(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i = super.getDecoratedRight(view);
        return marginlayoutparams.rightMargin + i;
    }

    public int getDecoratedTop(View view)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return super.getDecoratedTop(view) - marginlayoutparams.topMargin;
    }

    protected int getEndWithPadding()
    {
        if (mIsVertical)
        {
            return getHeight() - getPaddingBottom();
        } else
        {
            return getWidth() - getPaddingRight();
        }
    }

    protected int getExtraLayoutSpace(afl afl1)
    {
        if (afl1.a())
        {
            return getTotalSpace();
        } else
        {
            return 0;
        }
    }

    public int getFirstCompletelyVisiblePosition()
    {
        View view = getChildAt(0);
        int j = 0;
        int i = 0;
        int k;
        do
        {
            k = i;
            if (view == null)
            {
                break;
            }
            i = getPosition(view);
            k = i;
            if (getChildStart(view) >= getStartWithPadding())
            {
                break;
            }
            j++;
            view = getChildAt(j);
        } while (true);
        return k;
    }

    public int getFirstVisiblePosition()
    {
        if (getChildCount() == 0 || getChildAt(0) == null)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(0));
        }
    }

    public int getLastVisiblePosition()
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

    protected int getLayoutableEnd()
    {
        int i;
        if (mIsVertical)
        {
            i = getHeight();
        } else
        {
            i = getWidth();
        }
        if (getClipToPadding())
        {
            i = getEndWithPadding();
        }
        return i;
    }

    protected int getLayoutableStart()
    {
        if (getClipToPadding())
        {
            return getStartWithPadding();
        } else
        {
            return 0;
        }
    }

    public Orientation getOrientation()
    {
        if (mIsVertical)
        {
            return Orientation.VERTICAL;
        } else
        {
            return Orientation.HORIZONTAL;
        }
    }

    public int getPendingScrollOffset()
    {
        return mPendingScrollOffset;
    }

    public int getPendingScrollPosition()
    {
        return mPendingScrollPosition;
    }

    public int getStartWithPadding()
    {
        if (mIsVertical)
        {
            return getPaddingTop();
        } else
        {
            return getPaddingLeft();
        }
    }

    public abstract void layoutChild(View view, Direction direction);

    public void layoutDecorated(View view, int i, int j, int k, int l)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        super.layoutDecorated(view, i + marginlayoutparams.leftMargin, j + marginlayoutparams.topMargin, k - marginlayoutparams.rightMargin, l - marginlayoutparams.bottomMargin);
    }

    public abstract void measureChild(View view, Direction direction);

    public void onAdapterChanged(aen aen, aen aen1)
    {
        super.onAdapterChanged(aen, aen1);
        aen1 = ItemSelectionSupport.from(mRecyclerView);
        if (aen != null && aen1 != null)
        {
            aen1.clearChoices();
        }
    }

    public void onAttachedToWindow(RecyclerView recyclerview)
    {
        super.onAttachedToWindow(recyclerview);
        mRecyclerView = recyclerview;
    }

    public void onDetachedFromWindow(RecyclerView recyclerview, afe afe1)
    {
        super.onDetachedFromWindow(recyclerview, afe1);
        mRecyclerView = null;
    }

    public void onLayoutChildren(afe afe1, afl afl1)
    {
        ItemSelectionSupport itemselectionsupport = ItemSelectionSupport.from(mRecyclerView);
        if (itemselectionsupport != null)
        {
            Bundle bundle = getPendingItemSelectionState();
            if (bundle != null)
            {
                itemselectionsupport.onRestoreInstanceState(bundle);
            }
            if (afl1.i)
            {
                itemselectionsupport.onAdapterDataChanged();
            }
        }
        if (afl1.i)
        {
            saveScrollPosition();
        }
        int i = getAnchorItemPosition(afl1);
        detachAndScrapAttachedViews(afe1);
        resetLayoutEdges();
        fillSpecific(i, afe1, afl1);
        onLayoutScrapList(afe1, afl1);
        setPendingScrollPositionWithOffset(-1, 0);
        mPendingSavedState = null;
    }

    protected void onLayoutScrapList(afe afe1, afl afl1)
    {
        if (getChildCount() == 0 || afl1.j || !supportsPredictiveItemAnimations())
        {
            return;
        } else
        {
            afe1 = afe1.d;
            fillFromScrapList(afe1, Direction.START);
            fillFromScrapList(afe1, Direction.END);
            return;
        }
    }

    public void onMeasure(afe afe1, afl afl1, int i, int j)
    {
        super.onMeasure(afe1, afl1, i, j);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        mPendingSavedState = (SavedState)parcelable;
        if (mPendingSavedState != null)
        {
            setPendingScrollPositionWithOffset(mPendingSavedState.anchorItemPosition, mPendingSavedState.anchorItemOffset);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(SavedState.EMPTY_STATE);
        int l = getPendingScrollPosition();
        int k = getPendingScrollOffset();
        int j = k;
        int i = l;
        if (l == -1)
        {
            int i1 = getFirstCompletelyVisiblePosition();
            View view = findViewByPosition(i1);
            j = k;
            i = i1;
            if (view != null)
            {
                j = getChildStart(view) - getStartWithPadding();
                i = i1;
            }
        }
        savedstate.anchorItemPosition = i;
        savedstate.anchorItemOffset = j;
        ItemSelectionSupport itemselectionsupport = ItemSelectionSupport.from(mRecyclerView);
        if (itemselectionsupport != null)
        {
            savedstate.itemSelectionState = itemselectionsupport.onSaveInstanceState();
            return savedstate;
        } else
        {
            savedstate.itemSelectionState = Bundle.EMPTY;
            return savedstate;
        }
    }

    public int scrollHorizontallyBy(int i, afe afe1, afl afl1)
    {
        if (mIsVertical)
        {
            return 0;
        } else
        {
            return scrollBy(i, afe1, afl1);
        }
    }

    public void scrollToPosition(int i)
    {
        scrollToPositionWithOffset(i, 0);
    }

    public void scrollToPositionWithOffset(int i, int j)
    {
        setPendingScrollPositionWithOffset(i, j);
        requestLayout();
    }

    public int scrollVerticallyBy(int i, afe afe1, afl afl1)
    {
        if (!mIsVertical)
        {
            return 0;
        } else
        {
            return scrollBy(i, afe1, afl1);
        }
    }

    public void setOrientation(Orientation orientation)
    {
        boolean flag;
        if (orientation == Orientation.VERTICAL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mIsVertical == flag)
        {
            return;
        } else
        {
            mIsVertical = flag;
            requestLayout();
            return;
        }
    }

    protected void setPendingScrollPositionWithOffset(int i, int j)
    {
        mPendingScrollPosition = i;
        mPendingScrollOffset = j;
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, afl afl1, int i)
    {
        recyclerview = new _cls1(recyclerview.getContext());
        recyclerview.setTargetPosition(i);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return true;
    }


    private class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(org/lucasr/twowayview/TwoWayLayoutManager$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private class Direction extends Enum
    {

        private static final Direction $VALUES[];
        public static final Direction END;
        public static final Direction START;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(org/lucasr/twowayview/TwoWayLayoutManager$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])$VALUES.clone();
        }

        static 
        {
            START = new Direction("START", 0);
            END = new Direction("END", 1);
            $VALUES = (new Direction[] {
                START, END
            });
        }

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public static final SavedState EMPTY_STATE = new SavedState();
        private int anchorItemOffset;
        private int anchorItemPosition;
        private Bundle itemSelectionState;
        private final Parcelable superState;

        public int describeContents()
        {
            return 0;
        }

        public Parcelable getSuperState()
        {
            return superState;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(anchorItemPosition);
            parcel.writeInt(anchorItemOffset);
            parcel.writeParcelable(itemSelectionState, i);
        }




/*
        static Bundle access$002(SavedState savedstate, Bundle bundle)
        {
            savedstate.itemSelectionState = bundle;
            return bundle;
        }

*/



/*
        static int access$202(SavedState savedstate, int i)
        {
            savedstate.anchorItemPosition = i;
            return i;
        }

*/



/*
        static int access$302(SavedState savedstate, int i)
        {
            savedstate.anchorItemOffset = i;
            return i;
        }

*/

        private SavedState()
        {
            superState = null;
        }

        protected SavedState(Parcel parcel)
        {
            superState = EMPTY_STATE;
            anchorItemPosition = parcel.readInt();
            anchorItemOffset = parcel.readInt();
            itemSelectionState = (Bundle)parcel.readParcelable(getClass().getClassLoader());
        }

        protected SavedState(Parcelable parcelable)
        {
            if (parcelable == null)
            {
                throw new IllegalArgumentException("superState must not be null");
            }
            if (parcelable == EMPTY_STATE)
            {
                parcelable = null;
            }
            superState = parcelable;
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

                _cls1()
                {
                }
        }

    }


    private class _cls1 extends adp
    {

        final TwoWayLayoutManager this$0;

        public PointF computeScrollVectorForPosition(int i)
        {
            if (getChildCount() == 0)
            {
                return null;
            }
            if (i < getFirstVisiblePosition())
            {
                i = -1;
            } else
            {
                i = 1;
            }
            if (mIsVertical)
            {
                return new PointF(0.0F, i);
            } else
            {
                return new PointF(i, 0.0F);
            }
        }

        protected int getHorizontalSnapPreference()
        {
            return -1;
        }

        protected int getVerticalSnapPreference()
        {
            return -1;
        }

        _cls1(Context context)
        {
            this$0 = TwoWayLayoutManager.this;
            super(context);
        }
    }

}
