// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.k;

// Referenced classes of package com.google.android.gms.internal:
//            z, ab, zzba, w, 
//            bp, br

public abstract class aa extends Binder
    implements z
{

    public static z a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof z))
        {
            return (z)iinterface;
        } else
        {
            return new ab(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        com.google.android.gms.b.j j1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            j1 = k.a(parcel.readStrongBinder());
            break;
        }
        Object obj;
        zzba zzba1;
        String s;
        if (parcel.readInt() != 0)
        {
            w w1 = zzba.CREATOR;
            zzba1 = w.a(parcel);
        } else
        {
            zzba1 = null;
        }
        s = parcel.readString();
        obj = parcel.readStrongBinder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            if (iinterface != null && (iinterface instanceof bp))
            {
                obj = (bp)iinterface;
            } else
            {
                obj = new br(((IBinder) (obj)));
            }
        }
        parcel = a(j1, zzba1, s, ((bp) (obj)), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
