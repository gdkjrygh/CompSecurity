// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class watchedepisodes extends watchedepisodes
{

    public final int episode;
    public final int season;
    public final String showtitle;
    public final int tvshowid;
    public final int watchedepisodes;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
        season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
        showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
        tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid", -1);
        watchedepisodes = JsonUtils.intFromJsonNode(jsonnode, "watchedepisodes", 0);
    }
}
