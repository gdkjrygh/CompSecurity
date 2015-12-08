// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlayerType

public static class e
{

    public final int index;
    public final String language;
    public final String name;

    public static List getListSubtitle(JsonNode jsonnode)
    {
        Object obj = (ArrayNode)jsonnode;
        jsonnode = new ArrayList(jsonnode.size());
        for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonnode.add(new <init>((JsonNode)((Iterator) (obj)).next()))) { }
        return jsonnode;
    }

    public (JsonNode jsonnode)
    {
        index = JsonUtils.intFromJsonNode(jsonnode, "index");
        language = JsonUtils.stringFromJsonNode(jsonnode, "language");
        name = JsonUtils.stringFromJsonNode(jsonnode, "name");
    }
}
