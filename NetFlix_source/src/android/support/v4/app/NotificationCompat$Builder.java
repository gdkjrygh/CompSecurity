// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static class mPriority
{

    ArrayList mActions;
    CharSequence mContentInfo;
    PendingIntent mContentIntent;
    CharSequence mContentText;
    CharSequence mContentTitle;
    Context mContext;
    PendingIntent mFullScreenIntent;
    Bitmap mLargeIcon;
    Notification mNotification;
    int mNumber;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    mNotification mStyle;
    CharSequence mSubText;
    RemoteViews mTickerView;
    boolean mUseChronometer;

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

    public mNotification addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        mActions.add(new init>(i, charsequence, pendingintent));
        return this;
    }

    public Notification build()
    {
        return NotificationCompat.access$000().build(this);
    }

    public Notification getNotification()
    {
        return NotificationCompat.access$000().build(this);
    }

    public tionCompatImpl.build setAutoCancel(boolean flag)
    {
        setFlag(16, flag);
        return this;
    }

    public setFlag setContent(RemoteViews remoteviews)
    {
        mNotification.contentView = remoteviews;
        return this;
    }

    public mNotification setContentInfo(CharSequence charsequence)
    {
        mContentInfo = charsequence;
        return this;
    }

    public mContentInfo setContentIntent(PendingIntent pendingintent)
    {
        mContentIntent = pendingintent;
        return this;
    }

    public mContentIntent setContentText(CharSequence charsequence)
    {
        mContentText = charsequence;
        return this;
    }

    public mContentText setContentTitle(CharSequence charsequence)
    {
        mContentTitle = charsequence;
        return this;
    }

    public mContentTitle setDefaults(int i)
    {
        mNotification.defaults = i;
        if ((i & 4) != 0)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public mNotification setDeleteIntent(PendingIntent pendingintent)
    {
        mNotification.deleteIntent = pendingintent;
        return this;
    }

    public mNotification setFullScreenIntent(PendingIntent pendingintent, boolean flag)
    {
        mFullScreenIntent = pendingintent;
        setFlag(128, flag);
        return this;
    }

    public setFlag setLargeIcon(Bitmap bitmap)
    {
        mLargeIcon = bitmap;
        return this;
    }

    public mLargeIcon setLights(int i, int j, int k)
    {
        boolean flag = true;
        mNotification.ledARGB = i;
        mNotification.ledOnMS = j;
        mNotification.ledOffMS = k;
        Notification notification;
        if (mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        notification = mNotification;
        j = mNotification.flags;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        notification.flags = i | j & -2;
        return this;
    }

    public mNotification setNumber(int i)
    {
        mNumber = i;
        return this;
    }

    public mNumber setOngoing(boolean flag)
    {
        setFlag(2, flag);
        return this;
    }

    public setFlag setOnlyAlertOnce(boolean flag)
    {
        setFlag(8, flag);
        return this;
    }

    public setFlag setPriority(int i)
    {
        mPriority = i;
        return this;
    }

    public mPriority setProgress(int i, int j, boolean flag)
    {
        mProgressMax = i;
        mProgress = j;
        mProgressIndeterminate = flag;
        return this;
    }

    public mProgressIndeterminate setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public mNotification setSmallIcon(int i, int j)
    {
        mNotification.icon = i;
        mNotification.iconLevel = j;
        return this;
    }

    public mNotification setSound(Uri uri)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = -1;
        return this;
    }

    public mNotification setSound(Uri uri, int i)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = i;
        return this;
    }

    public mNotification setStyle(mNotification mnotification)
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

    public tBuilder setSubText(CharSequence charsequence)
    {
        mSubText = charsequence;
        return this;
    }

    public mSubText setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = charsequence;
        return this;
    }

    public mNotification setTicker(CharSequence charsequence, RemoteViews remoteviews)
    {
        mNotification.tickerText = charsequence;
        mTickerView = remoteviews;
        return this;
    }

    public mTickerView setUsesChronometer(boolean flag)
    {
        mUseChronometer = flag;
        return this;
    }

    public mUseChronometer setVibrate(long al[])
    {
        mNotification.vibrate = al;
        return this;
    }

    public mNotification setWhen(long l)
    {
        mNotification.when = l;
        return this;
    }

    public tionCompatImpl(Context context)
    {
        mActions = new ArrayList();
        mNotification = new Notification();
        mContext = context;
        mNotification.when = System.currentTimeMillis();
        mNotification.audioStreamType = -1;
        mPriority = 0;
    }
}
