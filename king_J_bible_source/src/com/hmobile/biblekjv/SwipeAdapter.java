// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.hmobile.common.Utils;
import com.hmobile.swipeview.PageControl;
import com.hmobile.swipeview.SwipeView;
import java.util.ArrayList;

public class SwipeAdapter
{
    private class SwipeImageLoader
        implements com.hmobile.swipeview.SwipeView.OnPageChangedListener
    {

        final SwipeAdapter this$0;

        public void onPageChanged(int i, int j)
        {
            m_currentIndex = j;
            if (j > i)
            {
                if (j != mSwipeView.getPageCount() - 1)
                {
                    book = (String)m_details.get(j);
                    ((FrameLayout)mSwipeView.getChildContainer().getChildAt(j + 1)).addView(getNewView((String)m_details.get(j + 1), j + 1));
                }
                if (i != 0)
                {
                    ((FrameLayout)mSwipeView.getChildContainer().getChildAt(i - 1)).removeAllViews();
                }
            } else
            {
                if (j != 0)
                {
                    book = (String)m_details.get(j);
                    ((FrameLayout)mSwipeView.getChildContainer().getChildAt(j - 1)).addView(getNewView((String)m_details.get(j - 1), j - 1));
                }
                if (i != mSwipeView.getPageCount() - 1)
                {
                    ((FrameLayout)mSwipeView.getChildContainer().getChildAt(i + 1)).removeAllViews();
                    return;
                }
            }
        }

        private SwipeImageLoader()
        {
            this$0 = SwipeAdapter.this;
            super();
        }

        SwipeImageLoader(SwipeImageLoader swipeimageloader)
        {
            this();
        }
    }


    Activity act;
    String book;
    Context c;
    PageControl mPageControl;
    SwipeImageLoader mSwipeImageLoader;
    SwipeView mSwipeView;
    int m_currentIndex;
    ArrayList m_details;

    public SwipeAdapter(Activity activity, ArrayList arraylist, SwipeView swipeview, PageControl pagecontrol, Context context)
    {
        act = null;
        m_details = null;
        mSwipeView = null;
        m_currentIndex = 0;
        book = "";
        c = null;
        act = activity;
        m_details = arraylist;
        mSwipeView = swipeview;
        mPageControl = pagecontrol;
        c = context;
    }

    private View getNewView(String s, int i)
    {
        return null;
    }

    public void loadData()
    {
        String s;
        int i;
        try
        {
            mSwipeImageLoader = new SwipeImageLoader(null);
        }
        catch (Exception exception)
        {
            Utils.LogException(exception);
            return;
        }
        i = 0;
        if (i < m_details.size())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        s = (String)m_details.get(0);
        ((FrameLayout)mSwipeView.getChildContainer().getChildAt(0)).addView(getNewView(s, 0));
        if (m_details.size() - 1 != 0)
        {
            s = (String)m_details.get(1);
            ((FrameLayout)mSwipeView.getChildContainer().getChildAt(1)).addView(getNewView(s, 1));
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        s = (String)m_details.get(-1);
        ((FrameLayout)mSwipeView.getChildContainer().getChildAt(-1)).addView(getNewView(s, -1));
        mSwipeView.setOnPageChangedListener(mSwipeImageLoader);
        mSwipeView.setPageControl(mPageControl);
        mSwipeView.scrollToPage(0);
        return;
        mSwipeView.addView(new FrameLayout(act));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_15;
        }
    }

}
