// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequestCreator;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequestCreator;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.internal:
//            INearbyBootstrapService, INearbyBootstrapCallback

public static abstract class Proxy.mRemote extends Binder
    implements INearbyBootstrapService
{
    private static final class Proxy
        implements INearbyBootstrapService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void confirm(INearbyBootstrapCallback inearbybootstrapcallback)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (inearbybootstrapcallback == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            inearbybootstrapcallback = inearbybootstrapcallback.asBinder();
_L1:
            parcel.writeStrongBinder(inearbybootstrapcallback);
            mRemote.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbybootstrapcallback = null;
              goto _L1
            inearbybootstrapcallback;
            parcel1.recycle();
            parcel.recycle();
            throw inearbybootstrapcallback;
        }

        public final void continueWithToken(ContinueConnectRequest continueconnectrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (continueconnectrequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            continueconnectrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            continueconnectrequest;
            parcel1.recycle();
            parcel.recycle();
            throw continueconnectrequest;
        }

        public final void disableTargetMode(DisableTargetRequest disabletargetrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (disabletargetrequest == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            disabletargetrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            disabletargetrequest;
            parcel1.recycle();
            parcel.recycle();
            throw disabletargetrequest;
        }

        public final void disconnect(DisconnectRequest disconnectrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (disconnectrequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            disconnectrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            disconnectrequest;
            parcel1.recycle();
            parcel.recycle();
            throw disconnectrequest;
        }

        public final void enableTargetMode(EnableTargetRequest enabletargetrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (enabletargetrequest == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            enabletargetrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            enabletargetrequest;
            parcel1.recycle();
            parcel.recycle();
            throw enabletargetrequest;
        }

        public final String getToken()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            mRemote.transact(9, parcel, parcel1, 0);
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

        public final void securelyConnectToDevice(ConnectRequest connectrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (connectrequest == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            connectrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            connectrequest;
            parcel1.recycle();
            parcel.recycle();
            throw connectrequest;
        }

        public final void sendData(SendDataRequest senddatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (senddatarequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            senddatarequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            senddatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw senddatarequest;
        }

        public final void startScanForTargetDevices(StartScanRequest startscanrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (startscanrequest == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            startscanrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            startscanrequest;
            parcel1.recycle();
            parcel.recycle();
            throw startscanrequest;
        }

        public final void stopScanForTargetDevices(StopScanRequest stopscanrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (stopscanrequest == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            stopscanrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            stopscanrequest;
            parcel1.recycle();
            parcel.recycle();
            throw stopscanrequest;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static INearbyBootstrapService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (iinterface != null && (iinterface instanceof INearbyBootstrapService))
        {
            return (INearbyBootstrapService)iinterface;
        } else
        {
            return new Proxy(ibinder);
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
            parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                StartScanRequestCreator startscanrequestcreator = StartScanRequest.CREATOR;
                parcel = StartScanRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            startScanForTargetDevices(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                StopScanRequestCreator stopscanrequestcreator = StopScanRequest.CREATOR;
                parcel = StopScanRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            stopScanForTargetDevices(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                EnableTargetRequestCreator enabletargetrequestcreator = EnableTargetRequest.CREATOR;
                parcel = EnableTargetRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            enableTargetMode(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                DisableTargetRequestCreator disabletargetrequestcreator = DisableTargetRequest.CREATOR;
                parcel = DisableTargetRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            disableTargetMode(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                ConnectRequestCreator connectrequestcreator = ConnectRequest.CREATOR;
                parcel = ConnectRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            securelyConnectToDevice(parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                DisconnectRequestCreator disconnectrequestcreator = DisconnectRequest.CREATOR;
                parcel = DisconnectRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            disconnect(parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                SendDataRequestCreator senddatarequestcreator = SendDataRequest.CREATOR;
                parcel = SendDataRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            sendData(parcel);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            if (parcel.readInt() != 0)
            {
                ContinueConnectRequestCreator continueconnectrequestcreator = ContinueConnectRequest.CREATOR;
                parcel = ContinueConnectRequestCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            continueWithToken(parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            parcel = getToken();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            confirm(.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
