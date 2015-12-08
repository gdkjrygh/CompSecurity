// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            DriverSetDropoffSearchView

class val.location extends AsyncCall
{

    final DriverSetDropoffSearchView this$0;
    final Location val$location;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        if (DriverSetDropoffSearchView.access$000(DriverSetDropoffSearchView.this).isForwardToNavigation())
        {
            navigator.navigate(val$location);
        }
        appFlow.goBack();
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ropoffSearch()
    {
        this$0 = final_driversetdropoffsearchview;
        val$location = Location.this;
        super();
    }
}
