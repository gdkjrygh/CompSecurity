// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class f extends BroadcastReceiver
{

    final DownloadingService a;

    f(DownloadingService downloadingservice)
    {
        a = downloadingservice;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        DownloadingService.a(a, context, intent);
    }
}
