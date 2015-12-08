// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewRouteItem

class this._cls0
    implements android.view.wRouteItem._cls1
{

    final RideOverviewRouteItem this$0;

    public void onClick(View view)
    {
        RideOverviewRouteItem.access$100(RideOverviewRouteItem.this).navigate(RideOverviewRouteItem.access$000(RideOverviewRouteItem.this).getLocation());
    }

    ()
    {
        this$0 = RideOverviewRouteItem.this;
        super();
    }
}
