// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.LogEventParcelable;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            IClearcutLoggerService, IClearcutLoggerCallbacks

private static final class mRemote
    implements IClearcutLoggerService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void logEvent(IClearcutLoggerCallbacks iclearcutloggercallbacks, LogEventParcelable logeventparcelable)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (iclearcutloggercallbacks == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = iclearcutloggercallbacks.asBinder();
        parcel.writeStrongBinder(ibinder);
        if (logeventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        parcel.writeInt(1);
        logeventparcelable.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        iclearcutloggercallbacks;
        parcel.recycle();
        throw iclearcutloggercallbacks;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
