// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithActions, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor, RemoteInput, 
//            NotificationCompatGingerbread, NotificationCompatHoneycomb

public class NotificationCompat
{
    public static class Action extends NotificationCompatBase.Action
    {

        public static final NotificationCompatBase.Action.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

        };
        public PendingIntent actionIntent;
        public int icon;
        private final Bundle mExtras;
        private final RemoteInput mRemoteInputs[];
        public CharSequence title;

        public PendingIntent getActionIntent()
        {
            return actionIntent;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public int getIcon()
        {
            return icon;
        }

        public RemoteInput[] getRemoteInputs()
        {
            return mRemoteInputs;
        }

        public volatile RemoteInputCompatBase.RemoteInput[] getRemoteInputs()
        {
            return getRemoteInputs();
        }

        public CharSequence getTitle()
        {
            return title;
        }

    }

    public static class BigPictureStyle extends Style
    {

        Bitmap mBigLargeIcon;
        boolean mBigLargeIconSet;
        Bitmap mPicture;

        public BigPictureStyle()
        {
        }
    }

    public static class BigTextStyle extends Style
    {

        CharSequence mBigText;

        public BigTextStyle()
        {
        }
    }

    public static class Builder
    {

        public ArrayList mActions;
        String mCategory;
        int mColor;
        public CharSequence mContentInfo;
        PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        String mGroupKey;
        boolean mGroupSummary;
        public Bitmap mLargeIcon;
        boolean mLocalOnly;
        public Notification mNotification;
        public int mNumber;
        public ArrayList mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        boolean mShowWhen;
        String mSortKey;
        public Style mStyle;
        public CharSequence mSubText;
        RemoteViews mTickerView;
        public boolean mUseChronometer;
        int mVisibility;

        protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
        {
            while (charsequence == null || charsequence.length() <= 5120) 
            {
                return charsequence;
            }
            return charsequence.subSequence(0, 5120);
        }

        private void setFlag(int i, boolean flag)
        {
            if (flag)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | i;
                return;
            } else
            {
                Notification notification1 = mNotification;
                notification1.flags = notification1.flags & ~i;
                return;
            }
        }

        public Notification build()
        {
            return NotificationCompat.IMPL.build(this, getExtender());
        }

        protected BuilderExtender getExtender()
        {
            return new BuilderExtender();
        }

        public Builder setAutoCancel(boolean flag)
        {
            setFlag(16, flag);
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingintent)
        {
            mContentIntent = pendingintent;
            return this;
        }

        public Builder setContentText(CharSequence charsequence)
        {
            mContentText = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charsequence)
        {
            mContentTitle = limitCharSequenceLength(charsequence);
            return this;
        }

        public Builder setDefaults(int i)
        {
            mNotification.defaults = i;
            if ((i & 4) != 0)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | 1;
            }
            return this;
        }

        public Builder setOnlyAlertOnce(boolean flag)
        {
            setFlag(8, flag);
            return this;
        }

        public Builder setSmallIcon(int i)
        {
            mNotification.icon = i;
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

    protected static class BuilderExtender
    {

        public Notification build(Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
        {
            return notificationbuilderwithbuilderaccessor.build();
        }

        protected BuilderExtender()
        {
        }
    }

    public static class InboxStyle extends Style
    {

        ArrayList mTexts;

        public InboxStyle()
        {
            mTexts = new ArrayList();
        }
    }

    static interface NotificationCompatImpl
    {

        public abstract Notification build(Builder builder, BuilderExtender builderextender);
    }

    static class NotificationCompatImplApi20 extends NotificationCompatImplKitKat
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builderextender.build(builder, builder1);
        }

        NotificationCompatImplApi20()
        {
        }
    }

    static class NotificationCompatImplApi21 extends NotificationCompatImplApi20
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builderextender.build(builder, builder1);
        }

        NotificationCompatImplApi21()
        {
        }
    }

    static class NotificationCompatImplBase
        implements NotificationCompatImpl
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            builderextender = builder.mNotification;
            builderextender.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            if (builder.mPriority > 0)
            {
                builderextender.flags = ((Notification) (builderextender)).flags | 0x80;
            }
            return builderextender;
        }

        NotificationCompatImplBase()
        {
        }
    }

    static class NotificationCompatImplGingerbread extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            builderextender = builder.mNotification;
            builderextender.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            builderextender = NotificationCompatGingerbread.add(builderextender, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent, builder.mFullScreenIntent);
            if (builder.mPriority > 0)
            {
                builderextender.flags = ((Notification) (builderextender)).flags | 0x80;
            }
            return builderextender;
        }

        NotificationCompatImplGingerbread()
        {
        }
    }

    static class NotificationCompatImplHoneycomb extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            return NotificationCompatHoneycomb.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon);
        }

        NotificationCompatImplHoneycomb()
        {
        }
    }

    static class NotificationCompatImplIceCreamSandwich extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            return builderextender.build(builder, new NotificationCompatIceCreamSandwich.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate));
        }

        NotificationCompatImplIceCreamSandwich()
        {
        }
    }

    static class NotificationCompatImplJellybean extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builderextender.build(builder, builder1);
        }

        NotificationCompatImplJellybean()
        {
        }
    }

    static class NotificationCompatImplKitKat extends NotificationCompatImplJellybean
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builderextender.build(builder, builder1);
        }

        NotificationCompatImplKitKat()
        {
        }
    }

    public static abstract class Style
    {

        CharSequence mBigContentTitle;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Style()
        {
            mSummaryTextSet = false;
        }
    }


    private static final NotificationCompatImpl IMPL;

    private static void addActionsToBuilder(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); notificationbuilderwithactions.addAction((Action)arraylist.next())) { }
    }

    private static void addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Style style)
    {
        if (style != null)
        {
            if (style instanceof BigTextStyle)
            {
                style = (BigTextStyle)style;
                NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((BigTextStyle) (style)).mBigContentTitle, ((BigTextStyle) (style)).mSummaryTextSet, ((BigTextStyle) (style)).mSummaryText, ((BigTextStyle) (style)).mBigText);
            } else
            {
                if (style instanceof InboxStyle)
                {
                    style = (InboxStyle)style;
                    NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, ((InboxStyle) (style)).mBigContentTitle, ((InboxStyle) (style)).mSummaryTextSet, ((InboxStyle) (style)).mSummaryText, ((InboxStyle) (style)).mTexts);
                    return;
                }
                if (style instanceof BigPictureStyle)
                {
                    style = (BigPictureStyle)style;
                    NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, ((BigPictureStyle) (style)).mBigContentTitle, ((BigPictureStyle) (style)).mSummaryTextSet, ((BigPictureStyle) (style)).mSummaryText, ((BigPictureStyle) (style)).mPicture, ((BigPictureStyle) (style)).mBigLargeIcon, ((BigPictureStyle) (style)).mBigLargeIconSet);
                    return;
                }
            }
        }
    }

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



}
