// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.p;

public interface com.google.android.gms.maps.model.a.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.maps.model.a.a
    {

        public static com.google.android.gms.maps.model.a.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.model.a.a))
            {
                return (com.google.android.gms.maps.model.a.a)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                parcel = a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                break;
            }
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }
        }
    }

    private static final class a.a
        implements com.google.android.gms.maps.model.a.a
    {

        private IBinder a;

        public final Tile a(int i, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = Tile.CREATOR;
            obj = p.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((Tile) (obj));
_L2:
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
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


    public abstract Tile a(int i, int j, int k)
        throws RemoteException;
}
