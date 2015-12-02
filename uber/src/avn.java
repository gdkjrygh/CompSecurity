// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class avn extends Binder
    implements avm
{

    public avn()
    {
        attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    public static avm a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (iinterface != null && (iinterface instanceof avm))
        {
            return (avm)iinterface;
        } else
        {
            return new avo(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        aaf aaf2 = null;
        aaf aaf1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            aaf2 = a(ayx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = aaf1;
            if (aaf2 != null)
            {
                parcel = aaf2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            aaf1 = b(ayx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = aaf2;
            break;
        }
        if (aaf1 != null)
        {
            parcel = aaf1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
