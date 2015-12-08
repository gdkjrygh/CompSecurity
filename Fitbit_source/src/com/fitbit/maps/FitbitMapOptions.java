// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.fitbit.maps:
//            CameraPosition

public class FitbitMapOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FitbitMapOptions a(Parcel parcel)
        {
            return new FitbitMapOptions((GoogleMapOptions)parcel.readParcelable(com/google/android/gms/maps/GoogleMapOptions.getClassLoader()));
        }

        public FitbitMapOptions[] a(int i1)
        {
            return new FitbitMapOptions[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    GoogleMapOptions a;

    public FitbitMapOptions()
    {
        a = new GoogleMapOptions();
    }

    public FitbitMapOptions(GoogleMapOptions googlemapoptions)
    {
        a = googlemapoptions;
    }

    public static FitbitMapOptions a(Context context, AttributeSet attributeset)
    {
        return new FitbitMapOptions(GoogleMapOptions.a(context, attributeset));
    }

    public FitbitMapOptions a(int i1)
    {
        a = a.a(i1);
        return this;
    }

    public FitbitMapOptions a(CameraPosition cameraposition)
    {
        a = a.a(cameraposition.a());
        return this;
    }

    public FitbitMapOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public GoogleMapOptions a()
    {
        return a;
    }

    public FitbitMapOptions b(boolean flag)
    {
        a = a.b(flag);
        return this;
    }

    public Boolean b()
    {
        return a.l();
    }

    public FitbitMapOptions c(boolean flag)
    {
        a = a.c(flag);
        return this;
    }

    public Boolean c()
    {
        return a.m();
    }

    public int d()
    {
        return a.n();
    }

    public FitbitMapOptions d(boolean flag)
    {
        a = a.d(flag);
        return this;
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public CameraPosition e()
    {
        return new CameraPosition(a.o());
    }

    public FitbitMapOptions e(boolean flag)
    {
        a = a.e(flag);
        return this;
    }

    public FitbitMapOptions f(boolean flag)
    {
        a = a.c(flag);
        return this;
    }

    public Boolean f()
    {
        return a.p();
    }

    public FitbitMapOptions g(boolean flag)
    {
        a = a.g(flag);
        return this;
    }

    public Boolean g()
    {
        return a.q();
    }

    public FitbitMapOptions h(boolean flag)
    {
        a = a.h(flag);
        return this;
    }

    public Boolean h()
    {
        return a.r();
    }

    public FitbitMapOptions i(boolean flag)
    {
        a = a.i(flag);
        return this;
    }

    public Boolean i()
    {
        return a.s();
    }

    public FitbitMapOptions j(boolean flag)
    {
        a = a.j(flag);
        return this;
    }

    public Boolean j()
    {
        return a.t();
    }

    public Boolean k()
    {
        return a.u();
    }

    public Boolean l()
    {
        return a.v();
    }

    public Boolean m()
    {
        return a.w();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeParcelable(a, i1);
    }

}
