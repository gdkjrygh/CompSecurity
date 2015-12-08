// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ki

public final class jm
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ki();
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;
    private final int g;

    jm()
    {
        g = 1;
        f = -1;
        a = -1;
        c = -1D;
    }

    jm(int i, int j, String s, double d1, String s1, long l, int k)
    {
        g = i;
        a = j;
        b = s;
        c = d1;
        d = s1;
        e = l;
        f = k;
    }

    public final int a()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ki.a(this, parcel);
    }

}
