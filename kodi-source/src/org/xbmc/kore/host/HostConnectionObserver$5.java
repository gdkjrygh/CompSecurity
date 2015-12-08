// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

class tyValue
    implements ApiCallback
{

    final HostConnectionObserver this$0;
    final org.xbmc.kore.jsonrpc.type.rsReturnType val$getActivePlayersResult;
    final org.xbmc.kore.jsonrpc.type.rsReturnType val$getPropertiesResult;

    public void onError(int i, String s)
    {
        HostConnectionObserver.access$600(HostConnectionObserver.this, i, s, HostConnectionObserver.access$000(HostConnectionObserver.this));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.s)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type.s s)
    {
        HostConnectionObserver.access$1000(HostConnectionObserver.this, val$getActivePlayersResult, val$getPropertiesResult, s, HostConnectionObserver.access$000(HostConnectionObserver.this));
    }

    tyValue()
    {
        this$0 = final_hostconnectionobserver;
        val$getActivePlayersResult = rsreturntype;
        val$getPropertiesResult = org.xbmc.kore.jsonrpc.type.ropertiesResult.this;
        super();
    }
}
