// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.hmobile.swipeview.SwipeView;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SwipeAdapter

private class <init>
    implements com.hmobile.swipeview.r
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
                ((FrameLayout)mSwipeView.getChildContainer().getChildAt(j + 1)).addView(SwipeAdapter.access$0(SwipeAdapter.this, (String)m_details.get(j + 1), j + 1));
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
                ((FrameLayout)mSwipeView.getChildContainer().getChildAt(j - 1)).addView(SwipeAdapter.access$0(SwipeAdapter.this, (String)m_details.get(j - 1), j - 1));
            }
            if (i != mSwipeView.getPageCount() - 1)
            {
                ((FrameLayout)mSwipeView.getChildContainer().getChildAt(i + 1)).removeAllViews();
                return;
            }
        }
    }

    private er()
    {
        this$0 = SwipeAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
