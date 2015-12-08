// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApiParameter, ListType

public static class ignore_article
    implements ApiParameter
{

    protected static final ObjectMapper objectMapper = new ObjectMapper();
    public final boolean ascending_order;
    public final boolean ignore_article;
    public final String sort_method;

    public JsonNode toJsonNode()
    {
        ObjectNode objectnode = objectMapper.createObjectNode();
        String s;
        if (ascending_order)
        {
            s = "ascending";
        } else
        {
            s = "descending";
        }
        objectnode.put("order", s);
        objectnode.put("ignorearticle", ignore_article);
        objectnode.put("method", sort_method);
        return objectnode;
    }


    public er(String s, boolean flag, boolean flag1)
    {
        sort_method = s;
        ascending_order = flag;
        ignore_article = flag1;
    }
}
