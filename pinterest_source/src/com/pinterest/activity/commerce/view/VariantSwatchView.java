// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.ui.imageview.WebImageView;

public class VariantSwatchView extends FrameLayout
{

    WebImageView _variantCircleView;
    WebImageView _variantCircleViewSelected;
    FrameLayout _viewOutline;
    FrameLayout _viewSelected;

    public VariantSwatchView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301b3, this);
        ButterKnife.a(this);
        _variantCircleView.setOval(true);
        _variantCircleViewSelected.setOval(true);
    }

    public void bindNonSelected(String s)
    {
        _variantCircleView.loadUrl(s);
        _variantCircleView.setVisibility(0);
        _viewOutline.setVisibility(0);
        _viewSelected.setVisibility(8);
        _variantCircleViewSelected.setVisibility(8);
    }

    public void bindSelected(String s)
    {
        _variantCircleViewSelected.loadUrl(s);
        _variantCircleViewSelected.setVisibility(0);
        _viewSelected.setVisibility(0);
        _variantCircleView.setVisibility(8);
        _viewOutline.setVisibility(8);
    }
}
