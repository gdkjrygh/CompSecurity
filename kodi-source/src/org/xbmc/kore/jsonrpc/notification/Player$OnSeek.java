// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class t extends ApiNotification
{

    public final ationsItem item;
    public final org.xbmc.kore.jsonrpc.type.e seekoffset;
    public final org.xbmc.kore.jsonrpc.type.e time;

    public ationsItem(ObjectNode objectnode)
    {
        super(objectnode);
        objectnode = (ObjectNode)objectnode.get("data");
        item = new ationsItem(objectnode.get("item"));
        objectnode = (ObjectNode)objectnode.get("player");
        time = new org.xbmc.kore.jsonrpc.type.e(objectnode.get("time"));
        seekoffset = new org.xbmc.kore.jsonrpc.type.e(objectnode.get("seekoffset"));
    }
}
