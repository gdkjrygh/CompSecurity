// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            IBrailleServiceCallback, BrailleDisplayProperties, BrailleInputEvent

public static abstract class attachInterface extends Binder
    implements IBrailleServiceCallback
{
    private static class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "com.googlecode.eyesfree.braille.display.IBrailleServiceCallback";
    static final int TRANSACTION_onDisplayConnected = 1;
    static final int TRANSACTION_onDisplayDisconnected = 2;
    static final int TRANSACTION_onInput = 3;

    public static IBrailleServiceCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
        if (iinterface != null && (iinterface instanceof IBrailleServiceCallback))
        {
            return (IBrailleServiceCallback)iinterface;
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
            parcel1.writeString("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
            if (parcel.readInt() != 0)
            {
                parcel = (BrailleDisplayProperties)BrailleDisplayProperties.CREATOR.Parcel(parcel);
            } else
            {
                parcel = null;
            }
            onDisplayConnected(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
            onDisplayDisconnected();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (BrailleInputEvent)BrailleInputEvent.CREATOR.Parcel(parcel);
        } else
        {
            parcel = null;
        }
        onInput(parcel);
        parcel1.writeNoException();
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.googlecode.eyesfree.braille.display.IBrailleServiceCallback");
    }
}
