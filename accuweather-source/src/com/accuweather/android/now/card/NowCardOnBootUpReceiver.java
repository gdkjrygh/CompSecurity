// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.accuweather.android.now.card:
//            NowCardScheduler

public class NowCardOnBootUpReceiver extends BroadcastReceiver
{

    public NowCardOnBootUpReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        (new NowCardScheduler()).scheduleGoogleNowAlarm(context);
    }
}
