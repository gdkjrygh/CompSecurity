// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.googlehelp.GoogleHelp;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            TogglingData

public interface IGoogleHelpCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGoogleHelpCallbacks
    {

        public static IGoogleHelpCallbacks asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (iinterface != null && (iinterface instanceof IGoogleHelpCallbacks))
            {
                return (IGoogleHelpCallbacks)iinterface;
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
                parcel1.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onGoogleHelpProcessed(parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (TogglingData)TogglingData.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onTogglingPipProcessed(parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                onPipShown();
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                onPipClick();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                onPipInCallingAppHidden();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                onPipInCallingAppDisabled();
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
        }
    }

    private static final class Stub.Proxy
        implements IGoogleHelpCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onGoogleHelpProcessed(GoogleHelp googlehelp)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (googlehelp == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            googlehelp.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            googlehelp;
            parcel1.recycle();
            parcel.recycle();
            throw googlehelp;
        }

        public final void onPipClick()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            mRemote.transact(4, parcel, parcel1, 0);
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

        public final void onPipInCallingAppDisabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            mRemote.transact(6, parcel, parcel1, 0);
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

        public final void onPipInCallingAppHidden()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            mRemote.transact(5, parcel, parcel1, 0);
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

        public final void onPipShown()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            mRemote.transact(3, parcel, parcel1, 0);
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

        public final void onTogglingPipProcessed(TogglingData togglingdata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (togglingdata == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            togglingdata.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            togglingdata;
            parcel1.recycle();
            parcel.recycle();
            throw togglingdata;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onGoogleHelpProcessed(GoogleHelp googlehelp)
        throws RemoteException;

    public abstract void onPipClick()
        throws RemoteException;

    public abstract void onPipInCallingAppDisabled()
        throws RemoteException;

    public abstract void onPipInCallingAppHidden()
        throws RemoteException;

    public abstract void onPipShown()
        throws RemoteException;

    public abstract void onTogglingPipProcessed(TogglingData togglingdata)
        throws RemoteException;
}
