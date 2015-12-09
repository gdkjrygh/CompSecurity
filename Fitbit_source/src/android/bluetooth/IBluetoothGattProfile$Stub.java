// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package android.bluetooth:
//            IBluetoothGattProfile

public static abstract class attachInterface extends Binder
    implements IBluetoothGattProfile
{
    private static class Proxy
        implements IBluetoothGattProfile
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "android.bluetooth.IBluetoothGattProfile";
        }

        public void onDiscoverCharacteristicsResult(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("android.bluetooth.IBluetoothGattProfile");
            parcel.writeString(s);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void onSetCharacteristicCliConfResult(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("android.bluetooth.IBluetoothGattProfile");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void onSetCharacteristicValueResult(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("android.bluetooth.IBluetoothGattProfile");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void onUpdateCharacteristicValueResult(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("android.bluetooth.IBluetoothGattProfile");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void onValueChanged(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("android.bluetooth.IBluetoothGattProfile");
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
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


    private static final String DESCRIPTOR = "android.bluetooth.IBluetoothGattProfile";
    static final int TRANSACTION_onDiscoverCharacteristicsResult = 1;
    static final int TRANSACTION_onSetCharacteristicCliConfResult = 3;
    static final int TRANSACTION_onSetCharacteristicValueResult = 2;
    static final int TRANSACTION_onUpdateCharacteristicValueResult = 4;
    static final int TRANSACTION_onValueChanged = 5;

    public static IBluetoothGattProfile asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("android.bluetooth.IBluetoothGattProfile");
        if (iinterface != null && (iinterface instanceof IBluetoothGattProfile))
        {
            return (IBluetoothGattProfile)iinterface;
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
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("android.bluetooth.IBluetoothGattProfile");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.bluetooth.IBluetoothGattProfile");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            onDiscoverCharacteristicsResult(s, flag);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.bluetooth.IBluetoothGattProfile");
            String s1 = parcel.readString();
            boolean flag1 = flag4;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            onSetCharacteristicValueResult(s1, flag1);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.bluetooth.IBluetoothGattProfile");
            String s2 = parcel.readString();
            boolean flag2 = flag5;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            onSetCharacteristicCliConfResult(s2, flag2);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("android.bluetooth.IBluetoothGattProfile");
            String s3 = parcel.readString();
            boolean flag3 = flag6;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            }
            onUpdateCharacteristicValueResult(s3, flag3);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("android.bluetooth.IBluetoothGattProfile");
            onValueChanged(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "android.bluetooth.IBluetoothGattProfile");
    }
}
