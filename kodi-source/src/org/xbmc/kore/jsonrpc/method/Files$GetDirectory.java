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

// Referenced classes of package org.xbmc.kore.jsonrpc.method:
//            Files

public static final class ode extends ApiMethod
{

    public String getMethodName()
    {
        return "Files.GetDirectory";
    }

    public volatile Object resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return resultFromJson(objectnode);
    }

    public List resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        objectnode = objectnode.get("result").get("files");
        if (objectnode != null && !objectnode.isNull()) goto _L2; else goto _L1
_L1:
        objectnode = new ArrayList(0);
_L4:
        return objectnode;
_L2:
        objectnode = (ArrayNode)objectnode;
        ArrayList arraylist = new ArrayList(objectnode.size());
        Iterator iterator = objectnode.iterator();
        do
        {
            objectnode = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(new org.xbmc.kore.jsonrpc.type.init>((JsonNode)iterator.next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public transient (String s, String s1, org.xbmc.kore.jsonrpc.type.y y, String as[])
    {
        addParameterToRequest("directory", s);
        addParameterToRequest("media", s1);
        addParameterToRequest("properties", as);
        addParameterToRequest("sort", y.nNode());
    }
}
