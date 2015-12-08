// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.Marker;

class val.marker
    implements android.animation.istener
{

    final val.marker this$1;
    final Marker val$marker;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        val$marker.setAlpha(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    ()
    {
        this$1 = final_;
        val$marker = Marker.this;
        super();
    }
}
