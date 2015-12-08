// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.view.View;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class rformClick
    implements Runnable
{

    final TwoWayView this$0;
    final View val$child;
    final rformClick val$performClick;

    public void run()
    {
        TwoWayView.access$402(TwoWayView.this, -1);
        setPressed(false);
        val$child.setPressed(false);
        if (!TwoWayView.access$500(TwoWayView.this))
        {
            val$performClick.run();
        }
        TwoWayView.access$602(TwoWayView.this, null);
    }

    rformClick()
    {
        this$0 = final_twowayview;
        val$child = view;
        val$performClick = rformClick.this;
        super();
    }
}
