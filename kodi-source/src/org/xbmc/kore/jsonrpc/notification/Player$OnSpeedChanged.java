// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class ta extends ApiNotification
{

    public final ta data;

    public ta(ObjectNode objectnode)
    {
        super(objectnode);
        data = new ta(objectnode.get("data"));
    }
}
