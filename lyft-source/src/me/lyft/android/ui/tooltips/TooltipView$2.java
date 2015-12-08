// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipView

class val.gravity
    implements android.view.hangeListener
{

    final TooltipView this$0;
    final int val$gravity;

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (getParent() == null)
        {
            view.removeOnLayoutChangeListener(this);
        }
        TooltipView.access$000(TooltipView.this, view, val$gravity);
    }

    ()
    {
        this$0 = final_tooltipview;
        val$gravity = I.this;
        super();
    }
}
