// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ITranslatorServiceCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ITranslatorServiceCallback
    {

        private static final String DESCRIPTOR = "com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback";
        static final int TRANSACTION_onInit = 1;

        public static ITranslatorServiceCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback");
            if (iinterface != null && (iinterface instanceof ITranslatorServiceCallback))
            {
                return (ITranslatorServiceCallback)iinterface;
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
                parcel1.writeString("com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback");
                onInit(parcel.readInt());
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback");
        }
    }

    private static class Stub.Proxy
        implements ITranslatorServiceCallback
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback";
        }

        public void onInit(int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.googlecode.eyesfree.braille.translate.ITranslatorServiceCallback");
            parcel.writeInt(i);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onInit(int i)
        throws RemoteException;
}
