// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.pinterest.activity.pin.view.modules.util:
//            PinMapMarker

class this._cls0
    implements android.animation.nimatorUpdateListener
{

    final PinMapMarker this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        _marker.setAlpha(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    A()
    {
        this$0 = PinMapMarker.this;
        super();
    }
}
