// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptionsCreator, BitmapDescriptor, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
    float mAlpha;
    float mAnchorU;
    float mAnchorV;
    boolean mDraggable;
    boolean mFlat;
    BitmapDescriptor mIcon;
    float mInfoWindowAnchorU;
    float mInfoWindowAnchorV;
    LatLng mPosition;
    float mRotation;
    String mSnippet;
    String mTitle;
    final int mVersionCode;
    boolean mVisible;

    public MarkerOptions()
    {
        mAnchorU = 0.5F;
        mAnchorV = 1.0F;
        mVisible = true;
        mFlat = false;
        mRotation = 0.0F;
        mInfoWindowAnchorU = 0.5F;
        mInfoWindowAnchorV = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        mAnchorU = 0.5F;
        mAnchorV = 1.0F;
        mVisible = true;
        mFlat = false;
        mRotation = 0.0F;
        mInfoWindowAnchorU = 0.5F;
        mInfoWindowAnchorV = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = i;
        mPosition = latlng;
        mTitle = s;
        mSnippet = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder));
        }
        mIcon = latlng;
        mAnchorU = f;
        mAnchorV = f1;
        mDraggable = flag;
        mVisible = flag1;
        mFlat = flag2;
        mRotation = f2;
        mInfoWindowAnchorU = f3;
        mInfoWindowAnchorV = f4;
        mAlpha = f5;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MarkerOptionsCreator.writeToParcel(this, parcel, i);
    }

}
