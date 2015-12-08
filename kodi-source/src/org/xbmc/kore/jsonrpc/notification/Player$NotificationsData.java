// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class r
{

    public final r item;
    public final r player;

    public r(JsonNode jsonnode)
    {
        item = new <init>((ObjectNode)jsonnode.get("item"));
        player = new r((ObjectNode)jsonnode.get("player"));
    }
}
