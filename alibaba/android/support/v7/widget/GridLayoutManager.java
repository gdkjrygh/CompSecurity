// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import es;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, OrientationHelper, RecyclerView

public class GridLayoutManager extends LinearLayoutManager
{
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup
    {

        public int getSpanIndex(int i, int j)
        {
            return i % j;
        }

        public int getSpanSize(int i)
        {
            return 1;
        }

        public DefaultSpanSizeLookup()
        {
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams
    {

        public static final int INVALID_SPAN_ID = -1;
        private int mSpanIndex;
        private int mSpanSize;

        public int getSpanIndex()
        {
            return mSpanIndex;
        }

        public int getSpanSize()
        {
            return mSpanSize;
        }



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

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mSpanIndex = -1;
            mSpanSize = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mSpanIndex = -1;
            mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutparams)
        {
            super(layoutparams);
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

        int findReferenceIndexFromCache(int i)
        {
            int j = 0;
            for (int k = mSpanIndexCache.size() - 1; j <= k;)
            {
                int l = j + k >>> 1;
                if (mSpanIndexCache.keyAt(l) < i)
                {
                    j = l + 1;
                } else
                {
                    k = l - 1;
                }
            }

            i = j - 1;
            if (i >= 0 && i < mSpanIndexCache.size())
            {
                return mSpanIndexCache.keyAt(i);
            } else
            {
                return -1;
            }
        }

        int getCachedSpanIndex(int i, int j)
        {
            int k;
            if (!mCacheSpanIndices)
            {
                k = getSpanIndex(i, j);
            } else
            {
                int l = mSpanIndexCache.get(i, -1);
                k = l;
                if (l == -1)
                {
                    j = getSpanIndex(i, j);
                    mSpanIndexCache.put(i, j);
                    return j;
                }
            }
            return k;
        }

        public int getSpanGroupIndex(int i, int j)
        {
            int l1 = getSpanSize(i);
            int i1 = 0;
            int k = 0;
            int l = 0;
            while (i1 < i) 
            {
                int j1 = getSpanSize(i1);
                l += j1;
                if (l == j)
                {
                    l = k + 1;
                    k = 0;
                } else
                if (l > j)
                {
                    l = k + 1;
                    k = j1;
                } else
                {
                    int k1 = l;
                    l = k;
                    k = k1;
                }
                j1 = i1 + 1;
                i1 = k;
                k = l;
                l = i1;
                i1 = j1;
            }
            i = k;
            if (l + l1 > j)
            {
                i = k + 1;
            }
            return i;
        }

        public int getSpanIndex(int i, int j)
        {
            int k1 = getSpanSize(i);
            if (k1 != j) goto _L2; else goto _L1
_L1:
            return 0;
_L2:
            int k;
            int l;
            if (!mCacheSpanIndices || mSpanIndexCache.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            l = findReferenceIndexFromCache(i);
            if (l < 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            k = mSpanIndexCache.get(l) + getSpanSize(l);
            l++;
_L4:
            do
            {
                if (l >= i)
                {
                    continue; /* Loop/switch isn't completed */
                }
                int i1 = getSpanSize(l);
                int j1 = k + i1;
                if (j1 == j)
                {
                    k = 0;
                } else
                {
                    k = i1;
                    if (j1 <= j)
                    {
                        k = j1;
                    }
                }
                l++;
            } while (true);
            if (k + k1 > j) goto _L1; else goto _L3
_L3:
            return k;
            l = 0;
            k = 0;
              goto _L4
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanIndexCache()
        {
            mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled()
        {
            return mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean flag)
        {
            mCacheSpanIndices = flag;
        }

        public SpanSizeLookup()
        {
            mCacheSpanIndices = false;
        }
    }


    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    static final int MAIN_DIR_SPEC = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    private static final String TAG = "GridLayoutManager";
    final Rect mDecorInsets;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View mSet[];
    int mSizePerSpan;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;

    public GridLayoutManager(Context context, int i)
    {
        super(context);
        mSpanCount = -1;
        mPreLayoutSpanSizeCache = new SparseIntArray();
        mPreLayoutSpanIndexCache = new SparseIntArray();
        mSpanSizeLookup = new DefaultSpanSizeLookup();
        mDecorInsets = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int j, boolean flag)
    {
        super(context, j, flag);
        mSpanCount = -1;
        mPreLayoutSpanSizeCache = new SparseIntArray();
        mPreLayoutSpanIndexCache = new SparseIntArray();
        mSpanSizeLookup = new DefaultSpanSizeLookup();
        mDecorInsets = new Rect();
        setSpanCount(i);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, boolean flag)
    {
        int k;
        int l;
        byte byte0;
        if (flag)
        {
            k = 1;
            boolean flag1 = false;
            l = i;
            i = ((flag1) ? 1 : 0);
        } else
        {
            i--;
            k = -1;
            l = -1;
        }
        if (mOrientation == 1 && isLayoutRTL())
        {
            j--;
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

    private void cachePreLayoutSpanMapping()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
            int k = layoutparams.getViewPosition();
            mPreLayoutSpanSizeCache.put(k, layoutparams.getSpanSize());
            mPreLayoutSpanIndexCache.put(k, layoutparams.getSpanIndex());
        }

    }

    private void clearPreLayoutSpanMappingCache()
    {
        mPreLayoutSpanSizeCache.clear();
        mPreLayoutSpanIndexCache.clear();
    }

    private void ensureAnchorIsInFirstSpan(LinearLayoutManager.AnchorInfo anchorinfo)
    {
        for (int i = mSpanSizeLookup.getCachedSpanIndex(anchorinfo.mPosition, mSpanCount); i > 0 && anchorinfo.mPosition > 0; i = mSpanSizeLookup.getCachedSpanIndex(anchorinfo.mPosition, mSpanCount))
        {
            anchorinfo.mPosition = anchorinfo.mPosition - 1;
        }

    }

    private int getMainDirSpec(int i)
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
        if (!state.isPreLayout())
        {
            return mSpanSizeLookup.getSpanGroupIndex(i, mSpanCount);
        }
        int j = recycler.convertPreLayoutPositionToPostLayout(i);
        if (j == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. ").append(i).toString());
            return 0;
        } else
        {
            return mSpanSizeLookup.getSpanGroupIndex(j, mSpanCount);
        }
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
    {
        int j;
        if (!state.isPreLayout())
        {
            j = mSpanSizeLookup.getCachedSpanIndex(i, mSpanCount);
        } else
        {
            int l = mPreLayoutSpanIndexCache.get(i, -1);
            j = l;
            if (l == -1)
            {
                int k = recycler.convertPreLayoutPositionToPostLayout(i);
                if (k == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
                    return 0;
                } else
                {
                    return mSpanSizeLookup.getCachedSpanIndex(k, mSpanCount);
                }
            }
        }
        return j;
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i)
    {
        int j;
        if (!state.isPreLayout())
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
                    Log.w("GridLayoutManager", (new StringBuilder()).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i).toString());
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

    private void updateMeasurements()
    {
        int i;
        if (getOrientation() == 1)
        {
            i = getWidth() - getPaddingRight() - getPaddingLeft();
        } else
        {
            i = getHeight() - getPaddingBottom() - getPaddingTop();
        }
        mSizePerSpan = i / mSpanCount;
    }

    private int updateSpecWithExtra(int i, int j, int k)
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

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
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
        }
        if (state.getItemCount() < 1)
        {
            return 0;
        } else
        {
            return getSpanGroupIndex(recycler, state, state.getItemCount() - 1);
        }
    }

    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return mSpanCount;
        }
        if (state.getItemCount() < 1)
        {
            return 0;
        } else
        {
            return getSpanGroupIndex(recycler, state, state.getItemCount() - 1);
        }
    }

    public int getSpanCount()
    {
        return mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup()
    {
        return mSpanSizeLookup;
    }

    void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutstate, LinearLayoutManager.LayoutChunkResult layoutchunkresult)
    {
        int i;
        int k;
        int l;
        int j2;
        boolean flag1;
        int k1;
        if (layoutstate.mItemDirection == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = 0;
        k1 = 0;
        i = mSpanCount;
        j2 = l;
        k = k1;
        if (!flag1)
        {
            i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
            k = k1;
            j2 = l;
        }
_L6:
        if (j2 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0) goto _L2; else goto _L1
_L1:
        k1 = layoutstate.mCurrentPosition;
        l = getSpanSize(recycler, state, k1);
        if (l > mSpanCount)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Item at position ").append(k1).append(" requires ").append(l).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
        }
        i -= l;
        if (i >= 0) goto _L3; else goto _L2
_L2:
        View view;
        if (j2 == 0)
        {
            layoutchunkresult.mFinished = true;
            return;
        }
        break; /* Loop/switch isn't completed */
_L3:
        if ((view = layoutstate.next(recycler)) == null) goto _L2; else goto _L4
_L4:
        k += l;
        mSet[j2] = view;
        j2++;
        if (true) goto _L6; else goto _L5
_L5:
        assignSpans(recycler, state, j2, k, flag1);
        k = 0;
        int j = 0;
        while (k < j2) 
        {
            View view1 = mSet[k];
            LayoutParams layoutparams;
            int i1;
            if (layoutstate.mScrapList == null)
            {
                if (flag1)
                {
                    addView(view1);
                } else
                {
                    addView(view1, 0);
                }
            } else
            if (flag1)
            {
                addDisappearingView(view1);
            } else
            {
                addDisappearingView(view1, 0);
            }
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(getSpanSize(recycler, state, getPosition(view1)) * mSizePerSpan, 0x40000000);
            layoutparams = (LayoutParams)view1.getLayoutParams();
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(view1, i1, getMainDirSpec(layoutparams.height));
            } else
            {
                measureChildWithDecorationsAndMargin(view1, getMainDirSpec(layoutparams.width), i1);
            }
            i1 = mOrientationHelper.getDecoratedMeasurement(view1);
            if (i1 > j)
            {
                j = i1;
            }
            k++;
        }
        int j1 = getMainDirSpec(j);
        k = 0;
        while (k < j2) 
        {
            View view2 = mSet[k];
            if (mOrientationHelper.getDecoratedMeasurement(view2) != j)
            {
                int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getSpanSize(recycler, state, getPosition(view2)) * mSizePerSpan, 0x40000000);
                if (mOrientation == 1)
                {
                    measureChildWithDecorationsAndMargin(view2, l1, j1);
                } else
                {
                    measureChildWithDecorationsAndMargin(view2, j1, l1);
                }
            }
            k++;
        }
        layoutchunkresult.mConsumed = j;
        int i2 = 0;
        int k2;
        int l2;
        boolean flag;
        if (mOrientation == 1)
        {
            if (layoutstate.mLayoutDirection == -1)
            {
                i2 = layoutstate.mOffset;
                j = i2 - j;
                k = 0;
                j1 = 0;
            } else
            {
                k = layoutstate.mOffset;
                i2 = k + j;
                j = k;
                k = 0;
                j1 = 0;
            }
        } else
        if (layoutstate.mLayoutDirection == -1)
        {
            j1 = layoutstate.mOffset;
            k = j1;
            j1 -= j;
            j = 0;
        } else
        {
            j1 = layoutstate.mOffset;
            k = j + j1;
            j = 0;
        }
        flag = false;
        k2 = j1;
        l2 = j;
        j1 = ((flag) ? 1 : 0);
        j = k2;
        k2 = l2;
        while (j1 < j2) 
        {
            recycler = mSet[j1];
            state = (LayoutParams)recycler.getLayoutParams();
            if (mOrientation == 1)
            {
                j = getPaddingLeft();
                j = mSizePerSpan * ((LayoutParams) (state)).mSpanIndex + j;
                k = mOrientationHelper.getDecoratedMeasurementInOther(recycler) + j;
            } else
            {
                i2 = getPaddingTop();
                k2 = mSizePerSpan * ((LayoutParams) (state)).mSpanIndex + i2;
                i2 = mOrientationHelper.getDecoratedMeasurementInOther(recycler) + k2;
            }
            layoutDecorated(recycler, j + ((LayoutParams) (state)).leftMargin, k2 + ((LayoutParams) (state)).topMargin, k - ((LayoutParams) (state)).rightMargin, i2 - ((LayoutParams) (state)).bottomMargin);
            if (state.isItemRemoved() || state.isItemChanged())
            {
                layoutchunkresult.mIgnoreConsumed = true;
            }
            layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | recycler.isFocusable();
            j1++;
        }
        Arrays.fill(mSet, null);
        return;
    }

    void onAnchorReady(RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo)
    {
        super.onAnchorReady(state, anchorinfo);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout())
        {
            ensureAnchorIsInFirstSpan(anchorinfo);
        }
        if (mSet == null || mSet.length != mSpanCount)
        {
            mSet = new View[mSpanCount];
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, es es1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, es1);
            return;
        }
        view = (LayoutParams)layoutparams;
        int i = getSpanGroupIndex(recycler, state, view.getViewPosition());
        if (mOrientation == 0)
        {
            int j = view.getSpanIndex();
            int l = view.getSpanSize();
            boolean flag;
            if (mSpanCount > 1 && view.getSpanSize() == mSpanCount)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            es1.c(es.j.a(j, l, i, 1, flag, false));
            return;
        }
        int k = view.getSpanIndex();
        int i1 = view.getSpanSize();
        boolean flag1;
        if (mSpanCount > 1 && view.getSpanSize() == mSpanCount)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        es1.c(es.j.a(i, 1, k, i1, flag1, false));
    }

    public void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j)
    {
        mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (state.isPreLayout())
        {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    public void setSpanCount(int i)
    {
        if (i == mSpanCount)
        {
            return;
        }
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Span count should be at least 1. Provided ").append(i).toString());
        } else
        {
            mSpanCount = i;
            mSpanSizeLookup.invalidateSpanIndexCache();
            return;
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spansizelookup)
    {
        mSpanSizeLookup = spansizelookup;
    }

    public void setStackFromEnd(boolean flag)
    {
        if (flag)
        {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else
        {
            super.setStackFromEnd(false);
            return;
        }
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null;
    }

}
