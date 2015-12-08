// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


public class AppPinToken
{

    private com.google.wallet.proto.NanoWalletEntities.PinToken mLatestPinToken;

    public AppPinToken()
    {
    }

    final com.google.wallet.proto.NanoWalletEntities.PinToken get()
    {
        return mLatestPinToken;
    }

    final void set(com.google.wallet.proto.NanoWalletEntities.PinToken pintoken)
    {
        mLatestPinToken = pintoken;
    }
}
