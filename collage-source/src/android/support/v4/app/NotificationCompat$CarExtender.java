// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static final class ut.Factory
    implements ut.Factory
{
    public static class UnreadConversation extends NotificationCompatBase.UnreadConversation
    {

        static final NotificationCompatBase.UnreadConversation.Factory FACTORY = new NotificationCompatBase.UnreadConversation.Factory() {

            public UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
            {
                return new UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
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

        public volatile RemoteInputCompatBase.RemoteInput getRemoteInput()
        {
            return getRemoteInput();
        }

        public PendingIntent getReplyPendingIntent()
        {
            return mReplyPendingIntent;
        }


        UnreadConversation(String as[], RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            mMessages = as;
            mRemoteInput = remoteinput;
            mReadPendingIntent = pendingintent1;
            mReplyPendingIntent = pendingintent;
            mParticipants = as1;
            mLatestTimestamp = l;
        }
    }

    public static class UnreadConversation.Builder
    {

        private long mLatestTimestamp;
        private final List mMessages = new ArrayList();
        private final String mParticipant;
        private PendingIntent mReadPendingIntent;
        private RemoteInput mRemoteInput;
        private PendingIntent mReplyPendingIntent;

        public UnreadConversation.Builder addMessage(String s)
        {
            mMessages.add(s);
            return this;
        }

        public UnreadConversation build()
        {
            String as[] = (String[])mMessages.toArray(new String[mMessages.size()]);
            String s = mParticipant;
            RemoteInput remoteinput = mRemoteInput;
            PendingIntent pendingintent = mReplyPendingIntent;
            PendingIntent pendingintent1 = mReadPendingIntent;
            long l = mLatestTimestamp;
            return new UnreadConversation(as, remoteinput, pendingintent, pendingi