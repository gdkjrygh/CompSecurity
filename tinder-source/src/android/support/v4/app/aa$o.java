// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aa, af, ai

static class  extends 
{

    public Notification a( ,  1)
    {
         2 = new <init>(.mContext, .mNotification, .mContentTitle, .mContentText, .mContentInfo, .mTickerView, .mNumber, .mContentIntent, .mFullScreenIntent, .mLargeIcon, .mProgressMax, .mProgress, .mProgressIndeterminate, .mUseChronometer, .mPriority, .mSubText, .mLocalOnly, .mExtras, .mGroupKey, .mGroupSummary, .mSortKey);
        aa.access$000(2, .mActions);
        aa.access$100(2, .mStyle);
        return 1.build(, 2);
    }

    public Bundle a(Notification notification)
    {
        return af.a(notification);
    }

    public build a(Notification notification, int i)
    {
        return (a)af.a(notification, i, d, ai.a);
    }

    public ArrayList a(a aa1[])
    {
        return af.a(aa1);
    }

    public int b(Notification notification)
    {
        return af.b(notification);
    }

    public boolean d(Notification notification)
    {
        return af.c(notification);
    }

    public String e(Notification notification)
    {
        return af.d(notification);
    }

    public boolean f(Notification notification)
    {
        return af.e(notification);
    }

    public String g(Notification notification)
    {
        return af.f(notification);
    }

    ()
    {
    }
}
