// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j, CapabilityInfoParcelable

public class GetCapabilityResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    public final int a;
    public final int b;
    public final CapabilityInfoParcelable c;

    GetCapabilityResponse(int i, int k, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        a = i;
        b = k;
        c = capabilityinfoparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
