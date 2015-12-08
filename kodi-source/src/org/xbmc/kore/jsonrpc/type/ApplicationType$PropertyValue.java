// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApplicationType

public static class volume
{
    public static class Version
    {

        public final Integer major;
        public final Integer minor;
        public final String revision;
        public final String tag;

        public Version(JsonNode jsonnode)
        {
            major = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "major", 0));
            minor = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "minor", 0));
            revision = JsonUtils.stringFromJsonNode(jsonnode, "revision");
            tag = JsonUtils.stringFromJsonNode(jsonnode, "tag");
        }
    }


    public final Boolean muted;
    public final String name;
    public final Version version;
    public final Integer volume;

    public Version.tag(JsonNode jsonnode)
    {
        muted = Boolean.valueOf(JsonUtils.booleanFromJsonNode(jsonnode, "muted", false));
        name = JsonUtils.stringFromJsonNode(jsonnode, "name");
        version = new Version(jsonnode.get("version"));
        volume = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "volume", 0));
    }
}
