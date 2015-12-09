// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.ConversionUtil;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptionsCreator

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final StreetViewPanoramaOptionsCreator CREATOR = new StreetViewPanoramaOptionsCreator();
    StreetViewPanoramaCamera mCamera;
    Boolean mPanningGesturesEnabled;
    String mPanoId;
    LatLng mPosition;
    Integer mRadius;
    Boolean mStreetNamesEnabled;
    Boolean mUseViewLifecycleInFragment;
    Boolean mUserNavigationEnabled;
    final int mVersionCode;
    Boolean mZoomGesturesEnabled;

    public StreetViewPanoramaOptions()
    {
        mUserNavigationEnabled = Boolean.valueOf(true);
        mZoomGesturesEnabled = Boolean.valueOf(true);
        mPanningGesturesEnabled = Boolean.valueOf(true);
        mStreetNamesEnabled = Boolean.valueOf(true);
        mVersionCode = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        mUserNavigationEnabled = Boolean.valueOf(true);
        mZoomGesturesEnabled = Boolean.valueOf(true);
        mPanningGesturesEnabled = Boolean.valueOf(true);
        mStreetNamesEnabled = Boolean.valueOf(true);
        mVersionCode = i;
        mCamera = streetviewpanoramacamera;
        mPosition = latlng;
        mRadius = integer;
        mPanoId = s;
        mUserNavigationEnabled = ConversionUtil.toBoxedBoolean(byte0);
        mZoomGesturesEnabled = ConversionUtil.toBoxedBoolean(byte1);
        mPanningGesturesEnabled = ConversionUtil.toBoxedBoolean(byte2);
        mStreetNamesEnabled = ConversionUtil.toBoxedBoolean(byte3);
        mUseViewLifecycleInFragment = ConversionUtil.toBoxedBoolean(byte4);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StreetViewPanoramaOptionsCreator.writeToParcel(this, parcel, i);
    }

}
