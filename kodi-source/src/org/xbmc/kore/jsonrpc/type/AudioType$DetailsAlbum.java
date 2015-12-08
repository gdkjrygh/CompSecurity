// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            AudioType

public static class type extends type
{

    public final int albumid;
    public final String albumlabel;
    public final String description;
    public final List mood;
    public final int playcount;
    public final List style;
    public final List theme;
    public final String type;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        albumid = JsonUtils.intFromJsonNode(jsonnode, "albumid");
        albumlabel = JsonUtils.stringFromJsonNode(jsonnode, "albumlabel");
        description = JsonUtils.stringFromJsonNode(jsonnode, "description");
        mood = JsonUtils.stringListFromJsonNode(jsonnode, "mood");
        playcount = JsonUtils.intFromJsonNode(jsonnode, "playcount");
        style = JsonUtils.stringListFromJsonNode(jsonnode, "style");
        theme = JsonUtils.stringListFromJsonNode(jsonnode, "theme");
        type = JsonUtils.stringFromJsonNode(jsonnode, "type");
    }
}
