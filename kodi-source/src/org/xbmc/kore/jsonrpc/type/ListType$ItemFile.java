// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ListType

public static class  extends 
{

    public final String file;
    public final String filetype;
    public final String lastmodified;
    public final String mimetype;
    public final int size;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        file = JsonUtils.stringFromJsonNode(jsonnode, "file", null);
        filetype = JsonUtils.stringFromJsonNode(jsonnode, "filetype", null);
        lastmodified = JsonUtils.stringFromJsonNode(jsonnode, "lastmodified", null);
        mimetype = JsonUtils.stringFromJsonNode(jsonnode, "mimetype", null);
        size = JsonUtils.intFromJsonNode(jsonnode, "size", 0);
    }
}
