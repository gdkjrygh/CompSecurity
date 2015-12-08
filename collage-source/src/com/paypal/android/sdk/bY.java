// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            di, ce

public final class bY
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new di();
    private String a;
    private String b;
    private ce c;
    private String d;

    public bY(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = (ce)parcel.readParcelable(com/paypal/android/sdk/ce.getClassLoader());
        d = parcel.readString();
    }

    public bY(ce ce1, String s)
    {
        c = ce1;
        d = s;
    }

    public bY(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final boolean a()
    {
        return a != null;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final ce d()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return d;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeParcelable(c, 0);
        parcel.writeString(d);
    }

}
