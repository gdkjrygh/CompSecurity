// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.libraries.barhopper:
//            Barcode

public static class <init>
    implements Parcelable
{

    public static final android.os.r CREATOR = new android.os.Parcelable.Creator() {

        private static Barcode.GeoPoint createFromParcel(Parcel parcel)
        {
            return new Barcode.GeoPoint(parcel, null);
        }

        private static Barcode.GeoPoint[] newArray(int i)
        {
            return new Barcode.GeoPoint[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public double lat;
    public double lng;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(lat);
        parcel.writeDouble(lng);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        lat = parcel.readDouble();
        lng = parcel.readDouble();
    }

    lng(Parcel parcel, lng lng1)
    {
        this(parcel);
    }
}
