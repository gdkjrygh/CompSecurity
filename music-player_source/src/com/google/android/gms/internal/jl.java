// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kj, jm, jr

public final class jl
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kj();
    String a;
    jm b;
    String c;
    jr d;
    private final int e;

    jl()
    {
        e = 1;
    }

    jl(int i, String s, jm jm, String s1, jr jr)
    {
        e = i;
        a = s;
        b = jm;
        c = s1;
        d = jr;
    }

    public final int a()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        kj.a(this, parcel, i);
    }

}
