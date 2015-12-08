// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            IBrailleService, IBrailleServiceCallback

private static class mRemote
    implements IBrailleService
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public void displayDots(byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleService");
        parcel.writeByteArray(abyte0);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public String getInterfaceDescriptor()
    {
        return "com.googlecode.eyesfree.braille.display.IBrailleService";
    }

    public boolean registerCallback(IBrailleServiceCallback ibrailleservicecallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleService");
        if (ibrailleservicecallback == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ibrailleservicecallback = ibrailleservicecallback.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(ibrailleservicecallback);
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        ibrailleservicecallback = null;
          goto _L1
        ibrailleservicecallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibrailleservicecallback;
    }

    public void unregisterCallback(IBrailleServiceCallback ibrailleservicecallback)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleService");
        if (ibrailleservicecallback == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = ibrailleservicecallback.asBinder();
        parcel.writeStrongBinder(ibinder);
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        ibrailleservicecallback;
        parcel.recycle();
        throw ibrailleservicecallback;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
