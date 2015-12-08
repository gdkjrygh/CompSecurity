// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import IP;
import IY;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public abstract class Snap
    implements ChatFeedItem
{
    public static final class ClientSnapStatus extends Enum
    {

        private static final ClientSnapStatus $VALUES[];
        public static final ClientSnapStatus DELIVERED;
        public static final ClientSnapStatus FAILED;
        public static final ClientSnapStatus FAILED_AND_NON_RECOVERABLE;
        public static final ClientSnapStatus FAILED_AND_USER_NOTIFIED_OF_FAILURE;
        public static final ClientSnapStatus FRIEND_REQUEST;
        public static final ClientSnapStatus LOADING;
        public static final ClientSnapStatus PENDING;
        public static final ClientSnapStatus RECEIVED_AND_REPLAYED;
        public static final ClientSnapStatus RECEIVED_AND_STARTED_VIEWING;
        public static final ClientSnapStatus RECEIVED_AND_VIEWED;
        public static final ClientSnapStatus SENDING;
        public static final ClientSnapStatus SENT;
        public static final ClientSnapStatus SENT_AND_OPENED;
        public static final ClientSnapStatus SENT_AND_REPLAYED;
        public static final ClientSnapStatus SENT_AND_REPLAYED_AND_SCREENSHOTTED;
        public static final ClientSnapStatus SENT_AND_SCREENSHOTTED;
        public static final ClientSnapStatus UNVIEWED_AND_LOADED;
        public static final ClientSnapStatus UNVIEWED_AND_LOAD_STATE_TBD;
        public static final ClientSnapStatus UNVIEWED_AND_UNLOADED;
        public static final ClientSnapStatus VIEWED_AND_REPLAY_AVAILABLE;
        public static final ClientSnapStatus VIEWED_AND_REPLAY_TRANSACTION_PROCESSING;

        public static ClientSnapStatus fromString(String s)
        {
            ClientSnapStatus aclientsnapstatus[] = values();
            int j = aclientsnapstatus.length;
            for (int i = 0; i < j; i++)
            {
                ClientSnapStatus clientsnapstatus = aclientsnapstatus[i];
                if (IP.c(clientsnapstatus.name(), s))
                {
                    return clientsnapstatus;
                }
            }

            return RECEIVED_AND_VIEWED;
        }

        public static ClientSnapStatus valueOf(String s)
        {
            return (ClientSnapStatus)Enum.valueOf(com/snapchat/android/model/Snap$ClientSnapStatus, s);
        }

        public static ClientSnapStatus[] values()
        {
            return (ClientSnapStatus[])$VALUES.clone();
        }

        static 
        {
            RECEIVED_AND_VIEWED = new ClientSnapStatus("RECEIVED_AND_VIEWED", 0);
            FAILED = new ClientSnapStatus("FAILED", 1);
            SENDING = new ClientSnapStatus("SENDING", 2);
            SENT = new ClientSnapStatus("SENT", 3);
            DELIVERED = new ClientSnapStatus("DELIVERED", 4);
            PENDING = new ClientSnapStatus("PENDING", 5);
            SENT_AND_OPENED = new ClientSnapStatus("SENT_AND_OPENED", 6);
            SENT_AND_SCREENSHOTTED = new ClientSnapStatus("SENT_AND_SCREENSHOTTED", 7);
            UNVIEWED_AND_LOAD_STATE_TBD = new ClientSnapStatus("UNVIEWED_AND_LOAD_STATE_TBD", 8);
            UNVIEWED_AND_UNLOADED = new ClientSnapStatus("UNVIEWED_AND_UNLOADED", 9);
            UNVIEWED_AND_LOADED = new ClientSnapStatus("UNVIEWED_AND_LOADED", 10);
            LOADING = new ClientSnapStatus("LOADING", 11);
            FRIEND_REQUEST = new ClientSnapStatus("FRIEND_REQUEST", 12);
            VIEWED_AND_REPLAY_AVAILABLE = new ClientSnapStatus("VIEWED_AND_REPLAY_AVAILABLE", 13);
            VIEWED_AND_REPLAY_TRANSACTION_PROCESSING = new ClientSnapStatus("VIEWED_AND_REPLAY_TRANSACTION_PROCESSING", 14);
            SENT_AND_REPLAYED = new ClientSnapStatus("SENT_AND_REPLAYED", 15);
            SENT_AND_REPLAYED_AND_SCREENSHOTTED = new ClientSnapStatus("SENT_AND_REPLAYED_AND_SCREENSHOTTED", 16);
            RECEIVED_AND_REPLAYED = new ClientSnapStatus("RECEIVED_AND_REPLAYED", 17);
            FAILED_AND_USER_NOTIFIED_OF_FAILURE = new ClientSnapStatus("FAILED_AND_USER_NOTIFIED_OF_FAILURE", 18);
            FAILED_AND_NON_RECOVERABLE = new ClientSnapStatus("FAILED_AND_NON_RECOVERABLE", 19);
            RECEIVED_AND_STARTED_VIEWING = new ClientSnapStatus("RECEIVED_AND_STARTED_VIEWING", 20);
            $VALUES = (new ClientSnapStatus[] {
                RECEIVED_AND_VIEWED, FAILED, SENDING, SENT, DELIVERED, PENDING, SENT_AND_OPENED, SENT_AND_SCREENSHOTTED, UNVIEWED_AND_LOAD_STATE_TBD, UNVIEWED_AND_UNLOADED, 
                UNVIEWED_AND_LOADED, LOADING, FRIEND_REQUEST, VIEWED_AND_REPLAY_AVAILABLE, VIEWED_AND_REPLAY_TRANSACTION_PROCESSING, SENT_AND_REPLAYED, SENT_AND_REPLAYED_AND_SCREENSHOTTED, RECEIVED_AND_REPLAYED, FAILED_AND_USER_NOTIFIED_OF_FAILURE, FAILED_AND_NON_RECOVERABLE, 
                RECEIVED_AND_STARTED_VIEWING
            });
        }

        private ClientSnapStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TargetView extends Enum
    {

        private static final TargetView $VALUES[];
        public static final TargetView CHAT;
        public static final TargetView CHAT_AND_FEED;
        public static final TargetView FEED;

        public static TargetView valueOf(String s)
        {
            return (TargetView)Enum.valueOf(com/snapchat/android/model/Snap$TargetView, s);
        }

        public static TargetView[] values()
        {
            return (TargetView[])$VALUES.clone();
        }

        static 
        {
            CHAT = new TargetView("CHAT", 0);
            FEED = new TargetView("FEED", 1);
            CHAT_AND_FEED = new TargetView("CHAT_AND_FEED", 2);
            $VALUES = (new TargetView[] {
                CHAT, FEED, CHAT_AND_FEED
            });
        }

        private TargetView(String s, int i)
        {
            super(s, i);
        }
    }


    public static final Set TARGET_VIEWS_CHAT;
    public static final Set TARGET_VIEWS_FEED;
    public boolean mClearedBySender;
    public ClientSnapStatus mClientSnapStatus;
    private long mGroupId;
    public String mId;
    public boolean mIsScreenshotted;
    public int mMediaType;
    public long mSentTimestamp;
    public long mTimestamp;

    public Snap()
    {
        mIsScreenshotted = false;
    }

    public Snap(String s, long l, int i, ClientSnapStatus clientsnapstatus)
    {
        mIsScreenshotted = false;
        mId = s;
        mTimestamp = l;
        mMediaType = i;
        mClientSnapStatus = clientsnapstatus;
    }

    public static String a(Context context, ClientSnapStatus clientsnapstatus)
    {
        int i;
        int j;
        boolean flag;
        j = 0x7f0801be;
        FeatureFlagManager.a();
        flag = FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2);
        i = j;
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[];

            static 
            {
                $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus = new int[ClientSnapStatus.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.DELIVERED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.PENDING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENT_AND_OPENED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENDING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.FAILED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.FAILED_AND_NON_RECOVERABLE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENT_AND_SCREENSHOTTED.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENT_AND_REPLAYED_AND_SCREENSHOTTED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.SENT_AND_REPLAYED.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.RECEIVED_AND_VIEWED.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.RECEIVED_AND_REPLAYED.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.VIEWED_AND_REPLAY_AVAILABLE.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.VIEWED_AND_REPLAY_TRANSACTION_PROCESSING.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.LOADING.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.UNVIEWED_AND_LOADED.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.UNVIEWED_AND_UNLOADED.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.UNVIEWED_AND_LOAD_STATE_TBD.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Snap$ClientSnapStatus[ClientSnapStatus.FRIEND_REQUEST.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.model.Snap.ClientSnapStatus[clientsnapstatus.ordinal()];
        JVM INSTR tableswitch 1 20: default 120
    //                   1 149
    //                   2 149
    //                   3 166
    //                   4 172
    //                   5 143
    //                   6 131
    //                   7 131
    //                   8 137
    //                   9 172
    //                   10 221
    //                   11 221
    //                   12 122
    //                   13 122
    //                   14 209
    //                   15 215
    //                   16 197
    //                   17 191
    //                   18 185
    //                   19 122
    //                   20 203;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L6 _L7 _L4 _L8 _L8 _L9 _L9 _L10 _L11 _L12 _L13 _L14 _L9 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L1:
        i = j;
_L17:
        return context.getResources().getString(i);
_L6:
        i = 0x7f0800be;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f08012e;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f080251;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            i = 0x7f080253;
        } else
        {
            i = 0x7f0800fd;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0801d6;
        continue; /* Loop/switch isn't completed */
_L4:
        i = j;
        if (flag)
        {
            i = 0x7f080253;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        i = 0x7f0802cf;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 0x7f0802d2;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 0x7f080134;
        continue; /* Loop/switch isn't completed */
_L15:
        i = 0x7f080055;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f0801f5;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 0x7f080322;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f080220;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public long W()
    {
        return mTimestamp;
    }

    public final int a(boolean flag, boolean flag1)
    {
        ClientSnapStatus clientsnapstatus = mClientSnapStatus;
        switch (_cls1..SwitchMap.com.snapchat.android.model.Snap.ClientSnapStatus[clientsnapstatus.ordinal()])
        {
        default:
            return !al() && !flag1 ? 0x7f020048 : 0x7f020047;

        case 1: // '\001'
        case 2: // '\002'
            return !al() ? 0x7f020045 : 0x7f020044;

        case 3: // '\003'
            return 0x7f02003d;

        case 4: // '\004'
            return ag();

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return 0x7f02013f;

        case 9: // '\t'
        case 10: // '\n'
            return !al() ? 0x7f02003c : 0x7f02003b;

        case 11: // '\013'
            return ah();

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            return af();

        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            return b(flag, flag1);

        case 20: // '\024'
            return 0x7f020140;
        }
    }

    public final void a(ClientSnapStatus clientsnapstatus)
    {
        mClientSnapStatus = clientsnapstatus;
    }

    public final void a(String s)
    {
        mId = s;
    }

    public final long ae()
    {
        return mGroupId;
    }

    public final int af()
    {
        return !al() ? 0x7f020037 : 0x7f020036;
    }

    public final int ag()
    {
        return !al() ? 0x7f020041 : 0x7f020040;
    }

    public final int ah()
    {
        return !al() ? 0x7f020039 : 0x7f020038;
    }

    public final String ai()
    {
        return mId;
    }

    public final ClientSnapStatus aj()
    {
        return mClientSnapStatus;
    }

    public final boolean ak()
    {
        return mMediaType == 1 || mMediaType == 2;
    }

    public final boolean al()
    {
        return mMediaType == 1;
    }

    public final int am()
    {
        return mMediaType;
    }

    public final String an()
    {
        return null;
    }

    public final Spannable ao()
    {
        return null;
    }

    public final void ap()
    {
        mClearedBySender = true;
    }

    public final boolean aq()
    {
        return mClearedBySender;
    }

    public final boolean ar()
    {
        return mClientSnapStatus == ClientSnapStatus.VIEWED_AND_REPLAY_AVAILABLE;
    }

    public final boolean as()
    {
        return mIsScreenshotted;
    }

    public final int b(boolean flag, boolean flag1)
    {
        if (al() || flag1)
        {
            return !flag ? 0x7f020047 : 0x7f02002e;
        }
        return !flag ? 0x7f020048 : 0x7f02002f;
    }

    public String b()
    {
        return a(SnapchatApplication.get(), mClientSnapStatus).toUpperCase(Locale.getDefault());
    }

    public final void c(int i)
    {
        mMediaType = i;
    }

    public final void c(long l)
    {
        mGroupId = l;
    }

    public String d()
    {
        return mId;
    }

    public final void d(boolean flag)
    {
        mIsScreenshotted = flag;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Snap) || !getClass().equals(obj.getClass()))
        {
            return false;
        } else
        {
            obj = (Snap)obj;
            return IY.a(mId).equals(IY.a(((Snap) (obj)).mId));
        }
    }

    public abstract boolean f();

    public int hashCode()
    {
        int i;
        if (mId == null)
        {
            i = 0;
        } else
        {
            i = IY.a(mId).hashCode();
        }
        return i + 31;
    }

    static 
    {
        HashSet hashset = new HashSet();
        TARGET_VIEWS_CHAT = hashset;
        hashset.add(TargetView.CHAT);
        TARGET_VIEWS_CHAT.add(TargetView.CHAT_AND_FEED);
        hashset = new HashSet();
        TARGET_VIEWS_FEED = hashset;
        hashset.add(TargetView.FEED);
        TARGET_VIEWS_FEED.add(TargetView.CHAT_AND_FEED);
    }
}
