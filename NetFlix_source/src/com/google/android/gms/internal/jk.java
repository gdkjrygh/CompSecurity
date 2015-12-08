// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jl

public final class jk
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jl();
    String label;
    String value;
    private final int xH;

    jk()
    {
        xH = 1;
    }

    jk(int i, String s, String s1)
    {
        xH = i;
        label = s;
        value = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jl.a(this, parcel, i);
    }

}
