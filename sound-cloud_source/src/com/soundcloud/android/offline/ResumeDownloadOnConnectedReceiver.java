// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations, OfflineContentService

public class ResumeDownloadOnConnectedReceiver extends BroadcastReceiver
{

    private final Context context;
    private final DownloadOperations downloadOperations;
    private boolean isRegistered;

    ResumeDownloadOnConnectedReceiver(Context context1, DownloadOperations downloadoperations)
    {
        context = context1;
        downloadOperations = downloadoperations;
    }

    public void onReceive(Context context1, Intent intent)
    {
        if (downloadOperations.isValidNetwork())
        {
            OfflineContentService.start(context1);
        }
    }

    void register()
    {
        if (!isRegistered)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this, intentfilter);
            isRegistered = true;
        }
    }

    void unregister()
    {
        if (isRegistered)
        {
            context.unregisterReceiver(this);
            isRegistered = false;
        }
    }
}
