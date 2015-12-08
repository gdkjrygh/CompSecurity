// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.service;


public final class WalletContextParameter extends Enum
{

    private static final WalletContextParameter $VALUES[];
    public static final WalletContextParameter RESTRICTIONS_SATISFIED;
    public static final WalletContextParameter SETUP_COMPLETE;

    private WalletContextParameter(String s, int i)
    {
        super(s, i);
    }

    public static WalletContextParameter valueOf(String s)
    {
        return (WalletContextParameter)Enum.valueOf(com/google/android/apps/wallet/base/service/WalletContextParameter, s);
    }

    public static WalletContextParameter[] values()
    {
        return (WalletContextParameter[])$VALUES.clone();
    }

    static 
    {
        SETUP_COMPLETE = new WalletContextParameter("SETUP_COMPLETE", 0);
        RESTRICTIONS_SATISFIED = new WalletContextParameter("RESTRICTIONS_SATISFIED", 1);
        $VALUES = (new WalletContextParameter[] {
            SETUP_COMPLETE, RESTRICTIONS_SATISFIED
        });
    }
}
