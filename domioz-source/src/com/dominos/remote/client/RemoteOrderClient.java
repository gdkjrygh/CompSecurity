// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.client;

import com.dominos.remote.util.ResponseEvent;
import java.io.Serializable;

public abstract class RemoteOrderClient
    implements Serializable
{

    public RemoteOrderClient()
    {
    }

    public abstract String getName();

    public abstract void onResponseReceived(ResponseEvent responseevent);
}
