// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptionsCreator, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
    LatLng mCenter;
    int mFillColor;
    double mRadius;
    int mStrokeColor;
    float mStrokeWidth;
    final int mVersionCode;
    boolean mVisible;
    float mZIndex;

    public CircleOptions()
    {
        mCenter = null;
        mRadius = 0.0D;
        mStrokeWidth = 10F;
        mStrokeColor = 0xff000000;
        mFillColor = 0;
        mZIndex = 0.0F;
        mVisible = true;
        mVersionCode = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        mCenter = null;
        mRadius = 0.0D;
        mStrokeWidth = 10F;
        mStrokeColor = 0xff000000;
        mFillColor = 0;
        mZIndex = 0.0F;
        mVisible = true;
        mVersionCode = i;
        mCenter = latlng;
        mRadius = d;
        mStrokeWidth = f;
        mStrokeColor = j;
        mFillColor = k;
        mZIndex = f1;
        mVisible = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CircleOptionsCreator.writeToParcel(this, parcel, i);
    }

}
