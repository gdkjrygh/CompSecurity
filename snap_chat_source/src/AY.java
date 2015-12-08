// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.Snap;
import com.snapchat.android.model.chat.ChatConversation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class AY extends Snap
{

    public static final int TIME_TO_PRIORITIZE_SENT_ICON = 1000;
    public static final ArrayList sSentSnapStateTimeline;
    public String mClientId;
    public String mDisplayTime;
    public boolean mIsRetriedByUser;
    public boolean mIsSavableSnap;
    public String mRecipient;
    public String mSnapUriString;
    public long mTimeOfLastSendAttempt;
    public boolean mZipped;

    public AY(AA aa)
    {
        this(((Mediabryo) (aa)).mClientId, ((Mediabryo) (aa)).mClientId, System.currentTimeMillis(), System.currentTimeMillis(), aa.i(), com.snapchat.android.model.Snap.ClientSnapStatus.SENDING, ((Mediabryo) (aa)).mMediaMailingMetadata.e(), "0", ((Mediabryo) (aa)).mVideoUri, System.currentTimeMillis(), ((Mediabryo) (aa)).mIsZipUpload);
    }

    public AY(String s1, String s2, long l1, long l2, int i1, 
            com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus, String s3)
    {
        this(s1, s2, l1, l2, i1, clientsnapstatus, s3, "0", null, System.currentTimeMillis(), false);
    }

    public AY(String s1, String s2, long l1, long l2, int i1, 
            com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus, String s3, String s4, Uri uri, long l3, boolean flag)
    {
        super(s1, l1, i1, clientsnapstatus);
        mClientId = s2;
        mSentTimestamp = l2;
        mDisplayTime = s4;
        mTimeOfLastSendAttempt = l3;
        mRecipient = s3;
        mDisplayTime = "0";
        if (uri != null)
        {
            mSnapUriString = uri.toString();
        }
        mZipped = flag;
        if (mTimeOfLastSendAttempt == 0L)
        {
            mTimeOfLastSendAttempt = System.currentTimeMillis();
        }
        mIsSavableSnap = true;
    }

    private boolean s()
    {
        return mClientId == null || !mClientId.equals(mId);
    }

    public final boolean Q()
    {
        return mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.SENDING;
    }

    public final boolean R()
    {
        return mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.FAILED || mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE || mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE;
    }

    public final boolean S()
    {
        return mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE;
    }

    public final boolean T()
    {
        return mClientSnapStatus != com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE;
    }

    public final long W()
    {
        return mSentTimestamp;
    }

    public final long Y()
    {
        if (m())
        {
            return mTimestamp;
        } else
        {
            return mSentTimestamp;
        }
    }

    public final Fd a(View view, ChatConversation chatconversation)
    {
        return new Fd(a(false, false));
    }

    public final String a()
    {
        com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus = aj();
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[];

            static 
            {
                $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus = new int[com.snapchat.android.model.Snap.ClientSnapStatus.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.DELIVERED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_OPENED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED_AND_SCREENSHOTTED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_SCREENSHOTTED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.FAILED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.PENDING.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[com.snapchat.android.model.Snap.ClientSnapStatus.SENDING.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.model.Snap.ClientSnapStatus[clientsnapstatus.ordinal()];
        JVM INSTR tableswitch 1 11: default 72
    //                   1 110
    //                   2 110
    //                   3 134
    //                   4 128
    //                   5 122
    //                   6 116
    //                   7 86
    //                   8 86
    //                   9 92
    //                   10 98
    //                   11 104;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L8 _L9 _L10
_L1:
        int i1 = 0x7f0802c9;
_L12:
        return SnapchatApplication.get().getResources().getString(i1);
_L7:
        i1 = 0x7f080131;
        continue; /* Loop/switch isn't completed */
_L8:
        i1 = 0x7f08012e;
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = 0x7f0801d6;
        continue; /* Loop/switch isn't completed */
_L10:
        i1 = 0x7f080251;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 0x7f0800fd;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f08023a;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 0x7f080221;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f080220;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f0801be;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void a(long l1)
    {
        mSentTimestamp = l1;
    }

    public final int b(ChatConversation chatconversation)
    {
        com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority feediconpriority = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.MOST_RECENT;
        if (!R() || !T()) goto _L2; else goto _L1
_L1:
        chatconversation = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.FAILED;
_L4:
        return chatconversation.ordinal();
_L2:
        if (Q())
        {
            chatconversation = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.SENDING;
        } else
        {
            chatconversation = feediconpriority;
            if (q())
            {
                chatconversation = feediconpriority;
                if (!m())
                {
                    chatconversation = feediconpriority;
                    if (System.currentTimeMillis() - mSentTimestamp < 1000L)
                    {
                        chatconversation = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.RECENTLY_SENT;
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String b()
    {
        if (mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.SENDING && mIsRetriedByUser)
        {
            return a(SnapchatApplication.get(), com.snapchat.android.model.Snap.ClientSnapStatus.FAILED).toUpperCase(Locale.getDefault());
        } else
        {
            return a(SnapchatApplication.get(), mClientSnapStatus).toUpperCase(Locale.getDefault());
        }
    }

    public final void b(long l1)
    {
        mTimestamp = l1;
    }

    public final boolean c()
    {
        return R() || aj() == com.snapchat.android.model.Snap.ClientSnapStatus.PENDING;
    }

    public final String d()
    {
        return mClientId;
    }

    public final void e()
    {
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.FAILED;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AY))
            {
                return false;
            }
            obj = (AY)obj;
            if (s() || ((AY) (obj)).s())
            {
                if (mClientId == null || !mClientId.equals(((AY) (obj)).mClientId))
                {
                    return false;
                }
            } else
            {
                return IY.a(mId).equals(IY.a(((AY) (obj)).mId));
            }
        }
        return true;
    }

    public final boolean f()
    {
        while (mClientSnapStatus == null || mClientSnapStatus != com.snapchat.android.model.Snap.ClientSnapStatus.FAILED && mClientSnapStatus != com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE) 
        {
            return false;
        }
        return true;
    }

    public final void g()
    {
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE;
    }

    public final void h()
    {
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.SENDING;
    }

    public final int hashCode()
    {
        return mClientId.hashCode();
    }

    public final void i()
    {
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.SENT;
    }

    public final String j()
    {
        return Bt.q();
    }

    public final List k()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(mRecipient);
        return arraylist;
    }

    public final void l()
    {
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.PENDING;
    }

    public final boolean m()
    {
        switch (_cls1..SwitchMap.com.snapchat.android.model.Snap.ClientSnapStatus[mClientSnapStatus.ordinal()])
        {
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public final long n()
    {
        return mTimestamp;
    }

    public final boolean o()
    {
        return System.currentTimeMillis() - mTimeOfLastSendAttempt > 45000L;
    }

    public final boolean p()
    {
        return mClientSnapStatus == com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE;
    }

    public final boolean q()
    {
        switch (_cls1..SwitchMap.com.snapchat.android.model.Snap.ClientSnapStatus[mClientSnapStatus.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public final boolean r()
    {
        return false;
    }

    public final String toString()
    {
        return (new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)).append("id", mClientId).append("clientId", mClientId).append("recipient", mRecipient).append("timestamp", mSentTimestamp).append("isVideoWithAudio", al()).append("clientSnapStatus", aj()).toString();
    }

    static 
    {
        sSentSnapStateTimeline = new ArrayList(Arrays.asList(new com.snapchat.android.model.Snap.ClientSnapStatus[] {
            com.snapchat.android.model.Snap.ClientSnapStatus.SENDING, com.snapchat.android.model.Snap.ClientSnapStatus.FAILED, com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE, com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_NON_RECOVERABLE, com.snapchat.android.model.Snap.ClientSnapStatus.SENT, com.snapchat.android.model.Snap.ClientSnapStatus.DELIVERED, com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_OPENED, com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_SCREENSHOTTED, com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED, com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED_AND_SCREENSHOTTED
        }));
    }
}
