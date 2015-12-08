// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequestCreator

public final class LocationRequest
    implements SafeParcelable
{

    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    long mExpireAt;
    boolean mExplicitFastestInterval;
    long mFastestInterval;
    long mInterval;
    long mMaxWaitTime;
    int mNumUpdates;
    int mPriority;
    float mSmallestDisplacement;
    final int mVersionCode;

    public LocationRequest()
    {
        mVersionCode = 1;
        mPriority = 102;
        mInterval = 0x36ee80L;
        mFastestInterval = 0x927c0L;
        mExplicitFastestInterval = false;
        mExpireAt = 0x7fffffffffffffffL;
        mNumUpdates = 0x7fffffff;
        mSmallestDisplacement = 0.0F;
        mMaxWaitTime = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        mVersionCode = i;
        mPriority = j;
        mInterval = l;
        mFastestInterval = l1;
        mExplicitFastestInterval = flag;
        mExpireAt = l2;
        mNumUpdates = k;
        mSmallestDisplacement = f;
        mMaxWaitTime = l3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (mPriority != ((LocationRequest) (obj)).mPriority || mInterval != ((LocationRequest) (obj)).mInterval || mFastestInterval != ((LocationRequest) (obj)).mFastestInterval || mExplicitFastestInterval != ((LocationRequest) (obj)).mExplicitFastestInterval || mExpireAt != ((LocationRequest) (obj)).mExpireAt || mNumUpdates != ((LocationRequest) (obj)).mNumUpdates || mSmallestDisplacement != ((LocationRequest) (obj)).mSmallestDisplacement)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(mInterval), Long.valueOf(mFastestInterval), Boolean.valueOf(mExplicitFastestInterval), Long.valueOf(mExpireAt), Integer.valueOf(mNumUpdates), Float.valueOf(mSmallestDisplacement)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        stringbuilder = new StringBuilder();
        stringbuilder1 = stringbuilder.append("Request[");
        mPriority;
        JVM INSTR tableswitch 100 105: default 56
    //                   100 228
    //                   101 56
    //                   102 234
    //                   103 56
    //                   104 240
    //                   105 246;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L5
_L1:
        String s = "???";
_L7:
        stringbuilder1.append(s);
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append(mInterval).append("ms");
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append(mFastestInterval).append("ms");
        if (mMaxWaitTime > mInterval)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append(mMaxWaitTime).append("ms");
        }
        if (mExpireAt != 0x7fffffffffffffffL)
        {
            long l = mExpireAt;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append(l - l1).append("ms");
        }
        if (mNumUpdates != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(mNumUpdates);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
_L2:
        s = "PRIORITY_HIGH_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "PRIORITY_BALANCED_POWER_ACCURACY";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "PRIORITY_LOW_POWER";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "PRIORITY_NO_POWER";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.writeToParcel$1fef69e8(this, parcel);
    }

}
