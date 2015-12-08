// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


public final class RegistrationReason extends Enum
{

    private static final RegistrationReason $VALUES[];
    public static final RegistrationReason APPLICATION_UPDATE;
    public static final RegistrationReason FIRMWARE_UPDATE;
    public static final RegistrationReason MISSING_TOKEN;
    public static final RegistrationReason NO_TOKEN;
    public static final RegistrationReason TTL_EXPIRED;

    private RegistrationReason(String s, int i)
    {
        super(s, i);
    }

    public static RegistrationReason valueOf(String s)
    {
        return (RegistrationReason)Enum.valueOf(com/skype/android/push/RegistrationReason, s);
    }

    public static RegistrationReason[] values()
    {
        return (RegistrationReason[])$VALUES.clone();
    }

    static 
    {
        NO_TOKEN = new RegistrationReason("NO_TOKEN", 0);
        FIRMWARE_UPDATE = new RegistrationReason("FIRMWARE_UPDATE", 1);
        APPLICATION_UPDATE = new RegistrationReason("APPLICATION_UPDATE", 2);
        MISSING_TOKEN = new RegistrationReason("MISSING_TOKEN", 3);
        TTL_EXPIRED = new RegistrationReason("TTL_EXPIRED", 4);
        $VALUES = (new RegistrationReason[] {
            NO_TOKEN, FIRMWARE_UPDATE, APPLICATION_UPDATE, MISSING_TOKEN, TTL_EXPIRED
        });
    }
}
