// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public interface AdvertiserIdLogging
{
    public static final class AdverisingATrackingPreference extends Enum
    {

        private static final AdverisingATrackingPreference $VALUES[];
        public static final AdverisingATrackingPreference OPT_IN;
        public static final AdverisingATrackingPreference OPT_OUT;

        public static AdverisingATrackingPreference valueOf(String s)
        {
            return (AdverisingATrackingPreference)Enum.valueOf(com/netflix/mediaclient/servicemgr/AdvertiserIdLogging$AdverisingATrackingPreference, s);
        }

        public static AdverisingATrackingPreference[] values()
        {
            return (AdverisingATrackingPreference[])$VALUES.clone();
        }

        static 
        {
            OPT_IN = new AdverisingATrackingPreference("OPT_IN", 0);
            OPT_OUT = new AdverisingATrackingPreference("OPT_OUT", 1);
            $VALUES = (new AdverisingATrackingPreference[] {
                OPT_IN, OPT_OUT
            });
        }

        private AdverisingATrackingPreference(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class EventType extends Enum
    {

        private static final EventType $VALUES[];
        public static final EventType check_in;
        public static final EventType install;
        public static final EventType sign_in;
        public static final EventType sign_up;

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/netflix/mediaclient/servicemgr/AdvertiserIdLogging$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])$VALUES.clone();
        }

        static 
        {
            install = new EventType("install", 0);
            sign_up = new EventType("sign_up", 1);
            sign_in = new EventType("sign_in", 2);
            check_in = new EventType("check_in", 3);
            $VALUES = (new EventType[] {
                install, sign_up, sign_in, check_in
            });
        }

        private EventType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ONSIGNUP = "com.netflix.mediaclient.intent.action.ONSIGNUP";

    public abstract AdverisingATrackingPreference getAdverisingTrackingPreference();

    public abstract String getAdvertiserId();

    public abstract boolean isSupported();

    public abstract void sendAdvertiserId(EventType eventtype);
}
