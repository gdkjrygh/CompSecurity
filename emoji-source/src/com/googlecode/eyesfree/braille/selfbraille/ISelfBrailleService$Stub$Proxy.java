// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.selfbraille:
//            ISelfBrailleService, WriteData

private static class mRemote
    implements ISelfBrailleService
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public void disconnect(IBinder ibinder)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
        parcel.writeStrongBinder(ibinder);
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        ibinder;
        parcel.recycle();
        throw ibinder;
    }

    public String getInterfaceDescriptor()
    {
        return "com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService";
    }

    public void write(IBinder ibinder, WriteData writedata)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
        parcel.writeStrongBinder(ibinder);
        if (writedata == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        writedata.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ibinder;
        parcel1.recycle();
        parcel.recycle();
        throw ibinder;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
