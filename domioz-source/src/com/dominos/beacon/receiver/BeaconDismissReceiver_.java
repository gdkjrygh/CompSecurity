// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.receiver;

import android.content.Context;
import android.content.Intent;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.beacon.receiver:
//            BeaconDismissReceiver

public final class BeaconDismissReceiver_ extends BeaconDismissReceiver
{

    public BeaconDismissReceiver_()
    {
    }

    private void init_(Context context)
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }
}
