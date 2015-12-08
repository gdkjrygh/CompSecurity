// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.stats:
//            StatsEvent, ConnectionEventCreator

public final class ConnectionEvent extends StatsEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ConnectionEventCreator();
    final String mCallingProcess;
    final String mCallingService;
    final String mConnKey;
    private long mDurationMillis;
    final long mElapsedRealtime;
    int mEventType;
    final long mHeapAlloc;
    final String mStackTrace;
    final String mTargetProcess;
    final String mTargetService;
    final long mTimeMillis;
    final int mVersionCode;

    ConnectionEvent(int i, long l, int j, String s, String s1, String s2, 
            String s3, String s4, String s5, long l1, long l2)
    {
        mVersionCode = i;
        mTimeMillis = l;
        mEventType = j;
        mCallingProcess = s;
        mCallingService = s1;
        mTargetProcess = s2;
        mTargetService = s3;
        mDurationMillis = -1L;
        mStackTrace = s4;
        mConnKey = s5;
        mElapsedRealtime = l1;
        mHeapAlloc = l2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long getDurationMillis()
    {
        return mDurationMillis;
    }

    public final int getEventType()
    {
        return mEventType;
    }

    public final String getSpecificString()
    {
        StringBuilder stringbuilder = (new StringBuilder("\t")).append(mCallingProcess).append("/").append(mCallingService).append("\t").append(mTargetProcess).append("/").append(mTargetService).append("\t");
        String s;
        if (mStackTrace == null)
        {
            s = "";
        } else
        {
            s = mStackTrace;
        }
        return stringbuilder.append(s).append("\t").append(mHeapAlloc).toString();
    }

    public final long getTimeMillis()
    {
        return mTimeMillis;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ConnectionEventCreator.writeToParcel$151b04f0(this, parcel);
    }

}
