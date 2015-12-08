// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

// Referenced classes of package org.xbmc.kore.jsonrpc.method:
//            Playlist

public static final class sReturnType extends ApiMethod
{

    public String getMethodName()
    {
        return "Playlist.GetPlaylists";
    }

    public volatile Object resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        return resultFromJson(objectnode);
    }

    public ArrayList resultFromJson(ObjectNode objectnode)
        throws ApiException
    {
        Object obj = (ArrayNode)objectnode.get("result");
        objectnode = new ArrayList();
        if (obj != null)
        {
            for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); objectnode.add(new org.xbmc.kore.jsonrpc.type.stsReturnType((JsonNode)((Iterator) (obj)).next()))) { }
        }
        return objectnode;
    }

    public sReturnType()
    {
    }
}
