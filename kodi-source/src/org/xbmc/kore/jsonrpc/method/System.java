// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

public class System
{
    public static final class Reboot extends ApiMethod
    {

        public String getMethodName()
        {
            return "System.Reboot";
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

        public Reboot()
        {
        }
    }

    public static final class Shutdown extends ApiMethod
    {

        public String getMethodName()
        {
            return "System.Shutdown";
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

        public Shutdown()
        {
        }
    }

    public static final class Suspend extends ApiMethod
    {

        public String getMethodName()
        {
            return "System.Suspend";
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

        public Suspend()
        {
        }
    }

}
