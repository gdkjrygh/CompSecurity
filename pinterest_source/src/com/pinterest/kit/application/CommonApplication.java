// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.application;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.multidex.MultiDexApplication;

public class CommonApplication extends MultiDexApplication
{

    private static Context _context;

    public CommonApplication()
    {
    }

    public static Application context()
    {
        return (Application)_context;
    }

    protected void init()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        _context = getApplicationContext();
        init();
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
        try
        {
            super.unregisterReceiver(broadcastreceiver);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BroadcastReceiver broadcastreceiver)
        {
            return;
        }
    }
}
