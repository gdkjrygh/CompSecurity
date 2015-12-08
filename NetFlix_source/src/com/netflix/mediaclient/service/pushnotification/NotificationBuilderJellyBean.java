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
//            NotificationBuilderHoneycomb, Payload, NotificationBuilder

public class NotificationBuilderJellyBean extends NotificationBuilderHoneycomb
{

    protected NotificationBuilderJellyBean()
    {
    }

    private static void addBigPicture(Context context, Payload payload, android.app.Notification.BigPictureStyle bigpicturestyle, int i, ImageLoader imageloader, ErrorLogging errorlogging)
    {
        if (!StringUtils.isEmpty(payload.largeIcon) && imageloader != null)
        {
            imageloader.getImg(payload.bigViewPicture, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, 0, 0, new com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener(payload, bigpicturestyle, context, i, errorlogging) {

                final android.app.Notification.BigPictureStyle val$bigPictureStyle;
                final Context val$context;
                final ErrorLogging val$errorLogger;
                final int val$msgId;
                final Payload val$payload;

                public void onErrorResponse(String s)
                {
                    if (Log.isLoggable("nf_push", 6))
                    {
                        Log.e("nf_push", (new StringBuilder()).append("Failed to downlod ").append(payload.largeIcon).append(". Reason: ").append(s).toString());
                    }
                    s = bigPictureStyle.build();
                    NotificationBuilder.sendNotification(context, s, msgId, errorLogger);
                }

                public void onResponse(Bitmap bitmap, String s)
                {
                    if (Log.isLoggable("nf_push", 3))
                    {
                        Log.d("nf_push", (new StringBuilder()).append("Image is downloaded ").append(payload.bigViewPicture).append(" from ").append(s).toString());
                    }
                    if (bitmap != null)
                    {
                        bigPictureStyle.bigPicture(bitmap);
                    }
                    Log.d("nf_push", "Large icon image set!");
                    bitmap = bigPictureStyle.build();
                    NotificationBuilder.sendNotification(context, bitmap, msgId, errorLogger);
                }

            
            {
                payload = payload1;
                bigPictureStyle = bigpicturestyle;
                context = context1;
                msgId = i;
                errorLogger = errorlogging;
                super();
            }
            });
            return;
        } else
        {
            Log.d("nf_push", "Large picture view was not set");
            sendNotification(context, bigpicturestyle.build(), i, errorlogging);
            return;
        }
    }

    private static void addBigView(Context context, Payload payload, android.app.Notification.Builder builder, int i, ImageLoader imageloader, ErrorLogging errorlogging)
    {
        if (!StringUtils.isEmpty(payload.bigViewPicture))
        {
            builder = new android.app.Notification.BigPictureStyle(builder);
            if (!StringUtils.isEmpty(payload.bigViewSummary))
            {
                builder.setSummaryText(payload.bigViewSummary);
            }
            if (!StringUtils.isEmpty(payload.bigViewTitle))
            {
                builder.setBigContentTitle(payload.bigViewTitle);
            }
            addBigPicture(context, payload, builder, i, imageloader, errorlogging);
            return;
        }
        if (!StringUtils.isEmpty(payload.bigViewText))
        {
            builder = new android.app.Notification.BigTextStyle(builder);
            builder.bigText(payload.bigViewText);
            if (!StringUtils.isEmpty(payload.bigViewSummary))
            {
                builder.setSummaryText(payload.bigViewSummary);
            }
            if (!StringUtils.isEmpty(payload.bigViewTitle))
            {
                builder.setBigContentTitle(payload.bigViewTitle);
            }
            sendNotification(context, builder.build(), i, errorlogging);
            return;
        } else
        {
            sendNotification(context, builder.build(), i, errorlogging);
            return;
        }
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
        Payload.Action aaction[];
        int k;
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
        builder.setSubText(payload.subtext);
        aaction = payload.getActions();
        k = aaction.length;
        for (int j = 0; j < k; j++)
        {
            Payload.Action action = aaction[j];
            android.net.Uri uri = action.getPayload();
            if (uri != null)
            {
                builder.addAction(action.getIcon(), action.text, getNotificationOpenedIntent(context, uri, payload));
            }
        }

        if (!StringUtils.isEmpty(payload.largeIcon) && imageloader != null)
        {
            imageloader.getImg(payload.largeIcon, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, 0, 0, new com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener(payload, builder, context, i, imageloader, errorlogging) {

                final android.app.Notification.Builder val$builder;
                final Context val$context;
                final ErrorLogging val$errorLogger;
                final ImageLoader val$imageLoader;
                final int val$msgId;
                final Payload val$payload;

                public void onErrorResponse(String s2)
                {
                    if (Log.isLoggable("nf_push", 6))
                    {
                        Log.e("nf_push", (new StringBuilder()).append("Failed to downlod ").append(payload.largeIcon).append(". Reason: ").append(s2).toString());
                    }
                    NotificationBuilderJellyBean.addBigView(context, payload, builder, msgId, imageLoader, errorLogger);
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
                    NotificationBuilderJellyBean.addBigView(context, payload, builder, msgId, imageLoader, errorLogger);
                    Log.d("nf_push", "Large icon image set!");
                }

            
            {
                payload = payload1;
                builder = builder1;
                context = context1;
                msgId = i;
                imageLoader = imageloader;
                errorLogger = errorlogging;
                super();
            }
            });
            return;
        } else
        {
            Log.d("nf_push", "Icon was not set");
            addBigView(context, payload, builder, i, imageloader, errorlogging);
            return;
        }
    }

}
