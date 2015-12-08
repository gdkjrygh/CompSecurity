// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public LatLng a(Parcel parcel)
        {
            return new LatLng((com.google.android.gms.maps.model.LatLng)parcel.readParcelable(com/google/android/gms/maps/model/LatLng.getClassLoader()));
        }

        public LatLng[] a(int i)
        {
            return new LatLng[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public double a;
    public double b;
    private com.google.android.gms.maps.model.LatLng c;

    public LatLng(double d, double d1)
    {
        this(new com.google.android.gms.maps.model.LatLng(d, d1));
    }

    public LatLng(com.google.android.gms.maps.model.LatLng latlng)
    {
        c = latlng;
        a = c.a;
        b = c.b;
    }

    public com.google.android.gms.maps.model.LatLng a()
    {
        return c;
    }

    public int describeContents()
    {
        return c.describeContents();
    }

    public boolean equals(Object obj)
    {
        return c.equals(obj);
    }

    public int hashCode()
    {
        return c.hashCode();
    }

    public String toString()
    {
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(c, i);
    }

}
