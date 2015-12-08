// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PlaceModulePinGridView

class val.pinImageView
    implements android.animation.ateListener
{

    final PlaceModulePinGridView this$0;
    final WebImageView val$pinImageView;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        val$pinImageView.setAlpha(f);
        _numPinsView.setAlpha(f);
        _dimmingLayer.setAlpha(f);
    }

    ()
    {
        this$0 = final_placemodulepingridview;
        val$pinImageView = WebImageView.this;
        super();
    }
}
