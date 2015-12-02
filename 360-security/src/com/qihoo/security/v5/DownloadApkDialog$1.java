// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog

class a extends BroadcastReceiver
{

    final DownloadApkDialog a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if ("com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG".equals(context))
            {
                a.finish();
                a.finish();
            } else
            if ("com.qihoo.security.action.ACTION_APP_PROGRESS".equals(context))
            {
                int i = intent.getIntExtra("progress", 0);
                if (i >= 100)
                {
                    DownloadApkDialog.a(a).a();
                    return;
                } else
                {
                    DownloadApkDialog.a(a).a(i);
                    return;
                }
            }
        }
    }

    (DownloadApkDialog downloadapkdialog)
    {
        a = downloadapkdialog;
        super();
    }
}
