// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class width
{

    public final double aspect;
    public final String codec;
    public final int duration;
    public final int height;
    public final int width;

    public (JsonNode jsonnode)
    {
        aspect = JsonUtils.doubleFromJsonNode(jsonnode, "aspect", 0.0D);
        codec = JsonUtils.stringFromJsonNode(jsonnode, "codec", null);
        duration = JsonUtils.intFromJsonNode(jsonnode, "duration", -1);
        height = JsonUtils.intFromJsonNode(jsonnode, "height", -1);
        width = JsonUtils.intFromJsonNode(jsonnode, "width", -1);
    }
}
