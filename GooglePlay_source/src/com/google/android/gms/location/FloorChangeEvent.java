// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            FloorChangeEventCreator

public class FloorChangeEvent
    implements SafeParcelable
{

    public static final FloorChangeEventCreator CREATOR = new FloorChangeEventCreator();
    final int mConfidence;
    final float mElevationChange;
    final long mEndElapsedRealtimeMillis;
    final long mEndTimeMillis;
    final long mStartElapsedRealtimeMillis;
    final long mStartTimeMillis;
    final int mType;
    final int mVersionCode;

    public FloorChangeEvent(int i, int j, int k, long l, long l1, 
            long l2, long l3, float f)
    {
        boolean flag;
        if (k >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "confidence must be equal to or greater than 0");
        if (k <= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "confidence must be equal to or less than 100");
        if (0L < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "startTimeMillis must be greater than 0");
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "endTimeMillis must be equal to or greater than startTimeMillis");
        if (0L <= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "startElapsedRealtimeMillis must be equal to or greater than 0");
        if (l2 <= l3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "endElapsedRealtimeMillis must be equal to or greater than startElapsedRealtimeMillis");
        if (l2 < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "startTimeMillis must be greater than startElapsedRealtimeMillis");
        if (l3 < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "endTimeMillis must be greater than endElapsedRealtimeMillis");
        mVersionCode = i;
        mType = j;
        mConfidence = k;
        mStartTimeMillis = l;
        mEndTimeMillis = l1;
        mStartElapsedRealtimeMillis = l2;
        mEndElapsedRealtimeMillis = l3;
        mElevationChange = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("FloorChangeEvent [type=%d, confidence=%d, elevationChange=%f, startTimeMillis=%d, endTimeMillis=%d, startElapsedRealtimeMillis=%d, endElapsedRealtimeMillis=%d]", new Object[] {
            Integer.valueOf(mType), Integer.valueOf(mConfidence), Float.valueOf(mElevationChange), Long.valueOf(mStartTimeMillis), Long.valueOf(mEndTimeMillis), Long.valueOf(mStartElapsedRealtimeMillis), Long.valueOf(mEndElapsedRealtimeMillis)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FloorChangeEventCreator.writeToParcel$1ffa25d4(this, parcel);
    }

}
