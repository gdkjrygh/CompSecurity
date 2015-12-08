// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amobee.richmedia.controller.OrmmaNetworkController;

public class OrmmaNetworkBroadcastReceiver extends BroadcastReceiver
{

    private OrmmaNetworkController mOrmmaNetworkController;

    public OrmmaNetworkBroadcastReceiver(OrmmaNetworkController ormmanetworkcontroller)
    {
        mOrmmaNetworkController = ormmanetworkcontroller;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            mOrmmaNetworkController.onConnectionChanged();
        }
    }
}
