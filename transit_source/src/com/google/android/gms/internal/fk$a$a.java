// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fk, ec, fh

private static class dG
    implements fk
{

    private IBinder dG;

    public void a(ec ec1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (ec1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        ec1.writeToParcel(parcel, 0);
_L1:
        dG.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ec1;
        parcel1.recycle();
        parcel.recycle();
        throw ec1;
    }

    public void a(fh fh1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        dG.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void a(fh fh1, int i, int j, int k, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s);
        dG.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void a(fh fh1, int i, String s, Uri uri, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null) goto _L2; else goto _L1
_L1:
        fh1 = fh1.asBinder();
_L5:
        parcel.writeStrongBinder(fh1);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s1);
        parcel.writeString(s2);
        dG.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
          goto _L5
    }

    public void a(fh fh1, Uri uri, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null) goto _L2; else goto _L1
_L1:
        fh1 = fh1.asBinder();
_L5:
        parcel.writeStrongBinder(fh1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L7:
        dG.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
        parcel.writeInt(0);
          goto _L7
    }

    public void a(fh fh1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeString(s);
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void a(fh fh1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeString(s);
        parcel.writeString(s1);
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void a(fh fh1, List list)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeStringList(list);
        dG.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public void b(fh fh1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        dG.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void b(fh fh1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeString(s);
        dG.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public void c(fh fh1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeString(s);
        dG.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public String cW()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        dG.transact(41, parcel, parcel1, 0);
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

    public boolean cX()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        dG.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String cY()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        dG.transact(43, parcel, parcel1, 0);
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

    public void clearDefaultAccount()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        dG.transact(6, parcel, parcel1, 0);
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

    public void d(fh fh1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fh1 = fh1.asBinder();
_L1:
        parcel.writeStrongBinder(fh1);
        parcel.writeString(s);
        dG.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fh1 = null;
          goto _L1
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
    }

    public String getAccountName()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        dG.transact(5, parcel, parcel1, 0);
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

    public void removeMoment(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        parcel.writeString(s);
        dG.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
