// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

class ivePlayersReturnType
    implements ApiCallback
{

    final HostConnectionObserver this$0;
    final org.xbmc.kore.jsonrpc.type.rsReturnType val$getActivePlayersResult;

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
        HostConnectionObserver.access$900(HostConnectionObserver.this, val$getActivePlayersResult, s);
    }

    ivePlayersReturnType()
    {
        this$0 = final_hostconnectionobserver;
        val$getActivePlayersResult = org.xbmc.kore.jsonrpc.type.rsReturnType.this;
        super();
    }
}
