// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface com.google.android.gms.ads.internal.reward.client.zza
    extends IInterface
{
    public static abstract class zza extends Binder
        implements com.google.android.gms.ads.internal.reward.client.zza
    {

        public static com.google.android.gms.ads.internal.reward.client.zza zzY(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.ads.internal.reward.client.zza))
            {
                return (com.google.android.gms.ads.internal.reward.client.zza)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                parcel = getType();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                i = getAmount();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
        }
    }

    private static class zza.zza
        implements com.google.android.gms.ads.internal.reward.client.zza
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public int getAmount()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getType()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
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


    public abstract int getAmount()
        throws RemoteException;

    public abstract String getType()
        throws RemoteException;
}
