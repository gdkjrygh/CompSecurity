// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class GeofencingNotificationClient
{

    private final RpcCaller mRpcCaller;

    public GeofencingNotificationClient(RpcCaller rpccaller)
    {
        mRpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse geofencedMessage(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageRequest geofencedmessagerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse)mRpcCaller.call("b/location/geofencedMessage", geofencedmessagerequest, new com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesResponse geofencedZones(com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesRequest geofencedzonesrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesResponse)mRpcCaller.call("b/location/geofencedZones", geofencedzonesrequest, new com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesResponse());
    }
}
