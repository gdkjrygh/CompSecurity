// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import qxw;

// Referenced classes of package org.chromium.net:
//            IRemoteAndroidKeyStoreCallbacks

public abstract class attachInterface extends Binder
    implements IRemoteAndroidKeyStoreCallbacks
{

    public static IRemoteAndroidKeyStoreCallbacks a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
        if (iinterface != null && (iinterface instanceof IRemoteAndroidKeyStoreCallbacks))
        {
            return (IRemoteAndroidKeyStoreCallbacks)iinterface;
        } else
        {
            return new qxw(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            b();
            parcel1.writeNoException();
            return true;
        }
    }

    public ()
    {
        attachInterface(this, "org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
    }
}
