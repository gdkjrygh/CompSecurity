// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.di;

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
            a a = null;
            Object obj = null;
            a a1;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                a = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = AdSizeParcel.CREATOR.zzc(parcel);
                }
                parcel = zza(a, ((AdSizeParcel) (obj)), parcel.readString(), com.google.android.gms.internal.di.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                a1 = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                obj = a;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR.zzc(parcel);
            }
            parcel = zza(a1, ((AdSizeParcel) (obj)), parcel.readString(), com.google.android.gms.internal.di.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzs
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public IBinder zza(a a1, AdSizeParcel adsizeparcel, String s, di di1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (di1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = di1.asBinder();
            parcel.writeStrongBinder(a1);
            parcel.writeInt(i);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            a1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return a1;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        public IBinder zza(a a1, AdSizeParcel adsizeparcel, String s, di di1, int i, int j)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            a1 = obj;
            if (di1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = di1.asBinder();
            parcel.writeStrongBinder(a1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            a1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return a1;
_L2:
            a1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
              goto _L5
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract IBinder zza(a a, AdSizeParcel adsizeparcel, String s, di di, int i)
        throws RemoteException;

    public abstract IBinder zza(a a, AdSizeParcel adsizeparcel, String s, di di, int i, int j)
        throws RemoteException;
}
