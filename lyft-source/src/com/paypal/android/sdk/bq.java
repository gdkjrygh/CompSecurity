// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            br, bS, bs

public final class bq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new br();
    private bS a;
    private String b;
    private bs c;

    public bq()
    {
    }

    public bq(Parcel parcel)
    {
        a = (bS)parcel.readParcelable(com/paypal/android/sdk/bS.getClassLoader());
        b = parcel.readString();
        c = (bs)parcel.readSerializable();
    }

    public final bS a()
    {
        return a;
    }

    public final void a(bS bs1)
    {
        a = bs1;
    }

    public final void a(bs bs1)
    {
        c = bs1;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final String b()
    {
        return b;
    }

    public final bs c()
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
