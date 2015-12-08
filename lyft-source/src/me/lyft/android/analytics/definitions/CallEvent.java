// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            SpanningEvent, Parameter, MapParameterStore, EventName, 
//            Subevent

public class CallEvent extends SpanningEvent
{

    private static final int EVENT_VERSION = 3;
    private static final Set SUBEVENTS = new HashSet(7) {

            
            {
                add(Subevent.BASE);
                add(Subevent.CLIENT);
                add(Subevent.USER);
                add(Subevent.RIDE);
                add(Subevent.LOCATION);
                add(Subevent.NETWORK);
                add(Subevent.HTTP);
            }
    };

    public CallEvent(SpanningEvent.Type type, Call call, String s)
    {
        super(type);
        parameterStore.put(Parameter.CALL, call.toString());
        parameterStore.put(Parameter.CALL_ID, s);
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
        return EventName.CALL.toString();
    }

    public void setAuthority(String s)
    {
        parameterStore.put(Parameter.AUTHORITY, s);
    }

    public void setErrorCode(int i)
    {
        parameterStore.put(Parameter.ERROR_CODE, Integer.valueOf(i));
    }

    public void setErrorMessage(String s)
    {
        parameterStore.put(Parameter.ERROR_MESSAGE, s);
    }

    public void setErrorType(String s)
    {
        parameterStore.put(Parameter.ERROR_TYPE, s);
    }

    public void setHost(String s)
    {
        parameterStore.put(Parameter.HOST, s);
    }

    public void setMethod(String s)
    {
        parameterStore.put(Parameter.METHOD, s);
    }

    public void setPath(String s)
    {
        parameterStore.put(Parameter.PATH, s);
    }

    public void setPort(int i)
    {
        parameterStore.put(Parameter.PORT, Integer.valueOf(i));
    }

    public void setProtocol(String s)
    {
        parameterStore.put(Parameter.PROTOCOL, s);
    }

    public void setQuery(String s)
    {
        parameterStore.put(Parameter.QUERY, s);
    }

    public void setScheme(String s)
    {
        parameterStore.put(Parameter.SCHEME, s);
    }

    public void setServer(String s)
    {
        parameterStore.put(Parameter.SERVER, s);
    }

    public void setServiceMs(String s)
    {
        parameterStore.put(Parameter.SERVICE_MS, s);
    }

    public void setStatusCode(int i)
    {
        parameterStore.put(Parameter.STATUS_CODE, Integer.valueOf(i));
    }


    private class Call extends Enum
    {

        private static final Call $VALUES[];
        public static final Call GENERATE_SIGNED_URL;
        public static final Call HTTP_REQUEST;

        public static Call fromString(String s)
        {
            return valueOf(s.toUpperCase());
        }

        public static Call valueOf(String s)
        {
            return (Call)Enum.valueOf(me/lyft/android/analytics/definitions/CallEvent$Call, s);
        }

        public static Call[] values()
        {
            return (Call[])$VALUES.clone();
        }

        public String toString()
        {
            return name().toLowerCase();
        }

        static 
        {
            HTTP_REQUEST = new Call("HTTP_REQUEST", 0);
            GENERATE_SIGNED_URL = new Call("GENERATE_SIGNED_URL", 1);
            $VALUES = (new Call[] {
                HTTP_REQUEST, GENERATE_SIGNED_URL
            });
        }

        private Call(String s, int i)
        {
            super(s, i);
        }
    }

}
