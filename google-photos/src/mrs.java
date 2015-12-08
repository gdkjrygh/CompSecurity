// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.albumupload.impl.UploadSchedulerService;

public final class mrs extends BroadcastReceiver
{

    private UploadSchedulerService a;

    public mrs(UploadSchedulerService uploadschedulerservice)
    {
        a = uploadschedulerservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (b.w(a.getApplicationContext()))
        {
            context.startService(new Intent(context, com/google/android/libraries/social/albumupload/impl/UploadSchedulerService));
            context.unregisterReceiver(this);
        }
    }
}
