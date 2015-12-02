// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.plugins;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.plugins:
//            IApkScanService, ApkInfo

public static abstract class attachInterface extends Binder
    implements IApkScanService
{
    private static class a
        implements IApkScanService
    {

        private IBinder a;

        public IBinder asBinder()
        {
            return a;
        }

        public int create()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            a.transact(1, parcel, parcel1, 0);
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

        public int destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            a.transact(2, parcel, parcel1, 0);
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

        public ApkInfo scanApk(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            parcel.writeString(s);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (ApkInfo)ApkInfo.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static IApkScanService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
        if (iinterface != null && (iinterface instanceof IApkScanService))
        {
            return (IApkScanService)iinterface;
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
            parcel1.writeString("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            i = create();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            i = destroy();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
            parcel = scanApk(parcel.readString());
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

    public a.a()
    {
        attachInterface(this, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService");
    }
}
