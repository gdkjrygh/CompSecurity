// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class  extends 
{

    public final List cast;
    public final int episode;
    public final int episodeid;
    public final String firstaired;
    public final String originaltitle;
    public final String productioncode;
    public final double rating;
    public final int season;
    public final String showtitle;
    public final int tvshowid;
    public final String votes;
    public final List writer;

    public _cls9(JsonNode jsonnode)
    {
        super(jsonnode);
        cast = omJsonNode(jsonnode, "cast");
        episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
        episodeid = JsonUtils.intFromJsonNode(jsonnode, "episodeid");
        firstaired = JsonUtils.stringFromJsonNode(jsonnode, "firstaired");
        originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
        productioncode = JsonUtils.stringFromJsonNode(jsonnode, "productioncode");
        rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
        season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
        showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
        tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid");
        votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
        writer = JsonUtils.stringListFromJsonNode(jsonnode, "writer");
    }
}
