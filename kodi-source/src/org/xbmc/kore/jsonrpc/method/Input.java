// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

public class Input
{
    public static final class Back extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Back";
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

        public Back()
        {
        }
    }

    public static final class Down extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Down";
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

        public Down()
        {
        }
    }

    public static final class ExecuteAction extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.ExecuteAction";
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

        public ExecuteAction(String s)
        {
            addParameterToRequest("action", s);
        }
    }

    public static final class Left extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Left";
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

        public Left()
        {
        }
    }

    public static final class Right extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Right";
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

        public Right()
        {
        }
    }

    public static final class Select extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Select";
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

        public Select()
        {
        }
    }

    public static final class SendText extends ApiMethod
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

        public SendText(String s, boolean flag)
        {
            addParameterToRequest("text", s);
            addParameterToRequest("done", flag);
        }
    }

    public static final class Up extends ApiMethod
    {

        public String getMethodName()
        {
            return "Input.Up";
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

        public Up()
        {
        }
    }

}
