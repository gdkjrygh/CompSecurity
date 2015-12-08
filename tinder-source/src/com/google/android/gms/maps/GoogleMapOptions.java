// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.a CREATOR = new com.google.android.gms.maps.a();
    final int a;
    Boolean b;
    Boolean c;
    int d;
    CameraPosition e;
    Boolean f;
    Boolean g;
    Boolean h;
    Boolean i;
    Boolean j;
    Boolean k;
    Boolean l;
    Boolean m;
    Boolean n;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10)
    {
        d = -1;
        a = i1;
        b = com.google.android.gms.maps.a.a.a(byte0);
        c = com.google.android.gms.maps.a.a.a(byte1);
        d = j1;
        e = cameraposition;
        f = com.google.android.gms.maps.a.a.a(byte2);
        g = com.google.android.gms.maps.a.a.a(byte3);
        h = com.google.android.gms.maps.a.a.a(byte4);
        i = com.google.android.gms.maps.a.a.a(byte5);
        j = com.google.android.gms.maps.a.a.a(byte6);
        k = com.google.android.gms.maps.a.a.a(byte7);
        l = com.google.android.gms.maps.a.a.a(byte8);
        m = com.google.android.gms.maps.a.a.a(byte9);
        n = com.google.android.gms.maps.a.a.a(byte10);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        a(this, parcel, i1);
    }

}
