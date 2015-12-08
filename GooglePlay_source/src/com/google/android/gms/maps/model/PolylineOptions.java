// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptionsCreator

public final class PolylineOptions
    implements SafeParcelable
{

    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
    int mColor;
    boolean mGeodesic;
    final List mPoints;
    final int mVersionCode;
    boolean mVisible;
    float mWidth;
    float mZIndex;

    public PolylineOptions()
    {
        mWidth = 10F;
        mColor = 0xff000000;
        mZIndex = 0.0F;
        mVisible = true;
        mGeodesic = false;
        mVersionCode = 1;
        mPoints = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        mWidth = 10F;
        mColor = 0xff000000;
        mZIndex = 0.0F;
        mVisible = true;
        mGeodesic = false;
        mVersionCode = i;
        mPoints = list;
        mWidth = f;
        mColor = j;
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
        PolylineOptionsCreator.writeToParcel$37f6d9f8(this, parcel);
    }

}
