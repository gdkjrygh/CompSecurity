// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApiParameter, PlayerType

public static class milliseconds
    implements ApiParameter
{

    protected static final ObjectMapper objectMapper = new ObjectMapper();
    public final int hours;
    public final int milliseconds;
    public final int minutes;
    public final int seconds;

    public JsonNode toJsonNode()
    {
        ObjectNode objectnode = objectMapper.createObjectNode();
        objectnode.put("hours", hours);
        objectnode.put("milliseconds", milliseconds);
        objectnode.put("minutes", minutes);
        objectnode.put("seconds", seconds);
        return objectnode;
    }


    public (int i, int j, int k, int l)
    {
        hours = i;
        minutes = j;
        seconds = k;
        milliseconds = l;
    }
}
