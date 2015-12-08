// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.googlecode.eyesfree.braille.translate:
//            ITranslatorService, ITranslatorServiceCallback

public static abstract class attachInterface extends Binder
    implements ITranslatorService
{
    private static class Proxy
        implements ITranslatorService
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String backTranslate(byte abyte0[], String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public boolean checkTable(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            parcel.writeString(s);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String getInterfaceDescriptor()
        {
            return "com.googlecode.eyesfree.braille.translate.ITranslatorService";
        }

        public void setCallback(ITranslatorServiceCallback itranslatorservicecallback)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            if (itranslatorservicecallback == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            itranslatorservicecallback = itranslatorservicecallback.asBinder();
_L1:
            parcel.writeStrongBinder(itranslatorservicecallback);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            itranslatorservicecallback = null;
              goto _L1
            itranslatorservicecallback;
            parcel1.recycle();
            parcel.recycle();
            throw itranslatorservicecallback;
        }

        public byte[] translate(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "com.googlecode.eyesfree.braille.translate.ITranslatorService";
    static final int TRANSACTION_backTranslate = 4;
    static final int TRANSACTION_checkTable = 2;
    static final int TRANSACTION_setCallback = 1;
    static final int TRANSACTION_translate = 3;

    public static ITranslatorService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.googlecode.eyesfree.braille.translate.ITranslatorService");
        if (iinterface != null && (iinterface instanceof ITranslatorService))
        {
            return (ITranslatorService)iinterface;
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
            parcel1.writeString("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            setCallback(ck.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            boolean flag = checkTable(parcel.readString());
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

        case 3: // '\003'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            parcel = translate(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.googlecode.eyesfree.braille.translate.ITranslatorService");
            parcel = backTranslate(parcel.createByteArray(), parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.googlecode.eyesfree.braille.translate.ITranslatorService");
    }
}
