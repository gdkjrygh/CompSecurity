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
    public final List country;
    public final List genre;
    public final String imdbnumber;
    public final int movieid;
    public final String mpaa;
    public final String originaltitle;
    public final String plotoutline;
    public final double rating;
    public final String set;
    public final int setid;
    public final List showlink;
    public final String sorttitle;
    public final List studio;
    public final List tag;
    public final String tagline;
    public final int top250;
    public final String trailer;
    public final String votes;
    public final List writer;
    public final int year;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        cast = FromJsonNode(jsonnode, "cast");
        country = JsonUtils.stringListFromJsonNode(jsonnode, "country");
        genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
        imdbnumber = JsonUtils.stringFromJsonNode(jsonnode, "imdbnumber");
        movieid = JsonUtils.intFromJsonNode(jsonnode, "movieid");
        mpaa = JsonUtils.stringFromJsonNode(jsonnode, "mpaa");
        originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
        plotoutline = JsonUtils.stringFromJsonNode(jsonnode, "plotoutline");
        rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
        set = JsonUtils.stringFromJsonNode(jsonnode, "set");
        setid = JsonUtils.intFromJsonNode(jsonnode, "setid", -1);
        showlink = JsonUtils.stringListFromJsonNode(jsonnode, "showlink");
        sorttitle = JsonUtils.stringFromJsonNode(jsonnode, "sorttitle");
        studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
        tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
        tagline = JsonUtils.stringFromJsonNode(jsonnode, "tagline");
        top250 = JsonUtils.intFromJsonNode(jsonnode, "top250", 0);
        trailer = JsonUtils.stringFromJsonNode(jsonnode, "trailer");
        votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
        writer = JsonUtils.stringListFromJsonNode(jsonnode, "writer");
        year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
    }
}
