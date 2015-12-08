// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.google.android.gms.ads.purchase.InAppPurchase;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements InAppPurchaseListener
{

    final OverlayShareMenuFragment a;

    public void onInAppPurchaseRequested(InAppPurchase inapppurchase)
    {
        inapppurchase = PICAppRoutesService.d(PICAppRoutesService.b(inapppurchase.getProductId()));
        inapppurchase.putExtra("extra_from_iap", true);
        a.getActivity().startService(inapppurchase);
    }

    (OverlayShareMenuFragment overlaysharemenufragment)
    {
        a = overlaysharemenufragment;
        super();
    }
}
