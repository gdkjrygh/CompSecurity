// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzly, zzlx

private static class a
    implements zzly
{

    private IBinder a;

    public IBinder asBinder()
    {
        return a;
    }

    public void zza(zzlx zzlx1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
        if (zzlx1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        zzlx1 = zzlx1.asBinder();
_L1:
        parcel.writeStrongBinder(zzlx1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzlx1 = null;
          goto _L1
        zzlx1;
        parcel1.recycle();
        parcel.recycle();
        throw zzlx1;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
