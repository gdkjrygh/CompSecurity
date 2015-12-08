// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

public class AddonType
{
    public static class Details extends ItemType.DetailsBase
    {

        public final String addonid;
        public final String author;
        public final boolean broken;
        public final String description;
        public final String disclaimer;
        public final Boolean enabled;
        public final String fanart;
        public final String name;
        public final String path;
        public final int rating;
        public final String summary;
        public final String thumbnail;
        public final String type;
        public final String version;

        public Details(JsonNode jsonnode)
        {
            super(jsonnode);
            addonid = JsonUtils.stringFromJsonNode(jsonnode, "addonid");
            author = JsonUtils.stringFromJsonNode(jsonnode, "author");
            broken = JsonUtils.booleanFromJsonNode(jsonnode, "broken", false);
            description = JsonUtils.stringFromJsonNode(jsonnode, "description");
            disclaimer = JsonUtils.stringFromJsonNode(jsonnode, "disclaimer");
            enabled = Boolean.valueOf(JsonUtils.booleanFromJsonNode(jsonnode, "enabled", false));
            fanart = JsonUtils.stringFromJsonNode(jsonnode, "fanart");
            name = JsonUtils.stringFromJsonNode(jsonnode, "name");
            path = JsonUtils.stringFromJsonNode(jsonnode, "path");
            rating = JsonUtils.intFromJsonNode(jsonnode, "rating", 0);
            summary = JsonUtils.stringFromJsonNode(jsonnode, "summary");
            thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail");
            type = JsonUtils.stringFromJsonNode(jsonnode, "type");
            version = JsonUtils.stringFromJsonNode(jsonnode, "version");
        }
    }

}
