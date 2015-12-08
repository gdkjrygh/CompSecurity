// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            PriceSliderView

public class 
{

    public static void inject(butterknife.SliderView sliderview, PriceSliderView pricesliderview, Object obj)
    {
        pricesliderview._priceTv = (TextView)sliderview._priceTv(obj, 0x7f0f04b6, "field '_priceTv'");
        pricesliderview._up = sliderview._up(obj, 0x7f0f0017, "field '_up'");
        pricesliderview._down = sliderview._down(obj, 0x7f0f04c6, "field '_down'");
    }

    public static void reset(PriceSliderView pricesliderview)
    {
        pricesliderview._priceTv = null;
        pricesliderview._up = null;
        pricesliderview._down = null;
    }

    public ()
    {
    }
}
