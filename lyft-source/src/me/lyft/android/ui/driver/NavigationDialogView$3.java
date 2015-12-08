// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.driver:
//            NavigationDialogView

class this._cls0
    implements android.view.DialogView._cls3
{

    final NavigationDialogView this$0;

    public void onClick(View view)
    {
        if (routeProvider.getDriverRide().isTrainingRide())
        {
            dialogFlow.queue(new ideNavigationDialog());
        } else
        {
            navigator.navigate(NavigationDialogView.access$100(NavigationDialogView.this).getLocation());
        }
        dialogFlow.dismiss();
    }

    ideNavigationDialog()
    {
        this$0 = NavigationDialogView.this;
        super();
    }
}
