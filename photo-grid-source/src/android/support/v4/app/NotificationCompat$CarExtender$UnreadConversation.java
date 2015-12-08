// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

public class mLatestTimestamp extends mLatestTimestamp
{

    static final _cls1 FACTORY = new _cls1();
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

    class _cls1
        implements NotificationCompatBase.UnreadConversation.Factory
    {

        public final NotificationCompat.CarExtender.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            return new NotificationCompat.CarExtender.UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
        }

        public final volatile NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
        {
            return build(as, remoteinput, pendingintent, pendingintent1, as1, l);
        }

            _cls1()
            {
            }
    }

}
