// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            gd

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector,  , Object obj)
    {
        .Title = (TextView)ector.PickUpTitle((View)ector.PickUpTitle(obj, 0x7f0e00d0, "field 'mSameDayPickUpTitle'"), 0x7f0e00d0, "field 'mSameDayPickUpTitle'");
        .TitleExtended = (TextView)ector.PickUpTitleExtended((View)ector.PickUpTitleExtended(obj, 0x7f0e04c1, "field 'mSameDayPickUpTitleExtended'"), 0x7f0e04c1, "field 'mSameDayPickUpTitleExtended'");
        .oGeo = (ViewGroup)ector.tailsNoGeo((View)ector.tailsNoGeo(obj, 0x7f0e04c2, "field 'mStoreDetailsNoGeo'"), 0x7f0e04c2, "field 'mStoreDetailsNoGeo'");
        .asGeo = (ViewGroup)ector.tailsHasGeo((View)ector.tailsHasGeo(obj, 0x7f0e04c4, "field 'mStoreDetailsHasGeo'"), 0x7f0e04c4, "field 'mStoreDetailsHasGeo'");
        .Name = (TextView)ector.dStoreName((View)ector.dStoreName(obj, 0x7f0e04c6, "field 'mSelectedStoreName'"), 0x7f0e04c6, "field 'mSelectedStoreName'");
        .AddressStreet = (TextView)ector.dStoreAddressStreet((View)ector.dStoreAddressStreet(obj, 0x7f0e04c7, "field 'mSelectedStoreAddressStreet'"), 0x7f0e04c7, "field 'mSelectedStoreAddressStreet'");
        .AddressCity = (TextView)ector.dStoreAddressCity((View)ector.dStoreAddressCity(obj, 0x7f0e04c8, "field 'mSelectedStoreAddressCity'"), 0x7f0e04c8, "field 'mSelectedStoreAddressCity'");
        .Distance = (TextView)ector.dStoreDistance((View)ector.dStoreDistance(obj, 0x7f0e04ca, "field 'mSelectedStoreDistance'"), 0x7f0e04ca, "field 'mSelectedStoreDistance'");
        obj = (View)ector.dStoreDistance(obj, 0x7f0e04cb, "field 'mSelectStoreClickText' and method 'onClick'");
        .ickText = (TextView)ector.toreClickText(((View) (obj)), 0x7f0e04cb, "field 'mSelectStoreClickText'");
        ((View) (obj)).setOnClickListener(new gd(this, ));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.Title = null;
        inject1.TitleExtended = null;
        inject1.oGeo = null;
        inject1.asGeo = null;
        inject1.Name = null;
        inject1.AddressStreet = null;
        inject1.AddressCity = null;
        inject1.Distance = null;
        inject1.ickText = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
