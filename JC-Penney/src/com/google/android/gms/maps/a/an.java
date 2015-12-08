// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.model.a.q;

// Referenced classes of package com.google.android.gms.maps.a:
//            am, ao

public abstract class an extends Binder
    implements am
{

    public static am a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (iinterface != null && (iinterface instanceof am))
        {
            return (am)iinterface;
        } else
        {
            return new ao(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
    {
        j j2 = null;
        j j1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            j2 = a(q.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = j1;
            if (j2 != null)
            {
                parcel = j2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            j1 = b(q.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = j2;
            break;
        }
        if (j1 != null)
        {
            parcel = j1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
