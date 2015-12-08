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

    public final String album;
    public final List artist;
    public final List genre;
    public final int musicvideoid;
    public final List studio;
    public final List tag;
    public final int track;
    public final int year;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        album = JsonUtils.stringFromJsonNode(jsonnode, "album");
        artist = JsonUtils.stringListFromJsonNode(jsonnode, "artist");
        genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
        musicvideoid = JsonUtils.intFromJsonNode(jsonnode, "musicvideoid");
        studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
        tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
        track = JsonUtils.intFromJsonNode(jsonnode, "track", 0);
        year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
    }
}
