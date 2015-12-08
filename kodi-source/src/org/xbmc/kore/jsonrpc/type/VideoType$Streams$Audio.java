// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class language
{

    public final int channels;
    public final String codec;
    public final String language;

    public (JsonNode jsonnode)
    {
        channels = JsonUtils.intFromJsonNode(jsonnode, "channels", 0);
        codec = JsonUtils.stringFromJsonNode(jsonnode, "codec");
        language = JsonUtils.stringFromJsonNode(jsonnode, "language");
    }
}
