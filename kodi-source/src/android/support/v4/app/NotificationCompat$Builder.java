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

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static class mPeople
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
    public mVisibility mStyle;
    public CharSequence mSubText;
    RemoteViews mTickerView;
    public boolean mUseChronometer;
    int mVisibility;

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
        return NotificationCompat.access$200().build(this, getExtender());
    }

    protected xtender getExtender()
    {
        return new xtender();
    }

    public xtender setCategory(String s)
    {
        mCategory = s;
        return this;
    }

    public mCategory setContent(RemoteViews remoteviews)
    {
        mNotification.contentView = remoteviews;
        return this;
    }

    public mNotification setContentIntent(PendingIntent pendingintent)
    {
        mContentIntent = pendingintent;
        return this;
    }

    public mContentIntent setOngoing(boolean flag)
    {
        setFlag(2, flag);
        return this;
    }

    public setFlag setShowWhen(boolean flag)
    {
        mShowWhen = flag;
        return this;
    }

    public mShowWhen setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public mNotification setVisibility(int i)
    {
        mVisibility = i;
        return this;
    }

    public xtender(Context context)
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
