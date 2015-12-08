// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;


public interface UAPreference
{
    public static final class PreferenceType extends Enum
    {

        private static final PreferenceType $VALUES[];
        public static final PreferenceType CHANNEL_ID;
        public static final PreferenceType LOCATION_BACKGROUND_UPDATES_ALLOWED;
        public static final PreferenceType LOCATION_UPDATES_ENABLED;
        public static final PreferenceType QUIET_TIME_ENABLE;
        public static final PreferenceType QUIET_TIME_END;
        public static final PreferenceType QUIET_TIME_START;
        public static final PreferenceType SOUND_ENABLE;
        public static final PreferenceType USER_ID;
        public static final PreferenceType USER_NOTIFICATIONS_ENABLE;
        public static final PreferenceType VIBRATE_ENABLE;

        public static PreferenceType valueOf(String s)
        {
            return (PreferenceType)Enum.valueOf(com/urbanairship/preference/UAPreference$PreferenceType, s);
        }

        public static PreferenceType[] values()
        {
            return (PreferenceType[])$VALUES.clone();
        }

        static 
        {
            USER_NOTIFICATIONS_ENABLE = new PreferenceType("USER_NOTIFICATIONS_ENABLE", 0);
            SOUND_ENABLE = new PreferenceType("SOUND_ENABLE", 1);
            VIBRATE_ENABLE = new PreferenceType("VIBRATE_ENABLE", 2);
            QUIET_TIME_ENABLE = new PreferenceType("QUIET_TIME_ENABLE", 3);
            QUIET_TIME_START = new PreferenceType("QUIET_TIME_START", 4);
            QUIET_TIME_END = new PreferenceType("QUIET_TIME_END", 5);
            LOCATION_UPDATES_ENABLED = new PreferenceType("LOCATION_UPDATES_ENABLED", 6);
            LOCATION_BACKGROUND_UPDATES_ALLOWED = new PreferenceType("LOCATION_BACKGROUND_UPDATES_ALLOWED", 7);
            CHANNEL_ID = new PreferenceType("CHANNEL_ID", 8);
            USER_ID = new PreferenceType("USER_ID", 9);
            $VALUES = (new PreferenceType[] {
                USER_NOTIFICATIONS_ENABLE, SOUND_ENABLE, VIBRATE_ENABLE, QUIET_TIME_ENABLE, QUIET_TIME_START, QUIET_TIME_END, LOCATION_UPDATES_ENABLED, LOCATION_BACKGROUND_UPDATES_ALLOWED, CHANNEL_ID, USER_ID
            });
        }

        private PreferenceType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract PreferenceType getPreferenceType();

    public abstract void setValue(Object obj);
}
