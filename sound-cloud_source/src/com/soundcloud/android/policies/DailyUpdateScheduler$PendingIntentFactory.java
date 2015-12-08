// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.offline.AlarmManagerReceiver;

// Referenced classes of package com.soundcloud.android.policies:
//            DailyUpdateScheduler

public static class 
{

    public PendingIntent getPendingIntent(Context context, int i)
    {
        Intent intent = new Intent(context, com/soundcloud/android/offline/AlarmManagerReceiver);
        intent.setAction("action_start_update");
        return PendingIntent.getBroadcast(context, 0x7f0f001e, intent, i);
    }

    ()
    {
    }
}
