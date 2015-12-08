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
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.q;
import com.google.android.gms.maps.model.s;
import com.google.android.gms.maps.model.t;

// Referenced classes of package com.google.android.gms.maps.internal:
//            r, s, t

public interface IStreetViewPanoramaDelegate
    extends IInterface
{
    public static abstract class a extends Binder
        implements IStreetViewPanoramaDelegate
    {

        public static IStreetViewPanoramaDelegate br(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iinterface != null && (iinterface instanceof IStreetViewPanoramaDelegate))
            {
                return (IStreetViewPanoramaDelegate)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj = null;
            d d1 = null;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                enableZoom(flag4);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag5 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                enablePanning(flag5);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag6 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                }
                enableUserNavigation(flag6);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag7 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                }
                enableStreetNames(flag7);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag8 = isZoomGesturesEnabled();
                parcel1.writeNoException();
                j = ((flag) ? 1 : 0);
                if (flag8)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag9 = isPanningGesturesEnabled();
                parcel1.writeNoException();
                j = ((flag1) ? 1 : 0);
                if (flag9)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag10 = isUserNavigationEnabled();
                parcel1.writeNoException();
                j = ((flag2) ? 1 : 0);
                if (flag10)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                boolean flag11 = isStreetNamesEnabled();
                parcel1.writeNoException();
                j = ((flag3) ? 1 : 0);
                if (flag11)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = StreetViewPanoramaCamera.CREATOR.di(parcel);
                } else
                {
                    obj = null;
                }
                animateTo(((StreetViewPanoramaCamera) (obj)), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = getPanoramaCamera();
                parcel1.writeNoException();
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

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setPositionWithID(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                obj = d1;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.de(parcel);
                }
                setPosition(((LatLng) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.de(parcel);
                }
                setPositionWithRadius(((LatLng) (obj)), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = getStreetViewPanoramaLocation();
                parcel1.writeNoException();
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

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaChangeListener(s.a.bm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaCameraChangeListener(r.a.bl(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                setOnStreetViewPanoramaClickListener(t.a.bn(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                parcel = pointToOrientation(com.google.android.gms.dynamic.d.a.ap(parcel.readStrongBinder()));
                parcel1.writeNoException();
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

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = StreetViewPanoramaOrientation.CREATOR.dl(parcel);
            } else
            {
                parcel = null;
            }
            d1 = orientationToPoint(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (d1 != null)
            {
                parcel = d1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class a.a
        implements IStreetViewPanoramaDelegate
    {

        private IBinder le;

        public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramacamera == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            parcel.writeInt(1);
            streetviewpanoramacamera.writeToParcel(parcel, 0);
_L1:
            parcel.writeLong(l);
            le.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramacamera;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramacamera;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void enablePanning(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            le.transact(2, parcel, parcel1, 0);
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

        public void enableStreetNames(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            le.transact(4, parcel, parcel1, 0);
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

        public void enableUserNavigation(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            le.transact(3, parcel, parcel1, 0);
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

        public void enableZoom(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            le.transact(1, parcel, parcel1, 0);
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

        public StreetViewPanoramaCamera getPanoramaCamera()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            StreetViewPanoramaCamera streetviewpanoramacamera = StreetViewPanoramaCamera.CREATOR.di(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramacamera;
_L2:
            streetviewpanoramacamera = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public StreetViewPanoramaLocation getStreetViewPanoramaLocation()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            StreetViewPanoramaLocation streetviewpanoramalocation = StreetViewPanoramaLocation.CREATOR.dk(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramalocation;
_L2:
            streetviewpanoramalocation = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isPanningGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(6, parcel, parcel1, 0);
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

        public boolean isStreetNamesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(8, parcel, parcel1, 0);
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

        public boolean isUserNavigationEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(7, parcel, parcel1, 0);
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

        public boolean isZoomGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            le.transact(5, parcel, parcel1, 0);
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

        public d orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (streetviewpanoramaorientation == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            streetviewpanoramaorientation.writeToParcel(parcel, 0);
_L1:
            le.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            streetviewpanoramaorientation = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return streetviewpanoramaorientation;
            parcel.writeInt(0);
              goto _L1
            streetviewpanoramaorientation;
            parcel1.recycle();
            parcel.recycle();
            throw streetviewpanoramaorientation;
        }

        public StreetViewPanoramaOrientation pointToOrientation(d d1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            le.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            d1 = obj;
            if (parcel1.readInt() != 0)
            {
                d1 = StreetViewPanoramaOrientation.CREATOR.dl(parcel1);
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

        public void setOnStreetViewPanoramaCameraChangeListener(r r1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            r1 = r1.asBinder();
_L1:
            parcel.writeStrongBinder(r1);
            le.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            r1 = null;
              goto _L1
            r1;
            parcel1.recycle();
            parcel.recycle();
            throw r1;
        }

        public void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.s s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            s1 = s1.asBinder();
_L1:
            parcel.writeStrongBinder(s1);
            le.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1 = null;
              goto _L1
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.t t1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (t1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            t1 = t1.asBinder();
_L1:
            parcel.writeStrongBinder(t1);
            le.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            t1 = null;
              goto _L1
            t1;
            parcel1.recycle();
            parcel.recycle();
            throw t1;
        }

        public void setPosition(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            le.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public void setPositionWithID(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            parcel.writeString(s1);
            le.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void setPositionWithRadius(LatLng latlng, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            le.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
        throws RemoteException;

    public abstract void enablePanning(boolean flag)
        throws RemoteException;

    public abstract void enableStreetNames(boolean flag)
        throws RemoteException;

    public abstract void enableUserNavigation(boolean flag)
        throws RemoteException;

    public abstract void enableZoom(boolean flag)
        throws RemoteException;

    public abstract StreetViewPanoramaCamera getPanoramaCamera()
        throws RemoteException;

    public abstract StreetViewPanoramaLocation getStreetViewPanoramaLocation()
        throws RemoteException;

    public abstract boolean isPanningGesturesEnabled()
        throws RemoteException;

    public abstract boolean isStreetNamesEnabled()
        throws RemoteException;

    public abstract boolean isUserNavigationEnabled()
        throws RemoteException;

    public abstract boolean isZoomGesturesEnabled()
        throws RemoteException;

    public abstract d orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        throws RemoteException;

    public abstract StreetViewPanoramaOrientation pointToOrientation(d d)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaCameraChangeListener(r r)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.s s)
        throws RemoteException;

    public abstract void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.t t)
        throws RemoteException;

    public abstract void setPosition(LatLng latlng)
        throws RemoteException;

    public abstract void setPositionWithID(String s)
        throws RemoteException;

    public abstract void setPositionWithRadius(LatLng latlng, int i)
        throws RemoteException;
}
