// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzef;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel, zzh

public interface zzs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzs
    {

        public static zzs zzl(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (iinterface != null && (iinterface instanceof zzs))
            {
                return (zzs)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            zzd zzd = null;
            Object obj = null;
            zzd zzd1;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                zzd = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                }
                parcel = zza(zzd, ((AdSizeParcel) (obj)), parcel.readString(), com.google.android.gms.internal.zzef.zza.zzE(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(parcel.readStrongBinder());
                obj = zzd;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR.zzc(parcel);
            }
            parcel = zza(zzd1, ((AdSizeParcel) (obj)), parcel.readString(), com.google.android.gms.internal.zzef.zza.zzE(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzs
    {

        private IBinder zznF;

        public IBinder asBinder()
        {
            return zznF;
        }

        public IBinder zza(zzd zzd1, AdSizeParcel adsizeparcel, String s, zzef zzef1, int i)
            throws RemoteException
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
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzef1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzef1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zznF.transact(1, parcel, parcel1, 0);
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

        public IBinder zza(zzd zzd1, AdSizeParcel adsizeparcel, String s, zzef zzef1, int i, int j)
            throws RemoteException
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
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if (zzef1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            zzd1 = zzef1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznF.transact(2, parcel, parcel1, 0);
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
            zznF = ibinder;
        }
    }


    public abstract IBinder zza(zzd zzd, AdSizeParcel adsizeparcel, String s, zzef zzef, int i)
        throws RemoteException;

    public abstract IBinder zza(zzd zzd, AdSizeParcel adsizeparcel, String s, zzef zzef, int i, int j)
        throws RemoteException;
}
