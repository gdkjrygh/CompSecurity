// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class ImageCacheCleanupService extends IntentService
{

    public ImageCacheCleanupService()
    {
        super("orca:ImageCacheCleanupService");
    }

    public static void a(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getService(context, 0, new Intent(context, com/facebook/ui/images/cache/ImageCacheCleanupService), 0);
        ((AlarmManager)context.getSystemService("alarm")).cancel(pendingintent);
    }

    protected void onHandleIntent(Intent intent)
    {
    }
}
