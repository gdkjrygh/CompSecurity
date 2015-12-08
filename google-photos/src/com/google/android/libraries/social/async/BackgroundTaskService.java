// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.async;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class BackgroundTaskService extends Service
{

    public BackgroundTaskService()
    {
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        return 2;
    }
}
