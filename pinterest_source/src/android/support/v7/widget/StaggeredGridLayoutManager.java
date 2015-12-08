// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper, LayoutState, ScrollbarHelper, RecyclerView, 
//            LinearSmoothScroller

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
{

    private static final boolean DEBUG = false;
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_OFFSET = 0x80000000;
    public static final String TAG = "StaggeredGridLayoutManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo;
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private int mHeightSpec;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private LayoutState mLayoutState;
    LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    private boolean mReverseLayout;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    private Span mSpans[];
    private final Rect mTmpRect;
    private int mWidthSpec;

    public StaggeredGridLayoutManager(int i, int j)
    {
        mSpanCount = -1;
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mLazySpanLookup = new LazySpanLookup();
        mGapStrategy = 2;
        mTmpRect = new Rect();
        mAnchorInfo = new AnchorInfo(null);
        mLaidOutInvalidFullSpan = false;
        mSmoothScrollbarEnabled = true;
        mCheckForGapsRunnable = new _cls1();
        mOrientation = j;
        setSpanCount(i);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
    {
        mSpanCount = -1;
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mLazySpanLookup = new LazySpanLookup();
        mGapStrategy = 2;
        mTmpRect = new Rect();
        mAnchorInfo = new AnchorInfo(null);
        mLaidOutInvalidFullSpan = false;
        mSmoothScrollbarEnabled = true;
        mCheckForGapsRunnable = new _cls1();
        context = getProperties(context, attributeset, i, j);
        setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
        setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
        setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
    }

    private void appendViewToAllSpans(View view)
    {
        for (int i = mSpanCount - 1; i >= 0; i--)
        {
            mSpans[i].appendToSpan(view);
        }

    }

    private void applyPendingSavedState(AnchorInfo anchorinfo)
    {
        if (mPendingSavedState.mSpanOffsetsSize > 0)
        {
            if (mPendingSavedState.mSpanOffsetsSize == mSpanCount)
            {
                int j = 0;
                while (j < mSpanCount) 
                {
                    mSpans[j].clear();
                    int k = mPendingSavedState.mSpanOffsets[j];
                    int i = k;
                    if (k != 0x80000000)
                    {
                        if (mPendingSavedState.mAnchorLayoutFromEnd)
                        {
                            i = k + mPrimaryOrientation.getEndAfterPadding();
                        } else
                        {
                            i = k + mPrimaryOrientation.getStartAfterPadding();
                        }
                    }
                    mSpans[j].setLine(i);
                    j++;
                }
            } else
            {
                mPendingSavedState.invalidateSpanInfo();
                mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
            }
        }
        mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
        setReverseLayout(mPendingSavedState.mReverseLayout);
        resolveShouldLayoutReverse();
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
            mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
            mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutparams, LayoutState layoutstate)
    {
        if (layoutstate.mLayoutDirection == 1)
        {
            if (layoutparams.mFullSpan)
            {
                appendViewToAllSpans(view);
                return;
            } else
            {
                layoutparams.mSpan.appendToSpan(view);
                return;
            }
        }
        if (layoutparams.mFullSpan)
        {
            prependViewToAllSpans(view);
            return;
        } else
        {
            layoutparams.mSpan.prependToSpan(view);
            return;
        }
    }

    private int calculateScrollDirectionForPosition(int i)
    {
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        if (!mShouldReverseLayout) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return -1;
_L2:
        boolean flag;
        if (i < getFirstChildPosition())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != mShouldReverseLayout)
        {
            return -1;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean checkForGaps()
    {
        if (getChildCount() == 0 || mGapStrategy == 0 || !isAttachedToWindow())
        {
            return false;
        }
        int i;
        int j;
        if (mShouldReverseLayout)
        {
            j = getLastChildPosition();
            i = getFirstChildPosition();
        } else
        {
            j = getFirstChildPosition();
            i = getLastChildPosition();
        }
        if (j == 0 && hasGapsToFix() != null)
        {
            mLazySpanLookup.clear();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!mLaidOutInvalidFullSpan)
        {
            return false;
        }
        LazySpanLookup.FullSpanItem fullspanitem;
        byte byte0;
        if (mShouldReverseLayout)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(j, i + 1, byte0, true);
        if (fullspanitem == null)
        {
            mLaidOutInvalidFullSpan = false;
            mLazySpanLookup.forceInvalidateAfter(i + 1);
            return false;
        }
    /* block-local class not found */
    class LazySpanLookup.FullSpanItem {}

        LazySpanLookup.FullSpanItem fullspanitem1 = mLazySpanLookup.getFirstFullSpanItemInRange(j, fullspanitem.mPosition, byte0 * -1, true);
        if (fullspanitem1 == null)
        {
            mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition);
        } else
        {
            mLazySpanLookup.forceInvalidateAfter(fullspanitem1.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    private boolean checkSpanForGap(Span span)
    {
        return mShouldReverseLayout ? span.getEndLine() < mPrimaryOrientation.getEndAfterPadding() : span.getStartLine() > mPrimaryOrientation.getStartAfterPadding();
    }

    private int computeScrollExtent(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.mGapPerSpan = new int[mSpanCount];
        for (int j = 0; j < mSpanCount; j++)
        {
            fullspanitem.mGapPerSpan[j] = i - mSpans[j].getEndLine(i);
        }

        return fullspanitem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.mGapPerSpan = new int[mSpanCount];
        for (int j = 0; j < mSpanCount; j++)
        {
            fullspanitem.mGapPerSpan[j] = mSpans[j].getStartLine(i) - i;
        }

        return fullspanitem;
    }

    private void ensureOrientationHelper()
    {
        if (mPrimaryOrientation == null)
        {
            mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, mOrientation);
            mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - mOrientation);
            mLayoutState = new LayoutState();
        }
    }

    private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
    {
        mRemainingSpans.set(0, mSpanCount, true);
        int i;
        int k;
        int l;
        if (layoutstate.mLayoutDirection == 1)
        {
            k = layoutstate.mEndLine + layoutstate.mAvailable;
        } else
        {
            k = layoutstate.mStartLine - layoutstate.mAvailable;
        }
        updateAllRemainingSpans(layoutstate.mLayoutDirection, k);
        if (mShouldReverseLayout)
        {
            l = mPrimaryOrientation.getEndAfterPadding();
        } else
        {
            l = mPrimaryOrientation.getStartAfterPadding();
        }
        i = 0;
        do
        {
label0:
            {
label1:
                {
                    if (!layoutstate.hasMore(state) || mRemainingSpans.isEmpty())
                    {
                        break label0;
                    }
                    View view = layoutstate.next(recycler);
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int k1 = layoutparams.getViewLayoutPosition();
                    i = mLazySpanLookup.getSpan(k1);
                    Span span;
                    int i1;
                    if (i == -1)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        LazySpanLookup.FullSpanItem fullspanitem;
                        if (layoutparams.mFullSpan)
                        {
                            span = mSpans[0];
                        } else
                        {
                            span = getNextSpan(layoutstate);
                        }
                        mLazySpanLookup.setSpan(k1, span);
                    } else
                    {
                        span = mSpans[i];
                    }
                    layoutparams.mSpan = span;
                    if (layoutstate.mLayoutDirection == 1)
                    {
                        addView(view);
                    } else
                    {
                        addView(view, 0);
                    }
                    measureChildWithDecorationsAndMargin(view, layoutparams);
                    if (layoutstate.mLayoutDirection == 1)
                    {
                        int j;
                        int j1;
                        if (layoutparams.mFullSpan)
                        {
                            i = getMaxEnd(l);
                        } else
                        {
                            i = span.getEndLine(l);
                        }
                        j1 = i + mPrimaryOrientation.getDecoratedMeasurement(view);
                        LazySpanLookup.FullSpanItem fullspanitem1;
                        if (i1 != 0 && layoutparams.mFullSpan)
                        {
                            fullspanitem = createFullSpanItemFromEnd(i);
                            fullspanitem.mGapDir = -1;
                            fullspanitem.mPosition = k1;
                            mLazySpanLookup.addFullSpanItem(fullspanitem);
                            j = i;
                        } else
                        {
                            j = i;
                        }
                    } else
                    {
                        if (layoutparams.mFullSpan)
                        {
                            i = getMinStart(l);
                        } else
                        {
                            i = span.getStartLine(l);
                        }
                        j = i - mPrimaryOrientation.getDecoratedMeasurement(view);
                        if (i1 != 0 && layoutparams.mFullSpan)
                        {
                            fullspanitem1 = createFullSpanItemFromStart(i);
                            fullspanitem1.mGapDir = 1;
                            fullspanitem1.mPosition = k1;
                            mLazySpanLookup.addFullSpanItem(fullspanitem1);
                        }
                        j1 = i;
                    }
                    if (!layoutparams.mFullSpan || layoutstate.mItemDirection != -1)
                    {
                        break label1;
                    }
                    if (i1 == 0)
                    {
                        if (layoutstate.mLayoutDirection == 1)
                        {
                            if (!areAllEndsEqual())
                            {
                                i = 1;
                            } else
                            {
                                i = 0;
                            }
                        } else
                        if (!areAllStartsEqual())
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        if (i == 0)
                        {
                            break label1;
                        }
                        fullspanitem = mLazySpanLookup.getFullSpanItem(k1);
                        if (fullspanitem != null)
                        {
                            fullspanitem.mHasUnwantedGapAfter = true;
                        }
                    }
                    mLaidOutInvalidFullSpan = true;
                }
                attachViewToSpans(view, layoutparams, layoutstate);
                if (layoutparams.mFullSpan)
                {
                    i = mSecondaryOrientation.getStartAfterPadding();
                } else
                {
                    i = span.mIndex;
                    i1 = mSizePerSpan;
                    i = mSecondaryOrientation.getStartAfterPadding() + i * i1;
                }
                i1 = i + mSecondaryOrientation.getDecoratedMeasurement(view);
                if (mOrientation == 1)
                {
                    layoutDecoratedWithMargins(view, i, j, i1, j1);
                } else
                {
                    layoutDecoratedWithMargins(view, j, i, j1, i1);
                }
                if (layoutparams.mFullSpan)
                {
                    updateAllRemainingSpans(mLayoutState.mLayoutDirection, k);
                } else
                {
                    updateRemainingSpans(span, mLayoutState.mLayoutDirection, k);
                }
                recycle(recycler, mLayoutState);
                i = 1;
                continue;
            }
            if (i == 0)
            {
                recycle(recycler, mLayoutState);
            }
            if (mLayoutState.mLayoutDirection == -1)
            {
                i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
                i = mPrimaryOrientation.getStartAfterPadding() - i;
            } else
            {
                i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
            }
            if (i > 0)
            {
                return Math.min(layoutstate.mAvailable, i);
            }
            return 0;
        } while (true);
    }

    private int findFirstReferenceChildPosition(int i)
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

    private int findLastReferenceChildPosition(int i)
    {
        for (int j = getChildCount() - 1; j >= 0; j--)
        {
            int k = getPosition(getChildAt(j));
            if (k >= 0 && k < i)
            {
                return k;
            }
        }

        return 0;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding());
        i = mPrimaryOrientation.getEndAfterPadding() - i;
        if (i > 0)
        {
            i -= -scrollBy(-i, recycler, state);
            if (flag && i > 0)
            {
                mPrimaryOrientation.offsetChildren(i);
            }
        }
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i = getMinStart(mPrimaryOrientation.getStartAfterPadding()) - mPrimaryOrientation.getStartAfterPadding();
        if (i > 0)
        {
            i -= scrollBy(i, recycler, state);
            if (flag && i > 0)
            {
                mPrimaryOrientation.offsetChildren(-i);
            }
        }
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

    private int getMaxEnd(int i)
    {
        int k = mSpans[0].getEndLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getEndLine(i);
            int l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMaxStart(int i)
    {
        int k = mSpans[0].getStartLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getStartLine(i);
            int l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMinEnd(int i)
    {
        int k = mSpans[0].getEndLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getEndLine(i);
            int l = k;
            if (i1 < k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMinStart(int i)
    {
        int k = mSpans[0].getStartLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getStartLine(i);
            int l = k;
            if (i1 < k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private Span getNextSpan(LayoutState layoutstate)
    {
        Object obj1 = null;
        Object obj = null;
        byte byte0 = -1;
        int i;
        int j;
        if (preferLastSpan(layoutstate.mLayoutDirection))
        {
            i = mSpanCount - 1;
            j = -1;
        } else
        {
            j = mSpanCount;
            i = 0;
            byte0 = 1;
        }
        if (layoutstate.mLayoutDirection == 1)
        {
            int i2 = mPrimaryOrientation.getStartAfterPadding();
            int i1 = 0x7fffffff;
            int k = i;
            layoutstate = ((LayoutState) (obj));
            i = i1;
            do
            {
                obj = layoutstate;
                if (k == j)
                {
                    break;
                }
                obj = mSpans[k];
                int j1 = ((Span) (obj)).getEndLine(i2);
                if (j1 < i)
                {
                    layoutstate = ((LayoutState) (obj));
                    i = j1;
                }
                k += byte0;
            } while (true);
        } else
        {
            int j2 = mPrimaryOrientation.getEndAfterPadding();
            int k1 = 0x80000000;
            int l = i;
            layoutstate = obj1;
            i = k1;
            do
            {
                obj = layoutstate;
                if (l == j)
                {
                    break;
                }
                obj = mSpans[l];
                int l1 = ((Span) (obj)).getStartLine(j2);
                if (l1 > i)
                {
                    layoutstate = ((LayoutState) (obj));
                    i = l1;
                }
                l += byte0;
            } while (true);
        }
        return ((Span) (obj));
    }

    private int getSpecForDimension(int i, int j)
    {
        if (i < 0)
        {
            return j;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
    }

    private void handleUpdate(int i, int j, int k)
    {
        int l;
        int i1;
        int j1;
        if (mShouldReverseLayout)
        {
            j1 = getLastChildPosition();
        } else
        {
            j1 = getFirstChildPosition();
        }
        if (k == 8)
        {
            if (i < j)
            {
                i1 = j + 1;
                l = i;
            } else
            {
                i1 = i + 1;
                l = j;
            }
        } else
        {
            i1 = i + j;
            l = i;
        }
        mLazySpanLookup.invalidateAfter(l);
        k;
        JVM INSTR lookupswitch 3: default 76
    //                   1: 115
    //                   2: 127
    //                   8: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        if (i1 > j1) goto _L6; else goto _L5
_L5:
        return;
_L2:
        mLazySpanLookup.offsetForAddition(i, j);
        continue; /* Loop/switch isn't completed */
_L3:
        mLazySpanLookup.offsetForRemoval(i, j);
        continue; /* Loop/switch isn't completed */
_L4:
        mLazySpanLookup.offsetForRemoval(i, 1);
        mLazySpanLookup.offsetForAddition(j, 1);
        continue; /* Loop/switch isn't completed */
_L6:
        if (mShouldReverseLayout)
        {
            i = getFirstChildPosition();
        } else
        {
            i = getLastChildPosition();
        }
        if (l > i) goto _L5; else goto _L7
_L7:
        requestLayout();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void layoutDecoratedWithMargins(View view, int i, int j, int k, int l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        layoutDecorated(view, i + layoutparams.leftMargin, j + layoutparams.topMargin, k - layoutparams.rightMargin, l - layoutparams.bottomMargin);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int j)
    {
        calculateItemDecorationsForChild(view, mTmpRect);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        view.measure(updateSpecWithExtra(i, layoutparams.leftMargin + mTmpRect.left, layoutparams.rightMargin + mTmpRect.right), updateSpecWithExtra(j, layoutparams.topMargin + mTmpRect.top, layoutparams.bottomMargin + mTmpRect.bottom));
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams)
    {
        if (layoutparams.mFullSpan)
        {
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(view, mFullSizeSpec, getSpecForDimension(layoutparams.height, mHeightSpec));
                return;
            } else
            {
                measureChildWithDecorationsAndMargin(view, getSpecForDimension(layoutparams.width, mWidthSpec), mFullSizeSpec);
                return;
            }
        }
        if (mOrientation == 1)
        {
            measureChildWithDecorationsAndMargin(view, mWidthSpec, getSpecForDimension(layoutparams.height, mHeightSpec));
            return;
        } else
        {
            measureChildWithDecorationsAndMargin(view, getSpecForDimension(layoutparams.width, mWidthSpec), mHeightSpec);
            return;
        }
    }

    private boolean preferLastSpan(int i)
    {
        if (mOrientation != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == mShouldReverseLayout) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        boolean flag1;
        if (i == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 == mShouldReverseLayout)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != isLayoutRTL())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void prependViewToAllSpans(View view)
    {
        for (int i = mSpanCount - 1; i >= 0; i--)
        {
            mSpans[i].prependToSpan(view);
        }

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
            int i = layoutstate.mStartLine - getMaxStart(layoutstate.mStartLine);
            if (i < 0)
            {
                i = layoutstate.mEndLine;
            } else
            {
                i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
            }
            recycleFromEnd(recycler, i);
            return;
        }
        int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
        if (j < 0)
        {
            j = layoutstate.mStartLine;
        } else
        {
            int k = layoutstate.mStartLine;
            j = Math.min(j, layoutstate.mAvailable) + k;
        }
        recycleFromStart(recycler, j);
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
    {
        int j = getChildCount() - 1;
_L12:
        if (j < 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j);
        if (mPrimaryOrientation.getDecoratedStart(view) < i) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mFullSpan) goto _L5; else goto _L4
_L4:
        int k = 0;
_L9:
        if (k >= mSpanCount) goto _L7; else goto _L6
_L6:
        if (Span.access._mth300(mSpans[k]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        k++;
          goto _L9
_L7:
        for (int l = 0; l < mSpanCount; l++)
        {
            mSpans[l].popEnd();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (Span.access._mth300(layoutparams.mSpan).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.mSpan.popEnd();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, recycler);
        j--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i)
    {
_L12:
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
        if (mPrimaryOrientation.getDecoratedEnd(view) > i) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mFullSpan) goto _L5; else goto _L4
_L4:
        int j = 0;
_L9:
        if (j >= mSpanCount) goto _L7; else goto _L6
_L6:
        if (Span.access._mth300(mSpans[j]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        j++;
          goto _L9
_L7:
        for (int k = 0; k < mSpanCount; k++)
        {
            mSpans[k].popStart();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (Span.access._mth300(layoutparams.mSpan).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.mSpan.popStart();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, recycler);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag = true;
        if (mOrientation != 1 && isLayoutRTL()) goto _L2; else goto _L1
_L1:
        flag = mReverseLayout;
_L4:
        mShouldReverseLayout = flag;
        return;
_L2:
        if (mReverseLayout)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    private void updateAllRemainingSpans(int i, int j)
    {
        for (int k = 0; k < mSpanCount; k++)
        {
            if (!Span.access._mth300(mSpans[k]).isEmpty())
            {
                updateRemainingSpans(mSpans[k], i, j);
            }
        }

    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        int i;
        if (mLastLayoutFromEnd)
        {
            i = findLastReferenceChildPosition(state.getItemCount());
        } else
        {
            i = findFirstReferenceChildPosition(state.getItemCount());
        }
        anchorinfo.mPosition = i;
        anchorinfo.mOffset = 0x80000000;
        return true;
    }

    private void updateLayoutState(int i, RecyclerView.State state)
    {
        int j;
        j = 0;
        mLayoutState.mAvailable = 0;
        mLayoutState.mCurrentPosition = i;
        if (!isSmoothScrolling()) goto _L2; else goto _L1
_L1:
        int k = state.getTargetScrollPosition();
        if (k == -1) goto _L2; else goto _L3
_L3:
        boolean flag1 = mShouldReverseLayout;
        boolean flag;
        if (k < i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 == flag)
        {
            i = mPrimaryOrientation.getTotalSpace();
        } else
        {
            j = mPrimaryOrientation.getTotalSpace();
            i = 0;
        }
_L5:
        if (getClipToPadding())
        {
            mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - j;
            mLayoutState.mEndLine = i + mPrimaryOrientation.getEndAfterPadding();
            return;
        } else
        {
            mLayoutState.mEndLine = i + mPrimaryOrientation.getEnd();
            mLayoutState.mStartLine = -j;
            return;
        }
_L2:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void updateRemainingSpans(Span span, int i, int j)
    {
        int k = span.getDeletedSize();
        if (i == -1)
        {
            if (k + span.getStartLine() <= j)
            {
                mRemainingSpans.set(span.mIndex, false);
            }
        } else
        if (span.getEndLine() - k >= j)
        {
            mRemainingSpans.set(span.mIndex, false);
            return;
        }
    }

    private int updateSpecWithExtra(int i, int j, int k)
    {
        int l;
        if (j != 0 || k != 0)
        {
            if ((l = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || l == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i) - j - k), l);
            }
        }
        return i;
    }

    boolean areAllEndsEqual()
    {
        boolean flag1 = true;
        int j = mSpans[0].getEndLine(0x80000000);
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < mSpanCount)
                {
                    if (mSpans[i].getEndLine(0x80000000) == j)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    boolean areAllStartsEqual()
    {
        boolean flag1 = true;
        int j = mSpans[0].getStartLine(0x80000000);
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < mSpanCount)
                {
                    if (mSpans[i].getStartLine(0x80000000) == j)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
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

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
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

    public int[] findFirstCompletelyVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:")).append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();
        }

        return ai1;
    }

    View findFirstVisibleItemClosestToEnd(boolean flag, boolean flag1)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            View view1 = getChildAt(i);
            int l = mPrimaryOrientation.getDecoratedStart(view1);
            int i1 = mPrimaryOrientation.getDecoratedEnd(view1);
            if (i1 <= j || l >= k)
            {
                continue;
            }
            if (i1 <= k || !flag)
            {
                return view1;
            }
            if (flag1 && view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    View findFirstVisibleItemClosestToStart(boolean flag, boolean flag1)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        int l = getChildCount();
        View view = null;
        for (int i = 0; i < l; i++)
        {
            View view1 = getChildAt(i);
            int i1 = mPrimaryOrientation.getDecoratedStart(view1);
            if (mPrimaryOrientation.getDecoratedEnd(view1) <= j || i1 >= k)
            {
                continue;
            }
            if (i1 >= j || !flag)
            {
                return view1;
            }
            if (flag1 && view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    int findFirstVisibleItemPositionInt()
    {
        View view;
        if (mShouldReverseLayout)
        {
            view = findFirstVisibleItemClosestToEnd(true, true);
        } else
        {
            view = findFirstVisibleItemClosestToStart(true, true);
        }
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int[] findFirstVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:")).append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findFirstVisibleItemPosition();
        }

        return ai1;
    }

    public int[] findLastCompletelyVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:")).append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findLastCompletelyVisibleItemPosition();
        }

        return ai1;
    }

    public int[] findLastVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:")).append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findLastVisibleItemPosition();
        }

        return ai1;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 1)
        {
            return mSpanCount;
        } else
        {
            return super.getColumnCountForAccessibility(recycler, state);
        }
    }

    public int getGapStrategy()
    {
        return mGapStrategy;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public boolean getReverseLayout()
    {
        return mReverseLayout;
    }

    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return mSpanCount;
        } else
        {
            return super.getRowCountForAccessibility(recycler, state);
        }
    }

    public int getSpanCount()
    {
        return mSpanCount;
    }

    View hasGapsToFix()
    {
        BitSet bitset;
        byte byte0;
        int k;
        byte byte1;
        int l;
        int i = getChildCount() - 1;
        bitset = new BitSet(mSpanCount);
        bitset.set(0, mSpanCount, true);
        if (mOrientation == 1 && isLayoutRTL())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (mShouldReverseLayout)
        {
            k = -1;
        } else
        {
            k = i + 1;
            i = 0;
        }
        if (i < k)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        l = i;
_L3:
        if (l == k) goto _L2; else goto _L1
_L1:
        int j;
        int j1;
        View view = getChildAt(l);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (bitset.get(layoutparams.mSpan.mIndex))
        {
            if (checkSpanForGap(layoutparams.mSpan))
            {
                return view;
            }
            bitset.clear(layoutparams.mSpan.mIndex);
        }
        if (layoutparams.mFullSpan || l + byte1 == k)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj = getChildAt(l + byte1);
        if (mShouldReverseLayout)
        {
            j = mPrimaryOrientation.getDecoratedEnd(view);
            int i1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
            if (j < i1)
            {
                return view;
            }
            if (j != i1)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j = 1;
        } else
        {
            j = mPrimaryOrientation.getDecoratedStart(view);
            j1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
            if (j > j1)
            {
                return view;
            }
            if (j != j1)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j = 1;
        }
_L4:
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        if (layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (byte0 < 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j != j1)
        {
            return view;
        }
        continue; /* Loop/switch isn't completed */
        l += byte1;
          goto _L3
_L2:
        return null;
        j = 0;
          goto _L4
    }

    public void invalidateSpanAssignments()
    {
        mLazySpanLookup.clear();
        requestLayout();
    }

    boolean isLayoutRTL()
    {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i)
    {
        super.offsetChildrenHorizontal(i);
        for (int j = 0; j < mSpanCount; j++)
        {
            mSpans[j].onOffset(i);
        }

    }

    public void offsetChildrenVertical(int i)
    {
        super.offsetChildrenVertical(i);
        for (int j = 0; j < mSpanCount; j++)
        {
            mSpans[j].onOffset(i);
        }

    }

    public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        removeCallbacks(mCheckForGapsRunnable);
        for (int i = 0; i < mSpanCount; i++)
        {
            mSpans[i].clear();
        }

    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            if (getChildCount() > 0)
            {
                accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
                view = findFirstVisibleItemClosestToStart(false, true);
                view1 = findFirstVisibleItemClosestToEnd(false, true);
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

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int k = -1;
        recycler = view.getLayoutParams();
        if (!(recycler instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
            return;
        }
        recycler = (LayoutParams)recycler;
        int i;
        int j;
        int l;
        if (mOrientation == 0)
        {
            int i1 = recycler.getSpanIndex();
            if (((LayoutParams) (recycler)).mFullSpan)
            {
                i = mSpanCount;
            } else
            {
                i = 1;
            }
            l = -1;
            j = i;
            i = i1;
        } else
        {
            l = recycler.getSpanIndex();
            if (((LayoutParams) (recycler)).mFullSpan)
            {
                k = mSpanCount;
                i = -1;
                j = -1;
            } else
            {
                i = -1;
                k = 1;
                j = -1;
            }
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, j, l, k, ((LayoutParams) (recycler)).mFullSpan, false));
    }

    public void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 1);
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        handleUpdate(i, j, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
    {
        handleUpdate(i, j, 4);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                ensureOrientationHelper();
                AnchorInfo anchorinfo = mAnchorInfo;
                anchorinfo.reset();
                if ((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
                {
                    removeAndRecycleAllViews(recycler);
                    return;
                }
                if (mPendingSavedState != null)
                {
                    applyPendingSavedState(anchorinfo);
                } else
                {
                    resolveShouldLayoutReverse();
                    anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
                }
                updateAnchorInfoForLayout(state, anchorinfo);
                if (mPendingSavedState == null && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
                {
                    mLazySpanLookup.clear();
                    anchorinfo.mInvalidateOffsets = true;
                }
                if (getChildCount() > 0 && (mPendingSavedState == null || mPendingSavedState.mSpanOffsetsSize <= 0))
                {
                    if (anchorinfo.mInvalidateOffsets)
                    {
                        for (int i = 0; i < mSpanCount; i++)
                        {
                            mSpans[i].clear();
                            if (anchorinfo.mOffset != 0x80000000)
                            {
                                mSpans[i].setLine(anchorinfo.mOffset);
                            }
                        }

                    } else
                    {
                        for (int j = 0; j < mSpanCount; j++)
                        {
                            mSpans[j].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
                        }

                    }
                }
                detachAndScrapAttachedViews(recycler);
                mLaidOutInvalidFullSpan = false;
                updateMeasureSpecs();
                updateLayoutState(anchorinfo.mPosition, state);
                boolean flag;
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
                if (state.isPreLayout())
                {
                    break label0;
                }
                flag = flag1;
                if (mGapStrategy == 0)
                {
                    break label1;
                }
                flag = flag1;
                if (getChildCount() <= 0)
                {
                    break label1;
                }
                if (!mLaidOutInvalidFullSpan)
                {
                    flag = flag1;
                    if (hasGapsToFix() == null)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            if (flag)
            {
                removeCallbacks(mCheckForGapsRunnable);
                postOnAnimation(mCheckForGapsRunnable);
            }
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
        }
        mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
        mLastLayoutRTL = isLayoutRTL();
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
        savedstate.mReverseLayout = mReverseLayout;
        savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
        savedstate.mLastLayoutRTL = mLastLayoutRTL;
        if (mLazySpanLookup != null && mLazySpanLookup.mData != null)
        {
            savedstate.mSpanLookup = mLazySpanLookup.mData;
            savedstate.mSpanLookupSize = savedstate.mSpanLookup.length;
            savedstate.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
        } else
        {
            savedstate.mSpanLookupSize = 0;
        }
        if (getChildCount() > 0)
        {
            ensureOrientationHelper();
            int i;
            int j;
            if (mLastLayoutFromEnd)
            {
                i = getLastChildPosition();
            } else
            {
                i = getFirstChildPosition();
            }
            savedstate.mAnchorPosition = i;
            savedstate.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            savedstate.mSpanOffsetsSize = mSpanCount;
            savedstate.mSpanOffsets = new int[mSpanCount];
            j = 0;
            while (j < mSpanCount) 
            {
                if (mLastLayoutFromEnd)
                {
                    int k = mSpans[j].getEndLine(0x80000000);
                    i = k;
                    if (k != 0x80000000)
                    {
                        i = k - mPrimaryOrientation.getEndAfterPadding();
                    }
                } else
                {
                    int l = mSpans[j].getStartLine(0x80000000);
                    i = l;
                    if (l != 0x80000000)
                    {
                        i = l - mPrimaryOrientation.getStartAfterPadding();
                    }
                }
                savedstate.mSpanOffsets[j] = i;
                j++;
            }
        } else
        {
            savedstate.mAnchorPosition = -1;
            savedstate.mVisibleAnchorPosition = -1;
            savedstate.mSpanOffsetsSize = 0;
        }
        return savedstate;
    }

    public void onScrollStateChanged(int i)
    {
        if (i == 0)
        {
            checkForGaps();
        }
    }

    int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        ensureOrientationHelper();
        int j;
        int k;
        int l;
        if (i > 0)
        {
            j = 1;
            k = getLastChildPosition();
        } else
        {
            j = -1;
            k = getFirstChildPosition();
        }
        updateLayoutState(k, state);
        setLayoutStateDirection(j);
        mLayoutState.mCurrentPosition = k + mLayoutState.mItemDirection;
        l = Math.abs(i);
        mLayoutState.mAvailable = l;
        k = fill(recycler, mLayoutState, state);
        j = i;
        if (l >= k)
        {
            if (i < 0)
            {
                j = -k;
            } else
            {
                j = k;
            }
        }
        mPrimaryOrientation.offsetChildren(-j);
        mLastLayoutFromEnd = mShouldReverseLayout;
        return j;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i)
    {
        if (mPendingSavedState != null && mPendingSavedState.mAnchorPosition != i)
        {
            mPendingSavedState.invalidateAnchorPositionInfo();
        }
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int j)
    {
        if (mPendingSavedState != null)
        {
            mPendingSavedState.invalidateAnchorPositionInfo();
        }
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = j;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public void setGapStrategy(int i)
    {
        assertNotInLayoutOrScroll(null);
        if (i == mGapStrategy)
        {
            return;
        }
        if (i != 0 && i != 2)
        {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        } else
        {
            mGapStrategy = i;
            requestLayout();
            return;
        }
    }

    public void setOrientation(int i)
    {
        if (i != 0 && i != 1)
        {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == mOrientation)
        {
            return;
        }
        mOrientation = i;
        if (mPrimaryOrientation != null && mSecondaryOrientation != null)
        {
            OrientationHelper orientationhelper = mPrimaryOrientation;
            mPrimaryOrientation = mSecondaryOrientation;
            mSecondaryOrientation = orientationhelper;
        }
        requestLayout();
    }

    public void setReverseLayout(boolean flag)
    {
        assertNotInLayoutOrScroll(null);
        if (mPendingSavedState != null && mPendingSavedState.mReverseLayout != flag)
        {
            mPendingSavedState.mReverseLayout = flag;
        }
        mReverseLayout = flag;
        requestLayout();
    }

    public void setSpanCount(int i)
    {
        assertNotInLayoutOrScroll(null);
        if (i != mSpanCount)
        {
            invalidateSpanAssignments();
            mSpanCount = i;
            mRemainingSpans = new BitSet(mSpanCount);
            mSpans = new Span[mSpanCount];
            for (i = 0; i < mSpanCount; i++)
            {
                mSpans[i] = new Span(i, null);
            }

            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
    {
        recyclerview = new _cls2(recyclerview.getContext());
        recyclerview.setTargetPosition(i);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null;
    }

    boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag = false;
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
        if (mPendingSavedState == null || mPendingSavedState.mAnchorPosition == -1 || mPendingSavedState.mSpanOffsetsSize <= 0)
        {
            state = findViewByPosition(mPendingScrollPosition);
            if (state != null)
            {
                int i;
                if (mShouldReverseLayout)
                {
                    i = getLastChildPosition();
                } else
                {
                    i = getFirstChildPosition();
                }
                anchorinfo.mPosition = i;
                if (mPendingScrollPositionOffset != 0x80000000)
                {
                    if (anchorinfo.mLayoutFromEnd)
                    {
                        anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(state);
                        return true;
                    } else
                    {
                        anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(state);
                        return true;
                    }
                }
                if (mPrimaryOrientation.getDecoratedMeasurement(state) > mPrimaryOrientation.getTotalSpace())
                {
                    if (anchorinfo.mLayoutFromEnd)
                    {
                        i = mPrimaryOrientation.getEndAfterPadding();
                    } else
                    {
                        i = mPrimaryOrientation.getStartAfterPadding();
                    }
                    anchorinfo.mOffset = i;
                    return true;
                }
                i = mPrimaryOrientation.getDecoratedStart(state) - mPrimaryOrientation.getStartAfterPadding();
                if (i < 0)
                {
                    anchorinfo.mOffset = -i;
                    return true;
                }
                i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(state);
                if (i < 0)
                {
                    anchorinfo.mOffset = i;
                    return true;
                } else
                {
                    anchorinfo.mOffset = 0x80000000;
                    return true;
                }
            }
            anchorinfo.mPosition = mPendingScrollPosition;
            if (mPendingScrollPositionOffset == 0x80000000)
            {
                if (calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
                {
                    flag = true;
                }
                anchorinfo.mLayoutFromEnd = flag;
                anchorinfo.assignCoordinateFromPadding();
            } else
            {
                anchorinfo.assignCoordinateFromPadding(mPendingScrollPositionOffset);
            }
            anchorinfo.mInvalidateOffsets = true;
            return true;
        } else
        {
            anchorinfo.mOffset = 0x80000000;
            anchorinfo.mPosition = mPendingScrollPosition;
            return true;
        }
    }

    void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(state, anchorinfo)) 
        {
            return;
        }
        anchorinfo.assignCoordinateFromPadding();
        anchorinfo.mPosition = 0;
    }

    void updateMeasureSpecs()
    {
        mSizePerSpan = mSecondaryOrientation.getTotalSpace() / mSpanCount;
        mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSecondaryOrientation.getTotalSpace(), 0x40000000);
        if (mOrientation == 1)
        {
            mWidthSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSizePerSpan, 0x40000000);
            mHeightSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        } else
        {
            mHeightSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSizePerSpan, 0x40000000);
            mWidthSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        }
    }





    /* member class not found */
    class LazySpanLookup {}


    /* member class not found */
    class AnchorInfo {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class Span {}


    /* member class not found */
    class SavedState {}


    /* member class not found */
    class LayoutParams {}


    /* member class not found */
    class _cls2 {}

}
