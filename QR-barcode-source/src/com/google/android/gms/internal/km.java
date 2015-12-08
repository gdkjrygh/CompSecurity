// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataReadResult;

public interface km
    extends IInterface
{
    public static abstract class a extends Binder
        implements km
    {

        public static km ap(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            if (iinterface != null && (iinterface instanceof km))
            {
                return (km)iinterface;
            } else
            {
                return new a(ibinder);
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IDataReadCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (DataReadResult)DataReadResult.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataReadCallback");
        }
    }

    private static class a.a
        implements km
    {

        private IBinder lb;

        public void a(DataReadResult datareadresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataReadCallback");
            if (datareadresult == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            datareadresult.writeToParcel(parcel, 0);
_L1:
            lb.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datareadresult;
            parcel.recycle();
            throw datareadresult;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        a.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void a(DataReadResult datareadresult)
        throws RemoteException;
}
