// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;

// Referenced classes of package android.support.v4.app:
//            aa, ai, af

static class ion extends ion
{

    public Notification a(ion ion, ion ion1)
    {
        ion ion2 = new <init>(ion.mContext, ion.mNotification, ion.mContentTitle, ion.mContentText, ion.mContentInfo, ion.mTickerView, ion.mNumber, ion.mContentIntent, ion.mFullScreenIntent, ion.mLargeIcon, ion.mProgressMax, ion.mProgress, ion.mProgressIndeterminate, ion.mShowWhen, ion.mUseChronometer, ion.mPriority, ion.mSubText, ion.mLocalOnly, ion.mPeople, ion.mExtras, ion.mGroupKey, ion.mGroupSummary, ion.mSortKey);
        aa.access$000(ion2, ion.mActions);
        aa.access$100(ion2, ion.mStyle);
        return ion1.build(ion, ion2);
    }

    public final Bundle a(Notification notification)
    {
        return notification.extras;
    }

    public ras a(Notification notification, int i)
    {
        a a1 = d;
        a a2 = ai.a;
        android.app.ication.Action action = notification.actions[i];
        Object obj = null;
        SparseArray sparsearray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
        notification = obj;
        if (sparsearray != null)
        {
            notification = (Bundle)sparsearray.get(i);
        }
        return ()af.a(a1, a2, action.icon, action.title, action.actionIntent, notification);
    }

    public final int b(Notification notification)
    {
        if (notification.actions != null)
        {
            return notification.actions.length;
        } else
        {
            return 0;
        }
    }

    public boolean d(Notification notification)
    {
        return notification.extras.getBoolean("android.support.localOnly");
    }

    public String e(Notification notification)
    {
        return notification.extras.getString("android.support.groupKey");
    }

    public boolean f(Notification notification)
    {
        return notification.extras.getBoolean("android.support.isGroupSummary");
    }

    public String g(Notification notification)
    {
        return notification.extras.getString("android.support.sortKey");
    }

    ion()
    {
    }
}
