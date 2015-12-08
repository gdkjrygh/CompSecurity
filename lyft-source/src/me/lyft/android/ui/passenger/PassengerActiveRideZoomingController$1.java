// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.analytics.studies.PassengerAnalytics;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerActiveRideZoomingController

class this._cls0
    implements android.view.ingController._cls1
{

    final PassengerActiveRideZoomingController this$0;

    public void onClick(View view)
    {
        PassengerAnalytics.trackZoomButtonTap();
        if (isFollowing())
        {
            showRoute();
            return;
        } else
        {
            follow();
            return;
        }
    }

    I()
    {
        this$0 = PassengerActiveRideZoomingController.this;
        super();
    }
}
