// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package org.chromium.content.common:
//            IChildProcessService, IChildProcessCallback

private static class mRemote
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

    A(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
