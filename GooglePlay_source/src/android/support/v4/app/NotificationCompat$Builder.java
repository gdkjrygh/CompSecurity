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

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static final class mPeople
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
    public limitCharSequenceLength mStyle;
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
        tionCompatImpl tioncompatimpl = NotificationCompat.access$200();
        new xtender();
        return tioncompatimpl.ab8b522(this);
    }

    public final tionCompatImpl.build.ab8b522 setContentInfo(CharSequence charsequence)
    {
        mContentInfo = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setContentText(CharSequence charsequence)
    {
        mContentText = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setContentTitle(CharSequence charsequence)
    {
        mContentTitle = limitCharSequenceLength(charsequence);
        return this;
    }

    public final limitCharSequenceLength setDeleteIntent(PendingIntent pendingintent)
    {
        mNotification.deleteIntent = pendingintent;
        return this;
    }

    public final void setFlag(int i, boolean flag)
    {
        Notification notification = mNotification;
        notification.flags = notification.flags | i;
    }

    public final mNotification setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public final mNotification setStyle(mNotification mnotification)
    {
        if (mStyle != mnotification)
        {
            mStyle = mnotification;
            if (mStyle != null)
            {
                mnotification = mStyle;
                if (mnotification.uilder != this)
                {
                    mnotification.uilder = this;
                    if (mnotification.uilder != null)
                    {
                        mnotification.uilder.setStyle(mnotification);
                    }
                }
            }
        }
        return this;
    }

    public final setStyle setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
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
