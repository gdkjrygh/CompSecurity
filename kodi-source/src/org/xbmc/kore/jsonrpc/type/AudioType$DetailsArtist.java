// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            AudioType

public static class e extends e
{

    public final String artist;
    public final int artistid;
    public final String born;
    public final boolean compilationartist;
    public final String description;
    public final String died;
    public final String disbanded;
    public final String formed;
    public final List instrument;
    public final List mood;
    public final String musicbrainzartistid;
    public final List style;
    public final List yearsactive;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        artist = JsonUtils.stringFromJsonNode(jsonnode, "artist");
        artistid = JsonUtils.intFromJsonNode(jsonnode, "artistid");
        born = JsonUtils.stringFromJsonNode(jsonnode, "born");
        compilationartist = JsonUtils.booleanFromJsonNode(jsonnode, "compilationartist", false);
        description = JsonUtils.stringFromJsonNode(jsonnode, "description");
        died = JsonUtils.stringFromJsonNode(jsonnode, "died");
        disbanded = JsonUtils.stringFromJsonNode(jsonnode, "disbanded");
        formed = JsonUtils.stringFromJsonNode(jsonnode, "formed");
        instrument = JsonUtils.stringListFromJsonNode(jsonnode, "instrument");
        mood = JsonUtils.stringListFromJsonNode(jsonnode, "mood");
        musicbrainzartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzartistid");
        style = JsonUtils.stringListFromJsonNode(jsonnode, "style");
        yearsactive = JsonUtils.stringListFromJsonNode(jsonnode, "yearsactive");
    }
}
