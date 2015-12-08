// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public final class ut.Factory
    implements ut.Factory
{

    private static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
    private static final String EXTRA_COLOR = "app_color";
    private static final String EXTRA_CONVERSATION = "car_conversation";
    private static final String EXTRA_LARGE_ICON = "large_icon";
    private static final String TAG = "CarExtender";
    private int mColor;
    private Bitmap mLargeIcon;
    private UnreadConversation mUnreadConversation;

    public ut.Factory extend(ut.Factory factory)
    {
        if (android.os.ase.UnreadConversation < 21)
        {
            return factory;
        }
        Bundle bundle = new Bundle();
        if (mLargeIcon != null)
        {
            bundle.putParcelable("large_icon", mLargeIcon);
        }
        if (mColor != 0)
        {
            bundle.putInt("app_color", mColor);
        }
        if (mUnreadConversation != null)
        {
            bundle.putBundle("car_conversation", NotificationCompat.access$200().getBundleForUnreadConversation(mUnreadConversation));
        }
        factory.xtras().putBundle("android.car.EXTENSIONS", bundle);
        return factory;
    }

    public int getColor()
    {
        return mColor;
    }

    public Bitmap getLargeIcon()
    {
        return mLargeIcon;
    }

    public UnreadConversation getUnreadConversation()
    {
        return mUnreadConversation;
    }

    public mUnreadConversation setColor(int i)
    {
        mColor = i;
        return this;
    }

    public mColor setLargeIcon(Bitmap bitmap)
    {
        mLargeIcon = bitmap;
        return this;
    }

    public UnreadConversation setUnreadConversation(UnreadConversation unreadconversation)
    {
        mUnreadConversation = unreadconversation;
        return this;
    }

    public UnreadConversation()
    {
        mColor = 0;
    }

    public ut.Factory(Notification notification)
    {
        mColor = 0;
        if (android.os.CarExtender.mColor >= 21)
        {
            if (NotificationCompat.getExtras(notification) == null)
            {
                notification = null;
            } else
            {
                notification = NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
            }
            if (notification != null)
            {
                mLargeIcon = (Bitmap)notification.getParcelable("large_icon");
                mColor = notification.getInt("app_color", 0);
                notification = notification.getBundle("car_conversation");
                class UnreadConversation extends NotificationCompatBase.UnreadConversation
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

                mUnreadConversation = (UnreadConversation)NotificationCompat.access$200().getUnreadConversationFromBundle(notification, UnreadConversation.FACTORY, RemoteInput.FACTORY);
                return;
            }
        }
    }
}
