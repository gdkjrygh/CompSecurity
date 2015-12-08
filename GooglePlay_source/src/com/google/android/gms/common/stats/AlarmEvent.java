// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            AlarmEventCreator

public final class AlarmEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AlarmEventCreator();
    final List mCallingPackages;
    int mDeviceState;
    final int mFlags;
    final String mHostPackageName;
    final long mIntervalMillis;
    final String mName;
    final float mPowerPercentage;
    final long mTimeMillis;
    final long mTriggerAfterMillis;
    int mType;
    final int mVersionCode;
    final long mWindowMillis;

    AlarmEvent(int i, long l, int j, String s, long l1, 
            long l2, long l3, List list, int k, int i1, 
            String s1, float f)
    {
        mVersionCode = i;
        mTimeMillis = l;
        mType = j;
        mName = s;
        mTriggerAfterMillis = l1;
        mWindowMillis = l2;
        mIntervalMillis = l3;
        mCallingPackages = list;
        mFlags = k;
        mDeviceState = i1;
        mHostPackageName = s1;
        mPowerPercentage = f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(mTimeMillis).append("\t").append(mType).append("\t").append(mName).append("\t").append(mTriggerAfterMillis).append("\t").append(mWindowMillis).append("\t").append(mIntervalMillis).append("\t").append(mFlags).append("\t");
        String s;
        if (mCallingPackages == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(",", mCallingPackages);
        }
        stringbuilder = stringbuilder.append(s).append("\t").append(mDeviceState).append("\t");
        if (mHostPackageName == null)
        {
            s = "";
        } else
        {
            s = mHostPackageName;
        }
        return stringbuilder.append(s).append("\t").append(mPowerPercentage).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AlarmEventCreator.writeToParcel$30c10467(this, parcel);
    }

}
