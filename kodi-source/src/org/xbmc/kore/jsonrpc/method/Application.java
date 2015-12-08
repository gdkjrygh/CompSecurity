// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.JsonUtils;

public class Application
{
    public static class GetProperties extends ApiMethod
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

        public org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue(objectnode.get("result"));
        }

        public transient GetProperties(String as[])
        {
            addParameterToRequest("properties", as);
        }
    }

    public static final class Quit extends ApiMethod
    {

        public String getMethodName()
        {
            return "Application.Quit";
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

        public Quit()
        {
        }
    }

    public static final class SetMute extends ApiMethod
    {

        public String getMethodName()
        {
            return "Application.SetMute";
        }

        public Boolean resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return Boolean.valueOf(JsonUtils.booleanFromJsonNode(objectnode, "result"));
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public SetMute()
        {
            addParameterToRequest("mute", "toggle");
        }
    }

    public static final class SetVolume extends ApiMethod
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

        public SetVolume(String s)
        {
            addParameterToRequest("volume", s);
        }
    }

}
