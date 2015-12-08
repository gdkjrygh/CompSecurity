// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.content.Intent;

// Referenced classes of package com.fsr.tracker.app:
//            EventPublisher

public static class data
{
    public static final class EventType extends Enum
    {

        private static final EventType $VALUES[];
        public static final EventType DEBUG;
        public static final EventType INVITE_ACCEPTED;
        public static final EventType INVITE_DECLINED;
        public static final EventType INVITE_PRESENTED;
        public static final EventType SESSION_ENDED;
        public static final EventType SESSION_STARTED;
        public static final EventType STATE_UPDATED;
        public static final EventType UNDEFINED;
        private String value;

        public static EventType fromValue(String s)
        {
            EventType aeventtype[] = values();
            int j = aeventtype.length;
            for (int i = 0; i < j; i++)
            {
                EventType eventtype = aeventtype[i];
                if (eventtype.value.equals(s))
                {
                    return eventtype;
                }
            }

            return UNDEFINED;
        }

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/fsr/tracker/app/EventPublisher$LifeCycleEvent$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])$VALUES.clone();
        }

        public boolean equals(String s)
        {
            return value.equals(s);
        }

        public String value()
        {
            return value;
        }

        static 
        {
            SESSION_STARTED = new EventType("SESSION_STARTED", 0, "SESSION_STARTED");
            SESSION_ENDED = new EventType("SESSION_ENDED", 1, "SESSION_ENDED");
            INVITE_PRESENTED = new EventType("INVITE_PRESENTED", 2, "INVITE_PRESENTED");
            INVITE_ACCEPTED = new EventType("INVITE_ACCEPTED", 3, "INVITE_ACCEPTED");
            INVITE_DECLINED = new EventType("INVITE_DECLINED", 4, "INVITE_DECLINED");
            STATE_UPDATED = new EventType("STATE_UPDATED", 5, "STATE_UPDATED");
            DEBUG = new EventType("DEBUG", 6, "DEBUG");
            UNDEFINED = new EventType("UNDEFINED", 7, "UNDEFINED");
            $VALUES = (new EventType[] {
                SESSION_STARTED, SESSION_ENDED, INVITE_PRESENTED, INVITE_ACCEPTED, INVITE_DECLINED, STATE_UPDATED, DEBUG, UNDEFINED
            });
        }


        private EventType(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    public static final String ACTION = "com.foresee.sdk.lifecycleEvent";
    public static final String EXTRA_EVENT_DATA = "EVENT_DATA";
    public static final String EXTRA_EVENT_TYPE = "EVENT_TYPE";
    private String data;
    private EventType eventType;

    public String getData()
    {
        return data;
    }

    public EventType getEventType()
    {
        return eventType;
    }

    public void setData(String s)
    {
        data = s;
    }

    public Intent toIntent()
    {
        Intent intent = new Intent("com.foresee.sdk.lifecycleEvent");
        intent.putExtra("EVENT_TYPE", eventType.value);
        if (data != null && !data.equals(""))
        {
            intent.putExtra("EVENT_DATA", data);
        }
        return intent;
    }

    public EventType(EventType eventtype)
    {
        eventType = eventtype;
    }

    public EventType(EventType eventtype, String s)
    {
        eventType = eventtype;
        data = s;
    }
}
