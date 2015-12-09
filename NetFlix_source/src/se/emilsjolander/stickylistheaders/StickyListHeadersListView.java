// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SectionIndexer;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            WrapperViewList, AdapterWrapper, WrapperView, SectionIndexerAdapterWrapper, 
//            StickyListHeadersAdapter

public class StickyListHeadersListView extends FrameLayout
{
    private class AdapterWrapperDataSetObserver extends DataSetObserver
    {

        final StickyListHeadersListView this$0;

        public void onChanged()
        {
            clearHeader();
        }

        public void onInvalidated()
        {
            clearHeader();
        }

        private AdapterWrapperDataSetObserver()
        {
            this$0 = StickyListHeadersListView.this;
            super();
        }

    }

    private class AdapterWrapperHeaderClickHandler
        implements AdapterWrapper.OnHeaderClickListener
    {

        final StickyListHeadersListView this$0;

        public void onHeaderClick(View view, int i, long l)
        {
            mOnHeaderClickListener.onHeaderClick(StickyListHeadersListView.this, view, i, l, false);
        }

        private AdapterWrapperHeaderClickHandler()
        {
            this$0 = StickyListHeadersListView.this;
            super();
        }

    }

    public static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick(StickyListHeadersListView stickylistheaderslistview, View view, int i, long l, boolean flag);
    }

    public static interface OnStickyHeaderChangedListener
    {

        public abstract void onStickyHeaderChanged(StickyListHeadersListView stickylistheaderslistview, View view, int i, long l);
    }

    public static interface OnStickyHeaderOffsetChangedListener
    {

        public abstract void onStickyHeaderOffsetChanged(StickyListHeadersListView stickylistheaderslistview, View view, int i);
    }

    private class WrapperListScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final StickyListHeadersListView this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (mOnScrollListenerDelegate != null)
            {
                mOnScrollListenerDelegate.onScroll(abslistview, i, j, k);
            }
            updateOrClearHeader(mList.getFixedFirstVisibleItem());
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (mOnScrollListenerDelegate != null)
            {
                mOnScrollListenerDelegate.onScrollStateChanged(abslistview, i);
            }
        }

        private WrapperListScrollListener()
        {
            this$0 = StickyListHeadersListView.this;
            super();
        }

    }

    private class WrapperViewListLifeCycleListener
        implements WrapperViewList.LifeCycleListener
    {

        final StickyListHeadersListView this$0;

        public void onDispatchDrawOccurred(Canvas canvas)
        {
label0:
            {
                if (android.os.Build.VERSION.SDK_INT < 8)
                {
                    updateOrClearHeader(mList.getFixedFirstVisibleItem());
                }
                if (mHeader != null)
                {
                    if (!mClippingToPadding)
                    {
                        break label0;
                    }
                    canvas.save();
                    canvas.clipRect(0, mPaddingTop, getRight(), getBottom());
                    drawChild(canvas, mHeader, 0L);
                    canvas.restore();
                }
                return;
            }
            drawChild(canvas, mHeader, 0L);
        }

        private WrapperViewListLifeCycleListener()
        {
            this$0 = StickyListHeadersListView.this;
            super();
        }

    }


    private AdapterWrapper mAdapter;
    private boolean mAreHeadersSticky;
    private boolean mClippingToPadding;
    private AdapterWrapperDataSetObserver mDataSetObserver;
    private Drawable mDivider;
    private int mDividerHeight;
    private View mHeader;
    private Long mHeaderId;
    private Integer mHeaderOffset;
    private Integer mHeaderPosition;
    private boolean mIsDrawingListUnderStickyHeader;
    private WrapperViewList mList;
    private OnHeaderClickListener mOnHeaderClickListener;
    private android.widget.AbsListView.OnScrollListener mOnScrollListenerDelegate;
    private OnStickyHeaderChangedListener mOnStickyHeaderChangedListener;
    private OnStickyHeaderOffsetChangedListener mOnStickyHeaderOffsetChangedListener;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;

    public StickyListHeadersListView(Context context)
    {
        this(context, null);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAreHeadersSticky = true;
        mClippingToPadding = true;
        mIsDrawingListUnderStickyHeader = true;
        mPaddingLeft = 0;
        mPaddingTop = 0;
        mPaddingRight = 0;
        mPaddingBottom = 0;
        mList = new WrapperViewList(context);
        mDivider = mList.getDivider();
        mDividerHeight = mList.getDividerHeight();
        mList.setDivider(null);
        mList.setDividerHeight(0);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        context = context.getTheme().obtainStyledAttributes(attributeset, R.styleable.StickyListHeadersListView, 0, 0);
        i = context.getDimensionPixelSize(1, 0);
        mPaddingLeft = context.getDimensionPixelSize(2, i);
        mPaddingTop = context.getDimensionPixelSize(3, i);
        mPaddingRight = context.getDimensionPixelSize(4, i);
        mPaddingBottom = context.getDimensionPixelSize(5, i);
        setPadding(mPaddingLeft, mPaddingTop, mPaddingRight, mPaddingBottom);
        mClippingToPadding = context.getBoolean(8, true);
        super.setClipToPadding(true);
        mList.setClipToPadding(mClippingToPadding);
        i = context.getInt(6, 512);
        attributeset = mList;
        boolean flag;
        if ((i & 0x200) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        attributeset.setVerticalScrollBarEnabled(flag);
        attributeset = mList;
        if ((i & 0x100) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        attributeset.setHorizontalScrollBarEnabled(flag);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            mList.setOverScrollMode(context.getInt(18, 0));
        }
        mList.setFadingEdgeLength(context.getDimensionPixelSize(7, mList.getVerticalFadingEdgeLength()));
        i = context.getInt(20, 0);
        if (i != 4096) goto _L4; else goto _L3
_L3:
        mList.setVerticalFadingEdgeEnabled(false);
        mList.setHorizontalFadingEdgeEnabled(true);
_L5:
        mList.setCacheColorHint(context.getColor(13, mList.getCacheColorHint()));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mList.setChoiceMode(context.getInt(16, mList.getChoiceMode()));
        }
        mList.setDrawSelectorOnTop(context.getBoolean(10, false));
        mList.setFastScrollEnabled(context.getBoolean(17, mList.isFastScrollEnabled()));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mList.setFastScrollAlwaysVisible(context.getBoolean(19, mList.isFastScrollAlwaysVisible()));
        }
        mList.setScrollBarStyle(context.getInt(0, 0));
        if (context.hasValue(9))
        {
            mList.setSelector(context.getDrawable(9));
        }
        mList.setScrollingCacheEnabled(context.getBoolean(11, mList.isScrollingCacheEnabled()));
        if (context.hasValue(14))
        {
            mDivider = context.getDrawable(14);
        }
        mDividerHeight = context.getDimensionPixelSize(15, mDividerHeight);
        mList.setTranscriptMode(context.getInt(12, 0));
        mAreHeadersSticky = context.getBoolean(21, true);
        mIsDrawingListUnderStickyHeader = context.getBoolean(22, true);
        context.recycle();
_L2:
        mList.setLifeCycleListener(new WrapperViewListLifeCycleListener());
        mList.setOnScrollListener(new WrapperListScrollListener());
        addView(mList);
        return;
_L4:
        if (i != 8192)
        {
            break MISSING_BLOCK_LABEL_655;
        }
        mList.setVerticalFadingEdgeEnabled(true);
        mList.setHorizontalFadingEdgeEnabled(false);
          goto _L5
        attributeset;
        context.recycle();
        throw attributeset;
        mList.setVerticalFadingEdgeEnabled(false);
        mList.setHorizontalFadingEdgeEnabled(false);
          goto _L5
    }

    private void clearHeader()
    {
        if (mHeader != null)
        {
            removeView(mHeader);
            mHeader = null;
            mHeaderId = null;
            mHeaderPosition = null;
            mHeaderOffset = null;
            mList.setTopClippingLength(0);
            updateHeaderVisibilities();
        }
    }

    private void ensureHeaderHasCorrectLayoutParams(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams != null) goto _L2; else goto _L1
_L1:
        Object obj = new android.widget.FrameLayout.LayoutParams(-1, -2);
_L4:
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return;
_L2:
        obj = layoutparams;
        if (layoutparams.height == -1)
        {
            layoutparams.height = -2;
            obj = layoutparams;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getHeaderOverlap(int i)
    {
        int j = 0;
        if (!isStartOfSection(Math.max(0, i - getHeaderViewsCount())))
        {
            View view = mAdapter.getHeaderView(i, null, mList);
            if (view == null)
            {
                throw new NullPointerException("header may not be null");
            }
            ensureHeaderHasCorrectLayoutParams(view);
            measureHeader(view);
            j = view.getMeasuredHeight();
        }
        return j;
    }

    private boolean isStartOfSection(int i)
    {
        return i == 0 || mAdapter.getHeaderId(i) != mAdapter.getHeaderId(i - 1);
    }

    private void measureHeader(View view)
    {
        if (view != null)
        {
            measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - mPaddingLeft - mPaddingRight, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    private boolean requireSdkVersion(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < i)
        {
            Log.e("StickyListHeaders", (new StringBuilder()).append("Api lvl must be at least ").append(i).append(" to call this method").toString());
            return false;
        } else
        {
            return true;
        }
    }

    private void setHeaderOffet(int i)
    {
        if (mHeaderOffset == null || mHeaderOffset.intValue() != i)
        {
            mHeaderOffset = Integer.valueOf(i);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mHeader.setTranslationY(mHeaderOffset.intValue());
            } else
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mHeader.getLayoutParams();
                marginlayoutparams.topMargin = mHeaderOffset.intValue();
                mHeader.setLayoutParams(marginlayoutparams);
            }
            if (mOnStickyHeaderOffsetChangedListener != null)
            {
                mOnStickyHeaderOffsetChangedListener.onStickyHeaderOffsetChanged(this, mHeader, -mHeaderOffset.intValue());
            }
        }
    }

    private void swapHeader(View view)
    {
        if (mHeader != null)
        {
            removeView(mHeader);
        }
        mHeader = view;
        addView(mHeader);
        mHeader.setOnClickListener(new android.view.View.OnClickListener() {

            final StickyListHeadersListView this$0;

            public void onClick(View view1)
            {
                if (mOnHeaderClickListener != null)
                {
                    mOnHeaderClickListener.onHeaderClick(StickyListHeadersListView.this, mHeader, mHeaderPosition.intValue(), mHeaderId.longValue(), true);
                }
            }

            
            {
                this$0 = StickyListHeadersListView.this;
                super();
            }
        });
    }

    private void updateHeader(int i)
    {
        if (mHeaderPosition == null || mHeaderPosition.intValue() != i)
        {
            mHeaderPosition = Integer.valueOf(i);
            long l1 = mAdapter.getHeaderId(i);
            if (mHeaderId == null || mHeaderId.longValue() != l1)
            {
                mHeaderId = Long.valueOf(l1);
                View view = mAdapter.getHeaderView(mHeaderPosition.intValue(), mHeader, this);
                if (mHeader != view)
                {
                    if (view == null)
                    {
                        throw new NullPointerException("header may not be null");
                    }
                    swapHeader(view);
                }
                ensureHeaderHasCorrectLayoutParams(mHeader);
                measureHeader(mHeader);
                if (mOnStickyHeaderChangedListener != null)
                {
                    mOnStickyHeaderChangedListener.onStickyHeaderChanged(this, mHeader, i, mHeaderId.longValue());
                }
                mHeaderOffset = null;
            }
        }
        boolean flag = false;
        int i1 = mHeader.getMeasuredHeight();
        int j;
        if (mClippingToPadding)
        {
            i = mPaddingTop;
        } else
        {
            i = 0;
        }
        j = 0;
        do
        {
label0:
            {
                int k = ((flag) ? 1 : 0);
                if (j < mList.getChildCount())
                {
                    View view1 = mList.getChildAt(j);
                    int l;
                    int j1;
                    boolean flag1;
                    if ((view1 instanceof WrapperView) && ((WrapperView)view1).hasHeader())
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    flag1 = mList.containsFooterView(view1);
                    j1 = view1.getTop();
                    if (mClippingToPadding)
                    {
                        l = mPaddingTop;
                    } else
                    {
                        l = 0;
                    }
                    if (j1 < l || k == 0 && !flag1)
                    {
                        break label0;
                    }
                    k = Math.min(view1.getTop() - (i1 + i), 0);
                }
                setHeaderOffet(k);
                if (!mIsDrawingListUnderStickyHeader)
                {
                    mList.setTopClippingLength(mHeader.getMeasuredHeight() + mHeaderOffset.intValue());
                }
                updateHeaderVisibilities();
                return;
            }
            j++;
        } while (true);
    }

    private void updateHeaderVisibilities()
    {
        int i;
        if (mHeader != null)
        {
            int j = mHeader.getMeasuredHeight();
            int k;
            if (mHeaderOffset != null)
            {
                i = mHeaderOffset.intValue();
            } else
            {
                i = 0;
            }
            i = j + i;
        } else
        if (mClippingToPadding)
        {
            i = mPaddingTop;
        } else
        {
            i = 0;
        }
        k = mList.getChildCount();
        j = 0;
        while (j < k) 
        {
            Object obj = mList.getChildAt(j);
            if (obj instanceof WrapperView)
            {
                obj = (WrapperView)obj;
                if (((WrapperView) (obj)).hasHeader())
                {
                    View view = ((WrapperView) (obj)).mHeader;
                    if (((WrapperView) (obj)).getTop() < i)
                    {
                        if (view.getVisibility() != 4)
                        {
                            view.setVisibility(4);
                        }
                    } else
                    if (view.getVisibility() != 0)
                    {
                        view.setVisibility(0);
                    }
                }
            }
            j++;
        }
    }

    private void updateOrClearHeader(int i)
    {
        int k;
        int l;
        boolean flag1 = false;
        int j;
        if (mAdapter == null)
        {
            j = 0;
        } else
        {
            j = mAdapter.getCount();
        }
        if (j == 0 || !mAreHeadersSticky)
        {
            return;
        }
        l = i - mList.getHeaderViewsCount();
        boolean flag;
        int i1;
        if (mList.getChildCount() != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 || mList.getFirstVisiblePosition() != 0) goto _L2; else goto _L1
_L1:
        i1 = mList.getChildAt(0).getTop();
        if (mClippingToPadding)
        {
            k = mPaddingTop;
        } else
        {
            k = 0;
        }
        if (i1 <= k) goto _L2; else goto _L3
_L3:
        k = 1;
_L5:
label0:
        {
            if (l <= j - 1)
            {
                flag = flag1;
                if (l >= 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (i == 0 || flag || k != 0)
        {
            clearHeader();
            return;
        } else
        {
            updateHeader(l);
            return;
        }
_L2:
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void addFooterView(View view)
    {
        mList.addFooterView(view);
    }

    public void addHeaderView(View view)
    {
        mList.addHeaderView(view);
    }

    public void addHeaderView(View view, Object obj, boolean flag)
    {
        mList.addHeaderView(view, obj, flag);
    }

    public boolean areHeadersSticky()
    {
        return mAreHeadersSticky;
    }

    public boolean canScrollVertically(int i)
    {
        return mList.canScrollVertically(i);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (mList.getVisibility() == 0 || mList.getAnimation() != null)
        {
            drawChild(canvas, mList, 0L);
        }
    }

    public StickyListHeadersAdapter getAdapter()
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.mDelegate;
        }
    }

    public boolean getAreHeadersSticky()
    {
        return areHeadersSticky();
    }

    public int getCheckedItemCount()
    {
        if (requireSdkVersion(11))
        {
            return mList.getCheckedItemCount();
        } else
        {
            return 0;
        }
    }

    public long[] getCheckedItemIds()
    {
        if (requireSdkVersion(8))
        {
            return mList.getCheckedItemIds();
        } else
        {
            return null;
        }
    }

    public int getCheckedItemPosition()
    {
        return mList.getCheckedItemPosition();
    }

    public SparseBooleanArray getCheckedItemPositions()
    {
        return mList.getCheckedItemPositions();
    }

    public int getCount()
    {
        return mList.getCount();
    }

    public Drawable getDivider()
    {
        return mDivider;
    }

    public int getDividerHeight()
    {
        return mDividerHeight;
    }

    public View getEmptyView()
    {
        return mList.getEmptyView();
    }

    public int getFirstVisiblePosition()
    {
        return mList.getFirstVisiblePosition();
    }

    public int getFooterViewsCount()
    {
        return mList.getFooterViewsCount();
    }

    public View getHeader()
    {
        return mHeader;
    }

    public int getHeaderViewsCount()
    {
        return mList.getHeaderViewsCount();
    }

    public Object getItemAtPosition(int i)
    {
        return mList.getItemAtPosition(i);
    }

    public long getItemIdAtPosition(int i)
    {
        return mList.getItemIdAtPosition(i);
    }

    public int getLastVisiblePosition()
    {
        return mList.getLastVisiblePosition();
    }

    public View getListChildAt(int i)
    {
        return mList.getChildAt(i);
    }

    public int getListChildCount()
    {
        return mList.getChildCount();
    }

    public int getOverScrollMode()
    {
        if (requireSdkVersion(9))
        {
            return mList.getOverScrollMode();
        } else
        {
            return 0;
        }
    }

    public int getPaddingBottom()
    {
        return mPaddingBottom;
    }

    public int getPaddingLeft()
    {
        return mPaddingLeft;
    }

    public int getPaddingRight()
    {
        return mPaddingRight;
    }

    public int getPaddingTop()
    {
        return mPaddingTop;
    }

    public int getPositionForView(View view)
    {
        return mList.getPositionForView(view);
    }

    public int getScrollBarStyle()
    {
        return mList.getScrollBarStyle();
    }

    public ListView getWrappedList()
    {
        return mList;
    }

    public void invalidateViews()
    {
        mList.invalidateViews();
    }

    public boolean isDrawingListUnderStickyHeader()
    {
        return mIsDrawingListUnderStickyHeader;
    }

    public boolean isFastScrollAlwaysVisible()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return false;
        } else
        {
            return mList.isFastScrollAlwaysVisible();
        }
    }

    public boolean isHorizontalScrollBarEnabled()
    {
        return mList.isHorizontalScrollBarEnabled();
    }

    public boolean isVerticalScrollBarEnabled()
    {
        return mList.isVerticalScrollBarEnabled();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = 0;
        mList.layout(0, 0, mList.getMeasuredWidth(), getHeight());
        if (mHeader != null)
        {
            j = ((android.view.ViewGroup.MarginLayoutParams)mHeader.getLayoutParams()).topMargin;
            if (mClippingToPadding)
            {
                i = mPaddingTop;
            }
            i = j + i;
            mHeader.layout(mPaddingLeft, i, mHeader.getMeasuredWidth() + mPaddingLeft, mHeader.getMeasuredHeight() + i);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        measureHeader(mHeader);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        super.onRestoreInstanceState(android.view.View.BaseSavedState.EMPTY_STATE);
        mList.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState()
    {
        if (super.onSaveInstanceState() != android.view.View.BaseSavedState.EMPTY_STATE)
        {
            throw new IllegalStateException("Handling non empty state of parent class is not implemented");
        } else
        {
            return mList.onSaveInstanceState();
        }
    }

    protected void recomputePadding()
    {
        setPadding(mPaddingLeft, mPaddingTop, mPaddingRight, mPaddingBottom);
    }

    public void removeFooterView(View view)
    {
        mList.removeFooterView(view);
    }

    public void removeHeaderView(View view)
    {
        mList.removeHeaderView(view);
    }

    public void setAdapter(StickyListHeadersAdapter stickylistheadersadapter)
    {
        if (stickylistheadersadapter == null)
        {
            mList.setAdapter(null);
            clearHeader();
            return;
        }
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
        }
        if (stickylistheadersadapter instanceof SectionIndexer)
        {
            mAdapter = new SectionIndexerAdapterWrapper(getContext(), stickylistheadersadapter);
        } else
        {
            mAdapter = new AdapterWrapper(getContext(), stickylistheadersadapter);
        }
        mDataSetObserver = new AdapterWrapperDataSetObserver();
        mAdapter.registerDataSetObserver(mDataSetObserver);
        if (mOnHeaderClickListener != null)
        {
            mAdapter.setOnHeaderClickListener(new AdapterWrapperHeaderClickHandler());
        } else
        {
            mAdapter.setOnHeaderClickListener(null);
        }
        mAdapter.setDivider(mDivider, mDividerHeight);
        mList.setAdapter(mAdapter);
        clearHeader();
    }

    public void setAreHeadersSticky(boolean flag)
    {
        mAreHeadersSticky = flag;
        if (!flag)
        {
            clearHeader();
        } else
        {
            updateOrClearHeader(mList.getFixedFirstVisibleItem());
        }
        mList.invalidate();
    }

    public void setChoiceMode(int i)
    {
        mList.setChoiceMode(i);
    }

    public void setClipToPadding(boolean flag)
    {
        if (mList != null)
        {
            mList.setClipToPadding(flag);
        }
        mClippingToPadding = flag;
    }

    public void setDivider(Drawable drawable)
    {
        mDivider = drawable;
        if (mAdapter != null)
        {
            mAdapter.setDivider(mDivider, mDividerHeight);
        }
    }

    public void setDividerHeight(int i)
    {
        mDividerHeight = i;
        if (mAdapter != null)
        {
            mAdapter.setDivider(mDivider, mDividerHeight);
        }
    }

    public void setDrawingListUnderStickyHeader(boolean flag)
    {
        mIsDrawingListUnderStickyHeader = flag;
        mList.setTopClippingLength(0);
    }

    public void setEmptyView(View view)
    {
        mList.setEmptyView(view);
    }

    public void setFastScrollAlwaysVisible(boolean flag)
    {
        if (requireSdkVersion(11))
        {
            mList.setFastScrollAlwaysVisible(flag);
        }
    }

    public void setFastScrollEnabled(boolean flag)
    {
        mList.setFastScrollEnabled(flag);
    }

    public void setHorizontalScrollBarEnabled(boolean flag)
    {
        mList.setHorizontalScrollBarEnabled(flag);
    }

    public void setItemChecked(int i, boolean flag)
    {
        mList.setItemChecked(i, flag);
    }

    public void setMultiChoiceModeListener(android.widget.AbsListView.MultiChoiceModeListener multichoicemodelistener)
    {
        if (requireSdkVersion(11))
        {
            mList.setMultiChoiceModeListener(multichoicemodelistener);
        }
    }

    public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener oncreatecontextmenulistener)
    {
        mList.setOnCreateContextMenuListener(oncreatecontextmenulistener);
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
label0:
        {
            mOnHeaderClickListener = onheaderclicklistener;
            if (mAdapter != null)
            {
                if (mOnHeaderClickListener == null)
                {
                    break label0;
                }
                mAdapter.setOnHeaderClickListener(new AdapterWrapperHeaderClickHandler());
            }
            return;
        }
        mAdapter.setOnHeaderClickListener(null);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mList.setOnItemClickListener(onitemclicklistener);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        mList.setOnItemLongClickListener(onitemlongclicklistener);
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        mOnScrollListenerDelegate = onscrolllistener;
    }

    public void setOnStickyHeaderChangedListener(OnStickyHeaderChangedListener onstickyheaderchangedlistener)
    {
        mOnStickyHeaderChangedListener = onstickyheaderchangedlistener;
    }

    public void setOnStickyHeaderOffsetChangedListener(OnStickyHeaderOffsetChangedListener onstickyheaderoffsetchangedlistener)
    {
        mOnStickyHeaderOffsetChangedListener = onstickyheaderoffsetchangedlistener;
    }

    public void setOnTouchListener(final android.view.View.OnTouchListener l)
    {
        if (l != null)
        {
            mList.setOnTouchListener(new android.view.View.OnTouchListener() {

                final StickyListHeadersListView this$0;
                final android.view.View.OnTouchListener val$l;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return l.onTouch(StickyListHeadersListView.this, motionevent);
                }

            
            {
                this$0 = StickyListHeadersListView.this;
                l = ontouchlistener;
                super();
            }
            });
            return;
        } else
        {
            mList.setOnTouchListener(null);
            return;
        }
    }

    public void setOverScrollMode(int i)
    {
        if (requireSdkVersion(9) && mList != null)
        {
            mList.setOverScrollMode(i);
        }
    }

    public void setPadding(int i, int j, int k, int l)
    {
        mPaddingLeft = i;
        mPaddingTop = j;
        mPaddingRight = k;
        mPaddingBottom = l;
        if (mList != null)
        {
            mList.setPadding(i, j, k, l);
        }
        super.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    public void setRecyclerListener(android.widget.AbsListView.RecyclerListener recyclerlistener)
    {
        mList.setRecyclerListener(recyclerlistener);
    }

    public void setScrollBarStyle(int i)
    {
        mList.setScrollBarStyle(i);
    }

    public void setSelection(int i)
    {
        setSelectionFromTop(i, 0);
    }

    public void setSelectionAfterHeaderView()
    {
        mList.setSelectionAfterHeaderView();
    }

    public void setSelectionFromTop(int i, int j)
    {
        int l = 0;
        int k;
        if (mAdapter == null)
        {
            k = 0;
        } else
        {
            k = getHeaderOverlap(i);
        }
        if (!mClippingToPadding)
        {
            l = mPaddingTop;
        }
        mList.setSelectionFromTop(i, (j + k) - l);
    }

    public void setSelector(int i)
    {
        mList.setSelector(i);
    }

    public void setSelector(Drawable drawable)
    {
        mList.setSelector(drawable);
    }

    public void setTranscriptMode(int i)
    {
        mList.setTranscriptMode(i);
    }

    public void setVerticalScrollBarEnabled(boolean flag)
    {
        mList.setVerticalScrollBarEnabled(flag);
    }

    public boolean showContextMenu()
    {
        return mList.showContextMenu();
    }

    public void smoothScrollBy(int i, int j)
    {
        if (requireSdkVersion(8))
        {
            mList.smoothScrollBy(i, j);
        }
    }

    public void smoothScrollByOffset(int i)
    {
        if (requireSdkVersion(11))
        {
            mList.smoothScrollByOffset(i);
        }
    }

    public void smoothScrollToPosition(int i)
    {
        int k;
label0:
        {
            k = 0;
            if (requireSdkVersion(8))
            {
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    break label0;
                }
                mList.smoothScrollToPosition(i);
            }
            return;
        }
        int j;
        if (mAdapter == null)
        {
            j = 0;
        } else
        {
            j = getHeaderOverlap(i);
        }
        if (!mClippingToPadding)
        {
            k = mPaddingTop;
        }
        mList.smoothScrollToPositionFromTop(i, j - k);
    }

    public void smoothScrollToPosition(int i, int j)
    {
        if (requireSdkVersion(8))
        {
            mList.smoothScrollToPosition(i, j);
        }
    }

    public void smoothScrollToPositionFromTop(int i, int j)
    {
        int l = 0;
        if (requireSdkVersion(11))
        {
            int k;
            if (mAdapter == null)
            {
                k = 0;
            } else
            {
                k = getHeaderOverlap(i);
            }
            if (!mClippingToPadding)
            {
                l = mPaddingTop;
            }
            mList.smoothScrollToPositionFromTop(i, (j + k) - l);
        }
    }

    public void smoothScrollToPositionFromTop(int i, int j, int k)
    {
        int i1 = 0;
        if (requireSdkVersion(11))
        {
            int l;
            if (mAdapter == null)
            {
                l = 0;
            } else
            {
                l = getHeaderOverlap(i);
            }
            if (!mClippingToPadding)
            {
                i1 = mPaddingTop;
            }
            mList.smoothScrollToPositionFromTop(i, (j + l) - i1, k);
        }
    }












}
