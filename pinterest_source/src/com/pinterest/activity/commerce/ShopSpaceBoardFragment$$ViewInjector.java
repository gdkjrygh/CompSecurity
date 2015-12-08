// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.view.PricePickerIcon;

// Referenced classes of package com.pinterest.activity.commerce:
//            ShopSpaceBoardFragment

public class 
{

    public static void inject(butterknife.gment gment, ShopSpaceBoardFragment shopspaceboardfragment, Object obj)
    {
        com.pinterest.fragment.nject(gment, shopspaceboardfragment, obj);
        shopspaceboardfragment._pricePicker = (PricePickerIcon)gment.con(obj, 0x7f0f006c, "field '_pricePicker'");
    }

    public static void reset(ShopSpaceBoardFragment shopspaceboardfragment)
    {
        com.pinterest.fragment.eset(shopspaceboardfragment);
        shopspaceboardfragment._pricePicker = null;
    }

    public ()
    {
    }
}
