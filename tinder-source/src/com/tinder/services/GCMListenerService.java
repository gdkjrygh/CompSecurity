// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.google.android.gms.gcm.a;
import com.tinder.activities.ActivityMain;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerNotifications;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.model.SparksEvent;
import java.util.Iterator;
import java.util.Set;

public class GCMListenerService extends a
{

    d a;
    ManagerNotifications b;

    public GCMListenerService()
    {
        ManagerApp.h().a(this);
    }

    public final void a(String s, Bundle bundle)
    {
        super.a(s, bundle);
        (new StringBuilder("********************************** extras: ")).append(bundle);
        if (d.b() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s2;
        byte byte0;
        obj = bundle.keySet();
        s = new SparksEvent("Push.Receive");
        String s1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(s1, bundle.get(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        s.fire();
        s = bundle.getString("notification.message");
        obj = bundle.getString("notification.campaignId");
        s2 = bundle.getString("notification.type");
        bundle = bundle.getString("notification.match_id");
        if (s2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 4: default 172
    //                   -1718391333: 261
    //                   -1340115421: 213
    //                   92899676: 245
    //                   103668165: 229;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        byte0;
        JVM INSTR tableswitch 0 3: default 204
    //                   0 277
    //                   1 292
    //                   2 307
    //                   3 332;
           goto _L8 _L9 _L10 _L11 _L12
_L8:
        b.a(s);
        return;
_L5:
        if (s2.equals("message_notification"))
        {
            byte0 = 0;
        }
          goto _L3
_L7:
        if (s2.equals("match"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        if (s2.equals("alert"))
        {
            byte0 = 2;
        }
          goto _L3
_L4:
        if (s2.equals("super_like"))
        {
            byte0 = 3;
        }
          goto _L3
_L9:
        obj = com.tinder.managers.ManagerNotifications.NotificationType.b;
        b.a(s, ((com.tinder.managers.ManagerNotifications.NotificationType) (obj)), bundle);
        return;
_L10:
        obj = com.tinder.managers.ManagerNotifications.NotificationType.a;
        b.a(s, ((com.tinder.managers.ManagerNotifications.NotificationType) (obj)), bundle);
        return;
_L11:
        bundle = new SparksEvent("Push.Market");
        bundle.put("campaignId", obj);
        bundle.fire();
          goto _L8
_L12:
        bundle = b;
        boolean flag;
        if (ae.b() && ae.z())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (ManagerApp.f())
            {
                bundle.b(s, com.tinder.managers.ManagerNotifications.NotificationType.d, null);
                return;
            } else
            {
                Object obj1 = new Intent(((ManagerNotifications) (bundle)).a, com/tinder/activities/ActivityMain);
                ((Intent) (obj1)).setFlags(0x10008000);
                bundle.d = PendingIntent.getActivity(((ManagerNotifications) (bundle)).a, 0, ((Intent) (obj1)), 0x40000000);
                obj1 = new android.support.v4.app.aa.d(((ManagerNotifications) (bundle)).a);
                Bitmap bitmap = BitmapFactory.decodeResource(((ManagerNotifications) (bundle)).a.getResources(), 0x7f020233);
                ((android.support.v4.app.aa.d) (obj1)).setDefaults(6).setContentIntent(((ManagerNotifications) (bundle)).d).setContentTitle(((ManagerNotifications) (bundle)).e).setStyle((new android.support.v4.app.aa.c()).c(s)).setContentText(s).setOnlyAlertOnce(true).setAutoCancel(true).setTicker(s).setSmallIcon(0x7f0200fe).setLargeIcon(bitmap);
                bundle.c = ((android.support.v4.app.aa.d) (obj1)).build();
                ((ManagerNotifications) (bundle)).b.notify(9000, ((ManagerNotifications) (bundle)).c);
                bitmap.recycle();
                return;
            }
        }
        if (true) goto _L1; else goto _L13
_L13:
    }
}
