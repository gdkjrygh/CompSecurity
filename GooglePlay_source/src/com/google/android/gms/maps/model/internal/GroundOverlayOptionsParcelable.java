// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            GroundOverlayOptionsParcelableCreator, BitmapDescriptorParcelable

public final class GroundOverlayOptionsParcelable
    implements SafeParcelable
{

    public static final GroundOverlayOptionsParcelableCreator CREATOR = new GroundOverlayOptionsParcelableCreator();
    BitmapDescriptorParcelable mParcelableImage;
    final int mVersionCode;

    public GroundOverlayOptionsParcelable()
    {
        mVersionCode = 1;
    }

    GroundOverlayOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        mVersionCode = i;
        mParcelableImage = bitmapdescriptorparcelable;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GroundOverlayOptionsParcelableCreator.writeToParcel(this, parcel, i);
    }

}
