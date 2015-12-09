// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptionsCreator, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    float mAnchorU;
    float mAnchorV;
    float mBearing;
    LatLngBounds mBounds;
    float mHeight;
    BitmapDescriptor mImage;
    LatLng mLocation;
    float mTransparency;
    final int mVersionCode;
    boolean mVisible;
    float mWidth;
    float mZIndex;

    public GroundOverlayOptions()
    {
        mVisible = true;
        mTransparency = 0.0F;
        mAnchorU = 0.5F;
        mAnchorV = 0.5F;
        mVersionCode = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        mVisible = true;
        mTransparency = 0.0F;
        mAnchorU = 0.5F;
        mAnchorV = 0.5F;
        mVersionCode = i;
        mImage = new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder));
        mLocation = latlng;
        mWidth = f;
        mHeight = f1;
        mBounds = latlngbounds;
        mBearing = f2;
        mZIndex = f3;
        mVisible = flag;
        mTransparency = f4;
        mAnchorU = f5;
        mAnchorV = f6;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GroundOverlayOptionsCreator.writeToParcel(this, parcel, i);
    }

}
