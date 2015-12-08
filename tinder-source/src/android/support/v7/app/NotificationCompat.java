// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import android.support.v7.internal.app.NotificationCompatImpl21;
import android.support.v7.internal.app.NotificationCompatImplBase;

public class NotificationCompat extends aa
{
    public static class Builder extends android.support.v4.app.aa.d
    {

        protected android.support.v4.app.aa.e getExtender()
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

    private static class IceCreamSandwichExtender extends android.support.v4.app.aa.e
    {

        public Notification build(android.support.v4.app.aa.d d, z z1)
        {
            NotificationCompat.addMediaStyleToBuilderIcs(z1, d);
            return z1.b();
        }

        private IceCreamSandwichExtender()
        {
        }

    }

    private static class JellybeanExtender extends android.support.v4.app.aa.e
    {

        public Notification build(android.support.v4.app.aa.d d, z z1)
        {
            NotificationCompat.addMediaStyleToBuilderIcs(z1, d);
            z1 = z1.b();
            NotificationCompat.addBigMediaStyleToBuilderJellybean(z1, d);
            return z1;
        }

        private JellybeanExtender()
        {
        }

    }

    private static class LollipopExtender extends android.support.v4.app.aa.e
    {

        public Notification build(android.support.v4.app.aa.d d, z z1)
        {
            NotificationCompat.addMediaStyleToBuilderLollipop(z1, d.mStyle);
            return z1.b();
        }

        private LollipopExtender()
        {
        }

    }

    public static class MediaStyle extends android.support.v4.app.aa.q
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

        public MediaStyle(android.support.v4.app.aa.d d)
        {
            mActionsToShowInCompact = null;
            setBuilder(d);
        }
    }


    public NotificationCompat()
    {
    }

    private static void addBigMediaStyleToBuilderJellybean(Notification notification, android.support.v4.app.aa.d d)
    {
        if (d.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)d.mStyle;
            NotificationCompatImplBase.overrideBigContentView(notification, d.mContext, d.mContentTitle, d.mContentText, d.mContentInfo, d.mNumber, d.mLargeIcon, d.mSubText, d.mUseChronometer, d.mNotification.when, d.mActions, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderIcs(z z, android.support.v4.app.aa.d d)
    {
        if (d.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)d.mStyle;
            NotificationCompatImplBase.overrideContentView(z, d.mContext, d.mContentTitle, d.mContentText, d.mContentInfo, d.mNumber, d.mLargeIcon, d.mSubText, d.mUseChronometer, d.mNotification.when, d.mActions, mediastyle.mActionsToShowInCompact, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderLollipop(z z, android.support.v4.app.aa.q q)
    {
        if (q instanceof MediaStyle)
        {
            q = (MediaStyle)q;
            int ai[] = ((MediaStyle) (q)).mActionsToShowInCompact;
            if (((MediaStyle) (q)).mToken != null)
            {
                q = ((android.support.v4.app.aa.q) (((MediaStyle) (q)).mToken.a));
            } else
            {
                q = null;
            }
            NotificationCompatImpl21.addMediaStyle(z, ai, q);
        }
    }



}
