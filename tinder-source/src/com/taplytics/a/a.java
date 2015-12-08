// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics.a;

import android.app.IntentService;
import android.content.Intent;
import com.taplytics.b;
import com.taplytics.ci;
import com.taplytics.gs;
import com.taplytics.h;
import com.taplytics.hq;

public class a extends IntentService
{

    public a()
    {
        super("TLGeofenceEventService");
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = new b("com.google.android.gms.location.GeofencingEvent", "fromIntent", new Class[] {
            android/content/Intent
        }, new Object[] {
            intent
        });
        if (((Boolean)intent.a("hasError")).booleanValue())
        {
            gs.c((new StringBuilder("Geofencing event error: ")).append(((Integer)intent.a("getErrorCode")).intValue()).toString());
            return;
        }
        try
        {
            hq hq1 = new hq();
            hq1.a(new h(this, intent));
            ci.b().a(null, hq1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            gs.c((new StringBuilder("Error: ")).append(intent.getMessage()).append(", when adding geofences").toString());
        }
        return;
    }
}
