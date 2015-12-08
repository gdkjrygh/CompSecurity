// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import IJ;
import Ks;
import Qh;
import com.snapchat.android.Timber;
import java.util.UUID;

public class CashTransaction
{
    public static final class TransactionStatus extends Enum
    {

        private static final TransactionStatus $VALUES[];
        public static final TransactionStatus CANCELED;
        public static final TransactionStatus COMPLETED;
        public static final TransactionStatus EXPIRED;
        public static final TransactionStatus INITIATED;
        public static final TransactionStatus RECIPIENT_CANCELED;
        public static final TransactionStatus SENDER_CANCELED;
        public static final TransactionStatus WAITING_ON_RECIPIENT;

        public static TransactionStatus valueOf(String s)
        {
            return (TransactionStatus)Enum.valueOf(com/snapchat/android/model/CashTransaction$TransactionStatus, s);
        }

        public static TransactionStatus[] values()
        {
            return (TransactionStatus[])$VALUES.clone();
        }

        static 
        {
            INITIATED = new TransactionStatus("INITIATED", 0);
            WAITING_ON_RECIPIENT = new TransactionStatus("WAITING_ON_RECIPIENT", 1);
            COMPLETED = new TransactionStatus("COMPLETED", 2);
            EXPIRED = new TransactionStatus("EXPIRED", 3);
            CANCELED = new TransactionStatus("CANCELED", 4);
            RECIPIENT_CANCELED = new TransactionStatus("RECIPIENT_CANCELED", 5);
            SENDER_CANCELED = new TransactionStatus("SENDER_CANCELED", 6);
            $VALUES = (new TransactionStatus[] {
                INITIATED, WAITING_ON_RECIPIENT, COMPLETED, EXPIRED, CANCELED, RECIPIENT_CANCELED, SENDER_CANCELED
            });
        }

        private TransactionStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a
    {

        private int mAmount;
        public String mCashRecipientId;
        public String mCashSenderId;
        public long mCreatedAt;
        public com.snapchat.android.util.CashUtils.CurrencyCode mCurrencyCode;
        public boolean mFromRain;
        public String mId;
        public boolean mIsFromServer;
        public String mMessage;
        public String mProvider;
        private String mRecipient;
        private String mSender;
        public TransactionStatus mStatus;
        public long mUpdatedAt;

        public static CashTransaction a(Qh qh)
        {
            Object obj = new a(qh.c(), qh.e(), IJ.a(qh.f()));
            obj.mId = qh.a();
            obj.mCashSenderId = qh.b();
            obj.mCashRecipientId = qh.d();
            obj.mCurrencyCode = com.snapchat.android.util.CashUtils.CurrencyCode.valueOf(qh.g());
            obj.mMessage = qh.h();
            obj.mCreatedAt = IJ.a(qh.i());
            obj.mUpdatedAt = IJ.a(qh.j());
            obj.mProvider = qh.s();
            obj.mIsFromServer = true;
            obj.mFromRain = IJ.a(qh.r());
            int i = IJ.a(qh.k());
            if (i >= 0 && i < TransactionStatus.values().length)
            {
                obj.mStatus = TransactionStatus.values()[i];
            }
            obj = ((a) (obj)).a();
            CashTransaction.c(((CashTransaction) (obj)), IJ.a(qh.l()));
            CashTransaction.d(((CashTransaction) (obj)), IJ.a(qh.m()));
            CashTransaction.e(((CashTransaction) (obj)), IJ.a(qh.n()));
            CashTransaction.a(((CashTransaction) (obj)), IJ.a(qh.o()));
            CashTransaction.f(((CashTransaction) (obj)), IJ.a(qh.p()));
            CashTransaction.b(((CashTransaction) (obj)), IJ.a(qh.q()));
            return ((CashTransaction) (obj));
        }

        public final CashTransaction a()
        {
            CashTransaction cashtransaction = new CashTransaction(mSender, mRecipient, mAmount, (byte)0);
            if (mId == null)
            {
                mId = UUID.randomUUID().toString();
                cashtransaction.mIsInFlight = true;
            }
            cashtransaction.mTransactionId = mId;
            CashTransaction.a(cashtransaction, mCashSenderId);
            CashTransaction.b(cashtransaction, mCashRecipientId);
            CashTransaction.c(cashtransaction, mMessage);
            CashTransaction.a(cashtransaction, mCurrencyCode);
            CashTransaction.a(cashtransaction, mFromRain);
            CashTransaction.a(cashtransaction, mCreatedAt);
            CashTransaction.b(cashtransaction, mUpdatedAt);
            CashTransaction.c(cashtransaction);
            CashTransaction.a(cashtransaction, mStatus);
            CashTransaction.d(cashtransaction, mProvider);
            CashTransaction.b(cashtransaction, mIsFromServer);
            return cashtransaction;
        }

        public a(String s, String s1, int i)
        {
            mSender = s;
            mRecipient = s1;
            mAmount = i;
            mCurrencyCode = com.snapchat.android.util.CashUtils.CurrencyCode.USD;
            mCreatedAt = System.currentTimeMillis();
            mUpdatedAt = mCreatedAt;
            mStatus = TransactionStatus.INITIATED;
        }
    }


    private static final String TAG = com/snapchat/android/model/CashTransaction.getSimpleName();
    public int mAmount;
    public String mCashRecipientId;
    public String mCashSenderId;
    public String mConversationId;
    public long mCreatedTimestamp;
    public com.snapchat.android.util.CashUtils.CurrencyCode mCurrencyCode;
    public boolean mFailToSendReleaseMessage;
    public boolean mFromRain;
    public boolean mIsFromServer;
    public boolean mIsInFlight;
    private boolean mIsInvisible;
    public boolean mIsSavedByRecipient;
    public boolean mIsSavedBySender;
    public boolean mIsViewedByRecipient;
    public boolean mIsViewedBySender;
    public String mMessage;
    public String mProvider;
    public String mRecipientBankStatementMessage;
    public int mRecipientSaveVersion;
    public String mRecipientUsername;
    public String mSecurityCode;
    public String mSenderBankStatementMessage;
    public int mSenderSaveVersion;
    public String mSenderUsername;
    public String mSignature;
    public String mTransactionId;
    public TransactionStatus mTransactionStatus;
    public long mUpdatedTimestamp;

    private CashTransaction(String s, String s1, int i)
    {
        mFailToSendReleaseMessage = false;
        mSenderUsername = s;
        mRecipientUsername = s1;
        mAmount = i;
        mConversationId = Ks.a(mSenderUsername, mRecipientUsername);
    }

    CashTransaction(String s, String s1, int i, byte byte0)
    {
        this(s, s1, i);
    }

    static int a(CashTransaction cashtransaction, int i)
    {
        cashtransaction.mSenderSaveVersion = i;
        return i;
    }

    static long a(CashTransaction cashtransaction, long l)
    {
        cashtransaction.mCreatedTimestamp = l;
        return l;
    }

    static TransactionStatus a(CashTransaction cashtransaction, TransactionStatus transactionstatus)
    {
        cashtransaction.mTransactionStatus = transactionstatus;
        return transactionstatus;
    }

    static com.snapchat.android.util.CashUtils.CurrencyCode a(CashTransaction cashtransaction, com.snapchat.android.util.CashUtils.CurrencyCode currencycode)
    {
        cashtransaction.mCurrencyCode = currencycode;
        return currencycode;
    }

    static String a(CashTransaction cashtransaction, String s)
    {
        cashtransaction.mCashSenderId = s;
        return s;
    }

    static boolean a(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mFromRain = flag;
        return flag;
    }

    static int b(CashTransaction cashtransaction, int i)
    {
        cashtransaction.mRecipientSaveVersion = i;
        return i;
    }

    static long b(CashTransaction cashtransaction, long l)
    {
        cashtransaction.mUpdatedTimestamp = l;
        return l;
    }

    static String b(CashTransaction cashtransaction, String s)
    {
        cashtransaction.mCashRecipientId = s;
        return s;
    }

    static boolean b(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mIsFromServer = flag;
        return flag;
    }

    static String c(CashTransaction cashtransaction, String s)
    {
        cashtransaction.mMessage = s;
        return s;
    }

    static boolean c(CashTransaction cashtransaction)
    {
        cashtransaction.mIsInvisible = false;
        return false;
    }

    static boolean c(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mIsViewedBySender = flag;
        return flag;
    }

    static String d(CashTransaction cashtransaction, String s)
    {
        cashtransaction.mProvider = s;
        return s;
    }

    static boolean d(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mIsViewedByRecipient = flag;
        return flag;
    }

    static boolean e(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mIsSavedBySender = flag;
        return flag;
    }

    static boolean f(CashTransaction cashtransaction, boolean flag)
    {
        cashtransaction.mIsSavedByRecipient = flag;
        return flag;
    }

    public final String a()
    {
        if (mAmount % 100 == 0)
        {
            return String.format("%d", new Object[] {
                Integer.valueOf(mAmount / 100)
            });
        } else
        {
            return String.format("%.2f", new Object[] {
                Float.valueOf((float)mAmount / 100F)
            });
        }
    }

    public final void a(TransactionStatus transactionstatus)
    {
        Timber.b(TAG, "CASH-LOG: SETTING transaction status to %s id[%s] sender[%s] recipient[%s] amount[%s]", new Object[] {
            transactionstatus.name(), mTransactionId, mSenderUsername, mRecipientUsername, a()
        });
        mTransactionStatus = transactionstatus;
    }

    public final void a(CashTransaction cashtransaction)
    {
        mIsViewedBySender = cashtransaction.mIsViewedBySender;
        if (mSenderSaveVersion < cashtransaction.mSenderSaveVersion)
        {
            mIsSavedBySender = cashtransaction.mIsSavedBySender;
            mSenderSaveVersion = cashtransaction.mSenderSaveVersion;
        }
    }

    public final void b(CashTransaction cashtransaction)
    {
        mIsViewedByRecipient = cashtransaction.mIsViewedByRecipient;
        if (mRecipientSaveVersion < cashtransaction.mRecipientSaveVersion)
        {
            mIsSavedByRecipient = cashtransaction.mIsSavedByRecipient;
            mRecipientSaveVersion = cashtransaction.mRecipientSaveVersion;
        }
    }

}
