// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            oq, ov, or

private static class le
    implements oq
{

    private IBinder le;

    public void a(String s, ov ov1, or or1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (ov1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        ov1.writeToParcel(parcel, 0);
_L3:
        if (or1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        or1.writeToParcel(parcel, 0);
_L4:
        le.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel.recycle();
        throw s;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(String s, ov ov1, List list)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (ov1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        parcel.writeInt(1);
        ov1.writeToParcel(parcel, 0);
_L1:
        parcel.writeTypedList(list);
        le.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public void a(String s, ov ov1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        parcel.writeString(s);
        if (ov1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        parcel.writeInt(1);
        ov1.writeToParcel(parcel, 0);
_L1:
        parcel.writeByteArray(abyte0);
        le.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return le;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
