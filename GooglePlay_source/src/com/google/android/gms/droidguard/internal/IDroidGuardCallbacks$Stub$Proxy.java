// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            IDroidGuardCallbacks

private static final class mRemote
    implements IDroidGuardCallbacks
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void onDroidGuardResults(byte abyte0[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
        parcel.writeByteArray(abyte0);
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        abyte0;
        parcel.recycle();
        throw abyte0;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
