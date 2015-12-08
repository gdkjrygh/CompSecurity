// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            Payload

abstract class NotificationBuilder
{

    protected static final String GUID = "guid";
    protected static final String MESSAGE_GUID = "messageGuid";
    protected static final String ORIGINATOR = "originator";
    protected static final String TAG = "nf_push";
    public static final String TARGET_URL = "target_url";

    NotificationBuilder()
    {
    }

    protected static PendingIntent getNotificationCanceledIntent(Context context, Payload payload)
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED");
        if (!StringUtils.isEmpty(payload.guid))
        {
            intent.putExtra("guid", payload.guid);
        }
        if (!StringUtils.isEmpty(payload.messageGuid))
        {
            intent.putExtra("messageGuid", payload.messageGuid);
        }
        if (StringUtils.isNotEmpty(payload.originator))
        {
            intent.putExtra("originator", payload.originator);
        }
        return PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
    }

    protected static PendingIntent getNotificationOpenedIntent(Context context, Uri uri, Payload payload)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(0x34000000);
        if (!StringUtils.isEmpty(payload.guid))
        {
            intent.putExtra("guid", payload.guid);
        }
        if (!StringUtils.isEmpty(payload.messageGuid))
        {
            intent.putExtra("messageGuid", payload.messageGuid);
        }
        if (StringUtils.isNotEmpty(payload.originator))
        {
            intent.putExtra("originator", payload.originator);
        }
        return PendingIntent.getActivity(context, 0, intent, 0x8000000);
    }

    protected static PendingIntent getNotificationOpenedIntent(Context context, Payload payload)
    {
        Uri uri = payload.getDefaultActionPayload();
        if (uri != null)
        {
            String s = uri.getScheme();
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("getNotificationOpenedIntent: schema for default action uri: ").append(s).toString());
            }
            if (s != null && "https".equals(s.toLowerCase(Locale.US)))
            {
                Log.d("nf_push", "Target destination is web site (https)");
                return getNotificationOpenedIntentForBrowserRedirect(context, uri, payload);
            }
        }
        Log.d("nf_push", "Target destination is our application");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(0x34000000);
        if (!StringUtils.isEmpty(payload.guid))
        {
            intent.putExtra("guid", payload.guid);
        }
        if (!StringUtils.isEmpty(payload.messageGuid))
        {
            intent.putExtra("messageGuid", payload.messageGuid);
        }
        if (StringUtils.isNotEmpty(payload.originator))
        {
            intent.putExtra("originator", payload.originator);
        }
        return PendingIntent.getActivity(context, 0, intent, 0x8000000);
    }

    protected static PendingIntent getNotificationOpenedIntentForBrowserRedirect(Context context, Uri uri, Payload payload)
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT");
        intent.putExtra("target_url", uri.toString());
        if (!StringUtils.isEmpty(payload.guid))
        {
            intent.putExtra("guid", payload.guid);
        }
        if (!StringUtils.isEmpty(payload.messageGuid))
        {
            intent.putExtra("messageGuid", payload.messageGuid);
        }
        if (StringUtils.isNotEmpty(payload.originator))
        {
            intent.putExtra("originator", payload.originator);
        }
        return PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
    }

    protected static Uri getSound(String s)
    {
        if (s != null && s.trim().toLowerCase(Locale.US).startsWith("http"))
        {
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("CDN sound: ").append(s).toString());
            }
            return Uri.parse(s);
        } else
        {
            Log.d("nf_push", "default sound");
            return Uri.parse("android.resource://com.netflix.mediaclient/2131099649");
        }
    }

    protected static boolean isSoundEnabled(Context context)
    {
        return false;
    }

    protected static void sendNotification(Context context, Notification notification, int i, ErrorLogging errorlogging)
    {
        context = (NotificationManager)context.getSystemService("notification");
        if (context != null)
        {
            try
            {
                context.notify(i, notification);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("nf_push", "We are missing privilege?", context);
                errorlogging.logHandledException(context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("nf_push", "Unexpected failure when trying to send notification", context);
            }
            errorlogging.logHandledException(new RuntimeException("Unexpected failure when trying to send notification", context));
            return;
        } else
        {
            Log.e("nf_push", "Notification manager is not available!");
            return;
        }
    }
}
