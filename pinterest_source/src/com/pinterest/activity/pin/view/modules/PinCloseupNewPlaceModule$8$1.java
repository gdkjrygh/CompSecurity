// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupNewPlaceModule

class this._cls1
    implements android.animation.istener
{

    final is._cls0 this$1;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PinCloseupNewPlaceModule.access$600(_fld0).setAlpha(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
