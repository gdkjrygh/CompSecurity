// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.content.Context;
import android.os.Bundle;
import com.appboy.AppboyImageUtils;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

public class AppboyWearableNotificationUtils
{

    private static final String TAG;

    public AppboyWearableNotificationUtils()
    {
    }

    private static boolean isWearExtraPagePresentInBundle(Bundle bundle, int i)
    {
        String s = (new StringBuilder()).append("ab_we_t").append(i).toString();
        String s1 = (new StringBuilder()).append("ab_we_c").append(i).toString();
        return bundle.containsKey(s) && bundle.containsKey(s1);
    }

    public static void setWearableNotificationFeaturesIfPresentAndSupported(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle == null) goto _L2; else goto _L1
_L1:
        android.support.v4.app.NotificationCompat.WearableExtender wearableextender;
        int i;
        wearableextender = new android.support.v4.app.NotificationCompat.WearableExtender();
        if (bundle.containsKey("ab_wi"))
        {
            wearableextender.setHintHideIcon(Boolean.valueOf(Boolean.parseBoolean(bundle.getString("ab_wi"))).booleanValue());
        }
        if (bundle.containsKey("ab_wb"))
        {
            android.graphics.Bitmap bitmap = AppboyImageUtils.downloadImageBitmap(bundle.getString("ab_wb"));
            if (bitmap != null)
            {
                wearableextender.setBackground(bitmap);
            }
        }
        i = 0;
_L8:
        if (!isWearExtraPagePresentInBundle(bundle, i)) goto _L4; else goto _L3
_L3:
        String s;
        String s1;
        s = bundle.getString((new StringBuilder()).append("ab_we_t").append(i).toString());
        s1 = bundle.getString((new StringBuilder()).append("ab_we_c").append(i).toString());
        if (s1 != null && s != null) goto _L6; else goto _L5
_L5:
        AppboyLogger.d(TAG, String.format("The title or content of extra page %s was null. Adding no further extra pages.", new Object[] {
            Integer.valueOf(i)
        }));
_L4:
        builder.extend(wearableextender);
_L2:
        return;
_L6:
        android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        bigtextstyle.bigText(s1);
        wearableextender.addPage((new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(s).setStyle(bigtextstyle).build());
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyWearableNotificationUtils.getName()
        });
    }
}
