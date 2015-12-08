// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;

public class PriceSliderView extends LinearLayout
{

    private static final int MOVE_DIST;
    View _down;
    private String _price;
    TextView _priceTv;
    View _up;

    public PriceSliderView(Context context)
    {
        this(context, null);
    }

    public PriceSliderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PriceSliderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301fa, this, true);
        ButterKnife.a(this);
    }

    public void moveArrows()
    {
        _up.animate().translationYBy(-MOVE_DIST);
        _down.animate().translationYBy(MOVE_DIST);
    }

    public void setPrice(String s)
    {
        _priceTv.setText(s);
    }

    static 
    {
        MOVE_DIST = (int)(Resources.dimension(0x7f0a0096) / 2.0F + (float)Constants.MARGIN_HALF);
    }
}
