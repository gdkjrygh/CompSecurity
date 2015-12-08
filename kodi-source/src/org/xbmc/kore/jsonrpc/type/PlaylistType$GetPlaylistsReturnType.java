// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlaylistType

public static final class type
{

    public final int playlistid;
    public final String type;

    public (JsonNode jsonnode)
    {
        playlistid = jsonnode.get("playlistid").asInt(-1);
        type = JsonUtils.stringFromJsonNode(jsonnode, "type", "unknown");
    }
}
