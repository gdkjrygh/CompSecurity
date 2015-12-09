// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.a.a;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            RewardItemParcel, zzc

public interface com.google.android.gms.ads.internal.reward.mediation.client.zza
    extends IInterface
{
    public static abstract class zza extends Binder
        implements com.google.android.gms.ads.internal.reward.mediation.client.zza
    {

        public static com.google.android.gms.ads.internal.reward.mediation.client.zza zzad(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.ads.internal.reward.mediation.client.zza))
            {
                return (com.google.android.gms.ads.internal.reward.mediation.client.zza)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzg(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzb(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzh(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzi(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzj(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzk(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                a a = com.google.android.gms.a.a.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = RewardItemParcel.CREATOR.zzp(parcel);
                } else
                {
                    parcel = null;
                }
                zza(a, parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzl(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzc(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                zzm(com.google.android.gms.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        }
    }

    private static class zza.zza
        implements com.google.android.gms.ads.internal.reward.mediation.client.zza
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public void zza(a a1, RewardItemParcel rewarditemparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            a1 = a1.asBinder();
_L5:
            parcel.writeStrongBinder(a1);
            if (rewarditemparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            rewarditemparcel.writeToParcel(parcel, 0);
_L6:
            zznI.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
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

        public void zzb(a a1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            parcel.writeInt(i);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzc(a a1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            parcel.writeInt(i);
            zznI.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzg(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzh(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzi(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzj(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzk(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzl(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void zzm(a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            zznI.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract void zza(a a, RewardItemParcel rewarditemparcel)
        throws RemoteException;

    public abstract void zzb(a a, int i)
        throws RemoteException;

    public abstract void zzc(a a, int i)
        throws RemoteException;

    public abstract void zzg(a a)
        throws RemoteException;

    public abstract void zzh(a a)
        throws RemoteException;

    public abstract void zzi(a a)
        throws RemoteException;

    public abstract void zzj(a a)
        throws RemoteException;

    public abstract void zzk(a a)
        throws RemoteException;

    public abstract void zzl(a a)
        throws RemoteException;

    public abstract void zzm(a a)
        throws RemoteException;
}
