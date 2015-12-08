// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.ValueAnimator;
import android.view.WindowManager;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls1
    implements android.animation.ener._cls1
{

    final is._cls0 this$1;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = (Integer)valueanimator.getAnimatedValue();
        LyftDriverToggleService.access$1900(_fld0)._fld0 = valueanimator.intValue();
        LyftDriverToggleService.access$2100(_fld0).updateViewLayout(LyftDriverToggleService.access$2000(_fld0), LyftDriverToggleService.access$1900(_fld0));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
