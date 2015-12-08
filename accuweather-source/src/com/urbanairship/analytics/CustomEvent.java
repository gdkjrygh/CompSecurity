// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushMessage;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.util.UAStringUtil;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, Environment, Analytics

public class CustomEvent extends Event
{
    public static class Builder
    {

        private String eventName;
        private String interactionId;
        private String interactionType;
        private String pushSendId;
        private String transactionId;
        private BigDecimal value;

        public CustomEvent addEvent()
        {
            CustomEvent customevent = create();
            UAirship.shared().getAnalytics().addEvent(customevent);
            return customevent;
        }

        public CustomEvent create()
        {
            Long long1 = null;
            CustomEvent customevent = new CustomEvent();
            customevent.eventName = eventName;
            if (value != null)
            {
                long1 = Long.valueOf(value.movePointRight(6).longValue());
            }
            customevent.eventValue = long1;
            customevent.transactionId = transactionId;
            customevent.interactionType = interactionType;
            customevent.interactionId = interactionId;
            customevent.sendId = pushSendId;
            return customevent;
        }

        public Builder setAttribution(PushMessage pushmessage)
        {
            if (pushmessage != null)
            {
                pushSendId = pushmessage.getSendId();
            }
            return this;
        }

        public Builder setEventValue(double d)
        {
            return setEventValue(BigDecimal.valueOf(d));
        }

        public Builder setEventValue(int i)
        {
            return setEventValue(new BigDecimal(i));
        }

        public Builder setEventValue(String s)
        {
            if (UAStringUtil.isEmpty(s))
            {
                value = null;
                return this;
            } else
            {
                return setEventValue(new BigDecimal(s));
            }
        }

        public Builder setEventValue(BigDecimal bigdecimal)
        {
            if (bigdecimal == null)
            {
                value = null;
                return this;
            }
            if (bigdecimal.compareTo(CustomEvent.MAX_VALUE) > 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The value is bigger than ").append(CustomEvent.MAX_VALUE).toString());
            }
            if (bigdecimal.compareTo(CustomEvent.MIN_VALUE) < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The value is less than ").append(CustomEvent.MIN_VALUE).toString());
            } else
            {
                value = bigdecimal;
                return this;
            }
        }

        public Builder setInteraction(RichPushMessage richpushmessage)
        {
            if (richpushmessage != null)
            {
                interactionType = "ua_mcrap";
                interactionId = richpushmessage.getMessageId();
            }
            return this;
        }

        public Builder setInteraction(String s, String s1)
        {
            if (s1 != null && s1.length() > 255)
            {
                throw new IllegalArgumentException("Interaction ID is larger than 255 characters.");
            }
            if (s != null && s.length() > 255)
            {
                throw new IllegalArgumentException("Interaction type is larger than 255 characters.");
            } else
            {
                interactionId = s1;
                interactionType = s;
                return this;
            }
        }

        public Builder setTransactionId(String s)
        {
            if (s != null && s.length() > 255)
            {
                throw new IllegalArgumentException("Transaction ID is larger than 255 characters.");
            } else
            {
                transactionId = s;
                return this;
            }
        }

        public Builder(String s)
        {
            if (UAStringUtil.isEmpty(s))
            {
                throw new IllegalArgumentException("Event name must not be null or empty.");
            }
            if (s.length() > 255)
            {
                throw new IllegalArgumentException("Event name is larger than 255 characters.");
            } else
            {
                eventName = s;
                return;
            }
        }
    }


    public static final String CONVERSION_SEND_ID = "conversion_send_id";
    public static final String EVENT_NAME = "event_name";
    public static final String EVENT_VALUE = "event_value";
    public static final String INTERACTION_ID = "interaction_id";
    public static final String INTERACTION_TYPE = "interaction_type";
    public static final String LAST_RECEIVED_SEND_ID = "last_received_send_id";
    private static final int MAX_CHARACTER_LENGTH = 255;
    private static final BigDecimal MAX_VALUE = new BigDecimal(0x7fffffff);
    public static final String MCRAP_TRANSACTION_TYPE = "ua_mcrap";
    private static final BigDecimal MIN_VALUE = new BigDecimal(0x80000000);
    public static final String TRANSACTION_ID = "transaction_id";
    private static final String TYPE = "custom_event";
    private String eventName;
    private Long eventValue;
    private String interactionId;
    private String interactionType;
    private String sendId;
    private String transactionId;

    private CustomEvent()
    {
    }


    JSONObject getData()
    {
        JSONObject jsonobject;
        Environment environment;
        jsonobject = new JSONObject();
        environment = getEnvironment();
        jsonobject.putOpt("event_name", eventName);
        jsonobject.putOpt("event_value", eventValue);
        jsonobject.putOpt("interaction_id", interactionId);
        jsonobject.putOpt("interaction_type", interactionType);
        jsonobject.putOpt("transaction_id", transactionId);
        jsonobject.putOpt("session_id", environment.getSessionId());
        if (UAStringUtil.isEmpty(sendId))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        jsonobject.putOpt("conversion_send_id", sendId);
        return jsonobject;
        if (environment.getConversionSendId() == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        jsonobject.putOpt("conversion_send_id", environment.getConversionSendId());
        JSONException jsonexception;
        return jsonobject;
        try
        {
            jsonobject.putOpt("last_received_send_id", UAirship.shared().getPushManager().getLastReceivedSendId());
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    String getType()
    {
        return "custom_event";
    }





/*
    static String access$302(CustomEvent customevent, String s)
    {
        customevent.eventName = s;
        return s;
    }

*/


/*
    static Long access$402(CustomEvent customevent, Long long1)
    {
        customevent.eventValue = long1;
        return long1;
    }

*/


/*
    static String access$502(CustomEvent customevent, String s)
    {
        customevent.transactionId = s;
        return s;
    }

*/


/*
    static String access$602(CustomEvent customevent, String s)
    {
        customevent.interactionType = s;
        return s;
    }

*/


/*
    static String access$702(CustomEvent customevent, String s)
    {
        customevent.interactionId = s;
        return s;
    }

*/


/*
    static String access$802(CustomEvent customevent, String s)
    {
        customevent.sendId = s;
        return s;
    }

*/
}
