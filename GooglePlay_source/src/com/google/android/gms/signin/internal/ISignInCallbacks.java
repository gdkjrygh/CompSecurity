// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResult

public interface ISignInCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ISignInCallbacks
    {

        public static ISignInCallbacks asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (iinterface != null && (iinterface instanceof ISignInCallbacks))
            {
                return (ISignInCallbacks)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                ConnectionResult connectionresult;
                if (parcel.readInt() != 0)
                {
                    connectionresult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    connectionresult = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onAuthAccountComplete(connectionresult, parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onSaveAccountToSessionStoreComplete(parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (Status)Status.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onRecordConsentComplete(parcel);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                break;
            }
            Status status;
            if (parcel.readInt() != 0)
            {
                status = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                status = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGetCurrentAccountComplete(status, parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }
    }

    private static final class Stub.Proxy
        implements ISignInCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onAuthAccountComplete(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (connectionresult == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            connectionresult.writeToParcel(parcel, 0);
_L3:
            if (authaccountresult == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            authaccountresult.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            connectionresult;
            parcel1.recycle();
            parcel.recycle();
            throw connectionresult;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onGetCurrentAccountComplete(Status status, GoogleSignInAccount googlesigninaccount)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if (googlesigninaccount == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            googlesigninaccount.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onRecordConsentComplete(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        public final void onSaveAccountToSessionStoreComplete(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onAuthAccountComplete(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        throws RemoteException;

    public abstract void onGetCurrentAccountComplete(Status status, GoogleSignInAccount googlesigninaccount)
        throws RemoteException;

    public abstract void onRecordConsentComplete(Status status)
        throws RemoteException;

    public abstract void onSaveAccountToSessionStoreComplete(Status status)
        throws RemoteException;
}
