// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            GestureEventCreator

public class GestureEvent
    implements SafeParcelable
{

    public static final GestureEventCreator CREATOR = new GestureEventCreator();
    final int mCount;
    final boolean mIsEnd;
    final boolean mIsStart;
    final long mTimeSinceBootMillis;
    final long mTimeSinceEpochMillis;
    final int mType;
    final int mVersionCode;

    GestureEvent(int i, int j, long l, long l1, int k, 
            boolean flag, boolean flag1)
    {
        mVersionCode = i;
        mType = j;
        mTimeSinceEpochMillis = l;
        mTimeSinceBootMillis = l1;
        mCount = k;
        mIsStart = flag;
        mIsEnd = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GestureEventCreator.writeToParcel$124bc2e7(this, parcel);
    }

}
