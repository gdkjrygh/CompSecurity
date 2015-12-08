// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;

import ot;
import ou;

// Referenced classes of package com.snapchat.android.api2.cash.square.data:
//            CashCustomer

public class CashPayment
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action SEND;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            SEND = new Action("SEND");
            $VALUES = (new Action[] {
                SEND
            });
        }

        private Action(String s)
        {
            super(s, 0);
        }
    }

    public static final class CancellationReason extends Enum
    {

        private static final CancellationReason $VALUES[];
        public static final CancellationReason DECLINED;
        public static final CancellationReason EXPIRED_WAITING_ON_RECIPIENT;
        public static final CancellationReason EXPIRED_WAITING_ON_SENDER;
        public static final CancellationReason LIMIT_EXCEEDED;
        public static final CancellationReason OTHER;
        public static final CancellationReason RECIPIENT_CANCELED;
        public static final CancellationReason SENDER_CANCELED;
        public static final CancellationReason SQUARE_CANCELED;

        public static CancellationReason valueOf(String s)
        {
            return (CancellationReason)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$CancellationReason, s);
        }

        public static CancellationReason[] values()
        {
            return (CancellationReason[])$VALUES.clone();
        }

        static 
        {
            SENDER_CANCELED = new CancellationReason("SENDER_CANCELED", 0);
            RECIPIENT_CANCELED = new CancellationReason("RECIPIENT_CANCELED", 1);
            SQUARE_CANCELED = new CancellationReason("SQUARE_CANCELED", 2);
            LIMIT_EXCEEDED = new CancellationReason("LIMIT_EXCEEDED", 3);
            DECLINED = new CancellationReason("DECLINED", 4);
            OTHER = new CancellationReason("OTHER", 5);
            EXPIRED_WAITING_ON_SENDER = new CancellationReason("EXPIRED_WAITING_ON_SENDER", 6);
            EXPIRED_WAITING_ON_RECIPIENT = new CancellationReason("EXPIRED_WAITING_ON_RECIPIENT", 7);
            $VALUES = (new CancellationReason[] {
                SENDER_CANCELED, RECIPIENT_CANCELED, SQUARE_CANCELED, LIMIT_EXCEEDED, DECLINED, OTHER, EXPIRED_WAITING_ON_SENDER, EXPIRED_WAITING_ON_RECIPIENT
            });
        }

        private CancellationReason(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State CANCELED;
        public static final State COMPLETED;
        public static final State PENDING;
        public static final State WAITING_ON_RECIPIENT;
        public static final State WAITING_ON_SENDER;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashPayment$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            WAITING_ON_SENDER = new State("WAITING_ON_SENDER", 0);
            WAITING_ON_RECIPIENT = new State("WAITING_ON_RECIPIENT", 1);
            PENDING = new State("PENDING", 2);
            COMPLETED = new State("COMPLETED", 3);
            CANCELED = new State("CANCELED", 4);
            $VALUES = (new State[] {
                WAITING_ON_SENDER, WAITING_ON_RECIPIENT, PENDING, COMPLETED, CANCELED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private Action mAction;
    private ot mAmount;
    public ou mBlockers;
    public CancellationReason mCancellationReason;
    private String mCapturedAt;
    private String mCreatedAt;
    private String mId;
    private String mPaidOutAt;
    private String mReachedRecipientAt;
    private CashCustomer mRecipient;
    private String mRefundedAt;
    private CashCustomer mSender;
    public State mState;

    public CashPayment()
    {
    }

    public String toString()
    {
        return (new StringBuilder("CashPayment{mId='")).append(mId).append('\'').append(", mAction=").append(mAction).append(", mSender=").append(mSender).append(", mRecipient=").append(mRecipient).append(", mAmount=").append(mAmount).append(", mState=").append(mState).append(", mBlockers=").append(mBlockers).append(", mCancellationReason=").append(mCancellationReason).append(", mCreatedAt='").append(mCreatedAt).append('\'').append(", mCapturedAt='").append(mCapturedAt).append('\'').append(", mPaidOutAt='").append(mPaidOutAt).append('\'').append(", mRefundedAt='").append(mRefundedAt).append('\'').append('}').toString();
    }
}
