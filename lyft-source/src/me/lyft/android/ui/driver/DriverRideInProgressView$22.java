// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.widget.TextView;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0 extends AsyncCall
{

    final DriverRideInProgressView this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        super.onSuccess(location);
        if (!Strings.isNullOrEmpty(location.getDisplayName()))
        {
            addressTextView.setText(location.getDisplayName());
            return;
        } else
        {
            addressTextView.setText(0x7f070064);
            return;
        }
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
