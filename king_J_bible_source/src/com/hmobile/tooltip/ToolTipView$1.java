// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tooltip;

import com.nineoldandroids.animation.Animator;

// Referenced classes of package com.hmobile.tooltip:
//            ToolTipView

class val.fToolTipViewY
    implements com.nineoldandroids.animation.torListener
{

    final ToolTipView this$0;
    private final float val$fToolTipViewX;
    private final float val$fToolTipViewY;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        animator = (android.widget..LayoutParams)getLayoutParams();
        animator.leftMargin = (int)val$fToolTipViewX;
        animator.topMargin = (int)val$fToolTipViewY;
        setX(0.0F);
        setY(0.0F);
        setLayoutParams(animator);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ator()
    {
        this$0 = final_tooltipview;
        val$fToolTipViewX = f;
        val$fToolTipViewY = F.this;
        super();
    }
}
