// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;


public final class SlightlySecurePreferencesKeyType extends Enum
{

    private static final SlightlySecurePreferencesKeyType $VALUES[];
    public static final SlightlySecurePreferencesKeyType SHOULD_ALWAYS_PERSIST;
    public static final SlightlySecurePreferencesKeyType SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN;
    public static final SlightlySecurePreferencesKeyType SHOULD_PURGE_ON_LOGOUT;

    private SlightlySecurePreferencesKeyType(String s, int i)
    {
        super(s, i);
    }

    public static SlightlySecurePreferencesKeyType valueOf(String s)
    {
        return (SlightlySecurePreferencesKeyType)Enum.valueOf(com/snapchat/android/util/crypto/SlightlySecurePreferencesKeyType, s);
    }

    public static SlightlySecurePreferencesKeyType[] values()
    {
        return (SlightlySecurePreferencesKeyType[])$VALUES.clone();
    }

    static 
    {
        SHOULD_PURGE_ON_LOGOUT = new SlightlySecurePreferencesKeyType("SHOULD_PURGE_ON_LOGOUT", 0);
        SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN = new SlightlySecurePreferencesKeyType("SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN", 1);
        SHOULD_ALWAYS_PERSIST = new SlightlySecurePreferencesKeyType("SHOULD_ALWAYS_PERSIST", 2);
        $VALUES = (new SlightlySecurePreferencesKeyType[] {
            SHOULD_PURGE_ON_LOGOUT, SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN, SHOULD_ALWAYS_PERSIST
        });
    }
}
