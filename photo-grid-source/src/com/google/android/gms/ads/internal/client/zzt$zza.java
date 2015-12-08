// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.b;
import com.google.android.gms.internal.iq;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzt, g, AdSizeParcel, zzi

public abstract class rcel extends Binder
    implements zzt
{

    public static zzt zzl(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof zzt))
        {
            return (zzt)iinterface;
        } else
        {
            return new g(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        com.google.android.gms.b.a a = null;
        Object obj = null;
        com.google.android.gms.b.a a1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            a = b.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR.zzc(parcel);
            }
            parcel = zza(a, ((AdSizeParcel) (obj)), parcel.readString(), iq.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            a1 = b.a(parcel.readStrongBinder());
            obj = a;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = AdSizeParcel.CREATOR.zzc(parcel);
        }
        parcel = zza(a1, ((AdSizeParcel) (obj)), parcel.readString(), iq.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
