// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class EventName extends Enum
{

    private static final EventName $VALUES[];
    public static final EventName ACTION;
    public static final EventName ACTION_ATTEMPT;
    public static final EventName ACTION_RESPONSE;
    public static final EventName ALLOW_PUSH;
    public static final EventName APP_CLOSE;
    public static final EventName APP_OPEN;
    public static final EventName APP_VERSION_UPDATE;
    public static final EventName CALL;
    public static final EventName COMPETITIVE_APP_INSTALLED;
    public static final EventName DISMISS;
    public static final EventName DRIVER_SIGNOUT_CONFIRMATION_DISMISSED;
    public static final EventName EXPERIMENT_VARIANT_ASSIGNED;
    public static final EventName INSTALL;
    public static final EventName INTENT;
    public static final EventName LAUNCHED_FROM_DEEP_LINK;
    public static final EventName LIFECYCLE;
    public static final EventName NETWORK_REQUEST;
    public static final EventName NETWORK_RESPONSE;
    public static final EventName PAGE_VIEW;
    public static final EventName PROMO_BANNER_SHOWN;
    public static final EventName PUSH_RECEIVED;
    public static final EventName RIDE_STATE_CHANGE_ATTEMPT;
    public static final EventName RIDE_TYPE_SWITCH;
    public static final EventName SHOWN;
    public static final EventName TAP;
    private final String value = name().toLowerCase();

    private EventName(String s, int i)
    {
        super(s, i);
    }

    public static EventName valueOf(String s)
    {
        return (EventName)Enum.valueOf(me/lyft/android/analytics/definitions/EventName, s);
    }

    public static EventName[] values()
    {
        return (EventName[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        CALL = new EventName("CALL", 0);
        ACTION = new EventName("ACTION", 1);
        INTENT = new EventName("INTENT", 2);
        LIFECYCLE = new EventName("LIFECYCLE", 3);
        APP_OPEN = new EventName("APP_OPEN", 4);
        APP_CLOSE = new EventName("APP_CLOSE", 5);
        APP_VERSION_UPDATE = new EventName("APP_VERSION_UPDATE", 6);
        INSTALL = new EventName("INSTALL", 7);
        PAGE_VIEW = new EventName("PAGE_VIEW", 8);
        TAP = new EventName("TAP", 9);
        SHOWN = new EventName("SHOWN", 10);
        DISMISS = new EventName("DISMISS", 11);
        ACTION_ATTEMPT = new EventName("ACTION_ATTEMPT", 12);
        ACTION_RESPONSE = new EventName("ACTION_RESPONSE", 13);
        NETWORK_REQUEST = new EventName("NETWORK_REQUEST", 14);
        NETWORK_RESPONSE = new EventName("NETWORK_RESPONSE", 15);
        DRIVER_SIGNOUT_CONFIRMATION_DISMISSED = new EventName("DRIVER_SIGNOUT_CONFIRMATION_DISMISSED", 16);
        PROMO_BANNER_SHOWN = new EventName("PROMO_BANNER_SHOWN", 17);
        RIDE_TYPE_SWITCH = new EventName("RIDE_TYPE_SWITCH", 18);
        RIDE_STATE_CHANGE_ATTEMPT = new EventName("RIDE_STATE_CHANGE_ATTEMPT", 19);
        PUSH_RECEIVED = new EventName("PUSH_RECEIVED", 20);
        COMPETITIVE_APP_INSTALLED = new EventName("COMPETITIVE_APP_INSTALLED", 21);
        EXPERIMENT_VARIANT_ASSIGNED = new EventName("EXPERIMENT_VARIANT_ASSIGNED", 22);
        ALLOW_PUSH = new EventName("ALLOW_PUSH", 23);
        LAUNCHED_FROM_DEEP_LINK = new EventName("LAUNCHED_FROM_DEEP_LINK", 24);
        $VALUES = (new EventName[] {
            CALL, ACTION, INTENT, LIFECYCLE, APP_OPEN, APP_CLOSE, APP_VERSION_UPDATE, INSTALL, PAGE_VIEW, TAP, 
            SHOWN, DISMISS, ACTION_ATTEMPT, ACTION_RESPONSE, NETWORK_REQUEST, NETWORK_RESPONSE, DRIVER_SIGNOUT_CONFIRMATION_DISMISSED, PROMO_BANNER_SHOWN, RIDE_TYPE_SWITCH, RIDE_STATE_CHANGE_ATTEMPT, 
            PUSH_RECEIVED, COMPETITIVE_APP_INSTALLED, EXPERIMENT_VARIANT_ASSIGNED, ALLOW_PUSH, LAUNCHED_FROM_DEEP_LINK
        });
    }
}
