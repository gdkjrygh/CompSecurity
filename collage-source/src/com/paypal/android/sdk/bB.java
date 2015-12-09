// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            cp, ce, cq, gd

public final class bB
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cp();
    private ce a;
    private String b;
    private cq c;

    public bB()
    {
    }

    public bB(Parcel parcel)
    {
        a = (ce)parcel.readParcelable(com/paypal/android/sdk/ce.getClassLoader());
        b = parcel.readString();
        c = (cq)parcel.readSerializable();
    }

    public bB(String s, ce ce1, cq cq1)
    {
        b = s;
        a = ce1;
        c = cq1;
    }

    public final ce a()
    {
        return a;
    }

    public final void a(ce ce1)
    {
        a = ce1;
    }

    public final void a(cq cq1)
    {
        c = cq1;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final String b()
    {
        return b;
    }

    public final cq c()
    {
        return c;
    }

    public final boolean d()
    {
        boolean flag;
        if (c == null || a == null && c.equals(cq.b) || gd.a(b) && c.equals(cq.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
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
