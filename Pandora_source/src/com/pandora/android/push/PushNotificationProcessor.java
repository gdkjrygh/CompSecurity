// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.app.Application;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.pandora.android.activity.ForegroundMonitorService;
import com.pandora.android.gcm.GCMReceiver;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.util.NetworkUtil;
import java.io.IOException;
import java.net.URL;
import p.cw.c;

// Referenced classes of package com.pandora.android.push:
//            a, PushNotification, PushFeedbackReceiver

public class PushNotificationProcessor extends IntentService
{

    private static int a = 4;
    private static int b = 4000;

    public PushNotificationProcessor()
    {
        super("PushNotificationProcessor");
    }

    private int a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return getResources().getDimensionPixelSize(0x1050005);
        } else
        {
            return (int)(64F * getResources().getDisplayMetrics().density);
        }
    }

    public static Intent a(Context context, PushNotification pushnotification)
    {
        context = new Intent(context, com/pandora/android/push/PushNotificationProcessor);
        context.setAction("com.pandora.android.push.action.PROCESS_NOTIFICATION");
        context.putExtra("com.pandora.android.push.extra.NOTIFICATION", pushnotification);
        return context;
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/pandora/android/push/PushNotificationProcessor);
        context.setAction("com.pandora.android.push.action.SEND_CLEAR_NOTIFICATION");
        context.putExtra("com.pandora.android.push.extra.NOTIFICATION_ID", s);
        context.putExtra("com.pandora.android.push.extra.NOTIFICATION_KEY", s1);
        return context;
    }

    private static transient CharSequence a(CharSequence acharsequence[])
    {
        int j = acharsequence.length;
        for (int i = 0; i < j; i++)
        {
            CharSequence charsequence = acharsequence[i];
            if (!TextUtils.isEmpty(charsequence))
            {
                return charsequence;
            }
        }

        return null;
    }

    public static void a(Context context, String s)
    {
        context.startService(b(context, s));
    }

    private void a(String s, String s1)
    {
        GoogleCloudMessaging googlecloudmessaging = GoogleCloudMessaging.getInstance(this);
        Bundle bundle = new Bundle();
        bundle.putString("type", "push_dismissed");
        bundle.putString("id", s);
        try
        {
            googlecloudmessaging.send(s1, s, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private int b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return getResources().getDimensionPixelSize(0x1050006);
        } else
        {
            return (int)(64F * getResources().getDisplayMetrics().density);
        }
    }

    static Intent b(Context context, String s)
    {
        context = new Intent(context, com/pandora/android/push/PushNotificationProcessor);
        context.setAction("com.pandora.android.push.action.CLEAR_NOTIFICATION");
        context.putExtra("com.pandora.android.push.extra.NOTIFICATION_ID", s);
        return context;
    }

    protected Bitmap a(Uri uri)
        throws IOException
    {
        uri = (new URL(uri.toString())).openStream();
        Bitmap bitmap = BitmapFactory.decodeStream(uri);
        if (bitmap == null)
        {
            NetworkUtil.a(uri);
            return null;
        }
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, a(), b(), false);
        if (bitmap == bitmap1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        bitmap.recycle();
        NetworkUtil.a(uri);
        return bitmap1;
        Exception exception;
        exception;
        NetworkUtil.a(uri);
        throw exception;
    }

    protected Bitmap a(Uri uri, String s, int i, int j)
    {
        Bitmap bitmap;
        int k;
        bitmap = null;
        k = 0;
_L4:
        int l = k + 1;
        Bitmap bitmap1 = a(uri);
        bitmap = bitmap1;
_L2:
        if (bitmap != null || l > i)
        {
            return bitmap;
        }
        break; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        if (l <= i)
        {
            long l1 = j;
            try
            {
                Thread.sleep(l1);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return null;
            }
        } else
        {
            Object obj = ((ConnectivityManager)b.a.h().getSystemService("connectivity")).getActiveNetworkInfo();
            a a1;
            if (obj != null && ((NetworkInfo) (obj)).isConnected())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            a1 = com.pandora.android.push.a.a();
            if (k != 0)
            {
                obj = p.cx.x.a.i;
            } else
            {
                obj = p.cx.x.a.l;
            }
            a1.a(s, ((p.cx.x.a) (obj)), p.cx.x.b.a);
        }
        if (true) goto _L2; else goto _L1
_L1:
        k = l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(PushNotification pushnotification)
    {
        android.support.v4.app.u.d d = new android.support.v4.app.u.d(this);
        if (pushnotification.c == null) goto _L2; else goto _L1
_L1:
        Object obj = pushnotification.c;
_L5:
        d.a(((CharSequence) (obj)));
        if (TextUtils.isEmpty(pushnotification.e) || android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        obj = new android.support.v4.app.u.c();
        ((android.support.v4.app.u.c) (obj)).a(pushnotification.e);
        d.a(((android.support.v4.app.u.o) (obj)));
        d.b(a(new CharSequence[] {
            pushnotification.f, pushnotification.d, pushnotification.e
        }));
_L6:
        d.c(pushnotification.g);
        d.d(a(new CharSequence[] {
            pushnotification.d, pushnotification.f, pushnotification.e
        }));
        if (pushnotification.i == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        obj = pushnotification.i;
_L7:
        obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        ((Intent) (obj)).addFlags(0x10000000);
        ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
        try
        {
            Intent intent = new Intent(this, com/pandora/android/push/PushFeedbackReceiver);
            intent.setData(Uri.parse((new StringBuilder()).append("pandoranotifications:").append(pushnotification.a).toString()));
            intent.setAction("com.pandora.android.push.PushFeedbackReceiver.ACTION_CLICKED");
            intent.putExtra("EXTRA_DESTINATION_INTENT", ((android.os.Parcelable) (obj)));
            intent.putExtra("EXTRA_PUSH_NOTIFICATION_ID", pushnotification.a);
            if (pushnotification.b != null)
            {
                intent.putExtra("EXTRA_PUSH_NOTIFICATION_KEY", pushnotification.b);
            }
            d.a(PendingIntent.getBroadcast(this, 0, intent, 0x8000000));
            obj = new Intent(this, com/pandora/android/push/PushFeedbackReceiver);
            ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("pandoranotifications:").append(pushnotification.a).toString()));
            ((Intent) (obj)).setAction("com.pandora.android.push.PushFeedbackReceiver.ACTION_REMOVED");
            ((Intent) (obj)).putExtra("EXTRA_PUSH_NOTIFICATION_ID", pushnotification.a);
            if (pushnotification.b != null)
            {
                ((Intent) (obj)).putExtra("EXTRA_PUSH_NOTIFICATION_KEY", pushnotification.b);
            }
            d.b(PendingIntent.getBroadcast(this, 0, ((Intent) (obj)), 0x8000000));
        }
        catch (RuntimeException runtimeexception)
        {
            com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.f, p.cx.x.b.a);
            throw runtimeexception;
        }
        try
        {
            if (pushnotification.h != null)
            {
                d.a(a(pushnotification.h, pushnotification.a, a, b));
            }
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.g, p.cx.x.b.a);
        }
        catch (RuntimeException runtimeexception1)
        {
            com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.g, p.cx.x.b.a);
            throw runtimeexception1;
        }
        try
        {
            d.a(0x7f02022b);
            d.b(true);
            d.a(true);
            d.a(System.currentTimeMillis());
            ((NotificationManager)getSystemService("notification")).notify(pushnotification.a, 0, d.a());
            return;
        }
        catch (RuntimeException runtimeexception2)
        {
            com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.h, p.cx.x.b.a);
            throw runtimeexception2;
        }
          goto _L5
_L2:
        try
        {
            obj = getString(0x7f08009e);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.e, p.cx.x.b.a);
            throw obj;
        }
          goto _L5
_L4:
        d.b(a(new CharSequence[] {
            pushnotification.d, pushnotification.f, pushnotification.e
        }));
          goto _L6
        obj = Uri.parse("pandorav2:/");
          goto _L7
    }

    void a(String s)
    {
        ((NotificationManager)getSystemService("notification")).cancel(s, 0);
    }

    boolean a(PushNotification pushnotification, ai ai1)
    {
        while (!ai1.g() || pushnotification.j == PushNotification.b.a && !ai1.i() || pushnotification.j == com.pandora.android.push.PushNotification.b.b && !ai1.k()) 
        {
            return false;
        }
        return true;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            if ("com.pandora.android.push.action.PROCESS_NOTIFICATION".equals(s))
            {
                PushNotification pushnotification = (PushNotification)intent.getParcelableExtra("com.pandora.android.push.extra.NOTIFICATION");
                if (ForegroundMonitorService.a() || !a(pushnotification, b.a.b().k().t()))
                {
                    com.pandora.android.push.a.a().a(pushnotification.a, p.cx.x.a.c, p.cx.x.b.a);
                } else
                {
                    a(pushnotification);
                }
            }
            if ("com.pandora.android.push.action.CLEAR_NOTIFICATION".equals(s))
            {
                a(intent.getStringExtra("com.pandora.android.push.extra.NOTIFICATION_ID"));
            }
            if ("com.pandora.android.push.action.SEND_CLEAR_NOTIFICATION".equals(s))
            {
                a(intent.getStringExtra("com.pandora.android.push.extra.NOTIFICATION_ID"), intent.getStringExtra("com.pandora.android.push.extra.NOTIFICATION_KEY"));
            }
            GCMReceiver.a(intent);
        }
    }

}
