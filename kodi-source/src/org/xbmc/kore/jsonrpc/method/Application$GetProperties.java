// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

// Referenced classes of package org.xbmc.kore.jsonrpc.method:
//            Application

public static class addParameterToRequest extends ApiMethod
{

    public String getMethodName()
    {
        return "Application.GetProperties";
    }

    public volatile Object resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return resultFromJson(objectnode);
    }

    public org.xbmc.kore.jsonrpc.type.lue resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return new org.xbmc.kore.jsonrpc.type.lue(objectnode.get("result"));
    }

    public transient e(String as[])
    {
        addParameterToRequest("properties", as);
    }
}
