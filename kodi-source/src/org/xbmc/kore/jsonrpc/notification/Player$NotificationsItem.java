// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class track
{

    public final String album;
    public final String artist;
    public final int episode;
    public final int id;
    public final int season;
    public final String showtitle;
    public final String title;
    public final int track;
    public final String type;
    public final int year;

    public A(JsonNode jsonnode)
    {
        type = JsonUtils.stringFromJsonNode(jsonnode, "type", "unknown");
        id = JsonUtils.intFromJsonNode(jsonnode, "speed");
        title = JsonUtils.stringFromJsonNode(jsonnode, "title");
        year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
        episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
        season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
        showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
        album = JsonUtils.stringFromJsonNode(jsonnode, "album");
        artist = JsonUtils.stringFromJsonNode(jsonnode, "artist");
        track = JsonUtils.intFromJsonNode(jsonnode, "track", 0);
    }
}
