// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.notifications;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.impl.Settings;

public class LPNotificationCenter
{

    private static LPNotificationCenter INSTANCE;
    private static final String NOTIFICATION_INTENT_ACTION = "com.digby.mm.android.library.Notifications.";
    private Context mContext;

    private LPNotificationCenter(Context context)
    {
        mContext = context;
    }

    public static LPNotificationCenter getInstance(Context context)
    {
        if (INSTANCE == null)
        {
            INSTANCE = new LPNotificationCenter(context.getApplicationContext());
        }
        return INSTANCE;
    }

    private int getNotificationIcon()
    {
        PackageManager packagemanager = mContext.getPackageManager();
        String s = mContext.getPackageName();
        int i;
        try
        {
            i = packagemanager.getApplicationInfo(s, 0).icon;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logger.Error((new StringBuilder()).append("Could not find application icon for package: ").append(s).toString(), namenotfoundexception);
            return 0x1080047;
        }
        return i;
    }

    public Intent buildOfferIntent()
    {
        return buildOfferIntent(-1L);
    }

    public Intent buildOfferIntent(long l)
    {
        String s = Settings.getInstance(mContext).getBrandCode();
        Intent intent = new Intent((new StringBuilder()).append("com.digby.mm.android.library.Notifications.").append(s).toString());
        s = (new StringBuilder()).append("://localpoint.digby.com/").append(s).toString();
        if (l > 0L)
        {
            Logger.Debug((new StringBuilder()).append("Local notification with promotion: ").append(s).toString(), mContext);
            intent.putExtra("messageId", (new StringBuilder()).append("").append(l).toString());
            s = (new StringBuilder()).append("campaign").append(s).append("/").append(l).toString();
        } else
        {
            Logger.Debug((new StringBuilder()).append("Local notification without promotion: ").append(s).toString(), mContext);
            s = (new StringBuilder()).append("event").append(s).toString();
        }
        intent.setData(Uri.parse(s));
        return intent;
    }

    public void notify(String s, String s1)
    {
        sendCampaignNotification(s, s1, -1L);
    }

    public void sendCampaignNotification(String s, String s1, long l)
    {
        Object obj = buildOfferIntent(l);
        int i = (int)(l % 0x7fffffffL);
        obj = PendingIntent.getActivity(mContext, i, ((Intent) (obj)), 0x8000000);
        s = (new android.support.v4.app.NotificationCompat.Builder(mContext)).setSmallIcon(getNotificationIcon()).setAutoCancel(true).setContentTitle(s).setContentText(s1).setContentIntent(((PendingIntent) (obj)));
        ((NotificationManager)mContext.getSystemService("notification")).notify(i, s.build());
    }
}
