// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationStatusCodes;

class agR
    implements com.google.android.gms.location.agR
{

    final nStatusCodes.eD agR;

    public void a(int i, PendingIntent pendingintent)
    {
        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
    }

    public void b(int i, String as[])
    {
        agR.agR(LocationStatusCodes.eD(i));
    }

    nStatusCodes(nStatusCodes nstatuscodes)
    {
        agR = nstatuscodes;
        super();
    }
}
