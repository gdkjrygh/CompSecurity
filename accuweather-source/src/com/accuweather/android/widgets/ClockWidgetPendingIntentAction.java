// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


public final class ClockWidgetPendingIntentAction extends Enum
{

    private static final ClockWidgetPendingIntentAction $VALUES[];
    public static final ClockWidgetPendingIntentAction GetFullApp;
    public static final ClockWidgetPendingIntentAction OpenAlertsFullApp;
    public static final ClockWidgetPendingIntentAction OpenDailyFullApp;
    public static final ClockWidgetPendingIntentAction OpenMinuteCast;
    public static final ClockWidgetPendingIntentAction OpenMobileAlerts;
    public static final ClockWidgetPendingIntentAction OpenMobileNow;
    public static final ClockWidgetPendingIntentAction OpenNowFullApp;
    public static final ClockWidgetPendingIntentAction OpenWidgetConfiguration;

    private ClockWidgetPendingIntentAction(String s, int i)
    {
        super(s, i);
    }

    public static ClockWidgetPendingIntentAction valueOf(String s)
    {
        return (ClockWidgetPendingIntentAction)Enum.valueOf(com/accuweather/android/widgets/ClockWidgetPendingIntentAction, s);
    }

    public static ClockWidgetPendingIntentAction[] values()
    {
        return (ClockWidgetPendingIntentAction[])$VALUES.clone();
    }

    public int getRequestCode(int i)
    {
        return values().length * i + ordinal();
    }

    static 
    {
        OpenNowFullApp = new ClockWidgetPendingIntentAction("OpenNowFullApp", 0);
        OpenAlertsFullApp = new ClockWidgetPendingIntentAction("OpenAlertsFullApp", 1);
        OpenDailyFullApp = new ClockWidgetPendingIntentAction("OpenDailyFullApp", 2);
        OpenMobileAlerts = new ClockWidgetPendingIntentAction("OpenMobileAlerts", 3);
        OpenMobileNow = new ClockWidgetPendingIntentAction("OpenMobileNow", 4);
        GetFullApp = new ClockWidgetPendingIntentAction("GetFullApp", 5);
        OpenWidgetConfiguration = new ClockWidgetPendingIntentAction("OpenWidgetConfiguration", 6);
        OpenMinuteCast = new ClockWidgetPendingIntentAction("OpenMinuteCast", 7);
        $VALUES = (new ClockWidgetPendingIntentAction[] {
            OpenNowFullApp, OpenAlertsFullApp, OpenDailyFullApp, OpenMobileAlerts, OpenMobileNow, GetFullApp, OpenWidgetConfiguration, OpenMinuteCast
        });
    }
}
