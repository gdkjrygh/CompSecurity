// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;


public class WobDeletionEvent
{

    private final com.google.wallet.proto.NanoWalletError.CallError error;
    private final boolean isCausedByCategoryChange;
    private final com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

    public WobDeletionEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        this(wobinstance, null);
    }

    public WobDeletionEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, com.google.wallet.proto.NanoWalletError.CallError callerror)
    {
        this(wobinstance, callerror, false);
    }

    private WobDeletionEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, com.google.wallet.proto.NanoWalletError.CallError callerror, boolean flag)
    {
        wobInstance = wobinstance;
        isCausedByCategoryChange = flag;
        error = callerror;
    }

    public static WobDeletionEvent deletionCausedByCategoryChange(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        return new WobDeletionEvent(wobinstance, null, true);
    }

    public final com.google.wallet.proto.NanoWalletError.CallError getError()
    {
        return error;
    }

    public final com.google.wallet.proto.NanoWalletObjects.WobInstance getWobInstance()
    {
        return wobInstance;
    }

    public final boolean hasError()
    {
        return error != null;
    }

    public final boolean isCausedByCategoryChange()
    {
        return isCausedByCategoryChange;
    }
}
