// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.animation.Animator;

// Referenced classes of package com.pinterest.ui.grid:
//            AdapterEmptyView

class imationListener extends com.pinterest.kit.utils.ationListener
{

    final AdapterEmptyView this$0;
    final com.pinterest.ui.anim.nUtilParams val$finalPassedParams;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        if (val$finalPassedParams.getListener() != null)
        {
            val$finalPassedParams.getListener().onAnimationCancel(animator);
        }
        AdapterEmptyView.access$702(AdapterEmptyView.this, false);
    }

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        if (val$finalPassedParams.getListener() != null)
        {
            val$finalPassedParams.getListener().onAnimationEnd(animator);
        }
        AdapterEmptyView.access$702(AdapterEmptyView.this, false);
    }

    public void onAnimationRepeat(Animator animator)
    {
        super.onAnimationRepeat(animator);
        if (val$finalPassedParams.getListener() != null)
        {
            val$finalPassedParams.getListener().onAnimationRepeat(animator);
        }
        AdapterEmptyView.access$702(AdapterEmptyView.this, true);
    }

    public void onAnimationStart(Animator animator)
    {
        super.onAnimationStart(animator);
        if (val$finalPassedParams.getListener() != null)
        {
            val$finalPassedParams.getListener().onAnimationStart(animator);
        }
        AdapterEmptyView.access$702(AdapterEmptyView.this, true);
    }

    nUtilParams()
    {
        this$0 = final_adapteremptyview;
        val$finalPassedParams = com.pinterest.ui.anim.nUtilParams.this;
        super();
    }
}
