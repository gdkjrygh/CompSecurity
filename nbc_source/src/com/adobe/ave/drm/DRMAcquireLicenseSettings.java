// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


public final class DRMAcquireLicenseSettings extends Enum
{

    private static final DRMAcquireLicenseSettings $VALUES[];
    public static final DRMAcquireLicenseSettings ALLOW_SERVER;
    public static final DRMAcquireLicenseSettings FORCE_REFRESH;
    public static final DRMAcquireLicenseSettings LOCAL_ONLY;

    private DRMAcquireLicenseSettings(String s, int i)
    {
        super(s, i);
    }

    public static DRMAcquireLicenseSettings valueOf(String s)
    {
        return (DRMAcquireLicenseSettings)Enum.valueOf(com/adobe/ave/drm/DRMAcquireLicenseSettings, s);
    }

    public static DRMAcquireLicenseSettings[] values()
    {
        return (DRMAcquireLicenseSettings[])$VALUES.clone();
    }

    static 
    {
        FORCE_REFRESH = new DRMAcquireLicenseSettings("FORCE_REFRESH", 0);
        LOCAL_ONLY = new DRMAcquireLicenseSettings("LOCAL_ONLY", 1);
        ALLOW_SERVER = new DRMAcquireLicenseSettings("ALLOW_SERVER", 2);
        $VALUES = (new DRMAcquireLicenseSettings[] {
            FORCE_REFRESH, LOCAL_ONLY, ALLOW_SERVER
        });
    }
}
