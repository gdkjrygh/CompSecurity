// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.view.View;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipView

class val.anchorView
    implements Action1
{

    final TooltipView this$0;
    final View val$anchorView;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (getParent() == null)
        {
            return;
        } else
        {
            setVisibility(0);
            setX(TooltipView.access$100(TooltipView.this, val$anchorView));
            tooltipBottomArrow.setX(TooltipView.access$200(TooltipView.this, val$anchorView, tooltipBottomArrow, getX()));
            setY(TooltipView.access$300(TooltipView.this, val$anchorView) - getHeight());
            TooltipView.access$400(TooltipView.this, tooltipBottomArrow.getX(), tooltipBottomArrow.getY());
            return;
        }
    }

    ()
    {
        this$0 = final_tooltipview;
        val$anchorView = View.this;
        super();
    }
}
