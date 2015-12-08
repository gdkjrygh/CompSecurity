// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.animation.Animator;
import android.view.ViewGroup;
import me.lyft.android.controls.SimpleAnimationListener;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipView

class stener extends SimpleAnimationListener
{

    final TooltipView this$0;

    public void onAnimationEnd(Animator animator)
    {
        if (getParent() != null)
        {
            ((ViewGroup)getParent()).removeView(TooltipView.this);
        }
    }

    stener()
    {
        this$0 = TooltipView.this;
        super();
    }
}
