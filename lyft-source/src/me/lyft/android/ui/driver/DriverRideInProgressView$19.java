// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0 extends AsyncCall
{

    final DriverRideInProgressView this$0;

    public void onFail(Throwable throwable)
    {
        etaTextView.setText(0x7f070207);
    }

    public void onSuccess(Long long1)
    {
        if (long1.longValue() > 0L)
        {
            long1 = getResources().getString(0x7f070149, new Object[] {
                long1
            });
        } else
        {
            long1 = getResources().getString(0x7f070207);
        }
        etaTextView.setText(long1);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Long)obj);
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
