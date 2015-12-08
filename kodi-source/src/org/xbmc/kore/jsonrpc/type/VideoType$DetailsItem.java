// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class plot extends 
{

    public final String dateadded;
    public final String file;
    public final String lastplayed;
    public final String plot;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        dateadded = JsonUtils.stringFromJsonNode(jsonnode, "dateadded", null);
        file = JsonUtils.stringFromJsonNode(jsonnode, "file", null);
        lastplayed = JsonUtils.stringFromJsonNode(jsonnode, "lastplayed", null);
        plot = JsonUtils.stringFromJsonNode(jsonnode, "plot", null);
    }
}
