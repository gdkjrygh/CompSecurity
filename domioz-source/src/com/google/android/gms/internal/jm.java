// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jn

public abstract class jm extends Binder
    implements jl
{

    public jm()
    {
        attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public static jl a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
        if (iinterface != null && (iinterface instanceof jl))
        {
            return (jl)iinterface;
        } else
        {
            return new jn(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            a(parcel.readInt(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            b(parcel.readInt(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(i, parcel);
        parcel1.writeNoException();
        return true;
    }
}
