// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static final class mPeople
{

    ArrayList mActions;
    String mCategory;
    int mColor;
    CharSequence mContentInfo;
    PendingIntent mContentIntent;
    CharSequence mContentText;
    CharSequence mContentTitle;
    Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    String mGroupKey;
    boolean mGroupSummary;
    Bitmap mLargeIcon;
    boolean mLocalOnly;
    Notification mNotification;
    int mNumber;
    public ArrayList mPeople;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    boolean mShowWhen;
    String mSortKey;
    mNotification mStyle;
    CharSequence mSubText;
    RemoteViews mTickerView;
    boolean mUseChronometer;
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

    public final mNotification addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        mActions.add(new init>(i, charsequence, pendingintent));
        return this;
    }

    public final Notification build()
    {
        return NotificationCompat.access$200().build(this);
    }

    public final tionCompatImpl.build setAutoCancel(boolean flag)
    {
        setFlag(16, flag);
        return this;
    }

    public final setFlag setColor(int i)
    {
        mColor = i;
        return this;
    }

    public final mColor setContentIntent(PendingIntent pendingintent)
    {
        mContentIntent = pendingintent;
        return this;
    }

    public final mContentIntent setContentText(CharSequence charsequence)
    {
        mContentText = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setContentTitle(CharSequence charsequence)
    {
        mContentTitle = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setDefaults(int i)
    {
        mNotification.defaults = i;
        if ((i & 4) != 0)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public final mNotification setDeleteIntent(PendingIntent pendingintent)
    {
        mNotification.deleteIntent = pendingintent;
        return this;
    }

    public final mNotification setLargeIcon(Bitmap bitmap)
    {
        mLargeIcon = bitmap;
        return this;
    }

    public final mLargeIcon setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public final mNotification setSound(Uri uri)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = -1;
        return this;
    }

    public final mNotification setStyle(mNotification mnotification)
    {
        if (mStyle != mnotification)
        {
            mStyle = mnotification;
            if (mStyle != null)
            {
                mStyle.tBuilder(this);
            }
        }
        return this;
    }

    public final tBuilder setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setWhen(long l)
    {
        mNotification.when = l;
        return this;
    }

    public tionCompatImpl(Context context)
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
