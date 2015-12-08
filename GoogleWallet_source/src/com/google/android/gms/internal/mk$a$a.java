// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.feedback.ErrorReport;

// Referenced classes of package com.google.android.gms.internal:
//            mk

static final class ld
    implements mk
{

    private IBinder ld;

    public final boolean a(ErrorReport errorreport)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (errorreport == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        parcel.writeInt(1);
        errorreport.writeToParcel(parcel, 0);
_L1:
        int i;
        ld.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        errorreport;
        parcel1.recycle();
        parcel.recycle();
        throw errorreport;
    }

    public final IBinder asBinder()
    {
        return ld;
    }

    public final boolean b(ErrorReport errorreport)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (errorreport == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        parcel.writeInt(1);
        errorreport.writeToParcel(parcel, 0);
_L1:
        int i;
        ld.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        errorreport;
        parcel1.recycle();
        parcel.recycle();
        throw errorreport;
    }

    public final void m(int i, int j)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        ld.transact(2, parcel, parcel1, 0);
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

    port(IBinder ibinder)
    {
        ld = ibinder;
    }
}
