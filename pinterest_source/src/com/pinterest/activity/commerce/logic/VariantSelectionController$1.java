// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            VariantSelectionController

class val.currentVariantView extends com.pinterest.kit.utils.ner
{

    final VariantSelectionController this$0;
    final View val$currentVariantView;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        VariantSelectionController.access$000(VariantSelectionController.this).removeView(val$currentVariantView);
        VariantSelectionController.access$102(VariantSelectionController.this, false);
    }

    ()
    {
        this$0 = final_variantselectioncontroller;
        val$currentVariantView = View.this;
        super();
    }
}
