// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            SpanningEvent, Parameter, MapParameterStore, EventName, 
//            Subevent

public class IntentEvent extends SpanningEvent
{

    private static final int EVENT_VERSION = 3;
    private static final Set SUBEVENTS = new HashSet(5) {

            
            {
                add(Subevent.BASE);
                add(Subevent.CLIENT);
                add(Subevent.USER);
                add(Subevent.RIDE);
                add(Subevent.LOCATION);
            }
    };

    public IntentEvent(SpanningEvent.Type type, Intent intent, String s)
    {
        super(type);
        parameterStore.put(Parameter.INTENT, intent.toString());
        parameterStore.put(Parameter.INTENT_ID, s);
    }

    public boolean contains(Subevent subevent)
    {
        return SUBEVENTS.contains(subevent);
    }

    public int getEventVersion()
    {
        return 3;
    }

    public String getName()
    {
        return EventName.INTENT.toString();
    }

    public IntentEvent setReason(String s)
    {
        parameterStore.put(Parameter.REASON, s);
        return this;
    }


    private class Intent extends Enum
    {

        private static final Intent $VALUES[];
        public static final Intent ONBOARD;
        public static final Intent SEARCH_PLACES;
        public static final Intent SHARE_INVITES;

        public static Intent fromString(String s)
        {
            return valueOf(s.toUpperCase());
        }

        public static Intent valueOf(String s)
        {
            return (Intent)Enum.valueOf(me/lyft/android/analytics/definitions/IntentEvent$Intent, s);
        }

        public static Intent[] values()
        {
            return (Intent[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            ONBOARD = new Intent("ONBOARD", 0);
            SEARCH_PLACES = new Intent("SEARCH_PLACES", 1);
            SHARE_INVITES = new Intent("SHARE_INVITES", 2);
            $VALUES = (new Intent[] {
                ONBOARD, SEARCH_PLACES, SHARE_INVITES
            });
        }

        private Intent(String s, int i)
        {
            super(s, i);
        }
    }

}
