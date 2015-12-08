// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package org.chromium.content.common:
//            IChildProcessService, IChildProcessCallback

public static abstract class attachInterface extends Binder
    implements IChildProcessService
{
    private static class Proxy
        implements IChildProcessService
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void crashIntentionallyForTesting()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.content.common.IChildProcessService");
            mRemote.transact(2, parcel, parcel1, 0);
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

        public String getInterfaceDescriptor()
        {
            return "org.chromium.content.common.IChildProcessService";
        }

        public int setupConnection(Bundle bundle, IChildProcessCallback ichildprocesscallback)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.content.common.IChildProcessService");
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (ichildprocesscallback == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            bundle = ichildprocesscallback.asBinder();
_L4:
            int i;
            parcel.writeStrongBinder(bundle);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            bundle = null;
              goto _L4
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "org.chromium.content.common.IChildProcessService";
    static final int TRANSACTION_crashIntentionallyForTesting = 2;
    static final int TRANSACTION_setupConnection = 1;

    public static IChildProcessService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("org.chromium.content.common.IChildProcessService");
        if (iinterface != null && (iinterface instanceof IChildProcessService))
        {
            return (IChildProcessService)iinterface;
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
            parcel1.writeString("org.chromium.content.common.IChildProcessService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("org.chromium.content.common.IChildProcessService");
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.romParcel(parcel);
            } else
            {
                bundle = null;
            }
            i = setupConnection(bundle, .asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("org.chromium.content.common.IChildProcessService");
            crashIntentionallyForTesting();
            parcel1.writeNoException();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "org.chromium.content.common.IChildProcessService");
    }
}
