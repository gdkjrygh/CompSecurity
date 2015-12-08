// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            bF, cg, bG

public final class bE
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bF();
    private cg a;
    private String b;
    private bG c;

    public bE()
    {
    }

    public bE(Parcel parcel)
    {
        a = (cg)parcel.readParcelable(com/paypal/android/sdk/cg.getClassLoader());
        b = parcel.readString();
        c = (bG)parcel.readSerializable();
    }

    public final cg a()
    {
        return a;
    }

    public final void a(bG bg)
    {
        c = bg;
    }

    public final void a(cg cg1)
    {
        a = cg1;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final String b()
    {
        return b;
    }

    public final bG c()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeString(b);
        parcel.writeSerializable(c);
    }

}
