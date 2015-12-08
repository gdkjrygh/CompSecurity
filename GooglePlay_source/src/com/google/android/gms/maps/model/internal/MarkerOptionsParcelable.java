// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            MarkerOptionsParcelableCreator, BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements SafeParcelable
{

    public static final MarkerOptionsParcelableCreator CREATOR = new MarkerOptionsParcelableCreator();
    BitmapDescriptorParcelable mParcelableIcon;
    final int mVersionCode;

    public MarkerOptionsParcelable()
    {
        mVersionCode = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        mVersionCode = i;
        mParcelableIcon = bitmapdescriptorparcelable;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MarkerOptionsParcelableCreator.writeToParcel(this, parcel, i);
    }

}
