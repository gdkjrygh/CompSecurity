// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzc

public class AddLocalCapabilityResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public final int a;
    public final int b;

    AddLocalCapabilityResponse(int i, int j)
    {
        a = i;
        b = j;
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
