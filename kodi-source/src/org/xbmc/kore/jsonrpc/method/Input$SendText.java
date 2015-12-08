// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

// Referenced classes of package org.xbmc.kore.jsonrpc.method:
//            Input

public static final class addParameterToRequest extends ApiMethod
{

    public String getMethodName()
    {
        return "Input.SendText";
    }

    public volatile Object resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return resultFromJson(objectnode);
    }

    public String resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return objectnode.get("result").textValue();
    }

    public de(String s, boolean flag)
    {
        addParameterToRequest("text", s);
        addParameterToRequest("done", flag);
    }
}
