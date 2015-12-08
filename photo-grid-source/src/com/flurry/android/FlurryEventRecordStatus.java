// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;


public final class FlurryEventRecordStatus extends Enum
{

    private static final FlurryEventRecordStatus a[];
    public static final FlurryEventRecordStatus kFlurryEventAnalyticsDisabled;
    public static final FlurryEventRecordStatus kFlurryEventFailed;
    public static final FlurryEventRecordStatus kFlurryEventLogCountExceeded;
    public static final FlurryEventRecordStatus kFlurryEventLoggingDelayed;
    public static final FlurryEventRecordStatus kFlurryEventParamsCountExceeded;
    public static final FlurryEventRecordStatus kFlurryEventRecorded;
    public static final FlurryEventRecordStatus kFlurryEventUniqueCountExceeded;

    private FlurryEventRecordStatus(String s, int i)
    {
        super(s, i);
    }

    public static FlurryEventRecordStatus valueOf(String s)
    {
        return (FlurryEventRecordStatus)Enum.valueOf(com/flurry/android/FlurryEventRecordStatus, s);
    }

    public static FlurryEventRecordStatus[] values()
    {
        return (FlurryEventRecordStatus[])a.clone();
    }

    static 
    {
        kFlurryEventFailed = new FlurryEventRecordStatus("kFlurryEventFailed", 0);
        kFlurryEventRecorded = new FlurryEventRecordStatus("kFlurryEventRecorded", 1);
        kFlurryEventUniqueCountExceeded = new FlurryEventRecordStatus("kFlurryEventUniqueCountExceeded", 2);
        kFlurryEventParamsCountExceeded = new FlurryEventRecordStatus("kFlurryEventParamsCountExceeded", 3);
        kFlurryEventLogCountExceeded = new FlurryEventRecordStatus("kFlurryEventLogCountExceeded", 4);
        kFlurryEventLoggingDelayed = new FlurryEventRecordStatus("kFlurryEventLoggingDelayed", 5);
        kFlurryEventAnalyticsDisabled = new FlurryEventRecordStatus("kFlurryEventAnalyticsDisabled", 6);
        a = (new FlurryEventRecordStatus[] {
            kFlurryEventFailed, kFlurryEventRecorded, kFlurryEventUniqueCountExceeded, kFlurryEventParamsCountExceeded, kFlurryEventLogCountExceeded, kFlurryEventLoggingDelayed, kFlurryEventAnalyticsDisabled
        });
    }
}
