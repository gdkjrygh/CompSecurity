// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.widget.AbsListView;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import com.uservoice.uservoicesdk.ui.PaginationScrollListener;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class er extends PaginationScrollListener
{

    final ForumActivity this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ForumActivity.access$000(ForumActivity.this) != null)
        {
            super.onScroll(abslistview, i, j, k);
        }
    }

    er(PaginatedAdapter paginatedadapter)
    {
        this$0 = ForumActivity.this;
        super(paginatedadapter);
    }
}
