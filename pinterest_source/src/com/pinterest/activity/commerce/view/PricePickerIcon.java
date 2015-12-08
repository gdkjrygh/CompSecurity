// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class PricePickerIcon extends FrameLayout
{

    public static final String DEFAULT_CURRENCY = Resources.string(0x7f070120);
    public static final int NO_FILTER = -1;
    private String _price;
    TextView _priceTv;

    public PricePickerIcon(Context context)
    {
        this(context, null);
    }

    public PricePickerIcon(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PricePickerIcon(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public String getPrice()
    {
        return _price;
    }

    public int getPriceInt()
    {
        if (StringUtils.isEmpty(_price))
        {
            return -1;
        }
        int i;
        try
        {
            i = Integer.parseInt(_price.substring(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1;
        }
        return i;
    }

    public boolean hasPrice()
    {
        return StringUtils.isNotEmpty(_price);
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301fd, this, true);
        ButterKnife.a(this);
        setOnClickListener(new _cls1());
    }

    public void setPrice(String s)
    {
        _price = s;
        TextView textview = _priceTv;
        String s1 = s;
        if (StringUtils.isEmpty(s))
        {
            s1 = Resources.string(0x7f070120);
        }
        textview.setText(s1);
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PricePickerIcon this$0;

        public void onClick(View view)
        {
            PriceFilterFragment.navigate(_price, null);
        }

        _cls1()
        {
            this$0 = PricePickerIcon.this;
            super();
        }
    }

}
