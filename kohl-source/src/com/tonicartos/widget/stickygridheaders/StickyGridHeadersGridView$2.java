// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

class val.headerHolder
    implements Runnable
{

    final StickyGridHeadersGridView this$0;
    final View val$headerHolder;

    public void run()
    {
        invalidate(0, val$headerHolder.getTop(), getWidth(), val$headerHolder.getTop() + val$headerHolder.getHeight());
    }

    I()
    {
        this$0 = final_stickygridheadersgridview;
        val$headerHolder = View.this;
        super();
    }
}
