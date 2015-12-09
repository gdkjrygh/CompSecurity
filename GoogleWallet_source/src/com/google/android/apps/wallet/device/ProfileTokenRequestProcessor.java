// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor;

public class ProfileTokenRequestProcessor
    implements RpcRequestMetadataProcessor
{

    private final SharedPreferences sharedPreferences;

    ProfileTokenRequestProcessor(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
    {
        requestmetadata.profileToken = (com.google.wallet.proto.NanoWalletTransport.ProfileToken)SharedPreference.messageFromPreference(SharedPreference.PROFILE_TOKEN, new com.google.wallet.proto.NanoWalletTransport.ProfileToken(), sharedPreferences);
    }
}
