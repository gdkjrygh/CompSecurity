// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import com.urbanairship.http.Response;
import com.urbanairship.util.UAStringUtil;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class ChannelResponse
{

    private final Response response;

    public ChannelResponse(Response response1)
    {
        response = response1;
    }

    String getChannelId()
    {
        if (response == null || UAStringUtil.isEmpty(response.getResponseBody()))
        {
            return null;
        }
        String s;
        try
        {
            s = (new JSONObject(response.getResponseBody())).getString("channel_id");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    String getChannelLocation()
    {
        if (response.getResponseHeaders() != null)
        {
            List list = (List)response.getResponseHeaders().get("Location");
            if (list != null && list.size() > 0)
            {
                return (String)list.get(0);
            }
        }
        return null;
    }

    public int getStatus()
    {
        return response.getStatus();
    }
}
