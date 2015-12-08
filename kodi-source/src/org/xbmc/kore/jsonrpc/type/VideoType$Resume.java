// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class Node
{

    public final double position;
    public final double total;

    public (JsonNode jsonnode)
    {
        position = JsonUtils.doubleFromJsonNode(jsonnode, "position", 0.0D);
        total = JsonUtils.doubleFromJsonNode(jsonnode, "total", 0.0D);
    }
}
