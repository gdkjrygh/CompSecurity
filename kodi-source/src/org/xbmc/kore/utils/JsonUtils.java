// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonUtils
{

    public static boolean booleanFromJsonNode(JsonNode jsonnode, String s)
    {
        return booleanFromJsonNode(jsonnode, s, false);
    }

    public static boolean booleanFromJsonNode(JsonNode jsonnode, String s, boolean flag)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.asBoolean();
            }
        }
        return flag;
    }

    public static double doubleFromJsonNode(JsonNode jsonnode, String s, double d)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.asDouble();
            }
        }
        return d;
    }

    public static int intFromJsonNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.asInt();
            }
        }
        return 0;
    }

    public static int intFromJsonNode(JsonNode jsonnode, String s, int i)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.asInt();
            }
        }
        return i;
    }

    public static List integerListFromJsonNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null) goto _L2; else goto _L1
_L1:
        jsonnode = new ArrayList(0);
_L4:
        return jsonnode;
_L2:
label0:
        {
            jsonnode = jsonnode.get(s);
            if (jsonnode == null)
            {
                return new ArrayList(0);
            }
            if (!jsonnode.isArray())
            {
                break label0;
            }
            jsonnode = (ArrayNode)jsonnode;
            s = new ArrayList(jsonnode.size());
            Iterator iterator = jsonnode.iterator();
            do
            {
                jsonnode = s;
                if (!iterator.hasNext())
                {
                    break;
                }
                s.add(Integer.valueOf(((JsonNode)iterator.next()).asInt()));
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = new ArrayList(1);
        s.add(Integer.valueOf(jsonnode.asInt()));
        return s;
    }

    public static String stringFromJsonNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.textValue();
            }
        }
        return null;
    }

    public static String stringFromJsonNode(JsonNode jsonnode, String s, String s1)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = jsonnode.get(s)) != null)
            {
                return jsonnode.textValue();
            }
        }
        return s1;
    }

    public static List stringListFromJsonNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null) goto _L2; else goto _L1
_L1:
        jsonnode = new ArrayList(0);
_L4:
        return jsonnode;
_L2:
label0:
        {
            jsonnode = jsonnode.get(s);
            if (jsonnode == null)
            {
                return new ArrayList(0);
            }
            if (!jsonnode.isArray())
            {
                break label0;
            }
            jsonnode = (ArrayNode)jsonnode;
            s = new ArrayList(jsonnode.size());
            Iterator iterator = jsonnode.iterator();
            do
            {
                jsonnode = s;
                if (!iterator.hasNext())
                {
                    break;
                }
                s.add(((JsonNode)iterator.next()).textValue());
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = new ArrayList(1);
        s.add(jsonnode.textValue());
        return s;
    }
}
