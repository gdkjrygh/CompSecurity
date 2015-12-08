// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.http.Response;
import java.util.List;
import java.util.Map;

class EventResponse
{

    private final Response response;

    public EventResponse(Response response1)
    {
        response = response1;
    }

    private int constrain(int i, int j, int k)
    {
        if (i > k)
        {
            return k;
        }
        if (i < j)
        {
            return j;
        } else
        {
            return i;
        }
    }

    public Integer getMaxBatchSize()
    {
        if (response.getResponseHeaders() != null)
        {
            List list = (List)response.getResponseHeaders().get("X-UA-Max-Batch");
            if (list != null && list.size() > 0)
            {
                return Integer.valueOf(constrain(Integer.parseInt((String)list.get(0)), 1024, 0x7d000));
            }
        }
        return Integer.valueOf(1024);
    }

    public Integer getMaxTotalSize()
    {
        if (response.getResponseHeaders() != null)
        {
            List list = (List)response.getResponseHeaders().get("X-UA-Max-Total");
            if (list != null && list.size() > 0)
            {
                return Integer.valueOf(constrain(Integer.parseInt((String)list.get(0)), 10240, 0x500000));
            }
        }
        return Integer.valueOf(10240);
    }

    public Integer getMaxWait()
    {
        if (response.getResponseHeaders() != null)
        {
            List list = (List)response.getResponseHeaders().get("X-UA-Max-Wait");
            if (list != null && list.size() > 0)
            {
                return Integer.valueOf(constrain(Integer.parseInt((String)list.get(0)), 0x240c8400, 0x48190800));
            }
        }
        return Integer.valueOf(0x240c8400);
    }

    public Integer getMinBatchInterval()
    {
        if (response.getResponseHeaders() != null)
        {
            List list = (List)response.getResponseHeaders().get("X-UA-Min-Batch-Interval");
            if (list != null && list.size() > 0)
            {
                return Integer.valueOf(constrain(Integer.parseInt((String)list.get(0)), 60000, 0x240c8400));
            }
        }
        return Integer.valueOf(60000);
    }

    public int getStatus()
    {
        return response.getStatus();
    }
}
