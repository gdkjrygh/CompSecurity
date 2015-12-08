// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import BN;
import BO;
import Fd;
import IA;
import IC;
import Jl;
import Ks;
import Mf;
import Mp;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.CashFeedItemTable;
import com.snapchat.android.model.CashTransaction;
import com.squareup.otto.Bus;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import nn;
import np;
import sf;
import st;

// Referenced classes of package com.snapchat.android.model.chat:
//            StatefulChatFeedItem, ChatConversation

public class CashFeedItem extends StatefulChatFeedItem
    implements BN, BO, np.a
{
    public static final class BlockerResolutionState extends Enum
    {

        private static final BlockerResolutionState $VALUES[];
        public static final BlockerResolutionState INITIATED;
        public static final BlockerResolutionState INITIATING;
        public static final BlockerResolutionState PRE_CONFIRMATION;
        public static final BlockerResolutionState PRE_INITIATION;

        public static BlockerResolutionState valueOf(String s1)
        {
            return (BlockerResolutionState)Enum.valueOf(com/snapchat/android/model/chat/CashFeedItem$BlockerResolutionState, s1);
        }

        public static BlockerResolutionState[] values()
        {
            return (BlockerResolutionState[])$VALUES.clone();
        }

        static 
        {
            PRE_CONFIRMATION = new BlockerResolutionState("PRE_CONFIRMATION", 0);
            PRE_INITIATION = new BlockerResolutionState("PRE_INITIATION", 1);
            INITIATING = new BlockerResolutionState("INITIATING", 2);
            INITIATED = new BlockerResolutionState("INITIATED", 3);
            $VALUES = (new BlockerResolutionState[] {
                PRE_CONFIRMATION, PRE_INITIATION, INITIATING, INITIATED
            });
        }

        private BlockerResolutionState(String s1, int j)
        {
            super(s1, j);
        }
    }


    protected static final int MAX_NUM_OF_RETRIES_FOR_FAILURES = 3;
    private static final String TAG = com/snapchat/android/model/chat/CashFeedItem.getSimpleName();
    public final PriorityQueue mBlockerPriorityQueue = new Jl();
    public boolean mCanShowSparkle;
    public final CashTransaction mCashTransaction;
    private mX.a mContinueForwardListener;
    public boolean mHasSparkled;
    public boolean mIsRetriedByUser;
    public String mIterToken;
    private int mNumberOfFailedRetryAttempts;
    protected BlockerResolutionState mResolutionState;
    public String mSendingClientId;

    public CashFeedItem(CashTransaction cashtransaction)
    {
        super(cashtransaction.mSenderUsername, IA.a(cashtransaction.mRecipientUsername));
        mNumberOfFailedRetryAttempts = 0;
        mHasSparkled = false;
        mCanShowSparkle = false;
        if (cashtransaction.mIsInFlight)
        {
            mSendingClientId = cashtransaction.mTransactionId;
        }
        mCashTransaction = cashtransaction;
        if (!cashtransaction.mIsInFlight)
        {
            mResolutionState = BlockerResolutionState.INITIATED;
            if (Ks.a(this))
            {
                if (cashtransaction.mTransactionStatus == com.snapchat.android.model.CashTransaction.TransactionStatus.SENDER_CANCELED && !cashtransaction.mIsSavedBySender && !cashtransaction.mIsSavedByRecipient)
                {
                    super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.FAILED_NON_RECOVERABLE;
                    return;
                } else
                {
                    super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.SENT;
                    return;
                }
            } else
            {
                super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
                return;
            }
        } else
        {
            mResolutionState = BlockerResolutionState.PRE_CONFIRMATION;
            super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.SENDING;
            return;
        }
    }

    private int a(final boolean saved)
    {
        String s2 = TAG;
        String s1;
        final int originalVersion;
        if (saved)
        {
            s1 = "SAVING";
        } else
        {
            s1 = "UNSAVING";
        }
        Timber.b(s2, "CASH-LOG: %s cash id[%s] sender[%s] recipient[%s]", new Object[] {
            s1, mCashTransaction.mTransactionId, j(), ad()
        });
        if (Ks.a(this))
        {
            originalVersion = mCashTransaction.mSenderSaveVersion;
            if (!e() || mCashTransaction.mIsSavedBySender == saved)
            {
                return originalVersion;
            } else
            {
                final int modifiedVersion = originalVersion + 1;
                mCashTransaction.mIsSavedBySender = saved;
                mCashTransaction.mSenderSaveVersion = modifiedVersion;
                a(Boolean.valueOf(saved), Integer.valueOf(modifiedVersion), new nn.a() {

                    final CashFeedItem this$0;
                    final int val$modifiedVersion;
                    final int val$originalVersion;
                    final boolean val$saved;

                    public final void a()
                    {
                        String s4 = CashFeedItem.t();
                        String s3;
                        if (saved)
                        {
                            s3 = "SAVING";
                        } else
                        {
                            s3 = "UNSAVING";
                        }
                        Timber.b(s4, "CASH-LOG: SUCCEEDED %s cash id[%s] sender[%s] recipient[%s]", new Object[] {
                            s3, d(), j(), ad()
                        });
                        CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
                            CashFeedItem.this
                        }));
                    }

                    public final void a(int j)
                    {
                        String s3 = CashFeedItem.t();
                        Object obj;
                        if (saved)
                        {
                            obj = "SAVING";
                        } else
                        {
                            obj = "UNSAVING";
                        }
                        Timber.b(s3, "CASH-LOG: FAILED %s cash id[%s] sender[%s] recipient[%s] statusCode[%d]", new Object[] {
                            obj, d(), CashFeedItem.this.j(), ad(), Integer.valueOf(j)
                        });
                        if (CashFeedItem.a(CashFeedItem.this).mSenderSaveVersion == modifiedVersion)
                        {
                            obj = CashFeedItem.a(CashFeedItem.this);
                            boolean flag;
                            if (!saved)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            obj.mIsSavedBySender = flag;
                            CashFeedItem.a(CashFeedItem.this).mSenderSaveVersion = originalVersion;
                            CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
                                CashFeedItem.this
                            }));
                            Mf.a().a(new Mp(ac(), d()));
                        }
                    }

            
            {
                this$0 = CashFeedItem.this;
                saved = flag;
                modifiedVersion = j;
                originalVersion = k;
                super();
            }
                }).execute();
                return modifiedVersion;
            }
        }
        originalVersion = mCashTransaction.mRecipientSaveVersion;
        if (!e() || mCashTransaction.mIsSavedByRecipient == saved)
        {
            return originalVersion;
        } else
        {
            final int modifiedVersion = originalVersion + 1;
            mCashTransaction.mIsSavedByRecipient = saved;
            mCashTransaction.mRecipientSaveVersion = modifiedVersion;
            a(Boolean.valueOf(saved), Integer.valueOf(modifiedVersion), new nn.a() {

                final CashFeedItem this$0;
                final int val$modifiedVersion;
                final int val$originalVersion;
                final boolean val$saved;

                public final void a()
                {
                    String s4 = CashFeedItem.t();
                    String s3;
                    if (saved)
                    {
                        s3 = "SAVING";
                    } else
                    {
                        s3 = "UNSAVING";
                    }
                    Timber.b(s4, "CASH-LOG: SUCCEEDED %s cash id[%s] sender[%s] recipient[%s]", new Object[] {
                        s3, d(), j(), ad()
                    });
                    CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
                        CashFeedItem.this
                    }));
                }

                public final void a(int j)
                {
                    String s3 = CashFeedItem.t();
                    Object obj;
                    if (saved)
                    {
                        obj = "SAVING";
                    } else
                    {
                        obj = "UNSAVING";
                    }
                    Timber.b(s3, "CASH-LOG: FAILED %s cash id[%s] sender[%s] recipient[%s] statusCode[%d]", new Object[] {
                        obj, d(), CashFeedItem.this.j(), ad(), Integer.valueOf(j)
                    });
                    if (CashFeedItem.a(CashFeedItem.this).mRecipientSaveVersion == modifiedVersion)
                    {
                        obj = CashFeedItem.a(CashFeedItem.this);
                        boolean flag;
                        if (!saved)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        obj.mIsSavedByRecipient = flag;
                        CashFeedItem.a(CashFeedItem.this).mRecipientSaveVersion = originalVersion;
                        CashFeedItemTable.a(SnapchatApplication.get(), Arrays.asList(new CashFeedItem[] {
                            CashFeedItem.this
                        }));
                        Mf.a().a(new Mp(ac(), d()));
                    }
                }

            
            {
                this$0 = CashFeedItem.this;
                saved = flag;
                modifiedVersion = j;
                originalVersion = k;
                super();
            }
            }).execute();
            return modifiedVersion;
        }
    }

    static CashTransaction a(CashFeedItem cashfeeditem)
    {
        return cashfeeditem.mCashTransaction;
    }

    private nn a(Boolean boolean1, Integer integer, nn.a a1)
    {
        return new nn(mCashTransaction.mTransactionId, ac(), boolean1, integer, a1);
    }

    private void a(Context context, StatefulChatFeedItem.SendReceiveStatus sendreceivestatus)
    {
        super.mSendReceiveStatus = sendreceivestatus;
        CashFeedItemTable.a(context, IA.a(this));
    }

    private void a(List list, boolean flag)
    {
        if (list != null)
        {
            Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] ADDING NEW blockers %s", new Object[] {
                mCashTransaction.mTransactionId, j(), ad(), list
            });
            mBlockerPriorityQueue.addAll(list);
        }
        if (mBlockerPriorityQueue.isEmpty() || flag)
        {
            Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] CONTINUING blocker resolution continueResolution[%s]", new Object[] {
                mCashTransaction.mTransactionId, j(), ad(), String.valueOf(flag)
            });
            w();
            return;
        }
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] FAILING because continueResolution is false and blockers remain", new Object[] {
            mCashTransaction.mTransactionId, j(), ad()
        });
        if (Ks.a(this))
        {
            a(((Context) (SnapchatApplication.get())), StatefulChatFeedItem.SendReceiveStatus.FAILED);
            st.a(this);
        } else
        {
            super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
        }
        b(false);
    }

    private void b(boolean flag)
    {
        mX.a a1;
label0:
        {
            if (mContinueForwardListener != null)
            {
                a1 = mContinueForwardListener;
                mContinueForwardListener = null;
                if (!flag)
                {
                    break label0;
                }
                a1.a();
            }
            return;
        }
        a1.b();
    }

    static String t()
    {
        return TAG;
    }

    private boolean u()
    {
        com.snapchat.android.model.CashTransaction.TransactionStatus transactionstatus = mCashTransaction.mTransactionStatus;
        return transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.CANCELED || transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.RECIPIENT_CANCELED || transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.SENDER_CANCELED;
    }

    private boolean v()
    {
        return mCashTransaction.mTransactionStatus == com.snapchat.android.model.CashTransaction.TransactionStatus.EXPIRED;
    }

    private void w()
    {
        if (!mBlockerPriorityQueue.isEmpty())
        {
            np np1 = (np)mBlockerPriorityQueue.peek();
            Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] continueBlockerResolution attempting to resolve next blocker %s", new Object[] {
                mCashTransaction.mTransactionId, j(), ad(), np1.getClass().getSimpleName()
            });
            np1.mListener = this;
            np1.a(mCashTransaction);
            return;
        }
        if (!Ks.a(this))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        public static final class _cls3
        {

            public static final int $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[];
            static final int $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[];

            static 
            {
                $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState = new int[BlockerResolutionState.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[BlockerResolutionState.PRE_CONFIRMATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[BlockerResolutionState.PRE_INITIATION.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[BlockerResolutionState.INITIATING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$CashFeedItem$BlockerResolutionState[BlockerResolutionState.INITIATED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus = new int[com.snapchat.android.model.CashTransaction.TransactionStatus.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.INITIATED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.EXPIRED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.CANCELED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.RECIPIENT_CANCELED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$CashTransaction$TransactionStatus[com.snapchat.android.model.CashTransaction.TransactionStatus.SENDER_CANCELED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.snapchat.android.model.chat.CashFeedItem.BlockerResolutionState[mResolutionState.ordinal()];
        JVM INSTR tableswitch 1 4: default 132
    //                   1 185
    //                   2 195
    //                   3 205
    //                   4 212;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] RESOLUTION STATE set to %s", new Object[] {
            mCashTransaction.mTransactionId, j(), ad(), mResolutionState.name()
        });
_L6:
        b(true);
        return;
_L2:
        mResolutionState = BlockerResolutionState.PRE_INITIATION;
          goto _L1
_L3:
        mResolutionState = BlockerResolutionState.INITIATING;
          goto _L1
_L4:
        mResolutionState = BlockerResolutionState.INITIATED;
_L5:
        a(SnapchatApplication.get(), StatefulChatFeedItem.SendReceiveStatus.SENT);
          goto _L1
        mCashTransaction.a(com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED);
        a(SnapchatApplication.get(), StatefulChatFeedItem.SendReceiveStatus.RECEIVED);
          goto _L6
    }

    public final long W()
    {
        return mCashTransaction.mCreatedTimestamp;
    }

    public final long Y()
    {
        return mCashTransaction.mUpdatedTimestamp;
    }

    public final Fd a(View view, ChatConversation chatconversation)
    {
        int k = 0x7f020032;
        if (!R()) goto _L2; else goto _L1
_L1:
        int j = 0x7f02013f;
_L4:
        return new Fd(j);
_L2:
        if (aq())
        {
            j = k;
            if (Ks.a(this))
            {
                j = k;
                if (!v())
                {
                    j = k;
                    if (!u())
                    {
                        j = 0x7f02003f;
                    }
                }
            }
        } else
        if (u() && !i())
        {
            j = 0x7f020034;
        } else
        if (Ks.a(this))
        {
            if (v())
            {
                j = 0x7f020034;
            } else
            {
                j = 0x7f020043;
            }
        } else
        {
            j = k;
            if (!v())
            {
                j = k;
                if (!i())
                {
                    j = 0x7f020033;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a()
    {
        if (Ks.a(this))
        {
            if (R() && T())
            {
                return IC.a(null, 0x7f08012f, new Object[0]);
            }
            if (p())
            {
                return IC.a(null, 0x7f08012e, new Object[0]);
            }
            if ((v() || u()) && !i())
            {
                return IC.a(null, 0x7f0802cb, new Object[0]);
            } else
            {
                return IC.a(null, 0x7f080254, new Object[0]);
            }
        }
        if (u() && !i())
        {
            return IC.a(null, 0x7f0802cb, new Object[0]);
        } else
        {
            return super.a();
        }
    }

    public final void a(Collection collection)
    {
        mBlockerPriorityQueue.addAll(collection);
    }

    public final void a(mX.a a1)
    {
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] STARTING blocker resolution", new Object[] {
            mCashTransaction.mTransactionId, j(), ad()
        });
        mContinueForwardListener = a1;
        w();
    }

    public final void a(np np1)
    {
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] onDismiss %s", new Object[] {
            mCashTransaction.mTransactionId, j(), ad(), np1.getClass().getSimpleName()
        });
        if (Ks.a(this))
        {
            a(((Context) (SnapchatApplication.get())), StatefulChatFeedItem.SendReceiveStatus.FAILED);
        } else
        {
            super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
        }
        b(false);
        mBlockerPriorityQueue.clear();
    }

    public final void a(np np1, List list, boolean flag)
    {
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] onResolve REMOVING blocker %s", new Object[] {
            mCashTransaction.mTransactionId, j(), ad(), np1.getClass().getSimpleName()
        });
        mBlockerPriorityQueue.remove(np1);
        a(list, flag);
    }

    public final String an()
    {
        String s2 = mCashTransaction.mMessage;
        String s1 = s2;
        if (!TextUtils.isEmpty(s2))
        {
            s1 = s2;
            if (sf.a(s2.trim()))
            {
                s1 = s2;
                if (s2.substring(1, s2.length() - 1).equals(mCashTransaction.a()))
                {
                    s1 = null;
                }
            }
        }
        return s1;
    }

    public final Spannable ao()
    {
        String s1 = an();
        if (s1 != null)
        {
            return new SpannableString(s1);
        } else
        {
            return null;
        }
    }

    public final boolean aq()
    {
        com.snapchat.android.model.CashTransaction.TransactionStatus transactionstatus = mCashTransaction.mTransactionStatus;
        if (transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT)
        {
            return false;
        }
        if (transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.EXPIRED || transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.CANCELED || transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.RECIPIENT_CANCELED || transactionstatus == com.snapchat.android.model.CashTransaction.TransactionStatus.SENDER_CANCELED)
        {
            return i();
        } else
        {
            return mCashTransaction.mIsViewedByRecipient;
        }
    }

    public final int b(ChatConversation chatconversation)
    {
        chatconversation = ChatFeedItem.FeedIconPriority.MOST_RECENT;
        if (!R() || !T()) goto _L2; else goto _L1
_L1:
        chatconversation = ChatFeedItem.FeedIconPriority.FAILED;
_L4:
        return chatconversation.ordinal();
_L2:
        if (Q())
        {
            chatconversation = ChatFeedItem.FeedIconPriority.SENDING;
        } else
        if (!i())
        {
            chatconversation = ChatFeedItem.FeedIconPriority.NEW;
        } else
        if (System.currentTimeMillis() - mCashTransaction.mCreatedTimestamp < 1000L)
        {
            chatconversation = ChatFeedItem.FeedIconPriority.RECENTLY_SENT;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String b()
    {
        return null;
    }

    public final void b(np np1)
    {
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] onHardFailure %s", new Object[] {
            mCashTransaction.mTransactionId, j(), ad(), np1.getClass().getSimpleName()
        });
        a(SnapchatApplication.get(), StatefulChatFeedItem.SendReceiveStatus.FAILED_NON_RECOVERABLE);
        b(false);
        mBlockerPriorityQueue.clear();
    }

    public final void b(np np1, List list, boolean flag)
    {
        Timber.b(TAG, "CASH-LOG: CashFeedItem id[%s] sender[%s] recipient[%s] onFailure %s", new Object[] {
            mCashTransaction.mTransactionId, j(), ad(), np1.getClass().getSimpleName()
        });
        boolean flag1 = flag;
        if (flag)
        {
            if (mNumberOfFailedRetryAttempts >= 3)
            {
                mNumberOfFailedRetryAttempts = 0;
                flag1 = false;
            } else
            {
                mNumberOfFailedRetryAttempts = mNumberOfFailedRetryAttempts + 1;
                flag1 = flag;
            }
        }
        a(list, flag1);
    }

    public final boolean c()
    {
        return R();
    }

    public final String d()
    {
        return mCashTransaction.mTransactionId;
    }

    public final boolean e()
    {
label0:
        {
            boolean flag1 = false;
            if (!q() && !r())
            {
                boolean flag;
                if (super.mSendReceiveStatus == StatefulChatFeedItem.SendReceiveStatus.RECEIVING)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof CashFeedItem)
        {
            obj = (CashFeedItem)obj;
            String s1 = mSendingClientId;
            if (s1 != null && TextUtils.equals(s1, ((CashFeedItem) (obj)).mSendingClientId))
            {
                return true;
            } else
            {
                return TextUtils.equals(mCashTransaction.mTransactionId, ((CashFeedItem) (obj)).mCashTransaction.mTransactionId);
            }
        } else
        {
            return false;
        }
    }

    public final boolean f()
    {
        return mCashTransaction.mIsSavedBySender || mCashTransaction.mIsSavedByRecipient;
    }

    public final boolean g()
    {
        if (Ks.a(this))
        {
            return mCashTransaction.mIsSavedBySender;
        } else
        {
            return mCashTransaction.mIsSavedByRecipient;
        }
    }

    public final boolean h()
    {
        if (Ks.a(this))
        {
            mCashTransaction.mIsViewedBySender = true;
            return true;
        }
        if (mCashTransaction.mTransactionStatus != com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT)
        {
            mCashTransaction.mIsViewedByRecipient = true;
            return true;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return mCashTransaction.mTransactionId.hashCode();
    }

    public final boolean i()
    {
        if (Ks.a(this))
        {
            return mCashTransaction.mIsViewedBySender;
        } else
        {
            return mCashTransaction.mIsViewedByRecipient;
        }
    }

    public final String l()
    {
        return mIterToken;
    }

    public final int m()
    {
        return a(true);
    }

    public final int n()
    {
        return a(false);
    }

    public final boolean o()
    {
        return false;
    }

    public final void s()
    {
        mNumberOfFailedRetryAttempts = 0;
        mBlockerPriorityQueue.clear();
        mResolutionState = BlockerResolutionState.INITIATING;
        super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.SENDING;
        mIsRetriedByUser = true;
        st.a(this);
        Mf.a().a(new Mp(ac()));
    }

    public String toString()
    {
        String s1 = mCashTransaction.mMessage;
        StringBuilder stringbuilder = (new StringBuilder("CashFeedItem{mId=")).append(mCashTransaction.mTransactionId).append(", mSenderUsername=").append(mCashTransaction.mSenderUsername).append(", mRecipientUsername=").append(mCashTransaction.mRecipientUsername).append(", mMessage=");
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.substring(0, Math.min(3, s1.length()));
        }
        return stringbuilder.append(s1).append(", mAmount=").append(mCashTransaction.a()).append(", mSendReceiveStatus=").append(super.mSendReceiveStatus).append(", mTransactionStatus=").append(mCashTransaction.mTransactionStatus).append(", mResolutionState=").append(mResolutionState).append('}').toString();
    }

}
