// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient;

import android.content.Context;
import android.content.Intent;
import com.google.android.gcm.GCMBaseIntentService;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient:
//            Log

public class GCMIntentService extends GCMBaseIntentService
{

    private static final String TAG = "nf_push_service";

    public GCMIntentService()
    {
        super(new String[] {
            "484286080282"
        });
    }

    private Intent createIntent(String s)
    {
        s = new Intent(s);
        s.setClass(this, com/netflix/mediaclient/service/NetflixService);
        s.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        return s;
    }

    protected void onDeletedMessages(Context context, int i)
    {
        Log.d("nf_push_service", "Received deleted messages notification");
    }

    public void onError(Context context, String s)
    {
        Log.w("nf_push_service", (new StringBuilder()).append("Received error: ").append(s).toString());
    }

    protected void onMessage(Context context, Intent intent)
    {
        Log.i("nf_push_service", "Received message");
        if (intent == null)
        {
            Log.e("nf_push_service", "Error, intent can not be null!");
            return;
        } else
        {
            AndroidUtils.logIntent("nf_push_service", intent);
            intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            intent.setClass(this, com/netflix/mediaclient/service/NetflixService);
            intent.setAction("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONMESSAGE");
            Log.d("nf_push_service", "Sending command to NetflixService started...");
            startService(intent);
            Log.d("nf_push_service", "Sending command to NetflixService done.");
            return;
        }
    }

    protected boolean onRecoverableError(Context context, String s)
    {
        Log.w("nf_push_service", (new StringBuilder()).append("Received recoverable error: ").append(s).toString());
        return super.onRecoverableError(context, s);
    }

    protected void onRegistered(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("nf_push_service", 3))
        {
            Log.d("nf_push_service", (new StringBuilder()).append("onRegistered:: Device registered: regId = ").append(s).toString());
        }
        context = createIntent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONREGISTERED");
        context.putExtra("reg_id", s);
        Log.d("nf_push_service", "Sending command to NetflixService started...");
        startService(context);
        Log.d("nf_push_service", "Sending command to NetflixService done.");
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    protected void onUnregistered(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf_push_service", "Device unregistered");
        context = createIntent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONUNREGISTERED");
        context.putExtra("reg_id", s);
        Log.d("nf_push_service", "Sending command to NetflixService started...");
        startService(context);
        Log.d("nf_push_service", "Sending command to NetflixService done.");
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }
}
