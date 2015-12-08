// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;

import android.app.IntentService;
import android.content.Intent;
import android.os.AsyncTask;
import com.pinterest.pushnotification.PushNotification;

// Referenced classes of package com.pinterest.gcm:
//            GcmBroadcastReceiver

public class c extends AsyncTask
{

    final b a;
    private Intent b;
    private IntentService c;

    protected Object doInBackground(Object aobj[])
    {
        aobj = (android.os.Bundle[])aobj;
        PushNotification.a(c, ((android.os.Bundle) (aobj[0])));
        return null;
    }

    protected void onCancelled(Object obj)
    {
        GcmBroadcastReceiver.completeWakefulIntent(b);
    }

    protected void onPostExecute(Object obj)
    {
        GcmBroadcastReceiver.completeWakefulIntent(b);
    }

    public ( , IntentService intentservice, Intent intent)
    {
        a = ;
        super();
        b = intent;
        c = intentservice;
    }
}
