// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.mdx.MdxAgent;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx.notification:
//            MdxRemoteViewManager

public final class MdxNotificationManager
{
    public static interface MdxNotificationIntentRetriever
    {

        public abstract PendingIntent getNoActionIntent();

        public abstract PendingIntent getPauseIntent();

        public abstract PendingIntent getPlayNextIntent();

        public abstract PendingIntent getResumeIntent();

        public abstract PendingIntent getSkipbackIntent(int i);

        public abstract PendingIntent getStopIntent();
    }


    private static final String TAG = "nf_mdxnotification";
    android.support.v4.app.NotificationCompat.Builder mBuilder;
    Context mContext;
    private boolean mInTransition;
    private boolean mIsEpisode;
    private boolean mIsInPostPlay;
    private boolean mIsLegacy;
    Notification mLegacyNotification;
    MdxAgent mMdxAgent;
    private final int mNotificationId = 1;
    NotificationManager mNotificationManager;
    private boolean mPaused;
    MdxRemoteViewManager mRemoteViews;
    private boolean mSupportBigContent;

    public MdxNotificationManager(Context context, boolean flag, MdxAgent mdxagent)
    {
        Log.d("nf_mdxnotification", (new StringBuilder()).append("is episode ").append(flag).toString());
        mContext = context;
        mIsEpisode = flag;
        mMdxAgent = mdxagent;
        mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
        mSupportBigContent = false;
        mIsLegacy = false;
        int i = AndroidUtils.getAndroidVersion();
        if (i >= 16)
        {
            mSupportBigContent = true;
        } else
        if (i < 11)
        {
            mIsLegacy = true;
        }
        mRemoteViews = new MdxRemoteViewManager(mContext.getPackageName(), mIsEpisode, mIsLegacy, mdxagent);
        if (mIsLegacy)
        {
            mLegacyNotification = new Notification(0x7f020101, "", System.currentTimeMillis());
            mLegacyNotification.contentView = mRemoteViews.getRemoteView();
            context = mLegacyNotification;
            context.flags = ((Notification) (context)).flags | 2;
            context = mLegacyNotification;
            context.flags = ((Notification) (context)).flags | 8;
            mLegacyNotification.contentIntent = createNotificationPendingIntent();
            return;
        } else
        {
            mBuilder = (new android.support.v4.app.NotificationCompat.Builder(mContext)).setOngoing(true).setOnlyAlertOnce(true).setSmallIcon(0x7f020101).setWhen(System.currentTimeMillis());
            return;
        }
    }

    private PendingIntent createNotificationPendingIntent()
    {
        return PendingIntent.getBroadcast(mContext, 0, NetflixService.createShowMdxPlayerBroadcastIntent(), 0x8000000);
    }

    private void updateNotification()
    {
        if (mIsLegacy)
        {
            mLegacyNotification.contentView = mRemoteViews.getRemoteView();
            mNotificationManager.notify(1, mLegacyNotification);
            return;
        }
        mBuilder.setContent(mRemoteViews.getRemoteView());
        Notification notification = mBuilder.build();
        if (mSupportBigContent)
        {
            notification.bigContentView = mRemoteViews.getRemoteViewBigContetnt();
        }
        mNotificationManager.notify(1, notification);
    }

    public void cancelNotification()
    {
        mNotificationManager.cancel(1);
    }

    public Pair getNotification()
    {
        if (mIsLegacy)
        {
            return Pair.create(Integer.valueOf(1), mLegacyNotification);
        } else
        {
            return Pair.create(Integer.valueOf(1), mBuilder.build());
        }
    }

    public void setBoxart(Bitmap bitmap)
    {
        mRemoteViews.setBoxart(bitmap);
    }

    public void setBoxartNotify(Bitmap bitmap)
    {
        mRemoteViews.setBoxart(bitmap);
        updateNotification();
    }

    public void setPauseStateNotify(boolean flag, boolean flag1, boolean flag2)
    {
        mPaused = flag;
        mInTransition = flag1;
        mIsInPostPlay = flag2;
        mRemoteViews.setPauseState(flag, flag1, flag2);
        updateNotification();
    }

    public void setPlayNextState()
    {
        mRemoteViews.setPlayNextState();
    }

    public void setTitlesNotify(boolean flag, String s, String s1, String s2)
    {
        if (Log.isLoggable("nf_mdxnotification", 3))
        {
            Log.d("nf_mdxnotification", (new StringBuilder()).append("is episode ").append(flag).append(",>").append(s).append(",>").append(s1).toString());
        }
        mIsEpisode = flag;
        if (mIsLegacy)
        {
            mLegacyNotification.contentIntent = createNotificationPendingIntent();
            if (mIsEpisode)
            {
                mLegacyNotification.tickerText = s1;
            } else
            {
                mLegacyNotification.tickerText = s;
            }
        } else
        {
            mBuilder.setContentIntent(createNotificationPendingIntent());
            if (mIsEpisode)
            {
                mBuilder.setTicker(s1);
            } else
            {
                mBuilder.setTicker(s);
            }
        }
        mRemoteViews.setTitles(mIsEpisode, s, s1, s2);
        updateNotification();
    }

    public void setUpNextStateNotify(boolean flag, boolean flag1, boolean flag2)
    {
        if (flag2)
        {
            mPaused = flag;
            mInTransition = flag1;
            mIsInPostPlay = flag2;
            mRemoteViews.setPauseState(flag, flag1, flag2);
            updateNotification();
        }
    }

    public void showSkipBack(boolean flag)
    {
        mRemoteViews.showSkipBack(flag);
    }
}
