// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help.api;


public final class WalletHelpContext extends Enum
{

    private static final WalletHelpContext $VALUES[];
    public static final WalletHelpContext HOME;
    public static final WalletHelpContext LOYALTY;
    public static final WalletHelpContext OFFERS;
    public static final WalletHelpContext P2P;
    public static final WalletHelpContext TAP_AND_PAY;
    public static final WalletHelpContext TRANSACTIONS;
    public static final WalletHelpContext WALLET_BALANCE;
    public static final WalletHelpContext WALLET_CARD;
    private String helpContextString;

    private WalletHelpContext(String s, int i, String s1)
    {
        super(s, i);
        helpContextString = s1;
    }

    public static WalletHelpContext valueOf(String s)
    {
        return (WalletHelpContext)Enum.valueOf(com/google/android/apps/wallet/help/api/WalletHelpContext, s);
    }

    public static WalletHelpContext[] values()
    {
        return (WalletHelpContext[])$VALUES.clone();
    }

    public final String getContextKey()
    {
        return helpContextString;
    }

    static 
    {
        HOME = new WalletHelpContext("HOME", 0, "home");
        TRANSACTIONS = new WalletHelpContext("TRANSACTIONS", 1, "transactions");
        WALLET_BALANCE = new WalletHelpContext("WALLET_BALANCE", 2, "walletbalance");
        TAP_AND_PAY = new WalletHelpContext("TAP_AND_PAY", 3, "tapandpay");
        WALLET_CARD = new WalletHelpContext("WALLET_CARD", 4, "walletcard");
        P2P = new WalletHelpContext("P2P", 5, "p2p");
        OFFERS = new WalletHelpContext("OFFERS", 6, "offers");
        LOYALTY = new WalletHelpContext("LOYALTY", 7, "loyalty");
        $VALUES = (new WalletHelpContext[] {
            HOME, TRANSACTIONS, WALLET_BALANCE, TAP_AND_PAY, WALLET_CARD, P2P, OFFERS, LOYALTY
        });
    }
}
