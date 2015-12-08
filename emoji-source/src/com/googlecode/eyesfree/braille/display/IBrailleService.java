// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            IBrailleServiceCallback

public interface IBrailleService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IBrailleService
    {

        private static final String DESCRIPTOR = "com.googlecode.eyesfree.braille.display.IBrailleService";
        static final int TRANSACTION_displayDots = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;

        public static IBrailleService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.googlecode.eyesfree.braille.display.IBrailleService");
            if (iinterface != null && (iinterface instanceof IBrailleService))
            {
                return (IBrailleService)iinterface;
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
                parcel1.writeString("com.googlecode.eyesfree.braille.display.IBrailleService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleService");
                boolean flag = registerCallback(IBrailleServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleService");
                unregisterCallback(IBrailleServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.display.IBrailleService");
                displayDots(parcel.createByteArray());
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.googlecode.eyesfree.braille.display.IBrailleService");
        }
    }

    private static class Stub.Proxy
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void displayDots(byte abyte0[])
        throws RemoteException;

    public abstract boolean registerCallback(IBrailleServiceCallback ibrailleservicecallback)
        throws RemoteException;

    public abstract void unregisterCallback(IBrailleServiceCallback ibrailleservicecallback)
        throws RemoteException;
}
