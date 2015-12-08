// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView, TimeLineAdapter

class val.position
    implements Runnable
{

    final ContentListView this$0;
    final int val$position;

    public void run()
    {
        if (timeline == null || timelineAdapter == null)
        {
            return;
        } else
        {
            timeline.getLayoutManager().scrollToPosition(val$position);
            timelineAdapter.selectItem(val$position);
            return;
        }
    }

    ()
    {
        this$0 = final_contentlistview;
        val$position = I.this;
        super();
    }
}
