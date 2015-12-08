// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.selfbraille:
//            WriteData

public interface ISelfBrailleService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ISelfBrailleService
    {

        private static final String DESCRIPTOR = "com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService";
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_write = 1;

        public static ISelfBrailleService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
            if (iinterface != null && (iinterface instanceof ISelfBrailleService))
            {
                return (ISelfBrailleService)iinterface;
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
                parcel1.writeString("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
                IBinder ibinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (WriteData)WriteData.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                write(ibinder, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
                disconnect(parcel.readStrongBinder());
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.googlecode.eyesfree.braille.selfbraille.ISelfBrailleService");
        }
    }

    private static class Stub.Proxy
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void disconnect(IBinder ibinder)
        throws RemoteException;

    public abstract void write(IBinder ibinder, WriteData writedata)
        throws RemoteException;
}
