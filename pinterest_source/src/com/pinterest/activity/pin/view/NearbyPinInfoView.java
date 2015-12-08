// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.WebImageView;

public class NearbyPinInfoView extends LinearLayout
{

    private static final int FADE_DURATION_MS = 250;
    WebImageView _imageView;
    TextView _placeName;
    public Bitmap bitmap;

    public NearbyPinInfoView(Context context)
    {
        super(context);
    }

    public NearbyPinInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void fadeInImage(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        _imageView.setVisibility(0);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_imageView, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(250L);
        objectanimator.start();
        objectanimator.addListener(animationlistener);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        int i = (int)Resources.dimension(0x7f0a00f5);
        _imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        _imageView.setCornerRadius(i, i, 0.0F, 0.0F);
    }

    public NearbyPinInfoView populate(Pin pin, com.pinterest.ui.imageview.WebImageView.ImageListener imagelistener)
    {
        if (pin == null || pin.getPlace() == null)
        {
            return null;
        } else
        {
            _placeName.setText(pin.getPlace().getName());
            _imageView.setImageListener(imagelistener);
            _imageView.loadUrl(pin.getImageMediumUrl());
            return this;
        }
    }

    public void populate(Pin pin, Bitmap bitmap1)
    {
        _placeName.setText(pin.getPlace().getName());
        _imageView.setImageBitmap(bitmap1);
    }
}
