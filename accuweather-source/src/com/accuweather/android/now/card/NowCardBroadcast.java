// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.now.card:
//            NowCardService

public class NowCardBroadcast extends BroadcastReceiver
{

    private static final String TAG = "NowCardBroadcast";

    public NowCardBroadcast()
    {
    }

    private void cancelUpdateEveningNowCard(Context context, Intent intent)
    {
        intent = (PendingIntent)intent.getParcelableExtra("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS");
        ((AlarmManager)context.getSystemService("alarm")).cancel(intent);
    }

    private void cancelUpdateNowCard(Context context, Intent intent)
    {
        intent = (PendingIntent)intent.getParcelableExtra("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS");
        ((AlarmManager)context.getSystemService("alarm")).cancel(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        Intent intent1;
        s = intent.getAction();
        Logger.i("NowCardBroadcast", (new StringBuilder()).append("onReceiver ").append(s).toString());
        intent1 = new Intent(context, com/accuweather/android/now/card/NowCardService);
        intent1.putExtra("action", s);
        if (!"com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS".equals(s)) goto _L2; else goto _L1
_L1:
        cancelUpdateNowCard(context, intent);
_L4:
        context.startService(intent1);
        return;
_L2:
        if ("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS".equals(s))
        {
            cancelUpdateEveningNowCard(context, intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        Logger.e("NowCardBroadcast", (new StringBuilder()).append("onReceiver ").append(context.getMessage()).toString());
        return;
    }
}
