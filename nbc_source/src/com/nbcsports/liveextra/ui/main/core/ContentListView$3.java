// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView, ContentListPresenter

class scrolledDistance extends android.support.v7.widget.ollListener
{

    private static final int HIDE_THRESHOLD = 20;
    public boolean hasScrolled;
    private int scrolledDistance;
    final ContentListView this$0;

    public void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        super.onScrollStateChanged(recyclerview, i);
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            hasScrolled = false;
            break;
        }
        scrolledDistance = 0;
    }

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        super.onScrolled(recyclerview, i, j);
        ContentListView.access$000(ContentListView.this);
        if (ContentListView.access$100(ContentListView.this) != null && !hasScrolled && getPresenter().canHideTimeline())
        {
            boolean flag;
            if (timelineWrapper.getVisibility() == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (layoutManager.findFirstCompletelyVisibleItemPosition() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            while (false) 
            {
                if ((!flag || i == 0) && scrolledDistance > 20 && i == 0 && !flag)
                {
                    hasScrolled = true;
                    onShowTimeline();
                }
                if (i == 0 && j > 0)
                {
                    scrolledDistance = scrolledDistance + j;
                    return;
                }
            }
        }
    }

    er()
    {
        this$0 = ContentListView.this;
        super();
        scrolledDistance = 0;
    }
}
