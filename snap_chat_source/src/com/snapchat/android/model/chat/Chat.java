// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import BN;
import BO;
import Bt;
import Fd;
import IA;
import IJ;
import Jh;
import Ks;
import Qm;
import RP;
import RQ;
import RR;
import Rl;
import Sm;
import android.app.Application;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.snapchat.android.SnapchatApplication;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.snapchat.android.model.chat:
//            StatefulChatFeedItem, ChatConversation

public abstract class Chat extends StatefulChatFeedItem
    implements BN, BO
{
    public static final class LoadingState extends Enum
    {

        private static final LoadingState $VALUES[];
        public static final LoadingState LOADED;
        public static final LoadingState LOADING;
        public static final LoadingState NOT_LOADED;

        public static LoadingState valueOf(String s1)
        {
            return (LoadingState)Enum.valueOf(com/snapchat/android/model/chat/Chat$LoadingState, s1);
        }

        public static LoadingState[] values()
        {
            return (LoadingState[])$VALUES.clone();
        }

        static 
        {
            NOT_LOADED = new LoadingState("NOT_LOADED", 0);
            LOADING = new LoadingState("LOADING", 1);
            LOADED = new LoadingState("LOADED", 2);
            $VALUES = (new LoadingState[] {
                NOT_LOADED, LOADING, LOADED
            });
        }

        private LoadingState(String s1, int j)
        {
            super(s1, j);
        }
    }

    public static class a
    {

        String id;
        String recipient;
        String sender;

        public a(String s1, String s2)
        {
            id = UUID.randomUUID().toString();
            sender = s1;
            recipient = s2;
        }
    }


    private static final String TAG = com/snapchat/android/model/chat/Chat.getSimpleName();
    public String mAckId;
    protected Qm mChatMessage;
    public long mDisplayedTimestamp;
    public String mId;
    public boolean mIsDisplayedToRecipient;
    public boolean mIsPreserved;
    public boolean mIsReleasedByRecipient;
    public boolean mIsSavedByRecipient;
    public boolean mIsSavedBySender;
    protected String mIterToken;
    protected LoadingState mLoadingState;
    protected int mRecipientMessageStateVersionNumber;
    protected int mReleaseDelay;
    public long mReleasedTimestamp;
    protected int mSenderMessageStateVersionNumber;
    public long mSeqNum;
    public String mStatusText;
    public Long mTimestamp;
    public String mUserText;

    public Chat(Qm qm)
    {
        this(qm.h().a(), qm.h().b(), qm.g());
        mId = qm.c();
        mUserText = qm.a().g();
        Object obj = qm.d();
        if (obj != null)
        {
            if (((Map) (obj)).containsKey(j()))
            {
                Sm sm = (Sm)((Map) (obj)).get(j());
                mIsSavedBySender = IJ.a(sm.a());
                mSenderMessageStateVersionNumber = IJ.a(sm.b());
            }
            if (((Map) (obj)).containsKey(ad()) && !G())
            {
                obj = (Sm)((Map) (obj)).get(ad());
                mIsSavedByRecipient = IJ.a(((Sm) (obj)).a());
                mRecipientMessageStateVersionNumber = IJ.a(((Sm) (obj)).b());
            }
        }
        obj = qm.e();
        if (obj != null)
        {
            mIsPreserved = ((Map) (obj)).containsValue(Boolean.TRUE);
        }
        mSeqNum = qm.f().longValue();
        if (Ks.a(this))
        {
            super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.SENT;
        } else
        {
            super.mSendReceiveStatus = StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
        }
        mLoadingState = LoadingState.NOT_LOADED;
    }

    public Chat(a a1)
    {
        this(a1.sender, a1.recipient, Long.valueOf(System.currentTimeMillis()));
        mId = a1.id;
        mLoadingState = LoadingState.NOT_LOADED;
    }

    public Chat(String s1, String s2, Long long1)
    {
        this(s1, IA.a(s2), long1);
        mLoadingState = LoadingState.NOT_LOADED;
    }

    private Chat(String s1, List list, Long long1)
    {
        super(s1, list);
        mReleaseDelay = 0;
        mTimestamp = long1;
        mLoadingState = LoadingState.NOT_LOADED;
    }

    private boolean G()
    {
        return TextUtils.equals(j(), ad());
    }

    public final boolean A()
    {
        return mIsSavedByRecipient;
    }

    public final long B()
    {
        return mReleasedTimestamp;
    }

    public final boolean C()
    {
        return mIsDisplayedToRecipient;
    }

    public final long D()
    {
        return mDisplayedTimestamp;
    }

    public final int E()
    {
        return mReleaseDelay;
    }

    public final long W()
    {
        return mTimestamp.longValue();
    }

    public final long Y()
    {
        if (mIsReleasedByRecipient)
        {
            return mReleasedTimestamp;
        } else
        {
            return mTimestamp.longValue();
        }
    }

    public Fd a(View view, ChatConversation chatconversation)
    {
        if (R())
        {
            return new Fd(0x7f02013f);
        }
        if (Ks.a(this))
        {
            if (Q())
            {
                return new Fd(0x7f02003d);
            }
            if (mIsReleasedByRecipient)
            {
                return new Fd(0x7f02003e);
            } else
            {
                return new Fd(0x7f020042);
            }
        }
        if (mIsReleasedByRecipient)
        {
            return new Fd(0x7f020035);
        } else
        {
            return new Fd(0x7f020046);
        }
    }

    public String a()
    {
        if (q())
        {
            int j;
            if (mIsReleasedByRecipient)
            {
                j = 0x7f0801be;
            } else
            {
                j = 0x7f0800fd;
            }
            return SnapchatApplication.get().getResources().getString(j);
        } else
        {
            return super.a();
        }
    }

    public final void a(int j)
    {
        mSenderMessageStateVersionNumber = j;
    }

    public final void a(long l1)
    {
        mIsReleasedByRecipient = true;
        mReleasedTimestamp = l1;
    }

    public final void a(Qm qm)
    {
        mChatMessage = qm;
    }

    public final void a(RQ rq, boolean flag)
    {
        if (rq.h().a().equals(j()))
        {
            return;
        } else
        {
            mIsPreserved = rq.b().booleanValue() ^ flag;
            return;
        }
    }

    public final void a(RR rr, boolean flag)
    {
        String s1;
        String s2;
        int j;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        s1 = rr.h().a();
        j = rr.c().intValue();
        rr = rr.b();
        s2 = RR.a.SAVED.name().toLowerCase(Locale.ENGLISH);
        if (!s1.equals(j())) goto _L2; else goto _L1
_L1:
        if (j <= mSenderMessageStateVersionNumber) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        mIsSavedBySender = TextUtils.equals(rr, s2);
        mSenderMessageStateVersionNumber = j;
_L4:
        return;
_L6:
        if (!TextUtils.equals(rr, s2))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIsSavedBySender = flag;
        mSenderMessageStateVersionNumber = j + 1;
        return;
_L2:
        if (j > mRecipientMessageStateVersionNumber)
        {
            if (flag)
            {
                mIsSavedByRecipient = TextUtils.equals(rr, s2);
                mRecipientMessageStateVersionNumber = j;
                return;
            }
            if (!TextUtils.equals(rr, s2))
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            mIsSavedByRecipient = flag;
            mRecipientMessageStateVersionNumber = j + 1;
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void a(LoadingState loadingstate)
    {
        mLoadingState = loadingstate;
    }

    public void a(Chat chat)
    {
        if (chat.mSenderMessageStateVersionNumber > mSenderMessageStateVersionNumber)
        {
            mIsSavedBySender = chat.mIsSavedBySender;
            mSenderMessageStateVersionNumber = chat.mSenderMessageStateVersionNumber;
        }
        if (chat.mRecipientMessageStateVersionNumber > mRecipientMessageStateVersionNumber && !G())
        {
            mIsSavedByRecipient = chat.mIsSavedByRecipient;
            mRecipientMessageStateVersionNumber = chat.mRecipientMessageStateVersionNumber;
        }
        mTimestamp = chat.mTimestamp;
        super.mSendReceiveStatus = ((StatefulChatFeedItem) (chat)).mSendReceiveStatus;
        if (!mIsReleasedByRecipient)
        {
            mIsReleasedByRecipient = chat.mIsReleasedByRecipient;
            mReleasedTimestamp = chat.mReleasedTimestamp;
        }
        if (!mIsDisplayedToRecipient)
        {
            mIsDisplayedToRecipient = chat.mIsDisplayedToRecipient;
            mDisplayedTimestamp = chat.mDisplayedTimestamp;
        }
        if (!Ks.a(chat))
        {
            mIsPreserved = chat.mIsPreserved;
        } else
        {
            mIsPreserved = mIsPreserved | chat.mIsPreserved;
        }
        mSeqNum = chat.mSeqNum;
    }

    public final void a(String s1)
    {
        mAckId = s1;
    }

    public final void a(boolean flag)
    {
        mIsPreserved = flag;
    }

    public final String an()
    {
        return mUserText;
    }

    public Spannable ao()
    {
        return new SpannableString(mUserText);
    }

    public final boolean aq()
    {
        return mIsReleasedByRecipient;
    }

    public final String b()
    {
        return mStatusText;
    }

    public final void b(int j)
    {
        mRecipientMessageStateVersionNumber = j;
    }

    public final void b(long l1)
    {
        mSeqNum = l1;
    }

    public final void b(String s1)
    {
        mStatusText = s1;
    }

    public final void b(boolean flag)
    {
        mIsReleasedByRecipient = flag;
    }

    public final void c(int j)
    {
        mReleaseDelay = j;
    }

    public final void c(String s1)
    {
        mId = s1;
    }

    public final void c(boolean flag)
    {
        mIsSavedBySender = flag;
    }

    public boolean c()
    {
        return R();
    }

    public final String d()
    {
        return mId;
    }

    public final void d(long l1)
    {
        mTimestamp = Long.valueOf(l1);
    }

    public final void d(String s1)
    {
        mIterToken = s1;
    }

    public final void d(boolean flag)
    {
        mIsSavedByRecipient = flag;
    }

    public final void e(long l1)
    {
        mReleasedTimestamp = l1;
    }

    public boolean e()
    {
        return q() || r();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Chat)
        {
            return mId.equals(((Chat)obj).mId);
        } else
        {
            return false;
        }
    }

    public final void f(long l1)
    {
        mDisplayedTimestamp = l1;
        mIsDisplayedToRecipient = true;
    }

    public final boolean f()
    {
        return mIsSavedBySender || mIsSavedByRecipient;
    }

    public final boolean g()
    {
        if (Bt.q() == null)
        {
            return false;
        }
        if (Ks.a(this))
        {
            return mIsSavedBySender;
        } else
        {
            return mIsSavedByRecipient;
        }
    }

    public boolean g(long l1)
    {
        return mIsDisplayedToRecipient && !mIsReleasedByRecipient && mDisplayedTimestamp + (long)mReleaseDelay <= l1;
    }

    public abstract String h();

    public int hashCode()
    {
        return mId.hashCode();
    }

    public final boolean i()
    {
        return mLoadingState == LoadingState.LOADED;
    }

    public final String l()
    {
        return mIterToken;
    }

    public final int m()
    {
        if (Ks.a(this))
        {
            mIsSavedBySender = true;
            int j = mSenderMessageStateVersionNumber + 1;
            mSenderMessageStateVersionNumber = j;
            return j;
        } else
        {
            mIsSavedByRecipient = true;
            int k = mRecipientMessageStateVersionNumber + 1;
            mRecipientMessageStateVersionNumber = k;
            return k;
        }
    }

    public final int n()
    {
        if (Ks.a(this))
        {
            mIsSavedBySender = false;
            int j = mSenderMessageStateVersionNumber + 1;
            mSenderMessageStateVersionNumber = j;
            return j;
        } else
        {
            mIsSavedByRecipient = false;
            int k = mRecipientMessageStateVersionNumber + 1;
            mRecipientMessageStateVersionNumber = k;
            return k;
        }
    }

    public final boolean o()
    {
        return mIsPreserved;
    }

    public final boolean s()
    {
        return mLoadingState == LoadingState.NOT_LOADED;
    }

    public final Qm t()
    {
        return mChatMessage;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Chat{mId='")).append(mId).append('\'').append(", mAckId='").append(mAckId).append('\'').append(", mRecipient='").append(Jh.a(k(), ",")).append('\'').append(", mSender='").append(j()).append('\'').append(", mIsSavedBySender=").append(mIsSavedBySender).append(", mIsSavedByRecipient=").append(mIsSavedByRecipient).append(", mSenderMessageStateVersionNumber=").append(mSenderMessageStateVersionNumber).append(", mRecipientMessageStateVersionNumber=").append(mRecipientMessageStateVersionNumber).append(", mIsReleasedByRecipient=").append(mIsReleasedByRecipient).append(", mIsPreserved=").append(mIsPreserved).append(", mTimestamp=").append(mTimestamp).append(", mReleasedTimestamp=").append(mReleasedTimestamp).append(", mDisplayedTimestamp=").append(mDisplayedTimestamp).append(", mIsDisplayedToRecipient=").append(mIsDisplayedToRecipient).append(", mUserText='");
        String s1;
        if (TextUtils.isEmpty(mUserText))
        {
            s1 = mUserText;
        } else
        {
            s1 = mUserText.substring(0, Math.min(3, mUserText.length()));
        }
        return stringbuilder.append(s1).append('\'').append(", mStatusText='").append(mStatusText).append('\'').append(", mSeqNum=").append(mSeqNum).append(", mSendReceiveStatus=").append(super.mSendReceiveStatus).append(", mIterToken='").append(mIterToken).append('\'').append('}').toString();
    }

    public final boolean u()
    {
        return mIsReleasedByRecipient;
    }

    public final String v()
    {
        return mAckId;
    }

    public final long w()
    {
        return mSeqNum;
    }

    public final int x()
    {
        return mSenderMessageStateVersionNumber;
    }

    public final int y()
    {
        return mRecipientMessageStateVersionNumber;
    }

    public final boolean z()
    {
        return mIsSavedBySender;
    }

}
