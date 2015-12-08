// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.hmobile.tooltip:
//            ToolTipView, ToolTip

public class ToolTipRelativeLayout extends RelativeLayout
{

    public ToolTipRelativeLayout(Context context)
    {
        super(context);
    }

    public ToolTipRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ToolTipRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public ToolTipView showToolTipForView(ToolTip tooltip, View view)
    {
        ToolTipView tooltipview = new ToolTipView(getContext());
        tooltipview.setToolTip(tooltip, view);
        addView(tooltipview);
        return tooltipview;
    }
}
