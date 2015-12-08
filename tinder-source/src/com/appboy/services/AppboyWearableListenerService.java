// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import android.content.Context;
import bo.app.an;
import bo.app.bu;
import bo.app.by;
import bo.app.es;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.p;
import com.google.android.gms.wearable.q;
import java.util.Iterator;

public class AppboyWearableListenerService extends q
{

    private static final String a;
    private by b;
    private c c;

    public AppboyWearableListenerService()
    {
    }

    public void doAppboySdkActionFromDataMap(Context context, i i)
    {
        an an1 = es.b(i);
        if (an1 == an.y)
        {
            context = es.a(i);
            if (context != null)
            {
                b.a(context);
            }
            return;
        } else
        {
            AppboyLogger.i(a, (new StringBuilder("Received Wear sdk action of type: ")).append(an1.name()).toString());
            es.a(i, Appboy.getInstance(context));
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        c = (new com.google.android.gms.common.api.c.a(this)).b(p.l).b();
        c.b();
        b = new bu(super.getApplicationContext());
    }

    public void onDataChanged(f f1)
    {
        if (c.a(p.l))
        {
            f1 = f1.iterator();
            do
            {
                if (!f1.hasNext())
                {
                    break;
                }
                Object obj = (e)f1.next();
                if (((e) (obj)).c() == 1)
                {
                    obj = ((e) (obj)).b();
                    i i = j.a(((g) (obj))).a();
                    doAppboySdkActionFromDataMap(super.getApplicationContext(), i);
                    p.a.a(c, ((g) (obj)).b());
                }
            } while (true);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/services/AppboyWearableListenerService.getName()
        });
    }
}
