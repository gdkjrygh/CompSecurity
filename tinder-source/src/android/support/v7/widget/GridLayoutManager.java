// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.c;
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
            j = mSpanCount;
            byte0 = -1;
            j--;
        } else
        {
            byte0 = 1;
            j = 0;
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
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(i).toString());
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
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i).toString());
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
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                ensureLayoutState();
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
                view1 = null;
                while (i != j) 
                {
                    View view2 = getChildAt(i);
                    int k1 = getPosition(view2);
                    if (k1 >= 0 && k1 < k && getSpanIndex(recycler, state, k1) == 0)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).isItemRemoved())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (mOrientationHelper.getDecoratedStart(view2) < j1)
                            {
                                view3 = view2;
                                if (mOrientationHelper.getDecoratedEnd(view2) >= i1)
                                {
                                    break label1;
                                }
                            }
                            if (view == null)
                            {
                                view = view2;
                            }
                        }
                    }
                    i += l;
                }
                if (view == null)
                {
                    break label0;
                }
                view3 = view;
            }
            return view3;
        }
        return view1;
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
        if (state.getItemCount() <= 0)
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
        if (state.getItemCount() <= 0)
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
        int j;
        int k;
        int l;
        int i1;
        boolean flag2;
        if (layoutstate.mItemDirection == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        k = 0;
        l = 0;
        i = mSpanCount;
        i1 = k;
        j = l;
        if (!flag2)
        {
            i = getSpanIndex(recycler, state, layoutstate.mCurrentPosition) + getSpanSize(recycler, state, layoutstate.mCurrentPosition);
            j = l;
            i1 = k;
        }
        do
        {
            if (i1 >= mSpanCount || !layoutstate.hasMore(state) || i <= 0)
            {
                break;
            }
            l = layoutstate.mCurrentPosition;
            k = getSpanSize(recycler, state, l);
            if (k > mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(l).append(" requires ").append(k).append(" spans but GridLayoutManager has only ").append(mSpanCount).append(" spans.").toString());
            }
            i -= k;
            if (i < 0)
            {
                break;
            }
            View view = layoutstate.next(recycler);
            if (view == null)
            {
                break;
            }
            j += k;
            mSet[i1] = view;
            i1++;
        } while (true);
        if (i1 == 0)
        {
            layoutchunkresult.mFinished = true;
            return;
        }
        assignSpans(recycler, state, i1, j, flag2);
        j = 0;
        i = 0;
        while (j < i1) 
        {
            recycler = mSet[j];
            if (layoutstate.mScrapList == null)
            {
                if (flag2)
                {
                    addView(recycler);
                } else
                {
                    addView(recycler, 0);
                }
            } else
            if (flag2)
            {
                addDisappearingView(recycler);
            } else
            {
                addDisappearingView(recycler, 0);
            }
            state = (LayoutParams)recycler.getLayoutParams();
            k = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(recycler, k, getMainDirSpec(((LayoutParams) (state)).height), false);
            } else
            {
                measureChildWithDecorationsAndMargin(recycler, getMainDirSpec(((LayoutParams) (state)).width), k, false);
            }
            k = mOrientationHelper.getDecoratedMeasurement(recycler);
            if (k > i)
            {
                i = k;
            }
            j++;
        }
        k = getMainDirSpec(i);
        j = 0;
        while (j < i1) 
        {
            recycler = mSet[j];
            if (mOrientationHelper.getDecoratedMeasurement(recycler) != i)
            {
                state = (LayoutParams)recycler.getLayoutParams();
                l = android.view.View.MeasureSpec.makeMeasureSpec(mCachedBorders[((LayoutParams) (state)).mSpanIndex + ((LayoutParams) (state)).mSpanSize] - mCachedBorders[((LayoutParams) (state)).mSpanIndex], 0x40000000);
                if (mOrientation == 1)
                {
                    measureChildWithDecorationsAndMargin(recycler, l, k, true);
                } else
                {
                    measureChildWithDecorationsAndMargin(recycler, k, l, true);
                }
            }
            j++;
        }
        layoutchunkresult.mConsumed = i;
        int j1 = 0;
        int k1;
        boolean flag;
        boolean flag1;
        if (mOrientation == 1)
        {
            if (layoutstate.mLayoutDirection == -1)
            {
                j = layoutstate.mOffset;
                k = 0;
                l = j;
                j -= i;
                i = l;
                l = j1;
            } else
            {
                j = layoutstate.mOffset;
                i += j;
                k = 0;
                l = j1;
            }
        } else
        if (layoutstate.mLayoutDirection == -1)
        {
            k = layoutstate.mOffset;
            l = k - i;
            i = 0;
            j = 0;
        } else
        {
            l = layoutstate.mOffset;
            j = 0;
            k = i + l;
            i = 0;
        }
        flag1 = false;
        j1 = k;
        k1 = i;
        flag = l;
        k = ((flag1) ? 1 : 0);
        i = j1;
        l = k1;
        j1 = ((flag) ? 1 : 0);
        while (k < i1) 
        {
            recycler = mSet[k];
            state = (LayoutParams)recycler.getLayoutParams();
            if (mOrientation == 1)
            {
                j1 = getPaddingLeft() + mCachedBorders[((LayoutParams) (state)).mSpanIndex];
                i = mOrientationHelper.getDecoratedMeasurementInOther(recycler);
                i += j1;
            } else
            {
                j = getPaddingTop();
                j = mCachedBorders[((LayoutParams) (state)).mSpanIndex] + j;
                l = mOrientationHelper.getDecoratedMeasurementInOther(recycler) + j;
            }
            layoutDecorated(recycler, j1 + ((LayoutParams) (state)).leftMargin, j + ((LayoutParams) (state)).topMargin, i - ((LayoutParams) (state)).rightMargin, l - ((LayoutParams) (state)).bottomMargin);
            if (state.isItemRemoved() || state.isItemChanged())
            {
                layoutchunkresult.mIgnoreConsumed = true;
            }
            layoutchunkresult.mFocusable = layoutchunkresult.mFocusable | recycler.isFocusable();
            k++;
        }
        Arrays.fill(mSet, null);
    }

    void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorinfo)
    {
        super.onAnchorReady(recycler, state, anchorinfo);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout())
        {
            ensureAnchorIsInFirstSpan(recycler, state, anchorinfo);
        }
        if (mSet == null || mSet.length != mSpanCount)
        {
            mSet = new View[mSpanCount];
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, c c1)
    {
        boolean flag2 = false;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1);
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
            c1.a(android.support.v4.view.a.c.l.a(j, l, i, 1, flag));
            return;
        }
        int k = view.getSpanIndex();
        int i1 = view.getSpanSize();
        boolean flag1 = flag2;
        if (mSpanCount > 1)
        {
            flag1 = flag2;
            if (view.getSpanSize() == mSpanCount)
            {
                flag1 = true;
            }
        }
        c1.a(android.support.v4.view.a.c.l.a(i, 1, k, i1, flag1));
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

    public void setSpanCount(int i)
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
