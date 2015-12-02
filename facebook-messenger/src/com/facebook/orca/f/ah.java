// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;


final class ah extends Enum
{

    private static final ah $VALUES[];
    public static final ah DATA_KNOWN_TO_BE_STALE;
    public static final ah DEFAULT;
    public static final ah MQTT_CONNECTED;
    public static final ah MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED;
    public static final ah MQTT_RECENTLY_DISCONNECTED;
    public static final ah OLD_DATA;
    public static final ah SPECIFIC_INTENTION;

    private ah(String s, int i)
    {
        super(s, i);
    }

    public static ah valueOf(String s)
    {
        return (ah)Enum.valueOf(com/facebook/orca/f/ah, s);
    }

    public static ah[] values()
    {
        return (ah[])$VALUES.clone();
    }

    static 
    {
        SPECIFIC_INTENTION = new ah("SPECIFIC_INTENTION", 0);
        MQTT_RECENTLY_DISCONNECTED = new ah("MQTT_RECENTLY_DISCONNECTED", 1);
        MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED = new ah("MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED", 2);
        MQTT_CONNECTED = new ah("MQTT_CONNECTED", 3);
        OLD_DATA = new ah("OLD_DATA", 4);
        DATA_KNOWN_TO_BE_STALE = new ah("DATA_KNOWN_TO_BE_STALE", 5);
        DEFAULT = new ah("DEFAULT", 6);
        $VALUES = (new ah[] {
            SPECIFIC_INTENTION, MQTT_RECENTLY_DISCONNECTED, MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED, MQTT_CONNECTED, OLD_DATA, DATA_KNOWN_TO_BE_STALE, DEFAULT
        });
    }
}
