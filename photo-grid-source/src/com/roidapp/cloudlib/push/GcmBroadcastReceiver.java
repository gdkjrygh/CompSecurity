// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.google.android.gms.gcm.a;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.PushAdActivity;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import java.util.HashSet;

// Referenced classes of package com.roidapp.cloudlib.push:
//            e, f

public class GcmBroadcastReceiver extends BroadcastReceiver
{

    public static int a = 3749;
    public static int b = 3748;
    public static String c = "GP_GCM";
    private static HashSet d = new HashSet();

    public GcmBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (context != null && intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!"com.roidapp.photogrid.notification".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_593;
        }
        intent = intent.getExtras();
        if (context == null || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = intent.getString("pushid");
        if (s != null)
        {
            com.roidapp.baselib.c.b.b("open", s);
        }
        intent.getInt("pushType", -1);
        JVM INSTR tableswitch 1 13: default 124
    //                   1 125
    //                   2 154
    //                   3 221
    //                   4 251
    //                   5 8
    //                   6 8
    //                   7 8
    //                   8 8
    //                   9 262
    //                   10 315
    //                   11 376
    //                   12 431
    //                   13 532;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L8 _L8 _L9 _L10 _L11 _L12 _L13
_L13:
        break; /* Loop/switch isn't completed */
_L8:
        break; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        int i = intent.getInt("version", -1);
        if (n.c(context) < i)
        {
            com.roidapp.cloudlib.ads.b.a(context, null, "market://details?id=com.roidapp.photogrid", "http://dl.cm.ksmobile.com/photogrid/photoGrid.apk", false);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        Intent intent1 = new Intent(context, al.g().a());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent1.setFlags(0x4000000);
        } else
        {
            intent1.setFlags(32768);
        }
        intent1.addFlags(0x10000000);
        intent1.putExtra("gcm_page", intent.getInt("page", 0));
        context.startActivity(intent1);
        return;
_L6:
        String s1 = intent.getString("package");
        String s2 = intent.getString("url");
        com.roidapp.cloudlib.ads.b.a(context, s1, intent.getString("playUrl"), s2, true);
        return;
_L7:
        com.roidapp.cloudlib.ads.b.a(context, intent.getString("url"));
        return;
_L9:
        intent = new Intent(context, al.g().a());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent.setFlags(0x4000000);
        } else
        {
            intent.setFlags(32768);
        }
        intent.addFlags(0x10000000);
        context.startActivity(intent);
        return;
_L10:
        intent = new Intent(context, al.g().a());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent.setFlags(0x4000000);
        } else
        {
            intent.setFlags(32768);
        }
        intent.addFlags(0x10000000);
        intent.putExtra("gcm_page", 2);
        context.startActivity(intent);
        return;
_L11:
        Intent intent2 = new Intent(context, com/roidapp/cloudlib/ads/PushAdActivity);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent2.setFlags(0x4000000);
        } else
        {
            intent2.setFlags(32768);
        }
        intent2.addFlags(0x10000000);
        intent2.putExtras(intent);
        context.startActivity(intent2);
        return;
_L12:
        if (intent == null) goto _L15; else goto _L14
_L15:
        if (true) goto _L1; else goto _L16
_L14:
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        if (notificationmanager != null)
        {
            notificationmanager.cancelAll();
        }
        int j = intent.getInt("snsPid", 0);
        intent = new Intent(context, al.g().a());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent.setFlags(0x4000000);
        } else
        {
            intent.setFlags(32768);
        }
        intent.addFlags(0x10000000);
        intent.putExtra("snsPush", true);
        intent.putExtra("snsPid", j);
        context.startActivity(intent);
        return;
_L16:
        intent = new Intent(context, al.g().a());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            intent.setFlags(0x4000000);
        } else
        {
            intent.setFlags(32768);
        }
        intent.addFlags(0x10000000);
        intent.putExtra("gcm_page", 3);
        context.startActivity(intent);
        return;
        Bundle bundle = intent.getExtras();
        com.google.android.gms.gcm.a.a(context);
        intent = com.google.android.gms.gcm.a.a(intent);
        if (bundle != null && !bundle.isEmpty() && "gcm".equals(intent) && "gcm".equals(intent))
        {
            intent = com.roidapp.cloudlib.push.e.a(context, bundle.getString("msg"));
            if (intent != null)
            {
                int i1 = intent.length;
                int k = 0;
                while (k < i1) 
                {
                    Object obj = intent[k];
                    if (obj != null && ((f) (obj)).g != null && ((f) (obj)).d != null && (((f) (obj)).e != null || ((f) (obj)).f != null) && d.add(((f) (obj)).d))
                    {
                        if (((f) (obj)).i)
                        {
                            com.roidapp.baselib.c.b.b("show", ((f) (obj)).d);
                        }
                        if (obj != null && ((f) (obj)).g != null)
                        {
                            NotificationManager notificationmanager1 = (NotificationManager)context.getSystemService("notification");
                            if (notificationmanager1 != null)
                            {
                                android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
                                int l;
                                if (android.os.Build.VERSION.SDK_INT >= 21)
                                {
                                    l = aq.Q;
                                } else
                                {
                                    l = aq.R;
                                }
                                builder = builder.setSmallIcon(l).setContentTitle(((f) (obj)).e).setAutoCancel(true).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((f) (obj)).f)).setContentText(((f) (obj)).f).setDefaults(((f) (obj)).a);
                                if (android.os.Build.VERSION.SDK_INT >= 21)
                                {
                                    SecurityException securityexception;
                                    Intent intent3;
                                    if (((f) (obj)).h != null && !((f) (obj)).h.isRecycled())
                                    {
                                        builder.setLargeIcon(((f) (obj)).h);
                                    } else
                                    {
                                        builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), aq.R));
                                    }
                                    builder.setColor(0xff00cc00);
                                }
                                intent3 = new Intent("com.roidapp.photogrid.notification");
                                intent3.putExtras(((f) (obj)).g);
                                builder.setContentIntent(PendingIntent.getBroadcast(context, (int)(Math.random() * 10000D), intent3, 0x40000000));
                                try
                                {
                                    notificationmanager1.notify(((f) (obj)).c, ((f) (obj)).b, builder.build());
                                }
                                // Misplaced declaration of an exception variable
                                catch (SecurityException securityexception) { }
                            }
                        }
                    }
                    k++;
                }
            }
        }
        if (true) goto _L1; else goto _L17
_L17:
    }

}
