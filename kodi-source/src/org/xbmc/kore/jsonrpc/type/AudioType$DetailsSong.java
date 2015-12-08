// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            AudioType

public static class track extends 
{

    public final String album;
    public final List albumartist;
    public final List albumartistid;
    public final int albumid;
    public final String comment;
    public final int disc;
    public final int duration;
    public final String file;
    public final String lastplayed;
    public final String lyrics;
    public final String musicbrainzartistid;
    public final String musicbrainztrackid;
    public final int playcount;
    public final int songid;
    public final int track;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        album = JsonUtils.stringFromJsonNode(jsonnode, "album");
        albumid = JsonUtils.intFromJsonNode(jsonnode, "albumid");
        albumartist = JsonUtils.stringListFromJsonNode(jsonnode, "albumartist");
        albumartistid = JsonUtils.integerListFromJsonNode(jsonnode, "albumartistid");
        comment = JsonUtils.stringFromJsonNode(jsonnode, "comment");
        disc = JsonUtils.intFromJsonNode(jsonnode, "disc");
        duration = JsonUtils.intFromJsonNode(jsonnode, "duration");
        file = JsonUtils.stringFromJsonNode(jsonnode, "file");
        lastplayed = JsonUtils.stringFromJsonNode(jsonnode, "lastplayed");
        lyrics = JsonUtils.stringFromJsonNode(jsonnode, "lyrics");
        musicbrainzartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzartistid");
        musicbrainztrackid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainztrackid");
        playcount = JsonUtils.intFromJsonNode(jsonnode, "playcount");
        songid = JsonUtils.intFromJsonNode(jsonnode, "songid");
        track = JsonUtils.intFromJsonNode(jsonnode, "track");
    }
}
