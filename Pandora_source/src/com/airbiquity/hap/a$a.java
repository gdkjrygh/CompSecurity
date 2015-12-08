// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.airbiquity.hap;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.airbiquity.hap:
//            a, b

public static abstract class a.a extends Binder
    implements com.airbiquity.hap.a
{
    private static class a
        implements com.airbiquity.hap.a
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static com.airbiquity.hap.a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.airbiquity.hap.IHandsetApplicationProxy");
        if (iinterface != null && (iinterface instanceof com.airbiquity.hap.a))
        {
            return (com.airbiquity.hap.a)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.airbiquity.hap.IHandsetApplicationProxy");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.airbiquity.hap.IHandsetApplicationProxy");
            i = a(parcel.readString(), parcel.readString(), parcel.readString(), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.airbiquity.hap.IHandsetApplicationProxy");
            flag = a(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readString());
            parcel1.writeNoException();
            break;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel1.writeInt(i);
        return true;
    }
}
