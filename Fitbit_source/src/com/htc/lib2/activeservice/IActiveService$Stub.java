// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.activeservice:
//            IActiveService, TransportModeRecord, TransportRecordsQueryResult

public static abstract class attachInterface extends Binder
    implements IActiveService
{

    private static final String DESCRIPTOR = "com.htc.lib2.activeservice.IActiveService";
    static final int TRANSACTION_disableWithPermission = 8;
    static final int TRANSACTION_enableWithPermission = 7;
    static final int TRANSACTION_getLatestTransportMode = 3;
    static final int TRANSACTION_isEnabled = 6;
    static final int TRANSACTION_isSupported = 5;
    static final int TRANSACTION_queryTransportModeRecords = 4;
    static final int TRANSACTION_registerTransportModeListener = 1;
    static final int TRANSACTION_unregisterTransportModeListener = 2;

    public static IActiveService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.htc.lib2.activeservice.IActiveService");
    /* block-local class not found */
    class Proxy {}

        if (iinterface != null && (iinterface instanceof IActiveService))
        {
            return (IActiveService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag = false;
        boolean flag9;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.htc.lib2.activeservice.IActiveService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            boolean flag5 = registerTransportModeListener(er.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag5)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            unregisterTransportModeListener(er.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            parcel = getLatestTransportMode();
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

        case 4: // '\004'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            parcel = queryTransportModeRecords(parcel.readLong(), parcel.readLong());
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

        case 5: // '\005'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            boolean flag6 = isSupported();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            boolean flag7 = isEnabled();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            boolean flag8 = enableWithPermission();
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag8)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.htc.lib2.activeservice.IActiveService");
            flag9 = disableWithPermission();
            parcel1.writeNoException();
            i = ((flag4) ? 1 : 0);
            break;
        }
        if (flag9)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }

    public yResult()
    {
        attachInterface(this, "com.htc.lib2.activeservice.IActiveService");
    }
}
