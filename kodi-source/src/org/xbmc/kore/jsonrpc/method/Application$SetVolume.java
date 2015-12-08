// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.method:
//            Application

public static final class addParameterToRequest extends ApiMethod
{

    public String getMethodName()
    {
        return "Application.SetVolume";
    }

    public Integer resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return Integer.valueOf(JsonUtils.intFromJsonNode(objectnode, "result"));
    }

    public volatile Object resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return resultFromJson(objectnode);
    }

    public (String s)
    {
        addParameterToRequest("volume", s);
    }
}
