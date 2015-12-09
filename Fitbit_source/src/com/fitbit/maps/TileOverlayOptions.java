// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            u

public class TileOverlayOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.TileOverlayOptions a;

    public TileOverlayOptions(com.google.android.gms.maps.model.TileOverlayOptions tileoverlayoptions)
    {
        a = tileoverlayoptions;
    }

    public TileOverlayOptions a(float f)
    {
        a = a.a(f);
        return this;
    }

    public TileOverlayOptions a(u u)
    {
        a = a.a(new _cls2(u));
        return this;
    }

    public TileOverlayOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public com.google.android.gms.maps.model.TileOverlayOptions a()
    {
        return a;
    }

    public TileOverlayOptions b(boolean flag)
    {
        a = a.b(flag);
        return this;
    }

    public u b()
    {
        return new _cls3(a.c());
    }

    public float c()
    {
        return a.d();
    }

    public boolean d()
    {
        return a.e();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public boolean e()
    {
        return a.f();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
