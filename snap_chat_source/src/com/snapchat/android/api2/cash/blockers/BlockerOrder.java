// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.blockers;


public final class BlockerOrder extends Enum
{

    private static final BlockerOrder $VALUES[];
    public static final BlockerOrder LOCAL_SQ_ACCEPT_TERMS_BLOCKER;
    public static final BlockerOrder PHONE_NUMBER_BLOCKER;
    public static final BlockerOrder SEND_CONFIRMATION_BLOCKER;
    public static final BlockerOrder SQ_ACCEPT_TERMS_BLOCKER;
    public static final BlockerOrder SQ_ACCESS_TOKEN_BLOCKER;
    public static final BlockerOrder SQ_CARD_BLOCKER;
    public static final BlockerOrder SQ_CONFIRM_BLOCKER;
    public static final BlockerOrder SQ_CONFLICT_BLOCKER;
    public static final BlockerOrder SQ_IDENTITY_VERIFICATION_BLOCKER;
    public static final BlockerOrder SQ_INITIATE_PAYMENT_BLOCKER;
    public static final BlockerOrder SQ_INITIATION_CONFIRM_BLOCKER;
    public static final BlockerOrder SQ_PHONE_NUMBER_BLOCKER;
    public static final BlockerOrder SQ_RETRIEVE_RECEIVING_CASH_PAYMENT_BLOCKER;
    public static final BlockerOrder SQ_RETRIEVE_SENDING_CASH_PAYMENT_BLOCKER;
    public static final BlockerOrder SQ_UNLINK_CARD_BLOCKER;
    public static final BlockerOrder SQ_UPDATE_RECEIVED_CASH_PAYMENT_BLOCKER;
    public static final BlockerOrder SQ_URL_BLOCKER;
    public static final BlockerOrder UNDEFINED;
    public static final BlockerOrder VALIDATE_TRANSACTION_BLOCKER;

    private BlockerOrder(String s, int i)
    {
        super(s, i);
    }

    public static BlockerOrder valueOf(String s)
    {
        return (BlockerOrder)Enum.valueOf(com/snapchat/android/api2/cash/blockers/BlockerOrder, s);
    }

    public static BlockerOrder[] values()
    {
        return (BlockerOrder[])$VALUES.clone();
    }

    static 
    {
        UNDEFINED = new BlockerOrder("UNDEFINED", 0);
        SQ_UNLINK_CARD_BLOCKER = new BlockerOrder("SQ_UNLINK_CARD_BLOCKER", 1);
        SQ_INITIATE_PAYMENT_BLOCKER = new BlockerOrder("SQ_INITIATE_PAYMENT_BLOCKER", 2);
        SQ_CONFIRM_BLOCKER = new BlockerOrder("SQ_CONFIRM_BLOCKER", 3);
        SQ_URL_BLOCKER = new BlockerOrder("SQ_URL_BLOCKER", 4);
        SQ_IDENTITY_VERIFICATION_BLOCKER = new BlockerOrder("SQ_IDENTITY_VERIFICATION_BLOCKER", 5);
        SQ_ACCEPT_TERMS_BLOCKER = new BlockerOrder("SQ_ACCEPT_TERMS_BLOCKER", 6);
        SQ_PHONE_NUMBER_BLOCKER = new BlockerOrder("SQ_PHONE_NUMBER_BLOCKER", 7);
        SQ_UPDATE_RECEIVED_CASH_PAYMENT_BLOCKER = new BlockerOrder("SQ_UPDATE_RECEIVED_CASH_PAYMENT_BLOCKER", 8);
        SQ_RETRIEVE_RECEIVING_CASH_PAYMENT_BLOCKER = new BlockerOrder("SQ_RETRIEVE_RECEIVING_CASH_PAYMENT_BLOCKER", 9);
        SQ_RETRIEVE_SENDING_CASH_PAYMENT_BLOCKER = new BlockerOrder("SQ_RETRIEVE_SENDING_CASH_PAYMENT_BLOCKER", 10);
        VALIDATE_TRANSACTION_BLOCKER = new BlockerOrder("VALIDATE_TRANSACTION_BLOCKER", 11);
        SEND_CONFIRMATION_BLOCKER = new BlockerOrder("SEND_CONFIRMATION_BLOCKER", 12);
        SQ_INITIATION_CONFIRM_BLOCKER = new BlockerOrder("SQ_INITIATION_CONFIRM_BLOCKER", 13);
        SQ_CARD_BLOCKER = new BlockerOrder("SQ_CARD_BLOCKER", 14);
        SQ_CONFLICT_BLOCKER = new BlockerOrder("SQ_CONFLICT_BLOCKER", 15);
        SQ_ACCESS_TOKEN_BLOCKER = new BlockerOrder("SQ_ACCESS_TOKEN_BLOCKER", 16);
        PHONE_NUMBER_BLOCKER = new BlockerOrder("PHONE_NUMBER_BLOCKER", 17);
        LOCAL_SQ_ACCEPT_TERMS_BLOCKER = new BlockerOrder("LOCAL_SQ_ACCEPT_TERMS_BLOCKER", 18);
        $VALUES = (new BlockerOrder[] {
            UNDEFINED, SQ_UNLINK_CARD_BLOCKER, SQ_INITIATE_PAYMENT_BLOCKER, SQ_CONFIRM_BLOCKER, SQ_URL_BLOCKER, SQ_IDENTITY_VERIFICATION_BLOCKER, SQ_ACCEPT_TERMS_BLOCKER, SQ_PHONE_NUMBER_BLOCKER, SQ_UPDATE_RECEIVED_CASH_PAYMENT_BLOCKER, SQ_RETRIEVE_RECEIVING_CASH_PAYMENT_BLOCKER, 
            SQ_RETRIEVE_SENDING_CASH_PAYMENT_BLOCKER, VALIDATE_TRANSACTION_BLOCKER, SEND_CONFIRMATION_BLOCKER, SQ_INITIATION_CONFIRM_BLOCKER, SQ_CARD_BLOCKER, SQ_CONFLICT_BLOCKER, SQ_ACCESS_TOKEN_BLOCKER, PHONE_NUMBER_BLOCKER, LOCAL_SQ_ACCEPT_TERMS_BLOCKER
        });
    }
}
