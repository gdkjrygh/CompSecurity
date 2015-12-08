// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aa, ai, ab

static class a extends a
{

    public Notification a(a a1, a a2)
    {
        a a3 = new <init>(a1.mContext, a1.mNotification, a1.mContentTitle, a1.mContentText, a1.mContentInfo, a1.mTickerView, a1.mNumber, a1.mContentIntent, a1.mFullScreenIntent, a1.mLargeIcon, a1.mProgressMax, a1.mProgress, a1.mProgressIndeterminate, a1.mShowWhen, a1.mUseChronometer, a1.mPriority, a1.mSubText, a1.mLocalOnly, a1.mPeople, a1.mExtras, a1.mGroupKey, a1.mGroupSummary, a1.mSortKey);
        aa.access$000(a3, a1.mActions);
        aa.access$100(a3, a1.mStyle);
        return a2.build(a1, a3);
    }

    public final build a(Notification notification, int j)
    {
        a a1 = d;
        a a2 = ai.a;
        android.app.ication.Action action = notification.actions[j];
        RemoteInput aremoteinput[] = action.getRemoteInputs();
        if (aremoteinput == null)
        {
            notification = null;
        } else
        {
            notification = a2.a(aremoteinput.length);
            j = 0;
            while (j < aremoteinput.length) 
            {
                RemoteInput remoteinput = aremoteinput[j];
                notification[j] = a2.a(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
                j++;
            }
        }
        return (xtras)a1.a(action.icon, action.title, action.actionIntent, action.getExtras(), notification);
    }

    public final ArrayList a(etExtras aetextras[])
    {
        if (aetextras != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = null;
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(aetextras.length);
        int k = aetextras.length;
        int j = 0;
        do
        {
            arraylist = arraylist1;
            if (j >= k)
            {
                continue;
            }
            arraylist1.add(ab.a(aetextras[j]));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean d(Notification notification)
    {
        return (notification.flags & 0x100) != 0;
    }

    public final String e(Notification notification)
    {
        return notification.getGroup();
    }

    public final boolean f(Notification notification)
    {
        return (notification.flags & 0x200) != 0;
    }

    public final String g(Notification notification)
    {
        return notification.getSortKey();
    }

    a()
    {
    }
}
