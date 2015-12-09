// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.notifications;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.IBinder;
import android.text.TextUtils;
import bb;
import com.spotify.mobile.android.ui.activity.FacebookWebPermissionsActivity;
import ctz;
import cu;
import dd;
import dty;
import gdh;

public class SocialErrorNotifier extends Service
{

    private static final String a[] = {
        "permissions", "request_permissions_url", "auth_success_url"
    };
    private cu b;
    private dd c;

    public SocialErrorNotifier()
    {
        c = new dd() {

            private SocialErrorNotifier a;

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                ctz.a(obj);
                if (((Cursor) (obj)).moveToFirst())
                {
                    if (!TextUtils.isEmpty(((Cursor) (obj)).getString(0)))
                    {
                        Intent intent = new Intent(a.getApplicationContext(), com/spotify/mobile/android/ui/activity/FacebookWebPermissionsActivity);
                        intent.putExtra("auth_url", ((Cursor) (obj)).getString(1));
                        intent.putExtra("success_url", ((Cursor) (obj)).getString(2));
                        SocialErrorNotifier.a(a, intent);
                    }
                    a.stopSelf();
                }
            }

            
            {
                a = SocialErrorNotifier.this;
                super();
            }
        };
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/service/notifications/SocialErrorNotifier);
    }

    static void a(SocialErrorNotifier socialerrornotifier, Intent intent)
    {
        socialerrornotifier = socialerrornotifier.getApplicationContext();
        Resources resources = socialerrornotifier.getResources();
        bb bb1 = new bb(socialerrornotifier);
        bb1.a(resources.getString(0x7f08036c)).b(resources.getString(0x7f08036b)).a(0x7f020203).c().a(0L).a("err").e().d();
        intent.addFlags(0x10008000);
        bb1.a(PendingIntent.getActivity(socialerrornotifier, 1337, intent, 0x10000000));
        ((NotificationManager)socialerrornotifier.getSystemService("notification")).notify(13, bb1.g());
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        if (b != null)
        {
            b.a(c);
            b.m();
            b.o();
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (b == null)
        {
            intent = dty.a(TextUtils.join(",", gdh.a));
            b = new cu(getApplicationContext(), intent, a, null, null);
            b.a(0, c);
            b.l();
        }
        return 2;
    }

}
