// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.collect.Iterables;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobCategory

public class WobsCacheClient
{

    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final RpcCaller rpcCaller;

    public WobsCacheClient(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters)
    {
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse fetchCacheConfiguration(byte abyte0[])
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigRequest fetchcacheconfigrequest = new com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigRequest();
        fetchcacheconfigrequest.configurationId = abyte0;
        return (com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse)rpcCaller.call("b/wobs/fetchCacheConfig", fetchcacheconfigrequest, new com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse fetchTailWobs(byte abyte0[], WobCategory wobcategory, byte abyte1[])
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsRequest fetchnextwobsrequest = new com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsRequest();
        fetchnextwobsrequest.configurationId = abyte0;
        fetchnextwobsrequest.categoryId = Integer.valueOf(wobcategory.getId());
        fetchnextwobsrequest.nextPageToken = abyte1;
        fetchnextwobsrequest.pageSize = Integer.valueOf(15);
        fetchnextwobsrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        fetchnextwobsrequest.renderInfo.contextParameters = contextParameters;
        fetchnextwobsrequest.renderInfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        return (com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse)rpcCaller.call("b/wobs/fetchNextWobs", fetchnextwobsrequest, new com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse fetchWob(String s)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.FetchWobsRequest fetchwobsrequest = new com.google.wallet.proto.api.NanoWalletWobs.FetchWobsRequest();
        fetchwobsrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        fetchwobsrequest.renderInfo.contextParameters = contextParameters;
        fetchwobsrequest.renderInfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        fetchwobsrequest.wobId = (new String[] {
            s
        });
        return (com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse)rpcCaller.call("b/wobs/fetchWobs", fetchwobsrequest, new com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse updateCacheHead(byte abyte0[], com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadRequest updatecacheheadrequest = new com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadRequest();
        updatecacheheadrequest.configurationId = abyte0;
        updatecacheheadrequest.state = headstate;
        updatecacheheadrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        updatecacheheadrequest.renderInfo.contextParameters = contextParameters;
        updatecacheheadrequest.renderInfo.entrypointNames = (String[])Iterables.toArray(LayoutMatcher.WOBS_ENTRY_POINT_NAMES, java/lang/String);
        return (com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse)rpcCaller.call("b/wobs/updateCacheHead", updatecacheheadrequest, new com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse());
    }
}
