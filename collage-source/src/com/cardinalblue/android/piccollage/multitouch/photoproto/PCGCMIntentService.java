// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.h;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity;
import com.google.android.gcm.GCMBaseIntentService;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class PCGCMIntentService extends GCMBaseIntentService
{

    private static int b = 0;
    private static File c;
    NotificationManager a;
    private final SimpleDateFormat d;

    public PCGCMIntentService()
    {
        super(new String[] {
            "773876082784"
        });
        d = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss", Locale.US);
    }

    static int a()
    {
        int i = b + 1;
        b = i;
        return i;
    }

    static int a(int i)
    {
        b = i;
        return i;
    }

    private android.support.v4.app.NotificationCompat.Builder a(Intent intent)
    {
        String s = getString(0x7f0700f9);
        intent = intent.getStringExtra("message");
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(this);
        builder.setSmallIcon(0x7f02020f);
        builder.setContentTitle(s);
        builder.setContentText(intent);
        builder.setAutoCancel(true);
        android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        bigtextstyle.setBigContentTitle(s);
        bigtextstyle.bigText(intent);
        builder.setStyle(bigtextstyle);
        return builder;
    }

    private j a(Context context, android.support.v4.app.NotificationCompat.Builder builder, String s, Bundle bundle)
    {
        return j.a(new Callable(context, s) {

            final Context a;
            final String b;
            final PCGCMIntentService c;

            public String a()
                throws Exception
            {
                String s1 = com.cardinalblue.android.piccollage.controller.network.f.c(a, b);
                if (TextUtils.isEmpty(s1))
                {
                    throw new Exception("No echo emplate");
                } else
                {
                    return s1;
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = PCGCMIntentService.this;
                a = context;
                b = s;
                super();
            }
        }).c(new i(context, s, bundle, builder) {

            final Context a;
            final String b;
            final Bundle c;
            final android.support.v4.app.NotificationCompat.Builder d;
            final PCGCMIntentService e;

            public Void a(j j1)
                throws Exception
            {
                j1 = (String)j1.e();
                j1 = Collage.a(a, b, "notification", j1);
                j1 = new h(e, j1);
                j1.a(PCGCMIntentService.b() + 1).a("key_notification_target_activity", "Editor for echo").a("key_notification_payload", k.a(c).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).a(c);
                j1 = j1.c(0x8000000);
                d.addAction(0, e.getString(0x7f0700e1), j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = PCGCMIntentService.this;
                a = context;
                b = s;
                c = bundle;
                d = builder;
                super();
            }
        });
    }

    private j a(android.support.v4.app.NotificationCompat.Builder builder, String s, String s1, String s2)
    {
        return j.a(new Callable(s) {

            final String a;
            final PCGCMIntentService b;

            public Bitmap a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.lib.i.a(k.a()).a(a, 0, 0, com.cardinalblue.android.piccollage.controller.f.e);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PCGCMIntentService.this;
                a = s;
                super();
            }
        }).a(new i(builder, s1, s2) {

            final android.support.v4.app.NotificationCompat.Builder a;
            final String b;
            final String c;
            final PCGCMIntentService d;

            public Void a(j j1)
                throws Exception
            {
                if (!j1.d())
                {
                    j1 = (Bitmap)j1.e();
                    j1.setDensity(160);
                    a.setLargeIcon(j1);
                    android.support.v4.app.NotificationCompat.BigPictureStyle bigpicturestyle = new android.support.v4.app.NotificationCompat.BigPictureStyle();
                    bigpicturestyle.setBigContentTitle(b).setSummaryText(c);
                    bigpicturestyle.bigPicture(j1);
                    a.setStyle(bigpicturestyle);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                d = PCGCMIntentService.this;
                a = builder;
                b = s;
                c = s1;
                super();
            }
        });
    }

    static j a(PCGCMIntentService pcgcmintentservice, Context context, android.support.v4.app.NotificationCompat.Builder builder, String s, Bundle bundle)
    {
        return pcgcmintentservice.a(context, builder, s, bundle);
    }

    static j a(PCGCMIntentService pcgcmintentservice, android.support.v4.app.NotificationCompat.Builder builder, String s, String s1, String s2)
    {
        return pcgcmintentservice.a(builder, s, s1, s2);
    }

    private j a(String s)
    {
        return j.a(new Callable(s) {

            final String a;
            final PCGCMIntentService b;

            public WebPhoto a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.j(a);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PCGCMIntentService.this;
                a = s;
                super();
            }
        });
    }

    private void a(Context context, Intent intent, File file)
    {
        context = null;
        if (!file.exists())
        {
            file.createNewFile();
        }
        file = new FileWriter(file, true);
        file.write((new StringBuilder()).append(d.format(new Date())).append("\r\n").toString());
        file.write((new StringBuilder()).append(intent.getExtras()).append("\r\n").toString());
        file.write("\r\n");
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        file.flush();
        file.close();
_L2:
        return;
        intent;
_L5:
        f.a(intent);
        if (context == null) goto _L2; else goto _L1
_L1:
        try
        {
            context.flush();
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        intent = null;
_L4:
        if (intent != null)
        {
            try
            {
                intent.flush();
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        throw context;
        context;
        intent = file;
        continue; /* Loop/switch isn't completed */
        file;
        intent = context;
        context = file;
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        context = file;
          goto _L5
        context;
    }

    private void a(android.support.v4.app.NotificationCompat.Builder builder, Intent intent)
    {
        String s;
        h h1;
        boolean flag;
        if (intent.hasExtra("flurry_event"))
        {
            s = intent.getStringExtra("flurry_event");
        } else
        {
            s = "unknown";
        }
        flag = intent.hasExtra("click_url");
        if (flag)
        {
            h1 = new h(this, PICAppRoutesService.d(intent.getStringExtra("click_url")));
        } else
        {
            h1 = new h(this);
            h1.a(com/cardinalblue/android/piccollage/multitouch/photoproto/activities/MainActivity);
        }
        h1.a(b + 1).b(0x14000000).a("extra_start_from", "notification").a("flurry_event", s).a("key_notification_target_activity", "Home").a("key_notification_payload", k.a(intent.getExtras()).toString()).a("key_notification_id", b + 1);
        if (flag)
        {
            intent = h1.d(0x8000000);
        } else
        {
            intent = h1.c(0x8000000);
        }
        builder.setContentIntent(intent);
    }

    static int b()
    {
        return b;
    }

    private j b(String s)
    {
        return j.a(new Callable(s) {

            final String a;
            final PCGCMIntentService b;

            public PicUser a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.u(com.cardinalblue.android.piccollage.controller.network.f.t(a));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PCGCMIntentService.this;
                a = s;
                super();
            }
        });
    }

    private void b(Intent intent)
    {
        String s1 = intent.getStringExtra("message");
        String s2 = intent.getStringExtra("descendant_id");
        String s;
        android.support.v4.app.NotificationCompat.Builder builder;
        if (intent.hasExtra("flurry_event"))
        {
            s = intent.getStringExtra("flurry_event");
        } else
        {
            s = "unknown";
        }
        builder = a(intent);
        a(builder, intent);
        a(s2).d(new i(s, intent, builder, s1) {

            final String a;
            final Intent b;
            final android.support.v4.app.NotificationCompat.Builder c;
            final String d;
            final PCGCMIntentService e;

            public j a(j j1)
                throws Exception
            {
                j1 = (WebPhoto)j1.e();
                new h(e);
                Object obj = PICAppRoutesService.a(j1);
                obj = (new h(e)).a(com/cardinalblue/android/piccollage/helpers/PICAppRoutesService).a("android.intent.action.VIEW").c(((String) (obj))).a(PCGCMIntentService.b() + 1).b(0x14000000).a("extra_start_from", "notification").a("flurry_event", a).a("key_notification_target_activity", "Echoes list").a("key_notification_payload", k.a(b.getExtras()).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).d(0x8000000);
                c.addAction(0, e.getString(0x7f0700e3), ((android.app.PendingIntent) (obj)));
                return PCGCMIntentService.a(e, c, j1.getMediumImageUrl(), d, j1.getCaption());
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = PCGCMIntentService.this;
                a = s;
                b = intent;
                c = builder;
                d = s1;
                super();
            }
        }).b(new i(s, builder, s2) {

            final String a;
            final android.support.v4.app.NotificationCompat.Builder b;
            final String c;
            final PCGCMIntentService d;

            public j a(j j1)
                throws Exception
            {
                j1 = new Bundle();
                j1.putString("flurry_event", a);
                return PCGCMIntentService.a(d, d, b, c, j1);
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                d = PCGCMIntentService.this;
                a = s;
                b = builder;
                c = s1;
                super();
            }
        }).a(new i(builder) {

            final android.support.v4.app.NotificationCompat.Builder a;
            final PCGCMIntentService b;

            public Void a(j j1)
                throws Exception
            {
                j1 = a.build();
                PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
                b.a.notify(PCGCMIntentService.b(), j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PCGCMIntentService.this;
                a = builder;
                super();
            }
        });
    }

    private void c(Intent intent)
    {
        android.support.v4.app.NotificationCompat.Builder builder = a(intent);
        a(builder, intent);
        String s1 = intent.getStringExtra("message");
        String s2 = intent.getStringExtra("collage_id");
        String s;
        if (intent.hasExtra("flurry_event"))
        {
            s = intent.getStringExtra("flurry_event");
        } else
        {
            s = "unknown";
        }
        a(s2).d(new i(s, intent, builder, s1) {

            final String a;
            final Intent b;
            final android.support.v4.app.NotificationCompat.Builder c;
            final String d;
            final PCGCMIntentService e;

            public j a(j j1)
                throws Exception
            {
                j1 = (WebPhoto)j1.e();
                Object obj = new h(e);
                ((h) (obj)).a(com/cardinalblue/android/piccollage/activities/PublicCollageActivity).a(PCGCMIntentService.b() + 1).b(0x14000000).a("extra_start_from", "notification").a("flurry_event", a).a("key_notification_target_activity", "Collage show").a("key_notification_payload", k.a(b.getExtras()).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).a("web_photo_data", j1).a("piccollage.intent.action.VIEW_COLLAGE");
                obj = ((h) (obj)).c(0x8000000);
                c.addAction(0, e.getString(0x7f0700e2), ((android.app.PendingIntent) (obj)));
                return PCGCMIntentService.a(e, c, j1.getMediumImageUrl(), d, j1.getCaption());
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = PCGCMIntentService.this;
                a = s;
                b = intent;
                c = builder;
                d = s1;
                super();
            }
        }).b(new i(s, builder, s2) {

            final String a;
            final android.support.v4.app.NotificationCompat.Builder b;
            final String c;
            final PCGCMIntentService d;

            public j a(j j1)
                throws Exception
            {
                j1 = new Bundle();
                j1.putString("flurry_event", a);
                return PCGCMIntentService.a(d, d, b, c, j1);
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                d = PCGCMIntentService.this;
                a = s;
                b = builder;
                c = s1;
                super();
            }
        }).a(new i(builder) {

            final android.support.v4.app.NotificationCompat.Builder a;
            final PCGCMIntentService b;

            public Void a(j j1)
                throws Exception
            {
                j1 = a.build();
                PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
                b.a.notify(PCGCMIntentService.b(), j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PCGCMIntentService.this;
                a = builder;
                super();
            }
        });
    }

    private void d(Intent intent)
    {
        android.support.v4.app.NotificationCompat.Builder builder = a(intent);
        a(builder, intent);
        String s1 = intent.getStringExtra("message");
        String s2 = intent.getStringExtra("follower_id");
        String s;
        if (intent.hasExtra("flurry_event"))
        {
            s = intent.getStringExtra("flurry_event");
        } else
        {
            s = "unknown";
        }
        b(s2).d(new i(s, intent, builder, s1) {

            final String a;
            final Intent b;
            final android.support.v4.app.NotificationCompat.Builder c;
            final String d;
            final PCGCMIntentService e;

            public j a(j j1)
                throws Exception
            {
                j1 = (PicUser)j1.e();
                if (j1 == null)
                {
                    return null;
                }
                Object obj = new h(e);
                if (j1.equals(PicAuth.h().i()))
                {
                    ((h) (obj)).a(com/cardinalblue/android/piccollage/activities/HomeActivity).a("piccollage.intent.action.VIEW_PROFILE");
                } else
                {
                    ((h) (obj)).a(com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                }
                ((h) (obj)).a(PCGCMIntentService.b() + 1).b(0x14000000).a("extra_start_from", "notification").a("flurry_event", a).a("key_notification_target_activity", "User profile").a("key_notification_payload", k.a(b.getExtras()).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).a("user", j1);
                obj = ((h) (obj)).c(0x8000000);
                c.addAction(0, e.getString(0x7f0700e4), ((android.app.PendingIntent) (obj)));
                return PCGCMIntentService.a(e, c, j1.getProfileImageUrl(), d, j1.getDisplayName());
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = PCGCMIntentService.this;
                a = s;
                b = intent;
                c = builder;
                d = s1;
                super();
            }
        }).a(new i(builder) {

            final android.support.v4.app.NotificationCompat.Builder a;
            final PCGCMIntentService b;

            public Void a(j j1)
                throws Exception
            {
                j1 = a.build();
                PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
                b.a.notify(PCGCMIntentService.b(), j1);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PCGCMIntentService.this;
                a = builder;
                super();
            }
        });
    }

    private void e(Intent intent)
    {
        android.support.v4.app.NotificationCompat.Builder builder = a(intent);
        String s = intent.getStringExtra("message");
        a(builder, intent);
        j.a(new Callable(intent.getStringExtra("banner_url")) {

            final String a;
            final PCGCMIntentService b;

            public Bitmap a()
                throws Exception
            {
                if (TextUtils.isEmpty(a))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid banner url ").append(a).toString());
                }
                if (android.os.Build.VERSION.SDK_INT <= 15)
                {
                    throw new UnsupportedOperationException("BigPictureStyle is not supported for Android ICS and below (15-)");
                } else
                {
                    return com.cardinalblue.android.piccollage.lib.i.a(k.a()).a(a, 0, 0, com.cardinalblue.android.piccollage.controller.f.e);
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PCGCMIntentService.this;
                a = s;
                super();
            }
        }).a(new i(builder, s) {

            final android.support.v4.app.NotificationCompat.Builder a;
            final String b;
            final PCGCMIntentService c;

            public Notification a(j j1)
                throws Exception
            {
                if (!j1.d())
                {
                    Object obj = new android.support.v4.app.NotificationCompat.BigPictureStyle();
                    a.setStyle(((android.support.v4.app.NotificationCompat.Style) (obj)));
                    obj = a.build();
                    if (android.os.Build.VERSION.SDK_INT >= 16)
                    {
                        RemoteViews remoteviews = new RemoteViews(c.getPackageName(), 0x7f030093);
                        remoteviews.setImageViewResource(0x7f10007a, 0x7f02020f);
                        j1 = (Bitmap)j1.e();
                        j1.setDensity(160);
                        remoteviews.setImageViewBitmap(0x7f100191, j1);
                        remoteviews.setTextViewText(0x7f10007b, c.getString(0x7f0700f9));
                        if (!TextUtils.isEmpty(b))
                        {
                            remoteviews.setTextViewText(0x7f100190, b);
                            remoteviews.setViewVisibility(0x7f100190, 0);
                        }
                        j1 = Calendar.getInstance();
                        remoteviews.setTextViewText(0x7f10018f, String.format("%d:%2d", new Object[] {
                            Integer.valueOf(j1.get(11)), Integer.valueOf(j1.get(12))
                        }));
                        obj.bigContentView = remoteviews;
                    }
                    return ((Notification) (obj));
                } else
                {
                    return a.build();
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = PCGCMIntentService.this;
                a = builder;
                b = s;
                super();
            }
        }).a(new i() {

            final PCGCMIntentService a;

            public Object then(j j1)
                throws Exception
            {
                j1 = (Notification)j1.e();
                if (j1 != null)
                {
                    PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
                    a.a.notify(PCGCMIntentService.b(), j1);
                }
                return null;
            }

            
            {
                a = PCGCMIntentService.this;
                super();
            }
        });
    }

    protected void a(Context context, Intent intent)
    {
        String s1;
        String s;
        boolean flag;
        if (k.j().getBoolean("ENABLE_NOTIFICATION", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (com.cardinalblue.android.b.d.d())
        {
            a(context, intent, c);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("collage_id");
        s = intent.getStringExtra("descendant_id");
        s1 = intent.getStringExtra("follower_id");
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(context)) goto _L6; else goto _L5
_L5:
        f.a(new IllegalArgumentException(intent.getExtras().toString()));
_L2:
        return;
_L6:
        b(intent);
_L8:
        k.a(true);
        return;
_L4:
        if (!TextUtils.isEmpty(context))
        {
            c(intent);
        } else
        if (!TextUtils.isEmpty(s1))
        {
            d(intent);
        } else
        {
            e(intent);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void a(Context context, String s)
    {
        try
        {
            com.cardinalblue.android.piccollage.controller.network.f.a(context, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f.a(context);
        }
    }

    protected void b(Context context, String s)
    {
        try
        {
            com.cardinalblue.android.piccollage.controller.network.f.a(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f.a(context);
        }
    }

    protected void c(Context context, String s)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        a = (NotificationManager)getSystemService("notification");
        c = new File((new StringBuilder()).append(getExternalFilesDir(null)).append("/notifications_logs.txt").toString());
    }

}
