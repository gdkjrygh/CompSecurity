// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.ie;
import java.util.List;

// Referenced classes of package com.google.android.gms.plus.internal:
//            d, b

private static class kq
    implements d
{

    private IBinder kq;

    public hg a(b b1, int i, int j, int k, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s);
        kq.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        b1 = com.google.android.gms.internal.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return b1;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void a(ie ie1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (ie1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        ie1.writeToParcel(parcel, 0);
_L1:
        kq.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ie1;
        parcel1.recycle();
        parcel.recycle();
        throw ie1;
    }

    public void a(b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        kq.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void a(b b1, int i, String s, Uri uri, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b1 = b1.asBinder();
_L5:
        parcel.writeStrongBinder(b1);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s1);
        parcel.writeString(s2);
        kq.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        b1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
          goto _L5
    }

    public void a(b b1, Uri uri, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b1 = b1.asBinder();
_L5:
        parcel.writeStrongBinder(b1);
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
        kq.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        b1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
        parcel.writeInt(0);
          goto _L7
    }

    public void a(b b1, ie ie1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b1 = b1.asBinder();
_L5:
        parcel.writeStrongBinder(b1);
        if (ie1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ie1.writeToParcel(parcel, 0);
_L6:
        kq.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        b1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
          goto _L5
    }

    public void a(b b1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void a(b b1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        parcel.writeString(s1);
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void a(b b1, List list)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeStringList(list);
        kq.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void a(String s, hr hr1, hr hr2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        parcel.writeString(s);
        if (hr1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        hr1.writeToParcel(parcel, 0);
_L3:
        if (hr2 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        parcel.writeInt(1);
        hr2.writeToParcel(parcel, 0);
_L4:
        kq.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        parcel.writeInt(0);
          goto _L4
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        kq.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void b(b b1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        kq.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void c(b b1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        kq.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void clearDefaultAccount()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        kq.transact(6, parcel, parcel1, 0);
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

    public void d(b b1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        kq.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void e(b b1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeString(s);
        kq.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
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
        kq.transact(5, parcel, parcel1, 0);
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

    public String jU()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        kq.transact(41, parcel, parcel1, 0);
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

    public boolean jV()
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
        kq.transact(42, parcel, parcel1, 0);
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

    public String jW()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        kq.transact(43, parcel, parcel1, 0);
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
        kq.transact(17, parcel, parcel1, 0);
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
        kq = ibinder;
    }
}
