// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.pinterest.kit.application.Resources;

public class ShopPinsFromButton extends Button
{

    public ShopPinsFromButton(Context context)
    {
        this(context, null);
    }

    public ShopPinsFromButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ShopPinsFromButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void bind(String s, final String canonicalMerchantDomain)
    {
        setText(Resources.string(0x7f070150, new Object[] {
            s
        }));
        setOnClickListener(new _cls1());
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ShopPinsFromButton this$0;
        final String val$canonicalMerchantDomain;

        public void onClick(View view)
        {
            Pinalytics.a(EventType.TAP, ElementType.COMMERCE_SHOP_MORE_BUTTON, null, null);
            view = new Navigation(Location.SEARCH_PIN_COMMERCE);
            view.putStringParcelable("domain", canonicalMerchantDomain);
            Events.post(view);
        }

        _cls1()
        {
            this$0 = ShopPinsFromButton.this;
            canonicalMerchantDomain = s;
            super();
        }
    }

}
