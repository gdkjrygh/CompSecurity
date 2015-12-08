// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.RideFlags;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

class this._cls0
    implements Action1
{

    final DriverCourierPickupView this$0;

    public void call(Long long1)
    {
        if (long1.longValue() >= 0L)
        {
            String s = DriverCourierPickupView.access$1500(DriverCourierPickupView.this).format(new Date(TimeUnit.SECONDS.toMillis(long1.longValue())));
            confirmationTimer.setText(s);
        }
        if (long1.longValue() == 0L)
        {
            passengerNoShowButton.setVisibility(0);
            if (!lyftPreferences.getRideFlags().isPickupConfirmationDialogShown())
            {
                confirmationInfoTextView.setText(0x7f070360);
                timeToGoView.setVisibility(0);
            }
        }
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    ()
    {
        this$0 = DriverCourierPickupView.this;
        super();
    }
}
