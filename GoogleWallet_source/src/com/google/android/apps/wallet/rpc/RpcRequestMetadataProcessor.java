// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;


public interface RpcRequestMetadataProcessor
{

    public abstract void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata);
}
