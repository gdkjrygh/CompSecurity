// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.gcm:
//            GcmRegistrar, GcmBroadcastReceiver

public class a extends IntentService
{

    private com.pinterest.base.howNotifTask.execute a;

    protected void onHandleIntent(Intent intent)
    {
        PLog.info((new StringBuilder("GCMIntentService.onMessage: ")).append(intent).toString(), new Object[0]);
        if (intent != null && intent.getExtras() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        s = intent.getAction();
        if ("com.google.android.gcm.intent.RETRY".equals(s))
        {
            GcmRegistrar.a(this, intent.getIntExtra("com.pinterest.EXTRA_RETRY_NUMBER", 3));
            return;
        }
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra(GcmBroadcastReceiver.a());
        if (intent == null || intent.isEmpty()) goto _L1; else goto _L3
_L3:
        GcmRegistrar.a(intent);
        return;
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(s) || !"gcm".equals(GoogleCloudMessaging.getInstance(this).getMessageType(intent))) goto _L1; else goto _L4
_L4:
        class ShowNotifTask extends AsyncTask
        {

            final GcmBroadcastReceiver.GcmIntentService a;
            private Intent b;
            private IntentService c;

            protected Object doInBackground(Object aobj[])
            {
                aobj = (Bundle[])aobj;
                PushNotification.a(c, ((Bundle) (aobj[0])));
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

            public ShowNotifTask(IntentService intentservice, Intent intent)
            {
                a = GcmBroadcastReceiver.GcmIntentService.this;
                super();
                b = intent;
                c = intentservice;
            }
        }

        (new ShowNotifTask(this, intent)).execute(new Bundle[] {
            intent.getExtras()
        });
        return;
    }

    public _cls1.a()
    {
        super(com/pinterest/gcm/GcmBroadcastReceiver$GcmIntentService.getSimpleName());
        class _cls1
            implements com.pinterest.base.Events.EventsSubscriber
        {

            final GcmBroadcastReceiver.GcmIntentService a;

            _cls1()
            {
                a = GcmBroadcastReceiver.GcmIntentService.this;
                super();
            }
        }

        a = new _cls1();
        Events.register(a, com/pinterest/gcm/GcmRegistrar$GcmEvent, new Class[0]);
    }
}
