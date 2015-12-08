// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            IBrailleServiceCallback, BrailleDisplayProperties, BrailleInputEvent

private static class mRemote
    implements IBrailleServiceCallback
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public String getInterfaceDescriptor()
    {
        return "com.googlecode.eyesfree.braille.display.IBrailleServiceCallback";
    }

    public void onDisplayConnected(BrailleDisplayProperties brailledisplayproperties)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
        if (brailledisplayproperties == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        brailledisplayproperties.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        brailledisplayproperties;
        parcel1.recycle();
        parcel.recycle();
        throw brailledisplayproperties;
    }

    public void onDisplayDisconnected()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
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

    public void onInput(BrailleInputEvent brailleinputevent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
        if (brailleinputevent == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        brailleinputevent.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        brailleinputevent;
        parcel1.recycle();
        parcel.recycle();
        throw brailleinputevent;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
