// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;


public class WobUpdateEvent
{

    private final boolean hasError;
    private final com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

    public WobUpdateEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        boolean flag;
        if (wobinstance == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(wobinstance, flag);
    }

    private WobUpdateEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, boolean flag)
    {
        wobInstance = wobinstance;
        hasError = flag;
    }

    public static WobUpdateEvent errorEvent()
    {
        return new WobUpdateEvent(null, true);
    }

    public final com.google.wallet.proto.NanoWalletObjects.WobInstance getWobInstance()
    {
        return wobInstance;
    }

    public final boolean hasError()
    {
        return hasError;
    }
}
