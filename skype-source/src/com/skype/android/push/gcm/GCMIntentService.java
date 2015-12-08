// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.gcm;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.a;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushServiceType;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push.gcm:
//            GCMBroadcastReceiver

public class GCMIntentService extends IntentService
{

    private static final Logger log = Logger.getLogger("GCM");
    private PushManager pushManager;

    public GCMIntentService()
    {
        super("GCM");
    }

    public void onCreate()
    {
        super.onCreate();
        pushManager = PushManager.getInstance(getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        Bundle bundle;
        String s;
        bundle = intent.getExtras();
        a.a(this);
        s = a.a(intent);
        if (!"send_error".equals(s)) goto _L2; else goto _L1
_L1:
        log.info((new StringBuilder("MESSAGE_TYPE_SEND_ERROR ")).append(bundle.toString()).toString());
_L4:
        GCMBroadcastReceiver.completeWakefulIntent(intent);
        return;
_L2:
        if ("deleted_messages".equals(s))
        {
            log.info((new StringBuilder("MESSAGE_TYPE_DELETED ")).append(bundle.toString()).toString());
            pushManager.onMessagesDeleted(PushServiceType.GOOGLE_GCM, intent);
        } else
        if ("gcm".equals(s))
        {
            pushManager.onMessageReceived(PushServiceType.GOOGLE_GCM, intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
