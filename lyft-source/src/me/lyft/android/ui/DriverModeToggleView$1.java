// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Resources;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            DriverModeToggleView

class this._cls0
    implements Action1
{

    final DriverModeToggleView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (userProvider.getUser().isInPassengerMode())
        {
            setTextColor(getResources().getColor(0x7f0c0025));
            setText(getResources().getString(0x7f07015f));
            setBackgroundDrawable(getResources().getDrawable(0x7f0200e0));
            setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f020146), null, null, null);
            return;
        }
        if (!userProvider.getUser().isDriverLastRide())
        {
            setText(getResources().getString(0x7f070160));
            setTextColor(getResources().getColor(0x7f0c007e));
            setBackgroundDrawable(getResources().getDrawable(0x7f0200df));
            setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f020147), null, null, null);
            return;
        } else
        {
            setText(getResources().getString(0x7f07015e));
            setTextColor(getResources().getColor(0x7f0c007e));
            setBackgroundDrawable(getResources().getDrawable(0x7f0200df));
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
    }

    ()
    {
        this$0 = DriverModeToggleView.this;
        super();
    }
}
