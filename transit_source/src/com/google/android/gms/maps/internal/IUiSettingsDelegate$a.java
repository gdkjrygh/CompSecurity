// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IUiSettingsDelegate

public static abstract class a.dG extends Binder
    implements IUiSettingsDelegate
{
    private static class a
        implements IUiSettingsDelegate
    {

        private IBinder dG;

        public IBinder asBinder()
        {
            return dG;
        }

        public boolean isCompassEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(10, parcel, parcel1, 0);
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

        public boolean isMyLocationButtonEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(11, parcel, parcel1, 0);
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

        public boolean isRotateGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(15, parcel, parcel1, 0);
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

        public boolean isScrollGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(12, parcel, parcel1, 0);
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

        public boolean isTiltGesturesEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(14, parcel, parcel1, 0);
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

        public boolean isZoomControlsEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(9, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            dG.transact(13, parcel, parcel1, 0);
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

        public void setAllGesturesEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(8, parcel, parcel1, 0);
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

        public void setCompassEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(2, parcel, parcel1, 0);
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

        public void setMyLocationButtonEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(3, parcel, parcel1, 0);
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

        public void setRotateGesturesEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(7, parcel, parcel1, 0);
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

        public void setScrollGesturesEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(4, parcel, parcel1, 0);
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

        public void setTiltGesturesEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(6, parcel, parcel1, 0);
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

        public void setZoomControlsEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            dG.transact(1, parcel, parcel1, 0);
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

        public void setZoomGesturesEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            dG.transact(5, parcel, parcel1, 0);
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

        a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public static IUiSettingsDelegate ab(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (iinterface != null && (iinterface instanceof IUiSettingsDelegate))
        {
            return (IUiSettingsDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setZoomControlsEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag8;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setCompassEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag9;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setMyLocationButtonEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag10;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setScrollGesturesEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag11;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setZoomGesturesEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag12;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setTiltGesturesEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag13;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setRotateGesturesEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = flag14;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            }
            setAllGesturesEnabled(flag7);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isZoomControlsEnabled();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isCompassEnabled();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isMyLocationButtonEnabled();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isScrollGesturesEnabled();
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isZoomGesturesEnabled();
            parcel1.writeNoException();
            i = ((flag4) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isTiltGesturesEnabled();
            parcel1.writeNoException();
            i = ((flag5) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            flag7 = isRotateGesturesEnabled();
            parcel1.writeNoException();
            i = ((flag6) ? 1 : 0);
            break;
        }
        if (flag7)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }
}
