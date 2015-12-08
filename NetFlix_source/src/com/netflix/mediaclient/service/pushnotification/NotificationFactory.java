// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            Payload, NotificationBuilderJellyBean, NotificationBuilderHoneycomb

public final class NotificationFactory
{

    public static final String DATA = "data";
    private static final String TAG = "nf_service";

    private NotificationFactory()
    {
    }

    public static void createDummyNotification(NetflixService netflixservice)
    {
    }

    public static void createNotification(Context context, Intent intent, ImageLoader imageloader, int i, ErrorLogging errorlogging)
    {
        if (intent == null)
        {
            Log.e("nf_service", "NotificationFactory.createNotification:: Intent is null!");
            return;
        }
        if (context == null)
        {
            Log.e("nf_service", "NotificationFactory.createNotification:: context is null!");
            return;
        }
        int j;
        try
        {
            intent = new Payload(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_service", "NotificationFactory.createNotification:: Failed to create payload object!", context);
            return;
        }
        j = AndroidUtils.getAndroidVersion();
        if (j >= 16)
        {
            NotificationBuilderJellyBean.createNotification(context, intent, imageloader, i, errorlogging);
            return;
        }
        if (j >= 11)
        {
            NotificationBuilderHoneycomb.createNotification(context, intent, imageloader, i, errorlogging);
            return;
        } else
        {
            throw new IllegalStateException("Invalid api level");
        }
    }
}
