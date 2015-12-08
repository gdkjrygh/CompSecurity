// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlayerType

public static final class totalTime
{

    public final int percentage;
    public final totalTime time;
    public final totalTime totalTime;

    public (JsonNode jsonnode)
    {
        percentage = JsonUtils.intFromJsonNode(jsonnode, "percentage");
        time = new time(jsonnode.get("time"));
        totalTime = new totalTime(jsonnode.get("totaltime"));
    }
}
