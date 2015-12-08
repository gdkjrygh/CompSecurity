// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class speed
{

    public final int playerId;
    public final int speed;

    public (JsonNode jsonnode)
    {
        playerId = JsonUtils.intFromJsonNode(jsonnode, "playerid");
        speed = JsonUtils.intFromJsonNode(jsonnode, "speed", 0);
    }
}
