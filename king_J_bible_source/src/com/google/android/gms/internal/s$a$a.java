// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            s

private static class kn
    implements s
{

    private IBinder kn;

    public Bundle a(String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        parcel.writeString(s1);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        kn.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        parcel.writeInt(0);
          goto _L3
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
        s1 = null;
          goto _L4
    }

    public Bundle a(String s1, String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        kn.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        parcel.writeInt(0);
          goto _L3
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
        s1 = null;
          goto _L4
    }

    public IBinder asBinder()
    {
        return kn;
    }

    (IBinder ibinder)
    {
        kn = ibinder;
    }
}
