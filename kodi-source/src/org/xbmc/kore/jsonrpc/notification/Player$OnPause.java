// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;

// Referenced classes of package org.xbmc.kore.jsonrpc.notification:
//            Player

public static class  extends ApiNotification
{

    public final tionsData data;

    public tionsData(ObjectNode objectnode)
    {
        super(objectnode);
        data = new tionsData(objectnode.get("data"));
    }
}
