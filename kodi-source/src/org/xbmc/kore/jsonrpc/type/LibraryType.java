// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

public class LibraryType
{
    public static class DetailsGenre extends ItemType.DetailsBase
    {

        public final Integer genreid;
        public final String thumbnail;
        public final String title;

        public DetailsGenre(JsonNode jsonnode)
        {
            super(jsonnode);
            genreid = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "genreid"));
            thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail");
            title = JsonUtils.stringFromJsonNode(jsonnode, "title");
        }
    }

}
