// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.activeservice:
//            ITransportModeListener, TransportModeRecord

private static class mRemote
    implements ITransportModeListener
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public String getInterfaceDescriptor()
    {
        return "com.htc.lib2.activeservice.ITransportModeListener";
    }

    public void onTransportModeChanged(TransportModeRecord transportmoderecord)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.htc.lib2.activeservice.ITransportModeListener");
        if (transportmoderecord == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        transportmoderecord.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        transportmoderecord;
        parcel1.recycle();
        parcel.recycle();
        throw transportmoderecord;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
