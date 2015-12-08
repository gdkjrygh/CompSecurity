// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

public class Addons
{
    public static final class ExecuteAddon extends ApiMethod
    {

        public String getMethodName()
        {
            return "Addons.ExecuteAddon";
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

        public ExecuteAddon(String s)
        {
            addParameterToRequest("addonid", s);
        }
    }

    public static final class GetAddonDetails extends ApiMethod
    {

        public String getMethodName()
        {
            return "Addons.GetAddonDetails";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.AddonType.Details resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.AddonType.Details(objectnode.get("result").get("addon"));
        }

        public transient GetAddonDetails(String s, String as[])
        {
            addParameterToRequest("addonid", s);
            addParameterToRequest("properties", as);
        }
    }

    public static final class GetAddons extends ApiMethod
    {

        public String getMethodName()
        {
            return "Addons.GetAddons";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public List resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            objectnode = objectnode.get("result");
            if (objectnode.has("addons"))
            {
                objectnode = (ArrayNode)objectnode.get("addons");
            } else
            {
                objectnode = null;
            }
            if (objectnode != null) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.AddonType.Details((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetAddons(String as[])
        {
            addParameterToRequest("properties", as);
        }
    }

    public static final class SetAddonEnabled extends ApiMethod
    {

        public String getMethodName()
        {
            return "Addons.SetAddonEnabled";
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

        public SetAddonEnabled(String s, boolean flag)
        {
            addParameterToRequest("addonid", s);
            addParameterToRequest("enabled", flag);
        }
    }

}
