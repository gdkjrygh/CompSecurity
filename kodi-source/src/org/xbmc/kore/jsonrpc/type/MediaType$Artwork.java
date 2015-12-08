// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            MediaType

public static class ode
{

    public String banner;
    public String fanart;
    public String poster;
    public String thumb;

    public (JsonNode jsonnode)
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
