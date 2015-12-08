// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithActions, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor, RemoteInput

public final class NotificationCompat
{
    private class Action extends NotificationCompatBase.Action
    {

        public static final NotificationCompatBase.Action.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

        };
        private final Bundle mExtras;
        private final RemoteInput mRemoteInputs[];

        public final Bundle getExtras()
        {
            return mExtras;
        }

        public final volatile RemoteInputCompatBase.RemoteInput[] getRemoteInputs()
        {
            return mRemoteInputs;
        }

    }

    private class BigTextStyle extends Style
    {
        private class Style
        {

            Builder mBuilder;
            CharSequence mSummaryText;
            boolean mSummaryTextSet;

            public Style()
            {
                mSummaryTextSet = false;
            }
        }


        CharSequence mBigText;

        public final BigTextStyle bigText(CharSequence charsequence)
        {
            mBigText = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigTextStyle()
        {
        }
    }

    private class InboxStyle extends Style
    {

        ArrayList mTexts;

        public final InboxStyle addLine(CharSequence charsequence)
        {
            mTexts.add(Builder.limitCharSequenceLength(charsequence));
            return this;
        }

        public final InboxStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public InboxStyle()
        {
            mTexts = new ArrayList();
        }
    }

    private class BigPictureStyle extends Style
    {

        public BigPictureStyle()
        {
        }
    }

    public static final class Builder
    {

        public ArrayList mActions;
        public String mCategory;
        public int mColor;
        public CharSequence mContentInfo;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public Context mContext;
        public Bundle mExtras;
        public Bitmap mLargeIcon;
        public boolean mLocalOnly;
        public Notification mNotification;
        public ArrayList mPeople;
        public int mPriority;
        boolean mShowWhen;
        public Style mStyle;
        public int mVisibility;

        protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
        {
            while (charsequence == null || charsequence.length() <= 5120) 
            {
                return charsequence;
            }
            return charsequence.subSequence(0, 5120);
        }

        public final Notification build()
        {
            NotificationCompatImpl notificationcompatimpl = NotificationCompat.IMPL;
            new BuilderExtender();
            return notificationcompatimpl.ab8b522(this);
        }

        public final Builder setContentInfo(CharSequence charsequence)
        {
            mContentInfo = limitCharSequenceLength(charsequence);
            return this;
        }

        public final Builder setContentText(CharSequence charsequence)
        {
            mContentText = limitCharSequenceLength(charsequence);
            return this;
        }

        public final Builder setContentTitle(CharSequence charsequence)
        {
            mContentTitle = limitCharSequenceLength(charsequence);
            return this;
        }

        public final Builder setDeleteIntent(PendingIntent pendingintent)
        {
            mNotification.deleteIntent = pendingintent;
            return this;
        }

        public final void setFlag(int i, boolean flag)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | i;
        }

        public final Builder setSmallIcon(int i)
        {
            mNotification.icon = i;
            return this;
        }

        public final Builder setStyle(Style style)
        {
            if (mStyle != style)
            {
                mStyle = style;
                if (mStyle != null)
                {
                    style = mStyle;
                    if (style.mBuilder != this)
                    {
                        style.mBuilder = this;
                        if (style.mBuilder != null)
                        {
                            style.mBuilder.setStyle(style);
                        }
                    }
                }
            }
            return this;
        }

        public final Builder setTicker(CharSequence charsequence)
        {
            mNotification.tickerText = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder(Context context)
        {
            mShowWhen = true;
            mActions = new ArrayList();
            mLocalOnly = false;
            mColor = 0;
            mVisibility = 0;
            mNotification = new Notification();
            mContext = context;
            mNotification.when = System.currentTimeMillis();
            mNotification.audioStreamType = -1;
            mPriority = 0;
            mPeople = new ArrayList();
        }
    }

    protected static final class BuilderExtender
    {

        protected BuilderExtender()
        {
        }
    }

    static interface NotificationCompatImpl
    {

        public abstract Notification build$ab8b522(Builder builder);
    }

    static class NotificationCompatImplApi20 extends NotificationCompatImplKitKat
    {

        public Notification build$ab8b522(Builder builder)
        {
            NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, null, 0, builder.mContentIntent, null, builder.mLargeIcon, 0, 0, false, builder.mShowWhen, false, builder.mPriority, null, builder.mLocalOnly, builder.mPeople, builder.mExtras, null, false, null);
            NotificationCompat.access$000(builder1, builder.mActions);
            NotificationCompat.access$100(builder1, builder.mStyle);
            return builder1.build();
        }

        NotificationCompatImplApi20()
        {
        }
    }

    static final class NotificationCompatImplApi21 extends NotificationCompatImplApi20
    {

        public final Notification build$ab8b522(Builder builder)
        {
            NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, null, 0, builder.mContentIntent, null, builder.mLargeIcon, 0, 0, false, builder.mShowWhen, false, builder.mPriority, null, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, null, null, false, null);
            NotificationCompat.access$000(builder1, builder.mActions);
            NotificationCompat.access$100(builder1, builder.mStyle);
            return builder1.build();
        }

        NotificationCompatImplApi21()
        {
        }
    }

    static class NotificationCompatImplBase
        implements NotificationCompatImpl
    {

        public Notification build$ab8b522(Builder builder)
        {
            Notification notification = builder.mNotification;
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            if (builder.mPriority > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        NotificationCompatImplBase()
        {
        }
    }

    static final class NotificationCompatImplGingerbread extends NotificationCompatImplBase
    {

        public final Notification build$ab8b522(Builder builder)
        {
            Notification notification = builder.mNotification;
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            notification.fullScreenIntent = null;
            if (builder.mPriority > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        NotificationCompatImplGingerbread()
        {
        }
    }

    static final class NotificationCompatImplHoneycomb extends NotificationCompatImplBase
    {

        public final Notification build$ab8b522(Builder builder)
        {
            boolean flag1 = true;
            Object obj1 = builder.mContext;
            Notification notification = builder.mNotification;
            Object obj = builder.mContentTitle;
            CharSequence charsequence = builder.mContentText;
            CharSequence charsequence1 = builder.mContentInfo;
            PendingIntent pendingintent = builder.mContentIntent;
            builder = builder.mLargeIcon;
            obj1 = (new android.app.Notification.Builder(((Context) (obj1)))).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            boolean flag;
            if ((notification.flags & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
            if ((notification.flags & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
            if ((notification.flags & 0x10) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 0x80) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(null, flag).setLargeIcon(builder).setNumber(0).getNotification();
        }

        NotificationCompatImplHoneycomb()
        {
        }
    }

    static final class NotificationCompatImplIceCreamSandwich extends NotificationCompatImplBase
    {

        public final Notification build$ab8b522(Builder builder)
        {
            return (new NotificationCompatIceCreamSandwich.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, null, 0, builder.mContentIntent, null, builder.mLargeIcon, 0, 0, false)).build();
        }

        NotificationCompatImplIceCreamSandwich()
        {
        }
    }

    static class NotificationCompatImplJellybean extends NotificationCompatImplBase
    {

        public Notification build$ab8b522(Builder builder)
        {
            NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, null, 0, builder.mContentIntent, null, builder.mLargeIcon, 0, 0, false, false, builder.mPriority, null, builder.mLocalOnly, builder.mExtras, null, false, null);
            NotificationCompat.access$000(builder1, builder.mActions);
            NotificationCompat.access$100(builder1, builder.mStyle);
            return builder1.build();
        }

        NotificationCompatImplJellybean()
        {
        }
    }

    static class NotificationCompatImplKitKat extends NotificationCompatImplJellybean
    {

        public Notification build$ab8b522(Builder builder)
        {
            NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, null, 0, builder.mContentIntent, null, builder.mLargeIcon, 0, 0, false, builder.mShowWhen, false, builder.mPriority, null, builder.mLocalOnly, builder.mPeople, builder.mExtras, null, false, null);
            NotificationCompat.access$000(builder1, builder.mActions);
            NotificationCompat.access$100(builder1, builder.mStyle);
            return builder1.build();
        }

        NotificationCompatImplKitKat()
        {
        }
    }


    private static final NotificationCompatImpl IMPL;

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new NotificationCompatImplApi21();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new NotificationCompatImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new NotificationCompatImplKitKat();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new NotificationCompatImplJellybean();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new NotificationCompatImplIceCreamSandwich();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new NotificationCompatImplHoneycomb();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new NotificationCompatImplGingerbread();
        } else
        {
            IMPL = new NotificationCompatImplBase();
        }
    }


/*
    static void access$000(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); notificationbuilderwithactions.addAction((Action)arraylist.next())) { }
        return;
    }

*/


/*
    static void access$100(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Style style)
    {
        if (style != null)
        {
            if (style instanceof BigTextStyle)
            {
                style = (BigTextStyle)style;
                NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, null, ((BigTextStyle) (style)).mSummaryTextSet, ((BigTextStyle) (style)).mSummaryText, ((BigTextStyle) (style)).mBigText);
            } else
            {
                if (style instanceof InboxStyle)
                {
                    style = (InboxStyle)style;
                    NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, null, ((InboxStyle) (style)).mSummaryTextSet, ((InboxStyle) (style)).mSummaryText, ((InboxStyle) (style)).mTexts);
                    return;
                }
                if (style instanceof BigPictureStyle)
                {
                    style = (BigPictureStyle)style;
                    NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, null, ((BigPictureStyle) (style)).mSummaryTextSet, ((BigPictureStyle) (style)).mSummaryText, null, null, false);
                    return;
                }
            }
        }
        return;
    }

*/

}
