// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.jobqueue;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import fps;
import fpw;
import fpy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mmv;
import mmy;
import muz;
import noy;
import noz;
import npk;
import olm;

// Referenced classes of package com.google.android.apps.photos.jobqueue:
//            JobServiceBroadcastReceiverInternal

public class JobService extends IntentService
{

    public JobService()
    {
        super("com.google.android.apps.photos.jobqueue.JobService");
    }

    public static void a(Context context)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/jobqueue/JobServiceBroadcastReceiverInternal);
        intent.setAction("com.google.android.apps.photos.jobqueue.EXECUTE_JOBS");
        context.sendBroadcast(intent);
    }

    public static void a(Context context, long l)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/jobqueue/JobServiceBroadcastReceiverInternal);
        intent.setAction("com.google.android.apps.photos.jobqueue.EXECUTE_JOBS");
        ((AlarmManager)context.getSystemService("alarm")).set(3, l, PendingIntent.getBroadcast(context, 0, intent, 0x8000000));
    }

    public static void b(Context context)
    {
        a(context, System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(2L));
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        Context context;
        noz noz1;
        npk npk1;
        fps fps1;
        muz muz1;
        Object obj;
        long l;
        context = getApplicationContext();
        noz1 = noz.a(context, 3, "photos.JobService", new String[0]);
        l = noy.a();
        npk1 = (npk)olm.a(context, npk);
        obj = (mmv)olm.a(context, mmv);
        fps1 = (fps)olm.a(context, fps);
        muz1 = (muz)olm.a(context, muz);
        obj = ((mmv) (obj)).a(new String[] {
            "logged_in"
        }).iterator();
_L2:
        ArrayList arraylist;
        int i;
        if (((Iterator) (obj)).hasNext())
        {
            i = ((Integer)((Iterator) (obj)).next()).intValue();
            arraylist = new ArrayList();
            Object obj1 = (fpy)olm.a(context, fpy);
            fpw fpw1 = new fpw(muz1, noz1, context, i, arraylist);
            obj1 = ((fpy) (obj1)).a().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                fps1.a(i, s, 2, fpw1);
                if (npk1.a())
                {
                    fps1.a(i, s, 1, fpw1);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_262;
        }
        break MISSING_BLOCK_LABEL_241;
        mmy mmy1;
        mmy1;
        Log.e("photos.JobService", "Skipping jobs because an account disappeared.", mmy1);
        a(context);
        if (noz1.a())
        {
            noy.a("duration", l);
        }
        JobServiceBroadcastReceiverInternal.a(intent);
        return;
        fps1.a(i, arraylist);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        JobServiceBroadcastReceiverInternal.a(intent);
        throw exception;
    }
}
