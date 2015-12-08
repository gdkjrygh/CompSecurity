// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Bt;
import Ks;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.StatefulChatFeedItem;

public final class CashUtils
{
    public static final class CurrencyCode extends Enum
    {

        private static final CurrencyCode $VALUES[];
        public static final CurrencyCode USD;

        public static CurrencyCode valueOf(String s)
        {
            return (CurrencyCode)Enum.valueOf(com/snapchat/android/util/CashUtils$CurrencyCode, s);
        }

        public static CurrencyCode[] values()
        {
            return (CurrencyCode[])$VALUES.clone();
        }

        static 
        {
            USD = new CurrencyCode("USD");
            $VALUES = (new CurrencyCode[] {
                USD
            });
        }

        private CurrencyCode(String s)
        {
            super(s, 0);
        }
    }


    private static final String TAG = "CashUtils";

    public static CashFeedItem a(ChatConversation chatconversation, CashFeedItem cashfeeditem, CashFeedItem cashfeeditem1)
    {
        if (cashfeeditem1 == null) goto _L2; else goto _L1
_L1:
        CashTransaction cashtransaction = cashfeeditem1.mCashTransaction;
        if (cashfeeditem == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (!((StatefulChatFeedItem) (cashfeeditem)).mSendReceiveStatus.equals(((StatefulChatFeedItem) (cashfeeditem1)).mSendReceiveStatus))
        {
            flag = true;
        } else
        if (!TextUtils.equals(cashfeeditem.mIterToken, cashfeeditem1.mIterToken))
        {
            flag = true;
        } else
        {
            chatconversation = cashfeeditem1.mCashTransaction;
            if (cashfeeditem.mCashTransaction.mIsInFlight != ((CashTransaction) (chatconversation)).mIsInFlight)
            {
                flag = true;
            } else
            if (!cashfeeditem.mCashTransaction.mTransactionStatus.equals(((CashTransaction) (chatconversation)).mTransactionStatus))
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mRecipientSaveVersion != ((CashTransaction) (chatconversation)).mRecipientSaveVersion || cashfeeditem.mCashTransaction.mIsSavedByRecipient != ((CashTransaction) (chatconversation)).mIsSavedByRecipient)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mIsViewedByRecipient != ((CashTransaction) (chatconversation)).mIsViewedByRecipient)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mSenderSaveVersion != ((CashTransaction) (chatconversation)).mSenderSaveVersion || cashfeeditem.mCashTransaction.mIsSavedBySender != ((CashTransaction) (chatconversation)).mIsSavedBySender)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mIsViewedBySender != ((CashTransaction) (chatconversation)).mIsViewedBySender)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mUpdatedTimestamp != ((CashTransaction) (chatconversation)).mUpdatedTimestamp)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mCreatedTimestamp != ((CashTransaction) (chatconversation)).mCreatedTimestamp)
            {
                flag = true;
            } else
            if (cashfeeditem.mCashTransaction.mIsFromServer != ((CashTransaction) (chatconversation)).mIsFromServer)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
_L10:
        if (flag) goto _L6; else goto _L5
_L5:
        chatconversation = null;
_L8:
        return chatconversation;
_L6:
        Timber.f("CashUtils", "CASH-LOG: Cash Item %s is being updated", new Object[] {
            cashfeeditem.d()
        });
        chatconversation = cashfeeditem.mCashTransaction;
        if (((CashTransaction) (chatconversation)).mTransactionStatus.equals(cashtransaction.mTransactionStatus))
        {
            if (Ks.a(cashfeeditem))
            {
                chatconversation.b(cashtransaction);
            } else
            {
                chatconversation.a(cashtransaction);
            }
        } else
        {
            chatconversation.a(cashtransaction.mTransactionStatus);
            chatconversation.a(cashtransaction);
            chatconversation.b(cashtransaction);
        }
        cashfeeditem.mSendReceiveStatus = ((StatefulChatFeedItem) (cashfeeditem1)).mSendReceiveStatus;
        chatconversation.mIsInFlight = cashtransaction.mIsInFlight;
        chatconversation.mIsFromServer = cashtransaction.mIsFromServer;
        chatconversation.mCreatedTimestamp = cashtransaction.mCreatedTimestamp;
        chatconversation.mUpdatedTimestamp = cashtransaction.mUpdatedTimestamp;
        chatconversation = cashfeeditem;
        if (cashfeeditem1.l() != null)
        {
            cashfeeditem.mIterToken = cashfeeditem1.l();
            return cashfeeditem;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        chatconversation.a(cashfeeditem1);
        return cashfeeditem1;
_L2:
        if (cashfeeditem == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Timber.f("CashUtils", "CASH-LOG: Cash Item is not found on server for %s ", new Object[] {
            cashfeeditem.d()
        });
        cashfeeditem1 = cashfeeditem.mCashTransaction;
        chatconversation = cashfeeditem;
        if (!((CashTransaction) (cashfeeditem1)).mTransactionStatus.equals(com.snapchat.android.model.CashTransaction.TransactionStatus.INITIATED))
        {
            if (((CashTransaction) (cashfeeditem1)).mTransactionStatus.equals(com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT))
            {
                cashfeeditem1.a(com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED);
            }
            cashfeeditem1.mIsViewedByRecipient = true;
            cashfeeditem1.mIsSavedByRecipient = false;
            cashfeeditem1.mIsViewedBySender = true;
            cashfeeditem1.mIsSavedBySender = false;
            return cashfeeditem;
        }
        if (true) goto _L8; else goto _L7
_L7:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static String a(int i)
    {
        if (i % 100 == 0)
        {
            return String.format("%d", new Object[] {
                Integer.valueOf(i / 100)
            });
        } else
        {
            return String.format("%.2f", new Object[] {
                Float.valueOf((float)i / 100F)
            });
        }
    }

    public static boolean a(TD.a a1)
    {
        return a1 != TD.a.NON_US_USER && a1 != TD.a.UNDER_AGE_LIMIT && a1 != TD.a.LOCKED_ACCOUNT && a1 != TD.a.SERVICE_NOT_AVAILABLE_TO_RECIPIENT;
    }

    public static boolean a(Friend friend)
    {
        return friend != null && Bt.aB() && a(Bt.aD()) && a(friend.o());
    }

    public static boolean a(String s, CashFeedItem cashfeeditem)
    {
        if (TextUtils.equals(s, cashfeeditem.j()))
        {
            if ((s = cashfeeditem.mCashTransaction.mTransactionStatus) == com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT || s == com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED)
            {
                return true;
            }
        }
        return false;
    }

    // Unreferenced inner class com/snapchat/android/util/CashUtils$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int $SwitchMap$com$snapchat$android$util$CashUtils$CurrencyCode[];

        static 
        {
            $SwitchMap$com$snapchat$android$util$CashUtils$CurrencyCode = new int[CurrencyCode.values().length];
            try
            {
                $SwitchMap$com$snapchat$android$util$CashUtils$CurrencyCode[CurrencyCode.USD.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }

}
