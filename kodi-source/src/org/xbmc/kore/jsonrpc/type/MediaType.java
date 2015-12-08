// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

public class MediaType
{
    public static class Artwork
    {

        public String banner;
        public String fanart;
        public String poster;
        public String thumb;

        public Artwork(JsonNode jsonnode)
        {
            if (jsonnode != null)
            {
                banner = JsonUtils.stringFromJsonNode(jsonnode, "banner", null);
                if (banner == null)
                {
                    banner = JsonUtils.stringFromJsonNode(jsonnode, "tvshow.banner", null);
                }
                fanart = JsonUtils.stringFromJsonNode(jsonnode, "fanart", null);
                if (fanart == null)
                {
                    poster = JsonUtils.stringFromJsonNode(jsonnode, "tvshow.fanart", null);
                }
                poster = JsonUtils.stringFromJsonNode(jsonnode, "poster", null);
                if (poster == null)
                {
                    poster = JsonUtils.stringFromJsonNode(jsonnode, "tvshow.poster", null);
                }
                thumb = JsonUtils.stringFromJsonNode(jsonnode, "thumb", null);
                if (thumb == null)
                {
                    thumb = JsonUtils.stringFromJsonNode(jsonnode, "album.thumb", null);
                    return;
                }
            }
        }
    }

    public static class DetailsBase extends ItemType.DetailsBase
    {

        public final String fanart;
        public final String thumbnail;

        public DetailsBase(JsonNode jsonnode)
        {
            super(jsonnode);
            fanart = JsonUtils.stringFromJsonNode(jsonnode, "fanart", null);
            thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail", null);
        }
    }

}
