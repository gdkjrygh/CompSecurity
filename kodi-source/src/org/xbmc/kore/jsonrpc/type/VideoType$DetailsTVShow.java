// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class year extends year
{

    public final List cast;
    public final int episode;
    public final String episodeguide;
    public final List genre;
    public final String imdbnumber;
    public final String mpaa;
    public final String originaltitle;
    public final String premiered;
    public final double rating;
    public final int season;
    public final String sorttitle;
    public final List studio;
    public final List tag;
    public final int tvshowid;
    public final String votes;
    public final int watchedepisodes;
    public final int year;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        cast = romJsonNode(jsonnode, "cast");
        episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
        episodeguide = JsonUtils.stringFromJsonNode(jsonnode, "episodeguide");
        genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
        imdbnumber = JsonUtils.stringFromJsonNode(jsonnode, "imdbnumber");
        mpaa = JsonUtils.stringFromJsonNode(jsonnode, "mpaa");
        originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
        premiered = JsonUtils.stringFromJsonNode(jsonnode, "premiered");
        rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
        season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
        sorttitle = JsonUtils.stringFromJsonNode(jsonnode, "sorttitle");
        studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
        tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
        tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid", 0);
        votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
        watchedepisodes = JsonUtils.intFromJsonNode(jsonnode, "watchedepisodes", 0);
        year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
    }
}
