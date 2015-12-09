// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;


public final class KycUserFlow extends Enum
{

    private static final KycUserFlow $VALUES[];
    public static final KycUserFlow P2P_CLAIM;
    public static final KycUserFlow PLASTIC_CARD;
    public static final KycUserFlow SETUP_WALLET_BALANCE;
    final String urlContextParam;

    private KycUserFlow(String s, int i, String s1)
    {
        super(s, i);
        urlContextParam = s1;
    }

    public static KycUserFlow valueOf(String s)
    {
        return (KycUserFlow)Enum.valueOf(com/google/android/apps/wallet/kyc/api/KycUserFlow, s);
    }

    public static KycUserFlow[] values()
    {
        return (KycUserFlow[])$VALUES.clone();
    }

    static 
    {
        SETUP_WALLET_BALANCE = new KycUserFlow("SETUP_WALLET_BALANCE", 0, "&context=storedvalue");
        P2P_CLAIM = new KycUserFlow("P2P_CLAIM", 1, "&context=p2p");
        PLASTIC_CARD = new KycUserFlow("PLASTIC_CARD", 2, "&context=card");
        $VALUES = (new KycUserFlow[] {
            SETUP_WALLET_BALANCE, P2P_CLAIM, PLASTIC_CARD
        });
    }
}
