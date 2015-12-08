// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzdr, zzbb

public interface zzbj
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzbj
    {

        public static zzbj zzh(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (iinterface != null && (iinterface instanceof zzbj))
            {
                return (zzbj)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            zzd zzd;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                zzd = com.google.android.gms.dynamic.zzd.zza.zzau(parcel.readStrongBinder());
                break;
            }
            zzba zzba1;
            if (parcel.readInt() != 0)
            {
                zzba1 = zzba.CREATOR.zzc(parcel);
            } else
            {
                zzba1 = null;
            }
            parcel = zza(zzd, zzba1, parcel.readString(), zzdr.zza.zzr(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    static class zza.zza
        implements zzbj
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public IBinder zza(zzd zzd1, zzba zzba1, String s, zzdr zzdr1, int i)
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if (zzba1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            zzba1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzdr1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzdr1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract IBinder zza(zzd zzd, zzba zzba, String s, zzdr zzdr, int i);
}
