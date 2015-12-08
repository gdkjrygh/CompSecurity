// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.airbiquity.hap;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.airbiquity.hap:
//            a, b

private static class a
    implements a
{

    private IBinder a;

    public int a(String s, String s1, String s2, b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.airbiquity.hap.IHandsetApplicationProxy");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = b1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(s);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public boolean a(int i, int j, byte abyte0[], String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.airbiquity.hap.IHandsetApplicationProxy");
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public IBinder asBinder()
    {
        return a;
    }

    n(IBinder ibinder)
    {
        a = ibinder;
    }
}
