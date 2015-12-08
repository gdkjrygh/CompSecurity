// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.JsonUtils;

public class GUI
{
    public static final class ActivateWindow extends ApiMethod
    {

        public String getMethodName()
        {
            return "GUI.ActivateWindow";
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

        public ActivateWindow(String s)
        {
            addParameterToRequest("window", s);
        }

        public transient ActivateWindow(String s, String as[])
        {
            addParameterToRequest("window", s);
            addParameterToRequest("parameters", as);
        }
    }

    public static final class SetFullscreen extends ApiMethod
    {

        public String getMethodName()
        {
            return "GUI.SetFullscreen";
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

        public SetFullscreen()
        {
            addParameterToRequest("fullscreen", "toggle");
        }
    }

}
