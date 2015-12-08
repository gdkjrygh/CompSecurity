// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package org.chromium.net:
//            IRemoteAndroidKeyStore, IRemoteAndroidKeyStoreCallbacks

public static abstract class attachInterface extends Binder
    implements IRemoteAndroidKeyStore
{
    private static class Proxy
        implements IRemoteAndroidKeyStore
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getClientCertificateAlias()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public byte[] getDSAKeyParamQ(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            byte abyte0[];
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public byte[] getECKeyOrder(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            byte abyte0[];
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public byte[] getEncodedCertificateChain(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeString(s);
            mRemote.transact(2, parcel, parcel1, 0);
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

        public String getInterfaceDescriptor()
        {
            return "org.chromium.net.IRemoteAndroidKeyStore";
        }

        public byte[] getPrivateKeyEncodedBytes(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            byte abyte0[];
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int getPrivateKeyHandle(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeString(s);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int getPrivateKeyType(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public byte[] getRSAKeyModulus(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            byte abyte0[];
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public byte[] rawSignDigestWithPrivateKey(int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            mRemote.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            abyte0 = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public void releaseKey(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            parcel.writeInt(i);
            mRemote.transact(11, parcel, parcel1, 0);
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

        public void setClientCallbacks(IRemoteAndroidKeyStoreCallbacks iremoteandroidkeystorecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
            if (iremoteandroidkeystorecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            iremoteandroidkeystorecallbacks = iremoteandroidkeystorecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(iremoteandroidkeystorecallbacks);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            iremoteandroidkeystorecallbacks = null;
              goto _L1
            iremoteandroidkeystorecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw iremoteandroidkeystorecallbacks;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "org.chromium.net.IRemoteAndroidKeyStore";
    static final int TRANSACTION_getClientCertificateAlias = 1;
    static final int TRANSACTION_getDSAKeyParamQ = 7;
    static final int TRANSACTION_getECKeyOrder = 8;
    static final int TRANSACTION_getEncodedCertificateChain = 2;
    static final int TRANSACTION_getPrivateKeyEncodedBytes = 6;
    static final int TRANSACTION_getPrivateKeyHandle = 3;
    static final int TRANSACTION_getPrivateKeyType = 10;
    static final int TRANSACTION_getRSAKeyModulus = 5;
    static final int TRANSACTION_rawSignDigestWithPrivateKey = 9;
    static final int TRANSACTION_releaseKey = 11;
    static final int TRANSACTION_setClientCallbacks = 4;

    public static IRemoteAndroidKeyStore asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("org.chromium.net.IRemoteAndroidKeyStore");
        if (iinterface != null && (iinterface instanceof IRemoteAndroidKeyStore))
        {
            return (IRemoteAndroidKeyStore)iinterface;
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
            parcel1.writeString("org.chromium.net.IRemoteAndroidKeyStore");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getClientCertificateAlias();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getEncodedCertificateChain(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            i = getPrivateKeyHandle(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            setClientCallbacks(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getRSAKeyModulus(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getPrivateKeyEncodedBytes(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getDSAKeyParamQ(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = getECKeyOrder(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            parcel = rawSignDigestWithPrivateKey(parcel.readInt(), parcel.createByteArray());
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            i = getPrivateKeyType(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
            releaseKey(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "org.chromium.net.IRemoteAndroidKeyStore");
    }
}
