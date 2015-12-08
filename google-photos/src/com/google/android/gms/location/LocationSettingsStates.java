// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lis;

public final class LocationSettingsStates
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lis();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        a = i;
        b = flag;
        c = flag1;
        d = flag2;
        e = flag3;
        f = flag4;
        g = flag5;
        h = flag6;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lis.a(this, parcel);
    }

}
