// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import dagger.b;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmMessageHandler

public class GcmMessageReceiver extends BroadcastReceiver
{

    GcmMessageHandler gcmMessageHandler;

    public GcmMessageReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        SoundCloudApplication.getObjectGraph().a(this);
        gcmMessageHandler.handleMessage(context, intent);
    }
}
