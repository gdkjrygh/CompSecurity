// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.util.ResponseEvent;

public abstract class PebbleOrderBaseClient extends RemoteOrderClient
{

    public PebbleOrderBaseClient()
    {
    }

    public String getName()
    {
        return "pebble";
    }

    public abstract void onResponseReceived(ResponseEvent responseevent);
}
