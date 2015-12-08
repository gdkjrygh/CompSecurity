// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;
import java.util.Set;
import me.lyft.android.common.DateUtils;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            Event2, Parameter, MapParameterStore, EventName, 
//            Subevent

public class LifecycleEvent extends Event2
{

    private static final int EVENT_VERSION = 3;
    private static final Set SUBEVENTS = new HashSet(7) {

            
            {
                add(Subevent.BASE);
                add(Subevent.CLIENT);
                add(Subevent.DEVICE);
                add(Subevent.VENDOR);
                add(Subevent.USER);
                add(Subevent.RIDE);
                add(Subevent.LOCATION);
                add(Subevent.NETWORK);
            }
    };

    public LifecycleEvent(Type type)
    {
        parameterStore.put(Parameter.TYPE, type.toString());
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
        return EventName.LIFECYCLE.toString();
    }

    public Type getType()
    {
        return Type.valueOf(parameterStore.getString(Parameter.TYPE).toUpperCase());
    }

    public LifecycleEvent setOccurredAt(long l)
    {
        String s = DateUtils.convertEpochToISO(l);
        parameterStore.put(Parameter.OCCURRED_AT, s);
        return this;
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type APP_CLOSE;
        public static final Type APP_CRASH;
        public static final Type APP_INSTALL;
        public static final Type APP_OPEN;
        public static final Type APP_UPDATE;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(me/lyft/android/analytics/definitions/LifecycleEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            APP_OPEN = new Type("APP_OPEN", 0);
            APP_CLOSE = new Type("APP_CLOSE", 1);
            APP_INSTALL = new Type("APP_INSTALL", 2);
            APP_UPDATE = new Type("APP_UPDATE", 3);
            APP_CRASH = new Type("APP_CRASH", 4);
            $VALUES = (new Type[] {
                APP_OPEN, APP_CLOSE, APP_INSTALL, APP_UPDATE, APP_CRASH
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
