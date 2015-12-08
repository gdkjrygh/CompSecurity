// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.ConversionUtil;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptionsCreator

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();
    Boolean mAmbientEnabled;
    CameraPosition mCamera;
    Boolean mCompassEnabled;
    Boolean mLiteMode;
    Boolean mMapToolbarEnabled;
    int mMapType;
    Boolean mRotateGesturesEnabled;
    Boolean mScrollGesturesEnabled;
    Boolean mTiltGesturesEnabled;
    Boolean mUseViewLifecycleInFragment;
    final int mVersionCode;
    Boolean mZOrderOnTop;
    Boolean mZoomControlsEnabled;
    Boolean mZoomGesturesEnabled;

    public GoogleMapOptions()
    {
        mMapType = -1;
        mVersionCode = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10)
    {
        mMapType = -1;
        mVersionCode = i;
        mZOrderOnTop = ConversionUtil.toBoxedBoolean(byte0);
        mUseViewLifecycleInFragment = ConversionUtil.toBoxedBoolean(byte1);
        mMapType = j;
        mCamera = cameraposition;
        mZoomControlsEnabled = ConversionUtil.toBoxedBoolean(byte2);
        mCompassEnabled = ConversionUtil.toBoxedBoolean(byte3);
        mScrollGesturesEnabled = ConversionUtil.toBoxedBoolean(byte4);
        mZoomGesturesEnabled = ConversionUtil.toBoxedBoolean(byte5);
        mTiltGesturesEnabled = ConversionUtil.toBoxedBoolean(byte6);
        mRotateGesturesEnabled = ConversionUtil.toBoxedBoolean(byte7);
        mLiteMode = ConversionUtil.toBoxedBoolean(byte8);
        mMapToolbarEnabled = ConversionUtil.toBoxedBoolean(byte9);
        mAmbientEnabled = ConversionUtil.toBoxedBoolean(byte10);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GoogleMapOptionsCreator.writeToParcel(this, parcel, i);
    }

}
