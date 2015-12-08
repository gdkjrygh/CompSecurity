// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location;


public interface IDownloadGeofenceAlarmManager
{

    public static final String ACTION_WAKEUP_ALARM = "Action_Wakeup_Alarm";
    public static final long ONE_DAY_MILLS = 0x240c8400L;

    public abstract void setDailyDownloadGeofenceAlarm();
}
