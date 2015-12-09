// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static class mLatestTimestamp extends mLatestTimestamp
{
    public static class Builder
    {

        private long mLatestTimestamp;
        private final List mMessages = new ArrayList();
        private final String mParticipant;
        private PendingIntent mReadPendingIntent;
        private RemoteInput mRemoteInput;
        private PendingIntent mReplyPendingIntent;

        public Builder addMessage(String s)
        {
            mMessages.add(s);
            return this;
        }

        public NotificationCompat.CarExtender.UnreadConversation build()
        {
            String as[] = (String[])mMessages.toArray(new String[mMessages.size()]);
            String s = mParticipant;
            RemoteInput remoteinput = mRemoteInput;
            PendingIntent pendingintent = mReplyPendingIntent;
            PendingIntent pendingintent1 = mReadPendingIntent;
            long l = mLatestTimestamp;
            return new NotificationCompat.CarExtender.UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
                s
            }, l);
        }

        public Builder setLatestTimestamp(long l)
        {
            mLatestTimestamp = l;
            return this;
        }

        public Builder setReadPendingIntent(PendingIntent pendingintent)
        {
            mReadPendingIntent = pendingintent;
            return this;
        }

        public Builder setReplyAction(PendingIntent pendingintent, RemoteInput remoteinput)
        {
            mRemoteInput = remoteinput;
            mReplyPendingIntent = pendingintent;
            return this;
        }

        public Builder(String s)
        {
            mParticipant = s;
        }
    }


    static final mReplyPendingIntent FACTORY = new NotificationCompatBase.UnreadConversation.Factory() {

        public NotificationCompat.CarExtender.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            return new NotificationCompat.CarExtender.UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
        }

        public volatile NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            return build(as, remoteinput, pendingintent, pendingintent1, as1, l);
        }

    };
    private final long mLatestTimestamp;
    private final String mMessages[];
    private final String mParticipants[];
    private final PendingIntent mReadPendingIntent;
    private final RemoteInput mRemoteInput;
    private final PendingIntent mReplyPendingIntent;

    public long getLatestTimestamp()
    {
        return mLatestTimestamp;
    }

    public String[] getMessages()
    {
        return mMessages;
    }

    public String getParticipant()
    {
        if (mParticipants.length > 0)
        {
            return mParticipants[0];
        } else
        {
            return null;
        }
    }

    public String[] getParticipants()
    {
        return mParticipants;
    }

    public PendingIntent getReadPendingIntent()
    {
        return mReadPendingIntent;
    }

    public RemoteInput getRemoteInput()
    {
        return mRemoteInput;
    }

    public volatile mRemoteInput getRemoteInput()
    {
        return getRemoteInput();
    }

    public PendingIntent getReplyPendingIntent()
    {
        return mReplyPendingIntent;
    }


    _cls1(String as[], RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
    {
        mMessages = as;
        mRemoteInput = remoteinput;
        mReadPendingIntent = pendingintent1;
        mReplyPendingIntent = pendingintent;
        mParticipants = as1;
        mLatestTimestamp = l;
    }
}
