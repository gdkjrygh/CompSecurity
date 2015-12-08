// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApplicationType

public static class tag
{

    public final Integer major;
    public final Integer minor;
    public final String revision;
    public final String tag;

    public (JsonNode jsonnode)
    {
        major = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "major", 0));
        minor = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "minor", 0));
        revision = JsonUtils.stringFromJsonNode(jsonnode, "revision");
        tag = JsonUtils.stringFromJsonNode(jsonnode, "tag");
    }
}
