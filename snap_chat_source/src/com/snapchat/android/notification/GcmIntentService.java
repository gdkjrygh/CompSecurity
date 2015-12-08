// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import Bt;
import CJ;
import Ei;
import Kl;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import mb;
import oV;

// Referenced classes of package com.snapchat.android.notification:
//            GcmMessageReceiver

public class GcmIntentService extends IntentService
{

    private final Ei a;

    public GcmIntentService()
    {
        this(Ei.a(), Bt.a());
    }

    GcmIntentService(Ei ei, Bt bt)
    {
        super("GcmIntentService");
        a = ei;
    }

    protected void onHandleIntent(Intent intent)
    {
        String s1 = GoogleCloudMessaging.getInstance(this).getMessageType(intent);
        StringBuilder stringbuilder = (new StringBuilder("onHandleIntent messageType=")).append(s1).append(", intent=").append(intent).append(", extras=");
        Object obj;
        if (intent == null)
        {
            obj = null;
        } else
        {
            obj = intent.getExtras();
        }
        Timber.c("GcmIntentService", stringbuilder.append(obj).toString(), new Object[0]);
        if ("gcm".equals(s1))
        {
            Timber.c("GcmIntentService", "handleIntent", new Object[0]);
            Kl.a(getCacheDir(), getExternalCacheDir());
            obj = intent.getStringExtra("registration_id");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                CJ.a(this, ((String) (obj)));
                if (!TextUtils.equals(((CharSequence) (obj)), Bt.D()))
                {
                    Timber.c("GcmIntentService", "Running DeviceSyncTask because the user's notification ID is different from the GCM reg ID.", new Object[0]);
                    obj = new mb(((String) (obj)));
                    ((oV) (obj)).onResult(((oV) (obj)).executeSynchronously());
                }
            } else
            {
                String s = intent.getStringExtra("username");
                String s2 = Bt.q();
                Timber.c("GcmIntentService", (new StringBuilder("intendedRecipient[")).append(s).append("] currentUser [").append(s2).append("]").toString(), new Object[0]);
                boolean flag;
                if (!TextUtils.equals(s2, s))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    (new EasyMetric("NOTIFICATION_INTENDED_FOR_ANOTHER_USER")).b(true);
                } else
                {
                    Ei ei = a;
                    Intent intent1 = ei.c(this);
                    intent1.putExtra("op_code", 1000);
                    intent1.putExtra("gcm_intent", intent);
                    ei.a(this, intent1);
                }
            }
        } else
        {
            Timber.e("GcmIntentService", "GCM received a tickle for an error or deleted messages on server.", new Object[0]);
        }
        GcmMessageReceiver.a(intent);
    }
}
