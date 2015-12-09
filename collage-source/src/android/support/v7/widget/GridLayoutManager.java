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
    int mCachedBorders[];
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View mSet[];
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;

    public GridLayoutManager(Context context, int i)
    {
        super(context);
        mPendingSpanCountChange = false;
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
        mPendingSpanCountChange = false;
        mSpanCount = -1;
        mPreLayoutSpanSizeCache = new SparseIntArray();
        mPreLayoutSpanIndexCache = new SparseIntArray();
        mSpanSizeLookup = new DefaultSpanSizeLookup();
        mDecorInsets = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mPendingSpanCountChange = false;
        mSpanCount = -1;
        mPreLayoutSpanSizeCache = new SparseIntArray();
        mPreLayoutSpanIndexCache = new SparseIntArray();
        mSpanSizeLookup = new DefaultSpanSizeLookup();
        mDecorInsets = new Rect();
        setSpanCount(getProperties(context, attributeset, i, j).spanCount);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, boolean flag)
    {
        int k;
        int l;
        byte byte0;
        if (flag)
        {
            k = 1;
            j = 0;
            l = i;
            i = j;
        } else
        {
            i--;
            k = -1;
            l = -1;
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

    private void cachePreLayoutSpanMapping()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
            int k = layoutparams.getViewLayoutPosition();
            mPreLayoutSpanSizeCache.put(k, layoutparams.getSpanSize());
            mPreLayoutSpanIndexCache.put(k, layoutparams.getSpanIndex());
        }

    }

    private void calculateItemBorders(int i)
    {
        int k = 0;
        if (mCachedBorders == null || mCachedBorders.length != mSpanCount + 1 || mCachedBorders[mCachedBorders.length - 1] != i)
        {
            mCachedBorders = new int[mSpanCount + 1];
        }
        mCachedBorders[0] = 0;
        int i1 = i / mSpanCount;
        int j1 = i % mSpanCount;
        boolean flag = true;
        int j = 0;
        i = k;
        k = ((flag) ? 1 : 0);
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
    }

    private void clearPreLayoutSpanMappingCache()
    {
        mPreLayoutSpanSizeCache.clear();
        mPreLayoutSpanIndexCache.clear();
    }

    private void ensureAnchorIsInFirstSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo)
    {
        for (int i = getSpanIndex(recycler, state, anchorinfo.mPosition); i > 0 && anchorinfo.mPosition > 0; i = getSpanIndex(recycler, state, anchorinfo.mPosition))
        {
            anchorinfo.mPosition = anchorinfo.mPosition - 1;
        }

    }

    private void ensureViewSet()
    {
        if (mSet == null || mSet.length != mSpanCount)
        {
            mSet = new View[mSpanCount];
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

    private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
    {
        RecyclerView.LayoutParams layoutparams;
        int k;
label0:
        {
            calculateItemDecorationsForChild(view, mDecorInsets);
            layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            if (!flag)
            {
                k = i;
                if (mOrientation != 1)
                {
                    break label0;
                }
            }
            k = updateSpecWithExtra(i, layoutparams.leftMargin + mDecorInsets.left, layoutparams.rightMargin + mDecorInsets.right);
        }
label1:
        {
            if (!flag)
            {
                i = j;
                if (mOrientation != 0)
                {
                    break label1;
                }
            }
            i = updateSpecWithExtra(j, layoutparams.topMargin + mDecorInsets.top, layoutparams.bottomMargin + mDecorInsets.bottom);
        }
        view.measure(k, i);
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
        calculateItemBorders(i);
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

    View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
    {
        View view;
        View view1;
        View view2;
        int i1;
        int j1;
        view1 = null;
        ensureLayoutState();
        i1 = mOrientationHelper.getStartAfterPadding();
        j1 = mOrientationHelper.getEndAfterPadding();
        int l;
        int k1;
        if (j > i)
        {
            l = 1;
        } else
        {
            l = -1;
        }
        view = null;
        if (i == j)
        {
            break; /* Loop/switch isn't completed */
        }
        view2 = getChildAt(i);
        k1 = getPosition(view2);
        if (k1 < 0 || k1 >= k)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        if (getSpanIndex(recycler, state, k1) != 0)
        {
            view2 = view1;
            view1 = view;
            view = view2;
        } else
        {
label0:
            {
                if (!((RecyclerView.LayoutParams)view2.getLayoutParams()).isItemRemoved())
                {
                    break label0;
                }
                if (view != null)
                {
                    break MISSING_BLOCK_LABEL_216;
                }
                view = view1;
                view1 = view2;
            }
        }
_L4:
        i += l;
        view2 = view1;
        view1 = view;
        view = view2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
        View view4;
        if (mOrientationHelper.getDecoratedStart(view2) < j1)
        {
            view4 = view2;
            if (mOrientationHelper.getDecoratedEnd(view2) >= i1)
            {
                break MISSING_BLOCK_LABEL_206;
            }
        }
        if (view1 != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        view1 = view;
        view = view2;
        continue; /* Loop/switch isn't completed */
_L1:
        if (view1 == null)
        {
            view1 = view;
        }
        view4 = view1;
        return view4;
        View view3 = view;
        view = view1;
        view1 = view3;
        if (true) goto _L4; else goto _L3
_L3:
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
            recycler = mSet[k];
            int i1;
            if (layoutstate.mScrapList == null)
            {
                if (flag1)
                {
                    addView(recycler);
                } else
                {
                    addView(recycler, 0);
                }
            } else
            if (flag1)
            {
                addDisappearingView(recycler);
            } else
            {
                addDisappearingView(recycler, 0);
            }
            state = (LayoutParams)recycler.getLayoutParams();
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(recycler, i1, getMainDirSpec(((LayoutParams) (state)).height), false);
            } else
            {
                measureChildWithDecorationsAndMargin(recycler, getMainDirSpec(((LayoutParams) (state)).width), i1, false);
            }
            i1 = mOrientationHelper.getDecoratedMeasurement(recycler);
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
            recycler = mSet[k];
            if (mOrientationHelper.getDecoratedMeasurement(recycler) != j)
            {
                state = (LayoutParams)recycler.getLayoutParams();
                int l1 = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
                if (mOrientation == 1)
                {
                    measureChildWithDecorationsAndMargin(recycler, l1, j1, true);
                } else
                {
                    measureChildWithDecorationsAndMargin(recycler, j1, l1, true);
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
                j = mCachedBorders[((LayoutParams) (state)).mSpanIndex] + j;
                k = mOrientationHelper.getDecoratedMeasurementInOther(recycler) + j;
            } else
            {
                i2 = getPaddingTop();
                k2 = mCachedBorders[((LayoutParams) (state)).mSpanIndex] + i2;
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

    void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo)
    {
        super.onAnchorReady(recycler, state, anchorinfo);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout())
        {
            ensureAnchorIsInFirstSpan(recycler, state, anchorinfo);
        }
        ensureViewSet();
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
            return;
        }
        view = (LayoutParams)layoutparams;
        int i = getSpanGroupIndex(recycler, state, view.getViewLayoutPosition());
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
            accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(j, l, i, 1, flag, false));
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
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, k, i1, flag1, false));
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

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
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
        if (!state.isPreLayout())
        {
            mPendingSpanCountChange = false;
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public void setSpanCount(int i)
    {
        if (i == mSpanCount)
        {
            return;
        }
        mPendingSpanCountChange = true;
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
        return mPendingSavedState == null && !mPendingSpanCountChange;
    }

}
