// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

class zza
{

    static com.google.android.gms.gcm.zza a;
    private Context b;

    private zza(Context context)
    {
        b = context.getApplicationContext();
    }

    private int a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new zza("Missing icon");
        }
        Resources resources = b.getResources();
        int i = resources.getIdentifier(s, "drawable", b.getPackageName());
        if (i == 0)
        {
            int j = resources.getIdentifier(s, "mipmap", b.getPackageName());
            i = j;
            if (j == 0)
            {
                throw new zza((new StringBuilder()).append("Icon resource not found: ").append(s).toString());
            }
        }
        return i;
    }

    static com.google.android.gms.gcm.zza a(Context context)
    {
        com/google/android/gms/gcm/zza;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new com.google.android.gms.gcm.zza(context);
        }
        context = a;
        com/google/android/gms/gcm/zza;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String a(Bundle bundle, String s)
    {
        String s2 = bundle.getString(s);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = bundle.getString(s.replace("gcm.n.", "gcm.notification."));
        }
        return s1;
    }

    private void a(String s, Notification notification)
    {
        if (Log.isLoggable("GcmNotification", 3))
        {
            Log.d("GcmNotification", "Showing notification");
        }
        NotificationManager notificationmanager = (NotificationManager)b.getSystemService("notification");
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = (new StringBuilder()).append("GCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        notificationmanager.notify(s1, 0, notification);
    }

    static boolean a(Bundle bundle)
    {
        return a(bundle, "gcm.n.title") != null;
    }

    private Uri b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        if ("default".equals(s))
        {
            return RingtoneManager.getDefaultUri(2);
        } else
        {
            throw new zza((new StringBuilder()).append("Invalid sound: ").append(s).toString());
        }
    }

    private Notification c(Bundle bundle)
    {
        Object obj = a(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new zza("Missing title");
        }
        String s = a(bundle, "gcm.n.body");
        int i = a(a(bundle, "gcm.n.icon"));
        Uri uri = b(a(bundle, "gcm.n.sound"));
        PendingIntent pendingintent = d(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = (new android.app.Notification.Builder(b)).setAutoCancel(true).setSmallIcon(i).setContentTitle(((CharSequence) (obj))).setContentText(s);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                bundle = a(bundle, "gcm.n.color");
                if (!TextUtils.isEmpty(bundle))
                {
                    ((android.app.Notification.Builder) (obj)).setColor(Color.parseColor(bundle));
                }
            }
            if (uri != null)
            {
                ((android.app.Notification.Builder) (obj)).setSound(uri);
            }
            if (pendingintent != null)
            {
                ((android.app.Notification.Builder) (obj)).setContentIntent(pendingintent);
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                return ((android.app.Notification.Builder) (obj)).build();
            } else
            {
                return ((android.app.Notification.Builder) (obj)).getNotification();
            }
        }
        Notification notification = new Notification();
        notification.flags = notification.flags | 0x10;
        notification.icon = i;
        if (uri != null)
        {
            notification.sound = uri;
        }
        bundle = pendingintent;
        if (pendingintent == null)
        {
            bundle = new Intent();
            bundle.setPackage("com.google.example.invalidpackage");
            bundle = PendingIntent.getBroadcast(b, 0, bundle, 0);
        }
        notification.setLatestEventInfo(b, ((CharSequence) (obj)), s, bundle);
        return notification;
    }

    private PendingIntent d(Bundle bundle)
    {
        Object obj = a(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        }
        obj = new Intent(((String) (obj)));
        ((Intent) (obj)).setPackage(b.getPackageName());
        ((Intent) (obj)).setFlags(0x10000000);
        ((Intent) (obj)).putExtras(bundle);
        bundle = bundle.keySet().iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            String s = (String)bundle.next();
            if (s.startsWith("gcm.n.") || s.startsWith("gcm.notification."))
            {
                ((Intent) (obj)).removeExtra(s);
            }
        } while (true);
        return PendingIntent.getActivity(b, 0, ((Intent) (obj)), 0x40000000);
    }

    boolean b(Bundle bundle)
    {
        try
        {
            Notification notification = c(bundle);
            a(a(bundle, "gcm.n.tag"), notification);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.w("GcmNotification", (new StringBuilder()).append("Failed to show notification: ").append(bundle.getMessage()).toString());
            return false;
        }
        return true;
    }

    private class zza extends IllegalArgumentException
    {

        final com.google.android.gms.gcm.zza zzavG;

        private zza(String s)
        {
            zzavG = com.google.android.gms.gcm.zza.this;
            super(s);
        }

    }

}
