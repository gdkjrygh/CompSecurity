// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideInProgressView

class this._cls0 extends AsyncCall
{

    final PassengerCourierRideInProgressView this$0;

    public void onFail(Throwable throwable)
    {
        pickupEtaMessage.setText(0x7f0700d8);
        passengerCourierDriverAcceptedBannerView.setVisibility(0);
    }

    public void onSuccess(Long long1)
    {
        pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f0700d9, new Object[] {
            long1
        })));
        passengerCourierDriverAcceptedBannerView.setVisibility(0);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Long)obj);
    }

    ()
    {
        this$0 = PassengerCourierRideInProgressView.this;
        super();
    }
}
