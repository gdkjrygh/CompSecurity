// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.y;

// Referenced classes of package com.google.android.gms.maps.internal:
//            y, z

public interface IProjectionDelegate
    extends IInterface
{
    public static abstract class a extends Binder
        implements IProjectionDelegate
    {

        public static IProjectionDelegate cV(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (iinterface != null && (iinterface instanceof IProjectionDelegate))
            {
                return (IProjectionDelegate)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                parcel = fromScreenLocation(com.google.android.gms.dynamic.d.a.bH(parcel.readStrongBinder()));
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
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (parcel.readInt() != 0)
                {
                    obj1 = LatLng.CREATOR;
                    parcel = i.gq(parcel);
                } else
                {
                    parcel = null;
                }
                obj1 = toScreenLocation(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((d) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                parcel = getVisibleRegion();
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

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = y.CREATOR;
                    obj = z.gl(parcel);
                }
                parcel = fromScreenLocation2(((com.google.android.gms.maps.internal.y) (obj)));
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

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                obj = obj2;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR;
                obj = i.gq(parcel);
            }
            parcel = toScreenLocation2(((LatLng) (obj)));
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
        }
    }

    static final class a.a
        implements IProjectionDelegate
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final LatLng fromScreenLocation(d d1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = obj;
            if (parcel1.readInt() != 0)
            {
                d1 = LatLng.CREATOR;
                d1 = i.gq(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public final LatLng fromScreenLocation2(com.google.android.gms.maps.internal.y y1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (y1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            y1.writeToParcel(parcel, 0);
_L3:
            ld.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            y1 = LatLng.CREATOR;
            y1 = i.gq(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return y1;
_L2:
            parcel.writeInt(0);
              goto _L3
            y1;
            parcel1.recycle();
            parcel.recycle();
            throw y1;
            y1 = null;
              goto _L4
        }

        public final VisibleRegion getVisibleRegion()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = VisibleRegion.CREATOR;
            obj = y.gA(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((VisibleRegion) (obj));
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

        public final d toScreenLocation(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            ld.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            latlng = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlng;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public final com.google.android.gms.maps.internal.y toScreenLocation2(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latlng == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L3:
            ld.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            latlng = y.CREATOR;
            latlng = z.gl(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return latlng;
_L2:
            parcel.writeInt(0);
              goto _L3
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
            latlng = null;
              goto _L4
        }

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract LatLng fromScreenLocation(d d)
        throws RemoteException;

    public abstract LatLng fromScreenLocation2(com.google.android.gms.maps.internal.y y)
        throws RemoteException;

    public abstract VisibleRegion getVisibleRegion()
        throws RemoteException;

    public abstract d toScreenLocation(LatLng latlng)
        throws RemoteException;

    public abstract com.google.android.gms.maps.internal.y toScreenLocation2(LatLng latlng)
        throws RemoteException;
}
