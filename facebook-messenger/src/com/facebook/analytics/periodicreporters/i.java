// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;


final class i extends Enum
{

    private static final i $VALUES[];
    public static final i SERVICE_DISABLED;
    public static final i SERVICE_ENABLED;
    public static final i SERVICE_INVALID;
    public static final i SERVICE_MISSING;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/analytics/periodicreporters/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        SERVICE_ENABLED = new i("SERVICE_ENABLED", 0);
        SERVICE_DISABLED = new i("SERVICE_DISABLED", 1);
        SERVICE_INVALID = new i("SERVICE_INVALID", 2);
        SERVICE_MISSING = new i("SERVICE_MISSING", 3);
        $VALUES = (new i[] {
            SERVICE_ENABLED, SERVICE_DISABLED, SERVICE_INVALID, SERVICE_MISSING
        });
    }
}
