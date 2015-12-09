// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            StatsEvent, WakeLockEventCreator

public final class WakeLockEvent extends StatsEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new WakeLockEventCreator();
    final float mBeginPowerPercentage;
    final List mCallingPackages;
    int mDeviceState;
    private long mDurationMillis;
    final long mElapsedRealtime;
    final String mEventKey;
    int mEventType;
    final String mHostPackageName;
    final String mSecondaryWakeLockName;
    final long mTimeMillis;
    final long mTimeout;
    final int mVersionCode;
    final String mWakeLockName;
    final int mWakeLockType;

    WakeLockEvent(int i, long l, int j, String s, int k, List list, 
            String s1, long l1, int i1, String s2, String s3, float f, 
            long l2)
    {
        mVersionCode = i;
        mTimeMillis = l;
        mEventType = j;
        mWakeLockName = s;
        mSecondaryWakeLockName = s2;
        mWakeLockType = k;
        mDurationMillis = -1L;
        mCallingPackages = list;
        mEventKey = s1;
        mElapsedRealtime = l1;
        mDeviceState = i1;
        mHostPackageName = s3;
        mBeginPowerPercentage = f;
        mTimeout = l2;
    }

    public WakeLockEvent(long l, int i, String s, int j, List list, String s1, 
            long l1, int k, String s2, String s3, float f, long l2)
    {
        this(1, l, i, s, j, list, s1, l1, k, s2, s3, f, l2);
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
        StringBuilder stringbuilder = (new StringBuilder("\t")).append(mWakeLockName).append("\t").append(mWakeLockType).append("\t");
        String s;
        if (mCallingPackages == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(",", mCallingPackages);
        }
        stringbuilder = stringbuilder.append(s).append("\t").append(mDeviceState).append("\t");
        if (mSecondaryWakeLockName == null)
        {
            s = "";
        } else
        {
            s = mSecondaryWakeLockName;
        }
        stringbuilder = stringbuilder.append(s).append("\t");
        if (mHostPackageName == null)
        {
            s = "";
        } else
        {
            s = mHostPackageName;
        }
        return stringbuilder.append(s).append("\t").append(mBeginPowerPercentage).toString();
    }

    public final long getTimeMillis()
    {
        return mTimeMillis;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        WakeLockEventCreator.writeToParcel$7ab08521(this, parcel);
    }

}
