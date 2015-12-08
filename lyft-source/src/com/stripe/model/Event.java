// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            EventCollection, EventData

public class Event extends APIResource
{

    Long created;
    EventData data;
    String id;
    Boolean livemode;
    Integer pendingWebhooks;
    String request;
    String type;
    String userId;

    public Event()
    {
    }

    public static EventCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static EventCollection all(Map map, RequestOptions requestoptions)
    {
        return (EventCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Event), map, com/stripe/model/EventCollection, requestoptions);
    }

    public static EventCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Event retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Event retrieve(String s, RequestOptions requestoptions)
    {
        return (Event)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Event, s), null, com/stripe/model/Event, requestoptions);
    }

    public static Event retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Long getCreated()
    {
        return created;
    }

    public EventData getData()
    {
        return data;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Integer getPendingWebhooks()
    {
        return pendingWebhooks;
    }

    public String getRequest()
    {
        return request;
    }

    public String getType()
    {
        return type;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setData(EventData eventdata)
    {
        data = eventdata;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setPendingWebhooks(Integer integer)
    {
        pendingWebhooks = integer;
    }

    public void setRequest(String s)
    {
        request = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUserId(String s)
    {
        userId = s;
    }
}
