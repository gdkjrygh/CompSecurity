// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzm, BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements SafeParcelable
{

    public static final zzm CREATOR = new zzm();
    private final int a;
    private BitmapDescriptorParcelable b;

    public MarkerOptionsParcelable()
    {
        a = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
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
        zzm.a(this, parcel, i);
    }

}
