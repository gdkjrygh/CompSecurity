// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;


public class MyWalletEvent
{

    private final Throwable failureCause;
    private final com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup tileGroups[];

    public MyWalletEvent(com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup awallettilegroup[])
    {
        this(awallettilegroup, null);
    }

    private MyWalletEvent(com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup awallettilegroup[], Throwable throwable)
    {
        tileGroups = awallettilegroup;
        failureCause = throwable;
    }

    public final com.google.wallet.proto.api.NanoWalletMywallet.WalletTileGroup[] getTiles()
    {
        return tileGroups;
    }
}
