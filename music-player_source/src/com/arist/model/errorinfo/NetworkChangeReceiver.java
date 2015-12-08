// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.errorinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.arist.model.errorinfo:
//            UploadErrorInfoService

public class NetworkChangeReceiver extends BroadcastReceiver
{

    public NetworkChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getBooleanExtra("noConnectivity", false))
        {
            context.startService(new Intent(context, com/arist/model/errorinfo/UploadErrorInfoService));
        }
    }
}
