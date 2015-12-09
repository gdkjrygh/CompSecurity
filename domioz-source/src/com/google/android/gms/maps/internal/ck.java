// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.t;

// Referenced classes of package com.google.android.gms.maps.internal:
//            cj

public abstract class ck extends Binder
    implements cj
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            t t1 = StreetViewPanoramaOrientation.CREATOR;
            parcel = t.a(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
