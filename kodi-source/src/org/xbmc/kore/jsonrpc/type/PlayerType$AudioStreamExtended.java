// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlayerType

public static class codec extends codec
{

    public final int bitrate;
    public final int channels;
    public final String codec;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        bitrate = JsonUtils.intFromJsonNode(jsonnode, "bitrate");
        channels = JsonUtils.intFromJsonNode(jsonnode, "channels");
        codec = JsonUtils.stringFromJsonNode(jsonnode, "codec");
    }
}
