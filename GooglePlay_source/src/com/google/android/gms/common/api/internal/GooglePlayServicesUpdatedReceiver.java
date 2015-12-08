// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailability;

abstract class GooglePlayServicesUpdatedReceiver extends BroadcastReceiver
{

    protected Context mContext;

    GooglePlayServicesUpdatedReceiver()
    {
    }

    public static GooglePlayServicesUpdatedReceiver register(Context context, GooglePlayServicesUpdatedReceiver googleplayservicesupdatedreceiver)
    {
        GoogleApiAvailability.getInstance();
        return register$2dbab250(context, googleplayservicesupdatedreceiver);
    }

    public static GooglePlayServicesUpdatedReceiver register$2dbab250(Context context, GooglePlayServicesUpdatedReceiver googleplayservicesupdatedreceiver)
    {
        Object obj = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter) (obj)).addDataScheme("package");
        context.registerReceiver(googleplayservicesupdatedreceiver, ((IntentFilter) (obj)));
        googleplayservicesupdatedreceiver.mContext = context;
        obj = googleplayservicesupdatedreceiver;
        if (!GoogleApiAvailability.isUninstalledAppPossiblyUpdating(context, "com.google.android.gms"))
        {
            googleplayservicesupdatedreceiver.onUpdated();
            googleplayservicesupdatedreceiver.unregister();
            obj = null;
        }
        return ((GooglePlayServicesUpdatedReceiver) (obj));
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getData();
        context = null;
        if (intent != null)
        {
            context = intent.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(context))
        {
            onUpdated();
            unregister();
        }
    }

    protected abstract void onUpdated();

    public final void unregister()
    {
        this;
        JVM INSTR monitorenter ;
        if (mContext != null)
        {
            mContext.unregisterReceiver(this);
        }
        mContext = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
