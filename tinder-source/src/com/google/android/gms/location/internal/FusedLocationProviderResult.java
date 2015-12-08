// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.internal:
//            d

public final class FusedLocationProviderResult
    implements f, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final FusedLocationProviderResult a;
    final int b;
    final Status c;

    FusedLocationProviderResult(int i, Status status)
    {
        b = i;
        c = status;
    }

    private FusedLocationProviderResult(Status status)
    {
        this(1, status);
    }

    public final Status a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

    static 
    {
        a = new FusedLocationProviderResult(Status.a);
    }
}
