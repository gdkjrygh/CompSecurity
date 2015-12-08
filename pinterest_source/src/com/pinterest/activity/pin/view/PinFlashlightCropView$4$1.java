// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class this._cls1 extends AnimatorListenerAdapter
{

    private boolean _reverseCanceled;
    final _reverseCanceled this$1;

    public void onAnimationCancel(Animator animator)
    {
        _reverseCanceled = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        PinFlashlightCropView.access$200(_fld0).removeAllListeners();
        if (_reverseCanceled)
        {
            removeCallbacks(PinFlashlightCropView.access$700(_fld0));
            return;
        } else
        {
            postDelayed(PinFlashlightCropView.access$700(_fld0), 4000L);
            return;
        }
    }

    public void onAnimationStart(Animator animator)
    {
        _reverseCanceled = false;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
