// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            NccpError

public class NccpNetworkingError extends NccpError
{

    private String endpoint;
    private String stack;

    NccpNetworkingError(String s, String s1, String s2, String s3, String s4)
    {
        endpoint = s;
        stack = s1;
        origin = s2;
        result = s3;
        transaction = s4;
    }

    public NccpNetworkingError(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public String getStack()
    {
        return stack;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        endpoint = getString(jsonobject, "endpoint", null);
        stack = getString(jsonobject, "stack", null);
        origin = getString(jsonobject, "origin", null);
        result = getString(jsonobject, "result", null);
        transaction = getString(jsonobject, "transaction", null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("NccpNetworkingError [endpoint=").append(endpoint).append(", stack=").append(stack).append(", origin=").append(origin).append(", result=").append(result).append(", transaction=").append(transaction).append("]").toString();
    }
}
