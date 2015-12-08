// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class HomefeedBuilderPinGridCell extends RelativeLayout
{

    WebImageView _imageView;
    private Pin _pin;

    public HomefeedBuilderPinGridCell(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderPinGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderPinGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static HomefeedBuilderPinGridCell from(View view, Context context)
    {
        if (view instanceof HomefeedBuilderPinGridCell)
        {
            return (HomefeedBuilderPinGridCell)view;
        } else
        {
            return new HomefeedBuilderPinGridCell(context);
        }
    }

    private void init()
    {
        setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(-2, -2));
        inflate(getContext(), 0x7f03015a, this);
        setPadding(0, 0, (int)Resources.dimension(0x7f0a0162), 0);
        ButterKnife.a(this);
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
        int j = Constants.CORNER_RADIUS;
        android.graphics.drawable.ShapeDrawable shapedrawable;
        int i;
        if (pin.getDominantColor() == null)
        {
            i = Constants.COLOR_GRAY;
        } else
        {
            i = Color.parseColor(pin.getDominantColor());
        }
        shapedrawable = ViewHelper.getRoundDrawable(j, i);
        _imageView.setBackgroundDrawable(shapedrawable);
        _imageView.setCornerRadius(j);
        _imageView.loadUrl(pin.getImageMediumUrl());
    }
}
