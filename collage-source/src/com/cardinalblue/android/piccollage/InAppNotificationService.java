// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.d;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.h;
import com.cardinalblue.android.piccollage.activities.PhotoProtoActivity;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import java.io.IOException;

public class InAppNotificationService extends IntentService
{

    private final UriMatcher a = new UriMatcher(-1);

    public InAppNotificationService()
    {
        super("InAppNotificationService");
        a.addURI("*", "notification/unfinished", 100);
        a.addURI("*", "notification/uncreated", 101);
    }

    private Notification a(Bitmap bitmap)
    {
        String s = getString(0x7f0702b6);
        String s1 = getString(0x7f0702b5);
        Object obj = new Bundle();
        ((Bundle) (obj)).putInt("key_notification_id", 30001);
        ((Bundle) (obj)).putBoolean("extra_open_photo_picker", true);
        obj = (new h(this)).a(com/cardinalblue/android/piccollage/activities/PhotoProtoActivity).a("com.cardinalblue.piccollage.action.compose").b(0x14000000).a(((Bundle) (obj))).c(0x10000000);
        obj = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f02020f).setContentTitle(s).setContentText(s1).setAutoCancel(true).setContentIntent(((android.app.PendingIntent) (obj)));
        if (bitmap != null)
        {
            android.support.v4.app.NotificationCompat.BigPictureStyle bigpicturestyle = new android.support.v4.app.NotificationCompat.BigPictureStyle();
            bigpicturestyle.setBigContentTitle(s).setSummaryText(s1).bigPicture(bitmap).bigLargeIcon(bitmap);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle(bigpicturestyle);
        }
        return ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
    }

    private Notification a(AbstractCollage abstractcollage, Bitmap bitmap)
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putParcelable("extra_collage", abstractcollage);
        ((Bundle) (obj)).putInt("key_notification_id", 30000);
        abstractcollage = (new h(this)).a(com/cardinalblue/android/piccollage/activities/PhotoProtoActivity).a("com.cardinalblue.piccollage.action.compose").b(0x14000000).a(((Bundle) (obj))).c(0x10000000);
        android.support.v4.app.NotificationCompat.BigPictureStyle bigpicturestyle = new android.support.v4.app.NotificationCompat.BigPictureStyle();
        bigpicturestyle.setBigContentTitle(getString(0x7f07024f)).setSummaryText(getString(0x7f07024e)).bigPicture(bitmap).bigLargeIcon(bitmap);
        obj = (new h(this)).a(com/cardinalblue/android/piccollage/activities/PhotoProtoActivity).a("com.cardinalblue.piccollage.action.share").b(0x14000000).a(((Bundle) (obj))).c(0x10000000);
        return (new android.support.v4.app.NotificationCompat.Builder(this)).setStyle(bigpicturestyle).setSmallIcon(0x7f02020f).setLargeIcon(bitmap).setContentTitle(getString(0x7f07024f)).setContentText(getString(0x7f07024e)).setAutoCancel(true).addAction(new android.support.v4.app.NotificationCompat.Action(0, getString(0x7f07024d), abstractcollage)).addAction(new android.support.v4.app.NotificationCompat.Action(0, getString(0x7f0701d1), ((android.app.PendingIntent) (obj)))).setContentIntent(abstractcollage).build();
    }

    protected void onHandleIntent(Intent intent)
    {
        String s = intent.getAction();
        if (!"piccollage.intent.action.DISABLE_PREF".equals(s)) goto _L2; else goto _L1
_L1:
        if (intent.getExtras().containsKey("extra_pref_name"))
        {
            s = intent.getStringExtra("extra_pref_name");
            k.j().edit().putBoolean(s, false).apply();
            f.a(intent);
        }
_L4:
        return;
_L2:
        if (!"android.intent.action.SEND".equals(s) || !k.j().getBoolean("key_create_collage_reminder_notification", true)) goto _L4; else goto _L3
_L3:
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        Object obj = null;
        switch (a.match(intent.getData()))
        {
        default:
            return;

        case 100: // 'd'
            intent = (Collage)intent.getParcelableExtra("extra_collage");
            if (intent != null)
            {
                try
                {
                    notificationmanager.notify(30000, a(intent, com.cardinalblue.android.piccollage.model.k.a(intent.q())));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    f.a(intent);
                }
                return;
            }
            break;

        case 101: // 'e'
            PhotoInfo photoinfo = d.b(getApplicationContext());
            intent = obj;
            if (photoinfo != null)
            {
                try
                {
                    intent = com.cardinalblue.android.piccollage.lib.a.e.a(photoinfo.b()).a(150);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    f.a(intent);
                    intent = obj;
                }
            }
            notificationmanager.notify(30001, a(intent));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
