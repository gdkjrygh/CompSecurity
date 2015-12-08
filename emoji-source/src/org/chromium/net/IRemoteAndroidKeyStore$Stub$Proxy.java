// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package org.chromium.net:
//            IRemoteAndroidKeyStore, IRemoteAndroidKeyStoreCallbacks

private static class mRemote
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
