// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            ShoppingBagFragment, ga, gb

public class _cls9
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, ShoppingBagFragment shoppingbagfragment, Object obj)
    {
        shoppingbagfragment.mCartListView = (ListView)ector.tView((View)ector.w(obj, 0x7f0e01c7, "field 'mCartListView'"), 0x7f0e01c7, "field 'mCartListView'");
        shoppingbagfragment.mHeaderItemLayout = (ViewGroup)ector.temLayout((View)ector.w(obj, 0x7f0e01c1, "field 'mHeaderItemLayout'"), 0x7f0e01c1, "field 'mHeaderItemLayout'");
        shoppingbagfragment.mNumItemsInBag = (TextView)ector.sInBag((View)ector.w(obj, 0x7f0e01c2, "field 'mNumItemsInBag'"), 0x7f0e01c2, "field 'mNumItemsInBag'");
        shoppingbagfragment.mItemTotalPriceDescription = (TextView)ector.alPriceDescription((View)ector.w(obj, 0x7f0e01c3, "field 'mItemTotalPriceDescription'"), 0x7f0e01c3, "field 'mItemTotalPriceDescription'");
        shoppingbagfragment.mSavedCartItemsLayout = (ViewGroup)ector.rtItemsLayout((View)ector.w(obj, 0x7f0e01c0, "field 'mSavedCartItemsLayout'"), 0x7f0e01c0, "field 'mSavedCartItemsLayout'");
        shoppingbagfragment.mEmptyCartLayout = (ViewGroup)ector.rtLayout((View)ector.w(obj, 0x7f0e01ba, "field 'mEmptyCartLayout'"), 0x7f0e01ba, "field 'mEmptyCartLayout'");
        shoppingbagfragment.mShippingThresholdQualifyLayout = (ViewGroup)ector.gThresholdQualifyLayout((View)ector.w(obj, 0x7f0e01c4, "field 'mShippingThresholdQualifyLayout'"), 0x7f0e01c4, "field 'mShippingThresholdQualifyLayout'");
        shoppingbagfragment.mShippingThresholdQualifyTextView = (TextView)ector.gThresholdQualifyTextView((View)ector.w(obj, 0x7f0e01c6, "field 'mShippingThresholdQualifyTextView'"), 0x7f0e01c6, "field 'mShippingThresholdQualifyTextView'");
        ((View)ector.w(obj, 0x7f0e01bc, "method 'startShoppingButtonClick'")).setOnClickListener(new ga(this, shoppingbagfragment));
        ((View)ector.w(obj, 0x7f0e0095, "method 'closeButtonClick'")).setOnClickListener(new gb(this, shoppingbagfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (ShoppingBagFragment)obj, obj1);
    }

    public void reset(ShoppingBagFragment shoppingbagfragment)
    {
        shoppingbagfragment.mCartListView = null;
        shoppingbagfragment.mHeaderItemLayout = null;
        shoppingbagfragment.mNumItemsInBag = null;
        shoppingbagfragment.mItemTotalPriceDescription = null;
        shoppingbagfragment.mSavedCartItemsLayout = null;
        shoppingbagfragment.mEmptyCartLayout = null;
        shoppingbagfragment.mShippingThresholdQualifyLayout = null;
        shoppingbagfragment.mShippingThresholdQualifyTextView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((ShoppingBagFragment)obj);
    }

    public _cls9()
    {
    }
}
