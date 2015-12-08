// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import liq;

public final class LocationSettingsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new liq();
    public final int a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public LocationSettingsRequest(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        a = i;
        b = list;
        c = flag;
        d = flag1;
        e = flag2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        liq.a(this, parcel);
    }

}
