// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ICameraUpdateFactoryDelegate

public static abstract class a.le extends Binder
    implements ICameraUpdateFactoryDelegate
{
    private static class a
        implements ICameraUpdateFactoryDelegate
    {

        private IBinder le;

        public IBinder asBinder()
        {
            return le;
        }

        public d newCameraPosition(CameraPosition cameraposition)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraposition == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            cameraposition.writeToParcel(parcel, 0);
_L1:
            le.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            cameraposition = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return cameraposition;
            parcel.writeInt(0);
              goto _L1
            cameraposition;
            parcel1.recycle();
            parcel.recycle();
            throw cameraposition;
        }

        public d newLatLng(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            le.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            latlng = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
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

        public d newLatLngBounds(LatLngBounds latlngbounds, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlngbounds == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(j);
            le.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            latlngbounds = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlngbounds;
            parcel.writeInt(0);
              goto _L1
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
        }

        public d newLatLngBoundsWithSize(LatLngBounds latlngbounds, int j, int k, int l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlngbounds == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeInt(l);
            le.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            latlngbounds = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlngbounds;
            parcel.writeInt(0);
              goto _L1
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
        }

        public d newLatLngZoom(LatLng latlng, float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            parcel.writeFloat(f);
            le.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            latlng = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
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

        public d scrollBy(float f, float f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            parcel.writeFloat(f1);
            le.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d zoomBy(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            le.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d zoomByWithFocus(float f, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            parcel.writeInt(j);
            parcel.writeInt(k);
            le.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d zoomIn()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d zoomOut()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            le.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d zoomTo(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            le.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public static ICameraUpdateFactoryDelegate aQ(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (iinterface != null && (iinterface instanceof ICameraUpdateFactoryDelegate))
        {
            return (ICameraUpdateFactoryDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        throws RemoteException
    {
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj = null;
        d d1 = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = zoomIn();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = zoomOut();
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = scrollBy(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = zoomTo(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = zoomBy(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = zoomByWithFocus(parcel.readFloat(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = CameraPosition.CREATOR.da(parcel);
            } else
            {
                parcel = null;
            }
            d1 = newCameraPosition(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (d1 != null)
            {
                parcel = d1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = LatLng.CREATOR.de(parcel);
            } else
            {
                parcel = null;
            }
            obj = newLatLng(parcel);
            parcel1.writeNoException();
            parcel = d1;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR.de(parcel);
            } else
            {
                obj = null;
            }
            obj = newLatLngZoom(((LatLng) (obj)), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj1;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.dd(parcel);
            } else
            {
                obj = null;
            }
            obj = newLatLngBounds(((LatLngBounds) (obj)), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = LatLngBounds.CREATOR.dd(parcel);
        } else
        {
            obj = null;
        }
        obj = newLatLngBoundsWithSize(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel = obj3;
        if (obj != null)
        {
            parcel = ((d) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
