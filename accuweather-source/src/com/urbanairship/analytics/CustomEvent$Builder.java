// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.UAirship;
import com.urbanairship.push.PushMessage;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.util.UAStringUtil;
import java.math.BigDecimal;

// Referenced classes of package com.urbanairship.analytics:
//            CustomEvent, Analytics

public static class eventName
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
        CustomEvent customevent = new CustomEvent(null);
        CustomEvent.access$302(customevent, eventName);
        if (value != null)
        {
            long1 = Long.valueOf(value.movePointRight(6).longValue());
        }
        CustomEvent.access$402(customevent, long1);
        CustomEvent.access$502(customevent, transactionId);
        CustomEvent.access$602(customevent, interactionType);
        CustomEvent.access$702(customevent, interactionId);
        CustomEvent.access$802(customevent, pushSendId);
        return customevent;
    }

    public pushSendId setAttribution(PushMessage pushmessage)
    {
        if (pushmessage != null)
        {
            pushSendId = pushmessage.getSendId();
        }
        return this;
    }

    public pushSendId setEventValue(double d)
    {
        return setEventValue(BigDecimal.valueOf(d));
    }

    public setEventValue setEventValue(int i)
    {
        return setEventValue(new BigDecimal(i));
    }

    public setEventValue setEventValue(String s)
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

    public setEventValue setEventValue(BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            value = null;
            return this;
        }
        if (bigdecimal.compareTo(CustomEvent.access$000()) > 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The value is bigger than ").append(CustomEvent.access$000()).toString());
        }
        if (bigdecimal.compareTo(CustomEvent.access$100()) < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The value is less than ").append(CustomEvent.access$100()).toString());
        } else
        {
            value = bigdecimal;
            return this;
        }
    }

    public value setInteraction(RichPushMessage richpushmessage)
    {
        if (richpushmessage != null)
        {
            interactionType = "ua_mcrap";
            interactionId = richpushmessage.getMessageId();
        }
        return this;
    }

    public ssageId setInteraction(String s, String s1)
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

    public interactionType setTransactionId(String s)
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

    public (String s)
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
