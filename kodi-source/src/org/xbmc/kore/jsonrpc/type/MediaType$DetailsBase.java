// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            MediaType

public static class thumbnail extends thumbnail
{

    public final String fanart;
    public final String thumbnail;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        fanart = JsonUtils.stringFromJsonNode(jsonnode, "fanart", null);
        thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail", null);
    }
}
