// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.ap;
import com.facebook.h;
import com.facebook.o;

public class bz
{

    private final Service a;
    private boolean b;

    bz(Service service)
    {
        a = service;
    }

    void a()
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            Object obj1 = a.getResources();
            Object obj = ((Resources) (obj1)).getString(o.preference_notifications_chat_heads_title);
            obj1 = ((Resources) (obj1)).getString(o.app_name_long);
            PendingIntent pendingintent = PendingIntent.getActivity(a, (int)System.currentTimeMillis(), new Intent(), 0);
            obj = (new ap(a)).a(h.chat_heads_notification_icon).a(((CharSequence) (obj))).b(((CharSequence) (obj1))).b(-2).a(pendingintent).b();
            a.startForeground(10006, ((android.app.Notification) (obj)));
            return;
        }
    }

    void b()
    {
        if (!b)
        {
            return;
        } else
        {
            a.stopForeground(true);
            b = false;
            return;
        }
    }
}
