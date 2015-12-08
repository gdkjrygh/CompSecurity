// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, zzk, AdResponseParcel, zzf, 
//            zzh

public interface zzj
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzj
    {

        public static zzj zzW(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (iinterface != null && (iinterface instanceof zzj))
            {
                return (zzj)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            AdRequestInfoParcel adrequestinfoparcel = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (parcel.readInt() != 0)
                {
                    adrequestinfoparcel = AdRequestInfoParcel.CREATOR.zzj(parcel);
                }
                parcel = zze(adrequestinfoparcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                adrequestinfoparcel = obj;
                break;
            }
            if (parcel.readInt() != 0)
            {
                adrequestinfoparcel = AdRequestInfoParcel.CREATOR.zzj(parcel);
            }
            zza(adrequestinfoparcel, zzk.zza.zzX(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    private static class zza.zza
        implements zzj
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
            if (zzk1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            adrequestinfoparcel = zzk1.asBinder();
_L4:
            parcel.writeStrongBinder(adrequestinfoparcel);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            adrequestinfoparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestinfoparcel;
            adrequestinfoparcel = null;
              goto _L4
        }

        public AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            adrequestinfoparcel = AdResponseParcel.CREATOR.zzk(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return adrequestinfoparcel;
_L2:
            parcel.writeInt(0);
              goto _L3
            adrequestinfoparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestinfoparcel;
            adrequestinfoparcel = null;
              goto _L4
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk)
        throws RemoteException;

    public abstract AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
        throws RemoteException;
}
