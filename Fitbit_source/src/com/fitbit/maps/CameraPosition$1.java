// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.fitbit.maps:
//            CameraPosition

static final class .CameraPosition
    implements android.os.r
{

    public com.fitbit.maps.CameraPosition a(Parcel parcel)
    {
        return new com.fitbit.maps.CameraPosition((CameraPosition)parcel.readParcelable(com/google/android/gms/maps/model/CameraPosition.getClassLoader()));
    }

    public com.fitbit.maps.CameraPosition[] a(int i)
    {
        return new com.fitbit.maps.CameraPosition[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    .CameraPosition()
    {
    }
}
