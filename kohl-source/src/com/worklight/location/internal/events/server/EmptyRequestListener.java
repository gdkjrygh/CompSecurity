// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.server;

import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;

public final class EmptyRequestListener
    implements WLRequestListener
{

    public EmptyRequestListener()
    {
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
    }

    public void onSuccess(WLResponse wlresponse)
    {
    }
}
