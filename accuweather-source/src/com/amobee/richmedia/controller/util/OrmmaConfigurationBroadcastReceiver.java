// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amobee.richmedia.controller.OrmmaDisplayController;

public class OrmmaConfigurationBroadcastReceiver extends BroadcastReceiver
{

    private int mLastOrientation;
    private OrmmaDisplayController mOrmmaDisplayController;

    public OrmmaConfigurationBroadcastReceiver(OrmmaDisplayController ormmadisplaycontroller)
    {
        mOrmmaDisplayController = ormmadisplaycontroller;
        mLastOrientation = mOrmmaDisplayController.getOrientation();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED"))
        {
            mOrmmaDisplayController.onOrientationMightBeChanged();
        }
    }
}
