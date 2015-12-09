// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.common.base.Optional;

public class RpcException extends Exception
{

    private Optional mResponseMetadata;

    public RpcException()
    {
        mResponseMetadata = Optional.absent();
    }

    public RpcException(String s)
    {
        super(s);
        mResponseMetadata = Optional.absent();
    }

    public RpcException(String s, com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata)
    {
        super(s);
        mResponseMetadata = Optional.absent();
        mResponseMetadata = Optional.of(responsemetadata);
    }

    public RpcException(Throwable throwable)
    {
        super(throwable);
        mResponseMetadata = Optional.absent();
    }

    public final com.google.wallet.proto.NanoWalletTransport.ResponseMetadata getResponseMetadata()
    {
        if (mResponseMetadata.isPresent())
        {
            return (com.google.wallet.proto.NanoWalletTransport.ResponseMetadata)mResponseMetadata.get();
        } else
        {
            return null;
        }
    }
}
