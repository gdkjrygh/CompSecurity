// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Input

public static class value extends ApiNotification
{

    public final String title;
    public final String type;
    public final String value;

    public (ObjectNode objectnode)
    {
        super(objectnode);
        objectnode = (ObjectNode)objectnode.get("data");
        title = JsonUtils.stringFromJsonNode(objectnode, "title");
        type = JsonUtils.stringFromJsonNode(objectnode, "type");
        value = JsonUtils.stringFromJsonNode(objectnode, "value");
    }
}
