// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.policies.DailyUpdateService;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService

public class AlarmManagerReceiver extends BroadcastReceiver
{

    public AlarmManagerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("action_start_download".equals(intent.getAction()))
        {
            OfflineContentService.start(context);
        } else
        if ("action_start_update".equals(intent.getAction()))
        {
            DailyUpdateService.start(context);
            return;
        }
    }
}
