// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import android.graphics.Bitmap;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            NotificationBuilder, Payload

public class NotificationBuilderHoneycomb extends NotificationBuilder
{

    protected NotificationBuilderHoneycomb()
    {
    }

    public static void createNotification(Context context, Payload payload, ImageLoader imageloader, int i, ErrorLogging errorlogging)
    {
        long l = payload.getWhen();
        String s = payload.getTitle(context.getString(0x7f0c0064));
        String s1 = payload.getTicker(s);
        android.app.Notification.Builder builder = new android.app.Notification.Builder(context);
        builder.setContentIntent(getNotificationOpenedIntent(context, payload));
        builder.setDeleteIntent(getNotificationCanceledIntent(context, payload));
        builder.setTicker(s1);
        builder.setAutoCancel(true);
        builder.setContentTitle(s);
        builder.setContentText(payload.text);
        builder.setSmallIcon(0x7f02011e);
        builder.setWhen(l);
        if (NotificationBuilder.isSoundEnabled(context))
        {
            try
            {
                builder.setSound(NotificationBuilder.getSound(payload.sound), 5);
            }
            catch (Throwable throwable)
            {
                Log.e("nf_push", "Failed to get notification sound URL!", throwable);
            }
        }
        if (!StringUtils.isEmpty(payload.largeIcon) && imageloader != null)
        {
            imageloader.getImg(payload.largeIcon, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, 0, 0, new com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener(payload, builder, context, i, errorlogging) {

                final android.app.Notification.Builder val$builder;
                final Context val$context;
                final ErrorLogging val$errorLogger;
                final int val$msgId;
                final Payload val$payload;

                public void onErrorResponse(String s2)
                {
                    if (Log.isLoggable("nf_push", 6))
                    {
                        Log.e("nf_push", (new StringBuilder()).append("Failed to downlod ").append(payload.largeIcon).append(". Reason: ").append(s2).toString());
                    }
                }

                public void onResponse(Bitmap bitmap, String s2)
                {
                    if (Log.isLoggable("nf_push", 3))
                    {
                        Log.d("nf_push", (new StringBuilder()).append("Image is downloaded ").append(payload.largeIcon).append(" from ").append(s2).toString());
                    }
                    if (bitmap != null)
                    {
                        builder.setLargeIcon(bitmap);
                    }
                    NotificationBuilderHoneycomb.send(context, builder, msgId, errorLogger);
                    Log.d("nf_push", "Image set!");
                }

            
            {
                payload = payload1;
                builder = builder1;
                context = context1;
                msgId = i;
                errorLogger = errorlogging;
                super();
            }
            });
            return;
        } else
        {
            Log.d("nf_push", "Icon was not set");
            send(context, builder, i, errorlogging);
            return;
        }
    }

    private static void send(Context context, android.app.Notification.Builder builder, int i, ErrorLogging errorlogging)
    {
        sendNotification(context, builder.getNotification(), i, errorlogging);
    }

}
