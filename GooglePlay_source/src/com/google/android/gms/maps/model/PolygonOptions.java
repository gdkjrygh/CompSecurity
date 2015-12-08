// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptionsCreator

public final class PolygonOptions
    implements SafeParcelable
{

    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
    int mFillColor;
    boolean mGeodesic;
    final List mHoles;
    final List mPoints;
    int mStrokeColor;
    float mStrokeWidth;
    final int mVersionCode;
    boolean mVisible;
    float mZIndex;

    public PolygonOptions()
    {
        mStrokeWidth = 10F;
        mStrokeColor = 0xff000000;
        mFillColor = 0;
        mZIndex = 0.0F;
        mVisible = true;
        mGeodesic = false;
        mVersionCode = 1;
        mPoints = new ArrayList();
        mHoles = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        mStrokeWidth = 10F;
        mStrokeColor = 0xff000000;
        mFillColor = 0;
        mZIndex = 0.0F;
        mVisible = true;
        mGeodesic = false;
        mVersionCode = i;
        mPoints = list;
        mHoles = list1;
        mStrokeWidth = f;
        mStrokeColor = j;
        mFillColor = k;
        mZIndex = f1;
        mVisible = flag;
        mGeodesic = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PolygonOptionsCreator.writeToParcel$4c96f4fe(this, parcel);
    }

}
