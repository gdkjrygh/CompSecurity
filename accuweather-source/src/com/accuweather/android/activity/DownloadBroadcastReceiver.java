// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.accuweather.android.activity:
//            IDownloadReceiver

public class DownloadBroadcastReceiver extends BroadcastReceiver
{

    private IDownloadReceiver mDownloadReceiver;

    public DownloadBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (mDownloadReceiver != null)
        {
            if (intent.hasExtra("progress"))
            {
                int i = intent.getIntExtra("progress", 0);
                if (i > 90)
                {
                    mDownloadReceiver.onLoadingWeatherData(i);
                    return;
                }
                if (i >= 10)
                {
                    mDownloadReceiver.onOptimizingForDevice(i);
                    return;
                } else
                {
                    mDownloadReceiver.onGiveUsAMoment(i);
                    return;
                }
            }
            if (intent.hasExtra("complete"))
            {
                mDownloadReceiver.onProgressComplete();
                return;
            }
            if (intent.hasExtra("download_failed"))
            {
                mDownloadReceiver.onDownloadFailed();
                return;
            }
        }
    }

    public void setDownloadReceiver(IDownloadReceiver idownloadreceiver)
    {
        mDownloadReceiver = idownloadreceiver;
    }
}
