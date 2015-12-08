// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class ReportCause extends Enum
{

    private static final ReportCause $VALUES[];
    public static final ReportCause ABUSIVE_CONTENT;
    public static final ReportCause INAPPROPRIATE_PHOTOS;
    public static final ReportCause OFFLINE_BEHAVIOR;
    public static final ReportCause OTHER;
    public static final ReportCause SPAM;
    public static final ReportCause UNCOMFORTABLE;
    private final String mAnalyticsValue;

    private ReportCause(String s, int i, String s1)
    {
        super(s, i);
        mAnalyticsValue = s1;
    }

    public static ReportCause valueOf(String s)
    {
        return (ReportCause)Enum.valueOf(com/tinder/enums/ReportCause, s);
    }

    public static ReportCause[] values()
    {
        return (ReportCause[])$VALUES.clone();
    }

    public final String getAnalyticsValue()
    {
        return mAnalyticsValue;
    }

    static 
    {
        OTHER = new ReportCause("OTHER", 0, "OTHER");
        SPAM = new ReportCause("SPAM", 1, "SPAM");
        ABUSIVE_CONTENT = new ReportCause("ABUSIVE_CONTENT", 2, "OFFENSIVE");
        UNCOMFORTABLE = new ReportCause("UNCOMFORTABLE", 3, "UNCOMFORTABLE");
        INAPPROPRIATE_PHOTOS = new ReportCause("INAPPROPRIATE_PHOTOS", 4, "INAPPROPRIATE_PHOTOS");
        OFFLINE_BEHAVIOR = new ReportCause("OFFLINE_BEHAVIOR", 5, "OFFLINE_BEHAVIOR");
        $VALUES = (new ReportCause[] {
            OTHER, SPAM, ABUSIVE_CONTENT, UNCOMFORTABLE, INAPPROPRIATE_PHOTOS, OFFLINE_BEHAVIOR
        });
    }
}
