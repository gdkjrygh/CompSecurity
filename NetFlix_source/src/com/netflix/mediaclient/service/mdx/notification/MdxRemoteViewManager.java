// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.notification;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

public final class MdxRemoteViewManager
{

    private static final String TAG = "nf_mdxnotification";
    private Bitmap mBoxart;
    RemoteViews mExpandedRemoteView;
    private String mHeaderTitle;
    private boolean mInTransition;
    private final MdxNotificationManager.MdxNotificationIntentRetriever mIntentRetriever;
    private boolean mIsEpisode;
    private boolean mIsInPostPlay;
    private final boolean mIsLegacy;
    private String mMainTitle;
    RemoteViews mNormalRemoteView;
    private final String mPackageName;
    private boolean mPaused;
    private String mSubTitle;

    public MdxRemoteViewManager(String s, boolean flag, boolean flag1, MdxNotificationManager.MdxNotificationIntentRetriever mdxnotificationintentretriever)
    {
        mPackageName = s;
        mIsLegacy = flag1;
        mIsEpisode = flag;
        mIntentRetriever = mdxnotificationintentretriever;
    }

    private RemoteViews createRemoteView(boolean flag)
    {
        RemoteViews remoteviews;
        if (mIsLegacy)
        {
            if (mIsEpisode)
            {
                remoteviews = new RemoteViews(mPackageName, 0x7f030057);
            } else
            {
                remoteviews = new RemoteViews(mPackageName, 0x7f03005a);
            }
        } else
        if (mIsEpisode)
        {
            if (flag)
            {
                remoteviews = new RemoteViews(mPackageName, 0x7f030056);
            } else
            {
                remoteviews = new RemoteViews(mPackageName, 0x7f030055);
            }
        } else
        if (flag)
        {
            remoteviews = new RemoteViews(mPackageName, 0x7f030059);
        } else
        {
            remoteviews = new RemoteViews(mPackageName, 0x7f030058);
        }
        updateBoxart(remoteviews);
        updateTitles(remoteviews);
        updateControl(remoteviews);
        return remoteviews;
    }

    private void setPauseActive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012b, 0x7f020126);
        remoteviews.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getPauseIntent());
    }

    private void setPauseInactive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012b, 0x7f020127);
        remoteviews.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getNoActionIntent());
    }

    private void setPlayActiveWithGetNext(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012b, 0x7f020128);
        remoteviews.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getPlayNextIntent());
    }

    private void setPlayActiveWithResume(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012b, 0x7f020128);
        remoteviews.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getResumeIntent());
    }

    private void setPlayInactive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012b, 0x7f020129);
        remoteviews.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getNoActionIntent());
    }

    private void setSkipActive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012a, 0x7f020124);
        remoteviews.setOnClickPendingIntent(0x7f07012a, mIntentRetriever.getSkipbackIntent(-30));
    }

    private void setSkipInactive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012a, 0x7f020125);
        remoteviews.setOnClickPendingIntent(0x7f07012a, mIntentRetriever.getNoActionIntent());
    }

    private void setStopActive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012c, 0x7f02012a);
        remoteviews.setOnClickPendingIntent(0x7f07012c, mIntentRetriever.getStopIntent());
    }

    private void setStopInactive(RemoteViews remoteviews)
    {
        remoteviews.setImageViewResource(0x7f07012c, 0x7f02012b);
        remoteviews.setOnClickPendingIntent(0x7f07012c, mIntentRetriever.getNoActionIntent());
    }

    private void updateBoxart(RemoteViews remoteviews)
    {
        if (mBoxart != null)
        {
            remoteviews.setImageViewBitmap(0x7f070127, mBoxart);
        }
    }

    private void updateControl(RemoteViews remoteviews)
    {
        if (mIsLegacy)
        {
            return;
        }
        if (!mInTransition)
        {
            setSkipActive(remoteviews);
            setStopActive(remoteviews);
            if (mIsInPostPlay)
            {
                setPlayActiveWithGetNext(remoteviews);
                showSkipBack(false);
                return;
            }
            if (mPaused)
            {
                setPlayActiveWithResume(remoteviews);
                showSkipBack(true);
                return;
            } else
            {
                setPauseActive(remoteviews);
                showSkipBack(true);
                return;
            }
        }
        setSkipInactive(remoteviews);
        setStopInactive(remoteviews);
        if (mIsInPostPlay)
        {
            setPlayInactive(remoteviews);
            showSkipBack(false);
        }
        if (mPaused)
        {
            setPlayInactive(remoteviews);
            showSkipBack(true);
            return;
        } else
        {
            setPauseInactive(remoteviews);
            showSkipBack(true);
            return;
        }
    }

    private void updateTitles(RemoteViews remoteviews)
    {
label0:
        {
            if (StringUtils.isNotEmpty(mMainTitle))
            {
                remoteviews.setTextViewText(0x7f070128, mMainTitle);
            } else
            {
                remoteviews.setTextViewText(0x7f070128, "");
            }
            if (StringUtils.isNotEmpty(mHeaderTitle))
            {
                remoteviews.setTextViewText(0x7f07012e, mHeaderTitle);
            } else
            {
                remoteviews.setTextViewText(0x7f07012e, "");
            }
            if (mIsEpisode)
            {
                if (!StringUtils.isNotEmpty(mSubTitle))
                {
                    break label0;
                }
                remoteviews.setTextViewText(0x7f070129, mSubTitle);
            }
            return;
        }
        remoteviews.setTextViewText(0x7f070129, "");
    }

    public RemoteViews getRemoteView()
    {
        if (mNormalRemoteView == null)
        {
            mNormalRemoteView = createRemoteView(false);
        }
        return mNormalRemoteView;
    }

    public RemoteViews getRemoteViewBigContetnt()
    {
        if (mExpandedRemoteView == null && !mIsLegacy)
        {
            mExpandedRemoteView = createRemoteView(true);
        }
        return mExpandedRemoteView;
    }

    public void setBoxart(Bitmap bitmap)
    {
        Log.d("nf_mdxnotification", "MdxRemoteViewManager:setBoxart");
        mBoxart = bitmap;
        if (mNormalRemoteView != null)
        {
            updateBoxart(mNormalRemoteView);
        }
        if (mExpandedRemoteView != null)
        {
            updateBoxart(mExpandedRemoteView);
        }
    }

    public void setPauseState(boolean flag, boolean flag1, boolean flag2)
    {
        mPaused = flag;
        mInTransition = flag1;
        mIsInPostPlay = flag2;
        if (mNormalRemoteView != null)
        {
            updateControl(mNormalRemoteView);
        }
        if (mExpandedRemoteView != null)
        {
            updateControl(mExpandedRemoteView);
        }
    }

    public void setPlayNextState()
    {
        if (mExpandedRemoteView != null)
        {
            mExpandedRemoteView.setImageViewResource(0x7f07012b, 0x7f020128);
            if (mIntentRetriever.getPlayNextIntent() != null)
            {
                mExpandedRemoteView.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getPlayNextIntent());
            }
            mExpandedRemoteView.setImageViewResource(0x7f07012c, 0x7f02012a);
            mExpandedRemoteView.setOnClickPendingIntent(0x7f07012c, mIntentRetriever.getStopIntent());
        }
        if (mNormalRemoteView != null)
        {
            mNormalRemoteView.setImageViewResource(0x7f07012b, 0x7f020128);
            if (mIntentRetriever.getPlayNextIntent() != null)
            {
                mNormalRemoteView.setOnClickPendingIntent(0x7f07012b, mIntentRetriever.getPlayNextIntent());
            }
            mNormalRemoteView.setImageViewResource(0x7f07012c, 0x7f02012a);
            mNormalRemoteView.setOnClickPendingIntent(0x7f07012c, mIntentRetriever.getStopIntent());
        }
    }

    public void setTitles(boolean flag, String s, String s1, String s2)
    {
        if (mIsEpisode != flag)
        {
            mIsEpisode = flag;
            mNormalRemoteView = createRemoteView(false);
            if (mExpandedRemoteView != null && !mIsLegacy)
            {
                mExpandedRemoteView = createRemoteView(true);
            }
        }
        mHeaderTitle = s2;
        mMainTitle = s;
        mSubTitle = s1;
        if (mNormalRemoteView != null)
        {
            updateTitles(mNormalRemoteView);
        }
        if (mExpandedRemoteView != null)
        {
            updateTitles(mExpandedRemoteView);
        }
    }

    public void showSkipBack(boolean flag)
    {
        if (flag)
        {
            if (mExpandedRemoteView != null)
            {
                mExpandedRemoteView.setViewVisibility(0x7f07012a, 0);
            }
            if (mNormalRemoteView != null)
            {
                mNormalRemoteView.setViewVisibility(0x7f07012a, 0);
            }
        } else
        {
            if (mExpandedRemoteView != null)
            {
                mExpandedRemoteView.setViewVisibility(0x7f07012a, 8);
            }
            if (mNormalRemoteView != null)
            {
                mNormalRemoteView.setViewVisibility(0x7f07012a, 8);
                return;
            }
        }
    }
}
