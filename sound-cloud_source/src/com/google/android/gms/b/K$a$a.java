// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.b:
//            K, J

private static final class a
    implements K
{

    private IBinder a;

    public final void a(J j)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = j.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        j;
        parcel.recycle();
        throw j;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
