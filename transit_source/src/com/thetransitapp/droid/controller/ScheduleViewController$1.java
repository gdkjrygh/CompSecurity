// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.os.Handler;
import com.thetransitapp.droid.SchedulesScreen;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;

// Referenced classes of package com.thetransitapp.droid.controller:
//            ScheduleViewController

class this._cls0
    implements Runnable
{

    final ScheduleViewController this$0;

    public void run()
    {
        if (ScheduleViewController.access$1(ScheduleViewController.this) != null && ScheduleViewController.access$1(ScheduleViewController.this).isVisible())
        {
            ScheduleViewController.access$2(ScheduleViewController.this).getCurrentItinerary().updateRealTimeDataOnList(ScheduleViewController.access$1(ScheduleViewController.this).getScheduleList());
            ScheduleViewController.access$3(ScheduleViewController.this).postDelayed(this, 30000L);
        }
    }

    ()
    {
        this$0 = ScheduleViewController.this;
        super();
    }
}
