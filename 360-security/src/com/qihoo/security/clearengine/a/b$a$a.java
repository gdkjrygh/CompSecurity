// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;

// Referenced classes of package com.qihoo.security.clearengine.a:
//            b

private static class a
    implements b
{

    private IBinder a;

    public void a()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
        a.transact(1, parcel, parcel1, 0);
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

    public void a(int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
        parcel.writeInt(i);
        a.transact(3, parcel, parcel1, 0);
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

    public void a(int i, int j, TrashInfo trashinfo)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
        parcel.writeInt(i);
        parcel.writeInt(j);
        if (trashinfo == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        parcel.writeInt(1);
        trashinfo.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        trashinfo;
        parcel1.recycle();
        parcel.recycle();
        throw trashinfo;
    }

    public IBinder asBinder()
    {
        return a;
    }

    ar.TrashInfo(IBinder ibinder)
    {
        a = ibinder;
    }
}
