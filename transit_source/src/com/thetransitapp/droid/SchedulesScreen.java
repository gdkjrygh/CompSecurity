// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.thetransitapp.droid.controller.ScheduleViewController;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;

// Referenced classes of package com.thetransitapp.droid:
//            BaseItinerariesScreen

public class SchedulesScreen extends BaseItinerariesScreen
{

    private LinearLayout routeContent;
    private ListView scheduleList;
    private ScheduleViewController viewController;

    public SchedulesScreen()
    {
        super(TransitActivity.TransitScreen.SCHEDULE_SCREEN);
    }

    public ListView getScheduleList()
    {
        return scheduleList;
    }

    public void onStart()
    {
        super.onStart();
        Object obj = super.getArguments();
        if (((Bundle) (obj)).containsKey("route"))
        {
            obj = (NearbyRouteViewModel)((Bundle) (obj)).get("route");
            viewController.init(this, ((NearbyRouteViewModel) (obj)));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        scheduleList.setAdapter(viewController.getDataSource());
        scheduleList.setOnItemClickListener(viewController);
        routeContent.setOnClickListener(new android.view.View.OnClickListener() {

            final SchedulesScreen this$0;

            public void onClick(View view1)
            {
                viewController.changeDirection();
            }

            
            {
                this$0 = SchedulesScreen.this;
                super();
            }
        });
    }

    public void setSelected(int i)
    {
        scheduleList.setSelection(i);
    }

}
