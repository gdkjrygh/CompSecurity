// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzc, BitmapDescriptorParcelable

public final class GroundOverlayOptionsParcelable
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    private final int a;
    private BitmapDescriptorParcelable b;

    public GroundOverlayOptionsParcelable()
    {
        a = 1;
    }

    GroundOverlayOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        a = i;
        b = bitmapdescriptorparcelable;
    }

    int a()
    {
        return a;
    }

    public BitmapDescriptorParcelable b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.a(this, parcel, i);
    }

}
