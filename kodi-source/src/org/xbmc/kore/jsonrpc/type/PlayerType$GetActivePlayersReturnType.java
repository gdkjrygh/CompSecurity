// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlayerType

public static final class type
{

    public final int playerid;
    public final String type;

    public (JsonNode jsonnode)
    {
        int i = -1;
        super();
        if (jsonnode.has("playerid"))
        {
            i = jsonnode.get("playerid").asInt(-1);
        }
        playerid = i;
        if (jsonnode.has("type"))
        {
            jsonnode = jsonnode.get("type").textValue();
        } else
        {
            jsonnode = null;
        }
        type = jsonnode;
    }
}
