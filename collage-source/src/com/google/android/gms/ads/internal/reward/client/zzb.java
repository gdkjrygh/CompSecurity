// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            RewardedVideoAdRequestParcel, zzd, zzh

public interface zzb
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzb
    {

        public static zzb zzZ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (iinterface != null && (iinterface instanceof zzb))
            {
                return (zzb)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                if (parcel.readInt() != 0)
                {
                    parcel = RewardedVideoAdRequestParcel.CREATOR.zzo(parcel);
                } else
                {
                    parcel = null;
                }
                zza(parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                show();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                zza(zzd.zza.zzab(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                setUserId(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                boolean flag = isLoaded();
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                pause();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                resume();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                destroy();
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        }
    }

    private static class zza.zza
        implements zzb
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            zznI.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isLoaded()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void pause()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void resume()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            zznI.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setUserId(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            parcel.writeString(s);
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void show()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (rewardedvideoadrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            rewardedvideoadrequestparcel.writeToParcel(parcel, 0);
_L1:
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            rewardedvideoadrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw rewardedvideoadrequestparcel;
        }

        public void zza(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (zzd1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void destroy()
        throws RemoteException;

    public abstract boolean isLoaded()
        throws RemoteException;

    public abstract void pause()
        throws RemoteException;

    public abstract void resume()
        throws RemoteException;

    public abstract void setUserId(String s)
        throws RemoteException;

    public abstract void show()
        throws RemoteException;

    public abstract void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
        throws RemoteException;

    public abstract void zza(zzd zzd)
        throws RemoteException;
}
