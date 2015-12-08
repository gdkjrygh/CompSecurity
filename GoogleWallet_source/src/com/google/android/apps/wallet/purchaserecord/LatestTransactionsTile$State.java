// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            LatestTransactionsTile

static final class  extends Enum
{

    private static final LATEST_TRANSACTIONS $VALUES[];
    public static final LATEST_TRANSACTIONS ERROR;
    public static final LATEST_TRANSACTIONS INITIAL;
    public static final LATEST_TRANSACTIONS LATEST_TRANSACTIONS;
    public static final LATEST_TRANSACTIONS LOADING;
    public static final LATEST_TRANSACTIONS NO_TRANSACTIONS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INITIAL = new <init>("INITIAL", 0);
        LOADING = new <init>("LOADING", 1);
        ERROR = new <init>("ERROR", 2);
        NO_TRANSACTIONS = new <init>("NO_TRANSACTIONS", 3);
        LATEST_TRANSACTIONS = new <init>("LATEST_TRANSACTIONS", 4);
        $VALUES = (new .VALUES[] {
            INITIAL, LOADING, ERROR, NO_TRANSACTIONS, LATEST_TRANSACTIONS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
