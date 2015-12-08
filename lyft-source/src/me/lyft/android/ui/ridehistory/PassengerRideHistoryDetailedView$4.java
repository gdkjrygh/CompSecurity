// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.View;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryDetailedView

class this._cls0
    implements android.view.oryDetailedView._cls4
{

    final PassengerRideHistoryDetailedView this$0;

    public void onClick(View view)
    {
        view = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append(String.format("/pricing/%s", new Object[] {
            PassengerRideHistoryDetailedView.access$300(PassengerRideHistoryDetailedView.this)
        })).toString();
        WebBrowser.open(getContext(), view);
    }

    ()
    {
        this$0 = PassengerRideHistoryDetailedView.this;
        super();
    }
}
