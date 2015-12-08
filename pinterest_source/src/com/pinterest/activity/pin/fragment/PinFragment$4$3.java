// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.pinterest.activity.flashlight.BottomSheetLayout;
import com.pinterest.activity.pin.view.PinCloseupAccessoryActionBar;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionbar.ActionBar;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class ener extends com.pinterest.kit.utils.nimationListener
{

    final is._cls0 this$1;
    final View val$pinCloseupImage;
    final ViewPropertyAnimator val$propertyAnimator;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        val$propertyAnimator.setListener(null);
        if (PinFragment.access$1300(_fld0) == null || val$pinCloseupImage == null || _rootVw == null || PinFragment.access$000(_fld0) == null || PinFragment.access$1600(_fld0) == null)
        {
            return;
        }
        PinFragment.access$1300(_fld0).getContentView().setVisibility(8);
        val$pinCloseupImage.setVisibility(0);
        PinFragment.access$1300(_fld0).removeAllViews();
        animator = _rootVw.findViewById(0x7f0f01d6);
        if (animator != null)
        {
            _rootVw.removeView(animator);
        }
        _rootVw.removeView(PinFragment.access$1300(_fld0));
        PinFragment.access$1302(_fld0, null);
        int i = Resources.integer(0x7f0d000e).intValue();
        PinFragment.access$000(_fld0).animate().translationY(0.0F).setDuration(i);
        PinFragment.access$1700(_fld0).animate().translationY(0.0F).setDuration(i);
    }

    ctionBar()
    {
        this$1 = final_ctionbar;
        val$propertyAnimator = viewpropertyanimator;
        val$pinCloseupImage = View.this;
        super();
    }
}
