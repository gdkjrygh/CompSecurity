// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.jobqueue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.photos.jobqueue:
//            JobService

public class JobServiceBroadcastReceiver extends BroadcastReceiver
{

    public JobServiceBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        JobService.a(context);
    }
}
