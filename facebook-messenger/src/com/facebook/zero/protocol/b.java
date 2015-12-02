// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol;

import android.os.Parcel;

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public CarrierAndSimMccMnc.MccMncPair a(Parcel parcel)
    {
        return new CarrierAndSimMccMnc.MccMncPair(parcel, null);
    }

    public CarrierAndSimMccMnc.MccMncPair[] a(int i)
    {
        return new CarrierAndSimMccMnc.MccMncPair[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
