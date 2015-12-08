// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            RequestStreamingAdResponse, RequestAdResponse

public static class  extends 
{

    private RequestStreamingAdResponse c(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = null;
        if (jsonobject != null)
        {
            obj = ci.a(jsonobject, "shouldStream");
            if (Boolean.TRUE.equals(obj))
            {
                jsonobject = (RequestStreamingAdResponse)super.(jsonobject);
            } else
            {
                jsonobject = new RequestStreamingAdResponse();
            }
            jsonobject.r = ((Boolean) (obj));
            obj = jsonobject;
        }
        return ((RequestStreamingAdResponse) (obj));
    }

    protected final Object a()
    {
        return new RequestStreamingAdResponse();
    }

    public final Object a(JSONObject jsonobject)
        throws JSONException
    {
        return c(jsonobject);
    }

    protected final volatile Object[] a(int i)
    {
        return new RequestStreamingAdResponse[i];
    }

    public final RequestAdResponse b(JSONObject jsonobject)
        throws JSONException
    {
        return c(jsonobject);
    }

    protected ()
    {
    }
}
