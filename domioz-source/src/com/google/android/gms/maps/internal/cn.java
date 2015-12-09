// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.internal:
//            cm, co, t

public abstract class cn extends Binder
    implements cm
{

    public static cm a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        if (iinterface != null && (iinterface instanceof cm))
        {
            return (cm)iinterface;
        } else
        {
            return new co(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            a(t.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
