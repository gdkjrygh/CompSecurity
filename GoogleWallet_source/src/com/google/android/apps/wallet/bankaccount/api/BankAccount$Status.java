// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;


// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccount

public static final class  extends Enum
{

    private static final DECLINED $VALUES[];
    public static final DECLINED AWAITING_CHALLENGE_DEPOSIT;
    public static final DECLINED AWAITING_CHALLENGE_DEPOSIT_VERIFICATION;
    public static final DECLINED AWAITING_YODLEE_VERIFICATION;
    public static final DECLINED DECLINED;
    public static final DECLINED READY_TO_VERIFY;
    public static final DECLINED UNKNOWN;
    public static final DECLINED VALID;
    public static final DECLINED YODLEE_CHALLENGE_IN_PROGRESS;
    public static final DECLINED YODLEE_FAILED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/bankaccount/api/BankAccount$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        READY_TO_VERIFY = new <init>("READY_TO_VERIFY", 1);
        AWAITING_CHALLENGE_DEPOSIT = new <init>("AWAITING_CHALLENGE_DEPOSIT", 2);
        AWAITING_CHALLENGE_DEPOSIT_VERIFICATION = new <init>("AWAITING_CHALLENGE_DEPOSIT_VERIFICATION", 3);
        YODLEE_CHALLENGE_IN_PROGRESS = new <init>("YODLEE_CHALLENGE_IN_PROGRESS", 4);
        AWAITING_YODLEE_VERIFICATION = new <init>("AWAITING_YODLEE_VERIFICATION", 5);
        YODLEE_FAILED = new <init>("YODLEE_FAILED", 6);
        VALID = new <init>("VALID", 7);
        DECLINED = new <init>("DECLINED", 8);
        $VALUES = (new .VALUES[] {
            UNKNOWN, READY_TO_VERIFY, AWAITING_CHALLENGE_DEPOSIT, AWAITING_CHALLENGE_DEPOSIT_VERIFICATION, YODLEE_CHALLENGE_IN_PROGRESS, AWAITING_YODLEE_VERIFICATION, YODLEE_FAILED, VALID, DECLINED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
