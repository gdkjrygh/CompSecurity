// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;
import java.lang.reflect.Field;
import java.util.ArrayList;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            AdapterWrapper, WrapperView, SectionIndexerAdapterWrapper, StickyListHeadersAdapter

public class StickyListHeadersListView extends ListView
{
    public static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick$2ffbb08c();
    }


    private AdapterWrapper mAdapter;
    private AdapterWrapper.OnHeaderClickListener mAdapterHeaderClickListener = new AdapterWrapper.OnHeaderClickListener() {

        private StickyListHeadersListView this$0;

        public final void onHeaderClick$17e13fe2()
        {
        }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>
    };
    private boolean mAreHeadersSticky;
    private final Rect mClippingRect;
    private Boolean mClippingToPadding;
    private Long mCurrentHeaderId;
    private DataSetObserver mDataSetChangedObserver = new DataSetObserver() {

        private StickyListHeadersListView this$0;

        public final void onChanged()
        {
            reset();
        }

        public final void onInvalidated()
        {
            reset();
        }

            
            {
                this$0 = StickyListHeadersListView.this;
                super();
            }
    };
    private Drawable mDivider;
    private int mDividerHeight;
    private boolean mDrawingListUnderStickyHeader;
    private ArrayList mFooterViews;
    private View mHeader;
    private boolean mHeaderBeingPressed;
    private int mHeaderBottomPosition;
    private float mHeaderDownY;
    private Integer mHeaderPosition;
    private OnHeaderClickListener mOnHeaderClickListener;
    private android.widget.AbsListView.OnScrollListener mOnScrollListener = new android.widget.AbsListView.OnScrollListener() {

        private StickyListHeadersListView this$0;

        public final void onScroll(AbsListView abslistview, int j, int k, int l)
        {
            if (mOnScrollListenerDelegate != null)
            {
                mOnScrollListenerDelegate.onScroll(abslistview, j, k, l);
            }
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                scrollChanged(j);
            }
        }

        public final void onScrollStateChanged(AbsListView abslistview, int j)
        {
            if (mOnScrollListenerDelegate != null)
            {
                mOnScrollListenerDelegate.onScrollStateChanged(abslistview, j);
            }
        }

            
            {
                this$0 = StickyListHeadersListView.this;
                super();
            }
    };
    private android.widget.AbsListView.OnScrollListener mOnScrollListenerDelegate;
    private Field mSelectorPositionField;
    private Rect mSelectorRect;
    private ViewConfiguration mViewConfig;

    public StickyListHeadersListView(Context context)
    {
        this(context, null);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAreHeadersSticky = true;
        mClippingRect = new Rect();
        mCurrentHeaderId = null;
        mHeaderDownY = -1F;
        mHeaderBeingPressed = false;
        mDrawingListUnderStickyHeader = false;
        mSelectorRect = new Rect();
        super.setOnScrollListener(mOnScrollListener);
        super.setDivider(null);
        super.setDividerHeight(0);
        mViewConfig = ViewConfiguration.get(context);
        if (mClippingToPadding == null)
        {
            mClippingToPadding = Boolean.valueOf(true);
        }
        try
        {
            context = android/widget/AbsListView.getDeclaredField("mSelectorRect");
            context.setAccessible(true);
            mSelectorRect = (Rect)context.get(this);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                mSelectorPositionField = android/widget/AbsListView.getDeclaredField("mSelectorPosition");
                mSelectorPositionField.setAccessible(true);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private static int convertDpToPixel$62b020d0(Context context)
    {
        return (int)(((float)context.getResources().getDisplayMetrics().densityDpi / 160F) * 32F);
    }

    private void drawStickyHeader(Canvas canvas)
    {
        if (mHeader == null)
        {
            return;
        }
        int i = getHeaderHeight();
        int j = mHeaderBottomPosition - i;
        mClippingRect.left = getPaddingLeft();
        mClippingRect.right = getWidth() - getPaddingRight();
        mClippingRect.bottom = i + j;
        Rect rect = mClippingRect;
        if (mClippingToPadding.booleanValue())
        {
            i = getPaddingTop();
        } else
        {
            i = 0;
        }
        rect.top = i;
        canvas.save();
        canvas.clipRect(mClippingRect);
        canvas.translate(getPaddingLeft(), j);
        mHeader.draw(canvas);
        canvas.restore();
    }

    private int fixedFirstVisibleItem(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        int k = 0;
        do
        {
label0:
            {
                int j = i;
                if (k < getChildCount())
                {
                    if (getChildAt(k).getBottom() < 0)
                    {
                        break label0;
                    }
                    j = i + k;
                }
                i = j;
                if (!mClippingToPadding.booleanValue())
                {
                    i = j;
                    if (getPaddingTop() > 0)
                    {
                        i = j;
                        if (super.getChildAt(0).getTop() > 0)
                        {
                            i = j;
                            if (j > 0)
                            {
                                return j - 1;
                            }
                        }
                    }
                }
            }
            if (true)
            {
                continue;
            }
            k++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private boolean getAreHeadersSticky()
    {
        return mAreHeadersSticky;
    }

    private int getHeaderHeight()
    {
        if (mHeader == null)
        {
            return 0;
        } else
        {
            return mHeader.getMeasuredHeight();
        }
    }

    private int getSelectorPosition()
    {
        if (mSelectorPositionField == null)
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                if (getChildAt(i).getBottom() == mSelectorRect.bottom)
                {
                    return i + fixedFirstVisibleItem(getFirstVisiblePosition());
                }
            }

            break MISSING_BLOCK_LABEL_69;
        }
        int j = mSelectorPositionField.getInt(this);
        return j;
        Object obj;
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
_L2:
        return -1;
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private StickyListHeadersAdapter getWrappedAdapter()
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.mDelegate;
        }
    }

    private boolean hasStickyHeaderAtPosition(int i)
    {
        i -= getHeaderViewsCount();
        return mAreHeadersSticky && i > 0 && i < mAdapter.getCount() && mAdapter.getHeaderId(i) == mAdapter.getHeaderId(i - 1);
    }

    private boolean isDrawingListUnderStickyHeader()
    {
        return mDrawingListUnderStickyHeader;
    }

    private boolean isScrollBarOverlay()
    {
        int i = getScrollBarStyle();
        return i == 0 || i == 0x2000000;
    }

    private void measureHeader()
    {
        int j = getWidth();
        int k = getPaddingLeft();
        int l = convertDpToPixel$62b020d0(getContext());
        int i = getScrollBarStyle();
        android.view.ViewGroup.LayoutParams layoutparams;
        if (i == 0 || i == 0x2000000)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = getVerticalScrollbarWidth();
        }
        j = android.view.View.MeasureSpec.makeMeasureSpec(j - k - l - i, 0x40000000);
        layoutparams = mHeader.getLayoutParams();
        if (layoutparams == null)
        {
            mHeader.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        }
        if (layoutparams != null && layoutparams.height > 0)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        mHeader.measure(j, i);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            mHeader.setLayoutDirection(getLayoutDirection());
        }
        mHeader.layout(getPaddingLeft(), 0, getWidth() - convertDpToPixel$62b020d0(getContext()), mHeader.getMeasuredHeight());
    }

    private void positionSelectorRect()
    {
        if (!mSelectorRect.isEmpty())
        {
            int i = getSelectorPosition();
            if (i >= 0)
            {
                Object obj = getChildAt(i - fixedFirstVisibleItem(getFirstVisiblePosition()));
                if (obj instanceof WrapperView)
                {
                    obj = (WrapperView)obj;
                    Rect rect = mSelectorRect;
                    int j = ((WrapperView) (obj)).getTop();
                    rect.top = ((WrapperView) (obj)).mItemTop + j;
                }
            }
        }
    }

    private void reset()
    {
        mHeader = null;
        mCurrentHeaderId = null;
        mHeaderPosition = null;
        mHeaderBottomPosition = -1;
    }

    private void scrollChanged(int i)
    {
        boolean flag2 = false;
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
        int l1 = getHeaderViewsCount();
        int i2 = fixedFirstVisibleItem(i) - l1;
        if (i2 < 0 || i2 > j - 1)
        {
            reset();
            updateHeaderVisibilities();
            invalidate();
            return;
        }
        if (mHeaderPosition == null || mHeaderPosition.intValue() != i2)
        {
            mHeaderPosition = Integer.valueOf(i2);
            mCurrentHeaderId = Long.valueOf(mAdapter.getHeaderId(i2));
            mHeader = mAdapter.getHeaderView(mHeaderPosition.intValue(), mHeader, this);
            int k = getWidth();
            int i1 = getPaddingLeft();
            int j1 = convertDpToPixel$62b020d0(getContext());
            i = getScrollBarStyle();
            android.view.ViewGroup.LayoutParams layoutparams;
            View view1;
            int j2;
            int k2;
            if (i == 0 || i == 0x2000000)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                i = 0;
            } else
            {
                i = getVerticalScrollbarWidth();
            }
            k = android.view.View.MeasureSpec.makeMeasureSpec(k - i1 - j1 - i, 0x40000000);
            layoutparams = mHeader.getLayoutParams();
            if (layoutparams == null)
            {
                mHeader.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            }
            if (layoutparams != null && layoutparams.height > 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            mHeader.measure(k, i);
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                mHeader.setLayoutDirection(getLayoutDirection());
            }
            mHeader.layout(getPaddingLeft(), 0, getWidth() - convertDpToPixel$62b020d0(getContext()), mHeader.getMeasuredHeight());
        }
        j2 = getChildCount();
        if (j2 != 0)
        {
            View view = null;
            k = 0x7fffffff;
            j1 = 0;
            i = 0;
            while (j1 < j2) 
            {
                view1 = super.getChildAt(j1);
                boolean flag;
                int k1;
                if (mFooterViews != null && mFooterViews.contains(view1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k2 = view1.getTop();
                if (mClippingToPadding.booleanValue())
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                k1 = k2 - k1;
                if (k1 >= 0 && (view == null || i == 0 && !((WrapperView)view).hasHeader() || (flag || ((WrapperView)view1).hasHeader()) && k1 < k))
                {
                    i = ((flag) ? 1 : 0);
                    k = k1;
                    view = view1;
                }
                j1++;
            }
            int l = getHeaderHeight();
            if (view != null && (i != 0 || ((WrapperView)view).hasHeader()))
            {
                if (i2 == l1 && super.getChildAt(0).getTop() > 0 && !mClippingToPadding.booleanValue())
                {
                    mHeaderBottomPosition = 0;
                } else
                {
                    i = ((flag1) ? 1 : 0);
                    if (mClippingToPadding.booleanValue())
                    {
                        i = getPaddingTop();
                    }
                    mHeaderBottomPosition = Math.min(view.getTop(), l + i);
                    if (mHeaderBottomPosition < i)
                    {
                        i = l + i;
                    } else
                    {
                        i = mHeaderBottomPosition;
                    }
                    mHeaderBottomPosition = i;
                }
            } else
            {
                i = ((flag2) ? 1 : 0);
                if (mClippingToPadding.booleanValue())
                {
                    i = getPaddingTop();
                }
                mHeaderBottomPosition = l + i;
            }
        }
        updateHeaderVisibilities();
        invalidate();
    }

    private void updateHeaderVisibilities()
    {
        int i;
        int j;
        int k;
        if (mClippingToPadding.booleanValue())
        {
            i = getPaddingTop();
        } else
        {
            i = 0;
        }
        k = getChildCount();
        j = 0;
        while (j < k) 
        {
            Object obj = super.getChildAt(j);
            if (!(obj instanceof WrapperView))
            {
                continue;
            }
            obj = (WrapperView)obj;
            if (((WrapperView) (obj)).hasHeader())
            {
                View view = ((WrapperView) (obj)).mHeader;
                if (((WrapperView) (obj)).getTop() < i)
                {
                    view.setVisibility(4);
                } else
                {
                    view.setVisibility(0);
                }
            }
            j++;
        }
    }

    private AdapterWrapper wrapAdapter(ListAdapter listadapter)
    {
        if (listadapter instanceof SectionIndexer)
        {
            listadapter = new SectionIndexerAdapterWrapper(getContext(), (StickyListHeadersAdapter)listadapter);
        } else
        {
            listadapter = new AdapterWrapper(getContext(), (StickyListHeadersAdapter)listadapter);
        }
        listadapter.mDivider = mDivider;
        listadapter.mDividerHeight = mDividerHeight;
        listadapter.registerDataSetObserver(mDataSetChangedObserver);
        listadapter.mOnHeaderClickListener = mAdapterHeaderClickListener;
        return listadapter;
    }

    public void addFooterView(View view)
    {
        super.addFooterView(view);
        if (mFooterViews == null)
        {
            mFooterViews = new ArrayList();
        }
        mFooterViews.add(view);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            scrollChanged(getFirstVisiblePosition());
        }
        if (!mSelectorRect.isEmpty())
        {
            int i = getSelectorPosition();
            if (i >= 0)
            {
                Object obj = getChildAt(i - fixedFirstVisibleItem(getFirstVisiblePosition()));
                if (obj instanceof WrapperView)
                {
                    obj = (WrapperView)obj;
                    Rect rect1 = mSelectorRect;
                    int j = ((WrapperView) (obj)).getTop();
                    rect1.top = ((WrapperView) (obj)).mItemTop + j;
                }
            }
        }
        if (!mAreHeadersSticky || mHeader == null)
        {
            super.dispatchDraw(canvas);
        } else
        {
            if (!mDrawingListUnderStickyHeader)
            {
                mClippingRect.set(0, mHeaderBottomPosition, getWidth(), getHeight());
                canvas.save();
                canvas.clipRect(mClippingRect);
            }
            super.dispatchDraw(canvas);
            if (!mDrawingListUnderStickyHeader)
            {
                canvas.restore();
            }
            if (mHeader != null)
            {
                int k = getHeaderHeight();
                int l = mHeaderBottomPosition - k;
                mClippingRect.left = getPaddingLeft();
                mClippingRect.right = getWidth() - getPaddingRight();
                mClippingRect.bottom = k + l;
                Rect rect = mClippingRect;
                if (mClippingToPadding.booleanValue())
                {
                    k = getPaddingTop();
                } else
                {
                    k = 0;
                }
                rect.top = k;
                canvas.save();
                canvas.clipRect(mClippingRect);
                canvas.translate(getPaddingLeft(), l);
                mHeader.draw(canvas);
                canvas.restore();
                return;
            }
        }
    }

    public final View getWrappedView(int i)
    {
        View view1 = getChildAt(i);
        View view = view1;
        if (view1 instanceof WrapperView)
        {
            view = ((WrapperView)view1).mItem;
        }
        return view;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            reset();
            scrollChanged(getFirstVisiblePosition());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i != 0 || motionevent.getY() > (float)mHeaderBottomPosition) goto _L2; else goto _L1
_L1:
        mHeaderDownY = motionevent.getY();
        mHeaderBeingPressed = true;
        mHeader.setPressed(true);
        mHeader.invalidate();
        invalidate(0, 0, getWidth(), mHeaderBottomPosition);
_L4:
        return true;
_L2:
        if (!mHeaderBeingPressed)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (Math.abs(motionevent.getY() - mHeaderDownY) >= (float)mViewConfig.getScaledTouchSlop())
        {
            break; /* Loop/switch isn't completed */
        }
        if (i == 1 || i == 3)
        {
            mHeaderDownY = -1F;
            mHeaderBeingPressed = false;
            mHeader.setPressed(false);
            mHeader.invalidate();
            invalidate(0, 0, getWidth(), mHeaderBottomPosition);
            if (mOnHeaderClickListener != null)
            {
                mHeaderPosition.intValue();
                mCurrentHeaderId.longValue();
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        mHeaderDownY = -1F;
        mHeaderBeingPressed = false;
        mHeader.setPressed(false);
        mHeader.invalidate();
        invalidate(0, 0, getWidth(), mHeaderBottomPosition);
        return super.onTouchEvent(motionevent);
    }

    public boolean performItemClick(View view, int i, long l)
    {
        View view1 = view;
        if (view instanceof WrapperView)
        {
            view1 = ((WrapperView)view).mItem;
        }
        return super.performItemClick(view1, i, l);
    }

    public boolean removeFooterView(View view)
    {
        if (super.removeFooterView(view))
        {
            mFooterViews.remove(view);
            return true;
        } else
        {
            return false;
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (isInEditMode())
        {
            super.setAdapter(listadapter);
            return;
        }
        if (listadapter == null)
        {
            mAdapter = null;
            reset();
            super.setAdapter(null);
            return;
        }
        if (!(listadapter instanceof StickyListHeadersAdapter))
        {
            throw new IllegalArgumentException("Adapter must implement StickyListHeadersAdapter");
        }
        if (listadapter instanceof SectionIndexer)
        {
            listadapter = new SectionIndexerAdapterWrapper(getContext(), (StickyListHeadersAdapter)listadapter);
        } else
        {
            listadapter = new AdapterWrapper(getContext(), (StickyListHeadersAdapter)listadapter);
        }
        listadapter.mDivider = mDivider;
        listadapter.mDividerHeight = mDividerHeight;
        listadapter.registerDataSetObserver(mDataSetChangedObserver);
        listadapter.mOnHeaderClickListener = mAdapterHeaderClickListener;
        mAdapter = listadapter;
        reset();
        super.setAdapter(mAdapter);
    }

    public void setAreHeadersSticky(boolean flag)
    {
        if (mAreHeadersSticky != flag)
        {
            mAreHeadersSticky = flag;
            requestLayout();
        }
    }

    public void setClipToPadding(boolean flag)
    {
        super.setClipToPadding(flag);
        mClippingToPadding = Boolean.valueOf(flag);
    }

    public void setDivider(Drawable drawable)
    {
        mDivider = drawable;
        if (drawable != null)
        {
            int i = drawable.getIntrinsicHeight();
            if (i >= 0)
            {
                setDividerHeight(i);
            }
        }
        if (mAdapter != null)
        {
            mAdapter.mDivider = drawable;
            requestLayout();
            invalidate();
        }
    }

    public void setDividerHeight(int i)
    {
        mDividerHeight = i;
        if (mAdapter != null)
        {
            mAdapter.mDividerHeight = i;
            requestLayout();
            invalidate();
        }
    }

    public void setDrawingListUnderStickyHeader(boolean flag)
    {
        mDrawingListUnderStickyHeader = flag;
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
        mOnHeaderClickListener = onheaderclicklistener;
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        mOnScrollListenerDelegate = onscrolllistener;
    }

    public void setSelectionFromTop(int i, int j)
    {
        int k = j;
        if (hasStickyHeaderAtPosition(i))
        {
            k = j + getHeaderHeight();
        }
        super.setSelectionFromTop(i, k);
    }

    public void smoothScrollToPositionFromTop(int i, int j)
    {
        int k = j;
        if (hasStickyHeaderAtPosition(i))
        {
            k = j + getHeaderHeight();
        }
        super.smoothScrollToPositionFromTop(i, k);
    }

    public void smoothScrollToPositionFromTop(int i, int j, int k)
    {
        int l = j;
        if (hasStickyHeaderAtPosition(i))
        {
            l = j + getHeaderHeight();
        }
        super.smoothScrollToPositionFromTop(i, l, k);
    }




}
