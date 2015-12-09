// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BatteryReceiver extends BroadcastReceiver
{

    private int health;
    private int plugged;
    private boolean present;
    private int scale;
    private int status;
    private String technology;
    private int temperature;
    private int value;
    private int voltage;

    public BatteryReceiver()
    {
        value = -1;
        health = -1;
        plugged = -1;
        status = -1;
        temperature = -1;
        voltage = -1;
        scale = -1;
        present = false;
    }

    public final int getHealth()
    {
        return health;
    }

    public final int getPlugged()
    {
        return plugged;
    }

    public final int getScale()
    {
        return scale;
    }

    public final int getStatus()
    {
        return status;
    }

    public final String getTechnology()
    {
        if (technology == null)
        {
            return "NA";
        } else
        {
            return technology;
        }
    }

    public final int getTemperature()
    {
        return temperature;
    }

    public final int getValue()
    {
        return value;
    }

    public final int getVoltage()
    {
        return voltage;
    }

    public final boolean isPresent()
    {
        return present;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.BATTERY_CHANGED".equalsIgnoreCase(intent.getAction()))
        {
            value = intent.getIntExtra("level", 0);
            health = intent.getIntExtra("health", 0);
            plugged = intent.getIntExtra("plugged", 0);
            status = intent.getIntExtra("status", 0);
            temperature = intent.getIntExtra("temperature", 0);
            voltage = intent.getIntExtra("voltage", 0);
            scale = intent.getIntExtra("scale", 0);
            present = intent.getBooleanExtra("present", false);
            technology = intent.getStringExtra("technology");
        }
    }
}
