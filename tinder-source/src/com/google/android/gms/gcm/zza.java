// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

final class com.google.android.gms.gcm.zza
{
    private class zza extends IllegalArgumentException
    {

        final com.google.android.gms.gcm.zza a;

        private zza(String s)
        {
            a = com.google.android.gms.gcm.zza.this;
            super(s);
        }

        zza(String s, byte byte0)
        {
            this(s);
        }
    }


    static com.google.android.gms.gcm.zza a;
    private Context b;

    private com.google.android.gms.gcm.zza(Context context)
    {
        b = context.getApplicationContext();
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

    private PendingIntent b(Bundle bundle)
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
        return PendingIntent.getActivity(b, (int)SystemClock.uptimeMillis(), ((Intent) (obj)), 0x40000000);
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
            throw new zza((new StringBuilder()).append((new StringBuilder()).append(s).append("_loc_key").toString().substring(6)).append(" resource not found: ").append(((String) (obj))).toString(), (byte)0);
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
            throw new zza((new StringBuilder("Malformed ")).append((new StringBuilder()).append(s).append("_loc_args").toString().substring(6)).append(": ").append(bundle).toString(), (byte)0);
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
            throw new zza((new StringBuilder("Missing format argument for ")).append(((String) (obj))).append(": ").append(bundle).toString(), (byte)0);
        }
        return bundle;
    }

    final boolean a(Bundle bundle)
    {
        String s;
        try
        {
            s = b(bundle, "gcm.n.title");
            if (TextUtils.isEmpty(s))
            {
                throw new zza("Missing title", (byte)0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.w("GcmNotification", (new StringBuilder("Failed to show notification: ")).append(bundle.getMessage()).toString());
            return false;
        }
        Object obj;
        Object obj1;
        String s1;
        int i;
        s1 = b(bundle, "gcm.n.body");
        obj = a(bundle, "gcm.n.icon");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new zza("Missing icon", (byte)0);
        }
        obj1 = b.getResources();
        i = ((Resources) (obj1)).getIdentifier(((String) (obj)), "drawable", b.getPackageName());
        if (i == 0) goto _L2; else goto _L1
_L1:
        obj = a(bundle, "gcm.n.sound");
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj = null;
_L12:
        Object obj2 = b(bundle);
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L6; else goto _L5
_L5:
        obj1 = (new android.app.Notification.Builder(b)).setAutoCancel(true).setSmallIcon(i).setContentTitle(s).setContentText(s1);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            s = a(bundle, "gcm.n.color");
            if (!TextUtils.isEmpty(s))
            {
                ((android.app.Notification.Builder) (obj1)).setColor(Color.parseColor(s));
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        ((android.app.Notification.Builder) (obj1)).setSound(((android.net.Uri) (obj)));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        ((android.app.Notification.Builder) (obj1)).setContentIntent(((PendingIntent) (obj2)));
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L8; else goto _L7
_L7:
        obj = ((android.app.Notification.Builder) (obj1)).build();
_L13:
        obj1 = a(bundle, "gcm.n.tag");
        if (Log.isLoggable("GcmNotification", 3))
        {
            Log.d("GcmNotification", "Showing notification");
        }
        obj2 = (NotificationManager)b.getSystemService("notification");
        bundle = ((Bundle) (obj1));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            bundle = (new StringBuilder("GCM-Notification:")).append(SystemClock.uptimeMillis()).toString();
        }
        ((NotificationManager) (obj2)).notify(bundle, 0, ((android.app.Notification) (obj)));
        return true;
_L2:
        if ((i = ((Resources) (obj1)).getIdentifier(((String) (obj)), "mipmap", b.getPackageName())) == 0) goto _L9; else goto _L1
_L9:
        throw new zza((new StringBuilder("Icon resource not found: ")).append(((String) (obj))).toString(), (byte)0);
_L4:
        if (!"default".equals(obj)) goto _L11; else goto _L10
_L10:
        obj = RingtoneManager.getDefaultUri(2);
          goto _L12
_L11:
        throw new zza((new StringBuilder("Invalid sound: ")).append(((String) (obj))).toString(), (byte)0);
_L8:
        obj = ((android.app.Notification.Builder) (obj1)).getNotification();
          goto _L13
_L6:
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        obj1 = new Intent();
        ((Intent) (obj1)).setPackage("com.google.example.invalidpackage");
        obj1 = PendingIntent.getBroadcast(b, 0, ((Intent) (obj1)), 0);
        obj1 = (new android.support.v4.app.aa.d(b)).setSmallIcon(i).setAutoCancel(true).setContentIntent(((PendingIntent) (obj1))).setContentTitle(s).setContentText(s1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        ((android.support.v4.app.aa.d) (obj1)).setSound(((android.net.Uri) (obj)));
        obj = ((android.support.v4.app.aa.d) (obj1)).build();
          goto _L13
    }
}
