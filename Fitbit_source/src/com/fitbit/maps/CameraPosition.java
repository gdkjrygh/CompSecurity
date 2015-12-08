// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class CameraPosition
    implements SafeParcelable
{
    public static final class a
    {

        private com.google.android.gms.maps.model.a a;

        public a a(float f)
        {
            a.a(f);
            return this;
        }

        public a a(LatLng latlng)
        {
            a.a(latlng.a());
            return this;
        }

        public CameraPosition a()
        {
            return new CameraPosition(a.a());
        }

        public a b(float f)
        {
            a.b(f);
            return this;
        }

        public a c(float f)
        {
            a.c(f);
            return this;
        }

        public a()
        {
            a = new com.google.android.gms.maps.model.a();
        }

        public a(CameraPosition cameraposition)
        {
            a = new com.google.android.gms.maps.model.a(cameraposition.a());
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CameraPosition a(Parcel parcel)
        {
            return new CameraPosition((com.google.android.gms.maps.model.CameraPosition)parcel.readParcelable(com/google/android/gms/maps/model/CameraPosition.getClassLoader()));
        }

        public CameraPosition[] a(int i)
        {
            return new CameraPosition[i];
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
    private com.google.android.gms.maps.model.CameraPosition a;

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(new com.google.android.gms.maps.model.CameraPosition(latlng.a(), f, f1, f2));
    }

    public CameraPosition(com.google.android.gms.maps.model.CameraPosition cameraposition)
    {
        a = cameraposition;
    }

    public static a a(CameraPosition cameraposition)
    {
        return new a(cameraposition);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        return new CameraPosition(com.google.android.gms.maps.model.CameraPosition.a(context, attributeset));
    }

    public static final CameraPosition a(LatLng latlng, float f)
    {
        return new CameraPosition(new com.google.android.gms.maps.model.CameraPosition(latlng.a(), f, 0.0F, 0.0F));
    }

    public static a b()
    {
        return new a();
    }

    public com.google.android.gms.maps.model.CameraPosition a()
    {
        return a;
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

}
