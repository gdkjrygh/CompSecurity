// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            AudioType

public static class year extends year
{

    public final List artist;
    public final List artistid;
    public final String displayartist;
    public final List genreid;
    public final String musicbrainzalbumartistid;
    public final String musicbrainzalbumid;
    public final int rating;
    public final String title;
    public final int year;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        artist = JsonUtils.stringListFromJsonNode(jsonnode, "artist");
        artistid = JsonUtils.integerListFromJsonNode(jsonnode, "artistid");
        displayartist = JsonUtils.stringFromJsonNode(jsonnode, "displayartist");
        genreid = JsonUtils.integerListFromJsonNode(jsonnode, "genreid");
        musicbrainzalbumartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumartistid");
        musicbrainzalbumid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumid");
        rating = JsonUtils.intFromJsonNode(jsonnode, "rating");
        title = JsonUtils.stringFromJsonNode(jsonnode, "title");
        year = JsonUtils.intFromJsonNode(jsonnode, "year");
    }
}
