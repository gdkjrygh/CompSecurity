// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


public final class DisplayResult extends Enum
{

    private static final DisplayResult $VALUES[];
    public static final DisplayResult ALERTS_OFF_CONV;
    public static final DisplayResult ALREADY_SYNCED;
    public static final DisplayResult DIFFERENT_USER;
    public static final DisplayResult ENDPOINT_ACTIVE;
    public static final DisplayResult FOREGROUND_STATE;
    public static final DisplayResult MESSAGE_LOST;
    public static final DisplayResult OS_SETTINGS;
    public static final DisplayResult SUCCESS;
    public static final DisplayResult SUPERSEDED;
    public static final DisplayResult TYPE_UNSUPPORTED;
    public static final DisplayResult UNKNOWN;
    public static final DisplayResult USER_LOGGED_OUT;
    public static final DisplayResult USER_PREFERENCES;

    private DisplayResult(String s, int i)
    {
        super(s, i);
    }

    public static DisplayResult valueOf(String s)
    {
        return (DisplayResult)Enum.valueOf(com/skype/android/push/DisplayResult, s);
    }

    public static DisplayResult[] values()
    {
        return (DisplayResult[])$VALUES.clone();
    }

    public final boolean isSuccessful()
    {
        return this == SUCCESS;
    }

    public final String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        SUCCESS = new DisplayResult("SUCCESS", 0);
        ALREADY_SYNCED = new DisplayResult("ALREADY_SYNCED", 1);
        ENDPOINT_ACTIVE = new DisplayResult("ENDPOINT_ACTIVE", 2);
        USER_PREFERENCES = new DisplayResult("USER_PREFERENCES", 3);
        OS_SETTINGS = new DisplayResult("OS_SETTINGS", 4);
        SUPERSEDED = new DisplayResult("SUPERSEDED", 5);
        ALERTS_OFF_CONV = new DisplayResult("ALERTS_OFF_CONV", 6);
        FOREGROUND_STATE = new DisplayResult("FOREGROUND_STATE", 7);
        DIFFERENT_USER = new DisplayResult("DIFFERENT_USER", 8);
        USER_LOGGED_OUT = new DisplayResult("USER_LOGGED_OUT", 9);
        TYPE_UNSUPPORTED = new DisplayResult("TYPE_UNSUPPORTED", 10);
        UNKNOWN = new DisplayResult("UNKNOWN", 11);
        MESSAGE_LOST = new DisplayResult("MESSAGE_LOST", 12);
        $VALUES = (new DisplayResult[] {
            SUCCESS, ALREADY_SYNCED, ENDPOINT_ACTIVE, USER_PREFERENCES, OS_SETTINGS, SUPERSEDED, ALERTS_OFF_CONV, FOREGROUND_STATE, DIFFERENT_USER, USER_LOGGED_OUT, 
            TYPE_UNSUPPORTED, UNKNOWN, MESSAGE_LOST
        });
    }
}
