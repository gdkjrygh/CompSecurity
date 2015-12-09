// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

// Referenced classes of package android.support.v7.app:
//            NotificationCompatImplBase, NotificationCompatImpl21

public class NotificationCompat extends android.support.v4.app.NotificationCompat
{
    public static class Builder extends android.support.v4.app.Builder
    {

        protected android.support.v4.app.BuilderExtender getExtender()
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                return new LollipopExtender();
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                return new JellybeanExtender();
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                return new IceCreamSandwichExtender();
            } else
            {
                return super.getExtender();
            }
        }

        public Builder(Context context)
        {
            super(context);
        }
    }

    private static class IceCreamSandwichExtender extends android.support.v4.app.BuilderExtender
    {

        public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
        {
            NotificationCompat.addMediaStyleToBuilderIcs(notificationbuilderwithbuilderaccessor, builder);
            return notificationbuilderwithbuilderaccessor.build();
        }

        private IceCreamSandwichExtender()
        {
        }

    }

    private static class JellybeanExtender extends android.support.v4.app.BuilderExtender
    {

        public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
        {
            NotificationCompat.addMediaStyleToBuilderIcs(notificationbuilderwithbuilderaccessor, builder);
            notificationbuilderwithbuilderaccessor = notificationbuilderwithbuilderaccessor.build();
            NotificationCompat.addBigMediaStyleToBuilderJellybean(notificationbuilderwithbuilderaccessor, builder);
            return notificationbuilderwithbuilderaccessor;
        }

        private JellybeanExtender()
        {
        }

    }

    private static class LollipopExtender extends android.support.v4.app.BuilderExtender
    {

        public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
        {
            NotificationCompat.addMediaStyleToBuilderLollipop(notificationbuilderwithbuilderaccessor, builder.mStyle);
            return notificationbuilderwithbuilderaccessor.build();
        }

        private LollipopExtender()
        {
        }

    }

    public static class MediaStyle extends android.support.v4.app.Style
    {

        int mActionsToShowInCompact[];
        PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        android.support.v4.media.session.MediaSessionCompat.Token mToken;

        public MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
        {
            mCancelButtonIntent = pendingintent;
            return this;
        }

        public MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
        {
            mToken = token;
            return this;
        }

        public transient MediaStyle setShowActionsInCompactView(int ai[])
        {
            mActionsToShowInCompact = ai;
            return this;
        }

        public MediaStyle setShowCancelButton(boolean flag)
        {
            mShowCancelButton = flag;
            return this;
        }

        public MediaStyle()
        {
            mActionsToShowInCompact = null;
        }

        public MediaStyle(android.support.v4.app.Builder builder)
        {
            mActionsToShowInCompact = null;
            setBuilder(builder);
        }
    }


    public NotificationCompat()
    {
    }

    private static void addBigMediaStyleToBuilderJellybean(Notification notification, android.support.v4.app.Builder builder)
    {
        if (builder.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)builder.mStyle;
            NotificationCompatImplBase.overrideBigContentView(notification, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.mNotification.when, builder.mActions, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderIcs(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
    {
        if (builder.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)builder.mStyle;
            NotificationCompatImplBase.overrideContentView(notificationbuilderwithbuilderaccessor, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.mNotification.when, builder.mActions, mediastyle.mActionsToShowInCompact, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderLollipop(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Style style)
    {
        if (style instanceof MediaStyle)
        {
            style = (MediaStyle)style;
            int ai[] = ((MediaStyle) (style)).mActionsToShowInCompact;
            if (((MediaStyle) (style)).mToken != null)
            {
                style = ((android.support.v4.app.Style) (((MediaStyle) (style)).mToken.getToken()));
            } else
            {
                style = null;
            }
            NotificationCompatImpl21.addMediaStyle(notificationbuilderwithbuilderaccessor, ai, style);
        }
    }



}
