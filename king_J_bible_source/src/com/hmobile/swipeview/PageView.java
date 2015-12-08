// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.swipeview:
//            BounceSwipeView

public class PageView extends BounceSwipeView
{

    private Adapter mAdapter;
    private boolean mCarouselMode;
    private int mCurrentPage;
    private int mOffset;
    private SwipeView.OnPageChangedListener mOnPageChangedListener;

    public PageView(Context context)
    {
        super(context);
        mCarouselMode = false;
        initView();
    }

    public PageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCarouselMode = false;
        initView();
    }

    public PageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCarouselMode = false;
        initView();
    }

    private void backwardsMove()
    {
        if (mCurrentPage > 0)
        {
            mCurrentPage = mCurrentPage - 1;
        } else
        {
            mCurrentPage = getAdapterPageCount() - 1;
        }
        if (mCurrentPage > 0)
        {
            backwardsRearrange(mCurrentPage - 1);
            return;
        } else
        {
            backwardsRearrange(getAdapterPageCount() - 1);
            return;
        }
    }

    private void backwardsRearrange(int i)
    {
        View view = getChildContainer().getChildAt(2);
        getChildContainer().removeViewAt(2);
        loadPage(i, 0, view);
        resetMargins();
    }

    private void emptyCarousel()
    {
        getChildContainer().removeAllViews();
    }

    private void fillCarousel(int i)
    {
        emptyCarousel();
        if (mAdapter.getCount() == 1)
        {
            loadPage(0, 0, null);
        } else
        {
            if (mAdapter.getCount() == 2)
            {
                if (!mCarouselMode)
                {
                    loadPage(0, 0, null);
                    loadPage(1, 1, null);
                    return;
                }
                if (i == 0)
                {
                    loadPage(1, 0, null);
                    loadPage(0, 1, null);
                    loadPage(1, 2, null);
                    return;
                } else
                {
                    loadPage(0, 0, null);
                    loadPage(1, 1, null);
                    loadPage(0, 2, null);
                    return;
                }
            }
            if (mAdapter.getCount() > 2)
            {
                if (i == 0 && mCarouselMode)
                {
                    loadPage(mAdapter.getCount() - 1, 0, null);
                    loadPage(0, 1, null);
                    loadPage(1, 2, null);
                } else
                if (i == 0 && !mCarouselMode)
                {
                    loadPage(0, 0, null);
                    loadPage(1, 1, null);
                    loadPage(2, 2, null);
                } else
                if (i == mAdapter.getCount() - 1 && mCarouselMode)
                {
                    loadPage(i - 1, 0, null);
                    loadPage(mAdapter.getCount() - 1, 1, null);
                    loadPage(0, 2, null);
                } else
                if (i == mAdapter.getCount() - 1 && !mCarouselMode)
                {
                    loadPage(mAdapter.getCount() - 3, 0, null);
                    loadPage(mAdapter.getCount() - 2, 1, null);
                    loadPage(mAdapter.getCount() - 1, 2, null);
                } else
                {
                    loadPage(i - 1, 0, null);
                    loadPage(i, 1, null);
                    loadPage(i + 1, 2, null);
                }
                resetMargins();
                return;
            }
        }
    }

    private void forwardsMove()
    {
        if (mCurrentPage < getAdapterPageCount() - 1)
        {
            mCurrentPage = mCurrentPage + 1;
        } else
        {
            mCurrentPage = 0;
        }
        if (mCurrentPage < getAdapterPageCount() - 1)
        {
            forwardsRearrange(mCurrentPage + 1);
            return;
        } else
        {
            forwardsRearrange(0);
            return;
        }
    }

    private void forwardsRearrange(int i)
    {
        View view = getChildContainer().getChildAt(0);
        getChildContainer().removeViewAt(0);
        loadPage(i, 2, view);
        resetMargins();
    }

    private int getAdapterPageCount()
    {
        if (mAdapter != null)
        {
            if (mAdapter.getCount() == 2 && mCarouselMode)
            {
                return 4;
            } else
            {
                return mAdapter.getCount();
            }
        } else
        {
            return -1;
        }
    }

    private void initView()
    {
        setBounceEnabled(false);
    }

    private void loadPage(int i, int j, View view)
    {
        int k = i;
        if (mAdapter.getCount() == 2)
        {
            k = i;
            if (i > 1)
            {
                k = i - 2;
            }
        }
        super.addView(mAdapter.getView(k, view, getChildContainer()), j);
    }

    private void notifiyAssignedOnPageChangedListener(int i)
    {
label0:
        {
            if (mOnPageChangedListener != null)
            {
                if (!mCarouselMode || mCurrentPage != 0 || i != 2)
                {
                    break label0;
                }
                mOnPageChangedListener.onPageChanged(mAdapter.getCount() - 1, mCurrentPage);
            }
            return;
        }
        if (mCarouselMode && mCurrentPage == mAdapter.getCount() - 1 && i == 0)
        {
            mOnPageChangedListener.onPageChanged(0, mCurrentPage);
            return;
        }
        if (!mCarouselMode && mCurrentPage == 1 && i == 1)
        {
            mOnPageChangedListener.onPageChanged(0, 1);
            return;
        }
        if (!mCarouselMode && mCurrentPage == mAdapter.getCount() - 1 && i == mAdapter.getCount() - 1)
        {
            mOnPageChangedListener.onPageChanged(mCurrentPage, mAdapter.getCount() - 2);
            return;
        }
        if (i == 2)
        {
            mOnPageChangedListener.onPageChanged(mCurrentPage - 1, mCurrentPage);
            return;
        } else
        {
            mOnPageChangedListener.onPageChanged(mCurrentPage + 1, mCurrentPage);
            return;
        }
    }

    private void rearrangePages(final int pageToScrollTo, int i, final boolean smooth)
    {
        if (getAdapterPageCount() > 1)
        {
            if (i >= pageToScrollTo + 1)
            {
                if (mCarouselMode || mCurrentPage < getAdapterPageCount() - 2 && mCurrentPage > 0)
                {
                    mCallScrollToPageInOnLayout = false;
                    scrollTo(getScrollX() - getPageWidth(), 0);
                    forwardsMove();
                    pageToScrollTo = 1;
                } else
                if (mCurrentPage <= 0)
                {
                    mCurrentPage = 1;
                    pageToScrollTo = 1;
                } else
                {
                    mCurrentPage = getAdapterPageCount() - 1;
                    pageToScrollTo = 2;
                }
            } else
            if (i <= pageToScrollTo - 1)
            {
                if (mCarouselMode || mCurrentPage > 1 && mCurrentPage < getAdapterPageCount() - 1)
                {
                    mCallScrollToPageInOnLayout = false;
                    scrollTo(getScrollX() + getPageWidth(), 0);
                    backwardsMove();
                    pageToScrollTo = 1;
                } else
                if (mCurrentPage >= getAdapterPageCount() - 1)
                {
                    mCurrentPage = getAdapterPageCount() - 2;
                    pageToScrollTo = 1;
                } else
                {
                    mCurrentPage = 0;
                    pageToScrollTo = 0;
                }
            } else
            {
                pageToScrollTo = 1;
            }
            post(new Runnable() {

                final PageView this$0;
                private final int val$pageToScrollTo;
                private final boolean val$smooth;

                public void run()
                {
                    if (smooth)
                    {
                        smoothScrollToPage(pageToScrollTo);
                        return;
                    } else
                    {
                        scrollToPage(pageToScrollTo);
                        return;
                    }
                }

            
            {
                this$0 = PageView.this;
                smooth = flag;
                pageToScrollTo = i;
                super();
            }
            });
        }
    }

    private void refill(int i)
    {
        if (mCurrentPage != 0) goto _L2; else goto _L1
_L1:
        if (i == getAdapterPageCount() - 1 || i <= mCurrentPage + 1)
        {
            fillCarousel(mCurrentPage);
        }
_L4:
        return;
_L2:
        if (mCurrentPage != getAdapterPageCount() - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i < mCurrentPage && i != 0) goto _L4; else goto _L3
_L3:
        fillCarousel(mCurrentPage);
        return;
        if (i < mCurrentPage - 1 || i > mCurrentPage + 1) goto _L4; else goto _L5
_L5:
        fillCarousel(mCurrentPage);
        return;
    }

    private void resetMargins()
    {
        if (mOffset > 0)
        {
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(0).getLayoutParams()).leftMargin = mOffset;
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(0).getLayoutParams()).rightMargin = 0;
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(1).getLayoutParams()).leftMargin = 0;
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(1).getLayoutParams()).rightMargin = 0;
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(2).getLayoutParams()).leftMargin = 0;
            ((android.widget.LinearLayout.LayoutParams)getChildContainer().getChildAt(2).getLayoutParams()).rightMargin = mOffset;
        }
    }

    private void scrollToPage(int i, boolean flag)
    {
        if (!mCarouselMode && getCurrentPage() == getPageCount() - 1 && i >= getCurrentPage() || !mCarouselMode && getCurrentPage() == 0 && i <= 0)
        {
            doAtEdgeAnimation();
        } else
        if (getCurrentPage() != i)
        {
            rearrangePages(getCurrentPage(), i, flag);
            notifiyAssignedOnPageChangedListener(i);
            return;
        }
    }

    public Adapter getAdapter()
    {
        return mAdapter;
    }

    public boolean getCarouselEnabled()
    {
        return mCarouselMode;
    }

    public SwipeView.OnPageChangedListener getOnPageChangedListener()
    {
        return mOnPageChangedListener;
    }

    public int getRealCurrentPage()
    {
        return mCurrentPage;
    }

    public void itemAddedToAdapter(int i)
    {
        if (i <= mCurrentPage)
        {
            mCurrentPage = mCurrentPage + 1;
        }
        if (mAdapter.getCount() > 1)
        {
            setBounceEnabled(false);
        }
        refill(i);
    }

    public void itemRemovedFromAdapter(int i)
    {
        if (i <= mCurrentPage && mCurrentPage != 0)
        {
            mCurrentPage = mCurrentPage - 1;
        }
        refill(i);
    }

    public void scrollToPage(int i)
    {
        scrollToPage(i, false);
    }

    public void setAdapter(BaseAdapter baseadapter)
    {
        setAdapter(baseadapter, 0);
    }

    public void setAdapter(BaseAdapter baseadapter, final int startPosition)
    {
        mAdapter = baseadapter;
        if (mAdapter != null)
        {
            mCurrentPage = startPosition;
            fillCarousel(startPosition);
            post(new Runnable() {

                final PageView this$0;
                private final int val$startPosition;

                public void run()
                {
                    if (!mCarouselMode && startPosition == 0)
                    {
                        scrollToPage(0);
                        return;
                    }
                    if (!mCarouselMode && startPosition == mAdapter.getCount() - 1)
                    {
                        scrollToPage(2);
                        return;
                    } else
                    {
                        scrollToPage(1);
                        return;
                    }
                }

            
            {
                this$0 = PageView.this;
                startPosition = i;
                super();
            }
            });
            if (mAdapter.getCount() <= 1)
            {
                setBounceEnabled(true);
            }
        }
    }

    public void setCarouselEnabled(boolean flag)
    {
        mCarouselMode = flag;
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        setBounceEnabled(flag);
    }

    public void setOnPageChangedListener(SwipeView.OnPageChangedListener onpagechangedlistener)
    {
        mOnPageChangedListener = onpagechangedlistener;
    }

    public int setPageWidth(int i)
    {
        mOffset = super.setPageWidth(i);
        return mOffset;
    }

    public void smoothScrollToPage(int i)
    {
        scrollToPage(i, true);
    }




}
