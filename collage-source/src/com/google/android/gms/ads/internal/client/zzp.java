// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzn, zzo

public interface zzp
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzp
    {

        public static zzp zzi(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (iinterface != null && (iinterface instanceof zzp))
            {
                return (zzp)iinterface;
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
            zzo zzo1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                zzo1 = zzbk();
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (zzo1 != null)
                {
                    parcel = zzo1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                zzb(zzn.zza.zzg(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                zza(com.google.android.gms.internal.bt.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                zza(com.google.android.gms.internal.bu.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                zza(parcel.readString(), com.google.android.gms.internal.bw.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.bv.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                obj = zzo1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = NativeAdOptionsParcel.CREATOR.zzf(parcel);
            }
            zza(((NativeAdOptionsParcel) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        }
    }

    private static class zza.zza
        implements zzp
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (nativeadoptionsparcel == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            nativeadoptionsparcel.writeToParcel(parcel, 0);
_L1:
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nativeadoptionsparcel;
            parcel1.recycle();
            parcel.recycle();
            throw nativeadoptionsparcel;
        }

        public void zza(bt bt1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (bt1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            bt1 = bt1.asBinder();
_L1:
            parcel.writeStrongBinder(bt1);
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bt1 = null;
              goto _L1
            bt1;
            parcel1.recycle();
            parcel.recycle();
            throw bt1;
        }

        public void zza(bu bu1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (bu1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            bu1 = bu1.asBinder();
_L1:
            parcel.writeStrongBinder(bu1);
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bu1 = null;
              goto _L1
            bu1;
            parcel1.recycle();
            parcel.recycle();
            throw bu1;
        }

        public void zza(String s, bw bw1, bv bv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            parcel.writeString(s);
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            s = bw1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            s = obj;
            if (bv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            s = bv1.asBinder();
            parcel.writeStrongBinder(s);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzb(zzn zzn1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (zzn1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzn1 = zzn1.asBinder();
_L1:
            parcel.writeStrongBinder(zzn1);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzn1 = null;
              goto _L1
            zzn1;
            parcel1.recycle();
            parcel.recycle();
            throw zzn1;
        }

        public zzo zzbk()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzo zzo;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzo = com.google.android.gms.ads.internal.client.zzo.zza.zzh(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzo;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(NativeAdOptionsParcel nativeadoptionsparcel)
        throws RemoteException;

    public abstract void zza(bt bt)
        throws RemoteException;

    public abstract void zza(bu bu)
        throws RemoteException;

    public abstract void zza(String s, bw bw, bv bv)
        throws RemoteException;

    public abstract void zzb(zzn zzn)
        throws RemoteException;

    public abstract zzo zzbk()
        throws RemoteException;
}
