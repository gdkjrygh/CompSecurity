// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import android.text.Html;
import android.widget.TextView;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView

class this._cls0 extends AsyncCall
{

    final PassengerClassicRideInProgressView this$0;

    public void onFail(Throwable throwable)
    {
        rideStatusTxt.setText(getResources().getString(0x7f070225));
    }

    public void onSuccess(Long long1)
    {
        rideStatusTxt.setText(Html.fromHtml(getResources().getString(0x7f070224, new Object[] {
            long1
        })));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Long)obj);
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
