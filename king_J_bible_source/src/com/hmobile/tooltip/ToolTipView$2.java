// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tooltip;

import android.view.ViewGroup;
import com.nineoldandroids.animation.Animator;

// Referenced classes of package com.hmobile.tooltip:
//            ToolTipView

class this._cls0
    implements com.nineoldandroids.animation.torListener
{

    final ToolTipView this$0;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (getParent() != null)
        {
            ((ViewGroup)getParent()).removeView(ToolTipView.this);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ator()
    {
        this$0 = ToolTipView.this;
        super();
    }
}
