// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.widget.FrameLayout;
import com.pinterest.activity.commerce.view.ProductView;

// Referenced classes of package com.pinterest.activity.commerce:
//            CheckoutFragment

public class 
{

    public static void inject(butterknife.gment gment, CheckoutFragment checkoutfragment, Object obj)
    {
        checkoutfragment._productView = (ProductView)gment.tView(obj, 0x7f0f0206, "field '_productView'");
        checkoutfragment._contentContainer = (FrameLayout)gment._contentContainer(obj, 0x7f0f0207, "field '_contentContainer'");
    }

    public static void reset(CheckoutFragment checkoutfragment)
    {
        checkoutfragment._productView = null;
        checkoutfragment._contentContainer = null;
    }

    public ()
    {
    }
}
