// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class playcount extends playcount
{

    public final playcount art;
    public final Integer playcount;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
         ;
        if (jsonnode.has("art"))
        {
             = new t>(jsonnode.get("art"));
        } else
        {
             = null;
        }
        art = ;
        playcount = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "playcount", 0));
    }
}
