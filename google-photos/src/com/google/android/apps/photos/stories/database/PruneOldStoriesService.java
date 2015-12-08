// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories.database;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import iun;
import java.util.List;
import java.util.concurrent.TimeUnit;
import noy;
import noz;

public class PruneOldStoriesService extends IntentService
{

    private static final long a;
    private noz b;

    public PruneOldStoriesService()
    {
        super("PruneOldStoriesService");
    }

    public static void a(Context context, int i)
    {
        boolean flag;
        if (iun.a(context, i) > 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        } else
        {
            Intent intent = new Intent(context, com/google/android/apps/photos/stories/database/PruneOldStoriesService);
            intent.setData((new android.net.Uri.Builder()).scheme("account").appendPath(String.valueOf(i)).build());
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            context = PendingIntent.getService(context, 0, intent, 0);
            alarmmanager.set(1, System.currentTimeMillis() + a, context);
            return;
        }
    }

    public static boolean a(long l)
    {
        return System.currentTimeMillis() - l < TimeUnit.DAYS.toMillis(60L);
    }

    public void onCreate()
    {
        super.onCreate();
        b = noz.a(this, 3, "PruneOldStoriesService", new String[] {
            "sync"
        });
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = Integer.valueOf((String)intent.getData().getPathSegments().get(0));
        if (intent.intValue() >= 0)
        {
            if (b.a())
            {
                noy.a(intent.intValue());
                noy.a("start count", Integer.valueOf(iun.a(this, intent.intValue())));
            }
            iun.a(this, intent.intValue(), 60, 10);
            if (b.a())
            {
                noy.a("end count", Integer.valueOf(iun.a(this, intent.intValue())));
            }
        }
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
