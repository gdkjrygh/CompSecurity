// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            aa

static final class  extends 
{

    public final Notification a( ,  1)
    {
         2 = new <init>(.mContext, .mNotification, .mContentTitle, .mContentText, .mContentInfo, .mTickerView, .mNumber, .mContentIntent, .mFullScreenIntent, .mLargeIcon, .mProgressMax, .mProgress, .mProgressIndeterminate, .mShowWhen, .mUseChronometer, .mPriority, .mSubText, .mLocalOnly, .mCategory, .mPeople, .mExtras, .mColor, .mVisibility, .mPublicVersion, .mGroupKey, .mGroupSummary, .mSortKey);
        aa.access$000(2, .mActions);
        aa.access$100(2, .mStyle);
        return 1.build(, 2);
    }

    public final String c(Notification notification)
    {
        return notification.category;
    }

    ()
    {
    }
}
