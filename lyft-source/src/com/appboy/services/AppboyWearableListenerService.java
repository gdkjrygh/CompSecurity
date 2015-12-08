// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import android.content.Context;
import bo.app.as;
import bo.app.ca;
import bo.app.ce;
import bo.app.ey;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.Iterator;

public class AppboyWearableListenerService extends WearableListenerService
{

    private static final String a;
    private ce b;
    private GoogleApiClient c;

    public AppboyWearableListenerService()
    {
    }

    public void doAppboySdkActionFromDataMap(Context context, DataMap datamap)
    {
        as as1 = ey.b(datamap);
        if (as1 == as.y)
        {
            context = ey.a(datamap);
            if (context != null)
            {
                b.a(context);
            }
            return;
        } else
        {
            AppboyLogger.i(a, (new StringBuilder("Received Wear sdk action of type: ")).append(as1.name()).toString());
            ey.a(datamap, Appboy.getInstance(context));
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        String s = a;
        c = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).a(Wearable.k, new Scope[0]).b();
        c.b();
        b = new ca(super.getApplicationContext());
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        if (c.a(Wearable.k))
        {
            dataeventbuffer = dataeventbuffer.iterator();
            do
            {
                if (!dataeventbuffer.hasNext())
                {
                    break;
                }
                Object obj = (DataEvent)dataeventbuffer.next();
                if (((DataEvent) (obj)).c() == 1)
                {
                    obj = ((DataEvent) (obj)).b();
                    DataMap datamap = DataMapItem.a(((DataItem) (obj))).a();
                    doAppboySdkActionFromDataMap(super.getApplicationContext(), datamap);
                    Wearable.a.a(c, ((DataItem) (obj)).b());
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
