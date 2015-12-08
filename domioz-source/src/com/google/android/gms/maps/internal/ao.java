// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.model.internal.t;

// Referenced classes of package com.google.android.gms.maps.internal:
//            an

public abstract class ao extends Binder
    implements an
{

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
            j2 = a(t.a(parcel.readStrongBinder()));
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
            j1 = b(t.a(parcel.readStrongBinder()));
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
