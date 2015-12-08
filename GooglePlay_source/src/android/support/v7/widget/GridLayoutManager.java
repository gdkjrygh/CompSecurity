// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, OrientationHelper, RecyclerView

public final class GridLayoutManager extends LinearLayoutManager
{
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup
    {

        public final int getSpanIndex(int i, int j)
        {
            return i % j;
        }

        public final int getSpanSize(int i)
        {
            return 1;
        }

        public DefaultSpanSizeLookup()
        {
        }
    }

    public static final class LayoutParams extends RecyclerView.LayoutParams
    {

        public int mSpanIndex;
        public int mSpanSize;



/*
        static int access$002(LayoutParams layoutparams, int i)
        {
            layoutparams.mSpanIndex = i;
            return i;
        }

*/



/*
        static int access$102(LayoutParams layoutparams, int i)
        {
            layoutparams.mSpanSize = i;
            return i;
        }

*/

        public LayoutParams()
        {
            super(-2, -2);
            mSpanIndex = -1;
            mSpanSize = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mSpanIndex = -1;
            mSpanSize = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mSpanIndex = -1;
            mSpanSize = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mSpanIndex = -1;
            mSpanSize = 0;
        }
    }

    public static abstract class SpanSizeLookup
    {

        private boolean mCacheSpanIndices;
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        public final int getSpanGroupIndex(int i, int j)
        {
            int k = 0;
            int l = 0;
            int i2 = getSpanSize(i);
            int j1 = 0;
            while (j1 < i) 
            {
                int k1 = getSpanSize(j1);
                int l1 = k + k1;
                int i1;
                if (l1 == j)
                {
                    k = 0;
                    i1 = l + 1;
                } else
                {
                    i1 = l;
                    k = l1;
                    if (l1 > j)
                    {
                        k = k1;
                        i1 = l + 1;
                    }
                }
                j1++;
                l = i1;
            }
            i = l;
            if (k + i2 > j)
            {
                i = l + 1;
            }
            return i;
        }

        public int getSpanIndex(int i, int j)
        {
            int k1 = getSpanSize(i);
            if (k1 == j)
            {
                i = 0;
            } else
            {
                int k = 0;
                int l = 0;
                while (l < i) 
                {
                    int i1 = getSpanSize(l);
                    int j1 = k + i1;
                    if (j1 == j)
                    {
                        k = 0;
                    } else
                    {
                        k = j1;
                        if (j1 > j)
                        {
                            k = i1;
                        }
                    }
                    l++;
                }
                i = k;
                if (k + k1 > j)
                {
                    return 0;
                }
            }
            return i;
        }

        public abstract int getSpanSize(int i);

        public SpanSizeLookup()
        {
            mCacheSpanIndices = false;
        }
    }


    static final int MAIN_DIR_SPEC = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    int mCachedBorders[];
    final Rect mDecorInsets = new Rect();
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    View mSet[];
    public int mSpanCount;
    public SpanSizeLookup mSpanSizeLookup;

    public GridLayoutManager(Context context)
    {
        mPendingSpanCountChange = false;
        mSpanCount = -1;
        mSpanSizeLookup = new DefaultSpanSizeLookup();
        setSpanCount(1);
    }

    private void assignSpans$1d107c69(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean flag)
    {
        int j;
        int k;
        int l;
        byte byte0;
        if (flag)
        {
            boolean flag1 = false;
            l = i;
            k = 1;
            i = ((flag1) ? 1 : 0);
        } else
        {
            i--;
            l = -1;
            k = -1;
        }
        if (mOrientation == 1 && isLayoutRTL())
        {
            j = mSpanCount - 1;
            byte0 = -1;
        } else
        {
            j = 0;
            byte0 = 1;
        }
        while (i != l) 
        {
            View view = mSet[i];
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
            if (byte0 == -1 && layoutparams.mSpanSize > 1)
            {
                layoutparams.mSpanIndex = j - (layoutparams.mSpanSize - 1);
            } else
            {
                layoutparams.mSpanIndex = j;
            }
            j += layoutparams.mSpanSize * byte0;
            i += k;
        }
    }

    private static int getMainDirSpec(int i)
    {
        if (i < 0)
        {
            return MAIN_DIR_SPEC;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
    {
        if (!state.mInPreLayout)
        {
            return mSpanSizeLookup.getSpanGroupIndex(i, mSpanCount);
        }
        int j = recycler.convertPreLayoutPositionToPostLayout(i);
        if (j == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(i).toString());
            return 0;
        } else
        {
            return mSpanSizeLookup.getSpanGroupIndex(j, mSpanCount);
        }
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
    {
        int j;
        if (!state.mInPreLayout)
        {
            j = mSpanSizeLookup.getSpanSize(i);
        } else
        {
            int l = mPreLayoutSpanSizeCache.get(i, -1);
            j = l;
            if (l == -1)
            {
                int k = recycler.convertPreLayoutPositionToPostLayout(i);
                if (k == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i).toString());
                    return 1;
                } else
                {
                    return mSpanSizeLookup.getSpanSize(k);
                }
            }
        }
        return j;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int j)
    {
        calculateItemDecorationsForChild(view, mDecorInsets);
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        view.measure(updateSpecWithExtra(i, layoutparams.leftMargin + mDecorInsets.left, layoutparams.rightMargin + mDecorInsets.right), updateSpecWithExtra(j, layoutparams.topMargin + mDecorInsets.top, layoutparams.bottomMargin + mDecorInsets.bottom));
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

    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    final View findReferenceChild(int i, int j, int k)
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
                            view2 = view1;
                            view3 = obj;
                            if (mSpanSizeLookup.getSpanIndex(k1, mSpanCount) == 0)
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
        if (mOrientation == 1)
        {
            return mSpanCount;
        }
        if (state.getItemCount() <= 0)
        {
            return 0;
        } else
        {
            return getSpanGroupIndex(recycler, state, state.getItemCount() - 1);
        }
    }

    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return mSpanCount;
        }
        if (state.getItemCount() <= 0)
        {
            return 0;
        } else
        {
            return getSpanGroupIndex(recycler, state, state.getItemCount() - 1);
        }
    }

    final void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutstate, LinearLayoutManager.LayoutChunkResult layoutchunkresult)
    {
        int i;
        int l1;
        int l2;
        boolean flag1;
        int k;
        if (layoutstate.mItemDirection == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = 0;
        i = mSpanCount;
        l2 = k;
        if (flag1) goto _L2; else goto _L1
_L1:
        l1 = layoutstate.mCurrentPosition;
        if (state.mInPreLayout) goto _L4; else goto _L3
_L3:
        i = mSpanSizeLookup.getSpanIndex(l1, mSpanCount);
_L7:
        i += getSpanSize(recycler, state, layoutstate.mCurrentPosition);
        l2 = k;
_L2:
        if (l2 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = layoutstate.mCurrentPosition;
        int i1 = getSpanSize(recycler, state, k);
        if (i1 > mSpanCount)
        {
            throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(k).append(" requires ").append(i1).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
        }
        i -= i1;
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = layoutstate.next(recycler);
        if (view == null)
        {
            break; /* Loop/switch isn't completed */
        }
        mSet[l2] = view;
        l2++;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = mPreLayoutSpanIndexCache.get(l1, -1);
        i = i1;
        if (i1 == -1)
        {
            i = recycler.convertPreLayoutPositionToPostLayout(l1);
            if (i == -1)
            {
                Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(l1).toString());
                i = 0;
            } else
            {
                i = mSpanSizeLookup.getSpanIndex(i, mSpanCount);
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L5
_L5:
        if (l2 == 0)
        {
            layoutchunkresult.mFinished = true;
            return;
        }
        int j = 0;
        assignSpans$1d107c69(recycler, state, l2, flag1);
        int l = 0;
        while (l < l2) 
        {
            recycler = mSet[l];
            int j1;
            int i2;
            if (layoutstate.mScrapList == null)
            {
                if (flag1)
                {
                    super.addViewInt(recycler, -1, false);
                } else
                {
                    super.addViewInt(recycler, 0, false);
                }
            } else
            if (flag1)
            {
                super.addViewInt(recycler, -1, true);
            } else
            {
                super.addViewInt(recycler, 0, true);
            }
            state = (LayoutParams)recycler.getLayoutParams();
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(recycler, j1, getMainDirSpec(((LayoutParams) (state)).height));
            } else
            {
                measureChildWithDecorationsAndMargin(recycler, getMainDirSpec(((LayoutParams) (state)).width), j1);
            }
            i2 = mOrientationHelper.getDecoratedMeasurement(recycler);
            j1 = j;
            if (i2 > j)
            {
                j1 = i2;
            }
            l++;
            j = j1;
        }
        int k1 = getMainDirSpec(j);
        l = 0;
        while (l < l2) 
        {
            recycler = mSet[l];
            if (mOrientationHelper.getDecoratedMeasurement(recycler) != j)
            {
                state = (LayoutParams)recycler.getLayoutParams();
                int j2 = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
                if (mOrientation == 1)
                {
                    measureChildWithDecorationsAndMargin(recycler, j2, k1);
                } else
                {
                    measureChildWithDecorationsAndMargin(recycler, k1, j2);
                }
            }
            l++;
        }
        layoutchunkresult.mConsumed = j;
        l = 0;
        k1 = 0;
        int k2 = 0;
        int i3 = 0;
        boolean flag;
        if (mOrientation == 1)
        {
            if (layoutstate.mLayoutDirection == -1)
            {
                i3 = layoutstate.mOffset;
                k2 = i3 - j;
                j = i3;
            } else
            {
                k2 = layoutstate.mOffset;
                j = k2 + j;
            }
        } else
        if (layoutstate.mLayoutDirection == -1)
        {
            k1 = layoutstate.mOffset;
            l = k1 - j;
            j = i3;
        } else
        {
            l = layoutstate.mOffset;
            k1 = l + j;
            j = i3;
        }
        flag = false;
        i3 = k2;
        k2 = l;
        l = ((flag) ? 1 : 0);
        while (l < l2) 
        {
            recycler = mSet[l];
            state = (LayoutParams)recycler.getLayoutParams();
            if (mOrientation == 1)
            {
                k2 = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
                k1 = k2 + mOrientationHelper.getDecoratedMeasurementInOther(recycler);
            } else
            {
                i3 = getPaddingTop() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
                j = i3 + mOrientationHelper.getDecoratedMeasurementInOther(recycler);
            }
            layoutDecorated(recycler, ((LayoutParams) (state)).leftMargin + k2, ((LayoutParams) (state)).topMargin + i3, k1 - ((LayoutParams) (state)).rightMargin, j - ((LayoutParams) (state)).bottomMargin);
            if (((RecyclerView.LayoutParams) (state)).mViewHolder.isRemoved() || ((RecyclerView.LayoutParams) (state)).mViewHolder.isChanged())
            {
                layoutchunkresult.mIgnoreConsumed = true;
            }
            layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | recycler.isFocusable();
            l++;
        }
        Arrays.fill(mSet, null);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final void onAnchorReady(RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo)
    {
        int j = 0;
        super.onAnchorReady(state, anchorinfo);
        int i;
        int k;
        int i1;
        int j1;
        if (super.mOrientation == 1)
        {
            i = getWidth() - getPaddingRight() - getPaddingLeft();
        } else
        {
            i = getHeight() - getPaddingBottom() - getPaddingTop();
        }
        if (mCachedBorders == null || mCachedBorders.length != mSpanCount + 1 || mCachedBorders[mCachedBorders.length - 1] != i)
        {
            mCachedBorders = new int[mSpanCount + 1];
        }
        mCachedBorders[0] = 0;
        i1 = i / mSpanCount;
        j1 = i % mSpanCount;
        k = 1;
        i = 0;
        while (k <= mSpanCount) 
        {
            i += j1;
            int l;
            if (i > 0 && mSpanCount - i < j1)
            {
                i -= mSpanCount;
                l = i1 + 1;
            } else
            {
                l = i1;
            }
            j += l;
            mCachedBorders[k] = j;
            k++;
        }
        if (state.getItemCount() > 0 && !state.mInPreLayout)
        {
            for (i = mSpanSizeLookup.getSpanIndex(anchorinfo.mPosition, mSpanCount); i > 0 && anchorinfo.mPosition > 0; i = mSpanSizeLookup.getSpanIndex(anchorinfo.mPosition, mSpanCount))
            {
                anchorinfo.mPosition = anchorinfo.mPosition - 1;
            }

        }
        if (mSet == null || mSet.length != mSpanCount)
        {
            mSet = new View[mSpanCount];
        }
    }

    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
            return;
        }
        view = (LayoutParams)layoutparams;
        int i = getSpanGroupIndex(recycler, state, ((RecyclerView.LayoutParams) (view)).mViewHolder.getLayoutPosition());
        if (mOrientation == 0)
        {
            int j = ((LayoutParams) (view)).mSpanIndex;
            int l = ((LayoutParams) (view)).mSpanSize;
            boolean flag = flag2;
            if (mSpanCount > 1)
            {
                flag = flag2;
                if (((LayoutParams) (view)).mSpanSize == mSpanCount)
                {
                    flag = true;
                }
            }
            accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain$430787b1(j, l, i, 1, flag));
            return;
        }
        int k = ((LayoutParams) (view)).mSpanIndex;
        int i1 = ((LayoutParams) (view)).mSpanSize;
        boolean flag1 = flag3;
        if (mSpanCount > 1)
        {
            flag1 = flag3;
            if (((LayoutParams) (view)).mSpanSize == mSpanCount)
            {
                flag1 = true;
            }
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain$430787b1(i, 1, k, i1, flag1));
    }

    public final void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.mSpanIndexCache.clear();
    }

    public final void onItemsChanged(RecyclerView recyclerview)
    {
        mSpanSizeLookup.mSpanIndexCache.clear();
    }

    public final void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        mSpanSizeLookup.mSpanIndexCache.clear();
    }

    public final void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.mSpanIndexCache.clear();
    }

    public final void onItemsUpdated(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.mSpanIndexCache.clear();
    }

    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (state.mInPreLayout)
        {
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
                int k = ((RecyclerView.LayoutParams) (layoutparams)).mViewHolder.getLayoutPosition();
                mPreLayoutSpanSizeCache.put(k, layoutparams.mSpanSize);
                mPreLayoutSpanIndexCache.put(k, layoutparams.mSpanIndex);
            }

        }
        super.onLayoutChildren(recycler, state);
        mPreLayoutSpanSizeCache.clear();
        mPreLayoutSpanIndexCache.clear();
        if (!state.mInPreLayout)
        {
            mPendingSpanCountChange = false;
        }
    }

    public final void setSpanCount(int i)
    {
        if (i == mSpanCount)
        {
            return;
        }
        mPendingSpanCountChange = true;
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(i).toString());
        } else
        {
            mSpanCount = i;
            mSpanSizeLookup.mSpanIndexCache.clear();
            return;
        }
    }

    public final boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null && !mPendingSpanCountChange;
    }

}
