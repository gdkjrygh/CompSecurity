// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;

public interface IRemoteAndroidKeyStore
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IRemoteAndroidKeyStore
    {

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        {
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("org.chromium.net.IRemoteAndroidKeyStore");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readString();
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readString();
                j = c();
                parcel1.writeNoException();
                parcel1.writeInt(j);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                IRemoteAndroidKeyStoreCallbacks.Stub.a(parcel.readStrongBinder());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel = d();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel = e();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel = f();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel = g();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel.createByteArray();
                parcel = h();
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                j = i();
                parcel1.writeNoException();
                parcel1.writeInt(j);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStore");
                parcel.readInt();
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "org.chromium.net.IRemoteAndroidKeyStore");
        }
    }


    public abstract String a();

    public abstract byte[] b();

    public abstract int c();

    public abstract byte[] d();

    public abstract byte[] e();

    public abstract byte[] f();

    public abstract byte[] g();

    public abstract byte[] h();

    public abstract int i();
}
