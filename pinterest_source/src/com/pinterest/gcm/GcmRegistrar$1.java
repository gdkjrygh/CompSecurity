// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

// Referenced classes of package com.pinterest.gcm:
//            GcmRegistrar

final class c extends AsyncTask
{

    final GoogleCloudMessaging a;
    final int b;
    final Context c;

    private transient String a()
    {
        String s2;
        try
        {
            String s = a.register(new String[] {
                "694505692171"
            });
            s2 = (new StringBuilder("Device registered, registration ID=")).append(s).toString();
            GcmRegistrar.a(s);
        }
        catch (IOException ioexception)
        {
            String s1 = (new StringBuilder("Error :")).append(ioexception.getMessage()).toString();
            int i = b;
            Object obj = new Intent("com.google.android.gcm.intent.RETRY");
            int j = b + 1;
            ((Intent) (obj)).putExtra("com.pinterest.EXTRA_RETRY_NUMBER", j);
            obj = PendingIntent.getBroadcast(c, 0, ((Intent) (obj)), 0x10000000);
            if (j < 3)
            {
                AlarmManager alarmmanager = (AlarmManager)c.getSystemService("alarm");
                long l = SystemClock.elapsedRealtime();
                alarmmanager.set(3, (long)((1 << i) * 1000) + l, ((PendingIntent) (obj)));
            }
            return s1;
        }
        return s2;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    CloudMessaging(GoogleCloudMessaging googlecloudmessaging, int i, Context context)
    {
        a = googlecloudmessaging;
        b = i;
        c = context;
        super();
    }
}
