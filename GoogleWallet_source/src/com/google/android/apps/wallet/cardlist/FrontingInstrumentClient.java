// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class FrontingInstrumentClient
{

    private static final TimeUnit CACHE_TTL_UNIT;
    private static final Object FRONTING_INSTRUMENT_KEY = new Object();
    private final ReentrantLock inFlightLock = new ReentrantLock();
    private final Cache mFrontingInstrumentCache;
    private final RpcCaller rpcCaller;

    FrontingInstrumentClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
        mFrontingInstrumentCache = CacheBuilder.newBuilder().expireAfterWrite(20L, CACHE_TTL_UNIT).maximumSize(1L).build();
    }

    private void cacheFrontingInfo(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
    {
        mFrontingInstrumentCache.put(FRONTING_INSTRUMENT_KEY, frontinginstrumentinfo);
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse activatePlasticCard(com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardRequest activateplasticcardrequest)
        throws RpcException
    {
        inFlightLock.tryLock();
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo;
        activateplasticcardrequest = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse)rpcCaller.call("b/frontinginstrument/activatePlasticCard", activateplasticcardrequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse());
        frontinginstrumentinfo = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.ActivatePlasticCardResponse) (activateplasticcardrequest)).frontingInstrumentInfo;
        if (frontinginstrumentinfo == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        cacheFrontingInfo(frontinginstrumentinfo);
        inFlightLock.unlock();
        return activateplasticcardrequest;
        activateplasticcardrequest;
        inFlightLock.unlock();
        throw activateplasticcardrequest;
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse cancelPlasticCard(com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardRequest cancelplasticcardrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse)rpcCaller.call("b/frontinginstrument/cancelPlasticCard", cancelplasticcardrequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse createPaymentBundle(byte abyte0[], long l, int i)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleRequest createpaymentbundlerequest;
        createpaymentbundlerequest = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleRequest();
        createpaymentbundlerequest.clientTimeMillisSinceEpoch = Long.valueOf(l);
        createpaymentbundlerequest.encryptedKeyczarSessionMaterial = (byte[])abyte0.clone();
        createpaymentbundlerequest.bundleType = Integer.valueOf(i);
        inFlightLock.lock();
        abyte0 = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse)rpcCaller.call("b/frontinginstrument/createPaymentBundle", createpaymentbundlerequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse());
        inFlightLock.unlock();
        return abyte0;
        abyte0;
        inFlightLock.unlock();
        throw abyte0;
    }

    public final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo getFrontingInstrumentInfo()
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)mFrontingInstrumentCache.getIfPresent(FRONTING_INSTRUMENT_KEY);
        if (frontinginstrumentinfo != null)
        {
            return frontinginstrumentinfo;
        }
        inFlightLock.lock();
        Object obj = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)mFrontingInstrumentCache.getIfPresent(FRONTING_INSTRUMENT_KEY);
        if (obj != null)
        {
            inFlightLock.unlock();
            return ((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo) (obj));
        }
        obj = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoResponse)rpcCaller.call("b/frontinginstrument/getFrontingInstrumentInfo", new com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoRequest(), new com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoResponse());
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoResponse) (obj)).callError);
        }
        break MISSING_BLOCK_LABEL_116;
        obj;
        inFlightLock.unlock();
        throw obj;
        obj = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.GetFrontingInstrumentInfoResponse) (obj)).frontingInstrumentInfo;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        cacheFrontingInfo(((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo) (obj)));
        inFlightLock.unlock();
        return ((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo) (obj));
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse issuePlasticCard(com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardRequest issueplasticcardrequest)
        throws RpcException
    {
        inFlightLock.tryLock();
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo;
        issueplasticcardrequest = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse)rpcCaller.call("b/frontinginstrument/issuePlasticCard", issueplasticcardrequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse());
        frontinginstrumentinfo = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.IssuePlasticCardResponse) (issueplasticcardrequest)).frontingInstrumentInfo;
        if (frontinginstrumentinfo == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        cacheFrontingInfo(frontinginstrumentinfo);
        inFlightLock.unlock();
        return issueplasticcardrequest;
        issueplasticcardrequest;
        inFlightLock.unlock();
        throw issueplasticcardrequest;
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse lockPlasticCard(com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardRequest lockplasticcardrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse)rpcCaller.call("b/frontinginstrument/lockPlasticCard", lockplasticcardrequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse setFundingSources(List list)
        throws RpcException
    {
        Object obj;
        obj = new com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesRequest();
        obj.backingInstrumentIds = (com.google.wallet.proto.NanoWalletEntities.CdpIdData[])list.toArray(com.google.wallet.proto.NanoWalletEntities.CdpIdData.emptyArray());
        inFlightLock.lock();
        list = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse)rpcCaller.call("b/frontinginstrument/setFundingSources", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse());
        obj = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.SetFundingSourcesResponse) (list)).frontingInstrumentInfo;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        cacheFrontingInfo(((com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo) (obj)));
        inFlightLock.unlock();
        return list;
        list;
        inFlightLock.unlock();
        throw list;
    }

    public final com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse unlockPlasticCard(com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardRequest unlockplasticcardrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse)rpcCaller.call("b/frontinginstrument/unlockPlasticCard", unlockplasticcardrequest, new com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse());
    }

    static 
    {
        CACHE_TTL_UNIT = TimeUnit.SECONDS;
    }
}
