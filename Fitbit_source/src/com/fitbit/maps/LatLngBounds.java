// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class LatLngBounds
    implements SafeParcelable
{
    public static final class a
    {

        private com.google.android.gms.maps.model.a a;

        public a a(LatLng latlng)
        {
            a.a(latlng.a());
            return this;
        }

        public LatLngBounds a()
        {
            return new LatLngBounds(a.a());
        }

        public a()
        {
            a = new com.google.android.gms.maps.model.a();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.LatLngBounds a;

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(new com.google.android.gms.maps.model.LatLngBounds(latlng.a(), latlng1.a()));
    }

    public LatLngBounds(com.google.android.gms.maps.model.LatLngBounds latlngbounds)
    {
        a = latlngbounds;
    }

    public static a b()
    {
        return new a();
    }

    public com.google.android.gms.maps.model.LatLngBounds a()
    {
        return a;
    }

    public boolean a(LatLng latlng)
    {
        return a.a(latlng.a());
    }

    public LatLngBounds b(LatLng latlng)
    {
        return new LatLngBounds(a.b(latlng.a()));
    }

    public LatLng c()
    {
        return new LatLng(a.c());
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }


    /* member class not found */
    class _cls1 {}

}
