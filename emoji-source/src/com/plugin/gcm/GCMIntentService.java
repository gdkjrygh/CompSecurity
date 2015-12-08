// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.plugin.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gcm.GCMBaseIntentService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.plugin.gcm:
//            PushHandlerActivity, PushPlugin

public class GCMIntentService extends GCMBaseIntentService
{

    private static final String TAG = "GCMIntentService";

    public GCMIntentService()
    {
        super(new String[] {
            "GCMIntentService"
        });
    }

    private static String getAppName(Context context)
    {
        return (String)context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
    }

    public void createNotification(Context context, Bundle bundle)
    {
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        String s = getAppName(this);
        Object obj = new Intent(this, com/plugin/gcm/PushHandlerActivity);
        ((Intent) (obj)).addFlags(0x24000000);
        ((Intent) (obj)).putExtra("pushBundle", bundle);
        obj = PendingIntent.getActivity(this, 0, ((Intent) (obj)), 0x8000000);
        int j = -1;
        int i = j;
        if (bundle.getString("defaults") != null)
        {
            try
            {
                i = Integer.parseInt(bundle.getString("defaults"));
            }
            catch (NumberFormatException numberformatexception)
            {
                i = j;
            }
        }
        context = (new android.support.v4.app.NotificationCompat.Builder(context)).setDefaults(i).setSmallIcon(context.getApplicationInfo().icon).setWhen(System.currentTimeMillis()).setContentTitle(bundle.getString("title")).setTicker(bundle.getString("title")).setContentIntent(((PendingIntent) (obj))).setAutoCancel(true);
        obj = bundle.getString("message");
        if (obj != null)
        {
            context.setContentText(((CharSequence) (obj)));
        } else
        {
            context.setContentText("<missing message content>");
        }
        obj = bundle.getString("msgcnt");
        if (obj != null)
        {
            context.setNumber(Integer.parseInt(((String) (obj))));
        }
        i = 0;
        j = Integer.parseInt(bundle.getString("notId"));
        i = j;
_L2:
        notificationmanager.notify(s, i, context.build());
        return;
        bundle;
        Log.e("GCMIntentService", (new StringBuilder()).append("Number format exception - Error parsing Notification ID: ").append(bundle.getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        bundle;
        Log.e("GCMIntentService", (new StringBuilder()).append("Number format exception - Error parsing Notification ID").append(bundle.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onError(Context context, String s)
    {
        Log.e("GCMIntentService", (new StringBuilder()).append("onError - errorId: ").append(s).toString());
    }

    protected void onMessage(Context context, Intent intent)
    {
        Log.d("GCMIntentService", (new StringBuilder()).append("onMessage - context: ").append(context).toString());
        intent = intent.getExtras();
        if (intent != null)
        {
            if (PushPlugin.isInForeground())
            {
                intent.putBoolean("foreground", true);
                PushPlugin.sendExtras(intent);
            } else
            {
                intent.putBoolean("foreground", false);
                if (intent.getString("message") != null && intent.getString("message").length() != 0)
                {
                    createNotification(context, intent);
                    return;
                }
            }
        }
    }

    public void onRegistered(Context context, String s)
    {
        Log.v("GCMIntentService", (new StringBuilder()).append("onRegistered: ").append(s).toString());
        try
        {
            context = (new JSONObject()).put("event", "registered");
            context.put("regid", s);
            Log.v("GCMIntentService", (new StringBuilder()).append("onRegistered: ").append(context.toString()).toString());
            PushPlugin.sendJavascript(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("GCMIntentService", "onRegistered: JSON exception");
        }
    }

    public void onUnregistered(Context context, String s)
    {
        Log.d("GCMIntentService", (new StringBuilder()).append("onUnregistered - regId: ").append(s).toString());
    }
}
