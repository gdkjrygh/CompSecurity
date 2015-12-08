// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

class rformHeaderClick
    implements Runnable
{

    final StickyGridHeadersGridView this$0;
    final View val$header;
    final rformHeaderClick val$performHeaderClick;

    public void run()
    {
        mMotionHeaderPosition = -1;
        StickyGridHeadersGridView.access$202(StickyGridHeadersGridView.this, null);
        mTouchMode = -1;
        val$header.setPressed(false);
        setPressed(false);
        val$header.invalidate();
        invalidate(0, val$header.getTop(), getWidth(), val$header.getHeight());
        if (!mDataChanged)
        {
            val$performHeaderClick.run();
        }
    }

    rformHeaderClick()
    {
        this$0 = final_stickygridheadersgridview;
        val$header = view;
        val$performHeaderClick = rformHeaderClick.this;
        super();
    }
}
