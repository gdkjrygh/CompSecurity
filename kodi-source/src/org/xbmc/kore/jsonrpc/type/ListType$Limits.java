// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApiParameter, ListType

public static class end
    implements ApiParameter
{

    protected static final ObjectMapper objectMapper = new ObjectMapper();
    public final int end;
    public final int start;

    public JsonNode toJsonNode()
    {
        ObjectNode objectnode = objectMapper.createObjectNode();
        objectnode.put("start", start);
        objectnode.put("end", end);
        return objectnode;
    }


    public (int i, int j)
    {
        start = i;
        end = j;
    }
}
