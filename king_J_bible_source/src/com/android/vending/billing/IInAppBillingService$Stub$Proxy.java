// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.vending.billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.android.vending.billing:
//            IInAppBillingService

private static class mRemote
    implements IInAppBillingService
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public int consumePurchase(int i, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(5, parcel, parcel1, 0);
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

    public Bundle getBuyIntent(int i, String s, String s1, String s2, String s3)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public String getInterfaceDescriptor()
    {
        return "com.android.vending.billing.IInAppBillingService";
    }

    public Bundle getPurchases(int i, String s, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle getSkuDetails(int i, String s, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        s = (Bundle)Bundle.CREATOR.cel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public int isBillingSupported(int i, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(1, parcel, parcel1, 0);
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

    A(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
