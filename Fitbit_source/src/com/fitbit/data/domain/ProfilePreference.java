// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


public final class ProfilePreference extends Enum
{

    private static final ProfilePreference $VALUES[];
    public static final ProfilePreference MULTI_DEVICE_SUPPORT;
    private final String jsonKey;

    private ProfilePreference(String s, int i, String s1)
    {
        super(s, i);
        jsonKey = s1;
    }

    public static ProfilePreference valueOf(String s)
    {
        return (ProfilePreference)Enum.valueOf(com/fitbit/data/domain/ProfilePreference, s);
    }

    public static ProfilePreference[] values()
    {
        return (ProfilePreference[])$VALUES.clone();
    }

    public String getJsonKey()
    {
        return jsonKey;
    }

    static 
    {
        MULTI_DEVICE_SUPPORT = new ProfilePreference("MULTI_DEVICE_SUPPORT", 0, "MultiDeviceSupport");
        $VALUES = (new ProfilePreference[] {
            MULTI_DEVICE_SUPPORT
        });
    }
}
