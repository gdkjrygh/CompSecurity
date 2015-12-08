// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            FilesType

public static final class path
{

    public final String mode;
    public final String path;
    public final String protocol;

    public (JsonNode jsonnode)
    {
        mode = JsonUtils.stringFromJsonNode(jsonnode, "mode");
        protocol = JsonUtils.stringFromJsonNode(jsonnode, "protocol");
        path = JsonUtils.stringFromJsonNode(jsonnode.get("details"), "path");
    }
}
