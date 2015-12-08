// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;

public class PriceTextLayout extends LinearLayout
{

    private TextView _priceSubtitleTv;
    private TextView _priceTitleTv;

    public PriceTextLayout(Context context)
    {
        super(context);
        init();
    }

    private void init()
    {
        setOrientation(0);
        _priceTitleTv = new TextView(getContext(), null, 0x7f0100d7);
        _priceTitleTv.setPadding(0, 0, (int)Resources.dimension(0x7f0a0187), 0);
        addView(_priceTitleTv, -2, -2);
        _priceSubtitleTv = new TextView(getContext(), null, 0x7f0100d8);
        _priceSubtitleTv.setVisibility(8);
        addView(_priceSubtitleTv, -2, -2);
    }

    public void hidePriceSubtitle()
    {
        _priceSubtitleTv.setVisibility(8);
    }

    public void setCommercePriceColor()
    {
        _priceTitleTv.setTextColor(Resources.color(0x7f0e0051));
    }

    public void setNonCommercePriceColor()
    {
        _priceTitleTv.setTextColor(Resources.color(0x7f0e008f));
    }

    public void setOriginalPriceStrikeThru(String s)
    {
        setPriceSubtitle(s);
        _priceSubtitleTv.setPaintFlags(_priceSubtitleTv.getPaintFlags() | 0x10);
    }

    public void setPriceSubtitle(String s)
    {
        _priceSubtitleTv.setPaintFlags(0);
        _priceSubtitleTv.setVisibility(0);
        _priceSubtitleTv.setText(s);
    }

    public void setPriceTitle(String s)
    {
        _priceTitleTv.setText(s);
    }
}
