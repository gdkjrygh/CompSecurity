// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.zze;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            k, m, f, zzb, 
//            zzau, zze

public abstract class l extends Binder
    implements k
{

    public static k a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (iinterface != null && (iinterface instanceof k))
        {
            return (k)iinterface;
        } else
        {
            return new m(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        e e = null;
        e e9 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        zze zze1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e = f.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                zze1 = (zze)zze.CREATOR.createFromParcel(parcel);
            }
            a(e, zze1);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(f.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(f.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(f.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e9 = f.a(parcel.readStrongBinder());
            Object obj = e;
            if (parcel.readInt() != 0)
            {
                obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
            }
            a(e9, ((PutDataRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e1 = f.a(parcel.readStrongBinder());
            Object obj1 = e9;
            if (parcel.readInt() != 0)
            {
                obj1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(e1, ((Uri) (obj1)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e2 = f.a(parcel.readStrongBinder());
            Uri uri = obj2;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(e2, uri);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e3 = f.a(parcel.readStrongBinder());
            Uri uri1 = obj3;
            if (parcel.readInt() != 0)
            {
                uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            c(e3, uri1);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(f.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e4 = f.a(parcel.readStrongBinder());
            Asset asset = obj4;
            if (parcel.readInt() != 0)
            {
                asset = (Asset)Asset.CREATOR.createFromParcel(parcel);
            }
            a(e4, asset);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e5 = f.a(parcel.readStrongBinder());
            zzb zzb1 = obj5;
            if (parcel.readInt() != 0)
            {
                zzb1 = (zzb)zzb.CREATOR.createFromParcel(parcel);
            }
            a(e5, zzb1);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e6 = f.a(parcel.readStrongBinder());
            zzau zzau1 = obj6;
            if (parcel.readInt() != 0)
            {
                zzau1 = (zzau)zzau.CREATOR.createFromParcel(parcel);
            }
            a(e6, zzau1);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            g(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            h(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e7 = f.a(parcel.readStrongBinder());
            com.google.android.gms.wearable.internal.zze zze2 = obj7;
            if (parcel.readInt() != 0)
            {
                zze2 = (com.google.android.gms.wearable.internal.zze)zze.CREATOR.createFromParcel(parcel);
            }
            a(e7, zze2);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(f.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(f.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            i(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e e8 = f.a(parcel.readStrongBinder());
            zze zze3 = obj8;
            if (parcel.readInt() != 0)
            {
                zze3 = (zze)zze.CREATOR.createFromParcel(parcel);
            }
            b(e8, zze3);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            j(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            k(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            l(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
