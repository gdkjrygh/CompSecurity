// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;
import com.google.android.gms.internal.dh;

public interface com.google.android.gms.ads.internal.reward.client.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.ads.internal.reward.client.a
    {

        public static com.google.android.gms.ads.internal.reward.client.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.ads.internal.reward.client.a))
            {
                return (com.google.android.gms.ads.internal.reward.client.a)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                parcel = a(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.dh.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }

    private static final class a.a
        implements com.google.android.gms.ads.internal.reward.client.a
    {

        private IBinder a;

        public final IBinder a(c c1, dh dh1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            c1 = obj;
            if (dh1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            c1 = dh1.asBinder();
            parcel.writeStrongBinder(c1);
            parcel.writeInt(i);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            c1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return c1;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract IBinder a(c c, dh dh, int i)
        throws RemoteException;
}
