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
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class c
{
    private class a extends IllegalArgumentException
    {

        final c a;

        private a(String s)
        {
            a = c.this;
            super(s);
        }

    }


    static c a;
    private Context b;

    private c(Context context)
    {
        b = context.getApplicationContext();
    }

    static c a(Context context)
    {
        com/google/android/gms/gcm/c;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new c(context);
        }
        context = a;
        com/google/android/gms/gcm/c;
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

    private String a(String s)
    {
        return s.substring("gcm.n.".length());
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
        return a(bundle, "gcm.n.icon") != null;
    }

    private int b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new a("Missing icon");
        }
        Resources resources = b.getResources();
        int i = resources.getIdentifier(s, "drawable", b.getPackageName());
        if (i == 0)
        {
            int j = resources.getIdentifier(s, "mipmap", b.getPackageName());
            i = j;
            if (j == 0)
            {
                throw new a((new StringBuilder()).append("Icon resource not found: ").append(s).toString());
            }
        }
        return i;
    }

    private String b(Bundle bundle, String s)
    {
        Object obj = a(bundle, s);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return ((String) (obj));
        }
        obj = a(bundle, (new StringBuilder()).append(s).append("_loc_key").toString());
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        }
        Resources resources = b.getResources();
        int j = resources.getIdentifier(((String) (obj)), "string", b.getPackageName());
        if (j == 0)
        {
            throw new a((new StringBuilder()).append(a((new StringBuilder()).append(s).append("_loc_key").toString())).append(" resource not found: ").append(((String) (obj))).toString());
        }
        bundle = a(bundle, (new StringBuilder()).append(s).append("_loc_args").toString());
        if (TextUtils.isEmpty(bundle))
        {
            return resources.getString(j);
        }
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new a((new StringBuilder()).append("Malformed ").append(a((new StringBuilder()).append(s).append("_loc_args").toString())).append(": ").append(bundle).toString());
        }
        bundle = new String[jsonarray.length()];
        for (int i = 0; i < bundle.length; i++)
        {
            bundle[i] = jsonarray.opt(i);
        }

        try
        {
            bundle = resources.getString(j, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new a((new StringBuilder()).append("Missing format argument for ").append(((String) (obj))).append(": ").append(bundle).toString());
        }
        return bundle;
    }

    private Notification c(Bundle bundle)
    {
        Object obj = b(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new a("Missing title");
        }
        String s = b(bundle, "gcm.n.body");
        int i = b(a(bundle, "gcm.n.icon"));
        Uri uri = c(a(bundle, "gcm.n.sound"));
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

    private Uri c(String s)
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
            throw new a((new StringBuilder()).append("Invalid sound: ").append(s).toString());
        }
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
}
