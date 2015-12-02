// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ap;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

public class ax
{

    private static final Class a = com/facebook/orca/fbwebrtc/ax;
    private final Context b;
    private final NotificationManager c;

    public ax(Context context, NotificationManager notificationmanager)
    {
        b = context;
        c = notificationmanager;
    }

    public void a()
    {
        c.cancel(10005);
    }

    public void a(long l, String s)
    {
        Object obj = new Intent(b, com/facebook/orca/fbwebrtc/WebrtcIncallActivity);
        ((Intent) (obj)).setAction("com.facebook.orca.fbwebrtc.intent.action.SHOW_UI");
        ((Intent) (obj)).putExtra("CONTACT_ID", l);
        obj = PendingIntent.getActivity(b, 0, ((Intent) (obj)), 0x10000000);
        s = (new ap(b)).a(0x1080084).a(s).b(b.getString(o.webrtc_notification_incall_text)).a(true).a(((PendingIntent) (obj))).a();
        c.notify(10005, s);
    }

}
