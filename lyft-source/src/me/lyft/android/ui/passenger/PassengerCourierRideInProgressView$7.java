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
        passengerCourierDriverAcceptedBannerView.setVisibility(8);
    }

    public void onSuccess(Long long1)
    {
        if (long1.longValue() > 0L)
        {
            pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f07030e, new Object[] {
                long1
            })));
        } else
        {
            pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f07030f)));
        }
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
