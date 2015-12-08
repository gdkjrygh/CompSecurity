// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Application;
import android.content.Intent;

public class EventPublisher
{
    public static class LifeCycleEvent
    {

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

        public LifeCycleEvent(EventType eventtype)
        {
            eventType = eventtype;
        }

        public LifeCycleEvent(EventType eventtype, String s)
        {
            eventType = eventtype;
            data = s;
        }
    }

    public static final class LifeCycleEvent.EventType extends Enum
    {

        private static final LifeCycleEvent.EventType $VALUES[];
        public static final LifeCycleEvent.EventType DEBUG;
        public static final LifeCycleEvent.EventType INVITE_ACCEPTED;
        public static final LifeCycleEvent.EventType INVITE_DECLINED;
        public static final LifeCycleEvent.EventType INVITE_PRESENTED;
        public static final LifeCycleEvent.EventType SESSION_ENDED;
        public static final LifeCycleEvent.EventType SESSION_STARTED;
        public static final LifeCycleEvent.EventType STATE_UPDATED;
        public static final LifeCycleEvent.EventType UNDEFINED;
        private String value;

        public static LifeCycleEvent.EventType fromValue(String s)
        {
            LifeCycleEvent.EventType aeventtype[] = values();
            int j = aeventtype.length;
            for (int i = 0; i < j; i++)
            {
                LifeCycleEvent.EventType eventtype = aeventtype[i];
                if (eventtype.value.equals(s))
                {
                    return eventtype;
                }
            }

            return UNDEFINED;
        }

        public static LifeCycleEvent.EventType valueOf(String s)
        {
            return (LifeCycleEvent.EventType)Enum.valueOf(com/fsr/tracker/app/EventPublisher$LifeCycleEvent$EventType, s);
        }

        public static LifeCycleEvent.EventType[] values()
        {
            return (LifeCycleEvent.EventType[])$VALUES.clone();
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
            SESSION_STARTED = new LifeCycleEvent.EventType("SESSION_STARTED", 0, "SESSION_STARTED");
            SESSION_ENDED = new LifeCycleEvent.EventType("SESSION_ENDED", 1, "SESSION_ENDED");
            INVITE_PRESENTED = new LifeCycleEvent.EventType("INVITE_PRESENTED", 2, "INVITE_PRESENTED");
            INVITE_ACCEPTED = new LifeCycleEvent.EventType("INVITE_ACCEPTED", 3, "INVITE_ACCEPTED");
            INVITE_DECLINED = new LifeCycleEvent.EventType("INVITE_DECLINED", 4, "INVITE_DECLINED");
            STATE_UPDATED = new LifeCycleEvent.EventType("STATE_UPDATED", 5, "STATE_UPDATED");
            DEBUG = new LifeCycleEvent.EventType("DEBUG", 6, "DEBUG");
            UNDEFINED = new LifeCycleEvent.EventType("UNDEFINED", 7, "UNDEFINED");
            $VALUES = (new LifeCycleEvent.EventType[] {
                SESSION_STARTED, SESSION_ENDED, INVITE_PRESENTED, INVITE_ACCEPTED, INVITE_DECLINED, STATE_UPDATED, DEBUG, UNDEFINED
            });
        }


        private LifeCycleEvent.EventType(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    private Application application;

    public EventPublisher(Application application1)
    {
        application = application1;
    }

    public void publishEvent(LifeCycleEvent lifecycleevent)
    {
        application.sendBroadcast(lifecycleevent.toIntent());
    }
}
