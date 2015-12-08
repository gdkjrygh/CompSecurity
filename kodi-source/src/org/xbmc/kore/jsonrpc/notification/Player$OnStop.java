// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class t extends ApiNotification
{

    public final boolean end;
    public final ationsItem item;

    public ationsItem(ObjectNode objectnode)
    {
        super(objectnode);
        objectnode = (ObjectNode)objectnode.get("data");
        end = JsonUtils.booleanFromJsonNode(objectnode, "end");
        item = new ationsItem(objectnode.get("item"));
    }
}
