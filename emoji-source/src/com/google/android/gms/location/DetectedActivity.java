// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivityCreator

public class DetectedActivity
    implements SafeParcelable
{

    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    int UY;
    int UZ;
    private final int xM;

    public DetectedActivity(int i, int j)
    {
        xM = 1;
        UY = i;
        UZ = j;
    }

    public DetectedActivity(int i, int j, int k)
    {
        xM = i;
        UY = j;
        UZ = k;
    }

    private int cF(int i)
    {
        int j = i;
        if (i > 8)
        {
            j = 4;
        }
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getConfidence()
    {
        return UZ;
    }

    public int getType()
    {
        return cF(UY);
    }

    public int getVersionCode()
    {
        return xM;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DetectedActivity [type=").append(getType()).append(", confidence=").append(UZ).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DetectedActivityCreator.a(this, parcel, i);
    }

}
